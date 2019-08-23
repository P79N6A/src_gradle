package com.ss.android.ugc.aweme.discover.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.ae;

public final class ax {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43139a;

    /* renamed from: b  reason: collision with root package name */
    final View f43140b;

    /* renamed from: c  reason: collision with root package name */
    final TextView f43141c;

    /* renamed from: d  reason: collision with root package name */
    final View f43142d;

    /* renamed from: e  reason: collision with root package name */
    TextView f43143e;

    /* renamed from: f  reason: collision with root package name */
    Context f43144f;
    ViewGroup g;
    public ae h;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43139a, false, 38034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43139a, false, 38034, new Class[0], Void.TYPE);
            return;
        }
        this.g.setVisibility(8);
    }

    public ax(Context context, ViewGroup viewGroup) {
        this.f43144f = context;
        this.g = viewGroup;
        this.f43140b = viewGroup.findViewById(C0906R.id.c5d);
        this.f43141c = (TextView) viewGroup.findViewById(C0906R.id.c5e);
        this.f43142d = viewGroup.findViewById(C0906R.id.c5f);
        this.f43143e = (TextView) viewGroup.findViewById(C0906R.id.daz);
    }
}
