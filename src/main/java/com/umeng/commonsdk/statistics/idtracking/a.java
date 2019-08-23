package com.umeng.commonsdk.statistics.idtracking;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.statistics.proto.b;
import com.umeng.commonsdk.statistics.proto.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final int f80948a = 10;

    /* renamed from: b  reason: collision with root package name */
    private final int f80949b = 20;

    /* renamed from: c  reason: collision with root package name */
    private final String f80950c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.umeng.commonsdk.statistics.proto.a> f80951d;

    /* renamed from: e  reason: collision with root package name */
    private b f80952e;

    public abstract String f();

    public String b() {
        return this.f80950c;
    }

    public b d() {
        return this.f80952e;
    }

    public List<com.umeng.commonsdk.statistics.proto.a> e() {
        return this.f80951d;
    }

    public boolean a() {
        return g();
    }

    public boolean c() {
        if (this.f80952e == null || this.f80952e.h() <= 20) {
            return true;
        }
        return false;
    }

    private boolean g() {
        String str;
        int i;
        b bVar = this.f80952e;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.b();
        }
        if (bVar == null) {
            i = 0;
        } else {
            i = bVar.h();
        }
        String a2 = a(f());
        if (a2 == null || a2.equals(str)) {
            return false;
        }
        if (bVar == null) {
            bVar = new b();
        }
        bVar.a(a2);
        bVar.a(System.currentTimeMillis());
        bVar.a(i + 1);
        com.umeng.commonsdk.statistics.proto.a aVar = new com.umeng.commonsdk.statistics.proto.a();
        aVar.a(this.f80950c);
        aVar.c(a2);
        aVar.b(str);
        aVar.a(bVar.e());
        if (this.f80951d == null) {
            this.f80951d = new ArrayList(2);
        }
        this.f80951d.add(aVar);
        if (this.f80951d.size() > 10) {
            this.f80951d.remove(0);
        }
        this.f80952e = bVar;
        return true;
    }

    public void a(b bVar) {
        this.f80952e = bVar;
    }

    public void a(List<com.umeng.commonsdk.statistics.proto.a> list) {
        this.f80951d = list;
    }

    public a(String str) {
        this.f80950c = str;
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() != 0 && !PushConstants.PUSH_TYPE_NOTIFY.equals(trim) && !"unknown".equals(trim.toLowerCase(Locale.US))) {
            return trim;
        }
        return null;
    }

    public void a(c cVar) {
        this.f80952e = cVar.c().get(this.f80950c);
        List<com.umeng.commonsdk.statistics.proto.a> h = cVar.h();
        if (h != null && h.size() > 0) {
            if (this.f80951d == null) {
                this.f80951d = new ArrayList();
            }
            for (com.umeng.commonsdk.statistics.proto.a next : h) {
                if (this.f80950c.equals(next.f80999a)) {
                    this.f80951d.add(next);
                }
            }
        }
    }
}
