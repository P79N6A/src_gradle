package com.ss.android.ugc.aweme.setting.ui;

import a.i;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64426a;

    /* renamed from: b  reason: collision with root package name */
    private final DouYinSettingNewVersionActivity f64427b;

    g(DouYinSettingNewVersionActivity douYinSettingNewVersionActivity) {
        this.f64427b = douYinSettingNewVersionActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64426a, false, 72505, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64426a, false, 72505, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        DouYinSettingNewVersionActivity douYinSettingNewVersionActivity = this.f64427b;
        if (i == 0) {
            i.a((Callable<TResult>) new j<TResult>(douYinSettingNewVersionActivity)).a((a.g<TResult, TContinuationResult>) new k<TResult,TContinuationResult>(douYinSettingNewVersionActivity), i.f1052b);
        }
    }
}
