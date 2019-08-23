package com.ss.android.ugc.aweme.face2face.widget;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.google.common.collect.by;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.a.g;
import com.ss.android.ugc.aweme.face2face.a.h;
import com.ss.android.ugc.aweme.face2face.a.i;
import com.ss.android.ugc.aweme.face2face.net.b;
import java.util.Set;

public class Face2FaceNoticeWidget implements LifecycleObserver, i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3104a;

    /* renamed from: b  reason: collision with root package name */
    public b f3105b;

    /* renamed from: c  reason: collision with root package name */
    public Set<b> f3106c = by.b();

    /* renamed from: d  reason: collision with root package name */
    private boolean f3107d;

    /* renamed from: e  reason: collision with root package name */
    private g f3108e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3104a, false, 39323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3104a, false, 39323, new Class[0], Void.TYPE);
            return;
        }
        this.f3107d = false;
        this.f3105b = null;
        b();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3104a, false, 39324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3104a, false, 39324, new Class[0], Void.TYPE);
            return;
        }
        this.f3106c.clear();
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3104a, false, 39322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3104a, false, 39322, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f3106c.isEmpty() && !this.f3107d) {
            this.f3105b = this.f3106c.iterator().next();
            this.f3106c.remove(this.f3105b);
            h a2 = this.f3108e.a(this.f3105b);
            this.f3107d = true;
            a2.a(this.f3105b, this);
        }
    }

    public Face2FaceNoticeWidget(@NonNull FragmentActivity fragmentActivity) {
        this.f3108e = new g(fragmentActivity, this);
        fragmentActivity.getLifecycle().addObserver(this);
    }
}
