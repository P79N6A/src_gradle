package com.ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36366a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentInputManager f36367b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36368c;

    /* renamed from: d  reason: collision with root package name */
    private final String f36369d;

    b(CommentInputManager commentInputManager, String str, String str2) {
        this.f36367b = commentInputManager;
        this.f36368c = str;
        this.f36369d = str2;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36366a, false, 27124, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36366a, false, 27124, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentInputManager commentInputManager = this.f36367b;
        String str = this.f36368c;
        String str2 = this.f36369d;
        if (commentInputManager.k()) {
            if (TimeLockRuler.isTeenModeON()) {
                a.c(d.a(), (int) C0906R.string.chv).a();
            } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                e.a((Activity) commentInputManager.f36249b.getActivity(), str, "click_type_comment", ad.a().a("login_title", commentInputManager.f36249b.getString(C0906R.string.uz)).a("group_id", str2).a("log_pb", aa.g(str2)).f75487b);
            } else if (ex.b()) {
                a.c(d.a(), (int) C0906R.string.sk).a();
            } else if (!commentInputManager.d()) {
                if (commentInputManager.j == 1) {
                    a.c(GlobalContext.getContext(), (int) C0906R.string.w8).a();
                    return;
                }
                MentionEditText mentionEditText = (MentionEditText) view;
                if (commentInputManager.f36250c.getCommentInputAweme() != null && !am.b(commentInputManager.f36250c.getCommentInputAweme())) {
                    commentInputManager.h = true;
                    commentInputManager.a(mentionEditText.onSaveInstanceState(), mentionEditText.getHint(), false);
                }
            }
        }
    }
}
