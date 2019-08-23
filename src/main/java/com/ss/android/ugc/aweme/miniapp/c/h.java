package com.ss.android.ugc.aweme.miniapp.c;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55624a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f55625b = "h";

    public static String a(@NonNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f55624a, true, 59354, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f55624a, true, 59354, new Class[]{Context.class}, String.class);
        }
        context.getApplicationContext();
        try {
            return HostProcessBridge.hostActionSync("share_info_params", CrossProcessDataEntity.Builder.create().build()).getString("share_info_value");
        } catch (Exception e2) {
            AppBrandLogger.e(f55625b, "getShareParams", e2);
            return "";
        }
    }
}
