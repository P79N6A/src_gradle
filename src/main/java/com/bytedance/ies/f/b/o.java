package com.bytedance.ies.f.b;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.webkit.WebView;
import com.bytedance.ies.f.b.c;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public e f20676a;

    /* renamed from: b  reason: collision with root package name */
    public g f20677b;

    /* renamed from: c  reason: collision with root package name */
    public WebView f20678c;

    /* renamed from: d  reason: collision with root package name */
    public m f20679d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f20680e;

    private void b() {
        if (this.f20680e) {
            throw new IllegalStateException("JsBridge2 is already released!!!");
        }
    }

    public final void a() {
        b();
        this.f20676a.a();
        this.f20677b.a();
        this.f20678c = null;
        this.f20680e = true;
    }

    public static j a(WebView webView) {
        return new j(webView);
    }

    o(j jVar) {
        this.f20677b = new g(jVar);
        this.f20676a = new e(jVar);
        this.f20678c = jVar.f20658a;
        this.f20677b.f20644a = this.f20676a;
        this.f20676a.f20634e = this.f20677b;
        i.f20657a = jVar.g;
        t.f20691a = jVar.h;
    }

    @AnyThread
    public final <T> void a(@NonNull String str, @Nullable T t) {
        b();
        this.f20677b.a(str, t);
    }

    @UiThread
    @NonNull
    public final o a(String str, @NonNull c.b bVar) {
        b();
        this.f20677b.a(str, bVar);
        if (this.f20679d != null) {
            this.f20679d.a(str);
        }
        return this;
    }

    @UiThread
    @NonNull
    public final o a(String str, @NonNull d<?, ?> dVar) {
        b();
        this.f20677b.a(str, dVar);
        if (this.f20679d != null) {
            this.f20679d.a(str);
        }
        return this;
    }
}
