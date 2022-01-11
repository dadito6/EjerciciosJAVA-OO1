package ar.edu.unlp.info.oo1.ej10_jobScheduler;



public class FIFO extends JobScheduler{
public FIFO(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}


private JobDescription items;


public JobDescription next () {
	items = super.jobs.remove(0);
	super.unschedule(items);
	return items;
}



}
