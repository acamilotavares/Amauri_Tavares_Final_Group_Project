package com.example.amauri_tavares_final_group_project.ui.favorites;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.amauri_tavares_final_group_project.R;

import com.example.amauri_tavares_final_group_project.controller.HouseController;
import com.example.amauri_tavares_final_group_project.databinding.FragmentFavoritesBinding;
import com.example.amauri_tavares_final_group_project.databinding.FragmentSearchBinding;
import com.example.amauri_tavares_final_group_project.ui.SelectListener;
import com.example.amauri_tavares_final_group_project.ui.search.CustomAdapter;
import com.example.amauri_tavares_final_group_project.ui.search.HouseSearchModel;
import com.example.amauri_tavares_final_group_project.ui.search.SearchFragmentDirections;

import java.util.ArrayList;
import java.util.List;

public class FavoritesFragment extends Fragment implements SelectListener {

    FragmentFavoritesBinding  binding;
    private List<HouseSearchModel> myModelList;
    private RecyclerView recyclerView;
    CustomAdapterFavorites customAdapterFavorites;
    NavController navController;
    NavDirections action;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFavoritesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        navController = Navigation.findNavController(view);
        displayItems(view);
    }

    private void displayItems(View view) {
        recyclerView = view.findViewById(R.id.recycler_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));

        int houseImages[] = {R.drawable.home1,R.drawable.home2,R.drawable.home3,R.drawable.home4};

        //  myModelList = new ArrayList<>();
        //  myModelList.add(new ServiceSearchModel("Spider - Barber","Barber"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[0]));


        myModelList = new ArrayList<>();
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[0],"1000000"));
        myModelList.add(new HouseSearchModel("Kitchener","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[1],"1000000"));
        myModelList.add(new HouseSearchModel("Cambridge","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[2],"1000000"));
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[3],"1000000"));
        myModelList.add(new HouseSearchModel("Kitchener","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[1],"1000000"));
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[0],"1000000"));
        myModelList.add(new HouseSearchModel("Cambridge","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[1],"1000000"));
        customAdapterFavorites = new CustomAdapterFavorites (getContext(), myModelList, this);
        recyclerView.setAdapter(customAdapterFavorites);
    }

    @Override
    public void onItemClicked(HouseSearchModel myModel) {

        Log.v("FAVORITES","vAI LACRAIA VAI LACRAIA!!");
//        action = SearchFragmentDirections.actionNavigationSearchToDetailsFragment(myModel.getAddress(),myModel.getPrice(),myModel.getCity(),myModel.getImgHouse());
        action = FavoritesFragmentDirections.actionNavigationFavoritesToDetailsFragment(myModel.getAddress(),myModel.getPrice(),myModel.getCity(),myModel.getImgHouse());
        navController.navigate(action);


    }
}