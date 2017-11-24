package com.example.user.ex7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends Activity {
    public final int Register_Code =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        }
        public void returnToMain(View view)
        {
            Intent intent = new Intent(this,MainActivity.class);
            EditText lName = (EditText)findViewById(R.id.efName);
            EditText fName = (EditText)findViewById(R.id.elName);
            String lastName = lName.getText().toString();
            String firstName = lName.getText().toString();
            RadioGroup radioGroup = (RadioGroup)findViewById(R.id.rGroup);
            int genderId = radioGroup.getCheckedRadioButtonId();
            RadioButton genderB = (RadioButton) findViewById(genderId);
            String gender = genderB.getText().toString();
            intent.putExtra("lName",lastName);
            intent.putExtra("fName",firstName);
            intent.putExtra("gender",gender);
            setResult(RESULT_OK,intent);
            finish();
        }
    }

