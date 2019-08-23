package com.umeng.commonsdk.framework;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONObject;

public class c {

    /* renamed from: d  reason: collision with root package name */
    private static HandlerThread f80740d;

    /* renamed from: e  reason: collision with root package name */
    private static Handler f80741e;

    /* renamed from: f  reason: collision with root package name */
    private static b f80742f;
    private static Object g = new Object();

    private c() {
    }

    public static void a() {
        if (f80741e != null) {
            Message obtainMessage = f80741e.obtainMessage();
            obtainMessage.what = 784;
            f80741e.sendMessage(obtainMessage);
        }
    }

    private static void f() {
        if (f80740d != null) {
            f80740d = null;
        }
        if (f80741e != null) {
            f80741e = null;
        }
        if (f80742f != null) {
            f80742f = null;
        }
    }

    /* access modifiers changed from: private */
    public static void g() {
        if (f80742f != null && f80740d != null) {
            b.c();
            ULog.d("--->>> handleQuit: Quit dispatch thread.");
            f80740d.quit();
            f();
        }
    }

    private static synchronized void e() {
        synchronized (c.class) {
            ULog.d("--->>> Dispatch: init Enter...");
            try {
                if (f80740d == null) {
                    HandlerThread handlerThread = new HandlerThread("work_thread");
                    f80740d = handlerThread;
                    handlerThread.start();
                    if (f80741e == null) {
                        f80741e = new Handler(f80740d.getLooper()) {
                            public final void handleMessage(Message message) {
                                int i = message.what;
                                if (i != 784) {
                                    switch (i) {
                                        case 768:
                                            c.b(message);
                                            return;
                                        case 769:
                                            return;
                                        case 770:
                                            c.d();
                                            return;
                                    }
                                } else {
                                    c.g();
                                }
                            }
                        };
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
            ULog.d("--->>> Dispatch: init Exit...");
        }
    }

    /* access modifiers changed from: private */
    public static void d() {
        ULog.d("--->>> delayProcess Enter...");
        UMRTLog.i("MobclickRT", "--->>> delayProcess Enter...");
        Context appContext = UMModuleRegister.getAppContext();
        if (appContext != null && UMFrUtils.isOnline(appContext)) {
            long maxDataSpace = UMEnvelopeBuild.maxDataSpace(appContext);
            UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName("analytics");
            JSONObject jSONObject = null;
            if (callbackFromModuleName != null) {
                try {
                    jSONObject = callbackFromModuleName.setupReportData(maxDataSpace);
                    if (jSONObject == null) {
                        UMRTLog.i("MobclickRT", "--->>> analyticsCB.setupReportData() return null");
                        return;
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
            if (jSONObject != null && jSONObject.length() > 0) {
                JSONObject jSONObject2 = (JSONObject) jSONObject.opt("header");
                JSONObject jSONObject3 = (JSONObject) jSONObject.opt(PushConstants.CONTENT);
                if (!(appContext == null || jSONObject2 == null || jSONObject3 == null)) {
                    JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(appContext, jSONObject2, jSONObject3);
                    if (buildEnvelopeWithExtHeader != null) {
                        try {
                            if (buildEnvelopeWithExtHeader.has("exception")) {
                                UMRTLog.i("MobclickRT", "--->>> autoProcess: Build envelope error code: " + buildEnvelopeWithExtHeader.getInt("exception"));
                            }
                        } catch (Throwable unused) {
                        }
                        UMRTLog.i("MobclickRT", "--->>> autoProcess: removeCacheData ... ");
                        callbackFromModuleName.removeCacheData(buildEnvelopeWithExtHeader);
                    }
                }
            }
        }
    }

    public static void a(UMSenderStateNotify uMSenderStateNotify) {
        if (f80742f != null) {
            b.a(uMSenderStateNotify);
        }
    }

    public static void a(long j) {
        if (f80741e != null) {
            if (f80741e.hasMessages(770)) {
                UMRTLog.i("MobclickRT", "--->>> MSG_DELAY_PROCESS has exist. do nothing.");
                return;
            }
            UMRTLog.i("MobclickRT", "--->>> MSG_DELAY_PROCESS not exist. send it.");
            Message obtainMessage = f80741e.obtainMessage();
            obtainMessage.what = 770;
            f80741e.sendMessageDelayed(obtainMessage, j);
        }
    }

    /* access modifiers changed from: private */
    public static void b(Message message) {
        int i = message.arg1;
        Object obj = message.obj;
        UMLogDataProtocol callbackFromModuleName = UMModuleRegister.getCallbackFromModuleName(UMModuleRegister.eventType2ModuleName(i));
        if (callbackFromModuleName != null) {
            ULog.d("--->>> dispatch:handleEvent: call back workEvent with msg type [ 0x" + Integer.toHexString(i) + "]");
            callbackFromModuleName.workEvent(obj, i);
        }
    }

    public static synchronized boolean a(int i) {
        synchronized (c.class) {
            if (f80741e == null) {
                return false;
            }
            boolean hasMessages = f80741e.hasMessages(i);
            return hasMessages;
        }
    }

    public static void a(Context context, int i, UMLogDataProtocol uMLogDataProtocol, Object obj) {
        if (context == null || uMLogDataProtocol == null) {
            ULog.d("--->>> Context or UMLogDataProtocol parameter cannot be null!");
            return;
        }
        UMModuleRegister.registerAppContext(context.getApplicationContext());
        if (UMModuleRegister.registerCallback(i, uMLogDataProtocol)) {
            if (f80740d == null || f80741e == null) {
                e();
            }
            try {
                if (f80741e != null) {
                    if (UMGlobalContext.getInstance().isMainProcess(context) && f80742f == null) {
                        synchronized (g) {
                            UMFrUtils.syncLegacyEnvelopeIfNeeded(context);
                            f80742f = new b(context, f80741e);
                        }
                    }
                    Message obtainMessage = f80741e.obtainMessage();
                    obtainMessage.what = 768;
                    obtainMessage.arg1 = i;
                    obtainMessage.obj = obj;
                    f80741e.sendMessage(obtainMessage);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(UMModuleRegister.getAppContext(), th);
            }
        }
    }
}
