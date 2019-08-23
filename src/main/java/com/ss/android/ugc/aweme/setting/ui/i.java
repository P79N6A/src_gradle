package com.ss.android.ugc.aweme.setting.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64430a;

    /* renamed from: b  reason: collision with root package name */
    private final DouYinSettingNewVersionActivity f64431b;

    i(DouYinSettingNewVersionActivity douYinSettingNewVersionActivity) {
        this.f64431b = douYinSettingNewVersionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64430a, false, 72507, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64430a, false, 72507, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f64431b.u();
    }
}
