package com.work;

class StudentMember extends Member {

    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    public void showType() {
        System.out.println("Student Member: " + name);
    }
}