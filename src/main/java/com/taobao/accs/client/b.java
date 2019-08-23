package com.taobao.accs.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.utl.ALog;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f78915a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentMap<String, Integer> f78916b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentMap<String, Set<String>> f78917c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private long f78918d;

    /* renamed from: e  reason: collision with root package name */
    private String f78919e = "ClientManager_";

    /* renamed from: f  reason: collision with root package name */
    private String f78920f = "ACCS_BIND";

    private void a() {
        try {
            String string = c.a(this.f78915a, this.f78920f, 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.w(this.f78919e, "restoreClients break as packages null", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f78918d = jSONArray.getLong(0);
            if (System.currentTimeMillis() < this.f78918d + 86400000) {
                for (int i = 1; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    this.f78916b.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt(NotifyType.SOUND)));
                }
                ALog.i(this.f78919e, "restoreClients success", "mBindStatus", this.f78916b);
                return;
            }
            ALog.i(this.f78919e, "restoreClients expired", "lastFlushTime", Long.valueOf(this.f78918d));
            this.f78918d = 0;
        } catch (Exception e2) {
            ALog.w(this.f78919e, "restoreClients", e2, new Object[0]);
        }
    }

    public boolean d(String str) {
        Integer num = (Integer) this.f78916b.get(str);
        if (num == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    public void a(String str) {
        Integer num = (Integer) this.f78916b.get(str);
        if (num == null || num.intValue() != 2) {
            this.f78916b.put(str, 2);
            a(this.f78915a, this.f78920f, this.f78918d, this.f78916b);
        }
    }

    public void b(String str) {
        Integer num = (Integer) this.f78916b.get(str);
        if (num == null || num.intValue() != 4) {
            this.f78916b.put(str, 4);
            a(this.f78915a, this.f78920f, this.f78918d, this.f78916b);
        }
    }

    public boolean c(String str) {
        if (this.f78916b.isEmpty()) {
            a();
        }
        Integer num = (Integer) this.f78916b.get(str);
        ALog.i(this.f78919e, "isAppBinded", "appStatus", num, "mBindStatus", this.f78916b);
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public void e(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f78917c.remove(str);
            }
        } catch (Exception e2) {
            String str2 = this.f78919e;
            ALog.e(str2, this.f78919e + e2.toString(), new Object[0]);
        }
    }

    public b(Context context, String str) {
        if (context != null) {
            this.f78919e += str;
            this.f78915a = context.getApplicationContext();
            this.f78920f = "ACCS_BIND".concat(String.valueOf(str));
            a();
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    public boolean b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Set set = (Set) this.f78917c.get(str);
            if (set != null && set.contains(str2)) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            String str3 = this.f78919e;
            ALog.e(str3, this.f78919e + e2.toString(), new Object[0]);
        }
    }

    public void a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    Set set = (Set) this.f78917c.get(str);
                    if (set == null) {
                        set = new HashSet();
                    }
                    set.add(str2);
                    this.f78917c.put(str, set);
                }
            }
        } catch (Exception e2) {
            String str3 = this.f78919e;
            ALog.e(str3, this.f78919e + e2.toString(), new Object[0]);
        }
    }

    public static void a(Context context, String str, long j, Map<String, Integer> map) {
        try {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            JSONArray jSONArray = new JSONArray();
            if (j <= 0 || j >= System.currentTimeMillis()) {
                double currentTimeMillis = (double) System.currentTimeMillis();
                double random = Math.random() * 8.64E7d;
                Double.isNaN(currentTimeMillis);
                jSONArray.put(currentTimeMillis - random);
            } else {
                jSONArray.put(j);
            }
            for (String str2 : strArr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("p", str2);
                jSONObject.put(NotifyType.SOUND, map.get(str2).intValue());
                jSONArray.put(jSONObject);
            }
            SharedPreferences.Editor edit = c.a(context, str, 0).edit();
            edit.putString("bind_status", jSONArray.toString());
            edit.apply();
        } catch (Exception unused) {
        }
    }
}
