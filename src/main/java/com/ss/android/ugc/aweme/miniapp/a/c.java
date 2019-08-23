package com.ss.android.ugc.aweme.miniapp.a;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.WorkerThread;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.excitingvideo.INetworkListener;
import com.ss.android.ugc.aweme.miniapp.api.MicroAppApi;
import com.storage.async.Action;
import com.storage.async.Observable;
import com.storage.async.Schedulers;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.process.HostProcessBridge;
import java.util.Iterator;
import org.json.JSONObject;

public final class c implements INetworkListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55413a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f55414b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private String f55415c;

    /* renamed from: d  reason: collision with root package name */
    private String f55416d;

    /* renamed from: e  reason: collision with root package name */
    private Context f55417e;

    /* renamed from: f  reason: collision with root package name */
    private String f55418f;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55421a;

        /* renamed from: b  reason: collision with root package name */
        public INetworkListener.NetworkCallback f55422b;

        /* renamed from: d  reason: collision with root package name */
        private String f55424d;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f55421a, false, 59133, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55421a, false, 59133, new Class[0], Void.TYPE);
                return;
            }
            try {
                final String a2 = c.this.a(this.f55424d);
                c.this.f55414b.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55425a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f55425a, false, 59134, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f55425a, false, 59134, new Class[0], Void.TYPE);
                            return;
                        }
                        c.this.a(a2, a.this.f55422b);
                    }
                });
            } catch (Exception unused) {
                c.this.f55414b.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55428a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f55428a, false, 59135, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f55428a, false, 59135, new Class[0], Void.TYPE);
                            return;
                        }
                        c.this.a(a.this.f55422b);
                    }
                });
            }
        }

        a(String str, INetworkListener.NetworkCallback networkCallback) {
            this.f55424d = str;
            this.f55422b = networkCallback;
        }
    }

    private String b() {
        if (PatchProxy.isSupport(new Object[0], this, f55413a, false, 59128, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f55413a, false, 59128, new Class[0], String.class);
        }
        if (StringUtils.isEmpty(this.f55415c)) {
            d();
        }
        return this.f55415c;
    }

    private String c() {
        if (PatchProxy.isSupport(new Object[0], this, f55413a, false, 59129, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f55413a, false, 59129, new Class[0], String.class);
        }
        if (StringUtils.isEmpty(this.f55416d)) {
            d();
        }
        return this.f55416d;
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f55413a, false, 59130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55413a, false, 59130, new Class[0], Void.TYPE);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) this.f55417e.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperatorName = telephonyManager.getNetworkOperatorName();
            if (!StringUtils.isEmpty(networkOperatorName)) {
                this.f55415c = Uri.encode(networkOperatorName);
            }
            String networkOperator = telephonyManager.getNetworkOperator();
            if (!StringUtils.isEmpty(networkOperator)) {
                this.f55416d = Uri.encode(networkOperator);
            }
        }
    }

    @WorkerThread
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f55413a, false, 59131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55413a, false, 59131, new Class[0], Void.TYPE);
            return;
        }
        JSONObject netCommonParams = HostProcessBridge.getNetCommonParams();
        if (netCommonParams != null) {
            try {
                Iterator<String> keys = netCommonParams.keys();
                StringBuilder sb = new StringBuilder();
                if (keys != null) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String optString = netCommonParams.optString(next);
                        sb.append("&");
                        sb.append(next);
                        sb.append("=");
                        sb.append(optString);
                    }
                }
                this.f55418f = sb.toString();
            } catch (Exception e2) {
                AppBrandLogger.e("AdNetworkImpl", e2);
            }
        }
        if (AppBrandLogger.debug()) {
            AppBrandLogger.e("AdNetworkImpl", netCommonParams);
        }
    }

    public c(Context context) {
        this.f55417e = context.getApplicationContext();
        Observable.create((Action) new Action() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55419a;

            public final void act() {
                if (PatchProxy.isSupport(new Object[0], this, f55419a, false, 59132, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f55419a, false, 59132, new Class[0], Void.TYPE);
                    return;
                }
                c.this.a();
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }

    public final void a(INetworkListener.NetworkCallback networkCallback) {
        INetworkListener.NetworkCallback networkCallback2 = networkCallback;
        if (PatchProxy.isSupport(new Object[]{networkCallback2}, this, f55413a, false, 59127, new Class[]{INetworkListener.NetworkCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{networkCallback2}, this, f55413a, false, 59127, new Class[]{INetworkListener.NetworkCallback.class}, Void.TYPE);
            return;
        }
        networkCallback2.onFail(2, "http request is error");
    }

    public final String a(String str) throws Exception {
        if (PatchProxy.isSupport(new Object[]{str}, this, f55413a, false, 59125, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f55413a, false, 59125, new Class[]{String.class}, String.class);
        }
        if (this.f55418f == null || !this.f55418f.contains("iid")) {
            a();
        }
        return MicroAppApi.a(20480, str + "&carrier=" + b() + "&mcc_mnc=" + c() + this.f55418f);
    }

    public final void requestGet(String str, INetworkListener.NetworkCallback networkCallback) {
        if (PatchProxy.isSupport(new Object[]{str, networkCallback}, this, f55413a, false, 59124, new Class[]{String.class, INetworkListener.NetworkCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, networkCallback}, this, f55413a, false, 59124, new Class[]{String.class, INetworkListener.NetworkCallback.class}, Void.TYPE);
        } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            new a(str, networkCallback).start();
        } else {
            try {
                a(a(str), networkCallback);
            } catch (Exception unused) {
                a(networkCallback);
            }
        }
    }

    public final void a(String str, INetworkListener.NetworkCallback networkCallback) {
        String str2 = str;
        INetworkListener.NetworkCallback networkCallback2 = networkCallback;
        if (PatchProxy.isSupport(new Object[]{str2, networkCallback2}, this, f55413a, false, 59126, new Class[]{String.class, INetworkListener.NetworkCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, networkCallback2}, this, f55413a, false, 59126, new Class[]{String.class, INetworkListener.NetworkCallback.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            networkCallback2.onSuccess(str2);
        } else {
            networkCallback2.onFail(1, "response is empty");
        }
    }
}
