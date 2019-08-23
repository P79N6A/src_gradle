package com.ss.android.newmedia.thread;

import com.bytedance.ies.d.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class a extends com.bytedance.ies.d.a.a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f30366f;

    public a() {
        this(null, a.C0182a.NORMAL);
    }

    public a(boolean z) {
        this(null, a.C0182a.LOW);
    }

    public static boolean a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f30366f, true, 18858, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f30366f, true, 18858, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
        } else if (jSONObject2 == null || !"success".equals(jSONObject2.optString("message"))) {
            return false;
        } else {
            return true;
        }
    }

    private a(String str, a.C0182a aVar) {
        super(null, aVar);
    }
}
