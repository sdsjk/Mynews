package anew.own.com.mynews.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import anew.own.com.mynews.R;

public class guide extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        init();
    }

    private void init() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(guide.this, MainActivity.class));
                finish();
            }
        }, 2000);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();



    }
}
