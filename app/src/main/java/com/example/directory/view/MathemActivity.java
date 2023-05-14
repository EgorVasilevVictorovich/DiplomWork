package com.example.directory.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.directory.R;
import com.example.directory.model.Animal;
import com.example.directory.viewmodel.AnimalAdapter;

import java.util.ArrayList;
import java.util.List;

public class MathemActivity extends AppCompatActivity {


    List<Animal> animals = new ArrayList<Animal> ();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_mathem);
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Основные законы алгебры", R.drawable.mat1));
        animals.add (new Animal( "Неравенства",R.drawable.mat2));
        animals.add (new Animal( "Модуль действительного числа",R.drawable.mat3));
        animals.add (new Animal( "Свойства модуля",R.drawable.mat4));
        animals.add (new Animal( "Разложение на множители",R.drawable.mat5));
        animals.add (new Animal( "Арифметический корень",R.drawable.mat6));
        animals.add (new Animal( "Арифметический корень свойства",R.drawable.mat7));
        animals.add (new Animal( "Степень",R.drawable.mat8));
        animals.add (new Animal( "Квадратные уравнения",R.drawable.mat9));
        animals.add (new Animal( "Стандартный числа",R.drawable.mat10));
        animals.add (new Animal( "Погрешности",R.drawable.mat11));
        animals.add (new Animal( "Определение логарифмов",R.drawable.mat12));
        animals.add (new Animal( "Свойства логарифмов",R.drawable.mat12_1));
        animals.add (new Animal( "Арифметическая прогрессия",R.drawable.mat13));
        animals.add (new Animal( "Геометрическая прогрессии",R.drawable.mat14));
        animals.add (new Animal( "Тригонометрия",R.drawable.mat15));
        animals.add (new Animal( "Таблица синусов и косинусов",R.drawable.mat15_2));
        animals.add (new Animal( "Формулы одного и того же аргумента",R.drawable.mat15_0_1));
        animals.add (new Animal( "Формулы тригонометрических функций",R.drawable.mat15_01));
        animals.add (new Animal( "Формулы понижения степени...",R.drawable.mat_05));
        animals.add (new Animal( "Преобразование из суммы в произведение",R.drawable.mat15_3));
        animals.add (new Animal( "Знаки по четвертям и решение уравнений",R.drawable.mat15_4));
        animals.add (new Animal( "Формулы приведения синусов и косинусов",R.drawable.mat15_5));
        animals.add (new Animal( "Формулы приведения тангенсов и котангенсов",R.drawable.mat15_3_1));
        animals.add (new Animal( "Обратные тригонометрические функции",R.drawable.mat15_6));
        animals.add (new Animal( "Асимптоты графика функции",R.drawable.mat16));
        animals.add (new Animal( "Производная и правила дифференцирования",R.drawable.mat17));
        animals.add (new Animal( "Формулы дифференцирования",R.drawable.mat17_2));
        animals.add (new Animal( "Уравнение касательной к графику функций",R.drawable.mat17_3));
        animals.add (new Animal( "Первообразная и интеграл",R.drawable.mat18));
        animals.add (new Animal( "Правила вычисления первообразных",R.drawable.mat19));
        animals.add (new Animal( "Таблица первообразных",R.drawable.mat18_2));
        animals.add (new Animal( "Вычисление площади",R.drawable.mat18_3));
    }
}