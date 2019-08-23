package com.ss.android.ugc.aweme.utils;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@TargetApi(21)
public final class dp extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75759a;

    /* renamed from: b  reason: collision with root package name */
    private int f75760b;

    public dp(int i) {
        this.f75760b = i;
    }

    public final void getOutline(View view, Outline outline) {
        if (PatchProxy.isSupport(new Object[]{view, outline}, this, f75759a, false, 88530, new Class[]{View.class, Outline.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, outline}, this, f75759a, false, 88530, new Class[]{View.class, Outline.class}, Void.TYPE);
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f75760b);
    }
}
