package com.ss.android.ugc.aweme.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.message.b.c;
import com.ss.android.ugc.aweme.utils.bg;

public final class NewsCountPresenter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54265a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f54266b = true;

    /* renamed from: c  reason: collision with root package name */
    MsgCountBroadcastReceiver f54267c;

    final class MsgCountBroadcastReceiver extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54270a;

        MsgCountBroadcastReceiver() {
        }

        public final void onReceive(Context context, Intent intent) {
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{context, intent2}, this, f54270a, false, 57595, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, intent2}, this, f54270a, false, 57595, new Class[]{Context.class, Intent.class}, Void.TYPE);
                return;
            }
            if (intent2 != null) {
                if ("com.msg.count.action.arrived".equals(intent.getAction())) {
                    int intExtra = intent2.getIntExtra("msg_count", 0);
                    int intExtra2 = intent2.getIntExtra("msg_dot", -1);
                    bg.a(new c(99, intExtra));
                    bg.a(new c(BaseLoginOrRegisterActivity.o, intExtra2));
                } else if ("message_stranger_mark_read_action".equals(intent.getAction())) {
                    bg.a(new c(11, -1));
                }
            }
        }
    }
}
