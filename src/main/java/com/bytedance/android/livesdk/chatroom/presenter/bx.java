package com.bytedance.android.livesdk.chatroom.presenter;

import android.annotation.SuppressLint;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;
import com.bytedance.android.live.core.rxutils.autodispose.a;
import com.bytedance.android.live.core.rxutils.autodispose.ae;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.rxutils.autodispose.m;
import com.bytedance.android.live.core.rxutils.f;
import com.bytedance.android.live.core.rxutils.g;
import com.bytedance.android.livesdk.chatroom.viewmodule.al;
import com.bytedance.ies.a.b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public abstract class bx<T extends al> extends b<T> {
    public static ChangeQuickRedirect w;

    /* renamed from: a  reason: collision with root package name */
    private g f11335a;
    protected DataCenter x;
    protected IMessageManager y;

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 5336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, w, false, 5336, new Class[0], Void.TYPE);
            return;
        }
        if (this instanceof OnMessageListener) {
            this.y.removeMessageListener((OnMessageListener) this);
        }
        this.x = null;
        super.d();
    }

    public String f() {
        if (!PatchProxy.isSupport(new Object[0], this, w, false, 5339, new Class[0], String.class)) {
            return getClass().getName();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, w, false, 5339, new Class[0], String.class);
    }

    public final <D> m<D> o() {
        if (!PatchProxy.isSupport(new Object[0], this, w, false, 5337, new Class[0], m.class)) {
            return e.a((LifecycleOwner) b());
        }
        return (m) PatchProxy.accessDispatch(new Object[0], this, w, false, 5337, new Class[0], m.class);
    }

    public final <D> m<D> p() {
        if (PatchProxy.isSupport(new Object[0], this, w, false, 5338, new Class[0], m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[0], this, w, false, 5338, new Class[0], m.class);
        }
        if (this.f11335a == null) {
            this.f11335a = new g();
        }
        return e.a((ae) a.a((LifecycleOwner) b(), Lifecycle.Event.ON_DESTROY), (f<T>) this.f11335a);
    }

    @SuppressLint({"InflateParams", "SetTextI18n"})
    public final void b(@NonNull Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, w, false, 5340, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, w, false, 5340, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.live.core.c.a.a(6, f(), th.getStackTrace());
    }

    public void a(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, w, false, 5335, new Class[]{al.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, w, false, 5335, new Class[]{al.class}, Void.TYPE);
            return;
        }
        super.a(t);
        this.x = t.getDataCenter();
        this.y = (IMessageManager) this.x.get("data_message_manager");
    }
}
