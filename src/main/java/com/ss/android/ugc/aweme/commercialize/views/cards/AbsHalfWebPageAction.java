package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public abstract class AbsHalfWebPageAction implements LifecycleObserver, k {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f2956e;

    /* renamed from: f  reason: collision with root package name */
    protected Context f2957f;
    protected Aweme g;
    protected f h;
    protected LifecycleOwner i;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2956e, false, 33014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2956e, false, 33014, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.a(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2956e, false, 33015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2956e, false, 33015, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.getLifecycle().removeObserver(this);
        }
    }

    public AbsHalfWebPageAction(Context context, Aweme aweme, LifecycleOwner lifecycleOwner, f fVar) {
        this.f2957f = context;
        this.g = aweme;
        this.h = fVar;
        if (lifecycleOwner != null) {
            this.i = lifecycleOwner;
            this.i.getLifecycle().addObserver(this);
        }
    }
}
