package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39285a;

    public static void a(Aweme aweme, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i), Integer.valueOf(i2)}, null, f39285a, true, 31445, new Class[]{Aweme.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i), Integer.valueOf(i2)}, null, f39285a, true, 31445, new Class[]{Aweme.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aweme_id", aweme.getAid());
            jSONObject.put("error_type", String.valueOf(i));
            jSONObject.put("ad_id", aweme.getAwemeRawAd().getAdId());
            jSONObject.put("status", String.valueOf(i2));
        } catch (Exception unused) {
        }
        e.a("aweme_adx_video_error_log", i2, jSONObject);
    }
}
