package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class jh implements jv<jh, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82340a = new kd("", (byte) 15, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f700a = new kl("XmPushActionCustomConfig");

    /* renamed from: a  reason: collision with other field name */
    public List<iv> f701a;

    /* JADX WARNING: type inference failed for: r0v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* renamed from: a */
    public int compareTo(jh jhVar) {
        if (!getClass().equals(jhVar.getClass())) {
            return getClass().getName().compareTo(jhVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(jhVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a() != null) {
            int a2 = jw.a((List) this.f701a, (List) jhVar.f701a);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    public List<iv> a() {
        return this.f701a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m474a() {
        if (this.f701a == null) {
            throw new kh("Required field 'customConfigs' was not present! Struct: " + toString());
        }
    }

    public void a(kg kgVar) {
        kgVar.a();
        while (true) {
            kd a2 = kgVar.a();
            if (a2.f82422a == 0) {
                kgVar.f();
                a();
                return;
            }
            if (a2.f871a == 1 && a2.f82422a == 15) {
                ke a3 = kgVar.a();
                this.f701a = new ArrayList(a3.f872a);
                for (int i = 0; i < a3.f872a; i++) {
                    iv ivVar = new iv();
                    ivVar.a(kgVar);
                    this.f701a.add(ivVar);
                }
                kgVar.i();
            } else {
                kj.a(kgVar, a2.f82422a);
            }
            kgVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m475a() {
        return this.f701a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m476a(jh jhVar) {
        if (jhVar == null) {
            return false;
        }
        List<iv> a2 = a();
        List<iv> a3 = jhVar.a();
        return (a2 == null && a3 == null) || !(a2 == null || a3 == null || !this.f701a.equals(jhVar.f701a));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f700a);
        if (this.f701a != null) {
            kgVar.a(f82340a);
            kgVar.a(new ke((byte) 12, this.f701a.size()));
            for (iv b2 : this.f701a) {
                b2.b(kgVar);
            }
            kgVar.e();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jh)) {
            return compareTo((jh) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(");
        sb.append("customConfigs:");
        if (this.f701a == null) {
            sb.append("null");
        } else {
            sb.append(this.f701a);
        }
        sb.append(")");
        return sb.toString();
    }
}
