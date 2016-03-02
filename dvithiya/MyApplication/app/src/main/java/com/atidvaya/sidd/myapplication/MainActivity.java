package com.atidvaya.sidd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    TextView loginPageTextView;
    EditText loginEditText;
    EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loginButton = (Button)findViewById(R.id.loginButton);
        loginPageTextView=(TextView)findViewById(R.id.textView);
        loginEditText= (EditText)findViewById(R.id.loginEditText);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);





        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPageTextView.setVisibility(View.VISIBLE);

                loginPageTextView.setText("Welcome Prashanth");


                String userID = loginEditText.getText().toString();
                String password = passwordEditText.getText().toString();


                if (userID.equalsIgnoreCase("atidvaya") && password.equals("atid"))
                {
                    Intent intent=new Intent(MainActivity.this,HomeScreenActivity.class);
                    intent.putExtra("UserID", userID);
                    startActivity(intent);
                }
                else {
                    loginEditText.requestFocus();
                    loginEditText.setError("Enter Valid UserID & Password");
                }




                //Toast.makeText(MainActivity.this, "Welcome Prashant", Toast.LENGTH_SHORT).show();
            }
        });





    }


}
