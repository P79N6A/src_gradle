package com.amap.api.mapcore2d;

import android.text.TextUtils;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public final class fi extends Inner_3dMap_location {

    /* renamed from: a  reason: collision with root package name */
    boolean f6130a = true;

    /* renamed from: b  reason: collision with root package name */
    private String f6131b;

    /* renamed from: c  reason: collision with root package name */
    private String f6132c = "";

    /* renamed from: d  reason: collision with root package name */
    private int f6133d;

    /* renamed from: e  reason: collision with root package name */
    private String f6134e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f6135f = "new";
    private JSONObject g;
    private String h = "";
    private String i = "";
    private long j;
    private String k;

    public fi(String str) {
        super(str);
    }

    public final String a() {
        return this.f6131b;
    }

    public final void a(String str) {
        this.f6131b = str;
    }

    public final String b() {
        return this.f6132c;
    }

    public final void b(String str) {
        this.f6132c = str;
    }

    public final int c() {
        return this.f6133d;
    }

    public final void c(String str) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            if (getProvider().equals("gps")) {
                this.f6133d = 0;
                return;
            } else if (str.equals(PushConstants.PUSH_TYPE_NOTIFY)) {
                this.f6133d = 0;
                return;
            } else if (str.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                i2 = 1;
                this.f6133d = i2;
            }
        }
        i2 = -1;
        this.f6133d = i2;
    }

    public final String d() {
        return this.f6134e;
    }

    public final void d(String str) {
        this.f6134e = str;
    }

    public final JSONObject e() {
        return this.g;
    }

    public final void e(String str) {
        this.desc = str;
    }

    public final void setFloor(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str.replace("F", "");
            try {
                Integer.parseInt(str);
            } catch (Throwable th) {
                gc.a(th, "AMapLocationModel", "setFloor");
                str = null;
            }
        }
        this.floor = str;
    }

    public final JSONObject toJson(int i2) {
        try {
            JSONObject json = super.toJson(i2);
            switch (i2) {
                case 1:
                    json.put("retype", this.f6134e);
                    json.put("cens", this.i);
                    json.put("poiid", this.buildingId);
                    json.put("floor", this.floor);
                    json.put("coord", this.f6133d);
                    json.put("mcell", this.h);
                    json.put("desc", this.desc);
                    json.put("address", getAddress());
                    if (this.g != null && gf.a(json, "offpct")) {
                        json.put("offpct", this.g.getString("offpct"));
                        break;
                    }
                case 2:
                case 3:
                    break;
                default:
                    return json;
            }
            json.put("type", this.f6135f);
            json.put("isReversegeo", this.f6130a);
            return json;
        } catch (Throwable th) {
            gc.a(th, "AMapLocationModel", "toStr");
            return null;
        }
    }

    public final String toStr(int i2) {
        JSONObject jSONObject;
        try {
            jSONObject = super.toJson(i2);
            jSONObject.put("nb", this.k);
        } catch (Throwable th) {
            gc.a(th, "AMapLocationModel", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
