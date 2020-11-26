 package tool;

public aspect BenchmarkAspect {

	pointcut whenRandomCalled() : call(public static int randomBsht() );
	
	private long lastTime;
		
	
	
	before() : whenRandomCalled() {
		lastTime = System.nanoTime();
		System.err.println(" started >>" + System.nanoTime() + "nSecs");
	}
	
	
	after() : whenRandomCalled() {
		long duration = System.nanoTime() - lastTime;
		System.err.println(" finished   >>" + duration/1000000.0 + "mSecs");
	}
	
}
