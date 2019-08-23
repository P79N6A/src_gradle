package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.OrangeConfigListenerV1;
import java.util.HashMap;
import java.util.Map;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f79102a;

    public static class a implements OrangeConfigListenerV1 {
        public void onConfigUpdate(String str, boolean z) {
            if (GlobalClientInfo.getContext() == null) {
                ALog.e("OrangeAdapter", "onConfigUpdate context null", new Object[0]);
                return;
            }
            try {
                ALog.i("OrangeAdapter", "onConfigUpdate", "namespace", str);
                if ("accs".equals(str)) {
                    h.e();
                    h.d();
                }
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "onConfigUpdate", th, new Object[0]);
            }
        }
    }

    static {
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f79102a = true;
        } catch (Exception unused) {
            f79102a = false;
        }
    }

    public static boolean b() {
        boolean z;
        try {
            z = a(GlobalClientInfo.getContext(), "smart_hb_enable", true);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isSmartHb", th, new Object[0]);
            z = true;
        }
        ALog.d("OrangeAdapter", "isSmartHb", "result", Boolean.valueOf(z));
        return z;
    }

    public static boolean c() {
        boolean z;
        try {
            z = a(GlobalClientInfo.getContext(), "bind_service_enable", true);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isBindService", th, new Object[0]);
            z = true;
        }
        ALog.d("OrangeAdapter", "isBindService", "result", Boolean.valueOf(z));
        return z;
    }

    public static void e() {
        if (!a()) {
            ALog.e("OrangeAdapter", "force disable service", new Object[0]);
            ACCSManager.forceDisableService(GlobalClientInfo.getContext());
        } else if (UtilityImpl.d(GlobalClientInfo.getContext())) {
            ALog.i("OrangeAdapter", "force enable service", new Object[0]);
            ACCSManager.forceEnableService(GlobalClientInfo.getContext());
        }
    }

    public static void d() {
        HashMap hashMap = new HashMap();
        hashMap.put("tnet_log_off", Boolean.valueOf(a("accs", "tnet_log_off", "false")));
        hashMap.put("election_enable", Boolean.valueOf(a("accs", "election_enable", String.valueOf(GlobalClientInfo.f78906d))));
        hashMap.put("smart_hb_enable", Boolean.valueOf(a("accs", "heartbeat_smart_enable", "true")));
        hashMap.put("bind_service_enable", Boolean.valueOf(a("accs", "bind_service_enable", "true")));
        a(GlobalClientInfo.getContext(), (Map<String, Boolean>) hashMap);
        a(GlobalClientInfo.getContext(), "support_foreground_v", UtilityImpl.b(a("accs", "support_foreground_v", "24")));
        a(a("accs", "pullup", (String) null));
    }

    public static boolean a() {
        boolean z;
        try {
            z = Boolean.valueOf(a("accs", "main_function_enable", "true")).booleanValue();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isAccsEnabled", th, new Object[0]);
            z = true;
        }
        ALog.i("OrangeAdapter", "isAccsEnabled", "enable", Boolean.valueOf(z));
        return z;
    }

    private static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                SharedPreferences.Editor edit = c.a(GlobalClientInfo.getContext(), "ACCS_SDK", 0).edit();
                edit.putString("pullup", str);
                edit.apply();
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "savePullupInfo fail:", th, "pullup", str);
            }
            ALog.i("OrangeAdapter", "savePullupInfo", "pullup", str);
        }
    }

    public static boolean a(boolean z) {
        boolean z2;
        Throwable th;
        boolean z3;
        String str = "default";
        if (z) {
            try {
                str = a("accs", "tnet_log_off", "default");
            } catch (Throwable th2) {
                th = th2;
                z3 = true;
                ALog.e("OrangeAdapter", "isTnetLogOff", th, new Object[0]);
                z2 = z3;
                ALog.i("OrangeAdapter", "isTnetLogOff", "result", Boolean.valueOf(z2));
                return z2;
            }
        }
        if (str.equals("default")) {
            z2 = a(GlobalClientInfo.getContext(), "tnet_log_off", true);
        } else {
            z2 = Boolean.valueOf(str).booleanValue();
            try {
                b(GlobalClientInfo.getContext(), "tnet_log_off", z2);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                z3 = z2;
                th = th4;
            }
        }
        ALog.i("OrangeAdapter", "isTnetLogOff", "result", Boolean.valueOf(z2));
        return z2;
    }

    public static void a(String[] strArr, OrangeConfigListenerV1 orangeConfigListenerV1) {
        if (f79102a) {
            OrangeConfig.getInstance().registerListener(strArr, orangeConfigListenerV1);
        } else {
            ALog.w("OrangeAdapter", "no orange sdk", new Object[0]);
        }
    }

    private static void a(Context context, Map<String, Boolean> map) {
        if (map != null) {
            try {
                if (map.size() != 0) {
                    SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
                    for (Map.Entry next : map.entrySet()) {
                        edit.putBoolean((String) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                    }
                    edit.apply();
                    ALog.i("OrangeAdapter", "saveConfigsToSP", "configs", map.toString());
                }
            } catch (Exception e2) {
                ALog.e("OrangeAdapter", "saveConfigsToSP fail:", e2, "configs", map.toString());
            }
        }
    }

    public static String a(String str, String str2, String str3) {
        if (f79102a) {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }
        ALog.w("OrangeAdapter", "no orange sdk", new Object[0]);
        return str3;
    }

    public static void a(Context context, String str, int i) {
        if (context == null) {
            try {
                ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            } catch (Exception e2) {
                ALog.e("OrangeAdapter", "saveConfigToSP fail:", e2, "key", str, "value", Integer.valueOf(i));
            }
        } else {
            SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
            edit.putInt(str, i);
            edit.apply();
            ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Integer.valueOf(i));
        }
    }

    private static void b(Context context, String str, boolean z) {
        if (context == null) {
            try {
                ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            } catch (Exception e2) {
                ALog.e("OrangeAdapter", "saveConfigToSP fail:", e2, "key", str, "value", Boolean.valueOf(z));
            }
        } else {
            SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
            edit.putBoolean(str, z);
            edit.apply();
            ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Boolean.valueOf(z));
        }
    }

    private static boolean a(Context context, String str, boolean z) {
        try {
            return c.a(context, "ACCS_SDK", 0).getBoolean(str, z);
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "getConfigFromSP fail:", e2, "key", str);
            return z;
        }
    }
}
