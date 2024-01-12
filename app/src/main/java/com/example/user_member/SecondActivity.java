package com.example.user_member;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        User user = (User) intent.getSerializableExtra("userObject");
        // TextView ga ma'lumotni joylash
        TextView infoTextView = findViewById(R.id.infoTextView);
        String userInfo = "User: " + user.getName() + ", Age: " + user.getAge();
        infoTextView.setText(userInfo);
        member = new Member("Odinayev", "golibjonodinaev@gmail.com");
        Button sendButton = findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("memberObject", member);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}
