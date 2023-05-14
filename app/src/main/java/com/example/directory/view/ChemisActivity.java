package com.example.directory.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.directory.R;
import com.example.directory.model.Animal;
import com.example.directory.viewmodel.AnimalAdapter;

import java.util.ArrayList;
import java.util.List;

public class ChemisActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal> ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_chemis);
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
        animals.add( new Animal("Физико-химические постоянные", R.drawable.h1_1));
        animals.add( new Animal("Однородные и неоднородные смеси", R.drawable.h1));
        animals.add (new Animal( "Способы выделения веществ",R.drawable.h2));
        animals.add (new Animal( "Атомы, молекулы и ионы",R.drawable.h3_1));
        animals.add (new Animal( "Простые и сложные вещества",R.drawable.h4));
        animals.add (new Animal( "Вещества",R.drawable.h3));
        animals.add (new Animal( "Относительная атомная масса",R.drawable.h6));
        animals.add (new Animal( "Химические элементы",R.drawable.h5));
        animals.add (new Animal( "Закон постоянства состава вещества",R.drawable.h7));
        animals.add (new Animal( "Химические формулы",R.drawable.h8));
        animals.add (new Animal( "Относительная молекулярная масса",R.drawable.h9));
        animals.add (new Animal( "Массовая доля элемента в соединении",R.drawable.h10));
        animals.add (new Animal( "Вычисление по химическим формулам",R.drawable.h11));
        animals.add (new Animal( "Валентность химических элементов",R.drawable.h12));
        animals.add (new Animal( "Валентность химических элементов",R.drawable.h13));
        animals.add (new Animal( "Закон сохранения массы вещества",R.drawable.h14));
        animals.add (new Animal( "Химические уравнения",R.drawable.h15));
        animals.add (new Animal( "Типы химических реакций",R.drawable.h16));
        animals.add (new Animal( "Массовая доля растворенного вещества",R.drawable.h17));
        animals.add (new Animal( "Количество вещества",R.drawable.h18));
        animals.add (new Animal( "Закон Авогадро",R.drawable.h19));
        animals.add (new Animal( "Алгоритм решения задач",R.drawable.h47));
        animals.add (new Animal( "Алгоритм решения задач",R.drawable.h48));
        animals.add (new Animal( "Оксиды",R.drawable.h20));
        animals.add (new Animal( "Гидроксиды",R.drawable.h21));
        animals.add (new Animal( "Оксиды и Гидроксиды",R.drawable.h22));
        animals.add (new Animal( "Оксиды и Гидроксиды",R.drawable.h23));
        animals.add (new Animal( "Химические свойства оснований",R.drawable.h24_1));
        animals.add (new Animal( "Классификация оснований",R.drawable.h24));
        animals.add (new Animal( "Индикатор цвета",R.drawable.h25));
        animals.add (new Animal( "Кислоты",R.drawable.h26));
        animals.add (new Animal( "Кислоты",R.drawable.h27));
        animals.add (new Animal( "Химические свойства кислот",R.drawable.h28));
        animals.add (new Animal( "Химические свойства кислот",R.drawable.h29));
        animals.add (new Animal( "Химические свойства кислот",R.drawable.h30));
        animals.add (new Animal( "Химические свойства кислот",R.drawable.h31));
        animals.add (new Animal( "Соли",R.drawable.h32));
        animals.add (new Animal( "Свойство солей",R.drawable.h33));
        animals.add (new Animal( "Химические свойства солей",R.drawable.h34));
        animals.add (new Animal( "Химические свойства солей",R.drawable.h35));
        animals.add (new Animal( "Строение атома",R.drawable.h37));
        animals.add (new Animal( "Строение атома",R.drawable.h37_1));
        animals.add (new Animal( "Строение атома",R.drawable.h37_2));
        animals.add (new Animal( "Строение атома",R.drawable.h36));
        animals.add (new Animal( "Строение атома",R.drawable.h37_3));
        animals.add (new Animal( "Строение атома",R.drawable.h38_1));
        animals.add (new Animal( "Строение атома",R.drawable.h38_2));
        animals.add (new Animal( "Радиация",R.drawable.h39_1));
        animals.add (new Animal( "Распределение электронов по энергетическим уровням",R.drawable.h38));
        animals.add (new Animal( "Распределение электронов по энергетическим уровням",R.drawable.h39));
        animals.add (new Animal( "Распределение электронов по энергетическим уровням",R.drawable.h40));
        animals.add (new Animal( "Электроотрицательность",R.drawable.h41));
        animals.add (new Animal( "Основные виды химической связи",R.drawable.h42));
        animals.add (new Animal ("Основные виды химической связи", R.drawable.h43));
        animals.add (new Animal( "Качественные реакции анионов",R.drawable.h43_1));
        animals.add (new Animal( "Качественные реакции катионов",R.drawable.h43_2));
        animals.add (new Animal( "Степень окисления",R.drawable.h44));
        animals.add (new Animal( "Степень окисления",R.drawable.h45_1));
        animals.add (new Animal( "Степень окисления",R.drawable.h45));
        animals.add (new Animal( "Степень окисления",R.drawable.h44));
        animals.add (new Animal( "Окислительно-восстановительные реакции",R.drawable.h49));
        animals.add (new Animal( "Окислительно-восстановительные реакции",R.drawable.hm1_1));
        animals.add (new Animal( "Окислительно-восстановительные реакции",R.drawable.hm1_2));
        animals.add (new Animal( "Тепловой эффект от химической реакции",R.drawable.h53));
        animals.add (new Animal( "Тепловой эффект от химической реакции",R.drawable.h51));
        animals.add (new Animal( "Тепловой эффект от химической реакции",R.drawable.h52));
        animals.add (new Animal( "Тепловой эффект от химической реакции",R.drawable.h54));
        animals.add (new Animal( "Тепловой эффект от химической реакции",R.drawable.h55));
        animals.add (new Animal( "Скорость химической реакции",R.drawable.h56));
        animals.add (new Animal( "Скорость химической реакции",R.drawable.h57));
        animals.add (new Animal( "Скорость химической реакции",R.drawable.h58));
        animals.add (new Animal( "Химическое равновесие",R.drawable.h59));
        animals.add (new Animal( "Сущность процесса электролитической диссоциации",R.drawable.h60));
        animals.add (new Animal( "Электролиты",R.drawable.h61));
        animals.add (new Animal( "Электролиты",R.drawable.hm3));
        animals.add (new Animal( "Диссоциация кислот оснований и солей",R.drawable.h62));
        animals.add (new Animal( "Диссоциация кислот оснований и солей",R.drawable.h63));
        animals.add (new Animal( "Свойства веществ",R.drawable.hm4));
        animals.add (new Animal( "Слабые и сильные электролиты степень диссоциации",R.drawable.h64));
        animals.add (new Animal( "Реакции ионного обмена",R.drawable.h65));
        animals.add (new Animal( "Реакции ионного обмена",R.drawable.h66));
        animals.add (new Animal( "Гидролиз солей",R.drawable.h67));
        animals.add (new Animal( "Гидролиз солей",R.drawable.h68));
        animals.add (new Animal( "Изменение цвета индикатора",R.drawable.hm5));
        animals.add (new Animal( "Галогены в природе",R.drawable.h69));
        animals.add (new Animal( "Физические свойства галогенов",R.drawable.hm6_2));
        animals.add (new Animal( "Напряжение металлов",R.drawable.hm7));
    }
}