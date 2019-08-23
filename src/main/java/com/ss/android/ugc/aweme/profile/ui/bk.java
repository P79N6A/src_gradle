package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.widget.c;

public final /* synthetic */ class bk implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62527a;

    /* renamed from: b  reason: collision with root package name */
    private final MyProfileFragment f62528b;

    bk(MyProfileFragment myProfileFragment) {
        this.f62528b = myProfileFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62527a, false, 68565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62527a, false, 68565, new Class[0], Void.TYPE);
            return;
        }
        MyProfileFragment myProfileFragment = this.f62528b;
        MyProfileFragment.O = "click_coupon_bubble";
        myProfileFragment.onMore(myProfileFragment.mMoreView);
    }
}
