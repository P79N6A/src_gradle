package com.ss.android.ugc.aweme.forward.vh;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.g.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.b;
import com.ss.android.ugc.aweme.forward.b.f;
import com.ss.android.ugc.aweme.forward.d.k;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar;
import com.ss.android.ugc.aweme.utils.dp;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class ForwardVideoViewHolder extends BaseForwardViewHolder implements f {
    public static ChangeQuickRedirect s;
    @BindView(2131494996)
    protected RemoteImageView mCoverView;
    @Nullable
    @BindView(2131497369)
    ViewStub mDynamicStub;
    @Nullable
    @BindView(2131494836)
    ViewGroup mInteractStickers;
    @BindView(2131495084)
    ImageView mIvLoading;
    @BindView(2131495818)
    ImageView mIvMusicIcon;
    @BindView(2131495112)
    ImageView mIvPause;
    @BindView(2131495122)
    ImageView mIvPlay;
    @BindView(2131495272)
    protected ViewGroup mMusicLayout;
    @BindView(2131495834)
    MarqueeView mMusicTitleView;
    @BindView(2131498041)
    MentionTextView mOriginDescView;
    @BindView(2131495276)
    View mOriginHeader;
    @BindView(2131496854)
    ViewGroup mOriginRootView;
    @BindView(2131498465)
    VideoPlayerProgressbar mProgressbar;
    @BindView(2131495824)
    TextView mTvMusicOriginal;
    @BindView(2131495315)
    protected ViewGroup mVideoLayout;
    @BindView(2131497551)
    protected KeepSurfaceTextureView mVideoView;
    private InteractStickerWidget t;
    private RotateAnimation u;
    private boolean v;

    public String Q() {
        return null;
    }

    public int R() {
        return 1;
    }

    @NotNull
    public String S() {
        return "from_follow_page";
    }

    public final void e() {
    }

    public final View o() {
        if (!PatchProxy.isSupport(new Object[0], this, s, false, 45676, new Class[0], View.class)) {
            return null;
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, s, false, 45676, new Class[0], View.class);
    }

    public final KeepSurfaceTextureView f() {
        return this.mVideoView;
    }

    public boolean s() {
        return this.v;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, s, false, 45645, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, s, false, 45645, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.mCoverView.setVisibility(0);
            if (!(this.f48319d == null || this.f48319d.getForwardItem() == null || this.f48319d.getForwardItem().getVideo() == null)) {
                c.a(this.mCoverView, this.f48319d.getForwardItem().getVideo().getOriginCover(), this.mCoverView.getWidth(), this.mCoverView.getHeight());
            }
        } else {
            this.mCoverView.setVisibility(8);
        }
    }

    public final void J() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45675, new Class[0], Void.TYPE);
            return;
        }
        O();
    }

    public void O() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45668, new Class[0], Void.TYPE);
            return;
        }
        ((k) this.n).p();
    }

    public void T() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45674, new Class[0], Void.TYPE);
            return;
        }
        this.n.g();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45663, new Class[0], Void.TYPE);
            return;
        }
        super.k();
        this.mMusicTitleView.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48373a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f48373a, false, 45677, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48373a, false, 45677, new Class[0], Void.TYPE);
                    return;
                }
                if (ForwardVideoViewHolder.this.mMusicTitleView != null && ForwardVideoViewHolder.this.g) {
                    ForwardVideoViewHolder.this.mMusicTitleView.a();
                }
            }
        }, 100);
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45662, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.b();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45664, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45664, new Class[0], Void.TYPE);
            return;
        }
        super.m();
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.c();
        }
    }

    @OnClick({2131495276})
    public void onCheckDetail() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45673, new Class[0], Void.TYPE);
            return;
        }
        T();
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131495122, 2131495112})
    public void onClickPlayPause() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45672, new Class[0], Void.TYPE);
            return;
        }
        ((k) this.n).o();
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45644, new Class[0], Void.TYPE);
            return;
        }
        this.t = new InteractStickerWidget();
        this.m.a((int) C0906R.id.av6, (Widget) this.t);
    }

    public void z() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45646, new Class[0], Void.TYPE);
            return;
        }
        this.mLineDivider.setVisibility(4);
    }

    public final void B() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45657, new Class[0], Void.TYPE);
        } else if (this.f48319d.getForwardItem() != null && this.f48319d.getForwardItem().getAuthor() != null) {
            b(this.mOriginDescView, this.f48319d.getForwardItem());
        }
    }

    public void I() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45647, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45647, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mOriginRootView.setOutlineProvider(new dp(this.mOriginRootView.getResources().getDimensionPixelOffset(C0906R.dimen.gh)));
            this.mOriginRootView.setClipToOutline(true);
        }
    }

    public final void N() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45649, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45649, new Class[0], Void.TYPE);
        } else if (this.f48319d.getForwardItem() != null) {
            new a.C0734a().a(this.f48319d.getForwardItem()).a(this.t.e()).a().b();
        }
    }

    public final int[] p() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45661, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, s, false, 45661, new Class[0], int[].class);
        }
        return new int[]{this.mMusicLayout.getLayoutParams().width, this.mMusicLayout.getLayoutParams().height};
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45650, new Class[0], Void.TYPE);
        } else if (this.mVideoView != null) {
            float[] fArr = new float[9];
            Matrix matrix = new Matrix();
            this.mVideoView.getTransform(matrix);
            matrix.getValues(fArr);
            a((int) (((float) this.mVideoLayout.getLayoutParams().width) * fArr[0]), (int) (((float) this.mVideoLayout.getLayoutParams().height) * fArr[4]), (int) fArr[2], (int) fArr[5]);
        }
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45656, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f48319d.getForwardItem() == null || this.f48319d.getForwardItem().getVideo() == null)) {
            a((View) this.mVideoLayout, this.f48319d.getForwardItem().getVideo().getWidth(), this.f48319d.getForwardItem().getVideo().getHeight());
            a(this.mVideoLayout.getLayoutParams().width, this.mVideoLayout.getLayoutParams().height, 0, 0);
        }
    }

    public final void P() {
        com.ss.android.ugc.aweme.common.f.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45671, new Class[0], Void.TYPE);
        } else if (this.f48319d != null) {
            com.ss.android.ugc.aweme.newfollow.g.a.b(this.f48319d, t());
            d.a().f45349b = ((k) this.n).n();
            d.a().f45351d = ((k) this.n).j().g;
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Aweme aweme = this.f48319d;
            if (PatchProxy.isSupport(new Object[]{aweme}, this, s, false, 45670, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.common.f.a.class)) {
                aVar = (com.ss.android.ugc.aweme.common.f.a) PatchProxy.accessDispatch(new Object[]{aweme}, this, s, false, 45670, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.common.f.a.class);
            } else {
                com.ss.android.ugc.aweme.common.f.a e2 = this.f48318c.e();
                if (e2 instanceof b) {
                    b bVar = (b) e2;
                    if (bVar.a()) {
                        bVar.a(new FollowFeed(aweme));
                    }
                }
                aVar = e2;
            }
            a2.f44610c = aVar;
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, s, false, 45669, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, s, false, 45669, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                ((k) this.n).a(true);
            }
            k kVar = (k) this.n;
            if (PatchProxy.isSupport(new Object[0], kVar, k.l, false, 45465, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], kVar, k.l, false, 45465, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.newfollow.util.d j = kVar.j();
                if (j != null) {
                    j.i = null;
                    kVar.m.f57422c = null;
                    kVar.n = null;
                }
            }
            ((k) this.n).q = true;
            DetailActivity.a(c(), this.f48319d.getAid(), t(), S(), this.f48319d.getEnterpriseType(), R(), Q(), this.mVideoLayout);
        }
    }

    public void u() {
        int i;
        Resources resources;
        MarqueeView marqueeView;
        Object[] objArr;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45653, new Class[0], Void.TYPE);
            return;
        }
        super.u();
        if (this.f48319d.getForwardItem() != null) {
            a(true);
            if (PatchProxy.isSupport(new Object[0], this, s, false, 45654, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, s, false, 45654, new Class[0], Void.TYPE);
            } else {
                ViewGroup.LayoutParams layoutParams = this.mMusicLayout.getLayoutParams();
                layoutParams.width = (int) (((float) this.mVideoLayout.getLayoutParams().width) * 0.6f);
                this.mMusicLayout.setLayoutParams(layoutParams);
                Music music = this.f48319d.getForwardItem().getMusic();
                if (music == null || !music.isOriginMusic()) {
                    this.mTvMusicOriginal.setVisibility(8);
                    this.mIvMusicIcon.setImageResource(2130838964);
                } else {
                    this.mTvMusicOriginal.setVisibility(0);
                    this.mIvMusicIcon.setImageResource(2130839645);
                }
                if (music != null) {
                    marqueeView = this.mMusicTitleView;
                    resources = this.itemView.getResources();
                    i = C0906R.string.bf4;
                    objArr = new Object[2];
                    objArr[0] = music.getMusicName();
                    str = music.getAuthorName();
                } else {
                    marqueeView = this.mMusicTitleView;
                    resources = this.itemView.getResources();
                    i = C0906R.string.bf3;
                    objArr = new Object[2];
                    objArr[0] = this.itemView.getResources().getString(C0906R.string.bem);
                    if (this.f48319d.getForwardItem().getAuthor() == null) {
                        str = "";
                    } else {
                        str = this.f48319d.getForwardItem().getAuthor().getNickname();
                    }
                }
                objArr[1] = str;
                marqueeView.setText(resources.getString(i, objArr));
            }
            this.mProgressbar.setVisibility(8);
            a(1);
        }
    }

    public final void a(FollowVideoViewHolder.a aVar) {
        ((k) this.n).o = aVar;
    }

    @OnClick({2131496854, 2131494996})
    public void onClickOriginContent(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 45667, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 45667, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            O();
        }
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, s, false, 45655, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, s, false, 45655, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (this.mIvLoading.getVisibility() != 0) {
                this.mIvLoading.startAnimation(this.u);
                this.mIvLoading.setVisibility(0);
            }
        } else if (this.mIvLoading.getVisibility() != 8) {
            this.mIvLoading.clearAnimation();
            this.mIvLoading.setVisibility(8);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, s, false, 45660, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, s, false, 45660, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mProgressbar.setVisibility(8);
    }

    @OnClick({2131495273})
    public void onClickMusicTitle(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 45665, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 45665, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!(this.f48319d == null || this.f48319d.getForwardItem() == null || this.f48318c == null || !(this.f48318c instanceof FollowVideoViewHolder.b))) {
            ((FollowVideoViewHolder.b) this.f48318c).a(view, this.itemView, this.f48319d);
        }
    }

    @OnClick({2131495824})
    public void onClickOriginMusic(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 45666, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 45666, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (!(this.f48319d == null || this.f48319d.getForwardItem() == null || this.f48318c == null || !(this.f48318c instanceof FollowVideoViewHolder.b))) {
            ((FollowVideoViewHolder.b) this.f48318c).b(view, this.itemView, this.f48319d);
        }
    }

    public void b(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, s, false, 45641, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, s, false, 45641, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a4h);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a4k);
        a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub4.setLayoutResource(C0906R.layout.a40);
        a(viewStub4.inflate(), 12.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub5.setLayoutResource(C0906R.layout.a42);
        a(viewStub5.inflate(), 12.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwm);
        viewStub6.setLayoutResource(C0906R.layout.a4d);
        a(viewStub6.inflate(), 12.0f);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, s, false, 45658, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, s, false, 45658, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                this.mIvPlay.setVisibility(8);
                c(false);
                this.mIvPause.setVisibility(0);
                return;
            case 1:
                c(false);
                this.mIvPause.setVisibility(8);
                this.mIvPlay.setVisibility(0);
                return;
            case 2:
                this.mIvPlay.setVisibility(8);
                this.mIvPause.setVisibility(8);
                c(true);
                break;
            case 3:
                this.mIvPlay.setVisibility(8);
                c(false);
                this.mIvPause.setVisibility(8);
                return;
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.f.f fVar) {
        com.ss.android.ugc.aweme.shortvideo.f.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, s, false, 45659, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, s, false, 45659, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.f.class}, Void.TYPE);
            return;
        }
        this.mProgressbar.a(fVar2, (int) fVar2.f67646a);
    }

    public k a(com.ss.android.ugc.aweme.feed.d dVar, l lVar) {
        com.ss.android.ugc.aweme.feed.d dVar2 = dVar;
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, lVar2}, this, s, false, 45640, new Class[]{com.ss.android.ugc.aweme.feed.d.class, l.class}, k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[]{dVar2, lVar2}, this, s, false, 45640, new Class[]{com.ss.android.ugc.aweme.feed.d.class, l.class}, k.class);
        }
        return new k(this, dVar2, lVar2, R());
    }

    private void a(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, s, false, 45651, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, s, false, 45651, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f48319d.getForwardItem() != null) {
            com.ss.android.ugc.aweme.sticker.c cVar = new com.ss.android.ugc.aweme.sticker.c();
            cVar.b(this.f48319d.getForwardItem().getAuthorUid()).a(t()).c(this.f48319d.getForwardItem().getAid()).d(ai.a().a(this.f48319d.getForwardItem().getRequestId()));
            int i5 = i;
            int i6 = i2;
            new a.C0734a().a(this.f48319d.getForwardItem()).a(this.t.e()).a((com.ss.android.ugc.aweme.sticker.a.b) new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b(i, i2, i3, i4)).a(cVar).a(false).a().a();
        }
    }

    public final void a(Aweme aweme, List<Comment> list, List<User> list2, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{aweme, list, list2, str, str2}, this, s, false, 45642, new Class[]{Aweme.class, List.class, List.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, list, list2, str, str2}, this, s, false, 45642, new Class[]{Aweme.class, List.class, List.class, String.class, String.class}, Void.TYPE);
            return;
        }
        super.a(aweme, list, list2, str, str2);
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45648, new Class[0], Void.TYPE);
        } else if (this.f48319d.getForwardItem() != null) {
            new a.C0734a().a(this.f48319d.getForwardItem()).a(this.t.e()).a().d();
        }
        N();
    }

    public ForwardVideoViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, com.ss.android.ugc.aweme.feed.d dVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        this(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForwardVideoViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, com.ss.android.ugc.aweme.feed.d dVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3, boolean z) {
        super(followFeedLayout, aVar, aVar2, aVar3);
        if (PatchProxy.isSupport(new Object[0], this, s, false, 45643, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, s, false, 45643, new Class[0], Void.TYPE);
        } else {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            this.u = rotateAnimation;
            this.u.setRepeatCount(-1);
            this.u.setInterpolator(new LinearInterpolator());
            this.u.setDuration(1000);
        }
        this.v = z;
        this.n = a(dVar, lVar);
    }
}
