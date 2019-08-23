package com.bytedance.android.live.excitingvideoad.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.excitingvideoad.a;
import com.bytedance.android.live.excitingvideoad.a.b;
import com.bytedance.android.live.excitingvideoad.c;
import com.bytedance.android.live.excitingvideoad.e;
import com.bytedance.android.live.excitingvideoad.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8448a;
    private static d h = new d();

    /* renamed from: b  reason: collision with root package name */
    public e f8449b;

    /* renamed from: c  reason: collision with root package name */
    public c f8450c;

    /* renamed from: d  reason: collision with root package name */
    public g f8451d;

    /* renamed from: e  reason: collision with root package name */
    public a f8452e;

    /* renamed from: f  reason: collision with root package name */
    public b f8453f;
    public String g;
    private com.bytedance.android.live.excitingvideoad.b i;

    public final void a(Context context, String str, String str2, long j, JSONObject jSONObject) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j2), jSONObject}, this, f8448a, false, 1626, new Class[]{Context.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, new Long(j2), jSONObject};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f8448a, false, 1626, new Class[]{Context.class, String.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
        }
    }

    private d() {
    }

    public static d a() {
        return h;
    }

    public final void a(Context context, String str, String str2, long j, String str3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j2), str3}, this, f8448a, false, 1625, new Class[]{Context.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {context, str, str2, new Long(j2), str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f8448a, false, 1625, new Class[]{Context.class, String.class, String.class, Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(context, str, str2, j, str3, this.f8453f.g);
    }

    private void a(Context context, String str, String str2, long j, String str3, String str4) {
        long j2 = j;
        String str5 = str3;
        String str6 = str4;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j2), str5, str6}, this, f8448a, false, 1627, new Class[]{Context.class, String.class, String.class, Long.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, new Long(j2), str5, str6}, this, f8448a, false, 1627, new Class[]{Context.class, String.class, String.class, Long.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("refer", str5);
                jSONObject.put("is_ad_event", 1);
                jSONObject.put("log_extra", str6);
                if (!TextUtils.isEmpty(this.g)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("adUnitId", this.g);
                    jSONObject.put("ad_extra_data", jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
