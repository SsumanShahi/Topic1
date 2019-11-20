package com.suman.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etfirst, etsecond;
    RadioButton rdadd, rdsubtract, rdmult, rddiv;
    Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bindings
        etfirst=findViewById(R.id.etfirst);
        etsecond=findViewById(R.id.etsecond);
        rdadd=findViewById(R.id.rdadd);
        rdsubtract=findViewById(R.id.rdsubtract);
        rdmult=findViewById(R.id.rdmult);
        rddiv=findViewById(R.id.rddiv);
        btnCal=findViewById(R.id.btncal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etfirst.getText())){
                    etfirst.setError("Enter number");
                    etfirst.requestFocus();
                    return;
                }
                else if (TextUtils.isEmpty(etsecond.getText()))
                {
                    etsecond.setError("Enter number");
                    etsecond.requestFocus();
                    return;
                }

                int first, second, result;
                first=Integer.parseInt(etfirst.getText().toString());
                second= Integer.parseInt((etsecond.getText().toString()));

                if(rdadd.isChecked()){
                    result=first+second;
                }
                else if(rdsubtract.isChecked()){
                    result=first-second;
                }
                else if(rdmult.isChecked())
                {
                    result=first*second;
                }
                else
                {
                    result=first/second;
                }

                Toast.makeText(MainActivity.this, "Result is" + result, Toast.LENGTH_LONG).show();
            }
        });
    }
}
