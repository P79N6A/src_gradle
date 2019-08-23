package com.ss.android.common.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28231a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28232b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28233c;

    /* renamed from: com.ss.android.common.c.a$a  reason: collision with other inner class name */
    public static class C0331a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28234a;

        /* renamed from: b  reason: collision with root package name */
        public String f28235b;

        /* renamed from: c  reason: collision with root package name */
        public String f28236c;

        public final a a() {
            if (!PatchProxy.isSupport(new Object[0], this, f28234a, false, 15790, new Class[0], a.class)) {
                return new a(this, (byte) 0);
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, f28234a, false, 15790, new Class[0], a.class);
        }

        public final C0331a a(String str) {
            this.f28235b = str;
            return this;
        }

        public final C0331a b(String str) {
            this.f28236c = str;
            return this;
        }
    }

    public final JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f28231a, false, 15789, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f28231a, false, 15789, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bt_name", this.f28232b);
            jSONObject.put("bt_mac", this.f28233c);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private a(C0331a aVar) {
        this.f28232b = aVar.f28235b;
        this.f28233c = aVar.f28236c;
    }

    /* synthetic */ a(C0331a aVar, byte b2) {
        this(aVar);
    }
}
