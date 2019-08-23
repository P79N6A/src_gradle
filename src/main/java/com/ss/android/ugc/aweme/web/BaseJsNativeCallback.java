package com.ss.android.ugc.aweme.web;

import android.arch.lifecycle.LifecycleOwner;
import android.os.ResultReceiver;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.web.IJsCallback;

public abstract class BaseJsNativeCallback<CALLBACK extends IJsCallback> extends BaseLifeCycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76594a;

    /* renamed from: b  reason: collision with root package name */
    public ResultReceiver f76595b;

    /* renamed from: c  reason: collision with root package name */
    private LifecycleOwner f76596c;

    /* access modifiers changed from: package-private */
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner}, this, f76594a, false, 89847, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner}, this, f76594a, false, 89847, new Class[]{LifecycleOwner.class}, Void.TYPE);
            return;
        }
        super.onDestroy(lifecycleOwner);
        this.f76595b = null;
        this.f76596c.getLifecycle().removeObserver(this);
    }
}
