package com.work;

class Member {
    protected int memberId;
    protected String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }


    public int getMemberId() { return memberId; }
    public String getName() { return name; }
}