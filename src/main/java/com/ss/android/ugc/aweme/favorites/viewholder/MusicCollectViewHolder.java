package com.ss.android.ugc.aweme.favorites.viewholder;

import android.content.Context;
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
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.d.a;
import com.ss.android.ugc.aweme.music.adapter.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.util.c;
import java.util.Map;

public class MusicCollectViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, a.C0553a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44372a;

    /* renamed from: b  reason: collision with root package name */
    public Music f44373b;

    /* renamed from: c  reason: collision with root package name */
    private d f44374c;

    /* renamed from: d  reason: collision with root package name */
    private Context f44375d;
    @BindView(2131496925)
    public RemoteImageView mCoverView;
    @BindView(2131493601)
    public TextView mMusicDuration;
    @BindView(2131498016)
    public TextView mNameView;
    @BindView(2131496789)
    RelativeLayout mOkView;
    @BindView(2131495110)
    public ImageView mOriginalTag;
    @BindView(2131495163)
    ImageView mPlayView;
    @BindView(2131496121)
    public ProgressBar mProgressBarView;
    @BindView(2131496795)
    RelativeLayout mRightView;
    @BindView(2131498147)
    public TextView mSingerView;
    @BindView(2131495606)
    LinearLayout mTopView;
    @BindView(2131495820)
    LinearLayout musicItemll;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44372a, false, 39697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44372a, false, 39697, new Class[0], Void.TYPE);
            return;
        }
        if (this.f44373b != null) {
            a.c(1, this.f44373b.getMid());
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44372a, false, 39692, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44372a, false, 39692, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(z);
    }

    public void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f44372a, false, 39693, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f44372a, false, 39693, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.mOkView.setVisibility(0);
            this.mPlayView.setImageResource(2130839170);
            this.mProgressBarView.setVisibility(8);
        } else {
            this.mOkView.setVisibility(8);
            this.mProgressBarView.setVisibility(8);
            this.mPlayView.setVisibility(0);
            this.mPlayView.setImageResource(2130839190);
        }
    }

    @OnClick({2131495606, 2131496789, 2131495816})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44372a, false, 39696, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44372a, false, 39696, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.bod) {
            if (this.f44373b != null && this.f44373b.getMusicStatus() == 0) {
                String offlineDesc = this.f44373b.getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.f44375d.getString(C0906R.string.bel);
                }
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), offlineDesc).a();
                return;
            } else if (this.f44373b != null) {
                if (com.ss.android.ugc.aweme.music.util.d.a(c.f56796b.a(this.f44373b), this.itemView.getContext(), true)) {
                    h a2 = h.a();
                    a2.a("aweme://music/detail/" + this.f44373b.getMid());
                    r.a("enter_music_detail", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("music_id", this.f44373b.getMid()).a("enter_from", "collection_music").f34114b);
                } else {
                    return;
                }
            }
        }
        if (!(this.f44374c == null || this.f44373b == null)) {
            this.f44374c.a(this, view, c.f56796b.a(this.f44373b));
        }
        if (this.f44373b != null) {
            a.c(2, this.f44373b.getMid());
        }
    }

    public MusicCollectViewHolder(View view, d dVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f44375d = view.getContext();
        this.f44374c = dVar;
    }
}
