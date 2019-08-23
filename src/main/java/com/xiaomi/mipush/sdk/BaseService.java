package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import java.lang.ref.WeakReference;

public abstract class BaseService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private a f81728a;

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<BaseService> f81729a;

        public a(WeakReference<BaseService> weakReference) {
            this.f81729a = weakReference;
        }

        public void a() {
            if (hasMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST)) {
                removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
            }
            sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, 1000);
        }

        public void handleMessage(Message message) {
            if (message.what == 1001 && this.f81729a != null) {
                BaseService baseService = (BaseService) this.f81729a.get();
                if (baseService != null) {
                    b.c("TimeoutHandler" + baseService.toString() + "  kill self");
                    if (!baseService.a()) {
                        baseService.stopSelf();
                    } else {
                        b.c("TimeoutHandler has job");
                        sendEmptyMessageDelayed(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, 1000);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (this.f81728a == null) {
            this.f81728a = new a(new WeakReference(this));
        }
        this.f81728a.a();
    }
}
