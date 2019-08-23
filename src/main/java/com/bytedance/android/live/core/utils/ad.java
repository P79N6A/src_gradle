package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.android.live.core.utils.SlideFinishUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ad implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8234a;

    /* renamed from: b  reason: collision with root package name */
    private final SlideFinishUtil.MFrameLayout f8235b;

    ad(SlideFinishUtil.MFrameLayout mFrameLayout) {
        this.f8235b = mFrameLayout;
    }

    public final void accept(Object obj) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8234a, false, 1275, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8234a, false, 1275, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        SlideFinishUtil.MFrameLayout mFrameLayout = this.f8235b;
        if (!mFrameLayout.f8205c) {
            Object tag = mFrameLayout.getTag(C0906R.id.d6z);
            if (tag instanceof Activity) {
                Activity activity = (Activity) tag;
                if (PatchProxy.isSupport(new Object[]{activity}, null, SlideFinishUtil.f8200a, true, 1271, new Class[]{Activity.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{activity}, null, SlideFinishUtil.f8200a, true, 1271, new Class[]{Activity.class}, Boolean.TYPE)).booleanValue();
                } else if (activity != null && ((Boolean) SlideFinishUtil.f8201b.a()).booleanValue()) {
                    if (!SlideFinishUtil.f8202c.contains(activity.getClass())) {
                        z = true;
                    }
                }
                if (z) {
                    activity.onBackPressed();
                    mFrameLayout.f8204b = true;
                }
            } else if (tag instanceof Dialog) {
                ((Dialog) tag).onBackPressed();
                mFrameLayout.f8204b = true;
            }
        }
    }
}
