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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView)findViewById(R.id.img);
        img.setImageDrawable(null);

    }

    public void fasle(View view) {

        Intent intent = new Intent(this,Main_fasle.class);
        startActivity(intent);
    }

    public void tracome(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void moktasar(View view) {
        Intent intent = new Intent(this,Main_moktasar.class);
        startActivity(intent);
    }


}



















//package com.example.gpa_calculator;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.text.DecimalFormat;
//
//public class MainActivity extends AppCompatActivity {
//
//    EditText old_gpa,old_c;
//    EditText c1_c,c1_g;
//    EditText c2_c,c2_g;
//    EditText c3_c,c3_g;
//    EditText c4_c,c4_g;
//    EditText c5_c,c5_g;
//
//    EditText c6_c,c6_g;
//    EditText c7_c,c7_g;
//    EditText c8_c,c8_g;
//    EditText c9_c,c9_g;
//    EditText c10_c,c10_g;
//
//
//    TextView fasle,tracome;
//
//    Double c1_g_d,c1_c_d,c1_total;
//    Double c2_g_d,c2_c_d,c2_total;
//    Double c3_g_d,c3_c_d,c3_total;
//    Double c4_g_d,c4_c_d,c4_total;
//    Double c5_g_d,c5_c_d,c5_total;
//
//    Double c6_g_d,c6_c_d,c6_total;
//    Double c7_g_d,c7_c_d,c7_total;
//    Double c8_g_d,c8_c_d,c8_total;
//    Double c9_g_d,c9_c_d,c9_total;
//    Double c10_g_d,c10_c_d,c10_total;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        old_gpa = (EditText)findViewById(R.id.old_gpa);
//        old_c = (EditText)findViewById(R.id.old_c);
//
//        c1_c = (EditText)findViewById(R.id.c1_c);
//        c1_g = (EditText)findViewById(R.id.c1_g);
//
//        c2_c = (EditText)findViewById(R.id.c2_c);
//        c2_g = (EditText)findViewById(R.id.c2_g);
//
//        c3_c = (EditText)findViewById(R.id.c3_c);
//        c3_g = (EditText)findViewById(R.id.c3_g);
//
//        c4_c = (EditText)findViewById(R.id.c4_c);
//        c4_g = (EditText)findViewById(R.id.c4_g);
//
//        c5_c = (EditText)findViewById(R.id.c5_c);
//        c5_g = (EditText)findViewById(R.id.c5_g);
//
//        c6_c = (EditText)findViewById(R.id.c6_c);
//        c6_g = (EditText)findViewById(R.id.c6_g);
//
//        c7_c = (EditText)findViewById(R.id.c7_c);
//        c7_g = (EditText)findViewById(R.id.c7_g);
//
//        c8_c = (EditText)findViewById(R.id.c8_c);
//        c8_g = (EditText)findViewById(R.id.c8_g);
//
//        c9_c = (EditText)findViewById(R.id.c9_c);
//        c9_g = (EditText)findViewById(R.id.c9_g);
//
//        c10_c = (EditText)findViewById(R.id.c10_c);
//        c10_g = (EditText)findViewById(R.id.c10_g);
//
//        fasle = (TextView)findViewById(R.id.fasle);
//        tracome = (TextView)findViewById(R.id.tracome);
//
//    }
//
//    public void calc(View view) {
//        try {
//
//
//            if (c1_g.length() > 0) {
//                c1_g_d = Double.parseDouble(c1_g.getText().toString());
//                c1_c_d = Double.parseDouble(c1_c.getText().toString());
//                c1_total = c1_g_d * c1_c_d;
//            } else {
//                c1_total = 0.0;
//                c1_c_d = 0.0;
//            }
//
//            if (c2_g.length() > 0) {
//                c2_g_d = Double.parseDouble(c2_g.getText().toString());
//                c2_c_d = Double.parseDouble(c2_c.getText().toString());
//                c2_total = c2_c_d * c2_g_d;
//            } else {
//                c2_total = 0.0;
//                c2_c_d = 0.0;
//            }
//
//            if (c3_g.length() > 0) {
//                c3_g_d = Double.parseDouble(c3_g.getText().toString());
//                c3_c_d = Double.parseDouble(c3_c.getText().toString());
//                c3_total = c3_g_d * c3_c_d;
//            } else {
//                c3_total = 0.0;
//                c3_c_d = 0.0;
//            }
//
//            if (c4_g.length() > 0) {
//                c4_g_d = Double.parseDouble(c4_g.getText().toString());
//                c4_c_d = Double.parseDouble(c4_c.getText().toString());
//                c4_total = c4_g_d * c4_c_d;
//            } else {
//                c4_total = 0.0;
//                c4_c_d = 0.0;
//            }
//
//            if (c5_g.length() > 0) {
//                c5_g_d = Double.parseDouble(c5_g.getText().toString());
//                c5_c_d = Double.parseDouble(c5_c.getText().toString());
//                c5_total = c5_g_d * c5_c_d;
//            } else {
//                c5_total = 0.0;
//                c5_c_d = 0.0;
//            }
//
//
//            if (c6_g.length() > 0) {
//                c6_g_d = Double.parseDouble(c6_g.getText().toString());
//                c6_c_d = Double.parseDouble(c6_c.getText().toString());
//                c6_total = c6_g_d * c6_c_d;
//            } else {
//                c6_total = 0.0;
//                c6_c_d = 0.0;
//            }
//            if (c7_g.length() > 0) {
//                c7_g_d = Double.parseDouble(c7_g.getText().toString());
//                c7_c_d = Double.parseDouble(c7_c.getText().toString());
//                c7_total = c7_g_d * c7_c_d;
//            } else {
//                c7_total = 0.0;
//                c7_c_d = 0.0;
//            }
//            if (c8_g.length() > 0) {
//                c8_g_d = Double.parseDouble(c8_g.getText().toString());
//                c8_c_d = Double.parseDouble(c8_c.getText().toString());
//                c8_total = c8_g_d * c8_c_d;
//            } else {
//                c8_total = 0.0;
//                c8_c_d = 0.0;
//            }
//            if (c9_g.length() > 0) {
//                c9_g_d = Double.parseDouble(c9_g.getText().toString());
//                c9_c_d = Double.parseDouble(c9_c.getText().toString());
//                c9_total = c9_g_d * c9_c_d;
//            } else {
//                c9_total = 0.0;
//                c9_c_d = 0.0;
//            }
//            if (c10_g.length() > 0) {
//                c10_g_d = Double.parseDouble(c10_g.getText().toString());
//                c10_c_d = Double.parseDouble(c10_c.getText().toString());
//                c10_total = c10_g_d * c10_c_d;
//            } else {
//                c10_total = 0.0;
//                c10_c_d = 0.0;
//            }
//            // find sum of credits
//            Double sumOfCredits = c1_c_d + c2_c_d + c3_c_d + c4_c_d + c5_c_d + c6_c_d + c7_c_d + c8_c_d + c9_c_d + c10_c_d;
//            // divided
//            Double finaal = (c1_total + c2_total + c3_total + c4_total + c5_total + c6_total + c7_total + c8_total + c9_total + c10_total) / sumOfCredits;
//            DecimalFormat df = new DecimalFormat("#.##");
//            String final_format = df.format(finaal);
//
//            //cumloative
//            Double old_gpa_d = Double.parseDouble(old_gpa.getText().toString());
//            Double old_c_d = Double.parseDouble(old_c.getText().toString());
//            Double allCredits = old_c_d + sumOfCredits;
//            Double cum = ((old_c_d * old_gpa_d) + (finaal * sumOfCredits)) / allCredits;
//
//            DecimalFormat df2 = new DecimalFormat("#.##");
//            String cum_format = df2.format(cum);
//
//            tracome.setText("التراكمي الجديد" + "\n" + cum_format + "%");
//            fasle.setText("معدلك الفصلي" + "\n" + final_format + "%");
//
//        } catch (NumberFormatException e) {
//            Toast.makeText(getApplicationContext(), "الرجاء قم بادخال معدلك التراكمي السابق بالأضافة الى الساعات التراكمية السابقة", Toast.LENGTH_SHORT).show();
//        }
//
//    }//calc void end
//
//    public void clear(View view) {
//        old_gpa.setText("");
//        old_c.setText("");
//
//        c1_g.setText("");
//        c1_c.setText("");
//
//        c2_g.setText("");
//        c2_c.setText("");
//
//        c3_g.setText("");
//        c3_c.setText("");
//
//        c4_g.setText("");
//        c4_c.setText("");
//
//        c5_g.setText("");
//        c5_c.setText("");
//
//
//        c6_g.setText("");
//        c6_c.setText("");
//
//        c7_g.setText("");
//        c7_c.setText("");
//
//        c8_g.setText("");
//        c8_c.setText("");
//
//        c9_g.setText("");
//        c9_c.setText("");
//
//        c10_g.setText("");
//        c10_c.setText("");
//
//        fasle.setText("");
//        tracome.setText("");
//    }
//}
//
//
//
//
//
////            re.setText(final_format+" %");
////            re.setText(final_format + " %" + cum_format + " %");
//
////    public void calc(View view) {
////
////        try {
////
////
////            // Convert all Strings to Doubles
////            Double c1_c_d = Double.parseDouble(c1_c.getText().toString());
////            Double c2_c_d = Double.parseDouble(c2_c.getText().toString());
////            Double c3_c_d = Double.parseDouble(c3_c.getText().toString());
////
////            Double c1_g_d = Double.parseDouble(c1_g.getText().toString());
////            Double c2_g_d = Double.parseDouble(c2_g.getText().toString());
////            Double c3_g_d = Double.parseDouble(c2_g.getText().toString());
////
////
////            // find sum of credits
////            Double sumoofcredits = c1_c_d + c2_c_d + c3_c_d;
////
////            // mulitpliy every class with his credits
////            Double c1 = c1_c_d * c1_g_d;
////            Double c2 = c2_c_d * c2_g_d;
////            Double c3 = c3_c_d * c3_g_d;
////
////            //sum of clases values
////            Double sum = c1 + c2 + c3;
////
////            // divided
////            Double finaal = sum / sumoofcredits;
//////=====================================================================
////            //cumloative
////            Double old_gpa_d = Double.parseDouble(old_gpa.getText().toString());
////            Double old_c_d = Double.parseDouble(old_c.getText().toString());
////            Double allcried = old_c_d + sumoofcredits;
////            Double cum = ((old_c_d * old_gpa_d) + (finaal * sumoofcredits)) / allcried;
////            re.setText(finaal + " %" + cum + "%");
////
////        } catch (NumberFormatException e) {
////            e.printStackTrace();
////        }
////
////    }//void end
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    public void calc(View view) {
////
//////        String old_gpa_string = old_gpa.getText().toString();
//////        Double old_gpa_d =  Double.parseDouble(old_gpa_string);
//////        String old_c_string = old_c.getText().toString();
//////        Double old_c_d = Double.parseDouble(old_c_string);
//////
////        //        c2_c.setText((Double.parseDouble(c2_g.getText().toString())*3)+"");
////
////
////        Double old_gpa_d =  Double.parseDouble(old_gpa.getText().toString());
////        Double old_c_d =  Double.parseDouble(old_c.getText().toString());
////        Double total = (old_gpa_d*old_c_d);
////
////
////        Double firstM =(Double.parseDouble(c1_g.getText().toString()))*(Double.parseDouble(c1_c.getText().toString()));
////        Double secondM =(Double.parseDouble(c2_g.getText().toString()))*(Double.parseDouble(c2_c.getText().toString()));
////        Double total2 = firstM+secondM;
////        Double cs=(Double.parseDouble(c1_c.getText().toString()))+(Double.parseDouble(c2_c.getText().toString()));
////        Double finaal_fasle =(total2)/cs;
////
////        Double sumc = Double.parseDouble(c1_c.getText().toString())+Double.parseDouble(c2_c.getText().toString());
////        Double total_c =sumc+old_c_d;
////
////
////
////        Double comulative = total+(finaal_fasle*(sumc))/total_c;
////
////
////        re.setText(finaal_fasle+" %"+comulative+" %");
////
////    }