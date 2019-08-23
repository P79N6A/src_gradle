package com.ss.android.ugc.aweme.shortvideo.util;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

public class ToolSafeHandler extends SafeHandler {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f71043b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f71044c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f71045a = new int[Lifecycle.Event.values().length];

        static {
            try {
                f71045a[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ToolSafeHandler(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
    }

    public final void a(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f71043b, false, 81042, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f71043b, false, 81042, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        if (!this.f71044c) {
            post(runnable);
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f71043b, false, 81041, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f71043b, false, 81041, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        if (AnonymousClass1.f71045a[event.ordinal()] == 1) {
            a();
            this.f71044c = true;
        }
    }
}
