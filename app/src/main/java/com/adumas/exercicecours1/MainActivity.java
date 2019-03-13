package com.adumas.exercicecours1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CompareNumber compareNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void compare(View button){
        EditText editTextCompareNumber1 = findViewById(R.id.editText);
        EditText editTextCompareNumber2 = findViewById(R.id.editText2);

        try{
            compareNumber = new CompareNumber(Integer.parseInt(editTextCompareNumber1.getText().toString()),Integer.parseInt(editTextCompareNumber2.getText().toString()));

        }
        catch (Exception e){
            Toast.makeText(this,"Entrez des chiffres!",Toast.LENGTH_LONG).show();
            return;
        }

        CompareNumber.compareState compareState = compareNumber.getCompareResult();

        editTextCompareNumber1.setBackgroundColor(Color.TRANSPARENT);
        editTextCompareNumber2.setBackgroundColor(Color.TRANSPARENT);

        if (compareState == CompareNumber.compareState.BIGGER1){
            Toast.makeText(this,"Number 1 is bigger",Toast.LENGTH_LONG).show();
            editTextCompareNumber1.setBackgroundColor(Color.GREEN);
        }
        else if (compareState == CompareNumber.compareState.BIGGER2){
            Toast.makeText(this,"Number 2 is bigger",Toast.LENGTH_LONG).show();
            editTextCompareNumber2.setBackgroundColor(Color.GREEN);
        }
        else{
            Toast.makeText(this,"Numbers are equal",Toast.LENGTH_LONG).show();
            editTextCompareNumber1.setBackgroundColor(Color.GREEN);
            editTextCompareNumber2.setBackgroundColor(Color.GREEN);
        }

    }
}
