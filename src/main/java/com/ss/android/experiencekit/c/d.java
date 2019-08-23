package com.ss.android.experiencekit.c;

public enum d {
    BEGIN(1),
    END(2);
    
    private int status;

    public final int getStatus() {
        return this.status;
    }

    private d(int i) {
        this.status = i;
    }
}
