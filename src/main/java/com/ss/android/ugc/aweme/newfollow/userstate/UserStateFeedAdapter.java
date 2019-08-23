package com.ss.android.ugc.aweme.newfollow.userstate;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder;
import com.ss.android.ugc.aweme.forward.vh.ForwardTextViewHolder;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FavoriteVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioForwardDeletedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowDeletedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.MomentFollowFeedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.MomentForwardDeletedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.MomentForwardFeedViewHolder;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class UserStateFeedAdapter extends FeedAdapter<FollowFeed> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f57339f;

    public final FavoriteVideoViewHolder e(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f57339f, false, 61758, new Class[]{ViewGroup.class}, FavoriteVideoViewHolder.class)) {
            return new UserStateFavoriteVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.u4, viewGroup2, false));
        }
        return (FavoriteVideoViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f57339f, false, 61758, new Class[]{ViewGroup.class}, FavoriteVideoViewHolder.class);
    }

    public int getLoadMoreHeight(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57339f, false, 61760, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f57339f, false, 61760, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else if (view == null) {
            return 0;
        } else {
            Resources resources = view.getResources();
            if (this.y) {
                return resources.getDimensionPixelSize(C0906R.dimen.di) + resources.getDimensionPixelSize(C0906R.dimen.lv);
            }
            return resources.getDimensionPixelSize(C0906R.dimen.di);
        }
    }

    public void setLoadingPadding(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f57339f, false, 61761, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f57339f, false, 61761, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            if (this.y) {
                view2.setPadding(0, 0, 0, view.getResources().getDimensionPixelSize(C0906R.dimen.lv));
            }
        }
    }

    @NonNull
    public final RecyclerView.ViewHolder f(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f57339f, false, 61755, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f57339f, false, 61755, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        int aB = AbTestManager.a().aB();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false);
        switch (aB) {
            case 1:
            case 8:
                FixRatioForwardDeletedViewHolder fixRatioForwardDeletedViewHolder = new FixRatioForwardDeletedViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return fixRatioForwardDeletedViewHolder;
            case 2:
                MomentForwardDeletedViewHolder momentForwardDeletedViewHolder = new MomentForwardDeletedViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return momentForwardDeletedViewHolder;
            case 3:
            case 4:
            case 5:
            case 6:
            case e.l:
            case 9:
                InsFollowDeletedViewHolder insFollowDeletedViewHolder = new InsFollowDeletedViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return insFollowDeletedViewHolder;
            default:
                ForwardTextViewHolder forwardTextViewHolder = new ForwardTextViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return forwardTextViewHolder;
        }
    }

    public final BaseFollowViewHolder a(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f57339f, false, 61756, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class)) {
            return (BaseFollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f57339f, false, 61756, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class);
        }
        switch (AbTestManager.a().aB()) {
            case 1:
            case 8:
                UserStateFixRatioFollowVideoViewHolder userStateFixRatioFollowVideoViewHolder = new UserStateFixRatioFollowVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.o, this.q, this.y);
                userStateFixRatioFollowVideoViewHolder.V = this;
                return userStateFixRatioFollowVideoViewHolder;
            case 2:
                return new MomentFollowFeedViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.o);
            case 3:
            case 9:
                UserStateInsFollowVideoViewHolder userStateInsFollowVideoViewHolder = new UserStateInsFollowVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.o, this.q, this.y);
                userStateInsFollowVideoViewHolder.V = this;
                return userStateInsFollowVideoViewHolder;
            case 4:
                UserStateInsFollowVideoViewHolderPlanA userStateInsFollowVideoViewHolderPlanA = new UserStateInsFollowVideoViewHolderPlanA((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.o, this.q, this.y);
                userStateInsFollowVideoViewHolderPlanA.V = this;
                return userStateInsFollowVideoViewHolderPlanA;
            case 5:
                UserStateInsFollowVideoViewHolderPlanB userStateInsFollowVideoViewHolderPlanB = new UserStateInsFollowVideoViewHolderPlanB((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.o, this.q, this.y);
                userStateInsFollowVideoViewHolderPlanB.V = this;
                return userStateInsFollowVideoViewHolderPlanB;
            case 6:
                UserStateInsFollowVideoViewHolderPlanC userStateInsFollowVideoViewHolderPlanC = new UserStateInsFollowVideoViewHolderPlanC((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.o, this.q, this.y);
                userStateInsFollowVideoViewHolderPlanC.V = this;
                return userStateInsFollowVideoViewHolderPlanC;
            case e.l:
                UserStateInsFollowVideoViewHolderPlanD userStateInsFollowVideoViewHolderPlanD = new UserStateInsFollowVideoViewHolderPlanD((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.o, this.q, this.y);
                userStateInsFollowVideoViewHolderPlanD.V = this;
                return userStateInsFollowVideoViewHolderPlanD;
            default:
                UserStateFlowItemVideoViewHolder userStateFlowItemVideoViewHolder = new UserStateFlowItemVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.o, this.q);
                userStateFlowItemVideoViewHolder.V = this;
                return userStateFlowItemVideoViewHolder;
        }
    }

    public final BaseFollowViewHolder b(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f57339f, false, 61753, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class)) {
            return (BaseFollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f57339f, false, 61753, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class);
        }
        switch (AbTestManager.a().aB()) {
            case 1:
            case 8:
                UserStateFixRatioFollowImageViewHolder userStateFixRatioFollowImageViewHolder = new UserStateFixRatioFollowImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o, this.y);
                return userStateFixRatioFollowImageViewHolder;
            case 2:
                return new MomentFollowFeedViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o);
            case 3:
            case 9:
                UserStateInsFollowImageViewHolder userStateInsFollowImageViewHolder = new UserStateInsFollowImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o, this.y);
                return userStateInsFollowImageViewHolder;
            case 4:
                UserStateInsFollowImageViewHolderPlanA userStateInsFollowImageViewHolderPlanA = new UserStateInsFollowImageViewHolderPlanA((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o, this.y);
                return userStateInsFollowImageViewHolderPlanA;
            case 5:
                UserStateInsFollowImageViewHolderPlanB userStateInsFollowImageViewHolderPlanB = new UserStateInsFollowImageViewHolderPlanB((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o, this.y);
                return userStateInsFollowImageViewHolderPlanB;
            case 6:
                UserStateInsFollowImageViewHolderPlanC userStateInsFollowImageViewHolderPlanC = new UserStateInsFollowImageViewHolderPlanC((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o, this.y);
                return userStateInsFollowImageViewHolderPlanC;
            case e.l:
                UserStateInsFollowImageViewHolderPlanD userStateInsFollowImageViewHolderPlanD = new UserStateInsFollowImageViewHolderPlanD((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o, this.y);
                return userStateInsFollowImageViewHolderPlanD;
            default:
                return new UserStateFlowItemImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false), this.r, this.j, this.o);
        }
    }

    public final BaseForwardViewHolder c(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f57339f, false, 61754, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class)) {
            return (BaseForwardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f57339f, false, 61754, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class);
        }
        switch (AbTestManager.a().aB()) {
            case 1:
            case 8:
                UserStateFixRatioForwardImageViewHolder userStateFixRatioForwardImageViewHolder = new UserStateFixRatioForwardImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.m, this.o, this.y);
                return userStateFixRatioForwardImageViewHolder;
            case 2:
                MomentForwardFeedViewHolder momentForwardFeedViewHolder = new MomentForwardFeedViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o);
                return momentForwardFeedViewHolder;
            case 3:
            case 9:
                UserStateInsForwardImageViewHolder userStateInsForwardImageViewHolder = new UserStateInsForwardImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.m, this.o, this.y);
                return userStateInsForwardImageViewHolder;
            case 4:
                UserStateInsForwardImageViewHolderPlanA userStateInsForwardImageViewHolderPlanA = new UserStateInsForwardImageViewHolderPlanA((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.m, this.o, this.y);
                return userStateInsForwardImageViewHolderPlanA;
            case 5:
                UserStateInsForwardImageViewHolderPlanB userStateInsForwardImageViewHolderPlanB = new UserStateInsForwardImageViewHolderPlanB((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.m, this.o, this.y);
                return userStateInsForwardImageViewHolderPlanB;
            case 6:
                UserStateInsForwardImageViewHolderPlanC userStateInsForwardImageViewHolderPlanC = new UserStateInsForwardImageViewHolderPlanC((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.m, this.o, this.y);
                return userStateInsForwardImageViewHolderPlanC;
            case e.l:
                UserStateInsForwardImageViewHolderPlanD userStateInsForwardImageViewHolderPlanD = new UserStateInsForwardImageViewHolderPlanD((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.m, this.o, this.y);
                return userStateInsForwardImageViewHolderPlanD;
            default:
                UserStateFlowItemForwardImageViewHolder userStateFlowItemForwardImageViewHolder = new UserStateFlowItemForwardImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.j, this.m, this.o);
                return userStateFlowItemForwardImageViewHolder;
        }
    }

    public final BaseForwardViewHolder d(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f57339f, false, 61757, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class)) {
            return (BaseForwardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f57339f, false, 61757, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class);
        }
        switch (AbTestManager.a().aB()) {
            case 1:
            case 8:
                UserStateFixRatioForwardVideoViewHolder userStateFixRatioForwardVideoViewHolder = new UserStateFixRatioForwardVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o, this.y);
                userStateFixRatioForwardVideoViewHolder.a((FollowVideoViewHolder.a) this);
                return userStateFixRatioForwardVideoViewHolder;
            case 2:
                MomentForwardFeedViewHolder momentForwardFeedViewHolder = new MomentForwardFeedViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o);
                return momentForwardFeedViewHolder;
            case 3:
            case 9:
                UserStateInsForwardVideoViewHolder userStateInsForwardVideoViewHolder = new UserStateInsForwardVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o, this.y);
                userStateInsForwardVideoViewHolder.a((FollowVideoViewHolder.a) this);
                return userStateInsForwardVideoViewHolder;
            case 4:
                UserStateInsForwardVideoViewHolderPlanA userStateInsForwardVideoViewHolderPlanA = new UserStateInsForwardVideoViewHolderPlanA((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o, this.y);
                userStateInsForwardVideoViewHolderPlanA.a((FollowVideoViewHolder.a) this);
                return userStateInsForwardVideoViewHolderPlanA;
            case 5:
                UserStateInsForwardVideoViewHolderPlanB userStateInsForwardVideoViewHolderPlanB = new UserStateInsForwardVideoViewHolderPlanB((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o, this.y);
                userStateInsForwardVideoViewHolderPlanB.a((FollowVideoViewHolder.a) this);
                return userStateInsForwardVideoViewHolderPlanB;
            case 6:
                UserStateInsForwardVideoViewHolderPlanC userStateInsForwardVideoViewHolderPlanC = new UserStateInsForwardVideoViewHolderPlanC((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o, this.y);
                userStateInsForwardVideoViewHolderPlanC.a((FollowVideoViewHolder.a) this);
                return userStateInsForwardVideoViewHolderPlanC;
            case e.l:
                UserStateInsForwardVideoViewHolderPlanD userStateInsForwardVideoViewHolderPlanD = new UserStateInsForwardVideoViewHolderPlanD((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o, this.y);
                userStateInsForwardVideoViewHolderPlanD.a((FollowVideoViewHolder.a) this);
                return userStateInsForwardVideoViewHolderPlanD;
            default:
                UserStateFlowItemForwardVideoViewHolder userStateFlowItemForwardVideoViewHolder = new UserStateFlowItemForwardVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.r, this.q, this.j, this.m, this.o);
                userStateFlowItemForwardVideoViewHolder.a((FollowVideoViewHolder.a) this);
                return userStateFlowItemForwardVideoViewHolder;
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f57339f, false, 61751, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f57339f, false, 61751, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        RecyclerView.ViewHolder onCreateBasicViewHolder = super.onCreateBasicViewHolder(viewGroup, i);
        if (onCreateBasicViewHolder != null && (onCreateBasicViewHolder instanceof BaseForwardViewHolder)) {
            ((BaseForwardViewHolder) onCreateBasicViewHolder).b(2);
        }
        return onCreateBasicViewHolder;
    }

    public final void a(Aweme aweme, String str) {
        if (PatchProxy.isSupport(new Object[]{aweme, str}, this, f57339f, false, 61759, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str}, this, f57339f, false, 61759, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme != null && TextUtils.equals(str, this.u)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.s.getLayoutManager();
            for (FollowFeed followFeed : this.mItems) {
                if (followFeed.getAweme() != null && followFeed.getFeedType() == 65280 && TextUtils.equals(followFeed.getAweme().getAid(), aweme.getAid())) {
                    linearLayoutManager.scrollToPositionWithOffset(this.mItems.indexOf(followFeed), 0);
                    return;
                }
            }
        }
    }

    public UserStateFeedAdapter(RecyclerView recyclerView, d dVar, boolean z) {
        super(recyclerView, dVar);
        this.y = z;
        this.w = "trends";
    }

    public final void a(String str, Aweme aweme, int i) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str, aweme2, Integer.valueOf(i)}, this, f57339f, false, 61752, new Class[]{String.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aweme2, Integer.valueOf(i)}, this, f57339f, false, 61752, new Class[]{String.class, Aweme.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        insertData(new FollowFeed(aweme), i);
        int c2 = c(str);
        a(a(c2));
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.s.findViewHolderForAdapterPosition(c2);
        if (findViewHolderForAdapterPosition instanceof BaseFollowViewHolder) {
            ((BaseFollowViewHolder) findViewHolderForAdapterPosition).x();
            return;
        }
        if (findViewHolderForAdapterPosition instanceof BaseForwardViewHolder) {
            ((BaseForwardViewHolder) findViewHolderForAdapterPosition).D();
        }
    }
}
