package com.ss.android.ugc.aweme.discover.adapter;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.commerce.service.h.a;
import com.ss.android.ugc.aweme.commerce.service.h.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.base.b;
import com.ss.android.ugc.aweme.discover.hitrank.c;
import com.ss.android.ugc.aweme.discover.model.RankingListCover;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.widget.RankScrollView;
import com.ss.android.ugc.aweme.hotsearch.RankingListMusicActivity;
import com.ss.android.ugc.aweme.music.model.Brand;
import com.ss.android.ugc.aweme.music.model.BrandCategory;
import com.ss.android.ugc.aweme.utils.dp;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import kotlin.jvm.internal.Intrinsics;

public class RankingListCoverViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41702a;

    /* renamed from: b  reason: collision with root package name */
    public RankScrollView f41703b;

    /* renamed from: c  reason: collision with root package name */
    public View f41704c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f41705d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f41706e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f41707f;
    public RemoteImageView g;
    Rect h;
    boolean i;
    boolean j;
    public Fragment k;
    public View l;
    public LinearLayout m;
    @BindView(2131496780)
    View mMusicContainer;
    @BindView(2131495049)
    public RemoteImageView mMusicHeaderView;
    @BindView(2131498012)
    public TextView mMusicName;
    @BindView(2131493275)
    RemoteImageView mStarBackground;
    @BindView(2131496781)
    public View mStarContainer;
    @BindView(2131495050)
    public CircleImageView mStarHeaderView;
    @BindView(2131498157)
    public TextView mStarName;
    public TextView n;
    public TextView o;
    public CircleImageView p;
    public boolean q;
    public ObjectAnimator r;
    public AnimatorSet s;
    public int t;
    Rect u;
    boolean v;
    public RankScrollView.a w;
    public RankingListCover x;

    public RankingListCoverViewHolder(View view, boolean z) {
        this(view, false, null);
    }

    public RankingListCoverViewHolder(final View view, boolean z, @Nullable Fragment fragment) {
        super(view);
        this.h = new Rect();
        this.i = true;
        this.j = false;
        this.u = new Rect();
        this.v = true;
        this.k = fragment;
        ButterKnife.bind((Object) this, view);
        this.mStarContainer.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41708a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41708a, false, 35722, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41708a, false, 35722, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                r.a("enter_star_board", (Map) d.a().a("enter_from", "discovery").f34114b);
                h.a().a(c.a("discovery"));
            }
        });
        this.mMusicContainer.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41710a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41710a, false, 35723, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41710a, false, 35723, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                r.a("enter_music_leaderboard", (Map) d.a().a("enter_from", "discovery").a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST).f34114b);
                Context context = view.getContext();
                if (PatchProxy.isSupport(new Object[]{context}, null, RankingListMusicActivity.i, true, 49571, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{context}, null, RankingListMusicActivity.i, true, 49571, new Class[]{Context.class}, Void.TYPE);
                    return;
                }
                RankingListMusicActivity.a(context, null);
            }
        });
        if (z) {
            if (PatchProxy.isSupport(new Object[0], this, f41702a, false, 35707, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41702a, false, 35707, new Class[0], Void.TYPE);
            } else {
                this.q = true;
                this.f41703b = (RankScrollView) this.itemView.findViewById(C0906R.id.cxw);
                a a2 = b.f37971b.a(this.itemView.getContext());
                if (a2 == null || a2.m(true)) {
                    a2.n(false);
                    this.j = true;
                    this.f41703b.post(new u(this));
                    this.f41703b.postDelayed(new v(this), 2000);
                }
                this.f41704c = this.itemView.findViewById(C0906R.id.cfp);
                this.l = this.itemView.findViewById(C0906R.id.cfn);
                int b2 = (p.b(this.itemView.getContext()) * 168) / 375;
                ((LinearLayout.LayoutParams) this.f41704c.getLayoutParams()).width = b2;
                ((LinearLayout.LayoutParams) this.mStarContainer.getLayoutParams()).width = b2;
                ((LinearLayout.LayoutParams) this.mMusicContainer.getLayoutParams()).width = b2;
                ((LinearLayout.LayoutParams) this.l.getLayoutParams()).width = b2;
                this.f41705d = (TextView) this.itemView.findViewById(C0906R.id.dkp);
                this.f41706e = (TextView) this.itemView.findViewById(C0906R.id.dl0);
                this.f41707f = (TextView) this.itemView.findViewById(C0906R.id.dcg);
                this.g = (RemoteImageView) this.itemView.findViewById(C0906R.id.b1w);
                this.m = (LinearLayout) this.itemView.findViewById(C0906R.id.bfm);
                this.n = (TextView) this.itemView.findViewById(C0906R.id.dkz);
                this.o = (TextView) this.itemView.findViewById(C0906R.id.d9n);
                this.p = (CircleImageView) this.itemView.findViewById(C0906R.id.b1v);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f41702a, false, 35708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41702a, false, 35708, new Class[0], Void.TYPE);
        } else {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.setRoundAsCircle(true);
            ((GenericDraweeHierarchy) this.mStarHeaderView.getHierarchy()).setRoundingParams(roundingParams);
            ((GenericDraweeHierarchy) this.mStarHeaderView.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
            if (((Integer) SharePrefCache.inst().getHitRankActivityStatus().c()).intValue() != 0) {
                String str = (String) SharePrefCache.inst().getHitRankActivityStarBackground().c();
                if (!TextUtils.isEmpty(str)) {
                    RemoteImageView remoteImageView = this.mStarBackground;
                    if (PatchProxy.isSupport(new Object[]{remoteImageView, str}, null, com.ss.android.ugc.aweme.discover.base.b.f42143a, true, 36083, new Class[]{RemoteImageView.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{remoteImageView, str}, null, com.ss.android.ugc.aweme.discover.base.b.f42143a, true, 36083, new Class[]{RemoteImageView.class, String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(remoteImageView, "draweeView");
                        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
                        remoteImageView.post(new b.C0535b(remoteImageView, str));
                    }
                }
            }
            RoundingParams roundingParams2 = new RoundingParams();
            roundingParams2.setCornersRadius(UIUtils.dip2Px(this.itemView.getContext(), 4.0f));
            ((GenericDraweeHierarchy) this.mMusicHeaderView.getHierarchy()).setRoundingParams(roundingParams2);
            ((GenericDraweeHierarchy) this.mMusicHeaderView.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
            if (this.q) {
                ((GenericDraweeHierarchy) this.g.getHierarchy()).setRoundingParams(roundingParams2);
                ((GenericDraweeHierarchy) this.g.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
                ((GenericDraweeHierarchy) this.p.getHierarchy()).setRoundingParams(roundingParams);
                ((GenericDraweeHierarchy) this.p.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.CENTER_CROP);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f41702a, false, 35709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41702a, false, 35709, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mStarContainer.setOutlineProvider(new dp((int) UIUtils.dip2Px(this.itemView.getContext(), 4.0f)));
            this.mStarContainer.setClipToOutline(true);
            this.mMusicContainer.setOutlineProvider(new dp((int) UIUtils.dip2Px(this.itemView.getContext(), 4.0f)));
            this.mMusicContainer.setClipToOutline(true);
            if (this.q) {
                this.f41704c.setOutlineProvider(new dp((int) UIUtils.dip2Px(this.itemView.getContext(), 4.0f)));
                this.f41704c.setClipToOutline(true);
                this.l.setOutlineProvider(new dp((int) UIUtils.dip2Px(this.itemView.getContext(), 4.0f)));
                this.l.setClipToOutline(true);
            }
        }
    }

    public boolean a(List<BrandCategory> list, List<Brand> list2, List<String> list3, int i2, int i3, int i4) {
        List<Brand> list4 = list2;
        List<String> list5 = list3;
        if (PatchProxy.isSupport(new Object[]{list, list4, list5, 0, 0, 0}, this, f41702a, false, 35716, new Class[]{List.class, List.class, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, list4, list5, 0, 0, 0}, this, f41702a, false, 35716, new Class[]{List.class, List.class, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        for (BrandCategory next : list) {
            if (next.getBrandList() != null) {
                list4.add(next.getBrandList().get(0));
            }
            list5.add(next.getName());
        }
        if (list2.size() == 0) {
            return false;
        }
        if (list4.get(0).getLogoUrl() == null) {
            this.p.setImageResource(2130840225);
        } else {
            com.ss.android.ugc.aweme.discover.base.b.a(this.p, list4.get(0).getLogoUrl());
        }
        this.o.setText(list4.get(0).getName());
        this.n.setText(String.format(o.b(C0906R.string.ob), new Object[]{list5.get(0)}));
        return true;
    }
}
