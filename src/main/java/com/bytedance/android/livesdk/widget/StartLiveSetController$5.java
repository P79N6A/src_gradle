package com.bytedance.android.livesdk.widget;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class StartLiveSetController$5 implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f1866a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseDialogFragment f1867b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ aa f1868c;

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f1866a, false, 14708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1866a, false, 14708, new Class[0], Void.TYPE);
            return;
        }
        this.f1867b.getDialog().setOnDismissListener(new an(this));
    }

    StartLiveSetController$5(aa aaVar, BaseDialogFragment baseDialogFragment) {
        this.f1868c = aaVar;
        this.f1867b = baseDialogFragment;
    }
}
