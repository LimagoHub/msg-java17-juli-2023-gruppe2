package main;

import de.msg.provider.StringSupplier;
import de.msg.publisher.CharacterPublisher;
import de.subscriber.EndSubscriber;
import de.tiere.Schwein;

import java.util.concurrent.Flow;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        EndSubscriber<Character> endSubscriber = new EndSubscriber<>();
         CharacterPublisher publisher = CharacterPublisher.create();
         publisher.subscribe(endSubscriber);
         Supplier<Schwein> schweineSupplier=  ()->new Schwein("Piggy");
         publisher.start(schweineSupplier);
         publisher.awaitTermination();


    }
}