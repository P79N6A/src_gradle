package com.bytedance.sdk.account.d;

import android.content.Context;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.a;
import com.bytedance.sdk.account.api.e;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.j.c;
import com.bytedance.sdk.account.j.d;
import java.util.Map;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    Context f22340a;

    public f(Context context) {
        this.f22340a = context;
    }

    public final void a(String str, a<BaseApiResponse> aVar) {
        new d(this.f22340a, new a.C0233a().a("platform", str).a(b.C0231b.a()).b(), aVar).d();
    }

    public final void a(String str, com.ss.android.account.d dVar) {
        new com.bytedance.sdk.account.j.f(this.f22340a, b.a(str, null, null, null, null, null, null).a(b.C0231b.a("/2/user/info/")).b(), dVar).d();
    }

    public final void a(String str, int i, String str2, com.bytedance.sdk.account.api.call.a<BaseApiResponse> aVar) {
        d.a(this.f22340a, str, i, str2, aVar).d();
    }

    public final void b(String str, String str2, String str3, long j, Map map, com.bytedance.sdk.account.api.call.a<com.bytedance.sdk.account.api.call.d> aVar) {
        new c(this.f22340a, b.a(str2, str3, String.valueOf(j), null, null, str, map).a(b.C0231b.b()).a().b(), aVar).d();
    }

    public final void b(String str, String str2, String str3, long j, Map map, com.ss.android.account.d dVar) {
        new com.bytedance.sdk.account.j.b(this.f22340a, b.a(str2, str3, String.valueOf(j), null, null, str, map).a(b.C0231b.c()).b(), dVar).d();
    }

    public final void a(String str, String str2, String str3, long j, Map map, com.bytedance.sdk.account.api.call.a<com.bytedance.sdk.account.api.call.d> aVar) {
        new c(this.f22340a, b.a(str2, null, String.valueOf(j), str3, null, str, map).a(b.C0231b.b()).a().b(), aVar).d();
    }

    public final void a(String str, String str2, String str3, long j, Map map, com.ss.android.account.d dVar) {
        new com.bytedance.sdk.account.j.b(this.f22340a, b.a(str2, null, String.valueOf(j), str3, null, str, map).a(b.C0231b.c()).b(), dVar).d();
    }
}
