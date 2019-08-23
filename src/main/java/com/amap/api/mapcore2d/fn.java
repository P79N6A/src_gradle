package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationListener;
import com.autonavi.amap.mapcore2d.Inner_3dMap_locationOption;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.CrashModule;

public final class fn extends Handler {

    /* renamed from: a  reason: collision with root package name */
    fm f6157a;

    public fn() {
    }

    public fn(Looper looper, fm fmVar) {
        super(looper);
        this.f6157a = fmVar;
    }

    public final void handleMessage(Message message) {
        String str;
        String str2;
        switch (message.what) {
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST /*1001*/:
                try {
                    this.f6157a.a((Inner_3dMap_locationOption) message.obj);
                    return;
                } catch (Throwable th) {
                    th = th;
                    str = "ClientActionHandler";
                    str2 = "ACTION_SET_OPTION";
                    gc.a(th, str, str2);
                    return;
                }
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR /*1002*/:
                try {
                    this.f6157a.a((Inner_3dMap_locationListener) message.obj);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    str = "ClientActionHandler";
                    str2 = "ACTION_SET_LISTENER";
                    gc.a(th, str, str2);
                    return;
                }
            case 1003:
                try {
                    this.f6157a.b((Inner_3dMap_locationListener) message.obj);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    str = "ClientActionHandler";
                    str2 = "ACTION_REMOVE_LISTENER";
                    gc.a(th, str, str2);
                    return;
                }
            case CrashModule.MODULE_ID /*1004*/:
                try {
                    this.f6157a.a();
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    str = "ClientActionHandler";
                    str2 = "ACTION_START_LOCATION";
                    gc.a(th, str, str2);
                    return;
                }
            case 1005:
                try {
                    this.f6157a.b();
                    return;
                } catch (Throwable th5) {
                    th = th5;
                    str = "ClientActionHandler";
                    str2 = "ACTION_GET_LOCATION";
                    gc.a(th, str, str2);
                    return;
                }
            case 1006:
                try {
                    this.f6157a.c();
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    str = "ClientActionHandler";
                    str2 = "ACTION_STOP_LOCATION";
                    gc.a(th, str, str2);
                    return;
                }
            case 1007:
                try {
                    this.f6157a.d();
                    return;
                } catch (Throwable th7) {
                    gc.a(th7, "ClientActionHandler", "ACTION_DESTROY");
                    return;
                }
        }
    }
}
