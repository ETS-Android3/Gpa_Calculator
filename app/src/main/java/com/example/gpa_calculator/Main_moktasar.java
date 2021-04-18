package com.example.gpa_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Main_moktasar extends AppCompatActivity {

    EditText tracome_g_et,tracome_c_et,faslee_g_et,fasel_c_et;

    TextView new_tracome_tv,new_c_tv;

//    Double tracomeee,tracomeee_c,fasleee,fasleee_c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_moktasar);

        tracome_g_et = (EditText)findViewById(R.id.tracome_g_et);
        tracome_c_et = (EditText)findViewById(R.id.tracome_c_et);
        faslee_g_et = (EditText)findViewById(R.id.faslee_g_et);
        fasel_c_et= (EditText)findViewById(R.id.fasel_c_et);

        new_tracome_tv = (TextView) findViewById(R.id.new_tracome_tv);
        new_c_tv = (TextView) findViewById(R.id.new_c_tv);

        ImageView img= (ImageView)findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });/// Listener end
    }

    public void calculate(View view) {

        try {
            Double tracome_g_d = Double.parseDouble(tracome_g_et.getText().toString());
            Double tracome_c_d = Double.parseDouble(tracome_c_et.getText().toString());
            Double fasle_g_d = Double.parseDouble(faslee_g_et.getText().toString());
            Double fasle_c_d = Double.parseDouble(fasel_c_et.getText().toString());

            Double sum_of_all_c = tracome_c_d+fasle_c_d;
            Double sum_of_grades = (tracome_g_d*tracome_c_d)+(fasle_g_d*fasle_c_d);
            Double new_tracome5  = sum_of_grades/sum_of_all_c;

            DecimalFormat df3 = new DecimalFormat("#.##");
            String new_tracome_final = df3.format(new_tracome5);

            new_tracome_tv.setText("معدلك التراكمي الجديد"+"%"+new_tracome_final);
            new_c_tv.setText("ساعاتك التراكمية الجديدة"+ "\n" +sum_of_all_c.intValue());


        }catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "الرجاء ملء جميع الحقول", Toast.LENGTH_SHORT).show();
        }
    }///void calculate end

    public void delete(View view) {
        tracome_g_et.setText("");
        tracome_c_et.setText("");
        faslee_g_et.setText("");
        fasel_c_et.setText("");
        new_tracome_tv.setText("");
        new_c_tv.setText("");
    }
}