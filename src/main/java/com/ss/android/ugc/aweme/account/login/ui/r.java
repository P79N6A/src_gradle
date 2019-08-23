package com.ss.android.ugc.aweme.account.login.ui;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.main.h.v;
import com.ss.android.ugc.aweme.w;

public final /* synthetic */ class r implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32643a;

    /* renamed from: b  reason: collision with root package name */
    static final DialogInterface.OnClickListener f32644b = new r();

    private r() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32643a, false, 20649, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32643a, false, 20649, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((v) w.a(v.class)).a((Context) w.b(), String.format("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
    }
}
