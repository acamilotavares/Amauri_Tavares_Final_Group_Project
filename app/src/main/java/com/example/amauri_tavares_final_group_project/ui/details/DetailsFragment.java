package com.example.amauri_tavares_final_group_project.ui.details;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.amauri_tavares_final_group_project.R;


public class DetailsFragment extends Fragment {

    private Button houseBtn1;
    private ImageButton simpleImageButton;

    private TextView texCity ,textAddress, priceTv ;

    public DetailsFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        texCity = view.findViewById(R.id.texCity);
        textAddress = view.findViewById(R.id.textAddress);
        priceTv = view.findViewById(R.id.priceTv);
        houseBtn1  = view.findViewById(R.id.houseBtn1);
        simpleImageButton = view.findViewById(R.id.simpleImageButton);

        String city = DetailsFragmentArgs.fromBundle(getArguments()).getCityArg();
        String address = DetailsFragmentArgs.fromBundle(getArguments()).getAddressArg();
        String price = DetailsFragmentArgs.fromBundle(getArguments()).getPriceArg();
        int imageService = DetailsFragmentArgs.fromBundle(getArguments()).getImageService();

        texCity.setText(city);
        textAddress.setText(address);
        priceTv.setText(price);
        simpleImageButton.setImageResource(imageService);

    }
}
