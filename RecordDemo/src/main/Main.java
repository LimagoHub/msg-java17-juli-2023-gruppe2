package main;

import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

//        Person person = new Person("John", "Doe");
//
//        person.vorname();
//
//        person.toString();
//
//        GenericEvent<String>  event= new GenericEvent<>("Hallo");
//        System.out.println(event);
//
//        System.out.println("Hello world!");

        String text = """
                Lorem ipsum dolor sit amet, consectetur adipiscing\n\
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;

        System.out.println(text);
    }
}

record Person( String vorname, String nachname ) {}

record GenericEvent<T>(String id, LocalDateTime timestamp, T payload){

    public GenericEvent(final T payload) {
        this(UUID.randomUUID().toString(), LocalDateTime.now(), payload);
    }

    GenericEvent {
        timestamp = LocalDateTime.now();
        id = UUID.randomUUID().toString();
    }
}