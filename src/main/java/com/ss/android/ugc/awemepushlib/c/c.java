package com.ss.android.ugc.awemepushlib.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76977a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Object> f76978b = new HashMap<>();

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f76977a, true, 90423, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f76977a, true, 90423, new Class[0], c.class);
        }
        return new c();
    }

    public final synchronized JSONObject b() {
        if (PatchProxy.isSupport(new Object[0], this, f76977a, false, 90430, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76977a, false, 90430, new Class[0], JSONObject.class);
        }
        try {
            return new JSONObject(this.f76978b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final c a(String str, Long l) {
        if (PatchProxy.isSupport(new Object[]{str, l}, this, f76977a, false, 90429, new Class[]{String.class, Long.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, l}, this, f76977a, false, 90429, new Class[]{String.class, Long.class}, c.class);
        }
        this.f76978b.put(str, l);
        return this;
    }

    public final c a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f76977a, false, 90424, new Class[]{String.class, String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f76977a, false, 90424, new Class[]{String.class, String.class}, c.class);
        }
        this.f76978b.put(str, str2);
        return this;
    }
}
