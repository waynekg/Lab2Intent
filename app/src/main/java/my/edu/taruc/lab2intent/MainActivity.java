package my.edu.taruc.lab2intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG_NAM = "my.edu.taruc.lab2intent.MESSAGE";
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Link UI to program
        editTextMessage = findViewById(R.id.editTextMessage);
    }

    public void sendMessage(View view){
        String stringMsg;
        if(TextUtils.isEmpty(editTextMessage.getText())){
            editTextMessage.setError("Please enter your message");
            return;
        }
        stringMsg = editTextMessage.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(TAG_NAM,stringMsg);
        startActivity(intent);

    }
}
