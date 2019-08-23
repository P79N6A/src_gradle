package com.ss.android.newmedia.redbadge.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30328a;

    public static boolean a(Context context, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, null, f30328a, true, 18855, new Class[]{Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, intent2}, null, f30328a, true, 18855, new Class[]{Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null) {
            return false;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                return false;
            }
            return true;
        }
    }
}
