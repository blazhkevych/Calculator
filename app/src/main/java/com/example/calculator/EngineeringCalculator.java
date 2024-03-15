package com.example.calculator;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EngineeringCalculator extends AppCompatActivity {

    String[] units_of_length = {
            "Nanometers",
            "Microns",
            "Millimeters",
            "Centimeters",
            "Meters",
            "Kilometers",
            "Inches",
            "Feet",
            "Yards",
            "Miles"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eng_calc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Спиннер для выбора единиц измерения длины которые будут использоваться как входные данные для конвертации в другие единицы измерения
        Spinner spinner_input = findViewById(R.id.length_spinner_input);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter_input = new ArrayAdapter(this, android.R.layout.simple_spinner_item, units_of_length);
        // Определяем разметку для использования при выборе элемента
        adapter_input.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner_input.setAdapter(adapter_input);

        // Спиннер для выбора единиц измерения длины которые будут использоваться как выходные данные для конвертации из других единиц измерения
        Spinner spinner_output = findViewById(R.id.length_spinner_output);
        // Создаем адаптер ArrayAdapter с помощью массива строк и стандартной разметки элемета spinner
        ArrayAdapter<String> adapter_output = new ArrayAdapter(this, android.R.layout.simple_spinner_item, units_of_length);
        // Определяем разметку для использования при выборе элемента
        adapter_output.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Применяем адаптер к элементу spinner
        spinner_output.setAdapter(adapter_output);
    }
}