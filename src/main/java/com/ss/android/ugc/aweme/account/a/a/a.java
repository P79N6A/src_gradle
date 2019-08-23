package com.ss.android.ugc.aweme.account.a.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31596a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Object> f31597b = new HashMap<>();

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f31596a, true, 19630, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f31596a, true, 19630, new Class[0], a.class);
        }
        return new a();
    }

    public final synchronized JSONObject b() {
        if (PatchProxy.isSupport(new Object[0], this, f31596a, false, 19638, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f31596a, false, 19638, new Class[0], JSONObject.class);
        }
        try {
            return new JSONObject(this.f31597b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final a a(String str, Integer num) {
        if (PatchProxy.isSupport(new Object[]{str, num}, this, f31596a, false, 19635, new Class[]{String.class, Integer.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str, num}, this, f31596a, false, 19635, new Class[]{String.class, Integer.class}, a.class);
        }
        this.f31597b.put(str, num);
        return this;
    }

    public final a a(String str, Long l) {
        if (PatchProxy.isSupport(new Object[]{str, l}, this, f31596a, false, 19636, new Class[]{String.class, Long.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str, l}, this, f31596a, false, 19636, new Class[]{String.class, Long.class}, a.class);
        }
        this.f31597b.put(str, l);
        return this;
    }

    public final a a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f31596a, false, 19631, new Class[]{String.class, String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f31596a, false, 19631, new Class[]{String.class, String.class}, a.class);
        }
        this.f31597b.put(str, str2);
        return this;
    }
}
