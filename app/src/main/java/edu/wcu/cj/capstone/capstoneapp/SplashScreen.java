package edu.wcu.cj.capstone.capstoneapp;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

/**
 * The splash screen. Currently just a label and progress bar, might add
 * logo later
 *
 * @author CJ Bland
 * @version 1.0
 */
public class SplashScreen extends AppCompatActivity {

    private final int DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //Toast.makeText(getApplicationContext(), "On Splash", Toast.LENGTH_SHORT).show();


        /*FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);*/

    }


    //Goes to the next screen
    protected void onStart(){
        super.onStart();
        Handler handler = new Handler();
        handler.postDelayed(runner, DELAY);
    }

    private final Runnable runner = new Runnable(){
        @Override
        public void run(){
            nextScreen();
        }
    };

    //Goes to the next screen and prevents user from going back once loaded
    private void nextScreen(){
        Intent i = new Intent(this, LogIn.class);
        this.startActivity(i);
        finish();
    }
}
