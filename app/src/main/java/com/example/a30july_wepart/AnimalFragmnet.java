package com.example.a30july_wepart;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class AnimalFragmnet extends Fragment {

    private RecyclerView recyclerView ;
    private ArrayList<Animal> animalList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_animal_fragmnet, container, false);
    }

    private void buildList(){
        int t=70;
        while(t-- >0){
            Animal animal = new Animal("Rocky",R.drawable.animaliamge);
            animalList.add(animal);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initVIew(view);
        buildList();
        setRecylcerView();
    }

    private void setRecylcerView() {
        AnimalAdaptor animalAdaptor = new AnimalAdaptor(animalList);
        GridLayoutManager linearLayoutManager= new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdaptor);
    }

    private void initVIew(View view) {
        recyclerView = view.findViewById(R.id.recyclerView);
    }


}