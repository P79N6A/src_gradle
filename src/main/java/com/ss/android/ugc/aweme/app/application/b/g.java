package com.ss.android.ugc.aweme.app.application.b;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.d.c;
import com.ss.android.di.push.a;
import org.json.JSONObject;

public final class g implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2643a;

    /* renamed from: b  reason: collision with root package name */
    private Context f2644b;

    public g(Context context) {
        this.f2644b = context;
    }

    public final void a(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f2643a, false, 23244, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f2643a, false, 23244, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lon", d3);
            jSONObject.put("lat", d2);
            String jSONObject2 = jSONObject.toString();
            try {
                a.a().notifyLoc(this.f2644b, jSONObject2);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
