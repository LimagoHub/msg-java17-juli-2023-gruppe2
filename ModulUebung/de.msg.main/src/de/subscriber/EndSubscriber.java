package de.subscriber;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class EndSubscriber<T> implements Subscriber<T>{

	private Subscription subscription;

	@Override
	public void onSubscribe(Subscription subscription) { // Einmal beim Registrieren
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(T item) {
		System.out.println(item);
		subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println("Publisher kaputt, Verarbeitung terminiert");
		throwable.printStackTrace();
		
	}

	@Override
	public void onComplete() {// Normale Terminierung
		System.out.println("Publisher hat fertig!!!");
		
	}

}
