package com.taobao.accs.internal;

import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import com.taobao.accs.internal.ServiceImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ServiceImpl.AnonymousClass1 f78985a;

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

    public void run() {
        try {
            if (ServiceImpl.this.f78979c == null || !UtilityImpl.e(ServiceImpl.this.f78979c)) {
                _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(Process.myPid());
            } else {
                Intent intent = new Intent();
                intent.setAction("org.agoo.android.intent.action.PING_V4");
                intent.setClassName(ServiceImpl.this.f78979c.getPackageName(), "com.taobao.accs.ChannelService");
                ServiceImpl.this.f78979c.startService(intent);
                UTMini.getInstance().commitEvent(66001, "probeServiceEnabled", UtilityImpl.l(ServiceImpl.this.f78979c));
                ALog.d("ServiceImpl", "ReceiverImpl probeTaoBao........mContext.startService(intent) [probe][successfully]", new Object[0]);
            }
            ALog.d("ServiceImpl", "ReceiverImpl probeTaoBao........messageServiceBinder [probe][end]", new Object[0]);
        } catch (Throwable th) {
            ALog.d("ServiceImpl", "ReceiverImpl probeTaoBao error........e=" + th, new Object[0]);
        }
    }

    b(ServiceImpl.AnonymousClass1 r1) {
        this.f78985a = r1;
    }
}
