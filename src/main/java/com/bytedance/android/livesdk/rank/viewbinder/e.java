package com.bytedance.android.livesdk.rank.viewbinder;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.rank.viewbinder.RankItemViewBinder;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17078a;

    /* renamed from: b  reason: collision with root package name */
    private final RankItemViewBinder.RankItemViewHolder f17079b;

    /* renamed from: c  reason: collision with root package name */
    private final User f17080c;

    e(RankItemViewBinder.RankItemViewHolder rankItemViewHolder, User user) {
        this.f17079b = rankItemViewHolder;
        this.f17080c = user;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17078a, false, 13103, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17078a, false, 13103, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RankItemViewBinder.RankItemViewHolder rankItemViewHolder = this.f17079b;
        User user = this.f17080c;
        user.setFollowStatus(((a) obj).a());
        if (PatchProxy.isSupport(new Object[]{user}, rankItemViewHolder, RankItemViewBinder.RankItemViewHolder.f17057a, false, 13099, new Class[]{User.class}, Void.TYPE)) {
            Object[] objArr = {user};
            RankItemViewBinder.RankItemViewHolder rankItemViewHolder2 = rankItemViewHolder;
            ChangeQuickRedirect changeQuickRedirect = RankItemViewBinder.RankItemViewHolder.f17057a;
            PatchProxy.accessDispatch(objArr, rankItemViewHolder2, changeQuickRedirect, false, 13099, new Class[]{User.class}, Void.TYPE);
        } else if ((com.bytedance.android.live.uikit.a.a.d() || com.bytedance.android.live.uikit.a.a.g()) && !user.isFollowing()) {
            rankItemViewHolder.f17062f.setVisibility(0);
        } else {
            rankItemViewHolder.f17062f.setVisibility(8);
        }
    }
}
