package com.bytedance.sdk.account.bdplatform.impl.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.bdplatform.a.a;
import com.bytedance.sdk.account.bdplatform.b.e;
import java.util.HashMap;
import java.util.List;

public final class b implements a.C0232a {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.sdk.account.bdplatform.a.b f22305a;

    /* renamed from: b  reason: collision with root package name */
    private Context f22306b;

    public final e a() {
        try {
            return a.b(this.f22305a.a(new Uri.Builder().scheme("https").authority(this.f22305a.d()).path("/passport/open/authorize/ticket/").build().toString()));
        } catch (Throwable th) {
            e eVar = new e();
            eVar.f22282f = com.bytedance.sdk.account.bdplatform.c.a.a(this.f22305a, th);
            eVar.g = th.getMessage();
            return eVar;
        }
    }

    public final com.bytedance.sdk.account.bdplatform.b.b a(c.a aVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("client_key", aVar.f22261c);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.f22263e);
        if (!TextUtils.isEmpty(aVar.f22264f)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(aVar.f22264f);
        }
        if (!TextUtils.isEmpty(aVar.g)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(aVar.g);
        }
        hashMap.put("scope", sb.toString());
        try {
            return a.c(this.f22305a.a(new Uri.Builder().scheme("https").authority(this.f22305a.e()).path("/oauth/auth_info/").build().toString(), hashMap));
        } catch (Throwable th) {
            com.bytedance.sdk.account.bdplatform.b.b bVar = new com.bytedance.sdk.account.bdplatform.b.b();
            bVar.f22282f = com.bytedance.sdk.account.bdplatform.c.a.a(this.f22305a, th);
            bVar.g = th.getMessage();
            return bVar;
        }
    }

    public b(Context context, com.bytedance.sdk.account.bdplatform.a.b bVar) {
        this.f22305a = bVar;
        this.f22306b = context;
    }

    public final com.bytedance.sdk.account.bdplatform.b.a a(c.a aVar, String str) {
        List<String> a2 = com.bytedance.sdk.account.b.d.c.a(this.f22306b, aVar.getCallerPackage());
        HashMap hashMap = new HashMap(6);
        hashMap.put("client_key", aVar.f22261c);
        hashMap.put("response_type", "code");
        hashMap.put("scope", aVar.f22263e);
        hashMap.put("state", aVar.f22259a);
        hashMap.put("from", "opensdk");
        hashMap.put("ticket", str);
        hashMap.put("signature", com.bytedance.sdk.account.b.d.c.a(a2));
        try {
            return a.a(this.f22305a.a(new Uri.Builder().scheme("https").authority(this.f22305a.e()).path("/oauth/authorize/").build().toString(), hashMap));
        } catch (Throwable th) {
            com.bytedance.sdk.account.bdplatform.b.a aVar2 = new com.bytedance.sdk.account.bdplatform.b.a();
            aVar2.f22282f = com.bytedance.sdk.account.bdplatform.c.a.a(this.f22305a, th);
            aVar2.g = th.getMessage();
            return null;
        }
    }
}
