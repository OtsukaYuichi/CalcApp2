package jp.techacademy.yuichi.otsuka.calcapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Double resultValue = intent.getDoubleExtra("VALUE1",0.0);

        TextView textView = (TextView) findViewById(R.id.formResult);
        textView.setText(String.valueOf(resultValue));
    }
}
