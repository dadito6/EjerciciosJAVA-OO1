package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class PrioritySelector extends JobScheduler{
	
	public PrioritySelector(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	private JobDescription item ;
	
	public JobDescription next() {
	item = super.jobs.stream()
			.max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
			.orElse(null);
    	this.unschedule(item);
    	return item;

}

	
	
}


