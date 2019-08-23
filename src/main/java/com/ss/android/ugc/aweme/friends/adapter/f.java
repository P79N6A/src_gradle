package com.ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.ui.FriendListFragment;
import com.ss.android.ugc.aweme.im.b;
import java.util.Map;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48796a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendListViewHolder f48797b;

    /* renamed from: c  reason: collision with root package name */
    private final FriendListFragment f48798c;

    /* renamed from: d  reason: collision with root package name */
    private final c f48799d;

    f(FriendListViewHolder friendListViewHolder, FriendListFragment friendListFragment, c cVar) {
        this.f48797b = friendListViewHolder;
        this.f48798c = friendListFragment;
        this.f48799d = cVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48796a, false, 46285, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48796a, false, 46285, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FriendListViewHolder friendListViewHolder = this.f48797b;
        FriendListFragment friendListFragment = this.f48798c;
        c cVar = this.f48799d;
        if (TimeLockRuler.isTeenModeON()) {
            a.c(friendListFragment.getContext(), (int) C0906R.string.cif).a();
            return;
        }
        r.a("enter_chat", (Map) new d().a("enter_from", "friends_list").a("to_user_id", friendListViewHolder.f48719b.getUser().getUid()).f34114b);
        if (cVar.getUser() != null) {
            b.a().startChat(view.getContext(), b.a(cVar.getUser()));
        }
    }
}
