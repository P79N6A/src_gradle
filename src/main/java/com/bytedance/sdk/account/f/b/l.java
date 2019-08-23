package com.bytedance.sdk.account.f.b;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.e;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.d.b;
import com.bytedance.sdk.account.d.g;
import com.bytedance.sdk.account.f.b.a.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class l extends g<e> {

    /* renamed from: e  reason: collision with root package name */
    private a f22406e;

    public static class a extends com.bytedance.sdk.account.j.a {

        /* renamed from: a  reason: collision with root package name */
        String f22407a;

        /* renamed from: b  reason: collision with root package name */
        public String f22408b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f22409c;

        /* renamed from: d  reason: collision with root package name */
        public int f22410d;

        /* renamed from: e  reason: collision with root package name */
        public int f22411e;

        /* renamed from: f  reason: collision with root package name */
        public String f22412f;

        public a(String str, boolean z, int i) {
            this.f22408b = str;
            this.f22409c = z;
            this.f22410d = i;
        }

        public a(String str, boolean z, int i, int i2, String str2) {
            this.f22408b = str;
            this.f22409c = z;
            this.f22410d = i;
            this.f22411e = i2;
            this.f22412f = str2;
        }
    }

    public final /* bridge */ /* synthetic */ void a(BaseApiResponse baseApiResponse) {
    }

    private static Map<String, String> a(a aVar) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("code", Uri.encode(aVar.f22408b));
        hashMap.put("type", String.valueOf(aVar.f22410d));
        if (aVar.f22409c) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        hashMap.put("need_ticket", str);
        if (aVar.f22411e > 0) {
            hashMap.put("scene", String.valueOf(aVar.f22411e));
        }
        if (!TextUtils.isEmpty(aVar.f22412f)) {
            hashMap.put("shark_ticket", aVar.f22412f);
        }
        return hashMap;
    }

    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
        b.a((com.bytedance.sdk.account.j.a) this.f22406e, jSONObject);
    }

    public final void b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        if (jSONObject2 != null) {
            this.f22406e.f22407a = jSONObject2.optString("ticket", "");
        }
    }

    public final /* synthetic */ BaseApiResponse a(boolean z, com.bytedance.sdk.account.c.b bVar) {
        e eVar = new e(z, 1015);
        if (z) {
            eVar.f22258a = this.f22406e.f22407a;
        } else {
            eVar.error = this.f22406e.g;
            eVar.errorMsg = this.f22406e.h;
        }
        return eVar;
    }

    private l(Context context, com.bytedance.sdk.account.c.a aVar, a aVar2, j jVar) {
        super(context, aVar, jVar);
        this.f22406e = aVar2;
    }

    public static l a(Context context, String str, int i, boolean z, j jVar) {
        a aVar = new a(str, z, i);
        return new l(context, new a.C0233a().a(b.a.f()).a(a(aVar)).c(), aVar, jVar);
    }

    public static l a(Context context, String str, int i, boolean z, int i2, String str2, j jVar) {
        a aVar = new a(str, z, i, i2, str2);
        return new l(context, new a.C0233a().a(b.a.f()).a(a(aVar)).c(), aVar, jVar);
    }
}
