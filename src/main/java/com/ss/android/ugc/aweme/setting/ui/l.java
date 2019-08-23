package com.ss.android.ugc.aweme.setting.ui;

import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64436a;

    /* renamed from: b  reason: collision with root package name */
    private final DouYinSettingNewVersionActivity f64437b;

    /* renamed from: c  reason: collision with root package name */
    private final String f64438c;

    l(DouYinSettingNewVersionActivity douYinSettingNewVersionActivity, String str) {
        this.f64437b = douYinSettingNewVersionActivity;
        this.f64438c = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f64436a, false, 72510, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64436a, false, 72510, new Class[0], Void.TYPE);
            return;
        }
        DouYinSettingNewVersionActivity douYinSettingNewVersionActivity = this.f64437b;
        String str = this.f64438c;
        if (!StringUtils.isEmpty(str)) {
            douYinSettingNewVersionActivity.mClearCacheItem.setRightText(str);
        }
    }
}
