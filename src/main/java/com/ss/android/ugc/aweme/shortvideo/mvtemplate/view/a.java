package com.ss.android.ugc.aweme.shortvideo.mvtemplate.view;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@TargetApi(21)
public final class a extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68732a;

    /* renamed from: b  reason: collision with root package name */
    private int f68733b;

    public a(int i) {
        this.f68733b = i;
    }

    public final void getOutline(View view, Outline outline) {
        if (PatchProxy.isSupport(new Object[]{view, outline}, this, f68732a, false, 78111, new Class[]{View.class, Outline.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, outline}, this, f68732a, false, 78111, new Class[]{View.class, Outline.class}, Void.TYPE);
            return;
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f68733b);
    }
}
