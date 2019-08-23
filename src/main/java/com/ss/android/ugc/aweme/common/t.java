package com.ss.android.ugc.aweme.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40274a;

    /* renamed from: b  reason: collision with root package name */
    private Map f40275b = new HashMap();

    public final JSONObject a() {
        if (!PatchProxy.isSupport(new Object[0], this, f40274a, false, 33324, new Class[0], JSONObject.class)) {
            return new JSONObject(this.f40275b);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f40274a, false, 33324, new Class[0], JSONObject.class);
    }

    public final t a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f40274a, false, 33323, new Class[]{String.class, String.class}, t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f40274a, false, 33323, new Class[]{String.class, String.class}, t.class);
        }
        this.f40275b.put(str, str2);
        return this;
    }
}
