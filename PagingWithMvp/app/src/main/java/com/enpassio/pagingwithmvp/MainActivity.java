package com.enpassio.pagingwithmvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.enpassio.pagingwithmvp.view.ActivityPagingWithMvp;

public class MainActivity extends AppCompatActivity {

    private Button activityPagingWithMvp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityPagingWithMvp = findViewById(R.id.button_mvp_with_text_view);
        activityPagingWithMvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ActivityPagingWithMvp.class));
            }
        });
    }
}
