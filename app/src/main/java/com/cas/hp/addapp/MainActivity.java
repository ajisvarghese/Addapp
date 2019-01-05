package com.cas.hp.addapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstNumber,secondNumber,result;
    String getres,getFnum,getSnum;
    Button b,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber=(EditText)findViewById(R.id.an);
        secondNumber=(EditText)findViewById(R.id.bn);
        result=(EditText)findViewById(R.id.re);

             b=(Button)findViewById(R.id.addn);
             next=(Button)findViewById(R.id.ne);

             next.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Toast.makeText(getApplicationContext(), "testing Successfull",Toast.LENGTH_SHORT).show();
                     Intent intent=new Intent(getApplicationContext(),WelcomeActivity.class);
                     startActivity(intent);
                 }
             });


             b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             getFnum=firstNumber.getText().toString();
             int fn=Integer.parseInt(getFnum);
             getSnum=secondNumber.getText().toString();
             int sn=Integer.parseInt(getSnum);
             int r=(fn+sn);
             getres=Integer.toString(r) ;
             result.setVisibility(View.VISIBLE);
             result.setText(getres);

         }
     });

    }
}
