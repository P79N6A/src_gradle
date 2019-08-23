package com.amap.api.mapcore2d;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class ep {

    /* renamed from: a  reason: collision with root package name */
    private static ep f6073a;

    public interface a {
        URLConnection a(Proxy proxy, URL url);
    }

    public static ep a() {
        if (f6073a == null) {
            f6073a = new ep();
        }
        return f6073a;
    }

    public byte[] a(ev evVar) throws co {
        try {
            ex a2 = a(evVar, false);
            if (a2 != null) {
                return a2.f6094a;
            }
            return null;
        } catch (co e2) {
            throw e2;
        } catch (Throwable th) {
            dd.a(th, "BaseNetManager", "makeSyncPostRequest");
            throw new co("未知的错误");
        }
    }

    /* access modifiers changed from: protected */
    public void b(ev evVar) throws co {
        if (evVar == null) {
            throw new co("requeust is null");
        } else if (evVar.g() == null || "".equals(evVar.g())) {
            throw new co("request url is empty");
        }
    }

    public ex a(ev evVar, boolean z) throws co {
        Proxy proxy;
        try {
            b(evVar);
            if (evVar.f6093e == null) {
                proxy = null;
            } else {
                proxy = evVar.f6093e;
            }
            return new es(evVar.f6091c, evVar.f6092d, proxy, z).a(evVar.l(), evVar.e(), evVar.m());
        } catch (co e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new co("未知的错误");
        }
    }
}
