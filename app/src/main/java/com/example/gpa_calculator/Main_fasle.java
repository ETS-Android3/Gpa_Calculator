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

public class Main_fasle extends AppCompatActivity {


    EditText c1_c,c1_g;
    EditText c2_c,c2_g;
    EditText c3_c,c3_g;
    EditText c4_c,c4_g;
    EditText c5_c,c5_g;

    EditText c6_c,c6_g;
    EditText c7_c,c7_g;
    EditText c8_c,c8_g;
    EditText c9_c,c9_g;
    EditText c10_c,c10_g;
    EditText c11_c,c11_g;
    EditText c12_c,c12_g;


    TextView fasle;

    Double c1_g_d,c1_c_d,c1_total;
    Double c2_g_d,c2_c_d,c2_total;
    Double c3_g_d,c3_c_d,c3_total;
    Double c4_g_d,c4_c_d,c4_total;
    Double c5_g_d,c5_c_d,c5_total;

    Double c6_g_d,c6_c_d,c6_total;
    Double c7_g_d,c7_c_d,c7_total;
    Double c8_g_d,c8_c_d,c8_total;
    Double c9_g_d,c9_c_d,c9_total;
    Double c10_g_d,c10_c_d,c10_total;
    Double c11_g_d,c11_c_d,c11_total;
    Double c12_g_d,c12_c_d,c12_total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fasle);

        c1_c = (EditText)findViewById(R.id.c1_c);
        c1_g = (EditText)findViewById(R.id.c1_g);

        c2_c = (EditText)findViewById(R.id.c2_c);
        c2_g = (EditText)findViewById(R.id.c2_g);

        c3_c = (EditText)findViewById(R.id.c3_c);
        c3_g = (EditText)findViewById(R.id.c3_g);

        c4_c = (EditText)findViewById(R.id.c4_c);
        c4_g = (EditText)findViewById(R.id.c4_g);

        c5_c = (EditText)findViewById(R.id.c5_c);
        c5_g = (EditText)findViewById(R.id.c5_g);

        c6_c = (EditText)findViewById(R.id.c6_c);
        c6_g = (EditText)findViewById(R.id.c6_g);

        c7_c = (EditText)findViewById(R.id.c7_c);
        c7_g = (EditText)findViewById(R.id.c7_g);

        c8_c = (EditText)findViewById(R.id.c8_c);
        c8_g = (EditText)findViewById(R.id.c8_g);

        c9_c = (EditText)findViewById(R.id.c9_c);
        c9_g = (EditText)findViewById(R.id.c9_g);

        c10_c = (EditText)findViewById(R.id.c10_c);
        c10_g = (EditText)findViewById(R.id.c10_g);

        c11_c = (EditText)findViewById(R.id.c11_c);
        c11_g = (EditText)findViewById(R.id.c11_g);

        c12_c = (EditText)findViewById(R.id.c12_c);
        c12_g = (EditText)findViewById(R.id.c12_g);

        fasle = (TextView)findViewById(R.id.fasle);


        ImageView img= (ImageView)findViewById(R.id.img);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });/// Listener end


    }







    public void calc(View view) {
        try {


            if (c1_g.length() > 0) {
                c1_g_d = Double.parseDouble(c1_g.getText().toString());
                c1_c_d = Double.parseDouble(c1_c.getText().toString());
                c1_total = c1_g_d * c1_c_d;
            } else {
                c1_total = 0.0;
                c1_c_d = 0.0;
            }

            if (c2_g.length() > 0) {
                c2_g_d = Double.parseDouble(c2_g.getText().toString());
                c2_c_d = Double.parseDouble(c2_c.getText().toString());
                c2_total = c2_c_d * c2_g_d;
            } else {
                c2_total = 0.0;
                c2_c_d = 0.0;
            }

            if (c3_g.length() > 0) {
                c3_g_d = Double.parseDouble(c3_g.getText().toString());
                c3_c_d = Double.parseDouble(c3_c.getText().toString());
                c3_total = c3_g_d * c3_c_d;
            } else {
                c3_total = 0.0;
                c3_c_d = 0.0;
            }

            if (c4_g.length() > 0) {
                c4_g_d = Double.parseDouble(c4_g.getText().toString());
                c4_c_d = Double.parseDouble(c4_c.getText().toString());
                c4_total = c4_g_d * c4_c_d;
            } else {
                c4_total = 0.0;
                c4_c_d = 0.0;
            }

            if (c5_g.length() > 0) {
                c5_g_d = Double.parseDouble(c5_g.getText().toString());
                c5_c_d = Double.parseDouble(c5_c.getText().toString());
                c5_total = c5_g_d * c5_c_d;
            } else {
                c5_total = 0.0;
                c5_c_d = 0.0;
            }


            if (c6_g.length() > 0) {
                c6_g_d = Double.parseDouble(c6_g.getText().toString());
                c6_c_d = Double.parseDouble(c6_c.getText().toString());
                c6_total = c6_g_d * c6_c_d;
            } else {
                c6_total = 0.0;
                c6_c_d = 0.0;
            }
            if (c7_g.length() > 0) {
                c7_g_d = Double.parseDouble(c7_g.getText().toString());
                c7_c_d = Double.parseDouble(c7_c.getText().toString());
                c7_total = c7_g_d * c7_c_d;
            } else {
                c7_total = 0.0;
                c7_c_d = 0.0;
            }
            if (c8_g.length() > 0) {
                c8_g_d = Double.parseDouble(c8_g.getText().toString());
                c8_c_d = Double.parseDouble(c8_c.getText().toString());
                c8_total = c8_g_d * c8_c_d;
            } else {
                c8_total = 0.0;
                c8_c_d = 0.0;
            }
            if (c9_g.length() > 0) {
                c9_g_d = Double.parseDouble(c9_g.getText().toString());
                c9_c_d = Double.parseDouble(c9_c.getText().toString());
                c9_total = c9_g_d * c9_c_d;
            } else {
                c9_total = 0.0;
                c9_c_d = 0.0;
            }
            if (c10_g.length() > 0) {
                c10_g_d = Double.parseDouble(c10_g.getText().toString());
                c10_c_d = Double.parseDouble(c10_c.getText().toString());
                c10_total = c10_g_d * c10_c_d;
            } else {
                c10_total = 0.0;
                c10_c_d = 0.0;
            }


            if (c11_g.length() > 0) {
                c11_g_d = Double.parseDouble(c11_g.getText().toString());
                c11_c_d = Double.parseDouble(c11_c.getText().toString());
                c11_total = c11_g_d * c11_c_d;
            } else {
                c11_total = 0.0;
                c11_c_d = 0.0;
            }
            if (c12_g.length() > 0) {
                c12_g_d = Double.parseDouble(c12_g.getText().toString());
                c12_c_d = Double.parseDouble(c12_c.getText().toString());
                c12_total = c12_g_d * c12_c_d;
            } else {
                c12_total = 0.0;
                c12_c_d = 0.0;
            }

            // find sum of credits
            Double sumOfCredits = c1_c_d + c2_c_d + c3_c_d + c4_c_d + c5_c_d + c6_c_d + c7_c_d + c8_c_d + c9_c_d + c10_c_d+c11_c_d+c12_c_d;
            // divided
            Double finaal = (c1_total + c2_total + c3_total + c4_total + c5_total + c6_total + c7_total + c8_total + c9_total + c10_total+c11_total+c12_total) / sumOfCredits;
            DecimalFormat df = new DecimalFormat("#.##");
            String final_format = df.format(finaal);

            fasle.setText("معدلك الفصلي" + "\n" + final_format + "%");

            if (Double.isNaN(finaal)) {

                Toast.makeText(getApplicationContext(), "يرجي ادخل معطيات صحيحة", Toast.LENGTH_SHORT).show();
                fasle.setText("");

            }




//            fasle.setText("معدلك الفصلي" + "\n" + final_format + "%");

        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "حدث خطاء", Toast.LENGTH_SHORT).show();
        }

    }//calc void end
    public void clear(View view) {
        c1_g.setText("");
        c1_c.setText("");

        c2_g.setText("");
        c2_c.setText("");

        c3_g.setText("");
        c3_c.setText("");

        c4_g.setText("");
        c4_c.setText("");

        c5_g.setText("");
        c5_c.setText("");


        c6_g.setText("");
        c6_c.setText("");

        c7_g.setText("");
        c7_c.setText("");

        c8_g.setText("");
        c8_c.setText("");

        c9_g.setText("");
        c9_c.setText("");

        c10_g.setText("");
        c10_c.setText("");


        c11_g.setText("");
        c11_c.setText("");


        c12_g.setText("");
        c12_c.setText("");

        fasle.setText("");
    }


}
