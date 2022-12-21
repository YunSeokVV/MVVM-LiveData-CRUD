package com.example.mvvmrecyclerviewcrud;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmrecyclerviewcrud.ViewModel.MainActivityViewModel;

public class Main2Activity extends AppCompatActivity {
    MainActivityViewModel mainActivityViewModel;
    public static String TAG = "Main2Activity";
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mainActivityViewModel  =  new ViewModelProvider(this).get(MainActivityViewModel.class);
        Intent intent =new Intent();
        intent.getStringExtra("add");
        Log.v(TAG,"mainActivityViewModel.getStatus_intent() "+mainActivityViewModel.getStatus_intent());
        btn = findViewById(R.id.btn);

        btn.setText(intent.getStringExtra(mainActivityViewModel.getStatus_intent()));

    }
}
