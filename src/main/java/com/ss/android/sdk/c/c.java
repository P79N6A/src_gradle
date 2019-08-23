package com.ss.android.sdk.c;

import android.webkit.WebResourceResponse;
import com.bytedance.ies.g.b;
import java.util.List;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.ies.g.a f30732a;

    /* renamed from: b  reason: collision with root package name */
    private a f30733b;

    public interface a {
        WebResourceResponse a(String str);
    }

    public final c a(a aVar) {
        this.f30733b = aVar;
        return this;
    }

    public final c a(b bVar) {
        this.f30732a.a(bVar);
        return this;
    }

    public c(String str) {
        this.f30732a = com.bytedance.ies.g.a.a(str);
    }

    public final c a(List<Pattern> list) {
        this.f30732a.a(list);
        return this;
    }

    public final synchronized WebResourceResponse a(String str) {
        if (this.f30733b != null) {
            WebResourceResponse a2 = this.f30733b.a(str);
            if (a2 != null) {
                return a2;
            }
        }
        try {
            return this.f30732a.b(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final c a(boolean z) {
        this.f30732a.a(z);
        return this;
    }
}
