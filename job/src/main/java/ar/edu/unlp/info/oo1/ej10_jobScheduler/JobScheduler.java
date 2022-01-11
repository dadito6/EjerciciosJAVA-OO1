package ar.edu.unlp.info.oo1.ej10_jobScheduler;



import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public abstract  class JobScheduler {
    protected List<JobDescription> jobs;
    protected String strategy;
     
    public JobScheduler (String a) {
    	this.jobs = new ArrayList<>(); 
    	this.strategy = a;
    }
    
    public void schedule(JobDescription job) {
    	this.jobs.add(job);
    }
  

    public void unschedule(JobDescription job) {
    	if (job != null) {
    	   this.jobs.remove(job);
    	}
    }
    
    public String getStrategy() {
    	return this.strategy; 
    }
    
    public List<JobDescription> getJobs(){
    	return this.jobs;
    }
    
    public void setStrategy(String aStrategy) {
    	this.strategy = aStrategy; 
    }
    
    public abstract JobDescription next () ;
 

    
    
}

