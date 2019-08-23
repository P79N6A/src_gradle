package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SafeHandler extends Handler implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65396a;

    /* renamed from: b  reason: collision with root package name */
    private final LifecycleOwner f65397b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.SafeHandler$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65398a = new int[Lifecycle.Event.values().length];

        static {
            try {
                f65398a[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65396a, false, 74518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65396a, false, 74518, new Class[0], Void.TYPE);
            return;
        }
        removeCallbacksAndMessages(null);
        if (PatchProxy.isSupport(new Object[0], this, f65396a, false, 74521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65396a, false, 74521, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65397b != null) {
            this.f65397b.getLifecycle().removeObserver(this);
        }
    }

    public SafeHandler(LifecycleOwner lifecycleOwner) {
        super(Looper.getMainLooper());
        this.f65397b = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[0], this, f65396a, false, 74520, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65396a, false, 74520, new Class[0], Void.TYPE);
            return;
        }
        if (this.f65397b != null) {
            this.f65397b.getLifecycle().addObserver(this);
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f65396a, false, 74519, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f65396a, false, 74519, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        if (AnonymousClass1.f65398a[event.ordinal()] == 1) {
            a();
        }
    }
}
