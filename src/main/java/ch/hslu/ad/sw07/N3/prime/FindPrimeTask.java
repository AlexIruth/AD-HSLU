/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw07.N3.prime;

import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author alexi
 */
public class FindPrimeTask implements Runnable{
private static final Logger LOG = LogManager.getLogger(ch.hslu.ad.sw07.N3.prime.FindPrimeTask.class);
    private final BlockingQueue<BigInteger> queue;
    private final int queueMaxSize;

    public FindPrimeTask(final BlockingQueue<BigInteger> queue, final int queueMaxSize) {
        this.queue = queue;
        this.queueMaxSize = queueMaxSize;
    }

    public void run() {
        while (queue.size() < queueMaxSize) {
            BigInteger number = new BigInteger(1024, new Random());
            if (number.isProbablePrime(Integer.MAX_VALUE)) {
                queue.add(number);
                LOG.info("Prime Count: {}", queue.size());

            }
        }
    }

}
