package my.edu.taruc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textViewMessage;
        textViewMessage = findViewById(R.id.textViewMsg);

        //Retrieve intent data
        Intent intent = getIntent(); //Who called me?
        if(intent.hasExtra(MainActivity.TAG_NAM)){
            String stringMsg = intent.getStringExtra(MainActivity.TAG_NAM);
            textViewMessage.setText(stringMsg);
        }
    }

    public void closeActivity(View view){
        finish();
    }
}
