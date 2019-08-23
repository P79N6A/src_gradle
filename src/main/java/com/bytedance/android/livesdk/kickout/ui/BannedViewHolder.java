package com.bytedance.android.livesdk.kickout.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.b.f;
import com.bytedance.android.livesdk.kickout.a;
import com.bytedance.android.livesdk.kickout.b;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class BannedViewHolder extends RecyclerView.ViewHolder implements f, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15748a;

    /* renamed from: b  reason: collision with root package name */
    VHeadView f15749b;

    /* renamed from: c  reason: collision with root package name */
    TextView f15750c;

    /* renamed from: d  reason: collision with root package name */
    View f15751d;

    /* renamed from: e  reason: collision with root package name */
    TextView f15752e;

    /* renamed from: f  reason: collision with root package name */
    public HSImageView f15753f;
    Context g;
    List<User> h = new ArrayList();
    String i;
    a j;
    com.bytedance.android.livesdk.b.a k;
    User l;
    long m;

    public final void a() {
    }

    public final void a(com.bytedance.android.livesdk.kickout.b.a aVar, Exception exc) {
    }

    public final void b() {
    }

    public final void b(boolean z, Exception exc) {
    }

    /* access modifiers changed from: package-private */
    public String a(User user) {
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f15748a, false, 10217, new Class[]{User.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{user2}, this, f15748a, false, 10217, new Class[]{User.class}, String.class);
        } else if (user2 == null) {
            return null;
        } else {
            if (com.bytedance.android.live.uikit.a.a.h()) {
                return user2.displayId;
            }
            return user.getNickName();
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15748a, false, 10214, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15748a, false, 10214, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            this.f15750c.setVisibility(0);
            this.f15751d.setVisibility(8);
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.kickout.a.b(false, this.l.getId()));
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f15748a, false, 10216, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f15748a, false, 10216, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.kickout.a.a(false, this.l.getId()));
            this.f15750c.setVisibility(0);
            this.f15751d.setVisibility(8);
        }
    }

    public final void a(boolean z, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), exc}, this, f15748a, false, 10215, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), exc}, this, f15748a, false, 10215, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE);
            return;
        }
        if (!z) {
            this.f15750c.setVisibility(0);
            this.f15751d.setVisibility(8);
            l.a(this.g, exc);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannedViewHolder(Context context, View view, String str, long j2) {
        super(view);
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f15748a, false, 10210, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f15748a, false, 10210, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f15749b = (VHeadView) view.findViewById(C0906R.id.ank);
            this.f15750c = (TextView) view.findViewById(C0906R.id.q6);
            this.f15751d = view.findViewById(C0906R.id.q_);
            this.f15752e = (TextView) view.findViewById(C0906R.id.dq2);
            this.f15753f = (HSImageView) view.findViewById(C0906R.id.dpb);
        }
        this.g = context;
        this.i = str;
        this.m = j2;
        this.j = new a();
        this.j.f15728b = this;
        this.k = new com.bytedance.android.livesdk.b.a();
        this.k.f9083b = this;
    }
}
