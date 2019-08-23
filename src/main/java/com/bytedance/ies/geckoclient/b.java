package com.bytedance.ies.geckoclient;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import com.bytedance.ies.geckoclient.model.a;
import com.bytedance.ies.geckoclient.model.c;
import com.bytedance.ies.geckoclient.model.d;
import com.bytedance.ies.geckoclient.model.h;
import com.google.gson.reflect.TypeToken;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f20712b;

    /* renamed from: c  reason: collision with root package name */
    private List<d> f20713c;

    /* renamed from: d  reason: collision with root package name */
    private g f20714d;

    /* renamed from: e  reason: collision with root package name */
    private l f20715e;

    /* renamed from: f  reason: collision with root package name */
    private c f20716f;
    private boolean g;
    private String h;
    private String i;
    private Map<String, String> j;

    private String a() {
        HashMap hashMap = new HashMap();
        if (this.j != null) {
            hashMap.putAll(this.j);
        }
        Context context = this.f20712b;
        c cVar = this.f20716f;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("app_name", com.bytedance.ies.geckoclient.e.c.a(context));
        hashMap2.put("aid", String.valueOf(cVar.f20788d));
        hashMap2.put("ac", com.bytedance.ies.geckoclient.e.c.b(context));
        hashMap2.put("os_version", String.valueOf(Build.VERSION.SDK_INT));
        hashMap2.put("device_platform", "android");
        hashMap2.put("device_type", Build.MODEL);
        hashMap.putAll(hashMap2);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append("&");
            sb.append(URLEncoder.encode((String) entry.getKey()));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue()));
        }
        return sb.substring(1, sb.length());
    }

    public final void run() {
        if (this.f20713c != null && this.f20714d != null) {
            HashMap hashMap = new HashMap();
            for (d next : this.f20713c) {
                hashMap.put(next.f20791c, next);
            }
            this.f20715e.a((Map<String, d>) hashMap);
            this.f20715e.a((Map<String, d>) hashMap, this.i, this.h);
            String a2 = a();
            String a3 = a(this.f20713c);
            String str = "https://" + this.f20699a.f20722a + "gecko/server/v2/package?" + a2;
            new StringBuilder("check update :").append(str);
            try {
                String a4 = com.bytedance.ies.geckoclient.d.c.a().f20725b.a(str, a3);
                h hVar = (h) com.bytedance.ies.geckoclient.b.b.a().f20720a.fromJson(a4, new TypeToken<h<com.bytedance.ies.geckoclient.model.b>>() {
                }.getType());
                new JSONObject(a4);
                if (hVar.f20806a != 0) {
                    if (hVar.f20806a != 2000) {
                        throw new NetworkErrorException("response=" + a4);
                    }
                }
                this.f20714d.a(this.f20713c, ((com.bytedance.ies.geckoclient.model.b) hVar.f20807b).f20784a.get(this.f20716f.f20785a), this.g);
            } catch (Exception e2) {
                this.f20714d.a(e2);
                new StringBuilder("check update fail:").append(e2.toString());
            }
        }
    }

    private String a(List<d> list) {
        a aVar = new a();
        aVar.f20777a = new a.b(this.f20716f.f20788d, this.f20716f.f20786b, this.f20716f.f20787c);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            d dVar = list.get(i2);
            if (dVar != null) {
                arrayList.add(new a.C0190a(dVar.f20791c, dVar.f20789a));
            }
        }
        String str = this.f20716f.f20785a;
        if (aVar.f20778b == null) {
            aVar.f20778b = new HashMap();
        }
        aVar.f20778b.put(str, arrayList);
        return com.bytedance.ies.geckoclient.b.b.a().f20720a.toJson((Object) aVar);
    }

    b(Context context, com.bytedance.ies.geckoclient.d.a aVar, List<d> list, l lVar, c cVar, boolean z, g gVar, String str, String str2, Map<String, String> map) {
        super(aVar);
        this.f20712b = context;
        this.g = z;
        this.f20713c = list;
        this.f20714d = gVar;
        this.f20715e = lVar;
        this.f20716f = cVar;
        this.h = str2;
        this.i = str;
        this.j = map;
    }
}
