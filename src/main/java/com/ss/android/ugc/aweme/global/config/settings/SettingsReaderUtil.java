package com.ss.android.ugc.aweme.global.config.settings;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import org.json.JSONObject;

@Keep
public class SettingsReaderUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void monitorError(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 47585, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, changeQuickRedirect, true, 47585, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        n.a("aweme_settings_error_log", jSONObject2);
    }
}
