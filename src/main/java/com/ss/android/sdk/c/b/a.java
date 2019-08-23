package com.ss.android.sdk.c.b;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import org.json.JSONObject;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private C0370a f30723a;

    /* renamed from: com.ss.android.sdk.c.b.a$a  reason: collision with other inner class name */
    public interface C0370a {
        void a(JSONObject jSONObject) throws Exception;
    }

    public a(C0370a aVar) {
        this.f30723a = aVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (this.f30723a != null) {
            this.f30723a.a(jSONObject);
        }
    }
}
