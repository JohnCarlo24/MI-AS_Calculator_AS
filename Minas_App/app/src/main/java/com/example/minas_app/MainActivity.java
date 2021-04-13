package com.example.minas_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView Screen;
private Button ac,power,back,div,one,two,three,four,five,six,seven,eight,nine,add,mul,sub,point,ans,eq,zero;
private String input, Answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Screen=findViewById(R.id.screen);
        ac=findViewById(R.id.ac);
        power=findViewById(R.id.power);
        back=findViewById(R.id.back);
        div=findViewById(R.id.div);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        eq=findViewById(R.id.eq);
        point=findViewById(R.id.point);
        ans=findViewById(R.id.ans);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);



    }
}