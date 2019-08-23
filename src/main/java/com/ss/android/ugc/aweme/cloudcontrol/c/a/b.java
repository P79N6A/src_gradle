package com.ss.android.ugc.aweme.cloudcontrol.c.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.utils.t;
import com.ss.android.ugc.aweme.cloudcontrol.c.c;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateModel;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateResponse;
import org.json.JSONObject;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36234a;

    public final boolean b(@NonNull TemplateModel templateModel) {
        if (PatchProxy.isSupport(new Object[]{templateModel}, this, f36234a, false, 27068, new Class[]{TemplateModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{templateModel}, this, f36234a, false, 27068, new Class[]{TemplateModel.class}, Boolean.TYPE)).booleanValue();
        } else if (templateModel.getOp() == 3) {
            return true;
        } else {
            return false;
        }
    }

    public final TemplateResponse a(@NonNull TemplateModel templateModel) {
        if (PatchProxy.isSupport(new Object[]{templateModel}, this, f36234a, false, 27067, new Class[]{TemplateModel.class}, TemplateResponse.class)) {
            return (TemplateResponse) PatchProxy.accessDispatch(new Object[]{templateModel}, this, f36234a, false, 27067, new Class[]{TemplateModel.class}, TemplateResponse.class);
        }
        try {
            JSONObject jSONObject = new JSONObject(templateModel.getData());
            String optString = jSONObject.optString("message", "");
            String optString2 = jSONObject.optString(PushConstants.WEB_URL, "");
            int optInt = jSONObject.optInt("version");
            double optDouble = jSONObject.optDouble("timelimit");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && optInt != i.a().getUpdateVersionCode() && optDouble > 0.0d) {
                if (!p.a().b()) {
                    t.a(new c(optString2, optString));
                    com.ss.android.ugc.aweme.cloudcontrol.b.c.a(Boolean.TRUE);
                } else {
                    com.ss.android.ugc.aweme.cloudcontrol.b.c.a(Boolean.FALSE);
                }
                double d2 = optDouble * 3600.0d * 1000.0d;
                double currentTimeMillis = (double) System.currentTimeMillis();
                Double.isNaN(currentTimeMillis);
                long j = (long) (d2 + currentTimeMillis);
                if (PatchProxy.isSupport(new Object[]{optString, optString2, Integer.valueOf(optInt), new Long(j)}, null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27054, new Class[]{String.class, String.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{optString, optString2, Integer.valueOf(optInt), new Long(j)}, null, com.ss.android.ugc.aweme.cloudcontrol.b.c.f36230a, true, 27054, new Class[]{String.class, String.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
                } else if (optString != null) {
                    if (optString2 != null) {
                        com.ss.android.ugc.aweme.cloudcontrol.b.c.f36231b.edit().putString("message", optString).putString("uri", optString2).putInt("version", optInt).putLong("time-end", j).apply();
                    }
                }
            }
            return TemplateResponse.builder(1, "success");
        } catch (Exception e2) {
            return TemplateResponse.builder(0, Log.getStackTraceString(e2));
        }
    }
}
