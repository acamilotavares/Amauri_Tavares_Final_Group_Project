package com.example.amauri_tavares_final_group_project.ui.search;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.amauri_tavares_final_group_project.R;
import com.example.amauri_tavares_final_group_project.databinding.FragmentSearchBinding;
import com.example.amauri_tavares_final_group_project.ui.SelectListener;
import com.example.amauri_tavares_final_group_project.ui.home.HomeFragmentDirections;
import com.example.amauri_tavares_final_group_project.ui.home.HomeViewModel;

import java.util.ArrayList;
import java.util.List;


public class SearchFragment extends Fragment implements SelectListener {

    private FragmentSearchBinding binding;
    private List<HouseSearchModel> myModelList;
    private RecyclerView recyclerView;
    SearchView searchView;
    CustomAdapter customAdapter;
    NavController navController;
    NavDirections action;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);
        searchView = view.findViewById(R.id.search_view);
        displayItems(view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText);
                return true;
            }
        });
    }
    private void filter(String newText) {
        List<HouseSearchModel> filteredList  = new ArrayList<>();
        for (HouseSearchModel item: myModelList){
            if(item.getCity().toLowerCase().contains(newText.toLowerCase())){
                filteredList.add(item);
            }
            customAdapter.filterList(filteredList);
        }
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
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[1],"1000000"));
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[2],"1000000"));
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[3],"1000000"));
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[1],"1000000"));
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[0],"1000000"));
        myModelList.add(new HouseSearchModel("Waterloo","3 rooms"," 108 University Ave, Waterloo, ON N2J 2W2",houseImages[1],"1000000"));
        customAdapter = new CustomAdapter(getContext(), myModelList, this);
        recyclerView.setAdapter(customAdapter);
    }

    @Override
    public void onItemClicked(HouseSearchModel myModel) {

       // action = HomeFragmentDirections.actionNavigationHomeToNavigationSearch();
      //  navController.navigate(action);

    }
}