/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.ad.sw10.array.sum;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author alexi
 */
public class Pool {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        int[] array = {2, 4, 3, 123, 123, 1, 23, 2, 3, 2, 2};
        SumTask sumTask = new SumTask(array);
        Future result = forkJoinPool.submit(sumTask);
        System.out.println(forkJoinPool.invoke(sumTask));
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<Integer>(10);
        blockingQueue.offer(29);
        blockingQueue.offer(249);
        blockingQueue.offer(229);
        blockingQueue.offer(129);
        System.out.println(blockingQueue.size());
        Runnable target = null;
        Thread thread = new Thread();
        ArrayBlockingQueue lbq =new ArrayBlockingQueue(10);
lbq.clear();

    }

}
