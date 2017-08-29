package com.example.admin.firebaseauthandnotification;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user =  mAuth.getCurrentUser();
        setTitle(user.getDisplayName()+" " + user.getEmail());

    }

    public void signOut(View view) {
        mAuth.signOut();
        LoginManager.getInstance().logOut();
        Toast.makeText(this, "Sign out successfully", Toast.LENGTH_SHORT).show();
        finish();
    }


}
