package am.ipc.anrdoidrx;

import java.util.ArrayList;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by haykc on 09/14/2017.
 */

public class Logic {

    public Observable<User> getHayk() {
        return  Observable.create(new Observable.OnSubscribe<User>() {
            @Override
            public void call(Subscriber<? super User> subscriber) {
                for(int i=1;i<=10;i++){
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    subscriber.onNext(new User("Hayk " + i));
                }
                subscriber.onCompleted();
            }
        });
    }

    public Observable<User> getLian() {

        return  Observable.create(new Observable.OnSubscribe<User>() {
            @Override
            public void call(Subscriber<? super User> subscriber) {
                for(int i=1;i<=3;i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    subscriber.onNext(new User("Lian " + i));
                }
                subscriber.onCompleted();
            }
        });
    }

    public Observable<User> getAnna() {
        return  Observable.create(new Observable.OnSubscribe<User>() {
            @Override
            public void call(Subscriber<? super User> subscriber) {
                for(int i=1;i<=4;i++){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    subscriber.onNext(new User("Anna " + i));
                }
                subscriber.onCompleted();
            }
        });
    }
}
