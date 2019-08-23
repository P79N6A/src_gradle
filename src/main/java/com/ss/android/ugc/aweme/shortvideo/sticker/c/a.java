package com.ss.android.ugc.aweme.shortvideo.sticker.c;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69489a;

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f69489a, false, 79829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69489a, false, 79829, new Class[0], Void.TYPE);
            return;
        }
        this.f69491c.d();
        d();
    }

    public a(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull View view2) {
        super(frameLayout, view, view2);
    }
}
