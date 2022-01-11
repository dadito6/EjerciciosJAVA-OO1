package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class EffortSelector extends JobScheduler {
	public EffortSelector(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	private JobDescription item ;
	
	public JobDescription next() {
	     item = jobs.stream()
	     			.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
	     			.orElse(null);
			    this.unschedule(item);
			    return item;

}

}
