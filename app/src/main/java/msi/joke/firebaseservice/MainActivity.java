package msi.joke.firebaseservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import msi.joke.firebaseservice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState==null){

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMain,new MainFragment()).commit();
        }
    }
}
