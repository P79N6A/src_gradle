package com.autonavi.aps.amapapi.model;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClientOption;
import com.loc.ce;
import com.loc.cn;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public class AMapLocationServer extends AMapLocation {

    /* renamed from: d  reason: collision with root package name */
    protected String f7352d = "";

    /* renamed from: e  reason: collision with root package name */
    boolean f7353e = true;

    /* renamed from: f  reason: collision with root package name */
    String f7354f = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);
    private String g;
    private String h = "";
    private int i;
    private String j = "";
    private String k = "new";
    private JSONObject l;
    private String m = "";
    private String n = "";
    private long o = 0;
    private String p = null;

    public AMapLocationServer(String str) {
        super(str);
    }

    public final String a() {
        return this.g;
    }

    public final void a(long j2) {
        this.o = j2;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final void a(JSONObject jSONObject) {
        this.l = jSONObject;
    }

    public final void a(boolean z) {
        this.f7353e = z;
    }

    public final String b() {
        return this.h;
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                ce.a((AMapLocation) this, jSONObject);
                this.k = jSONObject.optString("type", this.k);
                this.j = jSONObject.optString("retype", this.j);
                String optString = jSONObject.optString("cens", this.n);
                if (!TextUtils.isEmpty(optString)) {
                    String[] split = optString.split("\\*");
                    int length = split.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        String str = split[i2];
                        if (!TextUtils.isEmpty(str)) {
                            String[] split2 = str.split(",");
                            setLongitude(cn.f(split2[0]));
                            setLatitude(cn.f(split2[1]));
                            setAccuracy((float) cn.g(split2[2]));
                            break;
                        }
                        i2++;
                    }
                    this.n = optString;
                }
                this.f7352d = jSONObject.optString("desc", this.f7352d);
                c(jSONObject.optString("coord", String.valueOf(this.i)));
                this.m = jSONObject.optString("mcell", this.m);
                this.f7353e = jSONObject.optBoolean("isReversegeo", this.f7353e);
                this.f7354f = jSONObject.optString("geoLanguage", this.f7354f);
                if (cn.a(jSONObject, "poiid")) {
                    setBuildingId(jSONObject.optString("poiid"));
                }
                if (cn.a(jSONObject, "pid")) {
                    setBuildingId(jSONObject.optString("pid"));
                }
                if (cn.a(jSONObject, "floor")) {
                    setFloor(jSONObject.optString("floor"));
                }
                if (cn.a(jSONObject, "flr")) {
                    setFloor(jSONObject.optString("flr"));
                }
            } catch (Throwable th) {
                ce.a(th, "AmapLoc", "AmapLoc");
            }
        }
    }

    public final int c() {
        return this.i;
    }

    public final void c(String str) {
        int i2;
        if (!TextUtils.isEmpty(str)) {
            if (getProvider().equals("gps")) {
                this.i = 0;
                return;
            } else if (str.equals(PushConstants.PUSH_TYPE_NOTIFY)) {
                this.i = 0;
                return;
            } else if (str.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                i2 = 1;
                this.i = i2;
            }
        }
        i2 = -1;
        this.i = i2;
    }

    public final String d() {
        return this.j;
    }

    public final void d(String str) {
        this.j = str;
    }

    public final String e() {
        return this.k;
    }

    public final void e(String str) {
        this.k = str;
    }

    public final JSONObject f() {
        return this.l;
    }

    public final void f(String str) {
        this.f7354f = str;
    }

    public final String g() {
        return this.m;
    }

    public final void g(String str) {
        this.f7352d = str;
    }

    public final void h(String str) {
        this.p = str;
    }

    public final boolean i() {
        return this.f7353e;
    }

    public final String j() {
        return this.f7354f;
    }

    public final long k() {
        return this.o;
    }

    public final String l() {
        return this.p;
    }

    public JSONObject toJson(int i2) {
        try {
            JSONObject json = super.toJson(i2);
            switch (i2) {
                case 1:
                    json.put("retype", this.j);
                    json.put("cens", this.n);
                    json.put("coord", this.i);
                    json.put("mcell", this.m);
                    json.put("desc", this.f7352d);
                    json.put("address", getAddress());
                    if (this.l != null && cn.a(json, "offpct")) {
                        json.put("offpct", this.l.getString("offpct"));
                        break;
                    }
                case 2:
                case 3:
                    break;
                default:
                    return json;
            }
            json.put("type", this.k);
            json.put("isReversegeo", this.f7353e);
            json.put("geoLanguage", this.f7354f);
            return json;
        } catch (Throwable th) {
            ce.a(th, "AmapLoc", "toStr");
            return null;
        }
    }

    public String toStr() {
        return toStr(1);
    }

    public String toStr(int i2) {
        JSONObject jSONObject;
        try {
            jSONObject = toJson(i2);
            jSONObject.put("nb", this.p);
        } catch (Throwable th) {
            ce.a(th, "AMapLocation", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public final AMapLocationServer h() {
        String str = this.m;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split.length != 3) {
            return null;
        }
        AMapLocationServer aMapLocationServer = new AMapLocationServer("");
        aMapLocationServer.setProvider(getProvider());
        aMapLocationServer.setLongitude(cn.f(split[0]));
        aMapLocationServer.setLatitude(cn.f(split[1]));
        aMapLocationServer.setAccuracy(Float.parseFloat(split[2]));
        aMapLocationServer.setCityCode(getCityCode());
        aMapLocationServer.setAdCode(getAdCode());
        aMapLocationServer.setCountry(getCountry());
        aMapLocationServer.setProvince(getProvince());
        aMapLocationServer.setCity(getCity());
        aMapLocationServer.setTime(getTime());
        aMapLocationServer.k = this.k;
        aMapLocationServer.c(String.valueOf(this.i));
        if (!cn.a(aMapLocationServer)) {
            return null;
        }
        return aMapLocationServer;
    }
}
