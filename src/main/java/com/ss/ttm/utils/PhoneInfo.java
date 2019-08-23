package com.ss.ttm.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class PhoneInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final String batteryPct(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 91161, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 91161, new Class[]{Context.class}, String.class);
        }
        Intent registerReceiver = context2.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return "batteryStatus error";
        }
        return String.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    public static final boolean isRunningForeground(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 91159, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 91159, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
            if (next.importance == 100 && next.processName.equals(context.getApplicationInfo().processName)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isScreenOn(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, changeQuickRedirect, true, 91160, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, changeQuickRedirect, true, 91160, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        PowerManager powerManager = (PowerManager) context2.getSystemService("power");
        if (Build.VERSION.SDK_INT >= 21) {
            return powerManager.isInteractive();
        }
        return powerManager.isScreenOn();
    }
}
