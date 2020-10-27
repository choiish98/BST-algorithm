package com.example.bst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputNumber = (EditText)findViewById(R.id.inputNumber);
        final Button pushButton = (Button)findViewById(R.id.pushNumber);
        final Button deleteButton = (Button)findViewById(R.id.deleteNumber);

        final Button root = (Button)findViewById(R.id.root);

        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                root.setText(inputNumber.getText());
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                root.setText("");
            }
        });
    }
}