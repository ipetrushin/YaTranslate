package com.example.yatranslate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayResult(String text) {
        Log.d("mytag", text);
        TextView tv = findViewById(R.id.result);
        // TODO: предусмотреть вывод многострочного текста
        tv.setText(text);
    }

    public void onClick(View v) {
        EditText et = findViewById(R.id.text);
        String txt = et.getText().toString();
        // TODO: реализовать выбор направления перевода
        Request req = new Request(txt, "en-ru");
        YaTranslateTask task = new YaTranslateTask(this);
        task.execute(req);

    }
}
