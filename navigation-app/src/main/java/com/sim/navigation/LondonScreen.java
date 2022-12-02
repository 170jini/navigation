package com.sim.navigation;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

public class LondonScreen extends Fragment {

    public LondonScreen() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(((MainActivity) requireActivity()).getSupportActionBar()).setTitle(R.string.london_title);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_london_screen, container, false);
        view.findViewById(R.id.to_paris_from_london).setOnClickListener(screen ->
                Navigation.findNavController(screen).navigate(R.id.action_london_screen_to_paris_screen));
        view.findViewById(R.id.to_italy_from_london).setOnClickListener(screen ->
                Navigation.findNavController(screen).navigate(R.id.action_london_screen_to_italy_screen));
        return view;
    }
}