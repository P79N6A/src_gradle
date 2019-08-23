package com.umeng.analytics.pro;

import com.umeng.analytics.pro.cz;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class cp {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f80581a;

    /* renamed from: b  reason: collision with root package name */
    private final dr f80582b;

    /* renamed from: c  reason: collision with root package name */
    private df f80583c;

    public cp() {
        this(new cz.a());
    }

    public String b(cg cgVar) throws cm {
        return new String(a(cgVar));
    }

    public cp(dh dhVar) {
        this.f80581a = new ByteArrayOutputStream();
        this.f80582b = new dr((OutputStream) this.f80581a);
        this.f80583c = dhVar.a(this.f80582b);
    }

    public byte[] a(cg cgVar) throws cm {
        this.f80581a.reset();
        cgVar.b(this.f80583c);
        return this.f80581a.toByteArray();
    }

    public String a(cg cgVar, String str) throws cm {
        try {
            return new String(a(cgVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new cm("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }
}
