package com.example.siva.bmicalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     double bmi;
     double height1;
     String message;
     public void display(String message)
     {
         TextView text = (TextView) findViewById(R.id.report_text_view);
         text.setText(message);
     }
     public void displayMessage(View view)
     {
         EditText nameText = (EditText) findViewById(R.id.name_text_view);
         String name = nameText.getText().toString();
         EditText ageText = (EditText) findViewById(R.id.age_text_view);
         int age = Integer.parseInt(ageText.getText().toString());
         EditText weightText = (EditText) findViewById(R.id.weight_text_view);
         int weight = Integer.parseInt(weightText.getText().toString());
         EditText heightText = (EditText) findViewById(R.id.height_text_view);
         int height = Integer.parseInt(heightText.getText().toString());
         height1 = (height * 0.01);
         bmi = (weight/(height1*height1));
         bmi = Math.round(bmi);
         if(bmi<18)
         {
             message = "You are underweight";
         }
         else if(bmi>=18 && bmi<24)
         {
             message = "You are normal";
         }
         else if(bmi>=24 && bmi<30)
         {
             message = "You are overweight";
         }
         else
         {
             message = "You are obese";
         }
         String msg = "Name : "+name+"\nAge "+age+"\nWeight :"+weight+"\nHeight :"+height+"\nYour BMI Value : "+bmi+"\n"+message;
         display(msg);
     }
}
