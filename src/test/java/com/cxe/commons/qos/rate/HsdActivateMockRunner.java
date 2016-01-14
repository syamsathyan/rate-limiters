package com.cxe.commons.qos.rate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by syam on 1/14/16.
 */
public class HsdActivateMockRunner implements Runnable{

    public static DateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS");

    @Override
    public void run() {
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Executed @ "+formatter.format(date)+", Thread name : " + Thread.currentThread().getName());
    }
}
