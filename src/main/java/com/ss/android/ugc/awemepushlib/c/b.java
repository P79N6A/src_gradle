package com.ss.android.ugc.awemepushlib.c;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.regex.Pattern;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76973a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f76974b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static int f76975c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f76976d = Pattern.compile("^0-([\\d]+)$");

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f76973a, true, 90413, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f76973a, true, 90413, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT < 19) {
            return true;
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    return Settings.canDrawOverlays(context);
                } catch (Throwable unused) {
                }
            }
            try {
                if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke((AppOpsManager) context2.getSystemService("appops"), new Object[]{Integer.valueOf(AppOpsManager.class.getField("OP_SYSTEM_ALERT_WINDOW").getInt(null)), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName()})).intValue() == 0) {
                    return true;
                }
                return false;
            } catch (Throwable unused2) {
                return false;
            }
        }
    }
}
