package com.android.lab3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    TextView tvresult;
    EditText etfirst, etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        etfirst = (EditText) findViewById(R.id.etFirstNumber);
        etsecond = (EditText) findViewById(R.id.etSecondNumber);
        tvresult = (TextView) findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
                                      public void onClick(View v) {
                                          String num1 = etfirst.getText().toString();
                                          String num2 = etsecond.getText().toString();
                                          //int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                                          tvresult.setText(String.valueOf(sum(num1, num2)));
                                      }
                                  }
        );//end
    }


    public int sum(String first, String second){
        int addition = Integer.parseInt(first) + Integer.parseInt(second);
        return addition;
    }

}
