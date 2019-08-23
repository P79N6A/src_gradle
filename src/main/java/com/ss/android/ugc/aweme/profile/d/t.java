package com.ss.android.ugc.aweme.profile.d;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.d.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.widget.RemarkEditDialog;
import java.util.Map;

public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61488a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61489b;

    /* renamed from: c  reason: collision with root package name */
    private final User f61490c;

    /* renamed from: d  reason: collision with root package name */
    private final s.a f61491d;

    t(String str, User user, s.a aVar) {
        this.f61489b = str;
        this.f61490c = user;
        this.f61491d = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f61488a, false, 70007, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61488a, false, 70007, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        String str = this.f61489b;
        User user = this.f61490c;
        s.a aVar = this.f61491d;
        r.a("edit_remarks", (Map) new d().a("enter_from", str).a("action_type", "click").f34114b);
        RemarkEditDialog remarkEditDialog = new RemarkEditDialog(view.getContext());
        remarkEditDialog.g = user;
        remarkEditDialog.f63095f = aVar;
        remarkEditDialog.show();
    }
}
