package com.bytedance.android.livesdk.player;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.utils.aa;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16805a;

    /* renamed from: b  reason: collision with root package name */
    boolean f16806b;

    /* renamed from: c  reason: collision with root package name */
    float f16807c;

    /* renamed from: d  reason: collision with root package name */
    private String f16808d = PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP;

    static class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16809a;

        /* renamed from: b  reason: collision with root package name */
        private final float f16810b;

        /* renamed from: c  reason: collision with root package name */
        private final JSONObject f16811c;

        public final Object call() throws Exception {
            if (PatchProxy.isSupport(new Object[0], this, f16809a, false, 12720, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], this, f16809a, false, 12720, new Class[0], Object.class);
            }
            try {
                if (PatchProxy.isSupport(new Object[0], this, f16809a, false, 12721, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f16809a, false, 12721, new Class[0], Void.TYPE);
                } else {
                    float a2 = ((float) aa.a()) / 1024.0f;
                    float f2 = a2 - this.f16810b;
                    Context a3 = TTLiveSDKContext.getHostService().a().a();
                    String a4 = aa.a(a3.getPackageName());
                    JSONObject jSONObject = this.f16811c;
                    jSONObject.put("memory", a2 + "MB");
                    JSONObject jSONObject2 = this.f16811c;
                    jSONObject2.put("live_push_memory", f2 + "MB");
                    this.f16811c.put("product_line", "live");
                    JSONObject jSONObject3 = this.f16811c;
                    jSONObject3.put("start_memory", this.f16810b + "MB");
                    JSONObject jSONObject4 = this.f16811c;
                    if ("".equals(a4)) {
                        a4 = PushConstants.PUSH_TYPE_NOTIFY;
                    }
                    jSONObject4.put("cpu", a4);
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("data", this.f16811c);
                    jSONObject5.put("did", AppLog.getServerDeviceId());
                    jSONObject5.put("uid", TTLiveSDKContext.getHostService().k().b());
                    jSONObject5.put("net_type", NetworkUtils.getNetworkAccessType(a3));
                    jSONObject5.put("net_des", NetworkUtils.getNetworkOperatorCode(a3));
                    jSONObject5.put("app_version_four", a3.getPackageManager().getApplicationInfo(a3.getPackageName(), SearchJediMixFeedAdapter.f42517f).metaData.getInt("UPDATE_VERSION_CODE"));
                    this.f16811c.put("channel", TTLiveSDKContext.getHostService().a().c());
                    this.f16811c.put("device_name", Build.MODEL);
                    c.a("live_client_monitor_log", (String) null, this.f16811c);
                }
            } catch (Exception unused) {
            }
            return null;
        }

        private a(float f2, JSONObject jSONObject) {
            this.f16810b = f2;
            this.f16811c = jSONObject;
        }

        /* synthetic */ a(float f2, JSONObject jSONObject, byte b2) {
            this(f2, jSONObject);
        }
    }

    static class b implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16812a;

        /* renamed from: b  reason: collision with root package name */
        private final float f16813b;

        /* renamed from: c  reason: collision with root package name */
        private final JSONObject f16814c;

        public final Object call() throws Exception {
            float f2;
            if (PatchProxy.isSupport(new Object[0], this, f16812a, false, 12722, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], this, f16812a, false, 12722, new Class[0], Object.class);
            }
            try {
                if (PatchProxy.isSupport(new Object[0], this, f16812a, false, 12723, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f16812a, false, 12723, new Class[0], Void.TYPE);
                } else if (this.f16814c != null) {
                    float a2 = ((float) aa.a()) / 1024.0f;
                    float f3 = a2 - this.f16813b;
                    Context a3 = TTLiveSDKContext.getHostService().a().a();
                    String a4 = aa.a(a3.getPackageName());
                    try {
                        this.f16814c.put("memory", (int) (a2 * 1000.0f));
                        this.f16814c.put("live_pull_memory", (int) (f3 * 1000.0f));
                        this.f16814c.put("start_memory", (int) (this.f16813b * 1000.0f));
                        if (a4 != null && a4.contains("%")) {
                            a4 = a4.replace("%", "");
                        }
                        if ("".equals(a4)) {
                            f2 = 0.0f;
                        } else {
                            f2 = Float.parseFloat(a4);
                        }
                        this.f16814c.put("cpu", (int) (f2 * 1000.0f));
                        this.f16814c.put("channel", TTLiveSDKContext.getHostService().a().c());
                        this.f16814c.put("device_name", Build.MODEL);
                        this.f16814c.put("did", AppLog.getServerDeviceId());
                        this.f16814c.put("uid", TTLiveSDKContext.getHostService().k().b());
                        this.f16814c.put("net_type", NetworkUtils.getNetworkAccessType(a3));
                        this.f16814c.put("net_des", NetworkUtils.getNetworkOperatorCode(a3));
                        this.f16814c.put("app_version_four", a3.getPackageManager().getApplicationInfo(a3.getPackageName(), SearchJediMixFeedAdapter.f42517f).metaData.getInt("UPDATE_VERSION_CODE"));
                        this.f16814c.put("ttlive_sdk_version", "1150");
                        c.a("live_client_monitor_log", (String) null, this.f16814c);
                    } catch (Exception e2) {
                        com.bytedance.android.live.core.c.a.a("LivePlayerLog", (Throwable) e2);
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }

        b(float f2, JSONObject jSONObject) {
            this.f16813b = f2;
            this.f16814c = jSONObject;
        }
    }
}
