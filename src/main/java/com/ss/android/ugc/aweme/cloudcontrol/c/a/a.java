package com.ss.android.ugc.aweme.cloudcontrol.c.a;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.cloudcontrol.c.c;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateModel;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateResponse;
import com.ss.android.ugc.aweme.setting.ui.d;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36233a;

    public final TemplateResponse a(@NonNull TemplateModel templateModel) {
        if (PatchProxy.isSupport(new Object[]{templateModel}, this, f36233a, false, 27065, new Class[]{TemplateModel.class}, TemplateResponse.class)) {
            return (TemplateResponse) PatchProxy.accessDispatch(new Object[]{templateModel}, this, f36233a, false, 27065, new Class[]{TemplateModel.class}, TemplateResponse.class);
        }
        d.f64421b.a(com.ss.android.ugc.aweme.base.utils.d.a());
        TemplateResponse templateResponse = new TemplateResponse();
        templateResponse.code = 1;
        templateResponse.message = "success";
        return templateResponse;
    }

    public final boolean b(@NonNull TemplateModel templateModel) {
        if (PatchProxy.isSupport(new Object[]{templateModel}, this, f36233a, false, 27066, new Class[]{TemplateModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{templateModel}, this, f36233a, false, 27066, new Class[]{TemplateModel.class}, Boolean.TYPE)).booleanValue();
        } else if (templateModel.getOp() == 5) {
            return true;
        } else {
            return false;
        }
    }
}
