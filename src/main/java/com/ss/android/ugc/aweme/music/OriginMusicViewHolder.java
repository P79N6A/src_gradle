package com.ss.android.ugc.aweme.music;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.music.a.e;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.adapter.d;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public class OriginMusicViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56141a;

    /* renamed from: b  reason: collision with root package name */
    public MusicModel f56142b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f56143c;

    /* renamed from: d  reason: collision with root package name */
    public Context f56144d;

    /* renamed from: e  reason: collision with root package name */
    aa<f> f56145e;

    /* renamed from: f  reason: collision with root package name */
    private d f56146f;
    @BindView(2131495816)
    ImageView ivDetail;
    @BindView(2131496925)
    public RemoteImageView mCoverView;
    @BindView(2131497900)
    public TextView mDurationView;
    @BindView(2131495098)
    public CheckableImageView mIvMusicCollect;
    @BindView(2131498016)
    public TextView mNameView;
    @BindView(2131496789)
    RelativeLayout mOkView;
    @BindView(2131495163)
    ImageView mPlayView;
    @BindView(2131496121)
    ProgressBar mProgressBarView;
    @BindView(2131496795)
    ConstraintLayout mRightView;
    @BindView(2131497453)
    public TextView mTagView;
    @BindView(2131495606)
    LinearLayout mTopView;
    @BindView(2131498289)
    TextView mTvConfirm;
    @BindView(2131495820)
    LinearLayout musicItemll;
    @BindView(2131498220)
    public TextView txtUserCount;

    public final void a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f56141a, false, 59856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56141a, false, 59856, new Class[0], Void.TYPE);
            return;
        }
        CheckableImageView checkableImageView = this.mIvMusicCollect;
        if (this.f56143c) {
            i = 2130838804;
        } else {
            i = 2130839454;
        }
        checkableImageView.setImageResource(i);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56141a, false, 59860, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56141a, false, 59860, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(z);
    }

    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56141a, false, 59858, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56141a, false, 59858, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.mOkView.setVisibility(0);
            this.mPlayView.setVisibility(0);
            this.mPlayView.setImageResource(2130839170);
            this.mProgressBarView.setVisibility(8);
            r.onEvent(MobClick.obtain().setEventName("music_play").setLabelName("personal_homepage_list").setValue(this.f56142b.getMusicId()));
        } else {
            this.mOkView.setVisibility(8);
            this.mProgressBarView.setVisibility(8);
            this.mPlayView.setVisibility(0);
            this.mPlayView.setImageResource(2130839190);
        }
    }

    @OnClick({2131496789, 2131495606, 2131495816})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f56141a, false, 59859, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f56141a, false, 59859, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.bod) {
            if (this.f56142b != null && this.f56142b.getMusicStatus() == 0 && this.f56142b.getMusic() != null) {
                String offlineDesc = this.f56142b.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.f56144d.getString(C0906R.string.bel);
                }
                a.c(view.getContext(), offlineDesc).a();
                return;
            } else if (this.f56142b != null) {
                r.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName("personal_homepage_list").setValue(this.f56142b.getMusicId()));
                r.a("enter_music_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage_list").a("group_id", "").a("music_id", this.f56142b.getMusicId()).f34114b);
                if (com.ss.android.ugc.aweme.music.util.d.a(this.f56142b, this.itemView.getContext(), true)) {
                    h a2 = h.a();
                    a2.a("aweme://music/detail/" + this.f56142b.getMusicId());
                } else {
                    return;
                }
            }
        }
        if (this.f56146f != null) {
            this.f56146f.a(this, view, this.f56142b);
        }
    }

    public OriginMusicViewHolder(View view, d dVar, aa<f> aaVar) {
        super(view);
        this.f56146f = dVar;
        this.f56145e = aaVar;
        ButterKnife.bind((Object) this, view);
        this.f56144d = view.getContext();
        this.mIvMusicCollect.setOnStateChangeListener(new CheckableImageView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56147a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f56147a, false, 59863, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56147a, false, 59863, new Class[0], Void.TYPE);
                    return;
                }
                OriginMusicViewHolder originMusicViewHolder = OriginMusicViewHolder.this;
                if (PatchProxy.isSupport(new Object[0], originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59857, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], originMusicViewHolder, OriginMusicViewHolder.f56141a, false, 59857, new Class[0], Void.TYPE);
                    return;
                }
                boolean z = originMusicViewHolder.f56143c;
                bg.a(new e(z ? 1 : 0, originMusicViewHolder.f56142b));
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f56147a, false, 59862, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f56147a, false, 59862, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 1) {
                    OriginMusicViewHolder.this.a();
                }
            }
        });
        this.mIvMusicCollect.setVisibility(0);
    }
}
