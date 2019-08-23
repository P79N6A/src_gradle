package com.ss.android.ugc.aweme.share.systemshare;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public class SystemShareTargetChosenReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65293a;

    private String a(Context context, ComponentName componentName) {
        if (PatchProxy.isSupport(new Object[]{context, componentName}, this, f65293a, false, 73835, new Class[]{Context.class, ComponentName.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, componentName}, this, f65293a, false, 73835, new Class[]{Context.class, ComponentName.class}, String.class);
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(componentName.getPackageName(), 0);
            if (applicationInfo == null) {
                return "";
            }
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, f65293a, false, 73833, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, f65293a, false, 73833, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        if (!(intent == null || context == null || Build.VERSION.SDK_INT < 22)) {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (componentName != null) {
                String str = null;
                String stringExtra = intent.getStringExtra("extra_type");
                if (!StringUtils.isEmpty(stringExtra)) {
                    str = a(context, componentName, stringExtra);
                }
                if (StringUtils.isEmpty(str)) {
                    str = a(context, componentName);
                }
                r.a("share_video_more_track", (Map) new d().a("platform", str).a("package_name", componentName.getPackageName()).a("component_name", componentName.getClassName()).f34114b);
            }
        }
    }

    private String a(Context context, ComponentName componentName, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, componentName, str2}, this, f65293a, false, 73834, new Class[]{Context.class, ComponentName.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context, componentName, str2}, this, f65293a, false, 73834, new Class[]{Context.class, ComponentName.class, String.class}, String.class);
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str2);
            for (ResolveInfo next : packageManager.queryIntentActivities(intent, 0)) {
                if (next.activityInfo != null && StringUtils.equal(next.activityInfo.name, componentName.getClassName()) && StringUtils.equal(next.activityInfo.packageName, componentName.getPackageName())) {
                    return next.loadLabel(packageManager).toString();
                }
            }
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
        }
        return "";
    }
}
