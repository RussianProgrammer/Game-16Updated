package ru.samsung.itschool.game18;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
    }
    protected void onClick(View view) {
        Intent intent = new Intent(LaunchActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
