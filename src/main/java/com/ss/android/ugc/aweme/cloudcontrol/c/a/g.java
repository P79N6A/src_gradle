package com.ss.android.ugc.aweme.cloudcontrol.c.a;

import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.cloudcontrol.c.c;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateModel;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateResponse;
import com.ss.android.vesdk.runtime.a;
import org.json.JSONObject;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36244a;

    public final TemplateResponse a(@NonNull TemplateModel templateModel) {
        if (PatchProxy.isSupport(new Object[]{templateModel}, this, f36244a, false, 27074, new Class[]{TemplateModel.class}, TemplateResponse.class)) {
            return (TemplateResponse) PatchProxy.accessDispatch(new Object[]{templateModel}, this, f36244a, false, 27074, new Class[]{TemplateModel.class}, TemplateResponse.class);
        }
        try {
            JSONObject jSONObject = new JSONObject(templateModel.getData());
            a.a().a(k.g(), jSONObject.toString());
            return TemplateResponse.builder(1, "success");
        } catch (Exception e2) {
            return TemplateResponse.builder(0, Log.getStackTraceString(e2));
        }
    }

    public final boolean b(@NonNull TemplateModel templateModel) {
        if (PatchProxy.isSupport(new Object[]{templateModel}, this, f36244a, false, 27075, new Class[]{TemplateModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{templateModel}, this, f36244a, false, 27075, new Class[]{TemplateModel.class}, Boolean.TYPE)).booleanValue();
        } else if (templateModel.getOp() == 12) {
            return true;
        } else {
            return false;
        }
    }
}
