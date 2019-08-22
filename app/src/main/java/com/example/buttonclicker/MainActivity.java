package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.invoke.ConstantCallSite;

public class MainActivity extends AppCompatActivity {
    private int timesClicked;
    private int buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timesClicked = 0;
        buttonClickerButton = findViewById(R.id.button_main_clicker);
        textViewScore = findViewById(R.id.textview_main_score);
        constraintLayout = findViewById(R.id.textview_main_score);
    }

    public void onClickerClicked(View view) {
        Toast.makeText(context:this, text:"YOU DID IT!", Toast.LENGTH_LONG).show();
        buttonClickerButton.setText
        textViewScore.setText("Score: " + timesClicked);

        changeBackgroundColor();

    }

    private void changeBackgroundColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        int color = Color.rgb(r, g, b);
        constraintLayout.setBackgroundColor(color);
    }
}

