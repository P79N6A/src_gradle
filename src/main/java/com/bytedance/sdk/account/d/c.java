package com.bytedance.sdk.account.d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.sdk.account.api.b;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.c.a;
import com.bytedance.sdk.account.f.a.k;
import com.bytedance.sdk.account.f.b.a.a;
import com.bytedance.sdk.account.f.b.a.f;
import com.bytedance.sdk.account.f.b.a.h;
import com.bytedance.sdk.account.f.b.a.i;
import com.bytedance.sdk.account.f.b.e;
import com.bytedance.sdk.account.f.b.g;
import com.bytedance.sdk.account.f.b.j;
import com.bytedance.sdk.account.f.b.l;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import java.util.HashMap;
import java.util.Map;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    Context f22333a;

    public final void a(String str, String str2, String str3, com.bytedance.sdk.account.f.b.a.d dVar) {
        e.a(this.f22333a, str, str2, str3, dVar).d();
    }

    public final void a(String str, String str2, String str3, f fVar) {
        g.a(this.f22333a, str, str2, str3, fVar).d();
    }

    public final void a(String str, String str2, int i, i iVar) {
        Context context = this.f22333a;
        k kVar = new k(str, str2, i, 0, -1);
        new j(context, j.a(kVar).a(b.a.b()).c(), kVar, iVar).d();
    }

    public final void a(String str, String str2, int i, int i2, String str3, int i3, int i4, i iVar) {
        Context context = this.f22333a;
        k kVar = new k(str, str2, i, 0, str3, 1, i4);
        new j(context, j.a(kVar).a(b.a.b()).c(), kVar, iVar).d();
    }

    public final void a(String str, String str2, int i, int i2, String str3, int i3, int i4, String str4, String str5, i iVar) {
        Context context = this.f22333a;
        k kVar = new k(str, str2, i, 0, str3, 1, i4, str4, str5);
        new j(context, j.a(kVar).a(b.a.b()).c(), kVar, iVar).d();
    }

    public final void a(String str, String str2, String str3, String str4, h hVar) {
        com.bytedance.sdk.account.f.b.i.a(this.f22333a, str, str2, str3, str4, hVar).d();
    }

    public final void a(String str, String str2, String str3, com.bytedance.sdk.account.f.b.a.c cVar) {
        com.bytedance.sdk.account.f.b.d.a(this.f22333a, str, str2, str3, cVar).d();
    }

    public final void a(String str, String str2, String str3, int i, com.bytedance.sdk.account.f.b.a.b bVar) {
        com.bytedance.sdk.account.f.b.c.a(this.f22333a, str, str2, null, str3, 0, bVar).d();
    }

    public final void a(String str, String str2, String str3, String str4, a aVar) {
        Context context = this.f22333a;
        com.bytedance.sdk.account.f.a.a aVar2 = new com.bytedance.sdk.account.f.a.a(str, str2, str3, str4);
        a.C0233a a2 = new a.C0233a().a(b.a.i());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(aVar2.f22357c)) {
            hashMap.put("captcha", aVar2.f22357c);
        }
        hashMap.put("code", StringUtils.encryptWithXor(aVar2.f22356b));
        hashMap.put("mobile", StringUtils.encryptWithXor(aVar2.f22355a));
        hashMap.put("profile_key", aVar2.f22358d);
        hashMap.put("mix_mode", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        new com.bytedance.sdk.account.f.b.a(context, a2.a((Map<String, String>) hashMap).c(), aVar2, aVar).d();
    }

    public final void a(String str, com.bytedance.sdk.account.api.a.f fVar) {
        Context context = this.f22333a;
        a.C0233a aVar = new a.C0233a();
        StringBuilder sb = new StringBuilder(b.a.a("/passport/account/switch/"));
        AppLog.appendCommonParams(sb, false);
        new com.bytedance.sdk.account.e.f(context, aVar.a(sb.toString()).a("to_user_id", str).b(), fVar).d();
    }

    public final void a(String str, String str2, com.bytedance.sdk.account.api.a.e eVar) {
        com.bytedance.sdk.account.e.e.a(this.f22333a, str, str2, eVar).d();
    }

    public final void a(String str, String str2, String str3, int i, Map map, com.bytedance.sdk.account.f.b.a.e eVar) {
        com.bytedance.sdk.account.f.b.f.a(this.f22333a, str, str2, str3, i, map, eVar).d();
    }

    public final void a(String str, String str2, String str3, String str4, com.bytedance.sdk.account.f.b.a.b bVar) {
        com.bytedance.sdk.account.f.b.b.a(this.f22333a, str, str2, str3, str4, 0, bVar).d();
    }

    public c(Context context) {
        this.f22333a = context;
    }

    public final void a(com.bytedance.sdk.account.api.a.d dVar) {
        new com.bytedance.sdk.account.e.d(this.f22333a, new a.C0233a().a(b.a.a("/passport/safe/login_device/list/")).b(), dVar).d();
    }

    public final void a(com.bytedance.sdk.account.api.call.a<com.bytedance.sdk.account.api.call.b> aVar) {
        new com.bytedance.sdk.account.a(this.f22333a, new a.C0233a().a(b.C0231b.a("/passport/user/logout/")).b(), aVar).d();
    }

    public final void a(int i, com.bytedance.sdk.account.f.b.a.g gVar) {
        com.bytedance.sdk.account.f.b.h.a(this.f22333a, i, gVar).d();
    }

    public final void a(int i, com.bytedance.sdk.account.api.a.a aVar) {
        new com.bytedance.sdk.account.e.a(this.f22333a, new a.C0233a().a(b.a.a("/passport/safe/check_env/v1/")).a("scene", String.valueOf(1)).b(), aVar).d();
    }

    public final void a(String str, com.bytedance.sdk.account.api.a.b bVar) {
        com.bytedance.sdk.account.e.b.a(this.f22333a, str, bVar).d();
    }

    public final void a(String str, com.bytedance.sdk.account.api.a.c cVar) {
        new com.bytedance.sdk.account.e.c(this.f22333a, new a.C0233a().a(b.a.a("/passport/safe/login_device/del/")).a("del_did", str).c(), cVar).d();
    }

    public final void b(String str, String str2, int i, i iVar) {
        com.bytedance.sdk.account.f.b.k.a(this.f22333a, str, str2, i, 0, iVar).d();
    }

    public final void a(String str, int i, boolean z, com.bytedance.sdk.account.f.b.a.j jVar) {
        l.a(this.f22333a, str, 23, false, jVar).d();
    }

    public final void a(String str, int i, boolean z, int i2, String str2, com.bytedance.sdk.account.f.b.a.j jVar) {
        l.a(this.f22333a, str, i, true, i2, str2, jVar).d();
    }
}
