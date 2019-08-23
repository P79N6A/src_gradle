package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class jd implements jv<jd, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82321a = new kd("", (byte) 15, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f664a = new kl("XmPushActionCollectData");

    /* renamed from: a  reason: collision with other field name */
    public List<is> f665a;

    /* renamed from: a */
    public int compareTo(jd jdVar) {
        if (!getClass().equals(jdVar.getClass())) {
            return getClass().getName().compareTo(jdVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(jdVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a()) {
            int a2 = jw.a((List) this.f665a, (List) jdVar.f665a);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    public jd a(List<is> list) {
        this.f665a = list;
        return this;
    }

    public void a() {
        if (this.f665a == null) {
            throw new kh("Required field 'dataCollectionItems' was not present! Struct: " + toString());
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
                this.f665a = new ArrayList(a3.f872a);
                for (int i = 0; i < a3.f872a; i++) {
                    is isVar = new is();
                    isVar.a(kgVar);
                    this.f665a.add(isVar);
                }
                kgVar.i();
            } else {
                kj.a(kgVar, a2.f82422a);
            }
            kgVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m454a() {
        return this.f665a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m455a(jd jdVar) {
        if (jdVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jdVar.a();
        return (!a2 && !a3) || (a2 && a3 && this.f665a.equals(jdVar.f665a));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f664a);
        if (this.f665a != null) {
            kgVar.a(f82321a);
            kgVar.a(new ke((byte) 12, this.f665a.size()));
            for (is b2 : this.f665a) {
                b2.b(kgVar);
            }
            kgVar.e();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jd)) {
            return compareTo((jd) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(");
        sb.append("dataCollectionItems:");
        if (this.f665a == null) {
            sb.append("null");
        } else {
            sb.append(this.f665a);
        }
        sb.append(")");
        return sb.toString();
    }
}
