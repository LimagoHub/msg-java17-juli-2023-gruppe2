package main.cleaner;

import java.lang.ref.Cleaner;

public class DefaultCleaner {
    public static final Cleaner instance = Cleaner.create();

    private DefaultCleaner(){}
}
