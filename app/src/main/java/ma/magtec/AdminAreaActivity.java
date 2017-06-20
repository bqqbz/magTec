package ma.magtec;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class AdminAreaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();
        //String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");


        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
        EditText etUsername = (EditText) findViewById(R.id.etEventdescription);

        // Display user details
        String message = "Hi, " + username + "!";
        tvWelcomeMsg.setText(message);
        etUsername.setText(username);

    }
}
