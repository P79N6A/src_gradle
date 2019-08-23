package com.ss.android.ugc.aweme.feed.adapter;

import android.graphics.Point;
import android.view.View;
import com.bytedance.ies.dmt.ui.base.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ai implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44884a;

    /* renamed from: b  reason: collision with root package name */
    private final View f44885b;

    ai(View view) {
        this.f44885b = view;
    }

    public final Object a() {
        if (PatchProxy.isSupport(new Object[0], this, f44884a, false, 40855, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f44884a, false, 40855, new Class[0], Object.class);
        }
        int[] iArr = new int[2];
        this.f44885b.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }
}
