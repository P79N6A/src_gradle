package org.aspectj.a.a;

import org.aspectj.lang.a;
import org.aspectj.lang.d;

public final class c implements org.aspectj.lang.c {

    /* renamed from: a  reason: collision with root package name */
    Object f84045a;

    /* renamed from: b  reason: collision with root package name */
    Object f84046b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f84047c;

    /* renamed from: d  reason: collision with root package name */
    a.C0900a f84048d;

    static class a implements a.C0900a {

        /* renamed from: a  reason: collision with root package name */
        String f84049a;

        /* renamed from: b  reason: collision with root package name */
        d f84050b;

        /* renamed from: c  reason: collision with root package name */
        org.aspectj.lang.a.d f84051c;

        /* renamed from: d  reason: collision with root package name */
        private int f84052d;

        public final String toString() {
            h hVar = h.k;
            StringBuffer stringBuffer = new StringBuffer();
            String str = this.f84049a;
            int lastIndexOf = str.lastIndexOf(45);
            if (lastIndexOf != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            stringBuffer.append(str);
            stringBuffer.append("(");
            stringBuffer.append(((f) this.f84050b).b(hVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        public a(int i, String str, d dVar, org.aspectj.lang.a.d dVar2) {
            this.f84049a = str;
            this.f84050b = dVar;
            this.f84051c = dVar2;
            this.f84052d = i;
        }
    }

    public final Object a() {
        return this.f84045a;
    }

    public final String toString() {
        return this.f84048d.toString();
    }

    public final Object[] b() {
        if (this.f84047c == null) {
            this.f84047c = new Object[0];
        }
        Object[] objArr = new Object[this.f84047c.length];
        System.arraycopy(this.f84047c, 0, objArr, 0, this.f84047c.length);
        return objArr;
    }

    public c(a.C0900a aVar, Object obj, Object obj2, Object[] objArr) {
        this.f84048d = aVar;
        this.f84045a = obj;
        this.f84046b = obj2;
        this.f84047c = objArr;
    }
}
