package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.amap.api.mapcore2d.cq;
import com.amap.api.maps2d.MapsInitializer;
import org.json.JSONObject;

public class g extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private Context f6211a;

    /* renamed from: b  reason: collision with root package name */
    private y f6212b;

    public void run() {
        try {
            if (MapsInitializer.getNetworkEnable()) {
                cy a2 = cm.a();
                cq.a a3 = cq.a(this.f6211a, a2, "002" + ";" + "11K" + ";" + "001" + ";" + "145", null);
                if (cq.f5856a != 1) {
                    Message obtainMessage = this.f6212b.getMainHandler().obtainMessage();
                    obtainMessage.what = 2;
                    if (a3.f5858a != null) {
                        obtainMessage.obj = a3.f5858a;
                    }
                    this.f6212b.getMainHandler().sendMessage(obtainMessage);
                }
                if (a3 != null) {
                    if (a3.u != null) {
                        cm.a().a(a3.u.f5864a);
                    }
                    if (a3.w != null) {
                        new cx(this.f6211a, "2dmap", a3.w.f5871a, a3.w.f5872b).a();
                    }
                    if (a3.t != null) {
                        JSONObject jSONObject = a3.t;
                        int i = q.q;
                        if (jSONObject.has("t")) {
                            i = jSONObject.getInt("t");
                        }
                        bg.a().b("period_day", i);
                        if (jSONObject.has("able")) {
                            boolean a4 = cq.a(jSONObject.getString("able"), false);
                            bg.a();
                            bg.b("UpdateDataActiveEnable", a4);
                            MapsInitializer.setUpdateDataActiveEnable(a4);
                        }
                        if (jSONObject.has("oi")) {
                            q.a(cq.a(jSONObject.getString("oi"), false));
                        }
                    }
                }
                if (!(a3 == null || a3.v == null)) {
                    cq.a.d dVar = a3.v;
                    if (dVar != null) {
                        String str = dVar.f5874b;
                        String str2 = dVar.f5873a;
                        String str3 = dVar.f5875c;
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                            if (!TextUtils.isEmpty(str3)) {
                                new dz(this.f6211a, new ea(str2, str, str3), cm.a()).a();
                            }
                        }
                        new dz(this.f6211a, null, cm.a()).a();
                    } else {
                        new dz(this.f6211a, null, cm.a()).a();
                    }
                }
                q.p = a2;
                dg.a(this.f6211a, a2);
                interrupt();
            }
        } catch (Throwable th) {
            interrupt();
            dg.b(th, "AMapDelegateImpGLSurfaceView", "mVerfy");
        }
    }

    public g(Context context, y yVar) {
        this.f6211a = context;
        this.f6212b = yVar;
    }
}
