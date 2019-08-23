package com.xiaomi.push;

import android.content.Context;
import java.util.List;

public abstract class dw {

    /* renamed from: a  reason: collision with root package name */
    private int f81960a;

    public dw(int i) {
        this.f81960a = i;
    }

    public int a() {
        return this.f81960a;
    }

    public abstract String a(Context context, String str, List<as> list);

    /* renamed from: a  reason: collision with other method in class */
    public boolean m196a(Context context, String str, List<as> list) {
        return true;
    }
}
