package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ies.geckoclient.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ad implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64408a;

    /* renamed from: b  reason: collision with root package name */
    private final TestSettingActivity f64409b;

    ad(TestSettingActivity testSettingActivity) {
        this.f64409b = testSettingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64408a, false, 72827, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64408a, false, 72827, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TestSettingActivity testSettingActivity = this.f64409b;
        switch (i) {
            case 0:
                testSettingActivity.i().a("shadow_landing", (a<Boolean>) null);
                return;
            case 1:
                testSettingActivity.h().a("ad_landing_6701114664027160583", (a<Boolean>) null);
                return;
            case 2:
                com.bytedance.ies.dmt.ui.d.a.b((Context) testSettingActivity, testSettingActivity.i().b("shadow_landing") ? "存在" : "不存在").a();
                return;
            case 3:
                com.bytedance.ies.dmt.ui.d.a.b((Context) testSettingActivity, testSettingActivity.h().b("ad_landing_6701114664027160583") ? "存在" : "不存在").a();
                break;
        }
    }
}
