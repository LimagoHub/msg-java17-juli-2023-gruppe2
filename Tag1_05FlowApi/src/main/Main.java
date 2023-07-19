package main;

import de.de.processors.MyProcessor;
import de.subscriber.EndSubscriber;

import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception{

        ExecutorService service = Executors.newFixedThreadPool(4);

        var liste = List.of("eins", "zwei", "3", "Vier", "5");

        var endSubscriber = new EndSubscriber<Integer>();

        var publisher = new SubmissionPublisher<String>();
        MyProcessor processor = new MyProcessor(Integer::valueOf);
        publisher.subscribe(processor);

        processor.subscribe(endSubscriber);

        liste.forEach(publisher::submit);


        publisher.close();

        System.out.println("Hello world!");

        ((ForkJoinPool)publisher.getExecutor()).awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
    }
}