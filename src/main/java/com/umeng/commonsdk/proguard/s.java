package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.ac;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f80856a;

    /* renamed from: b  reason: collision with root package name */
    private final au f80857b;

    /* renamed from: c  reason: collision with root package name */
    private ai f80858c;

    public s() {
        this(new ac.a());
    }

    public String b(j jVar) throws p {
        return new String(a(jVar));
    }

    public s(ak akVar) {
        this.f80856a = new ByteArrayOutputStream();
        this.f80857b = new au((OutputStream) this.f80856a);
        this.f80858c = akVar.a(this.f80857b);
    }

    public byte[] a(j jVar) throws p {
        this.f80856a.reset();
        jVar.write(this.f80858c);
        return this.f80856a.toByteArray();
    }

    public String a(j jVar, String str) throws p {
        try {
            return new String(a(jVar), str);
        } catch (UnsupportedEncodingException unused) {
            throw new p("JVM DOES NOT SUPPORT ENCODING: " + str);
        }
    }
}
