package com.ss.android.ugc.awemepushlib.os.receiver;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.message.localpush.MessageScheduleReceiver;
import com.ss.android.ugc.aweme.common.q;

public class ScreenReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static String sExtra = null;
    public static int sFrom = -1;
    public static String sMsg;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    public void sendPush(Context context, String str, int i, String str2) {
    }

    public static void cancelAlarmManager(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, changeQuickRedirect, true, 90380, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, changeQuickRedirect, true, 90380, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        try {
            AlarmManager alarmManager = (AlarmManager) context.getApplicationContext().getSystemService("alarm");
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(context2, MessageScheduleReceiver.class);
                intent.setType(str2);
                intent.setAction("action_message_delay");
                alarmManager.cancel(PendingIntent.getBroadcast(context2, 1, intent, 134217728));
            }
        } catch (Exception unused) {
        }
    }

    public void onReceive(final Context context, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{context, intent}, this, changeQuickRedirect, false, 90379, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent}, this, changeQuickRedirect, false, 90379, new Class[]{Context.class, Intent.class}, Void.TYPE);
            return;
        }
        String action = intent.getAction();
        Logger.debug();
        if ("android.intent.action.USER_PRESENT".equals(action) && sFrom >= 0) {
            q.a("receiver_user_present", null);
            try {
                this.mHandler.postDelayed(new Runnable() {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    public void run() {
                        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90381, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90381, new Class[0], Void.TYPE);
                            return;
                        }
                        ScreenReceiver.this.sendPush(context, ScreenReceiver.sMsg, ScreenReceiver.sFrom, ScreenReceiver.sExtra);
                    }
                }, 2000);
            } catch (Exception unused) {
            }
        }
    }

    public static void setMessage(Context context, int i, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i), str3, str2}, null, changeQuickRedirect, true, 90378, new Class[]{Context.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i), str3, str2}, null, changeQuickRedirect, true, 90378, new Class[]{Context.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        sFrom = i;
        sMsg = str3;
        sExtra = str2;
        cancelAlarmManager(context2, str3);
    }
}
