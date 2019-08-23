package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.fi;
import com.xiaomi.push.service.au;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class gj {

    /* renamed from: a  reason: collision with root package name */
    private static long f82107a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static final byte[] f432a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    private static String f82108b = (hs.a(5) + "-");

    /* renamed from: a  reason: collision with other field name */
    private fi.a f433a;

    /* renamed from: a  reason: collision with other field name */
    String f434a;

    /* renamed from: a  reason: collision with other field name */
    private short f435a;

    /* renamed from: b  reason: collision with other field name */
    private byte[] f436b;

    public gj() {
        this.f435a = 2;
        this.f436b = f432a;
        this.f433a = new fi.a();
    }

    gj(fi.a aVar, short s, byte[] bArr) {
        this.f435a = 2;
        this.f436b = f432a;
        this.f433a = aVar;
        this.f435a = s;
        this.f436b = bArr;
    }

    @Deprecated
    public static gj a(hh hhVar, String str) {
        int i;
        gj gjVar = new gj();
        try {
            i = Integer.parseInt(hhVar.k());
        } catch (Exception e2) {
            b.a("Blob parse chid err " + e2.getMessage());
            i = 1;
        }
        gjVar.a(i);
        gjVar.a(hhVar.j());
        gjVar.c(hhVar.m());
        gjVar.b(hhVar.n());
        gjVar.a("XMLMSG", (String) null);
        try {
            gjVar.a(hhVar.a().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                gjVar.a(3);
            } else {
                gjVar.a(2);
                gjVar.a("SECMSG", (String) null);
            }
        } catch (UnsupportedEncodingException e3) {
            b.a("Blob setPayload err： " + e3.getMessage());
        }
        return gjVar;
    }

    static gj a(ByteBuffer byteBuffer) {
        try {
            ByteBuffer slice = byteBuffer.slice();
            short s = slice.getShort(0);
            short s2 = slice.getShort(2);
            int i = slice.getInt(4);
            fi.a aVar = new fi.a();
            aVar.a(slice.array(), slice.arrayOffset() + 8, (int) s2);
            byte[] bArr = new byte[i];
            slice.position(s2 + 8);
            slice.get(bArr, 0, i);
            return new gj(aVar, s, bArr);
        } catch (Exception e2) {
            b.a("read Blob err :" + e2.getMessage());
            throw new IOException("Malformed Input");
        }
    }

    public static String d() {
        String sb;
        synchronized (gj.class) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f82108b);
                long j = f82107a;
                f82107a = 1 + j;
                sb2.append(Long.toString(j));
                sb = sb2.toString();
            } catch (Throwable th) {
                Class<gj> cls = gj.class;
                throw th;
            }
        }
        return sb;
    }

    public int a() {
        return this.f433a.c();
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m327a() {
        return this.f433a.c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public ByteBuffer m328a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(c());
        }
        byteBuffer.putShort(this.f435a);
        byteBuffer.putShort((short) this.f433a.a());
        byteBuffer.putInt(this.f436b.length);
        int position = byteBuffer.position();
        this.f433a.a(byteBuffer.array(), byteBuffer.arrayOffset() + position, this.f433a.a());
        byteBuffer.position(position + this.f433a.a());
        byteBuffer.put(this.f436b);
        return byteBuffer;
    }

    /* renamed from: a  reason: collision with other method in class */
    public short m329a() {
        return this.f435a;
    }

    public void a(int i) {
        this.f433a.a(i);
    }

    public void a(long j, String str, String str2) {
        if (j != 0) {
            this.f433a.a(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f433a.a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f433a.b(str2);
        }
    }

    public void a(String str) {
        this.f433a.e(str);
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f433a.c(str);
            this.f433a.a();
            if (!TextUtils.isEmpty(str2)) {
                this.f433a.d(str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("command should not be empty");
    }

    public void a(short s) {
        this.f435a = s;
    }

    public void a(byte[] bArr, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f433a.c(1);
            bArr = au.a(au.a(str, e()), bArr);
        } else {
            this.f433a.c(0);
        }
        this.f436b = bArr;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m330a() {
        return this.f433a.j();
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m331a() {
        return this.f436b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m332a(String str) {
        if (this.f433a.e() == 1) {
            return au.a(au.a(str, e()), this.f436b);
        }
        if (this.f433a.e() != 0) {
            b.a("unknow cipher = " + this.f433a.e());
        }
        return this.f436b;
    }

    public int b() {
        return this.f433a.f();
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m333b() {
        return this.f433a.d();
    }

    public void b(String str) {
        this.f434a = str;
    }

    public int c() {
        return this.f433a.b() + 8 + this.f436b.length;
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m334c() {
        return this.f433a.f();
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf("@");
            try {
                long parseLong = Long.parseLong(str.substring(0, indexOf));
                int indexOf2 = str.indexOf("/", indexOf);
                String substring = str.substring(indexOf + 1, indexOf2);
                String substring2 = str.substring(indexOf2 + 1);
                this.f433a.a(parseLong);
                this.f433a.a(substring);
                this.f433a.b(substring2);
            } catch (Exception e2) {
                b.a("Blob parse user err " + e2.getMessage());
            }
        }
    }

    public String e() {
        String e2 = this.f433a.e();
        if ("ID_NOT_AVAILABLE".equals(e2)) {
            return null;
        }
        if (this.f433a.g()) {
            return e2;
        }
        String d2 = d();
        this.f433a.e(d2);
        return d2;
    }

    public String f() {
        return this.f434a;
    }

    public String g() {
        if (!this.f433a.b()) {
            return null;
        }
        return Long.toString(this.f433a.a()) + "@" + this.f433a.a() + "/" + this.f433a.b();
    }

    public String toString() {
        return "Blob [chid=" + a() + "; Id=" + e() + "; cmd=" + a() + "; type=" + a() + "; from=" + g() + " ]";
    }
}
