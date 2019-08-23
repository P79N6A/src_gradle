package com.bytedance.im.core.b.a.c.b.b;

import com.bytedance.im.core.b.a.c.b;
import com.tencent.wcdb.Cursor;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private Cursor f20933a;

    public final Object e() {
        return this.f20933a;
    }

    public final int b() {
        return this.f20933a.getCount();
    }

    public final boolean d() {
        return this.f20933a.moveToNext();
    }

    public final boolean c() {
        return this.f20933a.moveToFirst();
    }

    public final void a() {
        this.f20933a.close();
    }

    public a(Cursor cursor) {
        this.f20933a = cursor;
    }

    public final int a(int i) {
        return this.f20933a.getInt(i);
    }

    public final String c(int i) {
        return this.f20933a.getString(i);
    }

    public final int a(String str) {
        return this.f20933a.getColumnIndex(str);
    }

    public final long b(int i) {
        return this.f20933a.getLong(i);
    }
}
