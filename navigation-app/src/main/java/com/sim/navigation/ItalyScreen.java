package com.sim.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

public class ItalyScreen extends Fragment {

    public ItalyScreen() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(((MainActivity) requireActivity()).getSupportActionBar()).setTitle(R.string.italy_title);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_italy_screen, container, false);
        view.findViewById(R.id.to_london_from_italy).setOnClickListener(screen ->
                Navigation.findNavController(screen).navigate(R.id.action_italy_screen_to_london_screen));
        view.findViewById(R.id.to_paris_from_italy).setOnClickListener(screen ->
                Navigation.findNavController(screen).navigate(R.id.action_italy_screen_to_paris_screen));
        return view;
    }
}