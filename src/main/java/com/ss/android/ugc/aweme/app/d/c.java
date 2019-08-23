package com.ss.android.ugc.aweme.app.d;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34111a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Object> f34112b = new HashMap<>();

    public final c a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f34111a, false, 23470, new Class[]{String.class, String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f34111a, false, 23470, new Class[]{String.class, String.class}, c.class);
        }
        this.f34112b.put(str, str2);
        return this;
    }

    public final c a(String str, Long l) {
        if (PatchProxy.isSupport(new Object[]{str, l}, this, f34111a, false, 23475, new Class[]{String.class, Long.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, l}, this, f34111a, false, 23475, new Class[]{String.class, Long.class}, c.class);
        }
        this.f34112b.put(str, l);
        return this;
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f34111a, true, 23469, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f34111a, true, 23469, new Class[0], c.class);
        }
        return new c();
    }

    public final synchronized JSONObject b() {
        if (PatchProxy.isSupport(new Object[0], this, f34111a, false, 23477, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f34111a, false, 23477, new Class[0], JSONObject.class);
        }
        try {
            return new JSONObject(this.f34112b);
        } catch (Exception unused) {
            return null;
        }
    }

    public static c a(@Nullable JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f34111a, true, 23468, new Class[]{JSONObject.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f34111a, true, 23468, new Class[]{JSONObject.class}, c.class);
        }
        c a2 = a();
        if (jSONObject2 != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    a2.a(next, jSONObject2.getString(next));
                } catch (JSONException unused) {
                }
            }
        }
        return a2;
    }

    public final c a(String str, Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{str, bool}, this, f34111a, false, 23473, new Class[]{String.class, Boolean.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, bool}, this, f34111a, false, 23473, new Class[]{String.class, Boolean.class}, c.class);
        }
        this.f34112b.put(str, bool);
        return this;
    }

    public final c a(String str, Double d2) {
        if (PatchProxy.isSupport(new Object[]{str, d2}, this, f34111a, false, 23471, new Class[]{String.class, Double.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, d2}, this, f34111a, false, 23471, new Class[]{String.class, Double.class}, c.class);
        }
        this.f34112b.put(str, d2);
        return this;
    }

    public final c a(String str, Float f2) {
        if (PatchProxy.isSupport(new Object[]{str, f2}, this, f34111a, false, 23472, new Class[]{String.class, Float.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, f2}, this, f34111a, false, 23472, new Class[]{String.class, Float.class}, c.class);
        }
        this.f34112b.put(str, f2);
        return this;
    }

    public final c a(String str, Integer num) {
        if (PatchProxy.isSupport(new Object[]{str, num}, this, f34111a, false, 23474, new Class[]{String.class, Integer.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, num}, this, f34111a, false, 23474, new Class[]{String.class, Integer.class}, c.class);
        }
        this.f34112b.put(str, num);
        return this;
    }
}
