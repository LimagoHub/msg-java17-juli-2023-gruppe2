package de.msg.provider;

import java.util.ServiceLoader;
import java.util.function.Supplier;

public interface StringSupplier extends Supplier<String> {

    static StringSupplier create() {
        ServiceLoader<StringSupplier> loader = ServiceLoader.load(StringSupplier.class);
        return loader.findFirst().get();
    }
}
