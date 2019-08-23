package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.h.a;
import com.ss.android.ugc.aweme.feed.h.b;
import java.util.Map;

public final /* synthetic */ class av implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46528a;

    /* renamed from: b  reason: collision with root package name */
    private final PrivateDialog f46529b;

    av(PrivateDialog privateDialog) {
        this.f46529b = privateDialog;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46528a, false, 42946, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46528a, false, 42946, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PrivateDialog privateDialog = this.f46529b;
        r.a("dou_promote_layer_show", (Map) d.a().a("enter_from", privateDialog.f46237e).a("group_id", privateDialog.f46235c.getAid()).a("author_id", privateDialog.f46235c.getAuthorUid()).f34114b);
        b bVar = new b(privateDialog.f46235c);
        bVar.a(new a());
        bVar.a(privateDialog);
        bVar.a(privateDialog.f46235c.getAid());
        privateDialog.dismiss();
    }
}
