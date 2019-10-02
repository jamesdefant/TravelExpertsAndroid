package com.proj_207b.travelexperts.datamanagement.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.proj_207b.travelexperts.datamanagement.R;

public class MainActivity extends AppCompatActivity {

    // Constants
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    // Fields
    private TextView textView_Message;
    private EditText editText_Username, editText_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Message = findViewById(R.id.textView_Message);
        editText_Username = findViewById(R.id.editText_Username);
        editText_Password = findViewById(R.id.editText_Password);

        textView_Message.setVisibility(View.INVISIBLE);

    }

    /**
     * Login button event handler
     * @param view
     */
    public void button_Login_onClick(View view) {

        Log.d(LOG_TAG, "button_Login_onClick()");

        // Check whether user is valid - if so, navigate to MasterActivity
        if(validateUser()) {

            startActivity(new Intent(this, MasterActivity.class));
            finish();
        }
        else {
            textView_Message.setVisibility(View.VISIBLE);
        }
    }


    /**
     * Validate the fields
     * Check the user/password against the database
     * @return does the user/password match?
     */
    private boolean validateUser() {

        boolean isValidUser = true;

        // Validate the fields before checking the data
        if(false) {
            isValidUser = false;
        }

        return isValidUser;
    }
}
