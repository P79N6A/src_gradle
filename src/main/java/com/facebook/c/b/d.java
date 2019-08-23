package com.facebook.c.b;

import com.facebook.c.b.a.b;
import com.facebook.c.b.b;
import com.facebook.c.c.c;
import com.facebook.c.c.e;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f23341a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23342b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f23343c;

    /* renamed from: d  reason: collision with root package name */
    private final b f23344d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23345a;

        /* renamed from: b  reason: collision with root package name */
        public int f23346b;

        /* renamed from: c  reason: collision with root package name */
        public List<b> f23347c;
    }

    public final b a() {
        if (this.f23344d == null) {
            return null;
        }
        return (b) this.f23344d.f23332f;
    }

    public d(int i, int i2, List<b> list) {
        boolean z;
        Integer valueOf = Integer.valueOf(i);
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f23341a = ((Integer) c.a(valueOf, z, "group_id")).intValue();
        this.f23342b = i2;
        e.a(list, b.f23327a);
        this.f23344d = com.facebook.c.c.b.a(list, b.C0250b.ANCHOR_POINT);
        this.f23343c = (List) c.a(e.a(list), list.size() > 0 ? true : z2, "animations");
    }
}
