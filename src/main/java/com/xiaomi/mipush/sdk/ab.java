package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

public class ab {

    /* renamed from: a  reason: collision with root package name */
    int f81744a;

    /* renamed from: a  reason: collision with other field name */
    String f90a = "";

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ab)) {
            ab abVar = (ab) obj;
            if (!TextUtils.isEmpty(abVar.f90a) && abVar.f90a.equals(this.f90a)) {
                return true;
            }
        }
        return false;
    }
}
