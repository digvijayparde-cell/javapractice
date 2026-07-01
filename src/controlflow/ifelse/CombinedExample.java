package controlflow.ifelse;

public class CombinedExample {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		
		System.out.println("OS: " + System.getProperty("os.name"));
		System.out.println("Loop variable final value: " + i);
		System.out.println("Time taken (nanoseconds): " + duration);
	}
}