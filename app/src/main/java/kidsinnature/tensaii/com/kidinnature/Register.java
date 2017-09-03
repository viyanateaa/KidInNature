package kidsinnature.tensaii.com.kidinnature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {
    Button btRegister;
    EditText etName,etUserName, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName= (EditText) findViewById(R.id.etName);
        etUserName= (EditText)findViewById(R.id.etUserName);
        etPassword=(EditText)findViewById(R.id.etPassword);

        btRegister =(Button)findViewById(R.id.btRegister);

        btRegister.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btRegister:



                break;
        }
    }
}
