package com.example.validaction;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText address, email, uname, password, number, contectnumber;
    Button submit;

    String addValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        address = findViewById(R.id.address);
        contectnumber=findViewById(R.id.number);
        email = findViewById(R.id.email);
        uname = findViewById(R.id.uname);
        password = findViewById(R.id.password);
        number = findViewById(R.id.number);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValidatForm();
                addressvalidation();
                userdata();
                passworddata();
                contectdata();

            }
        });
    }

    void ValidatForm() {

        if (!email.getText().toString().trim().equals("")) {

            if (email.getText().toString().contains("@")) {

                Toast.makeText(this, "Sucess", Toast.LENGTH_SHORT).show();
            } else {
                email.setError("Not Valid Email");
            }

        } else {
            email.setError("Not Input");
        }

    }

    void  addressvalidation(){
        if (!address.getText().toString().trim().equals(""))
        {
            if (address.getText().toString().contains("360004"))
            {
                Toast.makeText(this, "Address Done", Toast.LENGTH_SHORT).show();
            }
            else
            {
                address.setError(" have no Pincode");
            }
        }
        else
        {
            address.setError("No have Address");
        }

    }
    void passworddata(){

            if(!password.getText().toString().trim().equals(""))
            {
                if(password.getText().toString().contains("12")){
                    Toast.makeText(this, "Great", Toast.LENGTH_SHORT).show();
                }
                else {
                    password.setError("Please Check Your Password");
                }
            }
            else
            {
                password.setError("I Have No Data");
            }
    }
    void  contectdata(){
        if (!contectnumber.getText().toString().trim().equals(""))
        {
             if (contectnumber.getText().toString().contains("91"))
             {
                 Toast.makeText(this, "Submison Is Completed", Toast.LENGTH_SHORT).show();
             }
             else
             {
                 contectnumber.setError("Wrong Number");
             }
        }
        else
        {
            contectnumber.setError("I Have No Contect");
        }
    }
    void userdata(){
        if (!uname.getText().toString().trim().equals(""))
        {
            if (uname.getText().toString().contains("mr"))
            {
                Toast.makeText(this, "Exepted", Toast.LENGTH_SHORT).show();
            }
            else
            {
                uname.setError("Check Your Name");
            }
        }
        else
        {
            uname.setError("I Have User Name");
        }

    }

}
