package io.fabric.sdk.android.services.d;

import io.fabric.sdk.android.l;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final l f83265a;

    /* renamed from: b  reason: collision with root package name */
    private f f83266b;

    /* renamed from: c  reason: collision with root package name */
    private SSLSocketFactory f83267c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f83268d;

    public b() {
        this(new io.fabric.sdk.android.b());
    }

    private synchronized void a() {
        this.f83268d = false;
        this.f83267c = null;
    }

    private synchronized SSLSocketFactory b() {
        if (this.f83267c == null && !this.f83268d) {
            this.f83267c = c();
        }
        return this.f83267c;
    }

    private synchronized SSLSocketFactory c() {
        SSLContext instance;
        this.f83268d = true;
        try {
            f fVar = this.f83266b;
            instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new g(new h(fVar.getKeyStoreStream(), fVar.getKeyStorePassword()), fVar)}, null);
        } catch (Exception unused) {
            return null;
        }
        return instance.getSocketFactory();
    }

    public b(l lVar) {
        this.f83265a = lVar;
    }

    private static boolean a(String str) {
        if (str == null || !str.toLowerCase(Locale.US).startsWith("https")) {
            return false;
        }
        return true;
    }

    public final void a(f fVar) {
        if (this.f83266b != fVar) {
            this.f83266b = fVar;
            a();
        }
    }

    public final d a(c cVar, String str) {
        return a(cVar, str, Collections.emptyMap());
    }

    public final d a(c cVar, String str, Map<String, String> map) {
        d dVar;
        switch (cVar) {
            case GET:
                dVar = d.a((CharSequence) str, map, true);
                break;
            case POST:
                dVar = d.b((CharSequence) str, map, true);
                break;
            case PUT:
                dVar = d.a((CharSequence) str);
                break;
            case DELETE:
                dVar = d.b((CharSequence) str);
                break;
            default:
                throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (a(str) && this.f83266b != null) {
            SSLSocketFactory b2 = b();
            if (b2 != null) {
                ((HttpsURLConnection) dVar.a()).setSSLSocketFactory(b2);
            }
        }
        return dVar;
    }
}
