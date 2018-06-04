package Utility;

public class Timer {
	
	public static long getCurrentTime() {
		return System.currentTimeMillis();
	}
	
	public static long computeTimeDifference(long startTime, long endTime) {
		return endTime - startTime;
	}
}
