package com.ss.android.ugc.aweme.hotsearch.viewholder;

import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.b.k;
import com.ss.android.ugc.aweme.hotsearch.d.b;
import com.ss.android.ugc.aweme.profile.d.ae;

public class RankingListStarItemViewHolder extends RecyclerView.ViewHolder implements a<k> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49923a;

    /* renamed from: b  reason: collision with root package name */
    f<k> f49924b;

    /* renamed from: c  reason: collision with root package name */
    public long f49925c;
    @BindView(2131493843)
    ImageView crown;

    /* renamed from: d  reason: collision with root package name */
    private k f49926d;
    @BindView(2131494751)
    CircleImageView mImgAvatar;
    @BindView(2131494785)
    RemoteImageView mImgRankSeqMark;
    @BindView(2131497952)
    DmtTextView mTvHotValue;
    @BindView(2131498016)
    DmtTextView mTvName;
    @BindView(2131498075)
    DmtTextView mTvRankSeq;

    public final void a(int i) {
    }

    public final void c_(boolean z) {
    }

    public RankingListStarItemViewHolder(View view, f<k> fVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        if (((GenericDraweeHierarchy) this.mImgAvatar.getHierarchy()).getRoundingParams() != null) {
            ((GenericDraweeHierarchy) this.mImgAvatar.getHierarchy()).getRoundingParams().setBorderWidth((float) u.a(0.5d));
            ((GenericDraweeHierarchy) this.mImgAvatar.getHierarchy()).getRoundingParams().setBorderColor(this.mImgAvatar.getResources().getColor(C0906R.color.hm));
        }
        this.f49924b = fVar;
    }

    public final /* synthetic */ void a_(Object obj, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        final int i2 = i;
        k kVar = (k) obj;
        if (PatchProxy.isSupport(new Object[]{kVar, Integer.valueOf(i)}, this, f49923a, false, 49878, new Class[]{k.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar, Integer.valueOf(i)}, this, f49923a, false, 49878, new Class[]{k.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f49926d = kVar;
        final k kVar2 = this.f49926d;
        if (PatchProxy.isSupport(new Object[]{kVar2, Integer.valueOf(i)}, this, f49923a, false, 49879, new Class[]{k.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2, Integer.valueOf(i)}, this, f49923a, false, 49879, new Class[]{k.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b.a((TextView) this.mTvRankSeq, this.crown, i2);
        if (this.f49926d != null) {
            if (this.f49926d.f49704b == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                RemoteImageView remoteImageView = this.mImgRankSeqMark;
                k kVar3 = this.f49926d;
                if (PatchProxy.isSupport(new Object[0], kVar3, k.f49703a, false, 49736, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], kVar3, k.f49703a, false, 49736, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (!TextUtils.isEmpty(kVar3.f49708f)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b.a(remoteImageView, z3, this.f49926d.f49706d, this.f49926d.f49707e);
                this.mImgAvatar.a(this.f49926d.f49704b.getAvatarThumb());
                this.mTvName.setBackground(null);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.mTvName.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.matchConstraintDefaultWidth = 1;
                this.mTvName.setLayoutParams(layoutParams);
                this.mTvName.setText(ae.a(this.f49926d.f49704b));
                this.mTvHotValue.setText(String.format(this.mTvHotValue.getResources().getString(C0906R.string.buz), new Object[]{com.ss.android.ugc.aweme.i18n.b.a(this.f49926d.f49705c)}));
                this.itemView.setOnTouchListener(new ai() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49927a;

                    public final void b(View view, MotionEvent motionEvent) {
                        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49927a, false, 49880, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49927a, false, 49880, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                        } else if (System.currentTimeMillis() - RankingListStarItemViewHolder.this.f49925c >= 500) {
                            RankingListStarItemViewHolder.this.f49925c = System.currentTimeMillis();
                            if (kVar2.f49704b != null) {
                                RankingListStarItemViewHolder.this.f49924b.b(kVar2, i2);
                            }
                        }
                    }
                });
                return;
            }
        }
        ((GenericDraweeHierarchy) this.mImgAvatar.getHierarchy()).reset();
        this.mImgRankSeqMark.setVisibility(8);
        this.mTvName.setBackgroundResource(C0906R.color.bs);
        ViewGroup.LayoutParams layoutParams2 = this.mTvName.getLayoutParams();
        layoutParams2.width = u.a(83.0d);
        this.mTvName.setLayoutParams(layoutParams2);
        this.mTvName.setText(null);
        this.mTvHotValue.setText(null);
    }
}
