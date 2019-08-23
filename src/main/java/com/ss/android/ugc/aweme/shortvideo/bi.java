package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import org.json.JSONObject;

public class bi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65802a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Object> f65803b = new HashMap<>();

    public final bi a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f65802a, false, 74096, new Class[]{String.class, String.class}, bi.class)) {
            return (bi) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f65802a, false, 74096, new Class[]{String.class, String.class}, bi.class);
        }
        this.f65803b.put(str, str2);
        return this;
    }

    public static bi a() {
        if (PatchProxy.isSupport(new Object[0], null, f65802a, true, 74094, new Class[0], bi.class)) {
            return (bi) PatchProxy.accessDispatch(new Object[0], null, f65802a, true, 74094, new Class[0], bi.class);
        }
        return new bi();
    }

    public final synchronized JSONObject b() {
        if (PatchProxy.isSupport(new Object[0], this, f65802a, false, 74102, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f65802a, false, 74102, new Class[0], JSONObject.class);
        }
        try {
            return new JSONObject(this.f65803b);
        } catch (Exception unused) {
            return null;
        }
    }

    public static bi a(SynthetiseResult synthetiseResult) {
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        if (PatchProxy.isSupport(new Object[]{synthetiseResult2}, null, f65802a, true, 74095, new Class[]{SynthetiseResult.class}, bi.class)) {
            return (bi) PatchProxy.accessDispatch(new Object[]{synthetiseResult2}, null, f65802a, true, 74095, new Class[]{SynthetiseResult.class}, bi.class);
        } else if (synthetiseResult2 == null) {
            return new bi();
        } else {
            return new bi().a("is_fast_import", Boolean.valueOf(synthetiseResult2.isFastImport)).a("support_max_resolution", synthetiseResult2.fastImportResolution).a("is_new_framework", Boolean.valueOf(synthetiseResult2.isNewFramework));
        }
    }

    public final bi a(String str, Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{str, bool}, this, f65802a, false, 74099, new Class[]{String.class, Boolean.class}, bi.class)) {
            return (bi) PatchProxy.accessDispatch(new Object[]{str, bool}, this, f65802a, false, 74099, new Class[]{String.class, Boolean.class}, bi.class);
        }
        this.f65803b.put(str, bool);
        return this;
    }

    public final bi a(String str, Float f2) {
        if (PatchProxy.isSupport(new Object[]{str, f2}, this, f65802a, false, 74098, new Class[]{String.class, Float.class}, bi.class)) {
            return (bi) PatchProxy.accessDispatch(new Object[]{str, f2}, this, f65802a, false, 74098, new Class[]{String.class, Float.class}, bi.class);
        }
        this.f65803b.put(str, f2);
        return this;
    }

    public final bi a(String str, Integer num) {
        if (PatchProxy.isSupport(new Object[]{str, num}, this, f65802a, false, 74100, new Class[]{String.class, Integer.class}, bi.class)) {
            return (bi) PatchProxy.accessDispatch(new Object[]{str, num}, this, f65802a, false, 74100, new Class[]{String.class, Integer.class}, bi.class);
        }
        this.f65803b.put(str, num);
        return this;
    }

    public final bi a(String str, Long l) {
        if (PatchProxy.isSupport(new Object[]{str, l}, this, f65802a, false, 74101, new Class[]{String.class, Long.class}, bi.class)) {
            return (bi) PatchProxy.accessDispatch(new Object[]{str, l}, this, f65802a, false, 74101, new Class[]{String.class, Long.class}, bi.class);
        }
        this.f65803b.put(str, l);
        return this;
    }
}
