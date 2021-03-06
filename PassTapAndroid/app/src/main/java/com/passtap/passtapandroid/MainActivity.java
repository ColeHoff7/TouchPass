package com.passtap.passtapandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.iid.FirebaseInstanceId;


public class MainActivity extends AppCompatActivity {
    //MyFirebaseMessagingService fbms = new MyFirebaseMessagingService();
    public FirebaseInstanceId instanceId = FirebaseInstanceId.getInstance();
    //public IdentifierManager idManager = new IdentifierManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sp = getSharedPreferences("privateKey", 0);
        String pk = sp.getString("privateKey", "ERROR");
        if(pk.equals("ERROR")){
            Intent intent = new Intent(this, Init.class);
            startActivity(intent);
            finish();
        }
    }

    //TODO listen for pushes from server, authenticate

}
