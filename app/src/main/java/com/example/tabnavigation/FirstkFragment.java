package com.example.tabnavigation;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstkFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private ArrayList<ItemData> itemValues;
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    public FirstkFragment() {
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
        View view=inflater.inflate(R.layout.fragment_firstk, container, false);
        recyclerView=view.findViewById(R.id.recyclerView);

        itemValues=new ArrayList<>();
        for (int i=1;i<=10;i++){
            ItemData item=new ItemData();
            item.itemTitle="Title Data - "+i;
            item.itemSubTitle="Subtitle Data - "+i;
            itemValues.add(item);
        }
        itemAdapter=new ItemAdapter(getActivity(), itemValues);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemAdapter);

        return view;
    }
    private void addData(){
        ItemData item=new ItemData();
        item.itemTitle="Title Data - Baru";
        item.itemSubTitle="Subtitle Data - Baru";
        itemValues.add(item);
        itemAdapter.notifyDataSetChanged();
    }
}