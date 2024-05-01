package com.example.menities.ui.gallery;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.menities.R;
import com.example.menities.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    public View root;
    private TextView day1;
    private TextView day2;
    private ImageView cal;
    private ImageView cal1;
    private ImageView request;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel = new ViewModelProvider(this).get(GalleryViewModel.class);
         root = inflater.inflate(R.layout.fragment_gallery, container, false);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        root = binding.getRoot();
        day1=root.findViewById(R.id.stdate);
        day2=root.findViewById(R.id.eddate);
        cal=root.findViewById(R.id.calender);
        cal1=root.findViewById(R.id.calender2);
        request=root.findViewById(R.id.iRequest);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDatePicker();
            }
        });
        cal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDatePicker1();
            }
        });
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Requested Succefully", Toast.LENGTH_SHORT).show();

            }
        });

        return root;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    private void openDatePicker(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireContext() , new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                //Showing the picked value in the textView
                day1.setText(String.valueOf(day)+ "."+String.valueOf(month+1)+ "."+String.valueOf(year));

            }
        }, 2024, 01, 20);

        datePickerDialog.show();
    }
    private void openDatePicker1(){
        DatePickerDialog datePickerDialog1 = new DatePickerDialog(requireContext() , new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                //Showing the picked value in the textView
                day2.setText(String.valueOf(day)+ "."+String.valueOf(month+1)+ "."+String.valueOf(year));

            }
        }, 2024, 01, 20);

        datePickerDialog1.show();
    }
    }