package com.example.timisoara;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, singup, cancel;
    EditText ed1, ed2;
    TextView tx1;
    int counter = 3;
    Intent tp, tp2, tp3;
    Toolbar tollbar;
    ProgressBar progressBar;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);
        tollbar = findViewById(R.id.toolbar2);
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
       b2 = findViewById(R.id.button2);
        cancel = findViewById(R.id.cancel);
        tx1 = findViewById(R.id.textView3);
        singup = findViewById(R.id.button3);
        tollbar.setTitle("Auentificare");
        firebaseAuth = FirebaseAuth.getInstance();
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);


                firebaseAuth.signInWithEmailAndPassword(ed1.getText().toString(),
                        ed2.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                            tp = new Intent(MainActivity.this, Menu.class);
                            startActivity(tp);

                        } else {
                            Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

                            tx1.setVisibility(View.VISIBLE);
                            tx1.setBackgroundColor(Color.RED);
                            counter--;
                            tx1.setText(Integer.toString(counter));

                            if (counter == 0) {
                                b1.setEnabled(false);
                            }
                        }

                    }

                });
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp3 = new Intent(MainActivity.this, Reset_Pass.class);
                startActivity(tp3);
            }
        });
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp2 = new Intent(MainActivity.this, SingUp.class);
                startActivity(tp2);
            }
        });


    }
}

