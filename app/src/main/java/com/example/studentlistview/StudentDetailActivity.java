package com.example.studentlistview;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        TextView nameView = findViewById(R.id.txtDetailName);
        TextView mssvView = findViewById(R.id.txtDetailMssv);

        Intent intent = getIntent();
        nameView.setText("Họ tên: " + intent.getStringExtra("name"));
        mssvView.setText("MSSV: " + intent.getStringExtra("mssv"));
    }
}
