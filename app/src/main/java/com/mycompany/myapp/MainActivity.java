package com.mycompany.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Связываем с XML

        // Находим кнопку по её ID
        Button myButton = findViewById(R.id.myButton);

        // Устанавливаем обработчик нажатия
        myButton.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					// Меняем цвет кнопки
					myButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
					myButton.setText("Цвет изменён!");
				}
			});
    }
}

