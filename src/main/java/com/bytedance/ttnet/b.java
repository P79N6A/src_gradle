package com.bytedance.ttnet;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.c.a.e;
import com.bytedance.frameworks.baselib.network.http.util.g;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.utils.f;
import java.io.IOException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f22544a = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final a f22545b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    static boolean f22546c;

    /* renamed from: d  reason: collision with root package name */
    static String f22547d;

    /* renamed from: e  reason: collision with root package name */
    private static C0235b f22548e;

    public static class a extends c {
        private a() {
            super((byte) 0);
        }

        public final com.bytedance.frameworks.baselib.network.http.c a() {
            return d.a(com.bytedance.frameworks.baselib.network.http.cronet.a.c.a(TTNetInit.getTTNetDepend().a()));
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.ttnet.b$b  reason: collision with other inner class name */
    public interface C0235b {
        boolean g();
    }

    public static class c {
        private c() {
        }

        public com.bytedance.frameworks.baselib.network.http.c a() {
            Context a2 = TTNetInit.getTTNetDepend().a();
            e a3 = e.a(a2);
            if (g.a(a2)) {
                e.f19781d = com.bytedance.ttnet.c.c.a();
            }
            return a3;
        }

        /* synthetic */ c(byte b2) {
            this();
        }
    }

    static class d implements com.bytedance.frameworks.baselib.network.http.c {

        /* renamed from: a  reason: collision with root package name */
        private static volatile d f22557a;

        /* renamed from: b  reason: collision with root package name */
        private com.bytedance.frameworks.baselib.network.http.cronet.a.c f22558b;

        private d(com.bytedance.frameworks.baselib.network.http.cronet.a.c cVar) {
            this.f22558b = cVar;
        }

        public static d a(com.bytedance.frameworks.baselib.network.http.cronet.a.c cVar) {
            if (f22557a == null) {
                synchronized (d.class) {
                    if (f22557a == null) {
                        f22557a = new d(cVar);
                    }
                }
            }
            return f22557a;
        }

        public com.bytedance.retrofit2.client.a newSsCall(Request request) throws IOException {
            try {
                return this.f22558b.newSsCall(request);
            } catch (Throwable th) {
                b.f22546c = true;
                b.f22547d = f.a(th);
                TTNetInit.notifyColdStartFinish();
                return b.f22544a.a().newSsCall(request);
            }
        }
    }

    public static boolean a() {
        if (f22548e != null && f22548e.g()) {
            TTNetInit.getTTNetDepend();
            if (!f22546c) {
                return true;
            }
        }
        return false;
    }

    public static void a(C0235b bVar) {
        f22548e = bVar;
    }
}
