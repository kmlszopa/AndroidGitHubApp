package com.example.kmlsz.repositories;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gitHubBtn = (Button) findViewById(R.id.btn_github);
        gitHubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gitHubIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com"));
                startActivity(gitHubIntent);

            }
        });

    }
}
