package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class cj extends IShareService.ShareBar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64970a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f64971b;

    public cj(Activity activity) {
        super(activity);
        this.f64971b = activity;
        setOrientation(0);
    }
}
