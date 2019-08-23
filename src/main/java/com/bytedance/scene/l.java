package com.bytedance.scene;

import android.support.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public enum l {
    NONE(0, "NONE"),
    STOPPED(1, "STOPPED"),
    STARTED(2, "STARTED"),
    RESUMED(3, "RESUMED");
    
    public final String name;
    public final int value;

    private l(int i, String str) {
        this.value = i;
        this.name = str;
    }
}
