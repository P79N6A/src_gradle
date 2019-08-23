package com.bytedance.frameworks.baselib.network.http.cronet.a;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int f19812a;

    /* renamed from: b  reason: collision with root package name */
    public long f19813b;

    /* renamed from: c  reason: collision with root package name */
    public int f19814c;

    /* renamed from: d  reason: collision with root package name */
    public int f19815d;

    /* renamed from: e  reason: collision with root package name */
    public int f19816e;

    /* renamed from: f  reason: collision with root package name */
    public List<c> f19817f = new ArrayList();

    public static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public String f19818a;

        /* renamed from: b  reason: collision with root package name */
        public int f19819b;

        /* renamed from: c  reason: collision with root package name */
        public int f19820c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f19821d = new ArrayList();

        public static a a(JSONObject jSONObject) {
            try {
                a aVar = new a();
                aVar.f19818a = jSONObject.getString("host");
                aVar.f19819b = jSONObject.getInt("error");
                aVar.f19820c = jSONObject.getInt("cost");
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.get(i) != null && (optJSONArray.get(i) instanceof String)) {
                            String str = (String) optJSONArray.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                aVar.f19821d.add(str);
                            }
                        }
                    }
                }
                return aVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public String f19822a;

        /* renamed from: b  reason: collision with root package name */
        public int f19823b;

        /* renamed from: c  reason: collision with root package name */
        public int f19824c;

        /* renamed from: d  reason: collision with root package name */
        public int f19825d;

        /* renamed from: e  reason: collision with root package name */
        public String f19826e;

        /* renamed from: f  reason: collision with root package name */
        public int f19827f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;

        public static b a(JSONObject jSONObject) {
            try {
                b bVar = new b();
                bVar.f19822a = jSONObject.getString(PushConstants.WEB_URL);
                bVar.f19823b = jSONObject.getInt("httpcode");
                bVar.f19824c = jSONObject.getInt("error");
                bVar.f19825d = jSONObject.getInt("timeout");
                bVar.f19826e = jSONObject.getString("addr");
                bVar.f19827f = jSONObject.getInt("port");
                bVar.g = jSONObject.getInt("cached");
                bVar.h = jSONObject.getInt("sock_reused");
                bVar.i = jSONObject.getInt("totalcost");
                bVar.j = jSONObject.getInt("dnscost");
                bVar.k = jSONObject.getInt("tcpcost");
                bVar.l = jSONObject.getInt("sslcost");
                bVar.m = jSONObject.getInt("sendcost");
                bVar.n = jSONObject.getInt("waitcost");
                bVar.o = jSONObject.getInt("recvcost");
                bVar.p = jSONObject.getInt("recvd_bytes");
                return bVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static class c {
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.a.d$d  reason: collision with other inner class name */
    public static class C0160d extends c {

        /* renamed from: a  reason: collision with root package name */
        public String f19828a;

        /* renamed from: b  reason: collision with root package name */
        public int f19829b;

        /* renamed from: c  reason: collision with root package name */
        public int f19830c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f19831d = new ArrayList();

        public static C0160d a(JSONObject jSONObject) {
            try {
                C0160d dVar = new C0160d();
                dVar.f19828a = jSONObject.getString("host");
                dVar.f19829b = jSONObject.getInt("error");
                dVar.f19830c = jSONObject.getInt("cost");
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        if (optJSONArray.get(i) != null && (optJSONArray.get(i) instanceof String)) {
                            String str = (String) optJSONArray.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                dVar.f19831d.add(str);
                            }
                        }
                    }
                }
                return dVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public String f19832a;

        /* renamed from: b  reason: collision with root package name */
        public String f19833b;

        /* renamed from: c  reason: collision with root package name */
        public int f19834c;

        /* renamed from: d  reason: collision with root package name */
        public int f19835d;

        /* renamed from: e  reason: collision with root package name */
        public int f19836e;

        /* renamed from: f  reason: collision with root package name */
        public int f19837f;

        public static e a(JSONObject jSONObject) {
            try {
                e eVar = new e();
                eVar.f19832a = jSONObject.getString("host");
                eVar.f19833b = jSONObject.getString("ip");
                eVar.f19834c = jSONObject.getInt("error");
                eVar.f19835d = jSONObject.getInt("ping_times");
                eVar.f19836e = jSONObject.getInt("succ_times");
                eVar.f19837f = jSONObject.getInt("avg_cost");
                return eVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static class f extends c {

        /* renamed from: a  reason: collision with root package name */
        public String f19838a;

        /* renamed from: b  reason: collision with root package name */
        public String f19839b;

        /* renamed from: c  reason: collision with root package name */
        public int f19840c;

        /* renamed from: d  reason: collision with root package name */
        public int f19841d;

        /* renamed from: e  reason: collision with root package name */
        public List<g> f19842e = new ArrayList();

        public static f a(JSONObject jSONObject) {
            try {
                f fVar = new f();
                fVar.f19838a = jSONObject.getString("host");
                fVar.f19839b = jSONObject.getString("ip");
                fVar.f19840c = jSONObject.getInt("error");
                fVar.f19841d = jSONObject.getInt("hops");
                JSONArray optJSONArray = jSONObject.optJSONArray("detail");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        g a2 = g.a((JSONObject) optJSONArray.get(i));
                        if (a2 != null) {
                            fVar.f19842e.add(a2);
                        }
                    }
                }
                return fVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f19843a;

        /* renamed from: b  reason: collision with root package name */
        public int f19844b;

        /* renamed from: c  reason: collision with root package name */
        public String f19845c;

        /* renamed from: d  reason: collision with root package name */
        public int f19846d;

        public static g a(JSONObject jSONObject) {
            try {
                g gVar = new g();
                gVar.f19845c = jSONObject.getString("ip");
                gVar.f19843a = jSONObject.getInt("sendhops");
                gVar.f19844b = jSONObject.getInt("replyhops");
                gVar.f19846d = jSONObject.getInt("cost");
                return gVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }
}
