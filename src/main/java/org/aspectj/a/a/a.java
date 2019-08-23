package org.aspectj.a.a;

public abstract class a extends d implements org.aspectj.lang.a.a {

    /* renamed from: a  reason: collision with root package name */
    Class[] f84036a;

    /* renamed from: b  reason: collision with root package name */
    String[] f84037b;

    /* renamed from: c  reason: collision with root package name */
    Class[] f84038c;

    public final Class[] a() {
        if (this.f84036a == null) {
            this.f84036a = c(3);
        }
        return this.f84036a;
    }

    public final Class[] b() {
        if (this.f84038c == null) {
            this.f84038c = c(5);
        }
        return this.f84038c;
    }

    a(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2) {
        super(i, str, cls);
        this.f84036a = clsArr;
        this.f84037b = strArr;
        this.f84038c = clsArr2;
    }
}
