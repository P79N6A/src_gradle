package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.g;
import com.xiaomi.push.j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f81783a;

    /* renamed from: a  reason: collision with other field name */
    private Context f116a;

    /* renamed from: a  reason: collision with other field name */
    private a f117a;

    /* renamed from: a  reason: collision with other field name */
    String f118a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, a> f119a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f81784a = 1;

        /* renamed from: a  reason: collision with other field name */
        private Context f120a;

        /* renamed from: a  reason: collision with other field name */
        public String f121a;

        /* renamed from: a  reason: collision with other field name */
        public boolean f122a = true;

        /* renamed from: b  reason: collision with root package name */
        public String f81785b;

        /* renamed from: b  reason: collision with other field name */
        public boolean f123b;

        /* renamed from: c  reason: collision with root package name */
        public String f81786c;

        /* renamed from: d  reason: collision with root package name */
        public String f81787d;

        /* renamed from: e  reason: collision with root package name */
        public String f81788e;

        /* renamed from: f  reason: collision with root package name */
        public String f81789f;
        public String g;
        public String h;

        public a(Context context) {
            this.f120a = context;
        }

        public static a a(Context context, String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(context);
                aVar.f121a = jSONObject.getString("appId");
                aVar.f81785b = jSONObject.getString("appToken");
                aVar.f81786c = jSONObject.getString("regId");
                aVar.f81787d = jSONObject.getString("regSec");
                aVar.f81789f = jSONObject.getString("devId");
                aVar.f81788e = jSONObject.getString("vName");
                aVar.f122a = jSONObject.getBoolean("valid");
                aVar.f123b = jSONObject.getBoolean("paused");
                aVar.f81784a = jSONObject.getInt("envType");
                aVar.g = jSONObject.getString("regResource");
                return aVar;
            } catch (Throwable th) {
                b.a(th);
                return null;
            }
        }

        private String a() {
            return g.a(this.f120a, this.f120a.getPackageName());
        }

        public static String a(a aVar) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appId", aVar.f121a);
                jSONObject.put("appToken", aVar.f81785b);
                jSONObject.put("regId", aVar.f81786c);
                jSONObject.put("regSec", aVar.f81787d);
                jSONObject.put("devId", aVar.f81789f);
                jSONObject.put("vName", aVar.f81788e);
                jSONObject.put("valid", aVar.f122a);
                jSONObject.put("paused", aVar.f123b);
                jSONObject.put("envType", aVar.f81784a);
                jSONObject.put("regResource", aVar.g);
                return jSONObject.toString();
            } catch (Throwable th) {
                b.a(th);
                return null;
            }
        }

        /* renamed from: a  reason: collision with other method in class */
        public void m66a() {
            d.a(this.f120a).edit().clear().commit();
            this.f121a = null;
            this.f81785b = null;
            this.f81786c = null;
            this.f81787d = null;
            this.f81789f = null;
            this.f81788e = null;
            this.f122a = false;
            this.f123b = false;
            this.h = null;
            this.f81784a = 1;
        }

        public void a(int i) {
            this.f81784a = i;
        }

        public void a(String str, String str2) {
            this.f81786c = str;
            this.f81787d = str2;
            this.f81789f = j.l(this.f120a);
            this.f81788e = a();
            this.f122a = true;
        }

        public void a(String str, String str2, String str3) {
            this.f121a = str;
            this.f81785b = str2;
            this.g = str3;
            SharedPreferences.Editor edit = d.a(this.f120a).edit();
            edit.putString("appId", this.f121a);
            edit.putString("appToken", str2);
            edit.putString("regResource", str3);
            edit.commit();
        }

        public void a(boolean z) {
            this.f123b = z;
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m67a() {
            return a(this.f121a, this.f81785b);
        }

        /* renamed from: a  reason: collision with other method in class */
        public boolean m68a(String str, String str2) {
            return TextUtils.equals(this.f121a, str) && TextUtils.equals(this.f81785b, str2) && !TextUtils.isEmpty(this.f81786c) && !TextUtils.isEmpty(this.f81787d) && (TextUtils.equals(this.f81789f, j.l(this.f120a)) || TextUtils.equals(this.f81789f, j.k(this.f120a)));
        }

        public void b() {
            this.f122a = false;
            d.a(this.f120a).edit().putBoolean("valid", this.f122a).commit();
        }

        public void b(String str, String str2, String str3) {
            this.f81786c = str;
            this.f81787d = str2;
            this.f81789f = j.l(this.f120a);
            this.f81788e = a();
            this.f122a = true;
            this.h = str3;
            SharedPreferences.Editor edit = d.a(this.f120a).edit();
            edit.putString("regId", str);
            edit.putString("regSec", str2);
            edit.putString("devId", this.f81789f);
            edit.putString("vName", a());
            edit.putBoolean("valid", true);
            edit.putString("appRegion", str3);
            edit.commit();
        }

        public void c(String str, String str2, String str3) {
            this.f121a = str;
            this.f81785b = str2;
            this.g = str3;
        }
    }

    private d(Context context) {
        this.f116a = context;
        c();
    }

    public static SharedPreferences a(Context context) {
        return c.a(context, "mipush", 0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static d m54a(Context context) {
        if (f81783a == null) {
            synchronized (d.class) {
                try {
                    if (f81783a == null) {
                        f81783a = new d(context);
                    }
                } catch (Throwable th) {
                    Class<d> cls = d.class;
                    throw th;
                }
            }
        }
        return f81783a;
    }

    private void c() {
        this.f117a = new a(this.f116a);
        this.f119a = new HashMap();
        SharedPreferences a2 = a(this.f116a);
        this.f117a.f121a = a2.getString("appId", null);
        this.f117a.f81785b = a2.getString("appToken", null);
        this.f117a.f81786c = a2.getString("regId", null);
        this.f117a.f81787d = a2.getString("regSec", null);
        this.f117a.f81789f = a2.getString("devId", null);
        if (!TextUtils.isEmpty(this.f117a.f81789f) && this.f117a.f81789f.startsWith("a-")) {
            this.f117a.f81789f = j.l(this.f116a);
            a2.edit().putString("devId", this.f117a.f81789f).commit();
        }
        this.f117a.f81788e = a2.getString("vName", null);
        this.f117a.f122a = a2.getBoolean("valid", true);
        this.f117a.f123b = a2.getBoolean("paused", false);
        this.f117a.f81784a = a2.getInt("envType", 1);
        this.f117a.g = a2.getString("regResource", null);
        this.f117a.h = a2.getString("appRegion", null);
    }

    public int a() {
        return this.f117a.f81784a;
    }

    public a a(String str) {
        if (this.f119a.containsKey(str)) {
            return this.f119a.get(str);
        }
        String str2 = "hybrid_app_info_" + str;
        SharedPreferences a2 = a(this.f116a);
        if (!a2.contains(str2)) {
            return null;
        }
        a a3 = a.a(this.f116a, a2.getString(str2, ""));
        this.f119a.put(str2, a3);
        return a3;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m55a() {
        return this.f117a.f121a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m56a() {
        this.f117a.a();
    }

    public void a(int i) {
        this.f117a.a(i);
        a(this.f116a).edit().putInt("envType", i).commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m57a(String str) {
        SharedPreferences.Editor edit = a(this.f116a).edit();
        edit.putString("vName", str);
        edit.commit();
        this.f117a.f81788e = str;
    }

    public void a(String str, a aVar) {
        this.f119a.put(str, aVar);
        String a2 = a.a(aVar);
        a(this.f116a).edit().putString("hybrid_app_info_" + str, a2).commit();
    }

    public void a(String str, String str2, String str3) {
        this.f117a.a(str, str2, str3);
    }

    public void a(boolean z) {
        this.f117a.a(z);
        a(this.f116a).edit().putBoolean("paused", z).commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m58a() {
        return !TextUtils.equals(g.a(this.f116a, this.f116a.getPackageName()), this.f117a.f81788e);
    }

    public boolean a(String str, String str2) {
        return this.f117a.a(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m59a(String str, String str2, String str3) {
        a a2 = a(str3);
        return a2 != null && TextUtils.equals(str, a2.f121a) && TextUtils.equals(str2, a2.f81785b);
    }

    public String b() {
        return this.f117a.f81785b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m60b() {
        this.f117a.b();
    }

    public void b(String str) {
        this.f119a.remove(str);
        a(this.f116a).edit().remove("hybrid_app_info_" + str).commit();
    }

    public void b(String str, String str2, String str3) {
        this.f117a.b(str, str2, str3);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m61b() {
        if (this.f117a.a()) {
            return true;
        }
        b.a("Don't send message before initialization succeeded!");
        return false;
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m62c() {
        return this.f117a.f81786c;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m63c() {
        return this.f117a.a();
    }

    public String d() {
        return this.f117a.f81787d;
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m64d() {
        return this.f117a.f123b;
    }

    public String e() {
        return this.f117a.g;
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m65e() {
        return !this.f117a.f122a;
    }

    public String f() {
        return this.f117a.h;
    }
}
