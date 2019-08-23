package com.ss.android.ugc.aweme.cloudcontrol.c;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateModel;
import com.ss.android.ugc.aweme.cloudcontrol.model.TemplateResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36245a;

    /* renamed from: b  reason: collision with root package name */
    private Gson f36246b = new Gson();

    /* renamed from: c  reason: collision with root package name */
    private List<c> f36247c = new ArrayList();

    public final void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f36245a, false, 27064, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f36245a, false, 27064, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f36247c.add(cVar2);
    }

    public final TemplateResponse a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f36245a, false, 27063, new Class[]{String.class}, TemplateResponse.class)) {
            return (TemplateResponse) PatchProxy.accessDispatch(new Object[]{str}, this, f36245a, false, 27063, new Class[]{String.class}, TemplateResponse.class);
        }
        TemplateResponse templateResponse = null;
        try {
            TemplateModel templateModel = (TemplateModel) this.f36246b.fromJson(str, TemplateModel.class);
            Iterator<c> it2 = this.f36247c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                c next = it2.next();
                if (next.b(templateModel)) {
                    templateResponse = next.a(templateModel);
                    break;
                }
            }
        } catch (Exception e2) {
            templateResponse = new TemplateResponse();
            templateResponse.message = e2.getMessage();
        }
        if (templateResponse == null) {
            templateResponse = new TemplateResponse();
            templateResponse.message = "No Handler";
        }
        return templateResponse;
    }
}
