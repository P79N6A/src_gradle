package com.ss.android.ugc.aweme.hotsearch.viewholder;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicItem;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.hotsearch.a.f;
import com.ss.android.ugc.aweme.hotsearch.d.b;
import com.ss.android.ugc.aweme.hotsearch.d.c;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public class RankingListMusicItemViewHolder extends RecyclerView.ViewHolder implements c.a, a<HotSearchMusicItem> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49903a;

    /* renamed from: b  reason: collision with root package name */
    public long f49904b;

    /* renamed from: c  reason: collision with root package name */
    public f<Music> f49905c;
    @BindView(2131493843)
    ImageView crown;

    /* renamed from: d  reason: collision with root package name */
    private HotSearchMusicItem f49906d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f49907e;

    /* renamed from: f  reason: collision with root package name */
    private c.b f49908f;
    private int g;
    private Animation h;
    @BindView(2131495822)
    ImageView ivLoad;
    @BindView(2131496069)
    RemoteRoundImageView ivMusicianMark;
    @BindView(2131495826)
    ImageView ivPlay;
    @BindView(2131495832)
    ImageView ivStop;
    @BindView(2131496858)
    View mContentContainer;
    @BindView(2131497867)
    TextView mCountView;
    @BindView(2131494785)
    RemoteImageView mImgRankSeqMark;
    @BindView(2131495814)
    RemoteRoundImageView mMusicCover;
    @BindView(2131498016)
    TextView mNameView;
    @BindView(2131495110)
    ImageView mOriginalTag;
    @BindView(2131496159)
    View mPlaceHolder;
    @BindView(2131498191)
    TextView mTitleView;
    @BindView(2131498075)
    DmtTextView mTvRankSeq;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49903a, false, 49871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49903a, false, 49871, new Class[0], Void.TYPE);
            return;
        }
        this.ivPlay.setVisibility(8);
        this.ivLoad.clearAnimation();
        this.ivLoad.setVisibility(8);
        this.ivStop.setVisibility(0);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49903a, false, 49872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49903a, false, 49872, new Class[0], Void.TYPE);
            return;
        }
        this.ivPlay.setVisibility(0);
        this.ivLoad.clearAnimation();
        this.ivLoad.setVisibility(8);
        this.ivStop.setVisibility(8);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f49903a, false, 49873, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49903a, false, 49873, new Class[0], Void.TYPE);
            return;
        }
        this.ivLoad.setVisibility(0);
        this.ivLoad.startAnimation(this.h);
        this.ivPlay.setVisibility(8);
        this.ivStop.setVisibility(8);
    }

    public final void c_(boolean z) {
        this.f49907e = z;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49903a, false, 49867, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49903a, false, 49867, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f49907e || this.f49906d == null || this.f49906d.mMusic == null)) {
            this.f49905c.a(this.f49906d.mMusic, i);
        }
    }

    @OnClick({2131495832, 2131495826})
    public void click(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49903a, false, 49870, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49903a, false, 49870, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.bon) {
            this.f49908f.a(this.f49906d, this, this.g);
        } else if (id == C0906R.id.bot) {
            this.f49908f.N_();
        } else {
            if (id == C0906R.id.boj) {
                this.f49908f.N_();
            }
        }
    }

    public final /* synthetic */ void a_(Object obj, final int i) {
        HotSearchMusicItem hotSearchMusicItem = (HotSearchMusicItem) obj;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{hotSearchMusicItem, Integer.valueOf(i)}, this, f49903a, false, 49868, new Class[]{HotSearchMusicItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchMusicItem, Integer.valueOf(i)}, this, f49903a, false, 49868, new Class[]{HotSearchMusicItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(hotSearchMusicItem == null || hotSearchMusicItem.isPlaceholder() || hotSearchMusicItem.mMusic == null)) {
            b.b(this.itemView.getContext(), this.mTitleView, hotSearchMusicItem.mLabel);
            b.a(this.mCountView, hotSearchMusicItem.mHotValue);
        }
        if (PatchProxy.isSupport(new Object[]{hotSearchMusicItem, Integer.valueOf(i)}, this, f49903a, false, 49869, new Class[]{HotSearchMusicItem.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hotSearchMusicItem, Integer.valueOf(i)}, this, f49903a, false, 49869, new Class[]{HotSearchMusicItem.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b.a((TextView) this.mTvRankSeq, this.crown, i);
        if (hotSearchMusicItem == null || hotSearchMusicItem.isPlaceholder() || hotSearchMusicItem.mMusic == null) {
            this.mPlaceHolder.setVisibility(0);
            this.mContentContainer.setVisibility(8);
            return;
        }
        this.f49906d = hotSearchMusicItem;
        RemoteImageView remoteImageView = this.mImgRankSeqMark;
        if (!AbTestManager.a().ay() || this.f49906d.isPastRanking()) {
            z = false;
        }
        b.a(remoteImageView, z, this.f49906d.isNew, this.f49906d.rankDiff);
        final Music music = this.f49906d.mMusic;
        this.mPlaceHolder.setVisibility(8);
        this.mContentContainer.setVisibility(0);
        this.mTitleView.setText(music.getMusicName());
        this.mNameView.setText(music.getAuthorName());
        com.ss.android.ugc.aweme.base.c.b(this.mMusicCover, music.getCoverMedium());
        if (TextUtils.isEmpty(music.getMusicName()) || !music.isOriginMusic()) {
            this.mOriginalTag.setVisibility(8);
        } else {
            this.mOriginalTag.setVisibility(0);
        }
        this.ivLoad.clearAnimation();
        if (hotSearchMusicItem.playing) {
            this.ivPlay.setVisibility(8);
            this.ivLoad.setVisibility(8);
            this.ivStop.setVisibility(0);
        } else {
            this.ivPlay.setVisibility(0);
            this.ivLoad.setVisibility(8);
            this.ivStop.setVisibility(8);
        }
        this.g = i;
        this.mContentContainer.setOnTouchListener(new ai() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49909a;

            public final void b(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f49909a, false, 49874, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f49909a, false, 49874, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                } else if (System.currentTimeMillis() - RankingListMusicItemViewHolder.this.f49904b >= 500) {
                    RankingListMusicItemViewHolder.this.f49904b = System.currentTimeMillis();
                    if (music.getMusicName() != null) {
                        RankingListMusicItemViewHolder.this.f49905c.b(music, i);
                    }
                }
            }
        });
    }

    public RankingListMusicItemViewHolder(View view, f<Music> fVar, c.b bVar) {
        super(view);
        this.f49905c = fVar;
        this.f49908f = bVar;
        this.h = AnimationUtils.loadAnimation(view.getContext(), C0906R.anim.ck);
        this.h.setInterpolator(new LinearInterpolator());
        ButterKnife.bind((Object) this, view);
    }
}
