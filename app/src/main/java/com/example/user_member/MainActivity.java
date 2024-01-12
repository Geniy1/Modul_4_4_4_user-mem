package com.example.user_member;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = new User("Odinayev", 43);
        Button okB = findViewById(R.id.okButton);
        okB.setOnClickListener(view -> {
            // Intent orqali SecondActivityga o'tish
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("userObject", user);
            startActivity(intent);
        });
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        Member member = (Member) intent.getSerializableExtra("memberObject");
        TextView infoTV = findViewById(R.id.textV);
        String memInfo = "Member: "+member.getUsername()+ ", e-mail: "+member.getEmail();
        infoTV.setText(memInfo);;
    }
}
