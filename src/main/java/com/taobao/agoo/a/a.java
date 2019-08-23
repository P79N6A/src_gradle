package com.taobao.agoo.a;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.client.b;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentMap<String, Integer> f79113a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private String f79114b;

    /* renamed from: c  reason: collision with root package name */
    private long f79115c;

    /* renamed from: d  reason: collision with root package name */
    private Context f79116d;

    public void a() {
        this.f79114b = null;
    }

    private void b() {
        try {
            String string = c.a(this.f79116d, "AGOO_BIND", 0).getString("bind_status", null);
            if (TextUtils.isEmpty(string)) {
                ALog.w("AgooBindCache", "restoreAgooClients packs null return", new Object[0]);
                return;
            }
            JSONArray jSONArray = new JSONArray(string);
            this.f79115c = jSONArray.getLong(0);
            if (System.currentTimeMillis() < this.f79115c + 86400000) {
                for (int i = 1; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    this.f79113a.put(jSONObject.getString("p"), Integer.valueOf(jSONObject.getInt(NotifyType.SOUND)));
                }
                ALog.i("AgooBindCache", "restoreAgooClients", "mAgooBindStatus", this.f79113a);
                return;
            }
            ALog.i("AgooBindCache", "restoreAgooClients expired", "agooLastFlushTime", Long.valueOf(this.f79115c));
            this.f79115c = 0;
        } catch (Exception unused) {
        }
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f79114b = str;
        }
    }

    public boolean d(String str) {
        if (this.f79114b == null || !this.f79114b.equals(str)) {
            return false;
        }
        return true;
    }

    public a(Context context) {
        if (context != null) {
            this.f79116d = context.getApplicationContext();
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    public void a(String str) {
        Integer num = (Integer) this.f79113a.get(str);
        if (num == null || num.intValue() != 2) {
            this.f79113a.put(str, 2);
            b.a(this.f79116d, "AGOO_BIND", this.f79115c, this.f79113a);
        }
    }

    public boolean b(String str) {
        if (this.f79113a.isEmpty()) {
            b();
        }
        Integer num = (Integer) this.f79113a.get(str);
        ALog.i("AgooBindCache", "isAgooRegistered", "packageName", str, "appStatus", num, "agooBindStatus", this.f79113a);
        if (!UtilityImpl.a("Agoo_AppStore", this.f79116d) && num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }
}
