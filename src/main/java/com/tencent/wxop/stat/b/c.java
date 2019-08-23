package com.tencent.wxop.stat.b;

import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f79865a;

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f79866b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f79867c;

    public c() {
    }

    public c(String str, String[] strArr, Properties properties) {
        this.f79865a = str;
        this.f79867c = properties != null ? new JSONObject(properties) : new JSONObject();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return toString().equals(((c) obj).toString());
        }
        return false;
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f79865a);
        sb.append(",");
        if (this.f79866b != null) {
            sb.append(this.f79866b.toString());
        }
        if (this.f79867c != null) {
            sb.append(this.f79867c.toString());
        }
        return sb.toString();
    }
}
