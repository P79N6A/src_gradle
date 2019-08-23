package com.xiaomi.push;

import com.xiaomi.push.kc;
import java.io.ByteArrayOutputStream;

public class kb {

    /* renamed from: a  reason: collision with root package name */
    private kg f82413a;

    /* renamed from: a  reason: collision with other field name */
    private final kn f862a;

    /* renamed from: a  reason: collision with other field name */
    private final ByteArrayOutputStream f863a;

    public kb() {
        this(new kc.a());
    }

    public kb(ki kiVar) {
        this.f863a = new ByteArrayOutputStream();
        this.f862a = new kn(this.f863a);
        this.f82413a = kiVar.a(this.f862a);
    }

    public byte[] a(jv jvVar) {
        this.f863a.reset();
        jvVar.b(this.f82413a);
        return this.f863a.toByteArray();
    }
}
