package com.ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.loginsetting.LoginSettingResponse;
import com.ss.android.ugc.aweme.account.loginsetting.ThirdBindSettingsResponse;
import com.ss.android.ugc.aweme.b;
import com.ss.android.ugc.aweme.q.c;
import java.util.Collections;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33102a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f33103b = -1;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21354, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21354, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return e().getBoolean("is_accept_term_privacy_new", false);
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21365, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21365, new Class[0], Boolean.TYPE)).booleanValue();
        }
        return e().getBoolean("user_has_password", false);
    }

    public static int c() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21368, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21368, new Class[0], Integer.TYPE)).intValue();
        }
        if (f33103b == -1) {
            f33103b = e().getInt("ftc_age_enable", 0);
        }
        return f33103b;
    }

    public static String d() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21378, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21378, new Class[0], String.class);
        }
        return e().getString("after_login_birthday", "");
    }

    public static SharedPreferences e() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21389, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21389, new Class[0], SharedPreferences.class);
        }
        return c.a(b.f34450b, "aweme-app", 0);
    }

    public static SharedPreferences f() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21391, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21391, new Class[0], SharedPreferences.class);
        }
        return c.a(b.f34450b, "aweme_account_terminal_relative_sp", 0);
    }

    public static SharedPreferences h() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21396, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21396, new Class[0], SharedPreferences.class);
        }
        return c.a(b.f34450b, "account_aweme_login_settings_file", 0);
    }

    public static SharedPreferences j() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21399, new Class[0], SharedPreferences.class)) {
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21399, new Class[0], SharedPreferences.class);
        }
        return c.a(b.f34450b, "account_aweme_third_bind_settings_file", 0);
    }

    @NonNull
    public static List<LoginSettingResponse.SettingInfo> g() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21395, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21395, new Class[0], List.class);
        }
        String string = h().getString("aweme_login_setting_content", "");
        if (TextUtils.isEmpty(string)) {
            return Collections.emptyList();
        }
        try {
            LoginSettingResponse loginSettingResponse = (LoginSettingResponse) new Gson().fromJson(string, LoginSettingResponse.class);
            if (loginSettingResponse != null && !CollectionUtils.isEmpty(loginSettingResponse.getData())) {
                return loginSettingResponse.getData();
            }
        } catch (Exception unused) {
        }
        return Collections.emptyList();
    }

    @NonNull
    public static List<ThirdBindSettingsResponse.BindSetting> i() {
        if (PatchProxy.isSupport(new Object[0], null, f33102a, true, 21398, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f33102a, true, 21398, new Class[0], List.class);
        }
        String string = j().getString("aweme_third_bind_setting_content", "");
        if (TextUtils.isEmpty(string)) {
            return Collections.emptyList();
        }
        try {
            ThirdBindSettingsResponse thirdBindSettingsResponse = (ThirdBindSettingsResponse) new Gson().fromJson(string, ThirdBindSettingsResponse.class);
            if (thirdBindSettingsResponse != null && !CollectionUtils.isEmpty(thirdBindSettingsResponse.data)) {
                return thirdBindSettingsResponse.data;
            }
        } catch (Exception unused) {
        }
        return Collections.emptyList();
    }

    public static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f33102a, true, 21341, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f33102a, true, 21341, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        e().edit().putInt("sync_to_toutiao", i).apply();
    }

    public static void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f33102a, true, 21346, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f33102a, true, 21346, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e().edit().putBoolean("enable_email_login_switch", z).apply();
    }

    public static void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f33102a, true, 21349, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f33102a, true, 21349, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e().edit().putBoolean("is_sync_to_huoshan", z).apply();
    }

    public static void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, null, f33102a, true, 21353, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, null, f33102a, true, 21353, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e().edit().putBoolean("is_accept_term_privacy_new", true).apply();
    }

    public static void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f33102a, true, 21357, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f33102a, true, 21357, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e().edit().putBoolean("is_publish_sync_toutiao_new", z).apply();
    }

    public static void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f33102a, true, 21385, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f33102a, true, 21385, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e().edit().putBoolean("enable_authorize_instagram_with_english", z).commit();
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33102a, true, 21379, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f33102a, true, 21379, new Class[]{String.class}, Void.TYPE);
            return;
        }
        e().edit().putString("after_login_birthday", str2).apply();
    }

    public static void g(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f33102a, true, 21393, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f33102a, true, 21393, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        f().edit().putBoolean("account_terminal_app_has_logged_out", z).apply();
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f33102a, true, 21344, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f33102a, true, 21344, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e().edit().putBoolean("enable_passport_service_switch", z).apply();
    }
}
