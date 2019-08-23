package com.bytedance.frameworks.baselib.network.http.b;

import java.net.URI;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f19744a = new b() {
        public final boolean a(URI uri, e eVar) {
            return true;
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final b f19745b = new b() {
        public final boolean a(URI uri, e eVar) {
            return false;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final b f19746c = new b() {
        public final boolean a(URI uri, e eVar) {
            return e.a(eVar.f19751d, uri.getHost());
        }
    };

    boolean a(URI uri, e eVar);
}
