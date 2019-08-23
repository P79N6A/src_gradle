package com.ss.android.ugc.aweme.util;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class KeyBoardMonitor implements LifecycleObserver, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4283a;

    /* renamed from: b  reason: collision with root package name */
    public View f4284b;

    /* renamed from: c  reason: collision with root package name */
    public a f4285c;

    public interface a {
        void a();

        void b();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4283a, false, 87814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4283a, false, 87814, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f4283a, false, 87813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4283a, false, 87813, new Class[0], Void.TYPE);
            return;
        }
        if (this.f4284b != null) {
            this.f4284b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        if (PatchProxy.isSupport(new Object[0], this, f4283a, false, 87815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4283a, false, 87815, new Class[0], Void.TYPE);
            return;
        }
        Rect rect = new Rect();
        this.f4284b.getWindowVisibleDisplayFrame(rect);
        if (((float) (this.f4284b.getBottom() - rect.bottom)) > this.f4284b.getResources().getDisplayMetrics().density * 100.0f) {
            this.f4285c.a();
        } else {
            this.f4285c.b();
        }
    }

    public KeyBoardMonitor(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }
}
