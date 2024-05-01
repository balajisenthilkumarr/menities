package com.example.menities.ui.staus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.menities.databinding.FragmentStatusBinding;

public class statusFragment extends Fragment {

    private FragmentStatusBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       StatusViewModel slideshowViewModel =
                new ViewModelProvider(this).get(StatusViewModel.class);

        binding = FragmentStatusBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}