public class Job implements Runnable {
    private String jobName;
    private JobPriority jobPriority;
    
    @Override
    public void run() {
        System.out.println("Job:" + jobName +
          " Priority:" + jobPriority);
        Thread.sleep(1000); // to simulate actual execution time
    }
    
    public enum JobPriority {
        HIGH,
        MEDIUM,
        LOW
    }

    // standard setters and getters
}
