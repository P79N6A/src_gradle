package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35849a;

    /* renamed from: b  reason: collision with root package name */
    DataCenter f35850b;

    public o(DataCenter dataCenter) {
        this.f35850b = dataCenter;
    }

    public final void a(WeakReference<Activity> weakReference) {
        WeakReference<Activity> weakReference2 = weakReference;
        if (PatchProxy.isSupport(new Object[]{weakReference2}, this, f35849a, false, 26752, new Class[]{WeakReference.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{weakReference2}, this, f35849a, false, 26752, new Class[]{WeakReference.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new p<TResult>(weakReference2)).a((g<TResult, TContinuationResult>) new q<TResult,TContinuationResult>(this, weakReference2), i.f1052b);
    }
}
