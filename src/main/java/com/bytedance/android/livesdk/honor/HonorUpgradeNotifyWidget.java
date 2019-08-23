package com.bytedance.android.livesdk.honor;

import android.support.annotation.Nullable;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.viewmodule.am;
import com.bytedance.android.livesdk.honor.a;
import com.bytedance.android.livesdk.message.model.ag;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class HonorUpgradeNotifyWidget extends LiveRecyclableWidget implements a.C0109a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15520a;

    /* renamed from: b  reason: collision with root package name */
    private a f15521b;

    /* renamed from: c  reason: collision with root package name */
    private b f15522c;

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f15520a, false, 10155, new Class[0], String.class)) {
            return am.a(this);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f15520a, false, 10155, new Class[0], String.class);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f15520a, false, 10156, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f15520a, false, 10156, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        am.a(this, th);
    }

    public void onInit(@Nullable Object[] objArr) {
    }

    public void onUnload() {
        if (PatchProxy.isSupport(new Object[0], this, f15520a, false, 10153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15520a, false, 10153, new Class[0], Void.TYPE);
            return;
        }
        if (this.f15521b != null) {
            this.f15521b.d();
        }
    }

    public final void a(ag agVar) {
        ag agVar2 = agVar;
        if (PatchProxy.isSupport(new Object[]{agVar2}, this, f15520a, false, 10154, new Class[]{ag.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{agVar2}, this, f15520a, false, 10154, new Class[]{ag.class}, Void.TYPE);
            return;
        }
        this.f15522c.a(agVar2);
    }

    public void onLoad(@Nullable Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f15520a, false, 10152, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f15520a, false, 10152, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        this.f15521b = new a();
        this.f15521b.a((a.C0109a) this);
        this.f15522c = new b(getContext(), false, this.f15521b);
        if (this.containerView != null) {
            this.containerView.addView(this.f15522c, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
