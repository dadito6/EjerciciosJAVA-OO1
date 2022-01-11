package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class LIFO extends JobScheduler{
	public LIFO(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}


	private JobDescription items;


	public JobDescription next () {
		items = super.jobs.remove(jobs.size()-1);
		super.unschedule(items);
		return items;
	}


	@Override
	public void schedule(JobDescription job) {
	
	    	this.jobs.add(job);
	    
	}

}
