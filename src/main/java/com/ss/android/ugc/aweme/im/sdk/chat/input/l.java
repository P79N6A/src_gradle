package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50652a;

    /* renamed from: b  reason: collision with root package name */
    public View f50653b;

    /* renamed from: c  reason: collision with root package name */
    Activity f50654c;

    /* renamed from: d  reason: collision with root package name */
    PopupWindow f50655d;

    /* renamed from: e  reason: collision with root package name */
    AnimatorSet f50656e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50652a, false, 50631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50652a, false, 50631, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f50654c == null || this.f50654c.isFinishing() || this.f50655d == null)) {
            o.a(this.f50655d);
            this.f50655d = null;
        }
        if (this.f50656e != null) {
            this.f50656e.cancel();
            this.f50656e = null;
        }
        if (this.f50653b != null) {
            this.f50653b.clearAnimation();
            this.f50653b = null;
        }
    }

    public l(@NonNull Activity activity, @NonNull PopupWindow popupWindow, @NonNull View view) {
        this.f50655d = popupWindow;
        this.f50654c = activity;
        this.f50653b = view;
    }
}
