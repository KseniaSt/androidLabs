package com.example.ksenia.an_lab_1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    String[] cities = {"Жадан", "Трейси", "Найт", "Кавасаки", "Коллинз", "Манн"};
    TextView selection;
    String item;
    String item2;
    boolean checked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selection = (TextView) findViewById(R.id.selection);

        Spinner spinner = (Spinner) findViewById(R.id.cities);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
        // Определяем разметку для использования при выборе элемента
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner.setAdapter(adapter);

        OnItemSelectedListener itemSelectedListener = new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Получаем выбранный объект
                item = (String)parent.getItemAtPosition(position);
                // selection.setText(item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
    }





    public void sendMessage(View view) {

        //selection.setText(item2);

        // Получаем нажатый переключатель

        selection.setText("Ваш выбор: "+ item + " " + item2);
        };

    public void onRadioButtonClicked(View view) {
        // если переключатель отмечен
        checked = ((RadioButton) view).isChecked();
        selection = (TextView) findViewById(R.id.selection);
        switch(view.getId()) {
            case R.id.year2010:
                if (checked){
                    item2 = "2010";
                }
                break;
            case R.id.year2018:
                if (checked){
                    item2 = "2018";
                }
                break;
        }
    }
}