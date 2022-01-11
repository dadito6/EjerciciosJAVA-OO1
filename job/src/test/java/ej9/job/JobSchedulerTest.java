package ej9.job;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ej10_jobScheduler.EffortSelector;
import ar.edu.unlp.info.oo1.ej10_jobScheduler.FIFO;
import ar.edu.unlp.info.oo1.ej10_jobScheduler.JobDescription;
import ar.edu.unlp.info.oo1.ej10_jobScheduler.JobScheduler;
import ar.edu.unlp.info.oo1.ej10_jobScheduler.LIFO;
import ar.edu.unlp.info.oo1.ej10_jobScheduler.PrioritySelector;



public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;
    protected FIFO fifo;
    protected LIFO lifo;
    protected PrioritySelector prioridad;
    protected EffortSelector afecto;
   
  
    
    private void initializeJobs() {
    	
    	 firstJob = new JobDescription (1, 1, "Este es el primero");
    	highestPriorityJob = new JobDescription (1, 100, "Este es el de m�s prioridad");
    	mostEffortJob = new JobDescription (100, 1, "Este es el de m�s esfuerzo");
    	lastJob = new JobDescription (1, 1, "Este es el �ltimo");
    	fifo= new FIFO ("a");
    	lifo= new LIFO ("b");
    	prioridad = new PrioritySelector (null);
    	afecto = new EffortSelector (null) ; 
    	
    }
    
    @BeforeEach
    void setUp() {
    	this.initializeJobs();
    } 
    
    private JobScheduler newFifoScheduler() {
    	fifo.setStrategy("FIFO");
    	return fifo;
    }
    
    private JobScheduler newLifoScheduler() {
   
    	lifo.setStrategy("LIFO");
    	return lifo;
   
    }
    
    private JobScheduler newPriorityScheduler() {
    	prioridad.setStrategy("HighestPriority");
    	return prioridad;
    }
    
    private JobScheduler newEffortScheduler() {
    	afecto.setStrategy("MostEffort");
    	return afecto;
    }
    
    private void scheduleJobsIn(JobScheduler aJobScheduler) {
    	aJobScheduler.schedule(firstJob);
    	aJobScheduler.schedule(highestPriorityJob);
    	aJobScheduler.schedule(mostEffortJob);
    	aJobScheduler.schedule(lastJob);
    }
    
    @Test
    void testSchedule() {
    	prioridad.schedule(highestPriorityJob);
    	assertTrue(prioridad.getJobs().contains(highestPriorityJob));
    	
    } 
    
    @Test
    void testUnschedule() {

    	this.scheduleJobsIn(prioridad);
    	prioridad.unschedule(highestPriorityJob);
    	assertFalse(prioridad.getJobs().contains(highestPriorityJob));   	
    }
    
    @Test
    void testNext() {
    	JobScheduler scheduler;
    	
    	scheduler = this.newFifoScheduler();
    	this.scheduleJobsIn(scheduler);
    	assertEquals(scheduler.next(), firstJob);
    	assertEquals(scheduler.getJobs().size(), 3);
    	
    	scheduler = this.newLifoScheduler();
    	this.scheduleJobsIn(scheduler);
    	assertEquals(scheduler.next(), lastJob);
    	assertEquals(scheduler.getJobs().size(), 3);

    	scheduler = this.newPriorityScheduler();
    	this.scheduleJobsIn(scheduler);
    	assertEquals(scheduler.next(), highestPriorityJob);
    	assertEquals(scheduler.getJobs().size(), 3);

    	scheduler = this.newEffortScheduler();
    	this.scheduleJobsIn(scheduler);
    	assertEquals(scheduler.next(), mostEffortJob);
    	assertEquals(scheduler.getJobs().size(), 3);

    }
}
