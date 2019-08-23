package com.ss.android.ugc.aweme.story.comment.a;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.d;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72138a;

    /* renamed from: b  reason: collision with root package name */
    private final a f72139b;

    b(a aVar) {
        this.f72139b = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72138a, false, 82710, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72138a, false, 82710, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        a aVar = this.f72139b;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f72130a, false, 82707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f72130a, false, 82707, new Class[0], Void.TYPE);
            return;
        }
        d dVar = (d) ServiceManager.get().getService(d.class);
        if (dVar != null) {
            dVar.a(aVar.getContext(), aVar.h);
        }
        aVar.dismiss();
    }
}
