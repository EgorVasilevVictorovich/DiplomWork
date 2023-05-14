package com.example.directory.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.directory.R;
import com.example.directory.model.Animal;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {
    private final LayoutInflater inflater;
    private final List<Animal> animals;

    public AnimalAdapter(Context context, List<Animal> animals) {
        this.inflater = LayoutInflater.from (context);
        this.animals = animals;
    }


    @Override
    public AnimalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate (R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
        return new ViewHolder (view);
    }

    // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Animal по определенной позиции
    @Override
    public void onBindViewHolder(AnimalAdapter.ViewHolder holder, int position) {
        Animal animal = animals.get (position);
        holder.animalView.setImageResource (animal.getAnimalResource ());
        holder.nameView.setText (animal.getName ());

    }

    // метод getItemCount() возвращает количество объектов в списке
    @Override
    public int getItemCount() {
        return animals.size ();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView animalView;
        final TextView nameView;
        ViewHolder(View view) {
            super (view);
            animalView = view.findViewById (R.id.animalResource);
            nameView = view.findViewById (R.id.name);

        }
    }
}
