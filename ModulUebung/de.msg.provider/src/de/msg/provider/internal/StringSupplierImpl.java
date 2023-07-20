package de.msg.provider.internal;

import de.msg.provider.StringSupplier;

public class StringSupplierImpl implements StringSupplier {
    @Override
    public String get() {
        return "Abc def ghi";
    }
}
