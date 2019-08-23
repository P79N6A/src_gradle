package com.xiaomi.push;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class dp {

    /* renamed from: a  reason: collision with root package name */
    private double f81945a = 0.1d;

    /* renamed from: a  reason: collision with other field name */
    private long f271a;

    /* renamed from: a  reason: collision with other field name */
    public String f272a = "";

    /* renamed from: a  reason: collision with other field name */
    private ArrayList<dy> f273a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f81946b = 86400000;

    /* renamed from: b  reason: collision with other field name */
    public String f274b;

    /* renamed from: c  reason: collision with root package name */
    public String f81947c;

    /* renamed from: d  reason: collision with root package name */
    public String f81948d;

    /* renamed from: e  reason: collision with root package name */
    public String f81949e;

    /* renamed from: f  reason: collision with root package name */
    public String f81950f;
    public String g;
    protected String h;
    private String i;
    private String j = "s.mi1.cc";

    public dp(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f271a = System.currentTimeMillis();
            this.f273a.add(new dy(str, -1));
            this.f272a = dt.a();
            this.f274b = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    private void c(String str) {
        synchronized (this) {
            Iterator<dy> it2 = this.f273a.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(it2.next().f290a, str)) {
                    it2.remove();
                }
            }
        }
    }

    public dp a(JSONObject jSONObject) {
        synchronized (this) {
            this.f272a = jSONObject.optString("net");
            this.f81946b = jSONObject.getLong("ttl");
            this.f81945a = jSONObject.getDouble("pct");
            this.f271a = jSONObject.getLong(TimeDisplaySetting.TIME_DISPLAY_SETTING);
            this.f81948d = jSONObject.optString("city");
            this.f81947c = jSONObject.optString("prv");
            this.g = jSONObject.optString("cty");
            this.f81949e = jSONObject.optString("isp");
            this.f81950f = jSONObject.optString("ip");
            this.f274b = jSONObject.optString("host");
            this.h = jSONObject.optString("xf");
            JSONArray jSONArray = jSONObject.getJSONArray("fbs");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                a(new dy().a(jSONArray.getJSONObject(i2)));
            }
        }
        return this;
    }

    public String a() {
        String str;
        synchronized (this) {
            if (TextUtils.isEmpty(this.i)) {
                if (TextUtils.isEmpty(this.f81949e)) {
                    str = "hardcode_isp";
                } else {
                    this.i = az.a((Object[]) new String[]{this.f81949e, this.f81947c, this.f81948d, this.g, this.f81950f}, "_");
                }
            }
            str = this.i;
        }
        return str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ArrayList<String> m177a() {
        ArrayList<String> a2;
        synchronized (this) {
            a2 = a(false);
        }
        return a2;
    }

    public ArrayList<String> a(String str) {
        if (!TextUtils.isEmpty(str)) {
            URL url = new URL(str);
            if (TextUtils.equals(url.getHost(), this.f274b)) {
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator<String> it2 = a(true).iterator();
                while (it2.hasNext()) {
                    dr a2 = dr.a(it2.next(), url.getPort());
                    arrayList.add(new URL(url.getProtocol(), a2.a(), a2.a(), url.getFile()).toString());
                }
                return arrayList;
            }
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        throw new IllegalArgumentException("the url is empty.");
    }

    public ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        String substring;
        synchronized (this) {
            dy[] dyVarArr = new dy[this.f273a.size()];
            this.f273a.toArray(dyVarArr);
            Arrays.sort(dyVarArr);
            arrayList = new ArrayList<>();
            for (dy dyVar : dyVarArr) {
                if (z) {
                    substring = dyVar.f290a;
                } else {
                    int indexOf = dyVar.f290a.indexOf(":");
                    substring = indexOf != -1 ? dyVar.f290a.substring(0, indexOf) : dyVar.f290a;
                }
                arrayList.add(substring);
            }
        }
        return arrayList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public JSONObject m178a() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = new JSONObject();
            jSONObject.put("net", this.f272a);
            jSONObject.put("ttl", this.f81946b);
            jSONObject.put("pct", this.f81945a);
            jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, this.f271a);
            jSONObject.put("city", this.f81948d);
            jSONObject.put("prv", this.f81947c);
            jSONObject.put("cty", this.g);
            jSONObject.put("isp", this.f81949e);
            jSONObject.put("ip", this.f81950f);
            jSONObject.put("host", this.f274b);
            jSONObject.put("xf", this.h);
            JSONArray jSONArray = new JSONArray();
            Iterator<dy> it2 = this.f273a.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().a());
            }
            jSONObject.put("fbs", jSONArray);
        }
        return jSONObject;
    }

    public void a(double d2) {
        this.f81945a = d2;
    }

    public void a(long j2) {
        if (j2 > 0) {
            this.f81946b = j2;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j2);
    }

    /* access modifiers changed from: package-private */
    public void a(dy dyVar) {
        synchronized (this) {
            c(dyVar.f290a);
            this.f273a.add(dyVar);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m179a(String str) {
        synchronized (this) {
            a(new dy(str));
        }
    }

    public void a(String str, int i2, long j2, long j3, Exception exc) {
        Cdo doVar = new Cdo(i2, j2, j3, exc);
        a(str, doVar);
    }

    public void a(String str, long j2, long j3) {
        try {
            b(new URL(str).getHost(), j2, j3);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, long j2, long j3, Exception exc) {
        try {
            b(new URL(str).getHost(), j2, j3, exc);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, Cdo doVar) {
        synchronized (this) {
            Iterator<dy> it2 = this.f273a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                dy next = it2.next();
                if (TextUtils.equals(str, next.f290a)) {
                    next.a(doVar);
                    break;
                }
            }
        }
    }

    public void a(String[] strArr) {
        synchronized (this) {
            int size = this.f273a.size() - 1;
            while (true) {
                int i2 = 0;
                if (size >= 0) {
                    int length = strArr.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        if (TextUtils.equals(this.f273a.get(size).f290a, strArr[i2])) {
                            this.f273a.remove(size);
                            break;
                        }
                        i2++;
                    }
                    size--;
                } else {
                    Iterator<dy> it2 = this.f273a.iterator();
                    int i3 = 0;
                    while (it2.hasNext()) {
                        dy next = it2.next();
                        if (next.f81961a > i3) {
                            i3 = next.f81961a;
                        }
                    }
                    while (i2 < strArr.length) {
                        a(new dy(strArr[i2], (strArr.length + i3) - i2));
                        i2++;
                    }
                }
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m180a() {
        return TextUtils.equals(this.f272a, dt.a());
    }

    public boolean a(dp dpVar) {
        return TextUtils.equals(this.f272a, dpVar.f272a);
    }

    public void b(String str) {
        this.j = str;
    }

    public void b(String str, long j2, long j3) {
        a(str, 0, j2, j3, null);
    }

    public void b(String str, long j2, long j3, Exception exc) {
        a(str, -1, j2, j3, exc);
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f271a < this.f81946b;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        long j2 = 864000000;
        if (864000000 < this.f81946b) {
            j2 = this.f81946b;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis - this.f271a > j2 || (currentTimeMillis - this.f271a > this.f81946b && this.f272a.startsWith("WIFI-"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f272a);
        sb.append("\n");
        sb.append(a());
        Iterator<dy> it2 = this.f273a.iterator();
        while (it2.hasNext()) {
            sb.append("\n");
            sb.append(it2.next().toString());
        }
        sb.append("\n");
        return sb.toString();
    }
}
