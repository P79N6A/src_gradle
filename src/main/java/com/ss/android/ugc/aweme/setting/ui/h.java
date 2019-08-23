package com.ss.android.ugc.aweme.setting.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64428a;

    /* renamed from: b  reason: collision with root package name */
    private final DouYinSettingNewVersionActivity f64429b;

    h(DouYinSettingNewVersionActivity douYinSettingNewVersionActivity) {
        this.f64429b = douYinSettingNewVersionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64428a, false, 72506, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64428a, false, 72506, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f64429b.v();
    }
}
