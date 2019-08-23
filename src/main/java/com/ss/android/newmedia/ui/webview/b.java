package com.ss.android.newmedia.ui.webview;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.ui.webview.a;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30381a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f30382b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30383c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30384d;

    b(Context context, String str, String str2) {
        this.f30382b = context;
        this.f30383c = str;
        this.f30384d = str2;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f30381a, false, 18883, new Class[0], Object.class)) {
            return a.AnonymousClass1.AnonymousClass1.a(this.f30382b, this.f30383c, this.f30384d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f30381a, false, 18883, new Class[0], Object.class);
    }
}
