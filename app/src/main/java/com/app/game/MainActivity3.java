package com.app.game;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity3 extends AppCompatActivity{
    EditText editText1;
    Button button1;
    int ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText1 = this.findViewById(R.id.edittext1);
        button1 = this.findViewById(R.id.button1);
        Random random = new Random();
        ans = random.nextInt(100);
    }
    public void checkAnswer(View view){
        String s1 = editText1.getText().toString();
        int n1 = Integer.parseInt(s1);
        String msg = null;

            if (n1 == ans) {
                msg = "you win";
                button1.setEnabled(false);

            } else if (n1 > ans) {
                msg = "your answer is too big !";
            } else if (n1 < ans) {
                msg = "your answer is too small !";
            }

            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    }

}
