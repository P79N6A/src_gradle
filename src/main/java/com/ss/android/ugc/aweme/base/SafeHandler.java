package com.ss.android.ugc.aweme.base;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SafeHandler extends Handler implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34472a;

    /* renamed from: b  reason: collision with root package name */
    private final LifecycleOwner f34473b;

    /* renamed from: com.ss.android.ugc.aweme.base.SafeHandler$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34474a = new int[Lifecycle.Event.values().length];

        static {
            try {
                f34474a[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        super(Looper.getMainLooper());
        this.f34473b = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[0], this, f34472a, false, 24010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34472a, false, 24010, new Class[0], Void.TYPE);
            return;
        }
        if (this.f34473b != null) {
            this.f34473b.getLifecycle().addObserver(this);
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f34472a, false, 24009, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f34472a, false, 24009, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        if (AnonymousClass1.f34474a[event.ordinal()] == 1) {
            if (PatchProxy.isSupport(new Object[0], this, f34472a, false, 24008, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34472a, false, 24008, new Class[0], Void.TYPE);
                return;
            }
            removeCallbacksAndMessages(null);
            if (PatchProxy.isSupport(new Object[0], this, f34472a, false, 24011, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f34472a, false, 24011, new Class[0], Void.TYPE);
            } else if (this.f34473b != null) {
                this.f34473b.getLifecycle().removeObserver(this);
            }
        }
    }
}
