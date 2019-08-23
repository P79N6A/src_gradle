package com.bytedance.android.live.core.utils.fresco;

import android.net.Uri;
import com.bytedance.android.live.core.d.b;
import com.bytedance.android.live.core.d.c;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8280a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f8281b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8282c;

    e(Uri uri, long j) {
        this.f8281b = uri;
        this.f8282c = j;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f8280a, false, 1387, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8280a, false, 1387, new Class[0], Void.TYPE);
            return;
        }
        Uri uri = this.f8281b;
        long j = this.f8282c;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushConstants.WEB_URL, uri);
        } catch (JSONException unused) {
        }
        c.a("hotsoon_image_load_error_rate", 0, jSONObject);
        if (j > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j);
                jSONObject2.put(PushConstants.WEB_URL, uri);
            } catch (JSONException unused2) {
            }
            c.a("hotsoon_image_load_duration", "hotsoon_image_load", jSONObject2);
            float f2 = (float) j;
            if (PatchProxy.isSupport(new Object[]{"hotsoon_image_load", "load_time", Float.valueOf(f2)}, null, c.f7838a, true, 355, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{"hotsoon_image_load", "load_time", Float.valueOf(f2)}, null, c.f7838a, true, 355, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
            } else {
                c.a().a("hotsoon_image_load", "load_time", f2);
            }
            Logger.debug();
        }
        String uri2 = uri.toString();
        if (PatchProxy.isSupport(new Object[]{uri2, new Long(j)}, null, b.f7837a, true, 343, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2, new Long(j)}, null, b.f7837a, true, 343, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(PushConstants.WEB_URL, uri2);
        com.bytedance.android.live.core.d.e.a(b.a("ttlive_image_load_status"), 0, j, (Map<String, Object>) hashMap);
    }
}
