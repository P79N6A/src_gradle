package com.bytedance.android.live.core.utils.fresco;

import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.base.b.c;
import com.bytedance.android.live.core.d.b;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.live.core.utils.ac;
import com.facebook.imagepipeline.request.ImageRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8277a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f8278b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageRequest f8279c;

    d(Throwable th, ImageRequest imageRequest) {
        this.f8278b = th;
        this.f8279c = imageRequest;
    }

    public final void run() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f8277a, false, 1386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8277a, false, 1386, new Class[0], Void.TYPE);
            return;
        }
        Throwable th = this.f8278b;
        ImageRequest imageRequest = this.f8279c;
        Context e2 = ac.e();
        if (NetworkUtils.isNetworkAvailable(e2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorDesc", th.toString());
                jSONObject.put(PushConstants.WEB_URL, imageRequest.getSourceUri());
                jSONObject.put("userId", ((c) a.a(c.class)).a());
                jSONObject.put("networkType", NetworkUtils.getNetworkAccessType(e2));
                com.bytedance.android.live.core.d.c.a("hotsoon_image_load_log", "image_error", jSONObject);
            } catch (Exception unused) {
            }
            com.bytedance.android.live.core.d.c.a("hotsoon_image_load_error_rate", 1, jSONObject);
            String uri = imageRequest.getSourceUri().toString();
            String th2 = th.toString();
            if (PatchProxy.isSupport(new Object[]{uri, th2}, null, b.f7837a, true, 344, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{uri, th2}, null, b.f7837a, true, 344, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(PushConstants.WEB_URL, uri);
            hashMap.put("error_msg", th2);
            e.a(b.a("ttlive_image_load_status"), 1, 0, (Map<String, Object>) hashMap);
            if (PatchProxy.isSupport(new Object[]{"ttlive_image_load_status"}, null, b.f7837a, true, 342, new Class[]{String.class}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{"ttlive_image_load_status"}, null, b.f7837a, true, 342, new Class[]{String.class}, String.class);
            } else {
                str = com.bytedance.android.live.core.d.d.b("ttlive_image_load_status");
            }
            e.a(str, 1, 0, (Map<String, Object>) hashMap);
        }
    }
}
