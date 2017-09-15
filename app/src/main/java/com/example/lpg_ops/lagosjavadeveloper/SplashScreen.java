package com.example.lpg_ops.lagosjavadeveloper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //To remove status bar on splash screen

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash_screen);


        //Intent to open login page and also to load the splash screen for few minutes before it start
        Thread myThread = new Thread (){
            @Override
            public void run() {
                try{
                    sleep(3000);
                    Intent intent =new Intent (getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch(InterruptedException e){e.printStackTrace();
                    super.run();
                }
            }
        };
        myThread.start();
    }

}



