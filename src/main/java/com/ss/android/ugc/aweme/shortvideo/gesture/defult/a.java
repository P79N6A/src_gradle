package com.ss.android.ugc.aweme.shortvideo.gesture.defult;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67910a;

    /* renamed from: b  reason: collision with root package name */
    private final DefaultGesturePresenter f67911b;

    /* renamed from: c  reason: collision with root package name */
    private final View f67912c;

    a(DefaultGesturePresenter defaultGesturePresenter, View view) {
        this.f67911b = defaultGesturePresenter;
        this.f67912c = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67910a, false, 77392, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67910a, false, 77392, new Class[0], Void.TYPE);
            return;
        }
        this.f67911b.f67906c.setProtectY((float) this.f67912c.getBottom());
    }
}
