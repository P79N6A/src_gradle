package com.ss.android.http.a.b;

import com.ss.android.http.a.a;
import com.ss.android.http.a.d.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f29138a = new d();

    public final b a(b bVar, a aVar) {
        b bVar2 = new b(64);
        String a2 = aVar.a();
        String b2 = aVar.b();
        int length = a2.length() + 2;
        if (b2 != null) {
            length += b2.length();
        }
        if (length > bVar2.f29146a.length - bVar2.f29147b) {
            bVar2.a(bVar2.f29147b + length);
        }
        bVar2.a(a2);
        bVar2.a(": ");
        if (b2 != null) {
            bVar2.a(b2);
        }
        return bVar2;
    }
}
