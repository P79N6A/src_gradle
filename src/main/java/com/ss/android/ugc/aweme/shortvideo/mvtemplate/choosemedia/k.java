package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.p;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68608a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChoosePhotoActivity f68609b;

    k(MvChoosePhotoActivity mvChoosePhotoActivity) {
        this.f68609b = mvChoosePhotoActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f68608a, false, 77967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68608a, false, 77967, new Class[0], Void.TYPE);
            return;
        }
        MvChoosePhotoActivity mvChoosePhotoActivity = this.f68609b;
        int measuredWidth = mvChoosePhotoActivity.f68527b.getMeasuredWidth();
        mvChoosePhotoActivity.f68528c.setMaxWidth((p.b(mvChoosePhotoActivity) - (measuredWidth * 2)) - ((int) UIUtils.dip2Px(mvChoosePhotoActivity, 60.0f)));
        mvChoosePhotoActivity.f68527b.setVisibility(8);
        mvChoosePhotoActivity.f68527b.setTextSize(1, 17.0f);
    }
}
