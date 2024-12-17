package com.example.texttransfer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    private Button closeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // אתחול של ה-TextView והכפתור
        textView = findViewById(R.id.textView);
        closeButton = findViewById(R.id.closeButton);

        // קבלת הטקסט שנשלח מ-MainActivity
        String receivedText = getIntent().getStringExtra("userText");
        textView.setText(receivedText);

        // פעולה שתסגור את ה-Activity כאשר הכפתור נלחץ
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();  // סיום ה-Activity הנוכחי
            }
        });
    }
}
