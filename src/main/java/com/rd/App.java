package com.rd;

import com.rd.monitor.PerformanceMonitor;
import org.apache.log4j.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class);

    public static void main(String[] args) throws InterruptedException {
        LOGGER.info("Starting .....");
        PerformanceMonitor.start("METHOD1");
        method1();
        PerformanceMonitor.stop("METHOD1");
        PerformanceMonitor.start("METHOD2");
        method2();
        PerformanceMonitor.stop("METHOD2");
        LOGGER.info("Completed. Please check the perf.log file for time logging");
    }

    private static void method1() throws InterruptedException {
        Thread.sleep(5000);
    }

    private static void method2() throws InterruptedException {
        Thread.sleep(2000);
    }
}
