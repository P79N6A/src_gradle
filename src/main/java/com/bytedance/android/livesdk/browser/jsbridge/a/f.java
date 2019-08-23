package com.bytedance.android.livesdk.browser.jsbridge.a;

import com.bytedance.android.livesdkapi.depend.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9430a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f9431b;

    public final Set<a> a() {
        if (PatchProxy.isSupport(new Object[0], this, f9430a, false, 3614, new Class[0], Set.class)) {
            return (Set) PatchProxy.accessDispatch(new Object[0], this, f9430a, false, 3614, new Class[0], Set.class);
        }
        HashSet hashSet = new HashSet();
        if (this.f9431b == null) {
            return hashSet;
        }
        try {
            JSONArray jSONArray = this.f9431b.getJSONArray("type_list");
            for (int i = 0; i < jSONArray.length(); i++) {
                String string = jSONArray.getString(i);
                a[] values = a.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    a aVar = values[i2];
                    if (aVar.getWsMethod().equals(string)) {
                        hashSet.add(aVar);
                        break;
                    }
                    i2++;
                }
            }
        } catch (JSONException unused) {
        }
        return hashSet;
    }

    public f(JSONObject jSONObject) {
        this.f9431b = jSONObject;
    }
}
