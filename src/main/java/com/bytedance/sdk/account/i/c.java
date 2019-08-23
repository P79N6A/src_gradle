package com.bytedance.sdk.account.i;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.a.g;
import com.bytedance.sdk.account.f.b.a.e;
import com.bytedance.sdk.account.i.b.b;
import java.util.Map;

public abstract class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public String f22441a;

    /* renamed from: b  reason: collision with root package name */
    protected d f22442b = com.bytedance.sdk.account.d.d.a(this.f22443c);

    /* renamed from: c  reason: collision with root package name */
    private Context f22443c;

    /* renamed from: d  reason: collision with root package name */
    private String f22444d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f22445e = false;

    /* renamed from: f  reason: collision with root package name */
    private e f22446f;
    private String g = "";
    private int h = 0;
    private Map i;

    public final void b(b bVar) {
        if (!this.f22445e) {
            a(bVar);
        }
    }

    public c(Context context) {
        this.f22443c = context.getApplicationContext();
    }

    public final void a(Bundle bundle) {
        if (!this.f22445e) {
            this.f22444d = bundle.getString("access_token");
            this.f22441a = bundle.getString("net_type");
            this.f22446f = new e() {
                /* renamed from: a */
                public final void g(com.bytedance.sdk.account.api.call.c<g> cVar) {
                    c.this.a(cVar);
                }

                public final void a(com.bytedance.sdk.account.api.call.c<g> cVar, int i) {
                    com.bytedance.sdk.account.i.b.d dVar = new com.bytedance.sdk.account.i.b.d();
                    dVar.f22438d = c.this.f22441a;
                    dVar.f22439e = 4;
                    dVar.f22434a = String.valueOf(cVar.error);
                    dVar.f22435b = cVar.errorMsg;
                    if (cVar.f22251a != null) {
                        if (((g) cVar.f22251a).k != null) {
                            dVar.f22437c = ((g) cVar.f22251a).k.optJSONObject("data");
                        }
                        if (cVar.error == 1057) {
                            dVar.f22440f = ((g) cVar.f22251a).f22378f;
                            dVar.g = ((g) cVar.f22251a).m;
                        }
                    }
                    c.this.a((b) dVar);
                }
            };
            this.f22442b.a(this.f22444d, this.f22441a, this.g, this.h, this.i, this.f22446f);
        }
    }

    public final void a(String str, int i2, Map map) {
        this.g = str;
        this.h = 0;
        this.i = null;
    }
}
