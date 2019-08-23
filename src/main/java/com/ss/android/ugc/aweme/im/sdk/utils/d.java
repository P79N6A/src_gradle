package com.ss.android.ugc.aweme.im.sdk.utils;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52581a;

    public static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f52581a, true, 53332, new Class[]{String.class}, Boolean.TYPE)) {
            return b().equals(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f52581a, true, 53332, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public static CharSequence b() {
        if (PatchProxy.isSupport(new Object[0], null, f52581a, true, 53330, new Class[0], CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[0], null, f52581a, true, 53330, new Class[0], CharSequence.class);
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null) {
            return "-1";
        }
        return iUserService.getCurrentUserID();
    }

    public static User c() {
        if (PatchProxy.isSupport(new Object[0], null, f52581a, true, 53331, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], null, f52581a, true, 53331, new Class[0], User.class);
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null) {
            return null;
        }
        return iUserService.getCurrentUser();
    }

    public static long d() {
        if (PatchProxy.isSupport(new Object[0], null, f52581a, true, 53334, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f52581a, true, 53334, new Class[0], Long.TYPE)).longValue();
        }
        return Long.parseLong(b().toString());
    }

    public static String e() {
        if (PatchProxy.isSupport(new Object[0], null, f52581a, true, 53336, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f52581a, true, 53336, new Class[0], String.class);
        }
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) GlobalContext.getContext().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getNetworkOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    public static String f() {
        if (PatchProxy.isSupport(new Object[0], null, f52581a, true, 53337, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f52581a, true, 53337, new Class[0], String.class);
        }
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) GlobalContext.getContext().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getSimOperator();
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            return "";
        } catch (Exception unused) {
        }
    }

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f52581a, true, 53329, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f52581a, true, 53329, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null && iUserService.isLogin()) {
            z = true;
        }
        return z;
    }

    public static boolean a(IMUser iMUser) {
        if (PatchProxy.isSupport(new Object[]{iMUser}, null, f52581a, true, 53333, new Class[]{IMUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMUser}, null, f52581a, true, 53333, new Class[]{IMUser.class}, Boolean.TYPE)).booleanValue();
        } else if (iMUser == null || !b().equals(iMUser.getUid())) {
            return false;
        } else {
            return true;
        }
    }

    public static void b(String str, Map<String, Object> map) {
        String str2 = str;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f52581a, true, 53340, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f52581a, true, 53340, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        a(str2, null, map2, "im_error_event");
    }

    public static void a(String str, Map<String, Object> map) {
        String str2 = str;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str2, map2}, null, f52581a, true, 53338, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, map2}, null, f52581a, true, 53338, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        a(str2, null, map2);
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        String str3 = str;
        String str4 = str2;
        Map<String, Object> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str3, str4, map2}, null, f52581a, true, 53339, new Class[]{String.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, map2}, null, f52581a, true, 53339, new Class[]{String.class, String.class, Map.class}, Void.TYPE);
            return;
        }
        a(str3, str4, map2, "im_event");
    }

    private static void a(String str, String str2, Map<String, Object> map, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, map, str6}, null, f52581a, true, 53341, new Class[]{String.class, String.class, Map.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str4, str5, map, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52581a, true, 53341, new Class[]{String.class, String.class, Map.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str4);
                } else {
                    jSONObject.put("service", str4 + "_" + str5);
                }
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
                MonitorUtils.monitorCommonLog(str6, jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
