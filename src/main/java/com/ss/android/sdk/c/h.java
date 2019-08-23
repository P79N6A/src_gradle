package com.ss.android.sdk.c;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.MaxSizeLinkedHashMap;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.i;
import com.ss.android.download.a.c;
import com.ss.android.sdk.c.a.b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class h {

    /* renamed from: e  reason: collision with root package name */
    private static h f30737e;

    /* renamed from: a  reason: collision with root package name */
    final MaxSizeLinkedHashMap<String, i> f30738a = new MaxSizeLinkedHashMap<>(16, 16);

    /* renamed from: b  reason: collision with root package name */
    final i f30739b = new i("", null, null);

    /* renamed from: c  reason: collision with root package name */
    c<String, String, String, Void, i> f30740c = new c<>(16, 2, this.f30742f);

    /* renamed from: d  reason: collision with root package name */
    List<a> f30741d;

    /* renamed from: f  reason: collision with root package name */
    private c.a<String, String, String, Void, i> f30742f = new c.a<String, String, String, Void, i>() {
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
            return h.this.a((String) obj, (String) obj2, (String) obj3);
        }

        public final /* synthetic */ void a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            String str = (String) obj;
            String str2 = (String) obj2;
            i iVar = (i) obj5;
            h hVar = h.this;
            if (str != null) {
                if (iVar != null) {
                    iVar.f30747d = System.currentTimeMillis();
                    hVar.f30738a.put(str, iVar);
                }
                if (hVar.f30741d != null && !hVar.f30741d.isEmpty()) {
                    for (int i = 0; i < hVar.f30741d.size(); i++) {
                        a aVar = hVar.f30741d.get(i);
                        if (aVar != null) {
                            aVar.a(str, iVar, str2);
                        }
                    }
                }
            }
        }
    };

    public interface a {
        void a(String str, i iVar, String str2);
    }

    public static h a() {
        if (f30737e == null) {
            synchronized (h.class) {
                if (f30737e == null) {
                    f30737e = new h();
                }
            }
        }
        return f30737e;
    }

    private h() {
    }

    private static void a(JSONArray jSONArray, List<String> list) {
        if (jSONArray != null && list != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    list.add(optString);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final i a(String str, String str2, String str3) {
        i iVar = null;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            i iVar2 = new i(b.a().getJSSDKConfigUrl());
            iVar2.a("client_id", str3);
            iVar2.a("partner_domain", str2);
            String executeGet = NetworkUtils.executeGet(-1, iVar2.a());
            if (TextUtils.isEmpty(executeGet)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(executeGet);
            if (!b.a().isApiSuccess(jSONObject)) {
                return null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                i iVar3 = new i(str, str2, str3);
                try {
                    a(optJSONObject.optJSONArray("call"), iVar3.f30748e);
                    a(optJSONObject.optJSONArray("info"), iVar3.f30749f);
                    a(optJSONObject.optJSONArray("event"), iVar3.g);
                } catch (Exception unused) {
                }
                iVar = iVar3;
            }
            return iVar;
        } catch (Exception unused2) {
        }
    }
}
