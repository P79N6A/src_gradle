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

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61492a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61493b;

    /* renamed from: c  reason: collision with root package name */
    private final User f61494c;

    /* renamed from: d  reason: collision with root package name */
    private final s.a f61495d;

    u(String str, User user, s.a aVar) {
        this.f61493b = str;
        this.f61494c = user;
        this.f61495d = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f61492a, false, 70008, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61492a, false, 70008, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        String str = this.f61493b;
        User user = this.f61494c;
        s.a aVar = this.f61495d;
        r.a("edit_remarks", (Map) new d().a("enter_from", str).a("action_type", "click").f34114b);
        RemarkEditDialog remarkEditDialog = new RemarkEditDialog(view.getContext());
        remarkEditDialog.g = user;
        remarkEditDialog.f63095f = aVar;
        remarkEditDialog.show();
    }
}
