package com.xiaomi.push;

import com.xiaomi.push.kc;

public class jz {

    /* renamed from: a  reason: collision with root package name */
    private final kg f82409a;

    /* renamed from: a  reason: collision with other field name */
    private final kp f859a;

    public jz() {
        this(new kc.a());
    }

    public jz(ki kiVar) {
        this.f859a = new kp();
        this.f82409a = kiVar.a(this.f859a);
    }

    public void a(jv jvVar, byte[] bArr) {
        try {
            this.f859a.a(bArr);
            jvVar.a(this.f82409a);
        } finally {
            this.f82409a.k();
        }
    }
}
