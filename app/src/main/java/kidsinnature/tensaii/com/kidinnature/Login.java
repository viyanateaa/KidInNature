package kidsinnature.tensaii.com.kidinnature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {
    Button btLogin;
    EditText etUserName, etPassword;
    TextView RegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUserName =(EditText) findViewById(R.id.etUserName);
        etPassword= (EditText) findViewById(R.id.etPassword);
        RegisterLink=(TextView) findViewById(R.id.RegisterLink);
        btLogin =(Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(this);
        RegisterLink.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btLogin:
                startActivity(new Intent(this, MainActivity.class));

                break;
            case R.id.RegisterLink:
                startActivity(new Intent(this, Register.class));
                break;

        }
    }
}
