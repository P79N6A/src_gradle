package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import com.taobao.accs.base.IBaseReceiver;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class ReceiverImpl implements IBaseReceiver {

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
            String str = a.b().f3304b;
            if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                Process.killProcess(i);
                return;
            }
            throw new RuntimeException("Process killed, pid is " + i);
        }
    }

    public void onReceive(Context context, Intent intent) {
        ALog.d("ReceiverImpl", "ReceiverImpl onReceive begin......", new Object[0]);
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            intent = new Intent();
        }
        try {
            if (UtilityImpl.e(context)) {
                intent.setClassName(context.getPackageName(), "com.taobao.accs.ChannelService");
                com.taobao.accs.a.a.a(context.getApplicationContext(), intent, false);
            } else {
                _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(Process.myPid());
            }
            if (UtilityImpl.f(context)) {
                intent.setClassName(context, com.taobao.accs.client.a.a(context.getPackageName()));
                com.taobao.accs.a.a.a(context.getApplicationContext(), intent, true);
            }
        } catch (Throwable th) {
            ALog.e("ReceiverImpl", "ReceiverImpl onReceive,exception,e=" + th.getMessage(), new Object[0]);
        }
    }
}
