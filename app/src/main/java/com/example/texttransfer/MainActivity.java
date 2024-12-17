package com.example.texttransfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // אתחול של שדה ה-EditText והכפתור
        editText = findViewById(R.id.editText);
        sendButton = findViewById(R.id.sendButton);

        // פעולה שתתבצע כאשר הכפתור נלחץ
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = editText.getText().toString();

                // יצירת Intent לשלוח את הטקסט ל-SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("userText", userInput);
                startActivity(intent);
            }
        });
    }
}
