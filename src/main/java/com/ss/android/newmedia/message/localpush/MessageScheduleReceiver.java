package com.ss.android.newmedia.message.localpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class MessageScheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30241a;

    public void onReceive(Context context, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context, intent2}, this, f30241a, false, 18718, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, intent2}, this, f30241a, false, 18718, new Class[]{Context.class, Intent.class}, Void.TYPE);
        } else if (context != null && intent2 != null && b.a(context).a() != null) {
            String action = intent.getAction();
            if ("action_message_delay".equals(action)) {
                if (intent2.getIntExtra("from", Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                    intent2.getStringExtra("msg");
                    intent2.getStringExtra(PushConstants.EXTRA);
                }
            } else if ("com.ss.android.newmedia.message.localpush".equals(action)) {
                StringUtils.isEmpty(intent2.getStringExtra("local_push_data"));
            }
        }
    }
}
