package com.umeng.analytics.pro;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private final int f80702a = 10;

    /* renamed from: b  reason: collision with root package name */
    private final int f80703b = 20;

    /* renamed from: c  reason: collision with root package name */
    private final String f80704c;

    /* renamed from: d  reason: collision with root package name */
    private List<bk> f80705d;

    /* renamed from: e  reason: collision with root package name */
    private bl f80706e;

    public abstract String f();

    public String b() {
        return this.f80704c;
    }

    public bl d() {
        return this.f80706e;
    }

    public List<bk> e() {
        return this.f80705d;
    }

    public boolean a() {
        return g();
    }

    public boolean c() {
        if (this.f80706e == null || this.f80706e.i() <= 20) {
            return true;
        }
        return false;
    }

    private boolean g() {
        String str;
        int i;
        bl blVar = this.f80706e;
        if (blVar == null) {
            str = null;
        } else {
            str = blVar.c();
        }
        if (blVar == null) {
            i = 0;
        } else {
            i = blVar.i();
        }
        String a2 = a(f());
        if (a2 == null || a2.equals(str)) {
            return false;
        }
        if (blVar == null) {
            blVar = new bl();
        }
        blVar.a(a2);
        blVar.a(System.currentTimeMillis());
        blVar.a(i + 1);
        bk bkVar = new bk();
        bkVar.a(this.f80704c);
        bkVar.c(a2);
        bkVar.b(str);
        bkVar.a(blVar.f());
        if (this.f80705d == null) {
            this.f80705d = new ArrayList(2);
        }
        this.f80705d.add(bkVar);
        if (this.f80705d.size() > 10) {
            this.f80705d.remove(0);
        }
        this.f80706e = blVar;
        return true;
    }

    public void a(bl blVar) {
        this.f80706e = blVar;
    }

    public void a(List<bk> list) {
        this.f80705d = list;
    }

    public y(String str) {
        this.f80704c = str;
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

    public void a(bm bmVar) {
        this.f80706e = (bl) bmVar.d().get(this.f80704c);
        List<bk> i = bmVar.i();
        if (i != null && i.size() > 0) {
            if (this.f80705d == null) {
                this.f80705d = new ArrayList();
            }
            for (bk bkVar : i) {
                if (this.f80704c.equals(bkVar.f80455a)) {
                    this.f80705d.add(bkVar);
                }
            }
        }
    }
}
