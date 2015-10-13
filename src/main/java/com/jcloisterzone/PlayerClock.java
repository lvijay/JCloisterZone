package com.jcloisterzone;


public class PlayerClock {

    private boolean running;
    private long runningSince;

    public long getTime() {
        if (running) {
            return System.currentTimeMillis() - runningSince;
        } else {
            return 0;
        }
    }

    /**
     * Returns time ignoring runningSince (which is reset to now)
     */
    public long resetRunning() {
        runningSince = System.currentTimeMillis();
        return getTime();
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
        runningSince = System.currentTimeMillis();
    }
}
