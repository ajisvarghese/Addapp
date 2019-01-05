package com.cas.hp.addapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {
    EditText fnum,snum,tnum,res;
    String getres,getFnum,getSnum,getTnum;
    Button b;
 int big;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        fnum=(EditText)findViewById(R.id.fn);
        snum=(EditText)findViewById(R.id.sn);
        tnum=(EditText)findViewById(R.id.tn);
        res=(EditText)findViewById(R.id.su);
        b=(Button)findViewById(R.id.big);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFnum=fnum.getText().toString();
                int fn=Integer.parseInt(getFnum);
                getSnum=snum.getText().toString();
                int sn=Integer.parseInt(getSnum);
                getTnum=tnum.getText().toString();
                int tn=Integer.parseInt(getTnum);
                if(fn>sn)
                {
                   big=fn;
                }
                else
                {
                    big=sn;
                }
                if(big>tn)
                {
                    big=big;
                }
                else
                {
                    big=tn;
                }
                getres=Integer.toString(big);
                res.setVisibility(View.VISIBLE);
                res.setText(getres);
            }
        });
    }
}
