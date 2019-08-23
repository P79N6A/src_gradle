package com.ss.android.newmedia.app;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30170a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f30171b;

    /* renamed from: c  reason: collision with root package name */
    public int f30172c;

    /* renamed from: d  reason: collision with root package name */
    public long f30173d;

    /* renamed from: e  reason: collision with root package name */
    public long f30174e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30175f;
    public boolean g;
    public boolean h;
    public int i;
    public String j;
    public List<String> k = new ArrayList();

    public final void a(Context context, long j2, String str) {
        long j3 = j2;
        String str2 = str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{context, new Long(j3), str2}, this, f30170a, false, 18580, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, new Long(j3), str2}, this, f30170a, false, 18580, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE);
        } else if (this.k != null && !this.k.isEmpty()) {
            try {
                if (!StringUtils.isEmpty(this.j)) {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    for (String next : this.k) {
                        if (!StringUtils.isEmpty(next)) {
                            jSONArray.put(next);
                            z = true;
                        }
                    }
                    if (z) {
                        jSONObject.put("track_key", this.j);
                        jSONObject.put("links", jSONArray.toString());
                        jSONObject.put("log_extra", str2);
                        a.a(context, "wap_stat", "jump_links", null, 0, j2, jSONObject);
                        this.j = null;
                    }
                }
            } catch (Exception unused) {
            }
            this.k.clear();
        }
    }
}
