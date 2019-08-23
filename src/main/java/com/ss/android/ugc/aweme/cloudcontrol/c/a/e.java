package com.ss.android.ugc.aweme.cloudcontrol.c.a;

import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.utils.t;
import com.ss.android.ugc.aweme.cloudcontrol.c.c;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateModel;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateResponse;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36241a;

    public final TemplateResponse a(@NonNull TemplateModel templateModel) {
        if (PatchProxy.isSupport(new Object[]{templateModel}, this, f36241a, false, 27071, new Class[]{TemplateModel.class}, TemplateResponse.class)) {
            return (TemplateResponse) PatchProxy.accessDispatch(new Object[]{templateModel}, this, f36241a, false, 27071, new Class[]{TemplateModel.class}, TemplateResponse.class);
        }
        new TemplateResponse();
        try {
            if (!p.a().b()) {
                t.a(f.f36243b);
            }
            return TemplateResponse.builder(1, "success");
        } catch (Exception e2) {
            return TemplateResponse.builder(0, Log.getStackTraceString(e2));
        }
    }

    public final boolean b(@NonNull TemplateModel templateModel) {
        if (PatchProxy.isSupport(new Object[]{templateModel}, this, f36241a, false, 27072, new Class[]{TemplateModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{templateModel}, this, f36241a, false, 27072, new Class[]{TemplateModel.class}, Boolean.TYPE)).booleanValue();
        } else if (templateModel.getOp() == 6) {
            return true;
        } else {
            return false;
        }
    }
}
