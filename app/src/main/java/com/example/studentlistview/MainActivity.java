package com.example.studentlistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView; // <- dòng cần thêm
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private DatabaseHelper dbHelper;
    private List<Student> students;

    private long lastClickTime = 0;
    private int lastClickPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        dbHelper = new DatabaseHelper(this);

        students = dbHelper.getAllStudents();
        StudentAdapter adapter = new StudentAdapter(this, students);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            long currentTime = System.currentTimeMillis();

            if (position == lastClickPosition && currentTime - lastClickTime < 500) {
                Student selected = students.get(position);
                Intent intent = new Intent(MainActivity.this, StudentDetailActivity.class);
                intent.putExtra("name", selected.getName());
                intent.putExtra("mssv", selected.getMssv());
                startActivity(intent);
            }

            lastClickTime = currentTime;
            lastClickPosition = position;
        });
    }
}
