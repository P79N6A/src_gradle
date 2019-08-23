package com.bytedance.android.livesdk.chatroom.c;

import android.support.annotation.IdRes;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.c.c;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9873a;

    /* renamed from: b  reason: collision with root package name */
    Set<c> f9874b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private View f9875c;

    /* renamed from: d  reason: collision with root package name */
    private DataCenter f9876d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9873a, false, 4309, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9873a, false, 4309, new Class[0], Void.TYPE);
            return;
        }
        for (c next : this.f9874b) {
            if (PatchProxy.isSupport(new Object[0], next, c.f9859a, false, 4297, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], next, c.f9859a, false, 4297, new Class[0], Void.TYPE);
            } else {
                next.f9860b.removeObserver(next);
                next.f9862d.clear();
            }
        }
        this.f9874b.clear();
    }

    public final <V extends View> c.a<V> a(@IdRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f9873a, false, 4307, new Class[]{Integer.TYPE}, c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f9873a, false, 4307, new Class[]{Integer.TYPE}, c.a.class);
        } else if (this.f9875c != null) {
            View findViewById = this.f9875c.findViewById(i);
            if (!PatchProxy.isSupport(new Object[]{findViewById}, this, f9873a, false, 4306, new Class[]{View.class}, c.a.class)) {
                return new c.a<>(this.f9876d, findViewById, this);
            }
            return (c.a) PatchProxy.accessDispatch(new Object[]{findViewById}, this, f9873a, false, 4306, new Class[]{View.class}, c.a.class);
        } else {
            throw new IllegalStateException("Unable to find view by id due to null root view.");
        }
    }

    public d(DataCenter dataCenter, View view) {
        this.f9876d = dataCenter;
        this.f9875c = view;
    }
}
