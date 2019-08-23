package com.xiaomi.push;

import com.xiaomi.push.kc;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class km extends kc {

    /* renamed from: b  reason: collision with root package name */
    private static int f82431b = 10000;

    /* renamed from: c  reason: collision with root package name */
    private static int f82432c = 10000;

    /* renamed from: d  reason: collision with root package name */
    private static int f82433d = 10000;

    /* renamed from: e  reason: collision with root package name */
    private static int f82434e = 10485760;

    /* renamed from: f  reason: collision with root package name */
    private static int f82435f = 104857600;

    public static class a extends kc.a {
        public a() {
            super(false, true);
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }

        public kg a(kq kqVar) {
            km kmVar = new km(kqVar, this.f869a, this.f82421b);
            if (this.f82420a != 0) {
                kmVar.b(this.f82420a);
            }
            return kmVar;
        }
    }

    public km(kq kqVar, boolean z, boolean z2) {
        super(kqVar, z, z2);
    }

    public ke a() {
        byte a2 = a();
        int a3 = a();
        if (a3 <= f82432c) {
            return new ke(a2, a3);
        }
        throw new kh(3, "Thrift list size " + a3 + " out of range!");
    }

    /* renamed from: a  reason: collision with other method in class */
    public kf m556a() {
        byte a2 = a();
        byte a3 = a();
        int a4 = a();
        if (a4 <= f82431b) {
            return new kf(a2, a3, a4);
        }
        throw new kh(3, "Thrift map size " + a4 + " out of range!");
    }

    /* renamed from: a  reason: collision with other method in class */
    public kk m557a() {
        byte a2 = a();
        int a3 = a();
        if (a3 <= f82433d) {
            return new kk(a2, a3);
        }
        throw new kh(3, "Thrift set size " + a3 + " out of range!");
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m558a() {
        int a2 = a();
        if (a2 > f82434e) {
            throw new kh(3, "Thrift string size " + a2 + " out of range!");
        } else if (this.f82426a.b() < a2) {
            return a(a2);
        } else {
            try {
                String str = new String(this.f82426a.a(), this.f82426a.a(), a2, "UTF-8");
                this.f82426a.a(a2);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new ka("JVM DOES NOT SUPPORT UTF-8");
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public ByteBuffer m559a() {
        int a2 = a();
        if (a2 <= f82435f) {
            c(a2);
            if (this.f82426a.b() >= a2) {
                ByteBuffer wrap = ByteBuffer.wrap(this.f82426a.a(), this.f82426a.a(), a2);
                this.f82426a.a(a2);
                return wrap;
            }
            byte[] bArr = new byte[a2];
            this.f82426a.b(bArr, 0, a2);
            return ByteBuffer.wrap(bArr);
        }
        throw new kh(3, "Thrift binary size " + a2 + " out of range!");
    }
}
