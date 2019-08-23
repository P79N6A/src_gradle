package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class r implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76828a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f76829b;

    public r(WeakReference<Context> weakReference) {
        this.f76829b = weakReference;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76828a, false, 89978, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76828a, false, 89978, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (hVar2 == null || hVar2.f20623d == null) {
        } else {
            try {
                JSONArray optJSONArray = hVar2.f20623d.optJSONArray("images");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList.add(optString);
                    }
                }
                int optInt = hVar2.f20623d.optInt("index", 0);
                if (arrayList.size() != 0) {
                    try {
                        Context context = (Context) this.f76829b.get();
                        if (context != null) {
                            a a2 = a.a();
                            a2.a(context, (List<String>) arrayList, (List<String>) arrayList);
                            a2.a("tag_gallery", optInt, arrayList.size());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }
}
