package com.ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.format.Formatter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75582a;

    public static String a(Context context) throws Exception {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75582a, true, 87839, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f75582a, true, 87839, new Class[]{Context.class}, String.class);
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
        return Formatter.formatFileSize(context2, memoryInfo.availMem);
    }

    public static String b(Context context) {
        int i;
        Context context2 = context;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75582a, true, 87840, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f75582a, true, 87840, new Class[]{Context.class}, String.class);
        }
        ActivityManager activityManager = (ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if ((context.getApplicationInfo().flags & 1048576) == 0) {
            z = false;
        }
        if (z) {
            i = activityManager.getLargeMemoryClass();
        } else {
            i = activityManager.getMemoryClass();
        }
        return Formatter.formatFileSize(context2, (long) (i * 1024 * 1024));
    }

    public static String c(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75582a, true, 87841, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f75582a, true, 87841, new Class[]{Context.class}, String.class);
        }
        return Formatter.formatFileSize(context2, (long) (((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPrivateDirty() * 1024));
    }
}
