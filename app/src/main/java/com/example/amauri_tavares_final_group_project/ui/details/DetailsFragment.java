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
import com.example.amauri_tavares_final_group_project.controller.CourseController;
import com.example.amauri_tavares_final_group_project.controller.HouseController;
import com.example.amauri_tavares_final_group_project.model.Course;
import com.example.amauri_tavares_final_group_project.model.House;


public class DetailsFragment extends Fragment {

    private Button addFvoriteBtn1;
    private ImageButton simpleImageButton;
    private TextView texCity ,textAddress, priceTv ;
    HouseController houseController;
    CourseController courseController;
    House house;
    Course course;

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

        houseController = new HouseController(getContext());

        addFvoriteBtn1=view.findViewById(R.id.addFvoriteBtn1);
        addFvoriteBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // texCity = view.findViewById(R.id.texCity);
                //textAddress = view.findViewById(R.id.textAddress);
                //priceTv = view.findViewById(R.id.priceTv);
              //  addFvoriteBtn1  = view.findViewById(R.id.addFvoriteBtn1);
              //  simpleImageButton = view.findViewById(R.id.simpleImageButton);

                //                   public House(String code_house, String city_house, String address_house, float price) {
//                house = new House("00001",texCity.getText().toString(),textAddress.getText().toString(),Float.valueOf(priceTv.getText().toString()));
//                house = new House("00001","Waterloo","Casa dos Tabajaras",100000);
                Course   course = new Course("Caralho","012121","Casa dos Tabajaras",100000);
//                  houseController.incluir(house);
                  courseController.incluir(course);
            }
        });

//---------------------------------------------------------------------------
        texCity = view.findViewById(R.id.texCity);
        textAddress = view.findViewById(R.id.textAddress);
        priceTv = view.findViewById(R.id.priceTv);
        addFvoriteBtn1  = view.findViewById(R.id.addFvoriteBtn1);
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
