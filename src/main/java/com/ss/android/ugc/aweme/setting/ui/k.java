package com.ss.android.ugc.aweme.setting.ui;

import a.g;
import a.i;
import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64434a;

    /* renamed from: b  reason: collision with root package name */
    private final DouYinSettingNewVersionActivity f64435b;

    k(DouYinSettingNewVersionActivity douYinSettingNewVersionActivity) {
        this.f64435b = douYinSettingNewVersionActivity;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64434a, false, 72509, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64434a, false, 72509, new Class[]{i.class}, Object.class);
        }
        DouYinSettingNewVersionActivity douYinSettingNewVersionActivity = this.f64435b;
        if (iVar.b()) {
            a.a((Context) douYinSettingNewVersionActivity, (int) C0906R.string.ta);
            douYinSettingNewVersionActivity.mClearCacheItem.setRightText("0 M");
        }
        return null;
    }
}
