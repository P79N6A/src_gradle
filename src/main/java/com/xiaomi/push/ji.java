package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ji implements jv<ji, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82341a = new kd("", (byte) 15, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f702a = new kl("XmPushActionNormalConfig");

    /* renamed from: a  reason: collision with other field name */
    public List<it> f703a;

    /* JADX WARNING: type inference failed for: r0v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v1, types: [boolean] */
    /* renamed from: a */
    public int compareTo(ji jiVar) {
        if (!getClass().equals(jiVar.getClass())) {
            return getClass().getName().compareTo(jiVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(jiVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a() != null) {
            int a2 = jw.a((List) this.f703a, (List) jiVar.f703a);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    public List<it> a() {
        return this.f703a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m477a() {
        if (this.f703a == null) {
            throw new kh("Required field 'normalConfigs' was not present! Struct: " + toString());
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
                this.f703a = new ArrayList(a3.f872a);
                for (int i = 0; i < a3.f872a; i++) {
                    it itVar = new it();
                    itVar.a(kgVar);
                    this.f703a.add(itVar);
                }
                kgVar.i();
            } else {
                kj.a(kgVar, a2.f82422a);
            }
            kgVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m478a() {
        return this.f703a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m479a(ji jiVar) {
        if (jiVar == null) {
            return false;
        }
        List<it> a2 = a();
        List<it> a3 = jiVar.a();
        return (a2 == null && a3 == null) || !(a2 == null || a3 == null || !this.f703a.equals(jiVar.f703a));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f702a);
        if (this.f703a != null) {
            kgVar.a(f82341a);
            kgVar.a(new ke((byte) 12, this.f703a.size()));
            for (it b2 : this.f703a) {
                b2.b(kgVar);
            }
            kgVar.e();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ji)) {
            return compareTo((ji) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(");
        sb.append("normalConfigs:");
        if (this.f703a == null) {
            sb.append("null");
        } else {
            sb.append(this.f703a);
        }
        sb.append(")");
        return sb.toString();
    }
}
