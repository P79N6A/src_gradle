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
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.friends.model.Friend;
import java.util.Map;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48801a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendsViewHolder f48802b;

    h(FriendsViewHolder friendsViewHolder) {
        this.f48802b = friendsViewHolder;
    }

    public final void onClick(View view) {
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{view}, this, f48801a, false, 46314, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48801a, false, 46314, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FriendsViewHolder friendsViewHolder = this.f48802b;
        if (PatchProxy.isSupport(new Object[0], friendsViewHolder, FriendsViewHolder.f48732a, false, 46310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], friendsViewHolder, FriendsViewHolder.f48732a, false, 46310, new Class[0], Void.TYPE);
            return;
        }
        if (friendsViewHolder.f48735d != null) {
            if (!NetworkUtils.isNetworkAvailable(friendsViewHolder.f48734c) && friendsViewHolder.f48733b) {
                a.b(friendsViewHolder.f48734c, (int) C0906R.string.bgf).a();
            } else if (!TextUtils.isEmpty(friendsViewHolder.f48735d.getUid())) {
                if (friendsViewHolder.f48735d.getFollowStatus() == 0) {
                    r.onEvent(MobClick.obtain().setEventName("follow").setLabelName(friendsViewHolder.a(friendsViewHolder.f48736e)).setValue(friendsViewHolder.f48735d.getUid()).setJsonObject(new t().a("nt", PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION).a()));
                    r.a("follow", (Map) d.a().a("enter_from", friendsViewHolder.a(friendsViewHolder.f48736e)).a("to_user_id", friendsViewHolder.f48735d.getUid()).a("group_id", "").b().f34114b);
                } else if (friendsViewHolder.f48735d.getFollowStatus() == 1 || friendsViewHolder.f48735d.getFollowStatus() == 4) {
                    r.onEvent(MobClick.obtain().setEventName("unfollow").setLabelName(friendsViewHolder.a(friendsViewHolder.f48736e)).setValue(friendsViewHolder.f48735d.getUid()));
                    r.a(com.ss.android.g.a.a() ? "follow_cancel" : "unfollow", (Map) d.a().a("enter_from", friendsViewHolder.a(friendsViewHolder.f48736e)).a("to_user_id", friendsViewHolder.f48735d.getUid()).a("group_id", "").f34114b);
                }
                if (friendsViewHolder.f48737f != null) {
                    com.ss.android.ugc.aweme.friends.a.a aVar = friendsViewHolder.f48737f;
                    String uid = friendsViewHolder.f48735d.getUid();
                    String secUid = friendsViewHolder.f48735d.getSecUid();
                    if (friendsViewHolder.f48735d.getFollowStatus() != 0) {
                        i = 0;
                    }
                    aVar.a(uid, secUid, i);
                }
            } else if (friendsViewHolder.f48736e == 0 && com.ss.android.g.a.a()) {
                Friend a2 = FriendsViewHolder.a(friendsViewHolder.f48735d);
                if (a2 != null && !a2.isInvited()) {
                    r.a("invite_friend", (Map) d.a().a("enter_from", friendsViewHolder.a(friendsViewHolder.f48736e)).f34114b);
                    friendsViewHolder.f48737f.a(a2);
                }
            }
        }
    }
}
