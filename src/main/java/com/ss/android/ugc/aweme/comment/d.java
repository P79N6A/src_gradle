package com.ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36387a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentInputManager f36388b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36389c;

    /* renamed from: d  reason: collision with root package name */
    private final String f36390d;

    /* renamed from: e  reason: collision with root package name */
    private final MentionEditText f36391e;

    d(CommentInputManager commentInputManager, String str, String str2, MentionEditText mentionEditText) {
        this.f36388b = commentInputManager;
        this.f36389c = str;
        this.f36390d = str2;
        this.f36391e = mentionEditText;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36387a, false, 27126, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36387a, false, 27126, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommentInputManager commentInputManager = this.f36388b;
        String str = this.f36389c;
        String str2 = this.f36390d;
        MentionEditText mentionEditText = this.f36391e;
        if (commentInputManager.k()) {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                e.a((Activity) commentInputManager.f36249b.getActivity(), str, "click_comment_emotion", ad.a().a("login_title", commentInputManager.f36249b.getString(C0906R.string.uz)).a("group_id", str2).a("log_pb", aa.g(str2)).f75487b);
            } else if (!commentInputManager.d()) {
                commentInputManager.a(mentionEditText.onSaveInstanceState(), mentionEditText.getHint(), true);
            }
        }
    }
}
