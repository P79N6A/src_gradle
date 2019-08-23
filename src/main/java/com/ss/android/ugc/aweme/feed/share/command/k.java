package com.ss.android.ugc.aweme.feed.share.command;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45990a;

    /* renamed from: b  reason: collision with root package name */
    public int f45991b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f45992c;

    /* renamed from: d  reason: collision with root package name */
    public b f45993d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f45994a;

        /* renamed from: b  reason: collision with root package name */
        public String f45995b;

        /* renamed from: c  reason: collision with root package name */
        public int f45996c;
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public c f45997a;

        /* renamed from: b  reason: collision with root package name */
        public a f45998b;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f45999a;

        /* renamed from: b  reason: collision with root package name */
        public String f46000b;

        /* renamed from: c  reason: collision with root package name */
        public String f46001c;

        /* renamed from: d  reason: collision with root package name */
        public String f46002d;

        /* renamed from: e  reason: collision with root package name */
        public String f46003e;

        /* renamed from: f  reason: collision with root package name */
        public String f46004f;
        public String g;
    }

    static k a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f45990a, true, 42248, new Class[]{String.class}, k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[]{str2}, null, f45990a, true, 42248, new Class[]{String.class}, k.class);
        }
        k kVar = new k();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            kVar.f45991b = jSONObject.optInt("err_no");
            kVar.f45992c = jSONObject.optString("message");
            b bVar = new b();
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            c cVar = new c();
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("share_info");
            cVar.f45999a = optJSONObject2.optInt("host_id");
            cVar.f46000b = optJSONObject2.optString("app_id");
            cVar.f46001c = optJSONObject2.optString(PushConstants.TITLE);
            cVar.f46002d = optJSONObject2.optString("image_url");
            cVar.f46003e = optJSONObject2.optString("query");
            cVar.g = optJSONObject2.optString("uid");
            cVar.f46004f = optJSONObject2.optString("did");
            a aVar = new a();
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("app_info");
            aVar.f45994a = optJSONObject3.optString("name");
            aVar.f45995b = optJSONObject3.optString("icon");
            aVar.f45996c = optJSONObject3.optInt("type");
            bVar.f45997a = cVar;
            bVar.f45998b = aVar;
            kVar.f45993d = bVar;
        } catch (JSONException unused) {
        }
        return kVar;
    }
}
