package com.example.bankaccount_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    BankAccount bankAccount= new BankAccount();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.random);
        editText.setText(String.valueOf(bankAccount.getAccountNumber()));
    }
}