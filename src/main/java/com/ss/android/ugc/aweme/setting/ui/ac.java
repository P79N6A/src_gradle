package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.k;
import com.ss.android.ugc.playerkit.c.c;

public final /* synthetic */ class ac implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64406a;

    /* renamed from: b  reason: collision with root package name */
    private final TestSettingActivity f64407b;

    ac(TestSettingActivity testSettingActivity) {
        this.f64407b = testSettingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64406a, false, 72826, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64406a, false, 72826, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TestSettingActivity testSettingActivity = this.f64407b;
        switch (i) {
            case 0:
                k.a(c.a.Ijk);
                testSettingActivity.mExoPlayerSwitch.setStartText("IJK");
                return;
            case 1:
                if (Build.VERSION.SDK_INT >= 17) {
                    k.a(c.a.IjkHardware);
                    testSettingActivity.mExoPlayerSwitch.setStartText("IJK_HARDWARE");
                    return;
                }
                a.c((Context) testSettingActivity, "4.3以下版本默认不开启硬解", 0).a();
                return;
            case 2:
                k.a(c.a.EXO);
                testSettingActivity.mExoPlayerSwitch.setStartText("EXO");
                break;
        }
    }
}
