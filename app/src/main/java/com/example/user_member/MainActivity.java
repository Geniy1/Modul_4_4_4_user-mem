package com.example.user_member;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Intent orqali User obyekti olish
        Intent intent = getIntent();
        Member member = (Member) intent.getSerializableExtra("memberObject");
        // TextView ga ma'lumotni joylash
        TextView infoTV = findViewById(R.id.textV);
        String memInfo = "Member: "+member.getUsername()+ ", e-mail: "+member.getEmail();
        infoTV.setText(memInfo);

        user = new User("Odinayev", 43);
        Button okButton = findViewById(R.id.okButton);
        okButton.setOnClickListener(view -> {
            // Intent orqali SecondActivityga o'tish
            Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
            intent1.putExtra("userObject", user);
            startActivity(intent1);
        });
    }
}
