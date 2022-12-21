package com.example.mvvmrecyclerviewcrud;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.example.mvvmrecyclerviewcrud.ViewModel.MainActivityViewModel;


public class MainActivity extends AppCompatActivity {

    //MainActivityViewModel mainActivityViewModel = MainActivityViewModel.getInstance();
    MainActivityViewModel mainActivityViewModel;
    RecyclerView recyclerView;
    Button button;
    public static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        recyclerView = findViewById(R.id.recyclerview);

        mainActivityViewModel  =  new ViewModelProvider(this).get(MainActivityViewModel.class);
        //mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        mainActivityViewModel = ViewModelProviders.of

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                mainActivityViewModel.setStatus_intent("add_data");
                Log.v(TAG,"mainActivityViewModel.getStatus_intent() "+mainActivityViewModel.getStatus_intent());
                intent.putExtra("add", mainActivityViewModel.getStatus_intent());
                startActivity(intent);
            }
        });

    }
}
