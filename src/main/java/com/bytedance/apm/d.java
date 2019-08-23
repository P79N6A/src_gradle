package com.bytedance.apm;

import java.util.HashSet;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public a f1946a;

    /* renamed from: b  reason: collision with root package name */
    public HashSet<String> f1947b;

    public interface a {
        void a(String str);

        void a(Throwable th, String str);
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f1965a = new d((byte) 0);
    }

    public static d a() {
        return b.f1965a;
    }

    private d() {
        this.f1947b = new HashSet<>();
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public final void a(Throwable th, String str) {
        if (this.f1946a != null && !this.f1947b.contains(str)) {
            this.f1947b.add(str);
            a aVar = this.f1946a;
            aVar.a(th, "apm_" + str);
        }
    }
}
