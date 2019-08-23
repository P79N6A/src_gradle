package com.ss.android.ugc.aweme.share.c;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64879a;

    /* renamed from: b  reason: collision with root package name */
    private final View f64880b;

    c(View view) {
        this.f64880b = view;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f64879a, false, 73745, new Class[0], Object.class)) {
            return b.a(this.f64880b);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f64879a, false, 73745, new Class[0], Object.class);
    }
}
