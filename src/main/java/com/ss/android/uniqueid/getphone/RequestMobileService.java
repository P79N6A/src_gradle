package com.ss.android.uniqueid.getphone;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.usergrowth.data.a.b.b;
import com.bytedance.usergrowth.data.a.b.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.lang.reflect.Method;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

public class RequestMobileService extends IntentService {

    /* renamed from: a  reason: collision with root package name */
    public static ConnectivityReceiver f77817a;

    /* renamed from: b  reason: collision with root package name */
    public static int f77818b;

    /* renamed from: c  reason: collision with root package name */
    public static Context f77819c;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f77820e;

    /* renamed from: f  reason: collision with root package name */
    private static ConnectivityManager f77821f;

    /* renamed from: d  reason: collision with root package name */
    int f77822d = -1;

    static class ConnectivityReceiver extends BroadcastReceiver {
        private ConnectivityReceiver() {
        }

        /* synthetic */ ConnectivityReceiver(byte b2) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            if (!intent.getBooleanExtra("noConnectivity", false) && RequestMobileService.a()) {
                try {
                    context.startService(new Intent(context, RequestMobileService.class).setAction("action_internal"));
                } catch (Throwable th) {
                    CMCCManager.inst().log(th.getMessage());
                }
                try {
                    context.getApplicationContext().unregisterReceiver(this);
                    RequestMobileService.f77817a = null;
                } catch (Exception unused) {
                }
            }
        }
    }

    static class a implements Runnable {
        private a() {
        }

        public final void run() {
            Context context = RequestMobileService.f77819c;
            try {
                context.startService(new Intent(context, RequestMobileService.class).setAction("action_get_phone"));
            } catch (Throwable unused) {
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public RequestMobileService() {
        super(RequestMobileService.class.getName());
    }

    public static boolean a() {
        if (!b.b(f77819c) || !c()) {
            return false;
        }
        return true;
    }

    private static boolean c() {
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(f77821f, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }

    public void onCreate() {
        try {
            super.onCreate();
            f77819c = getApplicationContext();
            if (f77821f == null) {
                f77821f = (ConnectivityManager) getSystemService("connectivity");
            }
        } catch (Throwable unused) {
        }
    }

    private void b() {
        cn.com.chinatelecom.a.a.b.a.a();
        cn.com.chinatelecom.a.a.b.a.a(getApplicationContext(), CMCCManager.inst().getKey(), CMCCManager.inst().getSecret());
        cn.com.chinatelecom.a.a.b.a.a(f77819c, "qh", (cn.com.chinatelecom.a.a.b.b) new cn.com.chinatelecom.a.a.b.b() {
            public final void a(final int i, final String str) {
                CMCCManager.inst().submitRunnable(new Runnable() {
                    public final void run() {
                        RequestMobileService.a("request_mobile", "sdk_fail", com.bytedance.usergrowth.data.a.b.a.a("onFail", str));
                        CMCCManager inst = CMCCManager.inst();
                        inst.log("onfail: code =" + i + ",msg = " + str);
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("result", i);
                            jSONObject.put("msg", str);
                            RequestMobileService.this.a(false, jSONObject.toString());
                        } catch (JSONException e2) {
                            CMCCManager.inst().log(e2.getMessage());
                        }
                        RequestMobileService requestMobileService = RequestMobileService.this;
                        if (requestMobileService.f77822d <= 0) {
                            requestMobileService.f77822d = CMCCManager.inst().getRetryTimes();
                        }
                        int i = RequestMobileService.f77818b + 1;
                        RequestMobileService.f77818b = i;
                        if (i <= requestMobileService.f77822d) {
                            new Handler(Looper.getMainLooper()).postDelayed(new a((byte) 0), 5000);
                        }
                    }
                });
            }

            public final void a(int i, String str, String str2, String str3) {
                CMCCManager inst = CMCCManager.inst();
                final int i2 = i;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = str3;
                AnonymousClass1 r1 = new Runnable() {
                    public final void run() {
                        CMCCManager inst = CMCCManager.inst();
                        inst.log("result = " + i2 + ",accessCode = " + str4 + "，msg = " + str5 + "，op = " + str6);
                        RequestMobileService.this.a("request_mobile", "sdk_success");
                        RequestMobileService.f77818b = 0;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("result", i2);
                            jSONObject.put("accessCode", str4);
                            jSONObject.put("msg", str5);
                            jSONObject.put("op", str6);
                            RequestMobileService.a("request_mobile", "onSuccess", jSONObject);
                            RequestMobileService.this.a(true, jSONObject.toString());
                        } catch (JSONException e2) {
                            CMCCManager.inst().log(e2.getMessage());
                        }
                    }
                };
                inst.submitRunnable(r1);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!f77820e || action != null) {
                f77820e = true;
                if ("action_get_phone".equals(action)) {
                    b();
                } else if (a() || "action_internal".equals(action)) {
                    String str = "";
                    try {
                        str = ((TelephonyManager) getSystemService("phone")).getNetworkOperatorName();
                    } catch (Exception unused) {
                    }
                    try {
                        String a2 = CMCCManager.inst().getNetClient().a(102400, e.a("http://is.snssdk.com/user/privacy_mobile/v1/control_auth/", "carrier", str), true, Collections.emptyMap());
                        CMCCManager inst = CMCCManager.inst();
                        inst.log("频控resp -> " + a2);
                        a formJson = a.formJson(new JSONObject(a2));
                        if (formJson != null) {
                            if (formJson.data != null) {
                                int i = formJson.data.retry_delay;
                                int i2 = formJson.data.result;
                                if (i2 == -1) {
                                    CMCCManager inst2 = CMCCManager.inst();
                                    inst2.log(e.f77833a + "后端返回不取");
                                    a("request_mobile", "result_code_fail");
                                } else if (i2 == 1) {
                                    CMCCManager.inst().log("result_code_delay");
                                    a("request_mobile", "result_code_delay");
                                    if (i > 0) {
                                        new Handler(Looper.getMainLooper()).postDelayed(new a((byte) 0), ((long) i) * 1000);
                                    }
                                } else if (i2 == 0) {
                                    CMCCManager.inst().log("result_code_success");
                                    a("request_mobile", "result_code_success");
                                    b();
                                }
                                CMCCManager.inst().log("beginRequestMobile()");
                            }
                        }
                        CMCCManager.inst().log("getAuth() response json error ");
                    } catch (Exception e2) {
                        CMCCManager inst3 = CMCCManager.inst();
                        inst3.log("getAuth() onFailure " + e2.getMessage());
                    }
                    CMCCManager.inst().log("beginRequestMobile()");
                } else {
                    f77817a = new ConnectivityReceiver((byte) 0);
                    getApplicationContext().registerReceiver(f77817a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    CMCCManager.inst().log("AbsApplication.getInst().registerReceiver()");
                }
            }
        }
    }

    public final void a(String str, String str2) {
        a(str, str2, null);
    }

    public final void a(boolean z, String str) {
        CMCCManager inst = CMCCManager.inst();
        inst.log("sendResult : result = " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", z);
            jSONObject.put("result", str);
        } catch (JSONException unused) {
        }
        a("request_mobile", "get_phone_result", jSONObject);
        if (!z) {
            if (this.f77822d <= 0) {
                this.f77822d = CMCCManager.inst().getRetryTimes();
            }
            if (f77818b < this.f77822d) {
                return;
            }
        }
        boolean a2 = b.a(f77819c);
        String str2 = "";
        try {
            str2 = ((TelephonyManager) getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused2) {
        }
        try {
            a("request_mobile", "send_result");
            JSONObject jSONObject2 = new JSONObject(CMCCManager.inst().getNetClient().a(102400, e.a(e.a(e.a(e.a("http://is.snssdk.com/user/privacy_mobile/v1/get_mobile/", "sdk_response", str), "wifi_env", String.valueOf(a2 ? 1 : 0)), "need_mobile", PushConstants.PUSH_TYPE_THROUGH_MESSAGE), "carrier", str2), true, Collections.emptyMap()));
            c formJson = c.formJson(jSONObject2);
            if (formJson != null) {
                if (formJson.data != null) {
                    if (formJson.data.result != 0 || TextUtils.isEmpty(formJson.data.mobile)) {
                        a("request_mobile", "get_phone_fail", jSONObject2);
                        return;
                    }
                    a("request_mobile", "get_phone_success", jSONObject2);
                    CMCCManager inst2 = CMCCManager.inst();
                    inst2.log("PHONE NUM :" + formJson.data.mobile);
                    String str3 = formJson.data.mobile;
                    SharedPreferences.Editor edit = c.a(f77819c, "app_setting", 0).edit();
                    edit.putString("mobile_by_telecom", str3);
                    if (edit != null) {
                        com.bytedance.usergrowth.data.a.b.c.f2325a.a(edit);
                    }
                    return;
                }
            }
            CMCCManager.inst().log("getMobile() response json error ");
            a("request_mobile", "get_phone_fail", jSONObject2);
        } catch (Exception e2) {
            a("request_mobile", "get_phone_fail", com.bytedance.usergrowth.data.a.b.a.a("error", e2.getMessage()));
            CMCCManager inst3 = CMCCManager.inst();
            inst3.log("getMobile() onFailure " + e2.getMessage());
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        com.bytedance.usergrowth.data.a.a.e logPrinter = CMCCManager.inst().getLogPrinter();
        if (logPrinter == null) {
            CMCCManager.inst().log("uniqueidLog must be set before start");
            return;
        }
        logPrinter.a(str + "_" + str2, jSONObject);
    }
}
