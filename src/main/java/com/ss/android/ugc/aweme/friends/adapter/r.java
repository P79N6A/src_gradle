package com.ss.android.ugc.aweme.friends.adapter;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.friends.model.Friend;
import java.util.Map;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48820a;

    /* renamed from: b  reason: collision with root package name */
    private final UnRegisteredFriendsViewHolder f48821b;

    r(UnRegisteredFriendsViewHolder unRegisteredFriendsViewHolder) {
        this.f48821b = unRegisteredFriendsViewHolder;
    }

    public final void onClick(View view) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{view}, this, f48820a, false, 46371, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48820a, false, 46371, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        UnRegisteredFriendsViewHolder unRegisteredFriendsViewHolder = this.f48821b;
        if (PatchProxy.isSupport(new Object[0], unRegisteredFriendsViewHolder, UnRegisteredFriendsViewHolder.f48778a, false, 46368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], unRegisteredFriendsViewHolder, UnRegisteredFriendsViewHolder.f48778a, false, 46368, new Class[0], Void.TYPE);
            return;
        }
        if (unRegisteredFriendsViewHolder.f48781d != null) {
            if (!NetworkUtils.isNetworkAvailable(unRegisteredFriendsViewHolder.f48780c)) {
                a.b(unRegisteredFriendsViewHolder.f48780c, (int) C0906R.string.bgf).a();
            } else if (!TextUtils.isEmpty(unRegisteredFriendsViewHolder.f48781d.getUid())) {
                if (unRegisteredFriendsViewHolder.f48781d.getFollowStatus() == 0) {
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("follow").setLabelName(unRegisteredFriendsViewHolder.a(unRegisteredFriendsViewHolder.f48782e)).setValue(unRegisteredFriendsViewHolder.f48781d.getUid()).setJsonObject(new t().a("nt", PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION).a()));
                    com.ss.android.ugc.aweme.common.r.a("follow", (Map) d.a().a("enter_from", unRegisteredFriendsViewHolder.a(unRegisteredFriendsViewHolder.f48782e)).a("to_user_id", unRegisteredFriendsViewHolder.f48781d.getUid()).a("group_id", "").b().f34114b);
                } else if (unRegisteredFriendsViewHolder.f48781d.getFollowStatus() == 1 || unRegisteredFriendsViewHolder.f48781d.getFollowStatus() == 4) {
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("unfollow").setLabelName(unRegisteredFriendsViewHolder.a(unRegisteredFriendsViewHolder.f48782e)).setValue(unRegisteredFriendsViewHolder.f48781d.getUid()));
                    com.ss.android.ugc.aweme.common.r.a(com.ss.android.g.a.a() ? "follow_cancel" : "unfollow", (Map) d.a().a("enter_from", unRegisteredFriendsViewHolder.a(unRegisteredFriendsViewHolder.f48782e)).a("to_user_id", unRegisteredFriendsViewHolder.f48781d.getUid()).a("group_id", "").f34114b);
                }
                if (unRegisteredFriendsViewHolder.f48783f != null) {
                    com.ss.android.ugc.aweme.friends.a.a aVar = unRegisteredFriendsViewHolder.f48783f;
                    String uid = unRegisteredFriendsViewHolder.f48781d.getUid();
                    String secUid = unRegisteredFriendsViewHolder.f48781d.getSecUid();
                    if (unRegisteredFriendsViewHolder.f48781d.getFollowStatus() != 0) {
                        i = 0;
                    }
                    aVar.a(uid, secUid, i);
                }
            } else {
                Friend a2 = UnRegisteredFriendsViewHolder.a(unRegisteredFriendsViewHolder.f48781d);
                if (a2 != null && !a2.isInvited()) {
                    com.ss.android.ugc.aweme.common.r.a("invite_friend", (Map) d.a().a("enter_from", unRegisteredFriendsViewHolder.a(unRegisteredFriendsViewHolder.f48782e)).f34114b);
                    unRegisteredFriendsViewHolder.f48783f.a(a2);
                }
            }
        }
    }
}
