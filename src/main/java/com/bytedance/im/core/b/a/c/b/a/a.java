package com.bytedance.im.core.b.a.c.b.a;

import android.database.Cursor;
import com.bytedance.im.core.b.a.c.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private Cursor f20928a;

    public final Object e() {
        return this.f20928a;
    }

    public final int b() {
        return this.f20928a.getCount();
    }

    public final boolean d() {
        return this.f20928a.moveToNext();
    }

    public final boolean c() {
        return this.f20928a.moveToFirst();
    }

    public final void a() {
        this.f20928a.close();
    }

    public a(Cursor cursor) {
        this.f20928a = cursor;
    }

    public final int a(int i) {
        return this.f20928a.getInt(i);
    }

    public final String c(int i) {
        return this.f20928a.getString(i);
    }

    public final int a(String str) {
        return this.f20928a.getColumnIndex(str);
    }

    public final long b(int i) {
        return this.f20928a.getLong(i);
    }
}
