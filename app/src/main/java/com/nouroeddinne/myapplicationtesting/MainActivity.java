package com.nouroeddinne.myapplicationtesting;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4;
    EditText editText1,editText2;
    TextView textView;
    static int result = 0;
    int num1 = 0;
    int num2 = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_sum);
        button2 = findViewById(R.id.button_mins);
        button3 = findViewById(R.id.button_div);
        button4 = findViewById(R.id.button_mult);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView = findViewById(R.id.textView);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Integer.parseInt(editText1.getText().toString());
                num2= Integer.parseInt(editText2.getText().toString());
                textView.setText("The Result : "+sum(num1,num2));
                editText1.setText("");
                editText2.setText("");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Integer.parseInt(editText1.getText().toString());
                num2= Integer.parseInt(editText2.getText().toString());
                textView.setText("The Result : "+mins(num1,num2));
                editText1.setText("");
                editText2.setText("");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Integer.parseInt(editText1.getText().toString());
                num2= Integer.parseInt(editText2.getText().toString());
                result=+num1/num2;
                textView.setText("The Result : "+result);
                editText1.setText("");
                editText2.setText("");

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Integer.parseInt(editText1.getText().toString());
                num2= Integer.parseInt(editText2.getText().toString());
                textView.setText("The Result : "+mult(num1,num2));
                editText1.setText("");
                editText2.setText("");

            }
        });


    }




    public static String sum(int n1,int n2){
        result=+n1+n2;
        return String.valueOf(result);
    }

    public static String mins(int n1,int n2){
        result=+n1-n2;
        return String.valueOf(result);
    }

    public static String mult(int n1,int n2){
        result=+n1*n2;
        return String.valueOf(result);
    }

    public static String div(int n1,int n2){
        result=+n1-n2;
        return String.valueOf(result);
    }

}