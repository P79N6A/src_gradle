package com.ss.android.ugc.aweme.main.base;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TabAlphaController extends Handler implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3532a;

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f3533d = {"SM-G9500", "SM-G9550", "SM-G9600", "SM-G9608", "SM-G9650", "SM-N9500"};
    @SuppressLint({"all"})

    /* renamed from: e  reason: collision with root package name */
    private static TabAlphaController f3534e;

    /* renamed from: b  reason: collision with root package name */
    public View f3535b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3536c;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3537f;

    private TabAlphaController() {
        if (TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            for (String equals : f3533d) {
                if (TextUtils.equals(equals, Build.MODEL)) {
                    this.f3537f = true;
                    return;
                }
            }
        }
    }

    public static TabAlphaController a() {
        if (PatchProxy.isSupport(new Object[0], null, f3532a, true, 57789, new Class[0], TabAlphaController.class)) {
            return (TabAlphaController) PatchProxy.accessDispatch(new Object[0], null, f3532a, true, 57789, new Class[0], TabAlphaController.class);
        }
        if (f3534e == null) {
            f3534e = new TabAlphaController();
        }
        return f3534e;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3532a, false, 57793, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3532a, false, 57793, new Class[0], Void.TYPE);
            return;
        }
        if (hasMessages(1)) {
            removeMessages(1);
        }
        this.f3535b = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3532a, false, 57792, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3532a, false, 57792, new Class[0], Void.TYPE);
            return;
        }
        a(false);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner}, this, f3532a, false, 57791, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner}, this, f3532a, false, 57791, new Class[]{LifecycleOwner.class}, Void.TYPE);
            return;
        }
        a(true);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3532a, false, 57794, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3532a, false, 57794, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f3535b != null && this.f3537f) {
            if (!z || this.f3536c) {
                if (hasMessages(1)) {
                    removeMessages(1);
                }
            } else if (!hasMessages(1)) {
                sendEmptyMessageDelayed(1, 1200000);
            }
        }
    }

    public void handleMessage(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f3532a, false, 57790, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f3532a, false, 57790, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 1 && this.f3535b != null && !this.f3536c) {
            this.f3535b.setAlpha(this.f3535b.getAlpha() / 2.0f);
            this.f3536c = true;
        }
    }
}
