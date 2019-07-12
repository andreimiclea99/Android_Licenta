package com.example.timisoara;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedBack extends AppCompatActivity {
    Button btn;
    EditText nume,email, mesaj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        btn = findViewById(R.id.buton);
        nume = findViewById(R.id.nume);
        email = findViewById(R.id.prenume);
        mesaj = findViewById(R.id.mesaj);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent(Intent.ACTION_SENDTO);
                viewIntent.setData(Uri.parse("mailto: contactvisittimisoara@gmail.com"));
                viewIntent.putExtra(viewIntent.EXTRA_EMAIL,  email.getText().toString().trim());
                viewIntent.putExtra(viewIntent.EXTRA_STREAM, email.getText().toString().trim());
                viewIntent.putExtra(viewIntent.EXTRA_SUBJECT, "Feedback Aplicatie");
                viewIntent.putExtra(viewIntent.EXTRA_TEXT,mesaj.getText().toString());
                try {
                    startActivity(Intent.createChooser(viewIntent, "Mail-ul a fost trimis"));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(FeedBack.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
                startActivity(viewIntent);

            }
        });
    }
}
