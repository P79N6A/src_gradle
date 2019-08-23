package com.bytedance.ies.f.b;

import android.support.annotation.NonNull;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import org.json.JSONObject;

public final class l extends b {

    /* renamed from: a  reason: collision with root package name */
    private d f20664a;

    l(d dVar) {
        this.f20664a = dVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(@NonNull n nVar, @NonNull s sVar) throws Exception {
        h hVar = new h();
        hVar.f20622c = nVar.f20668d;
        hVar.f20623d = new JSONObject(nVar.f20669e);
        hVar.f20621b = nVar.f20670f;
        hVar.f20620a = nVar.f20667c;
        hVar.f20624e = nVar.f20666b;
        hVar.f20625f = true;
        JSONObject jSONObject = new JSONObject();
        new StringBuilder("Invoking legacy method with: ").append(hVar.toString());
        try {
            this.f20664a.call(hVar, jSONObject);
        } catch (Exception unused) {
        }
        if (!hVar.f20625f) {
            new StringBuilder("No need for callback: ").append(hVar.toString());
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (!sVar.f20690c) {
            i.a(new IllegalStateException("Jsb async call already finished: " + sVar.f20688a + ", stub: " + sVar.hashCode()));
        }
        StringBuilder sb = new StringBuilder("Jsb async call about to finish with response: ");
        sb.append(sVar.f20688a);
        sb.append(", stub: ");
        sb.append(sVar.hashCode());
        sVar.f20689b.a(jSONObject2);
        sVar.f20690c = false;
        if (i.f20657a) {
            if (jSONObject.optInt("code", 0) == 1) {
                new StringBuilder("Method succeed with: ").append(hVar.toString());
                return;
            }
            new StringBuilder("No need for callback, but error occurred: ").append(hVar.toString());
        }
    }
}
