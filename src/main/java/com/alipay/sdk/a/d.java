package com.alipay.sdk.a;

import android.widget.Toast;
import com.alipay.sdk.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f5407a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f5408b;

    public final void run() {
        c cVar = this.f5408b;
        a aVar = this.f5407a;
        if (aVar != null && "toast".equals(aVar.f5396c)) {
            JSONObject jSONObject = aVar.f5398e;
            String optString = jSONObject.optString(PushConstants.CONTENT);
            int i = 1;
            if (jSONObject.optInt("duration") < 2500) {
                i = 0;
            }
            e.a(Toast.makeText(cVar.f5406b, optString, i));
            new Timer().schedule(new f(cVar, aVar), (long) i);
        }
        int i2 = a.C0041a.f5399a;
        if (i2 != a.C0041a.f5399a) {
            try {
                this.f5408b.a(this.f5407a.f5394a, i2);
            } catch (JSONException unused) {
            }
        }
    }

    public d(c cVar, a aVar) {
        this.f5408b = cVar;
        this.f5407a = aVar;
    }
}
