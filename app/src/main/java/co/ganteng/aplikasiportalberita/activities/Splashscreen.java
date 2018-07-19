package co.ganteng.aplikasiportalberita.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

import co.ganteng.aplikasiportalberita.R;

public class Splashscreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        Handler objHandler  = new Handler();
        boolean b = objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
