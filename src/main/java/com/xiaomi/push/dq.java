package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class dq {

    /* renamed from: a  reason: collision with root package name */
    private String f81951a;

    /* renamed from: a  reason: collision with other field name */
    private final ArrayList<dp> f275a = new ArrayList<>();

    public dq() {
    }

    public dq(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f81951a = str;
            return;
        }
        throw new IllegalArgumentException("the host is empty");
    }

    public dp a() {
        dp dpVar;
        synchronized (this) {
            int size = this.f275a.size() - 1;
            while (true) {
                if (size < 0) {
                    dpVar = null;
                    break;
                }
                dpVar = this.f275a.get(size);
                if (dpVar.a()) {
                    dt.a().a(dpVar.a());
                    break;
                }
                size--;
            }
        }
        return dpVar;
    }

    public dq a(JSONObject jSONObject) {
        synchronized (this) {
            this.f81951a = jSONObject.getString("host");
            JSONArray jSONArray = jSONObject.getJSONArray("fbs");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f275a.add(new dp(this.f81951a).a(jSONArray.getJSONObject(i)));
            }
        }
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m181a() {
        return this.f81951a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ArrayList<dp> m182a() {
        return this.f275a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public JSONObject m183a() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = new JSONObject();
            jSONObject.put("host", this.f81951a);
            JSONArray jSONArray = new JSONArray();
            Iterator<dp> it2 = this.f275a.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().a());
            }
            jSONObject.put("fbs", jSONArray);
        }
        return jSONObject;
    }

    public void a(dp dpVar) {
        synchronized (this) {
            int i = 0;
            while (true) {
                if (i >= this.f275a.size()) {
                    break;
                } else if (this.f275a.get(i).a(dpVar)) {
                    this.f275a.set(i, dpVar);
                    break;
                } else {
                    i++;
                }
            }
            if (i >= this.f275a.size()) {
                this.f275a.add(dpVar);
            }
        }
    }

    public void a(boolean z) {
        ArrayList<dp> arrayList;
        synchronized (this) {
            for (int size = this.f275a.size() - 1; size >= 0; size--) {
                dp dpVar = this.f275a.get(size);
                if (z) {
                    if (dpVar.c()) {
                        arrayList = this.f275a;
                    }
                } else if (!dpVar.b()) {
                    arrayList = this.f275a;
                }
                arrayList.remove(size);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f81951a);
        sb.append("\n");
        Iterator<dp> it2 = this.f275a.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
        }
        return sb.toString();
    }
}
