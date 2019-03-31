package com.example.katherinele.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button = (Button) findViewById(R.id.email_sign_in_button);

        button.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
                next_page(v);
            }
        });

    }
    public void next_page(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
       finish();
    }
                                    //Button btn = (Button)findViewById(R.id.email_sign_in_button);

                                // setOnClickListener(new View.OnClickListener() {
                                //        @Override
                                //        public void onClick(View v) {
                                //            startActivity(new Intent(MainActivity.this, LoginActivity.class));
                                //        }
                                //    });
}
