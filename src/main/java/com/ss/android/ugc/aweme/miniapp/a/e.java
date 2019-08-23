package com.ss.android.ugc.aweme.miniapp.a;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.excitingvideo.IOpenWebListener;
import com.ss.android.excitingvideo.model.BaseAd;
import com.ss.android.ugc.aweme.app.f;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import org.json.JSONObject;

public final class e implements IOpenWebListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55431a;

    public final void openWebUrl(@NonNull Context context, String str, String str2, @NonNull BaseAd baseAd) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context, str3, str4, baseAd}, this, f55431a, false, 59137, new Class[]{Context.class, String.class, String.class, BaseAd.class}, Void.TYPE)) {
            Object[] objArr = {context, str3, str4, baseAd};
            PatchProxy.accessDispatch(objArr, this, f55431a, false, 59137, new Class[]{Context.class, String.class, String.class, BaseAd.class}, Void.TYPE);
            return;
        }
        String webTitle = baseAd.getWebTitle();
        String logExtra = baseAd.getLogExtra();
        long id = baseAd.getId();
        Object[] objArr2 = {str3, str4, webTitle, logExtra, new Long(id)};
        if (PatchProxy.isSupport(objArr2, null, g.f55437a, true, 59150, new Class[]{String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            Object[] objArr3 = {str3, str4, webTitle, logExtra, new Long(id)};
            Object[] objArr4 = objArr3;
            PatchProxy.accessDispatch(objArr4, null, g.f55437a, true, 59150, new Class[]{String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Activity currentActivity = AppbrandContext.getInst().getCurrentActivity();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f.f34168b, str3);
            jSONObject.put("web_url", str4);
            jSONObject.put("web_title", webTitle);
            jSONObject.put("log_extra", logExtra);
            jSONObject.put("creative_id", id);
            if (currentActivity != null) {
                jSONObject.put("target_class", currentActivity.getClass().getCanonicalName());
            }
            HostProcessBridge.hostActionSync("exciting_video_open_url", CrossProcessDataEntity.Builder.create().put("hostActionData", jSONObject.toString()).build());
        } catch (Exception e2) {
            AppBrandLogger.e(g.f55438b, "hostAction", e2);
        }
    }
}
