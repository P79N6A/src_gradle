package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import org.json.JSONObject;

public class bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4288a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Object> f4289b = new HashMap<>();

    public static bh a() {
        if (PatchProxy.isSupport(new Object[0], null, f4288a, true, 88278, new Class[0], bh.class)) {
            return (bh) PatchProxy.accessDispatch(new Object[0], null, f4288a, true, 88278, new Class[0], bh.class);
        }
        return new bh();
    }

    public final synchronized JSONObject b() {
        if (PatchProxy.isSupport(new Object[0], this, f4288a, false, 88285, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f4288a, false, 88285, new Class[0], JSONObject.class);
        }
        try {
            return new JSONObject(this.f4289b);
        } catch (Exception unused) {
            return null;
        }
    }

    public final bh a(String str, Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{str, bool}, this, f4288a, false, 88282, new Class[]{String.class, Boolean.class}, bh.class)) {
            return (bh) PatchProxy.accessDispatch(new Object[]{str, bool}, this, f4288a, false, 88282, new Class[]{String.class, Boolean.class}, bh.class);
        }
        this.f4289b.put(str, bool);
        return this;
    }

    public final bh a(String str, Integer num) {
        if (PatchProxy.isSupport(new Object[]{str, num}, this, f4288a, false, 88283, new Class[]{String.class, Integer.class}, bh.class)) {
            return (bh) PatchProxy.accessDispatch(new Object[]{str, num}, this, f4288a, false, 88283, new Class[]{String.class, Integer.class}, bh.class);
        }
        this.f4289b.put(str, num);
        return this;
    }

    public final bh a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f4288a, false, 88279, new Class[]{String.class, String.class}, bh.class)) {
            return (bh) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f4288a, false, 88279, new Class[]{String.class, String.class}, bh.class);
        }
        this.f4289b.put(str, str2);
        return this;
    }
}
