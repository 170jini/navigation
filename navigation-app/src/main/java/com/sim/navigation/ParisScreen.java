package com.sim.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

public class ParisScreen extends Fragment {

    public ParisScreen() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(((MainActivity) requireActivity()).getSupportActionBar()).setTitle(R.string.paris_title);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_paris_screen, container, false);
        view.findViewById(R.id.to_italy_from_paris).setOnClickListener(screen ->
                Navigation.findNavController(screen).navigate(R.id.action_paris_screen_to_italy_screen));
        view.findViewById(R.id.to_london_from_paris).setOnClickListener(screen ->
                Navigation.findNavController(screen).navigate(R.id.action_paris_screen_to_london_screen));
        return view;
    }
}