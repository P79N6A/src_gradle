package com.bytedance.ttnet.encrypt;

import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.ttnet.encrypt.TtTokenConfig;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class c implements e.i, e.j {

    /* renamed from: a  reason: collision with root package name */
    private static c f22634a;

    /* renamed from: b  reason: collision with root package name */
    private static a f22635b;

    /* renamed from: c  reason: collision with root package name */
    private TtTokenConfig.a f22636c = TtTokenConfig.a().b();

    public interface a {
        boolean l();

        Set<String> m();
    }

    public static a d() {
        return f22635b;
    }

    private c() {
        e.a((e.j) this);
    }

    public static c c() {
        if (f22634a == null) {
            synchronized (c.class) {
                if (f22634a == null) {
                    f22634a = new c();
                }
            }
        }
        return f22634a;
    }

    public final void b() {
        TtTokenConfig a2 = TtTokenConfig.a();
        Logger.debug();
        try {
            if (a2.f22620b != null) {
                synchronized (a2.f22619a) {
                    a2.f22620b.f22629c = "";
                    a2.f22620b.f22630d = null;
                    a2.f22620b.f22631e = null;
                    a2.f22620b.f22628b = 0;
                }
                a2.d();
                a2.f();
                a2.e();
            }
        } catch (Throwable unused) {
        }
    }

    public final Map<String, ?> a() {
        if (f22635b == null || !f22635b.l()) {
            return Collections.emptyMap();
        }
        return TtTokenConfig.a().c();
    }

    public static void a(a aVar) {
        f22635b = aVar;
    }

    public final void a(Map<String, ?> map) {
        if (map != null) {
            this.f22636c = (TtTokenConfig.a) map.get("session_token");
        }
    }

    public final Pair<Boolean, String> a(String str) {
        if (f22635b == null || !f22635b.l()) {
            return new Pair<>(Boolean.FALSE, str);
        }
        return b.a(this.f22636c, str);
    }

    public final Pair<Boolean, byte[]> b(byte[] bArr) {
        if (f22635b == null || !f22635b.l()) {
            return new Pair<>(Boolean.FALSE, bArr);
        }
        return b.b(this.f22636c, bArr);
    }

    public final Pair<Boolean, byte[]> a(byte[] bArr) {
        if (f22635b == null || !f22635b.l()) {
            return new Pair<>(Boolean.FALSE, bArr);
        }
        return b.a(this.f22636c, bArr);
    }

    public final boolean a(URI uri) {
        boolean z;
        if (uri == null || f22635b == null) {
            Logger.debug();
            return false;
        } else if (!f22635b.l()) {
            Logger.debug();
            return false;
        } else if (!"http".equals(uri.getScheme())) {
            return false;
        } else {
            Set<String> m = f22635b.m();
            if (m == null || m.isEmpty()) {
                Logger.debug();
                return false;
            }
            Iterator<String> it2 = m.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                String next = it2.next();
                if (uri.getHost() != null && uri.getHost().contains(next)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                Logger.debug();
                return false;
            }
            Logger.debug();
            return true;
        }
    }
}
