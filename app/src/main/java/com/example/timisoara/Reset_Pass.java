package com.example.timisoara;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class Reset_Pass extends AppCompatActivity {

    Button rst;
    Toolbar toolbar;
    ProgressBar progressBar;

    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset__pass);
        toolbar = findViewById(R.id.toolbar3);
        progressBar = findViewById(R.id.progressBar);
        EditText edt = findViewById(R.id.etemail);
        rst= findViewById(R.id.but4);
        toolbar.setTitle(R.string.app_name);
        //firebaseAuth = FirebaseAuth.getInstance();
        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                FirebaseAuth.getInstance().sendPasswordResetEmail(edt.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                progressBar.setVisibility(View.GONE);
                                if(task.isSuccessful()) {
                                    Toast.makeText(Reset_Pass.this, "Email-ul a fost trimis!", Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(Reset_Pass.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });

    }
}
