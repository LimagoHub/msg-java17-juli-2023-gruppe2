package main;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception{

//        var request = HttpRequest
//                .newBuilder()
//                .uri(URI.create("http://localhost:8080/demo/add/3/4"))
//                .GET()
//
//                .build();
//
//
//        var client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
//
//        var future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());
//
//        future.thenAccept(responseEntity->{
//            System.out.println("Statuscode = " + responseEntity.statusCode());
//            int result = responseEntity.body().transform(s->Integer.valueOf(s));
//            System.out.println(result);
//        });
//
//        future.join();
//
//        System.out.println("Fertig!");

        HttpRequest.BodyPublisher publisher = HttpRequest.BodyPublishers.ofString("{\"a\":\"3\",\"b\":\"4\"}");

        var request = HttpRequest
                .newBuilder()
                .uri(URI.create("http://localhost:8080/demo/add"))
                .POST(publisher)
                .header("Content-Type","application/json")
                .build();
        var client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        var future = client.sendAsync(request, HttpResponse.BodyHandlers.ofString());


        future.thenAccept(responseEntity->{
            System.out.println("Statuscode = " + responseEntity.statusCode());
            int result = responseEntity.body().transform(s->Integer.valueOf(s));
            System.out.println(result);
        });

        future.join();

        System.out.println("Fertig!");

    }
}