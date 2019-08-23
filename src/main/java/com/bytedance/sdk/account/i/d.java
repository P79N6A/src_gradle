package com.bytedance.sdk.account.i;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.account.api.a.e;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.i.b.b;

public abstract class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f22497a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f22498b = false;

    /* renamed from: c  reason: collision with root package name */
    public e f22499c;

    /* renamed from: d  reason: collision with root package name */
    protected com.bytedance.sdk.account.api.d f22500d = com.bytedance.sdk.account.d.d.a(this.f22501e);

    /* renamed from: e  reason: collision with root package name */
    private Context f22501e;

    /* renamed from: f  reason: collision with root package name */
    private String f22502f;

    public final void b(b bVar) {
        if (!this.f22498b) {
            a(bVar);
        }
    }

    public d(Context context) {
        this.f22501e = context.getApplicationContext();
    }

    public final void a(Bundle bundle) {
        if (!this.f22498b) {
            this.f22502f = bundle.getString("access_token");
            this.f22497a = bundle.getString("net_type");
            this.f22499c = new e() {
                public final /* synthetic */ void g(BaseApiResponse baseApiResponse) {
                    d.this.a((com.bytedance.sdk.account.api.c.e) baseApiResponse);
                }

                public final /* synthetic */ void a(BaseApiResponse baseApiResponse, int i) {
                    com.bytedance.sdk.account.api.c.e eVar = (com.bytedance.sdk.account.api.c.e) baseApiResponse;
                    com.bytedance.sdk.account.i.b.d dVar = new com.bytedance.sdk.account.i.b.d();
                    dVar.f22438d = d.this.f22497a;
                    dVar.f22439e = 4;
                    dVar.f22434a = String.valueOf(eVar.error);
                    dVar.f22435b = eVar.errorMsg;
                    dVar.f22437c = eVar.f22246a;
                    d.this.a((b) dVar);
                }
            };
            this.f22500d.a(this.f22502f, this.f22497a, this.f22499c);
        }
    }
}
