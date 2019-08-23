package com.ss.android.ugc.aweme.im.sdk.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.im.sdk.model.XPlanAwemeBannerConfig;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import com.ss.android.ugc.aweme.q.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SuppressLint({"ApplySharedPref"})
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52605a;

    /* renamed from: d  reason: collision with root package name */
    private static o f52606d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile long f52607e;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f52608b;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f52609c = c.a(GlobalContext.getContext(), "iuserstate", 0);

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f52610f = c.a(GlobalContext.getContext(), "imbase_bydid", 0);

    private o() {
        f52607e = d.d();
        Context context = GlobalContext.getContext();
        this.f52608b = c.a(context, "imbase_" + f52607e, 0);
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53404, new Class[0], Integer.TYPE)) {
            return this.f52608b.getInt("last_msghelper_unread_count", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53404, new Class[0], Integer.TYPE)).intValue();
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53406, new Class[0], Integer.TYPE)) {
            return this.f52608b.getInt("last_xcard_unread_dot", 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53406, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53410, new Class[0], Boolean.TYPE)) {
            return this.f52608b.getBoolean("user_x_active", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53410, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final String e() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53414, new Class[0], String.class)) {
            return this.f52608b.getString("upload_image_auth_key", null);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53414, new Class[0], String.class);
    }

    public final boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53416, new Class[0], Boolean.TYPE)) {
            return this.f52608b.getBoolean("flip_chat_deleted_state", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53416, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final long g() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53418, new Class[0], Long.TYPE)) {
            return this.f52608b.getLong("flip_chat_last_msg_time", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53418, new Class[0], Long.TYPE)).longValue();
    }

    public final long h() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53420, new Class[0], Long.TYPE)) {
            return this.f52608b.getLong("flip_chat_last_unread_msg_time", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53420, new Class[0], Long.TYPE)).longValue();
    }

    public final long i() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53422, new Class[0], Long.TYPE)) {
            return this.f52608b.getLong("flip_chat_last_unread_dot_msg_time", 0);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53422, new Class[0], Long.TYPE)).longValue();
    }

    public final String j() {
        if (!PatchProxy.isSupport(new Object[0], this, f52605a, false, 53436, new Class[0], String.class)) {
            return this.f52609c.getString("token", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53436, new Class[0], String.class);
    }

    public static synchronized o a() {
        synchronized (o.class) {
            if (PatchProxy.isSupport(new Object[0], null, f52605a, true, 53402, new Class[0], o.class)) {
                o oVar = (o) PatchProxy.accessDispatch(new Object[0], null, f52605a, true, 53402, new Class[0], o.class);
                return oVar;
            }
            long d2 = d.d();
            if (f52606d == null || d2 != f52607e) {
                synchronized (o.class) {
                    if (f52606d == null || d2 != f52607e) {
                        f52606d = new o();
                    }
                }
            }
            o oVar2 = f52606d;
            return oVar2;
        }
    }

    public final XPlanAwemeBannerConfig k() {
        if (PatchProxy.isSupport(new Object[0], this, f52605a, false, 53439, new Class[0], XPlanAwemeBannerConfig.class)) {
            return (XPlanAwemeBannerConfig) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53439, new Class[0], XPlanAwemeBannerConfig.class);
        }
        String string = this.f52608b.getString("banner_config", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (XPlanAwemeBannerConfig) l.a(string, XPlanAwemeBannerConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f52605a, false, 53441, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53441, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - this.f52608b.getLong("token_fetch_time", 0) > 14400000) {
            z = true;
        }
        return z;
    }

    public final boolean m() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f52605a, false, 53445, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53445, new Class[0], Boolean.TYPE)).booleanValue();
        }
        long j = this.f52608b.getLong("follow_list_fetch_time", 0);
        if (m.a()) {
            i = 1;
        } else {
            i = 3;
        }
        if (System.currentTimeMillis() - j > ((long) (i * 24 * 3600 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
            return true;
        }
        return false;
    }

    public final List<a> n() {
        if (PatchProxy.isSupport(new Object[0], this, f52605a, false, 53448, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53448, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (String a2 : this.f52608b.getStringSet("group_greet_msg", new HashSet())) {
                arrayList.add(l.a(a2, a.class));
            }
            return arrayList;
        } catch (Exception unused) {
            return arrayList;
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53407, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53407, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 1:
                this.f52608b.edit().putBoolean("sync_alert_del_msg", true).commit();
                return;
            case 2:
                this.f52608b.edit().putBoolean("sync_alert_unfollow", true).commit();
                return;
            case 3:
                this.f52608b.edit().putBoolean("sync_alert_block", true).commit();
                break;
        }
    }

    public final void c(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f52605a, false, 53421, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f52605a, false, 53421, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f52608b.edit().putLong("flip_chat_last_unread_dot_msg_time", j2).commit();
    }

    public final void d(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f52605a, false, 53443, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f52605a, false, 53443, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f52608b.edit().putLong("follow_list_fetch_time", j2).commit();
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53403, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53403, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f52608b.edit().putInt("last_msghelper_unread_count", i).commit();
    }

    public final void b(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f52605a, false, 53419, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f52605a, false, 53419, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f52608b.edit().putLong("flip_chat_last_unread_msg_time", j2).commit();
    }

    public final boolean c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53408, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53408, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        switch (i) {
            case 1:
                if (!this.f52608b.getBoolean("sync_alert_del_msg", false)) {
                    return true;
                }
                return false;
            case 2:
                if (!this.f52608b.getBoolean("sync_alert_unfollow", false)) {
                    return true;
                }
                return false;
            case 3:
                if (!this.f52608b.getBoolean("sync_alert_block", false)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public final void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53411, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53411, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 2:
                this.f52608b.edit().putBoolean("goto_x_1st_from_profile", true).commit();
                break;
            case 3:
                this.f52608b.edit().putBoolean("goto_x_1st_from_profile_more", true).commit();
                break;
            case 4:
                this.f52608b.edit().putBoolean("goto_x_1st_from_contacts", true).commit();
                break;
        }
        this.f52610f.edit().putLong("goto_x_1st_alert_time", System.currentTimeMillis()).commit();
    }

    public final boolean e(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53412, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52605a, false, 53412, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - this.f52610f.getLong("goto_x_1st_alert_time", 0) <= 86400000) {
            return false;
        }
        switch (i) {
            case 2:
                if (!this.f52608b.getBoolean("goto_x_1st_from_profile", false)) {
                    return true;
                }
                return false;
            case 3:
                if (!this.f52608b.getBoolean("goto_x_1st_from_profile_more", false)) {
                    return true;
                }
                return false;
            case 4:
                if (!this.f52608b.getBoolean("goto_x_1st_from_contacts", false)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f52605a, false, 53417, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f52605a, false, 53417, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f52608b.edit().putLong("flip_chat_last_msg_time", j2).commit();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f52605a, false, 53415, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f52605a, false, 53415, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f52608b.edit().putBoolean("flip_chat_deleted_state", z).commit();
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f52605a, false, 53435, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f52605a, false, 53435, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f52609c.edit().putString("token", str).commit();
        if (!TextUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[0], this, f52605a, false, 53440, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52605a, false, 53440, new Class[0], Void.TYPE);
                return;
            }
            this.f52608b.edit().putLong("token_fetch_time", System.currentTimeMillis()).commit();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f52605a, false, 53409, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f52605a, false, 53409, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f52608b.edit().putBoolean("user_x_active", true).commit();
    }
}
