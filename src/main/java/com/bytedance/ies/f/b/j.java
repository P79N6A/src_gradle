package com.bytedance.ies.f.b;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    WebView f20658a;

    /* renamed from: b  reason: collision with root package name */
    String f20659b = "IESJSBridge";

    /* renamed from: c  reason: collision with root package name */
    Set<String> f20660c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    Set<String> f20661d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    k f20662e;

    /* renamed from: f  reason: collision with root package name */
    Context f20663f;
    boolean g;
    boolean h;

    private void b() {
        if (this.f20658a == null || TextUtils.isEmpty(this.f20659b) || this.f20662e == null || this.f20660c.isEmpty()) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public final o a() {
        b();
        return new o(this);
    }

    public final j a(@NonNull Context context) {
        this.f20663f = context;
        return this;
    }

    public final j b(boolean z) {
        this.h = true;
        return this;
    }

    public final j a(@NonNull k kVar) {
        this.f20662e = kVar;
        return this;
    }

    public final j b(@NonNull Collection<String> collection) {
        this.f20661d.addAll(collection);
        return this;
    }

    public final j a(String str) {
        this.f20659b = str;
        return this;
    }

    j(@NonNull WebView webView) {
        this.f20658a = webView;
    }

    public final j a(@NonNull Collection<String> collection) {
        this.f20660c.addAll(collection);
        return this;
    }

    public final j a(boolean z) {
        this.g = false;
        return this;
    }
}
