package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.captcha.a;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public class CaptchaLifeCycleObserver implements GenericLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3505a;

    /* renamed from: b  reason: collision with root package name */
    MainActivity f3506b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3507c;

    /* renamed from: d  reason: collision with root package name */
    private a f3508d;

    CaptchaLifeCycleObserver(MainActivity mainActivity) {
        this.f3506b = mainActivity;
    }

    @Subscribe
    public void onCaptchaConsumerEvent(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3505a, false, 57015, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3505a, false, 57015, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            if (this.f3506b != null) {
                aVar.accept(this.f3506b);
                this.f3508d = null;
                return;
            }
            this.f3507c = true;
            this.f3508d = aVar;
        }
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f3505a, false, 57016, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f3505a, false, 57016, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
            return;
        }
        switch (event) {
            case ON_CREATE:
                if (PatchProxy.isSupport(new Object[0], this, f3505a, false, 57012, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3505a, false, 57012, new Class[0], Void.TYPE);
                    break;
                } else {
                    bg.c(this);
                    return;
                }
            case ON_RESUME:
                if (PatchProxy.isSupport(new Object[0], this, f3505a, false, 57013, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3505a, false, 57013, new Class[0], Void.TYPE);
                    break;
                } else {
                    if (this.f3507c && this.f3508d != null) {
                        this.f3508d.accept(this.f3506b);
                        this.f3508d = null;
                        this.f3507c = false;
                    }
                    return;
                }
            case ON_DESTROY:
                if (!PatchProxy.isSupport(new Object[0], this, f3505a, false, 57014, new Class[0], Void.TYPE)) {
                    bg.d(this);
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f3505a, false, 57014, new Class[0], Void.TYPE);
                    return;
                }
        }
    }
}
