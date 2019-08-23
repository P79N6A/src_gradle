package com.ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ad;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36382a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentInputManager f36383b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36384c;

    /* renamed from: d  reason: collision with root package name */
    private final String f36385d;

    c(CommentInputManager commentInputManager, String str, String str2) {
        this.f36383b = commentInputManager;
        this.f36384c = str;
        this.f36385d = str2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36382a, false, 27125, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36382a, false, 27125, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentInputManager commentInputManager = this.f36383b;
        String str = this.f36384c;
        String str2 = this.f36385d;
        if (commentInputManager.k()) {
            if (!d.a().isLogin()) {
                e.a((Activity) commentInputManager.f36249b.getActivity(), str, "click_comment_at", ad.a().a("login_title", commentInputManager.f36249b.getString(C0906R.string.uz)).a("group_id", str2).a("log_pb", aa.g(str2)).f75487b);
            } else if (!commentInputManager.d()) {
                commentInputManager.a(commentInputManager.f36251d.size());
            }
        }
    }
}
