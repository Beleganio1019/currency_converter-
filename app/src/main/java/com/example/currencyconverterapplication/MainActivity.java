package com.example.currencyconverterapplication;

import static com.example.currencyconverterapplication.R.string.jpy_1_52pkr;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity
        ;

public class MainActivity extends AppCompatActivity {
//Create objects for all the widgets
    TextView tv_to,tv_from,tv_result;
    EditText edt_amount;
    Button btnusd;
    Button btngbp;
    Button btnaus;
    Button btncan;
    Button btnuero;
    Button btnjpy;
     String amount;
     int pkr;
    double result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       init();
       Clicklistener();


    }
    //Initiative all the widgets and do view binding

    public void init(){
        tv_to=findViewById(R.id.tv_to);
        tv_from=findViewById(R.id.tv_from);
        tv_result=findViewById(R.id.tv_result);
        edt_amount = findViewById(R.id.edt_amount);
        btnusd=findViewById(R.id.btnusd);
        btngbp=findViewById(R.id.btngbp);
        btnaus=findViewById(R.id.btnaus);
        btncan=findViewById(R.id.btncan);
        btnuero=findViewById(R.id.btnuero);
        btnjpy=findViewById(R.id.btnjpy);
        }

    //Now We will create click listeners for each button
    public void Clicklistener(){
        btnusd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here were get user input into this variable
                amount=edt_amount.getText().toString();
                pkr=178;
    //Integer.parse used to convert string value integer for calculation purpose
                result=Integer.parseInt(amount)*(pkr);

    //again converted integer value into string because android system works with strings
            tv_result.setText(String.valueOf(result));
            tv_to.setText(R.string.USD);
            tv_from.setText(R.string.US_178pkr);

            }
        });
btngbp.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //here were get user input into this variable
        amount=edt_amount.getText().toString();
        pkr=178;
        //Integer.parse used to convert string value integer for calculation purpose
        result=Integer.parseInt(amount)*(pkr);
        //again converted integer value into string because android system works with strings
        tv_result.setText(String.valueOf(result));
        tv_to.setText(R.string.GBP);
        tv_from.setText(R.string.GBP_239pkr);
    }
});
btnaus.setOnClickListener(new View.OnClickListener() {
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        //here were get user input into this variable
        amount=edt_amount.getText().toString();
        pkr=178;
        //Integer.parse used to convert string value integer for calculation purpose
        result=Integer.parseInt(amount)*(pkr);
        //again converted integer value into string because android system works with strings
        tv_result.setText(String.valueOf(result));
        tv_to.setText("AUS$");
        tv_from.setText("GBP = 127Pkr");
    }
});
btncan.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //here were get user input into this variable
        amount=edt_amount.getText().toString();
        pkr=139;
        //Integer.parse used to convert string value integer for calculation purpose
        result=Integer.parseInt(amount)*(pkr);
        //again converted integer value into string because android system works with strings
        tv_result.setText(String.valueOf(result));
        tv_to.setText(R.string.CAN );
        tv_from.setText(R.string.CAN_139pkr );


    }
});
        btnuero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here were get user input into this variable
                amount=edt_amount.getText().toString();
                pkr=199;
                //Integer.parse used to convert string value integer for calculation purpose
                result=Integer.parseInt(amount)*(pkr);
                //again converted integer value into string because android system works with strings
                tv_result.setText(String.valueOf(result));
                tv_to.setText("EURO");
                tv_from.setText("EURO = 199Pkr");


            }

});
        btnjpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = edt_amount.getText().toString();
                //here we used double data type instead  of int bcz the value is in float form
                double pkrr = 1.52;
                double result = Double.parseDouble(amount) * (pkrr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText(jpy_1_52pkr);

            }

        }
    }
}