package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class in implements jv<in, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82244a = new kd("", (byte) 15, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f538a = new kl("ClientUploadData");

    /* renamed from: a  reason: collision with other field name */
    public List<io> f539a;

    public int a() {
        if (this.f539a == null) {
            return 0;
        }
        return this.f539a.size();
    }

    /* renamed from: a */
    public int compareTo(in inVar) {
        if (!getClass().equals(inVar.getClass())) {
            return getClass().getName().compareTo(inVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(inVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a()) {
            int a2 = jw.a((List) this.f539a, (List) inVar.f539a);
            if (a2 != 0) {
                return a2;
            }
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m395a() {
        if (this.f539a == null) {
            throw new kh("Required field 'uploadDataItems' was not present! Struct: " + toString());
        }
    }

    public void a(io ioVar) {
        if (this.f539a == null) {
            this.f539a = new ArrayList();
        }
        this.f539a.add(ioVar);
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
                this.f539a = new ArrayList(a3.f872a);
                for (int i = 0; i < a3.f872a; i++) {
                    io ioVar = new io();
                    ioVar.a(kgVar);
                    this.f539a.add(ioVar);
                }
                kgVar.i();
            } else {
                kj.a(kgVar, a2.f82422a);
            }
            kgVar.g();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m396a() {
        return this.f539a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m397a(in inVar) {
        if (inVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = inVar.a();
        return (!a2 && !a3) || (a2 && a3 && this.f539a.equals(inVar.f539a));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f538a);
        if (this.f539a != null) {
            kgVar.a(f82244a);
            kgVar.a(new ke((byte) 12, this.f539a.size()));
            for (io b2 : this.f539a) {
                b2.b(kgVar);
            }
            kgVar.e();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof in)) {
            return compareTo((in) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(");
        sb.append("uploadDataItems:");
        if (this.f539a == null) {
            sb.append("null");
        } else {
            sb.append(this.f539a);
        }
        sb.append(")");
        return sb.toString();
    }
}
