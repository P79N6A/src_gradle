package com.ss.android.newmedia;

import a.g;
import a.i;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30264a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f30265b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30266c;

    public r(WebView webView, String str) {
        this.f30265b = webView;
        this.f30266c = str;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f30264a, false, 18479, new Class[]{i.class}, Object.class)) {
            return q.a(this.f30265b, this.f30266c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f30264a, false, 18479, new Class[]{i.class}, Object.class);
    }
}
