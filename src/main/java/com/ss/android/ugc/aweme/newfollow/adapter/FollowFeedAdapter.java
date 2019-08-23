package com.ss.android.ugc.aweme.newfollow.adapter;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.feed.an;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.ui.HeaderViewHolder;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder;
import com.ss.android.ugc.aweme.forward.vh.ForwardTextViewHolder;
import com.ss.android.ugc.aweme.framework.e.b;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendItemViewV2Holder;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendsTitleHolder;
import com.ss.android.ugc.aweme.newfollow.b.c;
import com.ss.android.ugc.aweme.newfollow.b.d;
import com.ss.android.ugc.aweme.newfollow.e.e;
import com.ss.android.ugc.aweme.newfollow.e.f;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.g;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FavoriteVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioFollowImageViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioFollowVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioForwardDeletedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioImageForwardFeedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioVideoForwardFeedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyFriendHeadViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyItemViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowFeedStatusItemViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowDeletedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolderPlanA;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolderPlanB;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolderPlanC;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolderPlanD;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderB;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderD;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolderPlanA;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolderPlanB;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolderPlanC;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolderPlanD;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardImageViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardImageViewHolderPlanA;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardImageViewHolderPlanB;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardImageViewHolderPlanC;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardImageViewHolderPlanD;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolderPlanA;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolderPlanB;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolderPlanC;
import com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolderPlanD;
import com.ss.android.ugc.aweme.newfollow.vh.MomentFollowFeedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.MomentForwardDeletedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.MomentForwardFeedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.RecommendUserViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.UpLoadItemViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.UpLoadRecoverItemViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.ab;
import com.ss.android.ugc.aweme.newfollow.vh.ac;
import com.ss.android.ugc.aweme.newfollow.vh.ad;
import com.ss.android.ugc.aweme.newfollow.vh.m;
import com.ss.android.ugc.aweme.newfollow.vh.n;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.y;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class FollowFeedAdapter extends FeedAdapter<FollowFeed> {
    public static int C = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 52.0f));

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f57068f;
    public String A;
    public boolean B;
    public boolean D = false;
    public FollowFeed E;
    public FollowFeed F;
    public FollowFeed G;
    public FollowFeed H;
    public e I;
    public FollowFeed J;
    public d K;
    public RecommendUserViewHolder L;
    public c M;
    public h<User> N;
    public RecommendAwemeViewHolder.a O;
    public boolean P = true;
    public boolean Q = false;
    private final Fragment R;
    private FollowFeed S;
    private FollowFeed T;
    private f U;
    private n V;
    private HashMap<String, Boolean> W = new HashMap<>();
    public boolean g = (!a.a());
    public com.ss.android.ugc.aweme.story.api.b.c h;
    public String z;

    public void setLoadingPadding(View view) {
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57068f, false, 61061, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57068f, false, 61061, new Class[]{String.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.mItems) && !TextUtils.isEmpty(str)) {
            int i = -1;
            for (int size = this.mItems.size() - 1; size >= 0; size--) {
                FollowFeed followFeed = (FollowFeed) this.mItems.get(size);
                if (followFeed != null) {
                    if (followFeed.getFeedType() == 65280) {
                        if (followFeed.getAweme() != null && str.equals(followFeed.getAweme().getAuthorUid())) {
                            this.mItems.remove(size);
                            notifyItemRemoved(size);
                        }
                    } else if (!(followFeed.getFeedType() != 65298 || followFeed.getRoomStruct() == null || followFeed.getRoomStruct().f47797a == null || followFeed.getRoomStruct().f47797a.owner == null || !TextUtils.equals(str, followFeed.getRoomStruct().f47797a.owner.getUid()))) {
                        this.mItems.remove(size);
                        notifyItemRemoved(size);
                    }
                    i = size;
                }
            }
            if (i != -1) {
                notifyItemRangeChanged(i, Math.max(1, (this.mItems.size() - 1) - i));
            }
        }
    }

    public final void a(FollowFeed followFeed, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{followFeed, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57068f, false, 61087, new Class[]{FollowFeed.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeed, Byte.valueOf(z2)}, this, f57068f, false, 61087, new Class[]{FollowFeed.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            if (this.mItems != null && this.mItems.contains(this.I)) {
                int indexOf = this.mItems.indexOf(this.I);
                b(indexOf);
                insertData(followFeed, indexOf);
            }
        } else if (this.mItems != null && this.mItems.contains(this.I)) {
            b(this.mItems.indexOf(this.I));
        }
        this.j.a(500);
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57068f, false, 61089, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f57068f, false, 61089, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mItems != null && this.mItems.contains(this.U)) {
            b(this.mItems.indexOf(this.U));
            if (z2) {
                com.bytedance.ies.dmt.ui.d.a.b(this.r.d(), (int) C0906R.string.j8).a();
            }
        }
        this.j.a(500);
    }

    public final void a(String str, Aweme aweme, int i) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{str, aweme2, Integer.valueOf(i)}, this, f57068f, false, 61104, new Class[]{String.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aweme2, Integer.valueOf(i)}, this, f57068f, false, 61104, new Class[]{String.class, Aweme.class, Integer.TYPE}, Void.TYPE);
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

    public final void B_() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61115, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61115, new Class[0], Void.TYPE);
            return;
        }
        super.B_();
        if (this.h != null && ViewCompat.isAttachedToWindow(this.h.g())) {
            this.h.m();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61116, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.h != null) {
            this.h.n();
        }
    }

    public FollowFeed n() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61082, new Class[0], FollowFeed.class)) {
            return (FollowFeed) PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61082, new Class[0], FollowFeed.class);
        }
        if (this.T == null) {
            this.T = new FollowFeed();
            this.T.setFeedType(65532);
        }
        return this.T;
    }

    public FollowFeed o() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61083, new Class[0], FollowFeed.class)) {
            return (FollowFeed) PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61083, new Class[0], FollowFeed.class);
        }
        if (this.G == null) {
            this.G = new FollowFeed();
            this.G.setFeedType(65531);
        }
        return this.G;
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61077, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61077, new Class[0], Void.TYPE);
            return;
        }
        if (this.g && !a.a() && !CollectionUtils.isEmpty(this.mItems) && this.mItems.get(0) != null && ((FollowFeed) this.mItems.get(0)).getFeedType() == 65283) {
            this.mItems.remove(0);
        }
    }

    private FollowFeed t() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61079, new Class[0], FollowFeed.class)) {
            return (FollowFeed) PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61079, new Class[0], FollowFeed.class);
        }
        if (this.S == null) {
            this.S = new FollowFeed();
            this.S.setFeedType(65535);
        }
        showLoadMoreEmpty();
        return this.S;
    }

    public final void M_() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61112, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61112, new Class[0], Void.TYPE);
            return;
        }
        super.M_();
        if (!CollectionUtils.isEmpty(this.k)) {
            for (BaseFollowViewHolder baseFollowViewHolder : this.k) {
                if (baseFollowViewHolder instanceof InsFollowLiveViewHolderA) {
                    baseFollowViewHolder.T();
                }
            }
        }
    }

    public final int l() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61060, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61060, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mItems == null || this.mItems.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < this.mItems.size(); i++) {
                if (((FollowFeed) this.mItems.get(i)).getFeedType() == 65283) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final FollowFeed m() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61078, new Class[0], FollowFeed.class)) {
            return (FollowFeed) PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61078, new Class[0], FollowFeed.class);
        }
        s();
        if (this.E == null) {
            this.E = new FollowFeed();
            this.E.setFeedType(65283);
        }
        return this.E;
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61091, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61091, new Class[0], Void.TYPE);
            return;
        }
        if (this.mItems != null && this.mItems.contains(this.S)) {
            b(this.mItems.indexOf(this.S));
            setShowFooter(true);
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61092, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61092, new Class[0], Void.TYPE);
            return;
        }
        if (this.mItems != null && this.mItems.contains(this.G)) {
            b(this.mItems.indexOf(this.G));
            setShowFooter(true);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61113, new Class[0], Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(this.k)) {
            for (BaseFollowViewHolder baseFollowViewHolder : this.k) {
                if (baseFollowViewHolder instanceof InsFollowLiveViewHolderA) {
                    baseFollowViewHolder.U();
                }
            }
        }
        super.e();
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f57068f, false, 61090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57068f, false, 61090, new Class[0], Void.TYPE);
            return;
        }
        if (this.mItems == null) {
            this.mItems = new ArrayList();
        }
        if (this.mItems.size() == 0) {
            if (a.a()) {
                insertData(t(), 0);
            }
            setShowFooter(false);
            return;
        }
        if (this.mItems.size() == 1 && (this.mItems.contains(this.E) || this.mItems.contains(this.I) || this.mItems.contains(this.U))) {
            if (a.a()) {
                insertData(t(), 1);
            }
            setShowFooter(false);
        }
    }

    public final List<FollowFeed> a(List<FollowFeed> list) {
        List<FollowFeed> list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f57068f, false, 61070, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f57068f, false, 61070, new Class[]{List.class}, List.class);
        }
        FollowFeed m = m();
        if (!CollectionUtils.isEmpty(list)) {
            if (this.g) {
                list.add(0, m);
            }
            list2 = list;
        } else {
            list2 = new ArrayList<>();
            if (this.g) {
                list2.add(m);
            }
            if (a.a()) {
                list2.add(t());
            }
            setShowFooter(false);
        }
        b(list2);
        return list2;
    }

    public void b(List<FollowFeed> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57068f, false, 61076, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57068f, false, 61076, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.U != null && this.mItems.contains(this.U)) {
            if (this.g) {
                list.add(1, this.U);
            } else {
                list.add(0, this.U);
            }
        }
        if (this.I != null && this.mItems.contains(this.I)) {
            if (this.g) {
                list.add(1, this.I);
                return;
            }
            list.add(0, this.I);
        }
    }

    public final FavoriteVideoViewHolder e(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, this, f57068f, false, 61110, new Class[]{ViewGroup.class}, FavoriteVideoViewHolder.class)) {
            return new FollowFavoriteVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.u4, viewGroup2, false));
        }
        return (FavoriteVideoViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f57068f, false, 61110, new Class[]{ViewGroup.class}, FavoriteVideoViewHolder.class);
    }

    public int getLoadMoreHeight(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, f57068f, false, 61117, new Class[]{View.class}, Integer.TYPE)) {
            return view.getResources().getDimensionPixelSize(C0906R.dimen.di);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f57068f, false, 61117, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    public void setData(List<FollowFeed> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57068f, false, 61094, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57068f, false, 61094, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (a.c()) {
            this.g = true;
        }
        super.setData(list);
    }

    public final BaseFollowViewHolder a(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f57068f, false, 61108, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class)) {
            return (BaseFollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f57068f, false, 61108, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class);
        }
        int aB = AbTestManager.a().aB();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false);
        switch (aB) {
            case 1:
            case 8:
                FixRatioFollowVideoViewHolder fixRatioFollowVideoViewHolder = new FixRatioFollowVideoViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.o, this.q);
                fixRatioFollowVideoViewHolder.V = this;
                return fixRatioFollowVideoViewHolder;
            case 2:
                return new MomentFollowFeedViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.o);
            case 3:
            case 9:
                InsFollowVideoViewHolder insFollowVideoViewHolder = new InsFollowVideoViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.o, this.q);
                return insFollowVideoViewHolder;
            case 4:
                InsFollowVideoViewHolderPlanA insFollowVideoViewHolderPlanA = new InsFollowVideoViewHolderPlanA((FollowFeedLayout) inflate, this.r, this.j, this.o, this.q);
                return insFollowVideoViewHolderPlanA;
            case 5:
                InsFollowVideoViewHolderPlanB insFollowVideoViewHolderPlanB = new InsFollowVideoViewHolderPlanB((FollowFeedLayout) inflate, this.r, this.j, this.o, this.q);
                return insFollowVideoViewHolderPlanB;
            case 6:
                InsFollowVideoViewHolderPlanC insFollowVideoViewHolderPlanC = new InsFollowVideoViewHolderPlanC((FollowFeedLayout) inflate, this.r, this.j, this.o, this.q);
                return insFollowVideoViewHolderPlanC;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                InsFollowVideoViewHolderPlanD insFollowVideoViewHolderPlanD = new InsFollowVideoViewHolderPlanD((FollowFeedLayout) inflate, this.r, this.j, this.o, this.q);
                return insFollowVideoViewHolderPlanD;
            default:
                FollowFlowItemVideoViewHolder followFlowItemVideoViewHolder = new FollowFlowItemVideoViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.o, this.q);
                followFlowItemVideoViewHolder.V = this;
                return followFlowItemVideoViewHolder;
        }
    }

    public final BaseFollowViewHolder b(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f57068f, false, 61105, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class)) {
            return (BaseFollowViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f57068f, false, 61105, new Class[]{ViewGroup.class}, BaseFollowViewHolder.class);
        }
        int aB = AbTestManager.a().aB();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup, false);
        switch (aB) {
            case 1:
            case 8:
                return new FixRatioFollowImageViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.o);
            case 2:
                return new MomentFollowFeedViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.o);
            case 3:
            case 9:
                return new InsFollowImageViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.o);
            case 4:
                return new InsFollowImageViewHolderPlanA((FollowFeedLayout) inflate, this.r, this.j, this.o);
            case 5:
                return new InsFollowImageViewHolderPlanB((FollowFeedLayout) inflate, this.r, this.j, this.o);
            case 6:
                return new InsFollowImageViewHolderPlanC((FollowFeedLayout) inflate, this.r, this.j, this.o);
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                return new InsFollowImageViewHolderPlanD((FollowFeedLayout) inflate, this.r, this.j, this.o);
            default:
                return new FollowFlowItemImageViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.o);
        }
    }

    @NonNull
    public final RecyclerView.ViewHolder f(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f57068f, false, 61065, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f57068f, false, 61065, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
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
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
            case 9:
                InsFollowDeletedViewHolder insFollowDeletedViewHolder = new InsFollowDeletedViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return insFollowDeletedViewHolder;
            default:
                ForwardTextViewHolder forwardTextViewHolder = new ForwardTextViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return forwardTextViewHolder;
        }
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57068f, false, 61093, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57068f, false, 61093, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int basicItemViewType = super.getBasicItemViewType(i);
        if (basicItemViewType != -1) {
            return basicItemViewType;
        }
        FollowFeed followFeed = (FollowFeed) this.mItems.get(i);
        if (followFeed.getFeedType() == 65281) {
            return 33;
        }
        if (followFeed.getFeedType() == 65283) {
            return 32;
        }
        if (followFeed.getFeedType() == 65297) {
            return 37;
        }
        if (followFeed.getFeedType() == 65298) {
            return 36;
        }
        if (followFeed.getFeedType() == 65282) {
            return 34;
        }
        if (followFeed.getFeedType() == 65535) {
            return 38;
        }
        if (followFeed.getFeedType() == 65288) {
            return 39;
        }
        if (followFeed.getFeedType() == 65284) {
            return SearchJediMixFeedAdapter.f42517f;
        }
        if (followFeed.getFeedType() == 65534) {
            return 40;
        }
        if (followFeed.getFeedType() == 65533) {
            return 41;
        }
        if (followFeed.getFeedType() == 65532) {
            return 48;
        }
        if (followFeed.getFeedType() == 65531) {
            return 49;
        }
        if (followFeed.getFeedType() == 65289) {
            return 50;
        }
        if (followFeed.getFeedType() == 65530) {
            return 51;
        }
        return -1;
    }

    public final BaseForwardViewHolder c(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f57068f, false, 61107, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class)) {
            return (BaseForwardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f57068f, false, 61107, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class);
        }
        int aB = AbTestManager.a().aB();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false);
        switch (aB) {
            case 1:
            case 8:
                FixRatioImageForwardFeedViewHolder fixRatioImageForwardFeedViewHolder = new FixRatioImageForwardFeedViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return fixRatioImageForwardFeedViewHolder;
            case 2:
                MomentForwardFeedViewHolder momentForwardFeedViewHolder = new MomentForwardFeedViewHolder((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                return momentForwardFeedViewHolder;
            case 3:
            case 9:
                InsForwardImageViewHolder insForwardImageViewHolder = new InsForwardImageViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return insForwardImageViewHolder;
            case 4:
                InsForwardImageViewHolderPlanA insForwardImageViewHolderPlanA = new InsForwardImageViewHolderPlanA((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return insForwardImageViewHolderPlanA;
            case 5:
                InsForwardImageViewHolderPlanB insForwardImageViewHolderPlanB = new InsForwardImageViewHolderPlanB((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return insForwardImageViewHolderPlanB;
            case 6:
                InsForwardImageViewHolderPlanC insForwardImageViewHolderPlanC = new InsForwardImageViewHolderPlanC((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return insForwardImageViewHolderPlanC;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                InsForwardImageViewHolderPlanD insForwardImageViewHolderPlanD = new InsForwardImageViewHolderPlanD((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o);
                return insForwardImageViewHolderPlanD;
            default:
                FollowFlowItemImageForwardViewHolder followFlowItemImageForwardViewHolder = new FollowFlowItemImageForwardViewHolder((FollowFeedLayout) inflate, this.r, this.j, this.m, this.o, false);
                return followFlowItemImageForwardViewHolder;
        }
    }

    public final BaseForwardViewHolder d(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f57068f, false, 61109, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class)) {
            return (BaseForwardViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f57068f, false, 61109, new Class[]{ViewGroup.class}, BaseForwardViewHolder.class);
        }
        int aB = AbTestManager.a().aB();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false);
        switch (aB) {
            case 1:
            case 8:
                FixRatioVideoForwardFeedViewHolder fixRatioVideoForwardFeedViewHolder = new FixRatioVideoForwardFeedViewHolder((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                fixRatioVideoForwardFeedViewHolder.a((FollowVideoViewHolder.a) this);
                return fixRatioVideoForwardFeedViewHolder;
            case 2:
                MomentForwardFeedViewHolder momentForwardFeedViewHolder = new MomentForwardFeedViewHolder((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                return momentForwardFeedViewHolder;
            case 3:
            case 9:
                InsForwardVideoViewHolder insForwardVideoViewHolder = new InsForwardVideoViewHolder((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                insForwardVideoViewHolder.a((FollowVideoViewHolder.a) this);
                return insForwardVideoViewHolder;
            case 4:
                InsForwardVideoViewHolderPlanA insForwardVideoViewHolderPlanA = new InsForwardVideoViewHolderPlanA((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                insForwardVideoViewHolderPlanA.a((FollowVideoViewHolder.a) this);
                return insForwardVideoViewHolderPlanA;
            case 5:
                InsForwardVideoViewHolderPlanB insForwardVideoViewHolderPlanB = new InsForwardVideoViewHolderPlanB((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                insForwardVideoViewHolderPlanB.a((FollowVideoViewHolder.a) this);
                return insForwardVideoViewHolderPlanB;
            case 6:
                InsForwardVideoViewHolderPlanC insForwardVideoViewHolderPlanC = new InsForwardVideoViewHolderPlanC((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                insForwardVideoViewHolderPlanC.a((FollowVideoViewHolder.a) this);
                return insForwardVideoViewHolderPlanC;
            case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                InsForwardVideoViewHolderPlanD insForwardVideoViewHolderPlanD = new InsForwardVideoViewHolderPlanD((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                insForwardVideoViewHolderPlanD.a((FollowVideoViewHolder.a) this);
                return insForwardVideoViewHolderPlanD;
            default:
                FollowFlowItemVideoForwardViewHolder followFlowItemVideoForwardViewHolder = new FollowFlowItemVideoForwardViewHolder((FollowFeedLayout) inflate, this.r, this.q, this.j, this.m, this.o);
                followFlowItemVideoForwardViewHolder.a((FollowVideoViewHolder.a) this);
                return followFlowItemVideoForwardViewHolder;
        }
    }

    public final void a(int i, Bitmap bitmap) {
        int i2 = i;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bitmap2}, this, f57068f, false, 61085, new Class[]{Integer.TYPE, Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bitmap2}, this, f57068f, false, 61085, new Class[]{Integer.TYPE, Bitmap.class}, Void.TYPE);
            return;
        }
        if (this.mItems == null || !this.mItems.contains(this.I)) {
            this.I = new e();
            this.I.setFeedType(65282);
            if (!a.a() || (this.g && this.mItems != null && this.mItems.size() > 0)) {
                insertData(this.I, 1);
            } else {
                insertData(this.I, 0);
            }
            if (this.s != null) {
                this.s.scrollToPosition(0);
            }
            this.j.a(500);
        }
        e eVar = this.I;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, eVar, e.f57109a, false, 61205, new Class[]{Integer.TYPE}, Void.TYPE)) {
            e eVar2 = eVar;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, eVar2, e.f57109a, false, 61205, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            eVar.f57110b = i2;
            if (eVar.f57112d != null) {
                UpLoadItemViewHolder upLoadItemViewHolder = eVar.f57112d;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, upLoadItemViewHolder, UpLoadItemViewHolder.f57680a, false, 62664, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    UpLoadItemViewHolder upLoadItemViewHolder2 = upLoadItemViewHolder;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, upLoadItemViewHolder2, UpLoadItemViewHolder.f57680a, false, 62664, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    upLoadItemViewHolder.mProgressBar.post(new Runnable(i2) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f57681a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ int f57682b;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f57681a, false, 62665, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f57681a, false, 62665, new Class[0], Void.TYPE);
                                return;
                            }
                            UpLoadItemViewHolder.this.mProgressBar.setProgress(this.f57682b);
                            UpLoadItemViewHolder.this.mProgressBar.setMax(100);
                            UpLoadItemViewHolder.this.mProgressBar.invalidate();
                        }

                        {
                            this.f57682b = r2;
                        }
                    });
                }
            }
        }
        this.I.a(bitmap2);
    }

    public final void a(com.ss.android.ugc.aweme.draft.a.c cVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{cVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f57068f, false, 61088, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, Byte.valueOf(z2)}, this, f57068f, false, 61088, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mItems == null || !this.mItems.contains(this.U)) {
            this.U = new f();
            if (!this.g || this.mItems == null || this.mItems.size() <= 0) {
                insertData(this.U, 0);
            } else {
                insertData(this.U, 1);
            }
            if (this.s != null) {
                this.s.scrollToPosition(0);
            }
            this.j.a(500);
        }
        this.U.f57113a = cVar;
        this.U.f57114b = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c3, code lost:
        if (r0 != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.feed.model.Aweme r14, java.lang.String r15) {
        /*
            r13 = this;
            r7 = r13
            r8 = r15
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r14
            r11 = 1
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 61111(0xeeb7, float:8.5635E-41)
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0041
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r14
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61111(0xeeb7, float:8.5635E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0041:
            if (r14 == 0) goto L_0x00e9
            java.lang.String r0 = r7.u
            boolean r0 = android.text.TextUtils.equals(r15, r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x00e9
        L_0x004d:
            android.support.v7.widget.RecyclerView r0 = r7.s
            android.support.v7.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r8 = r0
            android.support.v7.widget.LinearLayoutManager r8 = (android.support.v7.widget.LinearLayoutManager) r8
            java.util.List r0 = r7.mItems
            java.util.Iterator r9 = r0.iterator()
        L_0x005c:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r9.next()
            r12 = r0
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r12 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r12
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.getAweme()
            if (r0 == 0) goto L_0x00c7
            int r0 = r12.getFeedType()
            r1 = 65280(0xff00, float:9.1477E-41)
            if (r0 == r1) goto L_0x00c5
            int r0 = r12.getFeedType()
            r1 = 65298(0xff12, float:9.1502E-41)
            if (r0 != r1) goto L_0x00c7
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61118(0xeebe, float:8.5645E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r13
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61118(0xeebe, float:8.5645E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00c3
        L_0x00ac:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.aD()
            if (r0 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.bL()
            if (r0 == 0) goto L_0x00c2
            r0 = 1
            goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            if (r0 == 0) goto L_0x00c7
        L_0x00c5:
            r0 = 1
            goto L_0x00c8
        L_0x00c7:
            r0 = 0
        L_0x00c8:
            if (r0 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r12.getAweme()
            java.lang.String r0 = r0.getAid()
            java.lang.String r1 = r14.getAid()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x005c
            java.util.List r0 = r7.mItems
            int r0 = r0.indexOf(r12)
            int r1 = C
            r8.scrollToPositionWithOffset(r0, r1)
            return
        L_0x00e8:
            return
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter.a(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        CharSequence charSequence;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f57068f, false, 61063, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f57068f, false, 61063, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (getBasicItemViewType(i2)) {
            case 32:
                if (a.a()) {
                    HeaderViewHolder headerViewHolder = (HeaderViewHolder) viewHolder2;
                    headerViewHolder.a(viewHolder2.itemView.getContext(), false);
                    int color = viewHolder2.itemView.getContext().getResources().getColor(C0906R.color.a17);
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(color)}, headerViewHolder, HeaderViewHolder.f3261a, false, 44706, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        HeaderViewHolder headerViewHolder2 = headerViewHolder;
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(color)}, headerViewHolder2, HeaderViewHolder.f3261a, false, 44706, new Class[]{Integer.TYPE}, Void.TYPE);
                        break;
                    } else {
                        if (headerViewHolder.f3262b.getAndroidView() != null) {
                            headerViewHolder.f3262b.getAndroidView().setBackgroundColor(color);
                        }
                        return;
                    }
                }
                break;
            case 33:
                this.J = (FollowFeed) this.mItems.get(i2);
                RecommendUserViewHolder recommendUserViewHolder = (RecommendUserViewHolder) viewHolder2;
                recommendUserViewHolder.a(this.J.getUser(), this.J.getRequestId());
                recommendUserViewHolder.f57671c = this.z;
                return;
            case 34:
                UpLoadItemViewHolder upLoadItemViewHolder = (UpLoadItemViewHolder) viewHolder2;
                FollowFeed followFeed = (FollowFeed) this.mItems.get(i2);
                if (PatchProxy.isSupport(new Object[]{followFeed}, upLoadItemViewHolder, UpLoadItemViewHolder.f57680a, false, 62662, new Class[]{FollowFeed.class}, Void.TYPE)) {
                    UpLoadItemViewHolder upLoadItemViewHolder2 = upLoadItemViewHolder;
                    PatchProxy.accessDispatch(new Object[]{followFeed}, upLoadItemViewHolder2, UpLoadItemViewHolder.f57680a, false, 62662, new Class[]{FollowFeed.class}, Void.TYPE);
                    break;
                } else {
                    if (followFeed instanceof e) {
                        e eVar = (e) followFeed;
                        upLoadItemViewHolder.mProgressBar.setProgress(eVar.f57110b);
                        upLoadItemViewHolder.mProgressBar.setMax(100);
                        upLoadItemViewHolder.mProgressBar.invalidate();
                        Bitmap bitmap = eVar.f57111c;
                        if (bitmap != null) {
                            upLoadItemViewHolder.mCoverImage.setImageDrawable(new com.ss.android.ugc.aweme.newfollow.ui.a(bitmap));
                        }
                        eVar.f57112d = upLoadItemViewHolder;
                    }
                    return;
                }
            case 36:
                FollowFeed followFeed2 = (FollowFeed) this.mItems.get(i2);
                if (followFeed2 != null) {
                    com.ss.android.ugc.aweme.follow.presenter.h roomStruct = followFeed2.getRoomStruct();
                    String requestId = followFeed2.getRequestId();
                    if (!PatchProxy.isSupport(new Object[]{viewHolder2, roomStruct, requestId}, this, f57068f, false, 61062, new Class[]{RecyclerView.ViewHolder.class, com.ss.android.ugc.aweme.follow.presenter.h.class, String.class}, Void.TYPE)) {
                        if (roomStruct != null) {
                            roomStruct.f47797a.setRequestId(requestId);
                            switch (AbTestManager.a().aC()) {
                                case 2:
                                case 3:
                                    ((InsFollowLiveViewHolderA) viewHolder2).a(roomStruct.f47797a, this.m);
                                    break;
                                case 4:
                                    ((InsFollowLiveViewHolderB) viewHolder2).a(roomStruct.f47797a, this.m);
                                    break;
                                case 5:
                                    ((InsFollowLiveViewHolderD) viewHolder2).a(roomStruct.f47797a, this.m);
                                    break;
                                default:
                                    ((InsFollowLiveViewHolderA) viewHolder2).a(roomStruct.f47797a, this.m);
                                    break;
                            }
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[]{viewHolder2, roomStruct, requestId}, this, f57068f, false, 61062, new Class[]{RecyclerView.ViewHolder.class, com.ss.android.ugc.aweme.follow.presenter.h.class, String.class}, Void.TYPE);
                    }
                }
                ((BaseFollowViewHolder) viewHolder2).r = this.u;
                return;
            case 37:
                FollowFeedLastWatchItemViewHolder followFeedLastWatchItemViewHolder = (FollowFeedLastWatchItemViewHolder) viewHolder2;
                FollowFeed followFeed3 = (FollowFeed) this.mItems.get(i2);
                if (PatchProxy.isSupport(new Object[]{followFeed3}, followFeedLastWatchItemViewHolder, FollowFeedLastWatchItemViewHolder.f57566a, false, 62223, new Class[]{FollowFeed.class}, Void.TYPE)) {
                    FollowFeedLastWatchItemViewHolder followFeedLastWatchItemViewHolder2 = followFeedLastWatchItemViewHolder;
                    PatchProxy.accessDispatch(new Object[]{followFeed3}, followFeedLastWatchItemViewHolder2, FollowFeedLastWatchItemViewHolder.f57566a, false, 62223, new Class[]{FollowFeed.class}, Void.TYPE);
                    break;
                } else {
                    DmtTextView dmtTextView = followFeedLastWatchItemViewHolder.f57568b;
                    if (followFeed3 != null) {
                        com.ss.android.ugc.aweme.follow.c lastViewData = followFeed3.getLastViewData();
                        if (lastViewData != null) {
                            String str = lastViewData.f47755c;
                            if (str != null) {
                                charSequence = str;
                                dmtTextView.setText(charSequence);
                                return;
                            }
                        }
                    }
                    View view = followFeedLastWatchItemViewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    charSequence = view.getContext().getString(C0906R.string.b50);
                    dmtTextView.setText(charSequence);
                    return;
                }
            case 38:
                FollowFeedEmptyItemViewHolder followFeedEmptyItemViewHolder = (FollowFeedEmptyItemViewHolder) viewHolder2;
                d dVar = this.K;
                if (PatchProxy.isSupport(new Object[]{dVar}, followFeedEmptyItemViewHolder, FollowFeedEmptyItemViewHolder.f57551a, false, 62208, new Class[]{d.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dVar}, followFeedEmptyItemViewHolder, FollowFeedEmptyItemViewHolder.f57551a, false, 62208, new Class[]{d.class}, Void.TYPE);
                    break;
                } else {
                    followFeedEmptyItemViewHolder.f57556f = dVar;
                    if (PatchProxy.isSupport(new Object[0], followFeedEmptyItemViewHolder, FollowFeedEmptyItemViewHolder.f57551a, false, 62209, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], followFeedEmptyItemViewHolder, FollowFeedEmptyItemViewHolder.f57551a, false, 62209, new Class[0], Void.TYPE);
                    } else if (((Boolean) SharePrefCache.inst().getIsContactsUploaded().c()).booleanValue()) {
                        followFeedEmptyItemViewHolder.i = false;
                        if (PatchProxy.isSupport(new Object[0], followFeedEmptyItemViewHolder, FollowFeedEmptyItemViewHolder.f57551a, false, 62210, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], followFeedEmptyItemViewHolder, FollowFeedEmptyItemViewHolder.f57551a, false, 62210, new Class[0], Void.TYPE);
                        } else {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) followFeedEmptyItemViewHolder.f57553c.getLayoutParams();
                            layoutParams.height = b.a(followFeedEmptyItemViewHolder.f57552b, 360.0f);
                            followFeedEmptyItemViewHolder.f57553c.setLayoutParams(layoutParams);
                            followFeedEmptyItemViewHolder.f57553c.setStatus(new c.a(followFeedEmptyItemViewHolder.f57552b).a(2130840139).b((int) C0906R.string.agd).b("").f20493a);
                        }
                    } else {
                        followFeedEmptyItemViewHolder.i = true;
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) followFeedEmptyItemViewHolder.f57553c.getLayoutParams();
                        layoutParams2.height = b.a(followFeedEmptyItemViewHolder.f57552b, 460.0f);
                        followFeedEmptyItemViewHolder.f57553c.setLayoutParams(layoutParams2);
                        followFeedEmptyItemViewHolder.f57553c.setStatus(new c.a(followFeedEmptyItemViewHolder.f57552b).a(2130840139).b((int) C0906R.string.agd).c(C0906R.string.ag6).a(com.bytedance.ies.dmt.ui.widget.a.SOLID, C0906R.string.a1l, new m(followFeedEmptyItemViewHolder)).f20493a);
                    }
                    if (!followFeedEmptyItemViewHolder.i) {
                        if (!PatchProxy.isSupport(new Object[0], followFeedEmptyItemViewHolder, FollowFeedEmptyItemViewHolder.f57551a, false, 62211, new Class[0], Void.TYPE)) {
                            if (AbTestManager.a().R()) {
                                if (followFeedEmptyItemViewHolder.f57555e == null) {
                                    followFeedEmptyItemViewHolder.f57555e = new y(new RecommendCommonUserModel(), followFeedEmptyItemViewHolder);
                                }
                                followFeedEmptyItemViewHolder.f57555e.a(30, com.ss.android.ugc.aweme.account.d.a().getCurUserId(), 2, com.ss.android.ugc.aweme.utils.permission.e.a(), (String) null, com.ss.android.ugc.aweme.utils.permission.e.b());
                                an.a("api_recommend_user", "follow_feed_empty_item_view_holder", "refresh");
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[0], followFeedEmptyItemViewHolder, FollowFeedEmptyItemViewHolder.f57551a, false, 62211, new Class[0], Void.TYPE);
                        }
                    } else {
                        followFeedEmptyItemViewHolder.f57554d.setVisibility(8);
                    }
                    return;
                }
            case 41:
                FollowFeedStatusItemViewHolder followFeedStatusItemViewHolder = (FollowFeedStatusItemViewHolder) viewHolder2;
                com.ss.android.ugc.aweme.newfollow.b.c cVar = this.M;
                if (PatchProxy.isSupport(new Object[]{cVar}, followFeedStatusItemViewHolder, FollowFeedStatusItemViewHolder.f57571a, false, 62226, new Class[]{com.ss.android.ugc.aweme.newfollow.b.c.class}, Void.TYPE)) {
                    Object[] objArr = {cVar};
                    Object[] objArr2 = objArr;
                    FollowFeedStatusItemViewHolder followFeedStatusItemViewHolder2 = followFeedStatusItemViewHolder;
                    PatchProxy.accessDispatch(objArr2, followFeedStatusItemViewHolder2, FollowFeedStatusItemViewHolder.f57571a, false, 62226, new Class[]{com.ss.android.ugc.aweme.newfollow.b.c.class}, Void.TYPE);
                    break;
                } else {
                    Intrinsics.checkParameterIsNotNull(cVar, "listener");
                    followFeedStatusItemViewHolder.f57572b = cVar;
                    return;
                }
            case 48:
                FollowFeedEmptyFriendHeadViewHolder followFeedEmptyFriendHeadViewHolder = (FollowFeedEmptyFriendHeadViewHolder) viewHolder2;
                boolean z3 = this.Q;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z3 ? (byte) 1 : 0)}, followFeedEmptyFriendHeadViewHolder, FollowFeedEmptyFriendHeadViewHolder.f57541a, false, 62204, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    Object[] objArr3 = {Byte.valueOf(z3)};
                    Object[] objArr4 = objArr3;
                    FollowFeedEmptyFriendHeadViewHolder followFeedEmptyFriendHeadViewHolder2 = followFeedEmptyFriendHeadViewHolder;
                    PatchProxy.accessDispatch(objArr4, followFeedEmptyFriendHeadViewHolder2, FollowFeedEmptyFriendHeadViewHolder.f57541a, false, 62204, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else if (z3) {
                    if (PatchProxy.isSupport(new Object[0], followFeedEmptyFriendHeadViewHolder, FollowFeedEmptyFriendHeadViewHolder.f57541a, false, 62205, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], followFeedEmptyFriendHeadViewHolder, FollowFeedEmptyFriendHeadViewHolder.f57541a, false, 62205, new Class[0], Void.TYPE);
                    } else {
                        SharePrefCache inst = SharePrefCache.inst();
                        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
                        com.ss.android.ugc.aweme.app.an<Boolean> isContactsUploaded = inst.getIsContactsUploaded();
                        Intrinsics.checkExpressionValueIsNotNull(isContactsUploaded, "SharePrefCache.inst().isContactsUploaded");
                        Object c2 = isContactsUploaded.c();
                        Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().isContactsUploaded.cache");
                        if (((Boolean) c2).booleanValue()) {
                            followFeedEmptyFriendHeadViewHolder.f57546f.P = false;
                            followFeedEmptyFriendHeadViewHolder.f57545e.r();
                            followFeedEmptyFriendHeadViewHolder.f57542b.a(false);
                            followFeedEmptyFriendHeadViewHolder.f57542b.b(false);
                        } else {
                            followFeedEmptyFriendHeadViewHolder.f57546f.P = true;
                            followFeedEmptyFriendHeadViewHolder.f57542b.a(true);
                            followFeedEmptyFriendHeadViewHolder.f57542b.setAddContactsFriendsClickListener(new FollowFeedEmptyFriendHeadViewHolder.a(followFeedEmptyFriendHeadViewHolder));
                        }
                    }
                }
                this.Q = false;
                return;
            case 50:
                if (viewHolder2 instanceof RecommendFriendItemViewV2Holder) {
                    RecommendFriendItemViewV2Holder recommendFriendItemViewV2Holder = (RecommendFriendItemViewV2Holder) viewHolder2;
                    FollowFeed followFeed4 = (FollowFeed) this.mItems.get(i2);
                    if (PatchProxy.isSupport(new Object[]{followFeed4, 0, (byte) 0, 2}, recommendFriendItemViewV2Holder, RecommendFriendItemViewV2Holder.f49331a, false, 47421, new Class[]{FollowFeed.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
                        RecommendFriendItemViewV2Holder recommendFriendItemViewV2Holder2 = recommendFriendItemViewV2Holder;
                        PatchProxy.accessDispatch(new Object[]{followFeed4, 0, (byte) 0, 2}, recommendFriendItemViewV2Holder2, RecommendFriendItemViewV2Holder.f49331a, false, 47421, new Class[]{FollowFeed.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
                        break;
                    } else {
                        recommendFriendItemViewV2Holder.a(followFeed4.getRecommendUser(), 0, false, 2);
                        return;
                    }
                }
                break;
            case 51:
                if (viewHolder2 instanceof RecommendFriendsTitleHolder) {
                    ((RecommendFriendsTitleHolder) viewHolder2).a(false, 2, 0, false, this.z);
                    return;
                }
                break;
            case SearchJediMixFeedAdapter.f42517f:
                UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder = (UpLoadRecoverItemViewHolder) viewHolder2;
                FollowFeed followFeed5 = (FollowFeed) this.mItems.get(i2);
                if (PatchProxy.isSupport(new Object[]{followFeed5}, upLoadRecoverItemViewHolder, UpLoadRecoverItemViewHolder.f57686a, false, 62667, new Class[]{FollowFeed.class}, Void.TYPE)) {
                    UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder2 = upLoadRecoverItemViewHolder;
                    PatchProxy.accessDispatch(new Object[]{followFeed5}, upLoadRecoverItemViewHolder2, UpLoadRecoverItemViewHolder.f57686a, false, 62667, new Class[]{FollowFeed.class}, Void.TYPE);
                    break;
                } else {
                    if (followFeed5 instanceof f) {
                        f fVar = (f) followFeed5;
                        upLoadRecoverItemViewHolder.mProgressBar.setVisibility(8);
                        upLoadRecoverItemViewHolder.mTextView.setText(upLoadRecoverItemViewHolder.f57687b.getString(C0906R.string.j6));
                        if (PatchProxy.isSupport(new Object[]{fVar}, upLoadRecoverItemViewHolder, UpLoadRecoverItemViewHolder.f57686a, false, 62670, new Class[]{f.class}, Void.TYPE)) {
                            UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder3 = upLoadRecoverItemViewHolder;
                            PatchProxy.accessDispatch(new Object[]{fVar}, upLoadRecoverItemViewHolder3, UpLoadRecoverItemViewHolder.f57686a, false, 62670, new Class[]{f.class}, Void.TYPE);
                        } else {
                            if (fVar.f57113a.L == 2) {
                                if (fVar.f57113a.f43436d != null) {
                                    fVar.f57113a.f43436d.getPhotoMovieCover(new ad(upLoadRecoverItemViewHolder));
                                }
                            }
                            if (fVar.f57113a.I()) {
                                String J2 = fVar.f57113a.J();
                                if (com.ss.android.ugc.aweme.video.b.b(J2)) {
                                    com.ss.android.ugc.aweme.base.c.a(upLoadRecoverItemViewHolder.mCoverImage, Uri.fromFile(new File(J2)).toString());
                                }
                            } else {
                                ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoCover(fVar.f57113a.f(), (int) (fVar.f57113a.N * 1000.0f), new OnGetVideoCoverCallback() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f57688a;

                                    public final void onGetVideoCoverFailed(int i) {
                                    }

                                    public final void onGetVideoCoverSuccess(@NonNull Bitmap bitmap) {
                                        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f57688a, false, 62680, new Class[]{Bitmap.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f57688a, false, 62680, new Class[]{Bitmap.class}, Void.TYPE);
                                            return;
                                        }
                                        if (UpLoadRecoverItemViewHolder.this.mCoverImage != null) {
                                            UpLoadRecoverItemViewHolder.this.mCoverImage.setImageDrawable(new com.ss.android.ugc.aweme.newfollow.ui.a(bitmap));
                                        }
                                    }
                                });
                            }
                        }
                        upLoadRecoverItemViewHolder.mIvClose.setVisibility(0);
                        upLoadRecoverItemViewHolder.mIvClose.setOnClickListener(new ab(fVar));
                        upLoadRecoverItemViewHolder.mIvRefresh.setVisibility(0);
                        upLoadRecoverItemViewHolder.mIvRefresh.setOnClickListener(new ac(upLoadRecoverItemViewHolder, fVar));
                    }
                    return;
                }
            default:
                if (this.mItems.get(i2) != null) {
                    FollowFeed followFeed6 = (FollowFeed) this.mItems.get(i2);
                    if (AbTestManager.a().aB() > 0) {
                        z2 = true;
                    }
                    followFeed6.mIsMomentStyle = z2;
                }
                super.onBindBasicViewHolder(viewHolder, i);
                break;
        }
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [android.support.v7.widget.RecyclerView$ViewHolder] */
    /* JADX WARNING: type inference failed for: r18v7, types: [com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA] */
    /* JADX WARNING: type inference failed for: r16v5, types: [com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderB] */
    /* JADX WARNING: type inference failed for: r13v7, types: [com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderD] */
    /* JADX WARNING: type inference failed for: r13v8, types: [com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v7.widget.RecyclerView.ViewHolder onCreateBasicViewHolder(android.view.ViewGroup r25, int r26) {
        /*
            r24 = this;
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r12 = 1
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r6 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r3 = 0
            r4 = 61064(0xee88, float:8.5569E-41)
            r1 = r24
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0052
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61064(0xee88, float:8.5569E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<android.support.v7.widget.RecyclerView$ViewHolder> r6 = android.support.v7.widget.RecyclerView.ViewHolder.class
            r1 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.support.v7.widget.RecyclerView$ViewHolder r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0
            return r0
        L_0x0052:
            r0 = 128(0x80, float:1.794E-43)
            r1 = 2131690270(0x7f0f031e, float:1.9009579E38)
            if (r9 == r0) goto L_0x03cb
            switch(r9) {
                case 32: goto L_0x0338;
                case 33: goto L_0x02fd;
                case 34: goto L_0x02eb;
                default: goto L_0x005c;
            }
        L_0x005c:
            r0 = 2131689966(0x7f0f01ee, float:1.9008962E38)
            switch(r9) {
                case 36: goto L_0x01f2;
                case 37: goto L_0x0199;
                case 38: goto L_0x016f;
                case 39: goto L_0x015a;
                case 40: goto L_0x013f;
                case 41: goto L_0x0124;
                default: goto L_0x0062;
            }
        L_0x0062:
            switch(r9) {
                case 48: goto L_0x00fd;
                case 49: goto L_0x00e2;
                case 50: goto L_0x007f;
                case 51: goto L_0x006a;
                default: goto L_0x0065;
            }
        L_0x0065:
            android.support.v7.widget.RecyclerView$ViewHolder r0 = super.onCreateBasicViewHolder(r25, r26)
            return r0
        L_0x006a:
            android.content.Context r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690287(0x7f0f032f, float:1.9009613E38)
            android.view.View r0 = r0.inflate(r1, r8, r11)
            com.ss.android.ugc.aweme.friends.ui.RecommendFriendsTitleHolder r1 = new com.ss.android.ugc.aweme.friends.ui.RecommendFriendsTitleHolder
            r1.<init>(r0)
            return r1
        L_0x007f:
            com.ss.android.ugc.aweme.friends.ui.ak r9 = new com.ss.android.ugc.aweme.friends.ui.ak
            android.content.Context r0 = r25.getContext()
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = r7.W
            r9.<init>((android.content.Context) r0, (java.util.HashMap<java.lang.String, java.lang.Boolean>) r1, (boolean) r12)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61114(0xeeba, float:8.5639E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r24
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61114(0xeeba, float:8.5639E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00cf
        L_0x00b3:
            java.lang.String r0 = r7.z
            java.lang.String r1 = "extra_follow_type_friend"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "homepage_friends"
            goto L_0x00cf
        L_0x00c0:
            java.lang.String r0 = r7.z
            java.lang.String r1 = "extra_follow_type_follow"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "homepage_follow"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r0 = ""
        L_0x00cf:
            r9.setEnterFrom(r0)
            com.ss.android.ugc.aweme.base.activity.h<com.ss.android.ugc.aweme.profile.model.User> r0 = r7.N
            r9.setListener(r0)
            com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder$a r0 = r7.O
            r9.setRecommendAwemeClickListener(r0)
            com.ss.android.ugc.aweme.friends.ui.RecommendFriendItemViewV2Holder r0 = new com.ss.android.ugc.aweme.friends.ui.RecommendFriendItemViewV2Holder
            r0.<init>(r9)
            return r0
        L_0x00e2:
            android.content.Context r1 = r25.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            android.view.View r0 = r1.inflate(r0, r8, r11)
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedStatusItemViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.FollowFeedStatusItemViewHolder
            com.ss.android.ugc.aweme.forward.a.a r2 = r7.r
            android.content.Context r2 = r2.d()
            r3 = 65531(0xfffb, float:9.1828E-41)
            r1.<init>(r0, r2, r3)
            return r1
        L_0x00fd:
            android.content.Context r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131689963(0x7f0f01eb, float:1.9008956E38)
            android.view.View r1 = r0.inflate(r1, r8, r11)
            r7.D = r12
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyFriendHeadViewHolder r6 = new com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyFriendHeadViewHolder
            com.ss.android.ugc.aweme.forward.a.a r0 = r7.r
            android.content.Context r0 = r0.d()
            r2 = r0
            android.support.v4.app.FragmentActivity r2 = (android.support.v4.app.FragmentActivity) r2
            java.lang.String r3 = r7.z
            com.ss.android.ugc.aweme.newfollow.vh.n r4 = r7.V
            r0 = r6
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x0124:
            android.content.Context r1 = r25.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            android.view.View r0 = r1.inflate(r0, r8, r11)
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedStatusItemViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.FollowFeedStatusItemViewHolder
            com.ss.android.ugc.aweme.forward.a.a r2 = r7.r
            android.content.Context r2 = r2.d()
            r3 = 65533(0xfffd, float:9.1831E-41)
            r1.<init>(r0, r2, r3)
            return r1
        L_0x013f:
            android.content.Context r1 = r25.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            android.view.View r0 = r1.inflate(r0, r8, r11)
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedStatusItemViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.FollowFeedStatusItemViewHolder
            com.ss.android.ugc.aweme.forward.a.a r2 = r7.r
            android.content.Context r2 = r2.d()
            r3 = 65534(0xfffe, float:9.1833E-41)
            r1.<init>(r0, r2, r3)
            return r1
        L_0x015a:
            android.content.Context r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131689965(0x7f0f01ed, float:1.900896E38)
            android.view.View r0 = r0.inflate(r1, r8, r11)
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyRecommendViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyRecommendViewHolder
            r1.<init>(r0)
            return r1
        L_0x016f:
            android.content.Context r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131689964(0x7f0f01ec, float:1.9008958E38)
            android.view.View r0 = r0.inflate(r1, r8, r11)
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyItemViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.FollowFeedEmptyItemViewHolder
            com.ss.android.ugc.aweme.forward.a.a r2 = r7.r
            android.content.Context r2 = r2.d()
            java.lang.String r3 = "extra_follow_type_friend"
            java.lang.String r4 = r7.z
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0193
            java.lang.String r3 = "homepage_friends"
            goto L_0x0195
        L_0x0193:
            java.lang.String r3 = "homepage_follow"
        L_0x0195:
            r1.<init>(r0, r2, r3)
            return r1
        L_0x0199:
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder$a r9 = com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder.f57567c
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder.a.f57570a
            r16 = 0
            r17 = 62225(0xf311, float:8.7196E-41)
            java.lang.Class[] r0 = new java.lang.Class[r12]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder> r19 = com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder.class
            r14 = r9
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x01d3
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder.a.f57570a
            r1 = 0
            r2 = 62225(0xf311, float:8.7196E-41)
            java.lang.Class[] r13 = new java.lang.Class[r12]
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            r13[r11] = r3
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder> r14 = com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder.class
            r8 = r0
            r11 = r1
            r12 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder r0 = (com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder) r0
            return r0
        L_0x01d3:
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            android.content.Context r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690273(0x7f0f0321, float:1.9009585E38)
            android.view.View r0 = r0.inflate(r1, r8, r11)
            com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.FollowFeedLastWatchItemViewHolder
            java.lang.String r2 = "view"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r1.<init>(r0)
            return r1
        L_0x01f2:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61106(0xeeb2, float:8.5628E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder> r6 = com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder.class
            r1 = r24
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0227
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61106(0xeeb2, float:8.5628E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder> r6 = com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder.class
            r1 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder r0 = (com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder) r0
            return r0
        L_0x0227:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.aC()
            android.content.Context r1 = r25.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131690271(0x7f0f031f, float:1.900958E38)
            android.view.View r1 = r1.inflate(r2, r8, r11)
            switch(r0) {
                case 2: goto L_0x028d;
                case 3: goto L_0x028d;
                case 4: goto L_0x0271;
                case 5: goto L_0x0259;
                default: goto L_0x0241;
            }
        L_0x0241:
            com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA r0 = new com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA
            r14 = r1
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout r14 = (com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout) r14
            com.ss.android.ugc.aweme.forward.a.a r15 = r7.r
            com.ss.android.ugc.aweme.newfollow.util.l r1 = r7.j
            com.ss.android.ugc.aweme.newfollow.b.a r2 = r7.o
            com.ss.android.ugc.aweme.feed.d r3 = r7.q
            r13 = r0
            r16 = r1
            r17 = r2
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x02a8
        L_0x0259:
            com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderD r0 = new com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderD
            r14 = r1
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout r14 = (com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout) r14
            com.ss.android.ugc.aweme.forward.a.a r15 = r7.r
            com.ss.android.ugc.aweme.newfollow.util.l r1 = r7.j
            com.ss.android.ugc.aweme.newfollow.b.a r2 = r7.o
            com.ss.android.ugc.aweme.feed.d r3 = r7.q
            r13 = r0
            r16 = r1
            r17 = r2
            r18 = r3
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x02a8
        L_0x0271:
            com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderB r0 = new com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderB
            r17 = r1
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout r17 = (com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout) r17
            com.ss.android.ugc.aweme.forward.a.a r1 = r7.r
            com.ss.android.ugc.aweme.newfollow.util.l r2 = r7.j
            com.ss.android.ugc.aweme.newfollow.b.a r3 = r7.o
            com.ss.android.ugc.aweme.feed.d r4 = r7.q
            r16 = r0
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x02a8
        L_0x028d:
            com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA r0 = new com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA
            r19 = r1
            com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout r19 = (com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout) r19
            com.ss.android.ugc.aweme.forward.a.a r1 = r7.r
            com.ss.android.ugc.aweme.newfollow.util.l r2 = r7.j
            com.ss.android.ugc.aweme.newfollow.b.a r3 = r7.o
            com.ss.android.ugc.aweme.feed.d r4 = r7.q
            r18 = r0
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r18.<init>(r19, r20, r21, r22, r23)
        L_0x02a8:
            r1 = r0
            com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA r1 = (com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA) r1
            java.lang.String r2 = r7.z
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA.f3681b
            r16 = 0
            r17 = 62436(0xf3e4, float:8.7491E-41)
            java.lang.Class[] r3 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r11] = r4
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r3
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r3 == 0) goto L_0x02e3
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r2
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderA.f3681b
            r16 = 0
            r17 = 62436(0xf3e4, float:8.7491E-41)
            java.lang.Class[] r2 = new java.lang.Class[r12]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r11] = r3
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r1
            r18 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x02ea
        L_0x02e3:
            java.lang.String r3 = "enterFrom"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            r1.f3684e = r2
        L_0x02ea:
            return r0
        L_0x02eb:
            android.content.Context r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r0 = r0.inflate(r1, r8, r11)
            com.ss.android.ugc.aweme.newfollow.vh.UpLoadItemViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.UpLoadItemViewHolder
            r1.<init>(r0)
            return r1
        L_0x02fd:
            com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView r0 = new com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserView
            android.content.Context r1 = r25.getContext()
            r0.<init>(r1)
            r1 = 2131624964(0x7f0e0404, float:1.8877123E38)
            r0.setBackgroundResource(r1)
            java.lang.String r1 = "extra_follow_type_friend"
            java.lang.String r2 = r7.z
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0317
            goto L_0x0318
        L_0x0317:
            r10 = 1
        L_0x0318:
            r0.setPageType(r10)
            com.ss.android.ugc.aweme.newfollow.vh.RecommendUserViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.RecommendUserViewHolder
            r1.<init>(r0)
            r7.L = r1
            com.ss.android.ugc.aweme.newfollow.vh.RecommendUserViewHolder r0 = r7.L
            boolean r1 = r7.D
            if (r1 == 0) goto L_0x032b
            java.lang.String r1 = "empty"
            goto L_0x032d
        L_0x032b:
            java.lang.String r1 = "nonempty"
        L_0x032d:
            r0.f57673e = r1
            com.ss.android.ugc.aweme.newfollow.vh.RecommendUserViewHolder r0 = r7.L
            java.lang.String r1 = r7.z
            r0.f57671c = r1
            com.ss.android.ugc.aweme.newfollow.vh.RecommendUserViewHolder r0 = r7.L
            return r0
        L_0x0338:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x03b6
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.story.api.i> r1 = com.ss.android.ugc.aweme.story.api.i.class
            java.lang.Object r0 = r0.getService(r1)
            r9 = r0
            com.ss.android.ugc.aweme.story.api.i r9 = (com.ss.android.ugc.aweme.story.api.i) r9
            android.content.Context r13 = r25.getContext()
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61066(0xee8a, float:8.5572E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.h> r6 = com.ss.android.ugc.aweme.story.api.model.h.class
            r1 = r24
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0378
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f57068f
            r3 = 0
            r4 = 61066(0xee8a, float:8.5572E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.story.api.model.h> r6 = com.ss.android.ugc.aweme.story.api.model.h.class
            r1 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.story.api.model.h r0 = (com.ss.android.ugc.aweme.story.api.model.h) r0
            goto L_0x0398
        L_0x0378:
            com.ss.android.ugc.aweme.story.api.model.h r0 = new com.ss.android.ugc.aweme.story.api.model.h
            r0.<init>()
            java.lang.String r1 = "extra_follow_type_friend"
            java.lang.String r2 = r7.z
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x0388
            r10 = 1
        L_0x0388:
            r0.f71856a = r10
            java.lang.String r1 = r7.u
            r0.f71857b = r1
            java.lang.String r1 = r7.A
            r0.f71858c = r1
            boolean r1 = r7.B
            r0.f71859d = r1
            r0.f71860e = r12
        L_0x0398:
            android.support.v4.app.Fragment r1 = r7.R
            com.ss.android.ugc.aweme.story.api.b.c r0 = r9.a((android.content.Context) r13, (com.ss.android.ugc.aweme.story.api.model.h) r0, (android.arch.lifecycle.LifecycleOwner) r1)
            r7.h = r0
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r1 = r25.getContext()
            r0.<init>(r1)
            r0.setOrientation(r12)
            com.ss.android.ugc.aweme.newfollow.vh.StoryHeaderViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.StoryHeaderViewHolder
            com.ss.android.ugc.aweme.story.api.b.c r2 = r7.h
            android.support.v4.app.Fragment r3 = r7.R
            r1.<init>(r0, r2, r3)
            return r1
        L_0x03b6:
            android.content.Context r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690274(0x7f0f0322, float:1.9009587E38)
            android.view.View r0 = r0.inflate(r1, r8, r11)
            com.ss.android.ugc.aweme.follow.ui.HeaderViewHolder r1 = new com.ss.android.ugc.aweme.follow.ui.HeaderViewHolder
            r1.<init>(r0)
            return r1
        L_0x03cb:
            android.content.Context r0 = r25.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r0 = r0.inflate(r1, r8, r11)
            com.ss.android.ugc.aweme.newfollow.vh.UpLoadRecoverItemViewHolder r1 = new com.ss.android.ugc.aweme.newfollow.vh.UpLoadRecoverItemViewHolder
            com.ss.android.ugc.aweme.forward.a.a r2 = r7.r
            android.content.Context r2 = r2.d()
            android.support.v4.app.FragmentActivity r2 = (android.support.v4.app.FragmentActivity) r2
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter.onCreateBasicViewHolder(android.view.ViewGroup, int):android.support.v7.widget.RecyclerView$ViewHolder");
    }

    public FollowFeedAdapter(RecyclerView recyclerView, com.ss.android.ugc.aweme.feed.d dVar, g gVar, n nVar, Fragment fragment) {
        super(recyclerView, dVar, gVar);
        this.V = nVar;
        this.R = fragment;
    }
}
