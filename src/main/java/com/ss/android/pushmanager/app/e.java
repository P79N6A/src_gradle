package com.ss.android.pushmanager.app;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.message.NotifyService;
import com.ss.android.message.a;
import com.ss.android.message.b.k;
import com.ss.android.message.sswo.SswoActivity;
import com.ss.android.pushmanager.app.d;
import com.ss.android.pushmanager.c;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.i;
import com.ss.android.pushmanager.setting.b;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

public class e implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30507a;

    /* renamed from: d  reason: collision with root package name */
    protected static e f30508d;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f30509b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f30510c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f30511e;

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f30507a, true, 19001, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f30507a, true, 19001, new Class[0], e.class);
        }
        if (f30508d != null) {
            return f30508d;
        }
        throw new IllegalStateException("MessageData not init");
    }

    public final c b() {
        if (PatchProxy.isSupport(new Object[0], this, f30507a, false, 19004, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f30507a, false, 19004, new Class[0], c.class);
        } else if (this.f30510c != null) {
            return this.f30510c;
        } else {
            throw new IllegalStateException("appContext not init");
        }
    }

    public final Map<String, String> c() {
        Map map;
        if (PatchProxy.isSupport(new Object[0], this, f30507a, false, 19005, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f30507a, false, 19005, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        b.a().a((Map<String, String>) hashMap);
        HashMap hashMap2 = new HashMap();
        String str = (String) hashMap.get(i.f30563b);
        if (!StringUtils.isEmpty(str)) {
            hashMap2.put("iid", str);
        }
        String str2 = (String) hashMap.get(i.f30562a);
        if (!StringUtils.isEmpty(str2)) {
            hashMap2.put("device_id", str2);
        }
        String networkAccessType = NetworkUtils.getNetworkAccessType(this.f30509b);
        if (!StringUtils.isEmpty(networkAccessType)) {
            hashMap2.put("ac", networkAccessType);
        }
        String d2 = this.f30510c.d();
        if (d2 != null) {
            hashMap2.put("channel", d2);
        }
        hashMap2.put("aid", String.valueOf(this.f30510c.c()));
        String b2 = this.f30510c.b();
        if (b2 != null) {
            hashMap2.put("app_name", b2);
        }
        hashMap2.put("version_code", String.valueOf(this.f30510c.f()));
        hashMap2.put("version_name", this.f30510c.e());
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("language", Locale.getDefault().getLanguage());
        hashMap2.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        try {
            String str3 = Build.VERSION.RELEASE;
            if (str3 != null && str3.length() > 10) {
                str3 = str3.substring(0, 10);
            }
            hashMap2.put("os_version", str3);
        } catch (Exception unused) {
        }
        String str4 = (String) hashMap.get(i.f30565d);
        if (!StringUtils.isEmpty(str4)) {
            hashMap2.put("openudid", str4);
        }
        int dpi = UIUtils.getDpi(this.f30509b);
        if (dpi > 0) {
            hashMap2.put("dpi", String.valueOf(dpi));
        }
        hashMap2.put("rom", k.b());
        hashMap2.put("os", "android");
        hashMap2.put("package", this.f30509b.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            hashMap2.put("tz_name", timeZone.getID());
        }
        String language = Locale.getDefault().getLanguage();
        if (!StringUtils.isEmpty(language)) {
            hashMap2.put("language", language);
        }
        String country = Locale.getDefault().getCountry();
        if (!StringUtils.isEmpty(country)) {
            hashMap2.put("region", country.toLowerCase());
        }
        try {
            hashMap2.put("country", f.b().b());
            com.ss.android.pushmanager.b b3 = f.b();
            if (PatchProxy.isSupport(new Object[0], b3, com.ss.android.pushmanager.b.f30518a, false, 18927, new Class[0], Map.class)) {
                map = (Map) PatchProxy.accessDispatch(new Object[0], b3, com.ss.android.pushmanager.b.f30518a, false, 18927, new Class[0], Map.class);
            } else {
                map = new HashMap();
            }
            if (map != null) {
                hashMap2.putAll(map);
            }
            hashMap2.put("rom_version", com.ss.android.message.b.i.f29990b);
        } catch (Exception unused2) {
        }
        return hashMap2;
    }

    public e(final c cVar) {
        this.f30510c = cVar;
        this.f30509b = cVar.a();
        d.f30505a = this;
        d.f30506b = new d.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30512a;

            public final String c() {
                return "message_data";
            }

            public final String d() {
                return "com.ss.android.message";
            }

            public final c a() {
                return cVar;
            }

            public final Class b() {
                return NotifyService.class;
            }

            public final String e() {
                if (!PatchProxy.isSupport(new Object[0], this, f30512a, false, 19006, new Class[0], String.class)) {
                    return f.a().a();
                }
                return (String) PatchProxy.accessDispatch(new Object[0], this, f30512a, false, 19006, new Class[0], String.class);
            }

            public final String f() {
                if (!PatchProxy.isSupport(new Object[0], this, f30512a, false, 19007, new Class[0], String.class)) {
                    return k.b();
                }
                return (String) PatchProxy.accessDispatch(new Object[0], this, f30512a, false, 19007, new Class[0], String.class);
            }

            public final boolean g() {
                if (!PatchProxy.isSupport(new Object[0], this, f30512a, false, 19009, new Class[0], Boolean.TYPE)) {
                    return SswoActivity.a();
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f30512a, false, 19009, new Class[0], Boolean.TYPE)).booleanValue();
            }

            public final Map<String, String> h() {
                if (!PatchProxy.isSupport(new Object[0], this, f30512a, false, 19010, new Class[0], Map.class)) {
                    return e.this.c();
                }
                return (Map) PatchProxy.accessDispatch(new Object[0], this, f30512a, false, 19010, new Class[0], Map.class);
            }

            public final void a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
                long j3 = j;
                long j4 = j2;
                if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, this, f30512a, false, 19008, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, this, f30512a, false, 19008, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
                    return;
                }
                f.a().a(context, str, str2, str3, j, j2, jSONObject);
            }
        };
    }

    public static void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, null, f30507a, true, 19002, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, null, f30507a, true, 19002, new Class[]{e.class}, Void.TYPE);
        } else if (f30508d == null) {
            f30508d = eVar;
        } else {
            throw new IllegalStateException("MessageData already inited");
        }
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f30507a, false, 19003, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f30507a, false, 19003, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Logger.debug();
        if (!this.f30511e) {
            try {
                a.a((Application) context.getApplicationContext());
                this.f30511e = true;
            } catch (Exception unused) {
            }
        }
    }
}
