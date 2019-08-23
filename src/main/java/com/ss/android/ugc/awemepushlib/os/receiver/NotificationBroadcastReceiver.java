package com.ss.android.ugc.awemepushlib.os.receiver;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.q;
import java.util.Map;

public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, this, changeQuickRedirect, false, 90374, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, intent2}, this, changeQuickRedirect, false, 90374, new Class[]{Context.class, Intent.class}, Void.TYPE);
        } else if (context2 != null && intent2 != null) {
            String action = intent.getAction();
            int intExtra = intent2.getIntExtra("type", -1);
            if (intExtra != -1) {
                ((NotificationManager) context2.getSystemService("notification")).cancel(intExtra);
            }
            Intent intent3 = (Intent) intent2.getParcelableExtra("contentIntentURI");
            if ("notification_clicked".equals(action)) {
                Logger.debug();
                if (intent3 != null) {
                    try {
                        intent3.getDataString();
                        context2.startActivity(intent3);
                    } catch (Exception unused) {
                    }
                }
            }
            if ("notification_cancelled".equals(action)) {
                Logger.debug();
                Map map = null;
                if (intent3 != null) {
                    map = (Map) intent3.getSerializableExtra("log_data_extra_to_adsapp");
                }
                q.a("push_clear", map);
            }
        }
    }
}
