package com.example.mvvmrecyclerviewcrud.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmrecyclerviewcrud.Model.People;

import java.util.ArrayList;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<ArrayList<People>> mUsers;
    private static MainActivityViewModel instance;

    private String status_intent;


    public static MainActivityViewModel getInstance(){
        if(instance == null){
            synchronized (MainActivityViewModel.class){
                instance = new MainActivityViewModel();
            }
        }
        return instance;
    }



    public String getStatus_intent() {
        return status_intent;
    }

    public void setStatus_intent(String status_intent) {
        this.status_intent = status_intent;
    }
}
