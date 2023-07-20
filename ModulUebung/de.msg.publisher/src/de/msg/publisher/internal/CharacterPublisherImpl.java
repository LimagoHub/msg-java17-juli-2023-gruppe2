package de.msg.publisher.internal;

import de.msg.publisher.CharacterPublisher;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CharacterPublisherImpl extends SubmissionPublisher<Character> implements CharacterPublisher {



    @Override
    public <T>  void start(Supplier<T> supplier){
        String toSend = supplier.get().toString();
        toSend.chars().mapToObj(c->Character.valueOf((char) c)).forEach(this::submit);
    }

    @Override
    public void awaitTermination() {
        try {
            ((ForkJoinPool) this.getExecutor()).awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
