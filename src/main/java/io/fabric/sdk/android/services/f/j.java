package io.fabric.sdk.android.services.f;

import android.content.SharedPreferences;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.b.k;
import io.fabric.sdk.android.services.b.l;
import io.fabric.sdk.android.services.e.c;
import io.fabric.sdk.android.services.e.d;
import org.json.JSONException;
import org.json.JSONObject;

public final class j implements s {

    /* renamed from: a  reason: collision with root package name */
    private final w f83321a;

    /* renamed from: b  reason: collision with root package name */
    private final v f83322b;

    /* renamed from: c  reason: collision with root package name */
    private final k f83323c;

    /* renamed from: d  reason: collision with root package name */
    private final g f83324d;

    /* renamed from: e  reason: collision with root package name */
    private final x f83325e;

    /* renamed from: f  reason: collision with root package name */
    private final i f83326f;
    private final c g = new d(this.f83326f);
    private final l h;

    public final t a() {
        return a(r.USE_CACHE);
    }

    private String b() {
        return io.fabric.sdk.android.services.b.i.a(io.fabric.sdk.android.services.b.i.h(this.f83326f.context));
    }

    private t b(r rVar) {
        boolean z;
        try {
            if (r.SKIP_CACHE_LOOKUP.equals(rVar)) {
                return null;
            }
            JSONObject a2 = this.f83324d.a();
            if (a2 == null) {
                return null;
            }
            t a3 = this.f83322b.a(this.f83323c, a2);
            a(a2, "Loaded cached settings: ");
            long a4 = this.f83323c.a();
            if (!r.IGNORE_CACHE_EXPIRATION.equals(rVar)) {
                if (a3.g < a4) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return null;
                }
            }
            return a3;
        } catch (Exception unused) {
            return null;
        }
    }

    public final t a(r rVar) {
        t tVar;
        t tVar2 = null;
        if (!this.h.a()) {
            return null;
        }
        try {
            if (!io.fabric.sdk.android.c.b() && !(!this.g.a().getString("existing_instance_identifier", "").equals(b()))) {
                tVar2 = b(rVar);
            }
            if (tVar2 == null) {
                JSONObject a2 = this.f83325e.a(this.f83321a);
                if (a2 != null) {
                    t a3 = this.f83322b.a(this.f83323c, a2);
                    try {
                        this.f83324d.a(a3.g, a2);
                        a(a2, "Loaded settings: ");
                        String b2 = b();
                        SharedPreferences.Editor b3 = this.g.b();
                        b3.putString("existing_instance_identifier", b2);
                        this.g.a(b3);
                        tVar2 = a3;
                    } catch (Exception unused) {
                        tVar = a3;
                    }
                }
            }
            if (tVar2 == null) {
                tVar = b(r.IGNORE_CACHE_EXPIRATION);
                return tVar;
            }
        } catch (Exception unused2) {
        }
        tVar = tVar2;
        return tVar;
    }

    private static void a(JSONObject jSONObject, String str) throws JSONException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
    }

    public j(i iVar, w wVar, k kVar, v vVar, g gVar, x xVar, l lVar) {
        this.f83326f = iVar;
        this.f83321a = wVar;
        this.f83323c = kVar;
        this.f83322b = vVar;
        this.f83324d = gVar;
        this.f83325e = xVar;
        this.h = lVar;
    }
}
