package kz.talipovsn.questionnaire;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Локальные переменные для доступа к компонентам окна
    private EditText editText;
    private RadioGroup radioGroup;
    private RadioGroup radioGroup1;
    private RadioButton selectRadioButton;
    private RadioButton selectRadioButton1;
    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация переменных доступа к компонентам окна
        editText =   findViewById(R.id.editText);
        radioGroup = findViewById(R.id.radioGroup);
        radioGroup1 = findViewById(R.id.radioGroup1);
        spinner =    findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);
    }

    // МЕТОД ДЛЯ КНОПКИ "ИТОГО"
    public void onInfo(View v) {
        // Создание второго окна
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        //Intent intent = new Intent("kz.talipovsn.questionnaire.ResultActivity");

//        float a = 1;
//        for(int i = 0; i <= 16; i++) {
//            a += 0.5;
//            textView.setTextSize(a);
//            if (i == 16) {i = 0;}
//            if (a >= 8) {a -= 0.5;}
//        }

        selectRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());
        selectRadioButton1 = findViewById(radioGroup1.getCheckedRadioButtonId());

        // Подготовка параметров для второго окна
        intent.putExtra("fio", editText.getText().toString());
        intent.putExtra("gender", selectRadioButton1.getText());
        intent.putExtra("edu", selectRadioButton.getText());
        intent.putExtra("country", spinner.getSelectedItem().toString());

        // Запуск второго окна
        startActivity(intent);
    }

}
