package com.rd.monitor;

import org.apache.log4j.Logger;
import org.perf4j.StopWatch;
import org.perf4j.log4j.Log4JStopWatch;

public class PerformanceMonitor {

    private static final ThreadLocal<StopWatch> WATCH = new ThreadLocal<StopWatch>() {
        @Override
        protected StopWatch initialValue() {
            return new Log4JStopWatch(Logger.getLogger("instrument.org.perf4j.TimingLogger"));
        }
    };

    public static void start(String tag) {
        WATCH.get().start(tag);
    }

    public static void stop(String tag) {
        WATCH.get().stop(tag);
    }
}