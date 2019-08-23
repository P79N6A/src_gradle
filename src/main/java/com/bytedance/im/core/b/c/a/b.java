package com.bytedance.im.core.b.c.a;

import com.bytedance.im.core.proto.Request;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f21140a;

    /* renamed from: b  reason: collision with root package name */
    public String f21141b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f21142c;

    /* renamed from: d  reason: collision with root package name */
    public Request f21143d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f21144a = new b((byte) 0);

        public final a a(Request request) {
            this.f21144a.f21143d = request;
            return this;
        }

        public final a b(String str) {
            this.f21144a.f21141b = str;
            return this;
        }

        public final a a(String str) {
            this.f21144a.f21140a = str;
            return this;
        }

        public final a a(byte[] bArr) {
            this.f21144a.f21142c = bArr;
            return this;
        }
    }

    private b() {
    }

    /* synthetic */ b(byte b2) {
        this();
    }
}
