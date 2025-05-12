package com.example.studentlistview;


public class Student {
    private int id;
    private String name;
    private String mssv;
    private int avatarResId;

    public Student(int id, String name, String mssv, int avatarResId) {
        this.id = id;
        this.name = name;
        this.mssv = mssv;
        this.avatarResId = avatarResId;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getMssv() { return mssv; }
    public int getAvatarResId() { return avatarResId; }
}
