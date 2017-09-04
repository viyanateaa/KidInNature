package kidsinnature.tensaii.com.kidinnature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btLogout;
    EditText etName, etUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=(EditText) findViewById(R.id.etName);
        etUserName=(EditText)findViewById(R.id.etUserName);
        btLogout=(Button) findViewById(R.id.btLogout);

        btLogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btLogout:

                startActivity(new Intent(this, Login.class));
                break;
        }
    }
}
