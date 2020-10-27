package com.example.bst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    final ArrayList<Integer> node_arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputNumber = (EditText)findViewById(R.id.inputNumber);
        final Button pushButton = (Button)findViewById(R.id.pushNumber);
        final Button deleteButton = (Button)findViewById(R.id.deleteNumber);
        inputNumber.setInputType(0);
        Integer[] Rid_button = {
            R.id.node0, R.id.node1, R.id.node2, R.id.node3, R.id.node4,
            R.id.node5, R.id.node6, R.id.node7, R.id.node8, R.id.node9,
            R.id.node10, R.id.node11, R.id.node12, R.id.node13, R.id.node14,
            R.id.node15, R.id.node16, R.id.node17, R.id.node18, R.id.node19
        };
        final Button node[] = new Button[20];
        for(int i = 0; i < 20; i++){
            node[i] = (Button)findViewById(Rid_button[i]);
        }

        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                node_arr.add(Integer.parseInt(inputNumber.getText().toString()));
                Collections.sort(node_arr);
                // 입력


                // 리스트 트리에 맞게 배열에 넣기

                for (int i = 0; i < node_arr.size(); i++) {
                    node[i].setText(String.valueOf(node_arr.get(i)));
                }
                // 트리에 넣기
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < node_arr.size(); i++) {
                    if (node_arr.get(i).equals(Integer.parseInt(inputNumber.getText().toString()))) {
                        node_arr.remove(i);
                    }
                }
                Collections.sort(node_arr);
                // 입력 값과 같은 노드를 삭제


                // 리스트 트리에 맞게 배열에 넣기

                for (int i = 0; i < node_arr.size(); i++) {
                    node[i].setText(String.valueOf(node_arr.get(i)));
                    if(i==node_arr.size()-1)
                        node[i+1].setText("");
                }
                // 트리에 넣기

                if(node_arr.size() == 0)
                    node[0].setText("");
                // 0번째 예외 처리
            }
        });
    }
}