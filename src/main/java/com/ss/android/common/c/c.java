package com.ss.android.common.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28240a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28241b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28242c;

    /* renamed from: d  reason: collision with root package name */
    public final int f28243d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28244a;

        /* renamed from: b  reason: collision with root package name */
        public String f28245b;

        /* renamed from: c  reason: collision with root package name */
        public String f28246c;

        /* renamed from: d  reason: collision with root package name */
        public int f28247d;

        public final c a() {
            if (!PatchProxy.isSupport(new Object[0], this, f28244a, false, 15795, new Class[0], c.class)) {
                return new c(this, (byte) 0);
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, f28244a, false, 15795, new Class[0], c.class);
        }

        public final a a(int i) {
            this.f28247d = i;
            return this;
        }

        public final a b(String str) {
            this.f28246c = str;
            return this;
        }

        public final a a(String str) {
            this.f28245b = str;
            return this;
        }
    }

    public final JSONObject a() {
        if (PatchProxy.isSupport(new Object[0], this, f28240a, false, 15794, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f28240a, false, 15794, new Class[0], JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("wifi_name", this.f28241b);
            jSONObject.put("wifi_mac", this.f28242c);
            jSONObject.put("rssi", this.f28243d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private c(a aVar) {
        this.f28241b = aVar.f28245b;
        this.f28242c = aVar.f28246c;
        this.f28243d = aVar.f28247d;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
