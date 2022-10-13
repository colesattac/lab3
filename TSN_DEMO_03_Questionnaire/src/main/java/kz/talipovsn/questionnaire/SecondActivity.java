package kz.talipovsn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onBack(View v) {
        setResult(RESULT_OK);
        finish();
    }
    public void onExit(View v) {
        finishAffinity();
    }

}



