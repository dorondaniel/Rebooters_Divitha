package com.clubman.rebooters_divitha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText name,dept;
    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit_btn = findViewById(R.id.submit_btn);
        name = findViewById(R.id.name_text);
        dept = findViewById(R.id.dept_text);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable stu_name = name.getText();
                Editable stu_dept = dept.getText();
                if(!stu_name.equals() == "" && !stu_dept.equals() == ""){
                    Toast output = Toast.makeText(getApplicationContext(),"Welcome "+stu_name+" From "+stu_dept,Toast.LENGTH_LONG);
                    output.show(); 
                }
                else{
                    Toast error = Toast.makeText(getApplicationContext(),"Enter Valid Data",Toast.LENGTH_LONG);
                    error.show();
                }
            }
        });
    }
}
