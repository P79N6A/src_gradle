package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;

public class RecommendFriendViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41752a;
    @BindView(2131496648)
    RecyclerView recyclerView;
    @BindView(2131494271)
    TextView txtFindMore;
    @BindView(2131496123)
    TextView txtInterested;

    @OnClick({2131494271})
    public void goAddFriends() {
        if (PatchProxy.isSupport(new Object[0], this, f41752a, false, 35747, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41752a, false, 35747, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName("check_more").setLabelName("discovery_recommend"));
        h.a().a("aweme://user/invite");
    }
}
