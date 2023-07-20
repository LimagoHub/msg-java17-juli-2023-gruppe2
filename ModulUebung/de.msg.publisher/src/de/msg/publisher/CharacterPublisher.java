package de.msg.publisher;

import java.util.ServiceLoader;
import java.util.concurrent.Flow;
import java.util.function.Supplier;

public interface CharacterPublisher extends Flow.Publisher<Character> {

    <T>  void start(Supplier<T> supplier);
    void awaitTermination();

    static CharacterPublisher create() {
        ServiceLoader<CharacterPublisher> loader = ServiceLoader.load(CharacterPublisher.class);
        return loader.findFirst().get();
    }
}
