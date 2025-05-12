package com.example.studentlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class StudentAdapter extends BaseAdapter {
    private Context context;
    private List<Student> students;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public int getCount() { return students.size(); }

    @Override
    public Object getItem(int i) { return students.get(i); }

    @Override
    public long getItemId(int i) { return students.get(i).getId(); }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if (view == null)
            view = LayoutInflater.from(context).inflate(R.layout.list_item_student, parent, false);

        ImageView img = view.findViewById(R.id.imgAvatar);
        TextView name = view.findViewById(R.id.txtName);
        TextView mssv = view.findViewById(R.id.txtMssv);

        Student s = students.get(i);
        img.setImageResource(s.getAvatarResId());
        name.setText(s.getName());
        mssv.setText(s.getMssv());

        return view;
    }
}
