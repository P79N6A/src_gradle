package com.ss.android.ugc.aweme.miniapp;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.option.share.OnShareDialogEventListener;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55739a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f55740b;

    /* renamed from: c  reason: collision with root package name */
    private final OnShareDialogEventListener f55741c;

    e(Activity activity, OnShareDialogEventListener onShareDialogEventListener) {
        this.f55740b = activity;
        this.f55741c = onShareDialogEventListener;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f55739a, false, 59012, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f55739a, false, 59012, new Class[0], Object.class);
        }
        q.a().i.a(this.f55740b, this.f55741c);
        return null;
    }
}
