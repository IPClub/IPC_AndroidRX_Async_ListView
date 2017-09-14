package am.ipc.anrdoidrx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jakewharton.rxbinding.view.RxView;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<User> adapter;
    List<User> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        data = new ArrayList<>();
        adapter = new ArrayAdapter<User>(this, android.R.layout.simple_list_item_1, data);
        lv.setAdapter(adapter);

        RxView.clicks(findViewById(R.id.b1)).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                Logic logic = new Logic();
                logic.getHayk()
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<User>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onNext(User user) {
                                Log.d("aaaa", "b1 " + user);
                                data.add(user);
                                adapter.notifyDataSetChanged();
                            }
                        });
            }
        });

        RxView.clicks(findViewById(R.id.b2)).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                Logic logic = new Logic();
                logic.getLian()
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<User>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onNext(User user) {
                                Log.d("aaaa", "b2 " + user);
                                data.add(user);
                                adapter.notifyDataSetChanged();
                            }
                        });

            }
        });

        RxView.clicks(findViewById(R.id.b3)).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                Logic logic = new Logic();
                logic.getAnna()
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<User>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onNext(User user) {
                                Log.d("aaaa", "b3 " + user);
                                data.add(user);
                                adapter.notifyDataSetChanged();
                            }
                        });
            }
        });
    }

}
