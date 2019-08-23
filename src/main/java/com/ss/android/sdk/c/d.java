package com.ss.android.sdk.c;

import android.webkit.WebResourceResponse;
import com.ss.android.sdk.c.c;
import java.util.LinkedHashSet;
import java.util.Set;

public class d implements c.a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f30734b;

    /* renamed from: a  reason: collision with root package name */
    public Set<c.a> f30735a = new LinkedHashSet();

    private d() {
    }

    public static d a() {
        if (f30734b == null) {
            synchronized (d.class) {
                if (f30734b == null) {
                    f30734b = new d();
                }
            }
        }
        return f30734b;
    }

    public final WebResourceResponse a(String str) {
        WebResourceResponse webResourceResponse = null;
        if (this.f30735a.isEmpty()) {
            return null;
        }
        for (c.a a2 : this.f30735a) {
            webResourceResponse = a2.a(str);
            if (webResourceResponse != null) {
                break;
            }
        }
        return webResourceResponse;
    }
}
