package anet.channel.strategy;

import anet.channel.util.ALog;
import org.json.JSONArray;
import org.json.JSONObject;

public class l {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f1392a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1393b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1394c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1395d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1396e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1397f;
        public final String g;
        public final String h;

        public a(JSONObject jSONObject) {
            this.f1392a = jSONObject.optInt("port");
            this.f1393b = jSONObject.optString("protocol");
            this.f1394c = jSONObject.optInt("cto");
            this.f1395d = jSONObject.optInt("rto");
            this.f1396e = jSONObject.optInt("retry");
            this.f1397f = jSONObject.optInt("heartbeat");
            this.g = jSONObject.optString("rtt", "");
            this.h = jSONObject.optString("publickey");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f1398a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1399b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1400c;

        /* renamed from: d  reason: collision with root package name */
        public final String f1401d;

        /* renamed from: e  reason: collision with root package name */
        public final String f1402e;

        /* renamed from: f  reason: collision with root package name */
        public final String[] f1403f;
        public final String[] g;
        public final a[] h;
        public final e[] i;
        public final boolean j;
        public final boolean k;

        public b(JSONObject jSONObject) {
            this.f1398a = jSONObject.optString("host");
            this.f1399b = jSONObject.optInt("ttl");
            this.f1400c = jSONObject.optString("safeAisles");
            this.f1401d = jSONObject.optString("cname", null);
            this.f1402e = jSONObject.optString("unit", null);
            this.j = jSONObject.optInt("clear") != 1 ? false : true;
            this.k = jSONObject.optBoolean("effectNow");
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f1403f = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    this.f1403f[i2] = optJSONArray.optString(i2);
                }
            } else {
                this.f1403f = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("sips");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                this.g = null;
            } else {
                int length2 = optJSONArray2.length();
                this.g = new String[length2];
                for (int i3 = 0; i3 < length2; i3++) {
                    this.g[i3] = optJSONArray2.optString(i3);
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("aisles");
            if (optJSONArray3 != null) {
                int length3 = optJSONArray3.length();
                this.h = new a[length3];
                for (int i4 = 0; i4 < length3; i4++) {
                    this.h[i4] = new a(optJSONArray3.optJSONObject(i4));
                }
            } else {
                this.h = null;
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("strategies");
            if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                this.i = null;
                return;
            }
            int length4 = optJSONArray4.length();
            this.i = new e[length4];
            for (int i5 = 0; i5 < length4; i5++) {
                this.i[i5] = new e(optJSONArray4.optJSONObject(i5));
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f1404a;

        /* renamed from: b  reason: collision with root package name */
        public final e[] f1405b;

        public c(JSONObject jSONObject) {
            this.f1404a = jSONObject.optString("host");
            JSONArray optJSONArray = jSONObject.optJSONArray("strategies");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f1405b = new e[length];
                for (int i = 0; i < length; i++) {
                    this.f1405b[i] = new e(optJSONArray.optJSONObject(i));
                }
                return;
            }
            this.f1405b = null;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f1406a;

        /* renamed from: b  reason: collision with root package name */
        public final b[] f1407b;

        /* renamed from: c  reason: collision with root package name */
        public final c[] f1408c;

        /* renamed from: d  reason: collision with root package name */
        public final String f1409d;

        /* renamed from: e  reason: collision with root package name */
        public final String f1410e;

        /* renamed from: f  reason: collision with root package name */
        public final int f1411f;
        public final int g;
        public final int h;

        public d(JSONObject jSONObject) {
            this.f1406a = jSONObject.optString("ip");
            this.f1409d = jSONObject.optString("uid", null);
            this.f1410e = jSONObject.optString("utdid", null);
            this.f1411f = jSONObject.optInt("cv");
            this.g = jSONObject.optInt("fcl");
            this.h = jSONObject.optInt("fct");
            JSONArray optJSONArray = jSONObject.optJSONArray("dns");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.f1407b = new b[length];
                for (int i = 0; i < length; i++) {
                    this.f1407b[i] = new b(optJSONArray.optJSONObject(i));
                }
            } else {
                this.f1407b = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                this.f1408c = new c[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.f1408c[i2] = new c(optJSONArray2.optJSONObject(i2));
                }
                return;
            }
            this.f1408c = null;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f1412a;

        /* renamed from: b  reason: collision with root package name */
        public final a f1413b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1414c;

        public e(JSONObject jSONObject) {
            this.f1412a = jSONObject.optString("ip");
            this.f1414c = jSONObject.optString("path");
            this.f1413b = new a(jSONObject);
        }
    }

    public static d a(JSONObject jSONObject) {
        try {
            return new d(jSONObject);
        } catch (Exception e2) {
            ALog.e("StrategyResultParser", "Parse HttpDns response failed.", null, e2, "JSON Content", jSONObject.toString());
            return null;
        }
    }
}
