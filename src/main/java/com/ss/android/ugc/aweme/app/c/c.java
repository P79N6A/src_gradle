package com.ss.android.ugc.aweme.app.c;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.downloadlib.addownload.c.a;
import com.ss.android.downloadlib.addownload.d.d;
import com.ss.android.ugc.aweme.app.c.b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final /* synthetic */ class c implements a.C0343a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34047a;

    /* renamed from: b  reason: collision with root package name */
    private final List f34048b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONArray f34049c;

    /* renamed from: d  reason: collision with root package name */
    private final b.a f34050d;

    public c(List list, JSONArray jSONArray, b.a aVar) {
        this.f34048b = list;
        this.f34049c = jSONArray;
        this.f34050d = aVar;
    }

    public final void a(List list) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, f34047a, false, 23356, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f34047a, false, 23356, new Class[]{List.class}, Void.TYPE);
            return;
        }
        List list2 = this.f34048b;
        JSONArray jSONArray = this.f34049c;
        b.a aVar = this.f34050d;
        if (!CollectionUtils.isEmpty(list) && list.size() == list2.size()) {
            while (i < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    int i2 = ((d) list.get(i)).f28773d;
                    String str = "";
                    if (i2 == d.f28770a) {
                        str = "default";
                    } else if (i2 == d.f28771b) {
                        str = "normal";
                    } else if (i2 == d.f28772c) {
                        str = "upgrade";
                    }
                    jSONObject.put("install_status", str);
                    i++;
                } catch (Exception e2) {
                    e2.getStackTrace();
                }
            }
            aVar.a(jSONArray);
        }
    }
}
