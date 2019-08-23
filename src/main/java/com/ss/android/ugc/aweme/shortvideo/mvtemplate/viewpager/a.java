package com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.fc;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68775a;

    /* renamed from: b  reason: collision with root package name */
    private final MvItemFragment f68776b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f68777c;

    a(MvItemFragment mvItemFragment, ViewGroup viewGroup) {
        this.f68776b = mvItemFragment;
        this.f68777c = viewGroup;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68775a, false, 78144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68775a, false, 78144, new Class[0], Void.TYPE);
            return;
        }
        MvItemFragment mvItemFragment = this.f68776b;
        ViewGroup viewGroup = this.f68777c;
        if (viewGroup != null) {
            int b2 = (fc.b(mvItemFragment.h.getContext()) - mvItemFragment.h.getMeasuredWidth()) / 2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.leftMargin = b2;
            layoutParams.rightMargin = b2;
            viewGroup.setLayoutParams(layoutParams);
        }
    }
}
