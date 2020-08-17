package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView countText;
    private Button plus1Button;
    private Button minus1Button;
    private Button resetButton;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText = (TextView)findViewById(R.id.text);
        plus1Button = (Button)findViewById(R.id.plus1);
        minus1Button = (Button)findViewById(R.id.minus1);
        resetButton = (Button)findViewById(R.id.reset);
        // 変数numberに0を代入する
        number = 0;

        // plusButtonの処理
        countText.setText(number + "");
        plus1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ボタンが押されるごとに1ずつ数字が増えていく処理
                number++;
                countText.setText(number + "");
            }
        });

        // minusButtonの処理
        minus1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number--;
                countText.setText(number + "");
            }
        });

        // resetButtonの処理
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // RESETボタンが押されたとき,numberを初期化する
                number = 0;
                countText.setText(number + "");
            }
        });
    }
}