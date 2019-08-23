package com.ss.android.ugc.aweme.newfollow.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ah.a;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicListActivity;
import com.ss.android.ugc.aweme.newfollow.b;
import com.ss.android.ugc.aweme.newfollow.f.k;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.newfollow.util.j;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.d.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.u.ao;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dq;
import com.ss.android.ugc.playerkit.videoview.h;

public class VideoFollowFeedDetailActivity extends AbsFollowFeedDetailActivity<FollowFeedVideoContent> implements View.OnClickListener, b.C0650b, f {
    public static ChangeQuickRedirect m;
    @Nullable
    @BindView(2131492969)
    ViewGroup mAdDownloadButton;
    @Nullable
    @BindView(2131494042)
    ImageView mAdDownloadButtonDetail;
    @Nullable
    @BindView(2131495641)
    TextView mAdDownloadButtonPercent;
    @Nullable
    @BindView(2131495643)
    TextView mAdDownloadButtonSize;
    @BindView(2131494836)
    ViewGroup mInteractStickers;
    @BindView(2131495818)
    ImageView mIvMusicIcon;
    @BindView(2131495112)
    ImageView mIvPause;
    @BindView(2131495122)
    ImageView mIvPlay;
    @BindView(2131495084)
    ImageView mLoadingView;
    @BindView(2131495272)
    ViewGroup mMusicLayout;
    @BindView(2131495273)
    ViewGroup mMusicTitleLayout;
    @BindView(2131495834)
    MarqueeView mMusicTitleView;
    @BindView(2131495278)
    ViewGroup mPlayStatusLayout;
    @BindView(2131495824)
    TextView mTvMusicOriginal;
    public k n;
    public boolean o;
    public boolean p;
    public boolean q;
    private InteractStickerWidget r;
    private long s = -1;
    private c t = new c(this, (byte) 0);
    private b u = new b(this, (byte) 0);
    private RotateAnimation v;

    class a implements DragView.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57284a;

        public final void a(float f2, float f3) {
        }

        private a() {
        }

        /* synthetic */ a(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity, byte b2) {
            this();
        }

        public final void a(float f2, float f3, float f4, float f5) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f57284a, false, 61733, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)}, this, f57284a, false, 61733, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) VideoFollowFeedDetailActivity.this.mInteractStickers.getLayoutParams();
            int i = (int) f2;
            layoutParams.width = i;
            int i2 = (int) f3;
            layoutParams.height = i2;
            layoutParams.setMargins((int) f4, (int) f5, 0, 0);
            VideoFollowFeedDetailActivity.this.mInteractStickers.setLayoutParams(layoutParams);
            VideoFollowFeedDetailActivity.this.b(i, i2);
        }
    }

    class b implements com.ss.android.ugc.aweme.sticker.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57286a;

        public final void a() {
            VideoFollowFeedDetailActivity.this.q = true;
            VideoFollowFeedDetailActivity.this.o = true;
        }

        private b() {
        }

        /* synthetic */ b(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity, byte b2) {
            this();
        }

        public final void a(int i, final boolean z) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f57286a, false, 61735, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f57286a, false, 61735, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            VideoFollowFeedDetailActivity.this.g.postDelayed(new Runnable() {
                public final void run() {
                    VideoFollowFeedDetailActivity.this.p = z;
                }
            }, (long) ViewConfiguration.getDoubleTapTimeout());
        }

        public final void a(int i, View view, float f2, float f3, InteractStickerStruct interactStickerStruct, boolean z) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, Float.valueOf(f2), Float.valueOf(f3), interactStickerStruct, Byte.valueOf(z ? (byte) 1 : 0)}, this, f57286a, false, 61734, new Class[]{Integer.TYPE, View.class, Float.TYPE, Float.TYPE, InteractStickerStruct.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, Float.valueOf(f2), Float.valueOf(f3), interactStickerStruct, Byte.valueOf(z)}, this, f57286a, false, 61734, new Class[]{Integer.TYPE, View.class, Float.TYPE, Float.TYPE, InteractStickerStruct.class, Boolean.TYPE}, Void.TYPE);
            } else if (z) {
                VideoFollowFeedDetailActivity.this.n.e();
            } else {
                VideoFollowFeedDetailActivity.this.n.d();
            }
        }
    }

    class c implements com.ss.android.ugc.aweme.sticker.a.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57290a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f57292c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f57290a, false, 61736, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57290a, false, 61736, new Class[0], Void.TYPE);
            } else if (VideoFollowFeedDetailActivity.this.n != null && VideoFollowFeedDetailActivity.this.n.i != null && 3 == VideoFollowFeedDetailActivity.this.n.i.f45077a) {
                VideoFollowFeedDetailActivity.this.n.h();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f57290a, false, 61737, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57290a, false, 61737, new Class[0], Void.TYPE);
            } else if (VideoFollowFeedDetailActivity.this.n != null && VideoFollowFeedDetailActivity.this.n.i != null && 3 != VideoFollowFeedDetailActivity.this.n.i.f45077a) {
                this.f57292c = true;
                VideoFollowFeedDetailActivity.this.n.h();
            }
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f57290a, false, 61738, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57290a, false, 61738, new Class[0], Void.TYPE);
                return;
            }
            if (VideoFollowFeedDetailActivity.this.n != null && VideoFollowFeedDetailActivity.this.n.i != null && 3 == VideoFollowFeedDetailActivity.this.n.i.f45077a && this.f57292c) {
                VideoFollowFeedDetailActivity.this.n.h();
            }
        }

        private c() {
        }

        public final void a(boolean z) {
            if (!z) {
                VideoFollowFeedDetailActivity.this.o = true;
            }
        }

        /* synthetic */ c(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity, byte b2) {
            this();
        }
    }

    public final Activity d() {
        return this;
    }

    public final int f() {
        return C0906R.layout.bg;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, m, false, 61728, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, m, false, 61728, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, m, false, 61713, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, m, false, 61713, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        RemoteImageView remoteImageView = ((FollowFeedVideoContent) this.f57174b).mCover;
        Aweme n2 = n();
        if (!z || n2 == null || n2.getVideo() == null) {
            remoteImageView.setVisibility(8);
            return;
        }
        remoteImageView.setVisibility(0);
        com.ss.android.ugc.aweme.base.c.a(remoteImageView, n2.getVideo().getOriginCover(), remoteImageView.getWidth(), remoteImageView.getHeight());
    }

    public final h a() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 61711, new Class[0], h.class)) {
            return ((FollowFeedVideoContent) this.f57174b).getVideoSurfaceHolder();
        }
        return (h) PatchProxy.accessDispatch(new Object[0], this, m, false, 61711, new Class[0], h.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61702, new Class[0], Void.TYPE);
            return;
        }
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.a();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61704, new Class[0], Void.TYPE);
            return;
        }
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.b();
        }
    }

    public final boolean e() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 61705, new Class[0], Boolean.TYPE)) {
            return isFinishing();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, m, false, 61705, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final /* synthetic */ View j() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61708, new Class[0], FollowFeedVideoContent.class)) {
            return (FollowFeedVideoContent) PatchProxy.accessDispatch(new Object[0], this, m, false, 61708, new Class[0], FollowFeedVideoContent.class);
        }
        FollowFeedVideoContent followFeedVideoContent = new FollowFeedVideoContent(this);
        followFeedVideoContent.setListener(new a(this, (byte) 0));
        return followFeedVideoContent;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61700, new Class[0], Void.TYPE);
            return;
        }
        super.l();
        this.n.d();
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61693, new Class[0], Void.TYPE);
            return;
        }
        new a.C0734a().a(this.f57175c).a(this.j).a().a(getApplicationContext());
    }

    public final long Y() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61722, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, m, false, 61722, new Class[0], Long.TYPE)).longValue();
        } else if (this.n == null) {
            return 0;
        } else {
            k kVar = this.n;
            if (PatchProxy.isSupport(new Object[0], kVar, k.f57151a, false, 61346, new Class[0], Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[0], kVar, k.f57151a, false, 61346, new Class[0], Long.TYPE)).longValue();
            } else if (kVar.f57153c != null) {
                return kVar.f57153c.d();
            } else {
                return 0;
            }
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61709, new Class[0], Void.TYPE);
        } else if (this.q || !this.p || this.r == null) {
            if (!this.o) {
                if (PatchProxy.isSupport(new Object[0], this, m, false, 61701, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, m, false, 61701, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.newfollow.util.a.a(this.mPlayStatusLayout);
                    m();
                }
            }
            this.o = false;
            this.q = false;
        } else {
            this.r.f();
            this.n.d();
            this.p = false;
            this.q = false;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61691, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        this.r = new InteractStickerWidget();
        this.r.a((f) this);
        this.k.a((int) C0906R.id.av6, (Widget) this.r);
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61692, new Class[0], Void.TYPE);
            return;
        }
        Aweme c2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c(this.f57175c);
        if (c2 != null) {
            new a.C0734a().a(c2).a(this.j).a().b();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61720, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61720, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.f57177e) && this.n != null) {
            e a2 = e.a();
            String str = this.f57177e;
            int i = this.n.i.f45077a;
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, a2, e.f57416a, false, 61905, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                e eVar = a2;
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, eVar, e.f57416a, false, 61905, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            } else {
                d c2 = a2.c(str);
                if (c2 != null) {
                    c2.f57412c = i;
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61703, new Class[0], Void.TYPE);
        } else if (this.mMusicTitleView != null) {
            this.mMusicTitleView.c();
        }
        super.i();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61721, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61721, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.n != null) {
            k kVar = this.n;
            if (PatchProxy.isSupport(new Object[0], kVar, k.f57151a, false, 61323, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], kVar, k.f57151a, false, 61323, new Class[0], Void.TYPE);
                return;
            }
            d b2 = kVar.b();
            if (kVar.f57153c != null && (b2 == null || b2.k)) {
                if (kVar.f57153c.f57422c != null) {
                    kVar.f57153c.f57422c.g();
                }
                j.a().a(kVar.f57153c.f57422c);
            }
            if (kVar.f57155e != null) {
                kVar.f57155e.b();
            }
            if (kVar.f57153c != null) {
                kVar.f57153c.a();
            }
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61699, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onResume", true);
        super.onResume();
        if (!dq.a()) {
            this.n.d();
        }
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61723, new Class[0], Void.TYPE);
        } else if (this.s == -1) {
            this.s = System.currentTimeMillis();
        }
        if (this.mAdDownloadButton != null && com.ss.android.ugc.aweme.commercialize.utils.c.y(this.f57175c)) {
            com.ss.android.downloadlib.h a2 = com.ss.android.ugc.aweme.app.c.a.c.a();
            int hashCode = hashCode();
            s sVar = new s(this.f57175c, this, this.mAdDownloadButtonPercent, this.mAdDownloadButtonSize, this.mAdDownloadButtonDetail);
            a2.a((Activity) this, hashCode, (com.ss.android.download.api.b.d) sVar, (com.ss.android.download.api.b.c) com.ss.android.ugc.aweme.app.c.d.d.a(this, this.f57175c, true, null));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onResume", false);
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61717, new Class[0], Void.TYPE);
            return;
        }
        super.h();
        if (this.l) {
            this.mPlayStatusLayout.setVisibility(8);
            this.mMusicLayout.setVisibility(8);
            if (this.mAdDownloadButton != null) {
                this.mAdDownloadButton.setVisibility(8);
            }
        } else {
            this.mPlayStatusLayout.setVisibility(0);
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, m, false, 61718, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, m, false, 61718, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (this.mMusicLayout != null) {
                this.mMusicLayout.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mMusicLayout, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(150);
                ofFloat.start();
            }
            if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, m, false, 61719, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, m, false, 61719, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (this.mAdDownloadButton != null) {
                this.mAdDownloadButton.setVisibility(0);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mAdDownloadButton, "alpha", new float[]{0.0f, 1.0f});
                ofFloat2.setDuration(150);
                ofFloat2.start();
            }
        }
        if (this.r != null) {
            this.p = false;
            this.r.f();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        this.o = true;
        if (!com.ss.android.ugc.aweme.commercialize.utils.c.y(this.f57175c)) {
            String openUrl = this.f57175c.getAwemeRawAd().getOpenUrl();
            if (!g.b(openUrl) || !g.a((Context) this, this.f57175c.getAwemeRawAd().getOpenUrl(), this.f57175c, false, false)) {
                if (g.a((Context) this, this.f57175c, com.ss.android.ugc.aweme.commercialize.utils.c.c(this.f57175c), com.ss.android.ugc.aweme.commercialize.utils.c.d(this.f57175c), this.f57175c.getAwemeRawAd().isUseOrdinaryWeb(), false, 5)) {
                    com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f57175c).a("draw_ad").b("open_url_h5").a((Context) this);
                }
            } else {
                if (com.ss.android.ugc.aweme.commercialize.utils.c.b(openUrl)) {
                    com.ss.android.ugc.aweme.commercialize.h.a().f38876a = this.f57175c;
                }
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f57175c).a("draw_ad").b("open_url_app").a((Context) this);
                g.a((g.a) new r(this));
            }
            com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f57175c).a("draw_ad").b("click").d("more_button").a((Context) this);
        } else if (!com.ss.android.g.a.a()) {
            if (ToolUtils.isInstalledApp((Context) this, com.ss.android.ugc.aweme.commercialize.utils.c.e(this.f57175c))) {
                if (com.ss.android.ugc.aweme.commercialize.utils.c.b(this.f57175c.getAwemeRawAd().getOpenUrl())) {
                    com.ss.android.ugc.aweme.commercialize.h.a().f38876a = this.f57175c;
                }
                if (g.b(this.f57175c.getAwemeRawAd().getOpenUrl())) {
                    com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f57175c).a("draw_ad").b("open_url_app").a((Context) this);
                    g.a((g.a) new q(this));
                }
            }
            com.ss.android.ugc.aweme.app.c.a.c.a().a(com.ss.android.ugc.aweme.commercialize.utils.c.a(this.f57175c), 2, com.ss.android.ugc.aweme.app.c.d.c.a("draw_ad", this.f57175c.getAwemeRawAd(), true), (com.ss.android.download.api.b.a) com.ss.android.ugc.aweme.app.c.d.b.a(this.f57175c.getAwemeRawAd()));
        } else if (g.a((Context) this)) {
            g.b((Context) this, com.ss.android.ugc.aweme.commercialize.utils.c.e(this.f57175c));
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61698, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.n.e();
        this.r.f();
        this.p = false;
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61724, new Class[0], Void.TYPE);
        } else if (this.s != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.s;
            if (currentTimeMillis > 0) {
                if ("poi_page".equalsIgnoreCase(this.f57176d)) {
                    r.a((Context) this, "stay_time", this.f57176d, currentTimeMillis, 0);
                    if (PatchProxy.isSupport(new Object[]{new Long(currentTimeMillis)}, this, m, false, 61725, new Class[]{Long.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{new Long(currentTimeMillis)}, this, m, false, 61725, new Class[]{Long.TYPE}, Void.TYPE);
                    } else {
                        new ao().f(this.f57175c).a(String.valueOf(currentTimeMillis)).b(this.f57176d).e("video_full_screen").c(this.f57176d).e();
                    }
                }
            }
            this.s = -1;
        }
        if (this.mAdDownloadButton != null && com.ss.android.ugc.aweme.commercialize.utils.c.y(this.f57175c)) {
            com.ss.android.ugc.aweme.app.c.a.c.a().a(com.ss.android.ugc.aweme.commercialize.utils.c.a(this.f57175c), hashCode());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z) {
        String str;
        d.b a2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f57175c).a("draw_ad");
        if (z) {
            str = "deeplink_success";
        } else {
            str = "deeplink_failed";
        }
        a2.b(str).a((Context) this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(boolean z) {
        String str;
        d.b a2 = com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f57175c).a("draw_ad");
        if (z) {
            str = "deeplink_success";
        } else {
            str = "deeplink_failed";
        }
        a2.b(str).a((Context) this);
    }

    private void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, m, false, 61714, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, m, false, 61714, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (this.mLoadingView.getVisibility() != 0) {
                this.mLoadingView.startAnimation(this.v);
                this.mLoadingView.setVisibility(0);
            }
        } else if (this.mLoadingView.getVisibility() != 8) {
            this.mLoadingView.clearAnimation();
            this.mLoadingView.setVisibility(8);
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, m, false, 61716, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, m, false, 61716, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.b3s || id == C0906R.id.b43) {
            this.o = true;
            this.n.h();
        } else if (id == C0906R.id.b9f) {
            this.o = true;
            this.n.g();
        } else {
            if (id == C0906R.id.bol) {
                this.o = true;
                if (com.ss.android.g.a.a()) {
                    this.n.g();
                    return;
                }
                k kVar = this.n;
                if (PatchProxy.isSupport(new Object[0], kVar, k.f57151a, false, 61342, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], kVar, k.f57151a, false, 61342, new Class[0], Void.TYPE);
                    return;
                }
                Aweme c2 = kVar.c();
                if (c2 != null && c2.getMusic() != null && c2.getMusic().isOriginMusic()) {
                    MusicListActivity.a((Context) kVar.f57152b.d(), "860", kVar.f57152b.d().getString(C0906R.string.bkm), 1);
                    com.ss.android.ugc.aweme.newfollow.g.a.d(kVar.f57154d, kVar.f57156f, kVar.h);
                }
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, m, false, 61715, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, m, false, 61715, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (NetworkUtils.isNetworkAvailable(this)) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, m, false, 61696, new Class[]{Integer.TYPE}, Void.TYPE)) {
                switch (i) {
                    case 0:
                        this.mIvPlay.setVisibility(8);
                        d(false);
                        this.mIvPause.setVisibility(0);
                        break;
                    case 1:
                        d(false);
                        this.mIvPause.setVisibility(8);
                        this.mIvPlay.setVisibility(0);
                        break;
                    case 2:
                        this.mIvPlay.setVisibility(8);
                        this.mIvPause.setVisibility(8);
                        d(true);
                        break;
                    case 3:
                        this.mIvPlay.setVisibility(8);
                        d(false);
                        this.mIvPause.setVisibility(8);
                        break;
                }
            } else {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, m, false, 61696, new Class[]{Integer.TYPE}, Void.TYPE);
            }
            com.ss.android.ugc.aweme.newfollow.c.b bVar = new com.ss.android.ugc.aweme.newfollow.c.b(1, this.f57175c);
            bVar.f57084c = i;
            bg.a(bVar);
        }
    }

    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i;
        Resources resources;
        MarqueeView marqueeView;
        String str;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, m, false, 61689, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, m, false, 61689, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        k kVar = new k(this.f57175c, this, this.f57176d, this.f57177e);
        kVar.k = this.f57178f;
        if (PatchProxy.isSupport(new Object[]{kVar}, this, m, false, 61710, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar}, this, m, false, 61710, new Class[]{b.a.class}, Void.TYPE);
        } else {
            this.n = kVar;
            this.n.h = this.h;
            this.n.j = getIntent().getIntExtra("play_action_type", 0);
            this.n.g = getIntent().getBooleanExtra("pause_on_close", false);
        }
        ((FollowFeedVideoContent) this.f57174b).setOnClickListener(this);
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61690, new Class[0], Void.TYPE);
        } else {
            ViewGroup.LayoutParams layoutParams = this.mMusicLayout.getLayoutParams();
            layoutParams.width = (int) (((float) UIUtils.getScreenWidth(this)) * 0.6f);
            this.mMusicLayout.setLayoutParams(layoutParams);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            this.v = rotateAnimation;
            this.v.setRepeatCount(-1);
            this.v.setInterpolator(new LinearInterpolator());
            this.v.setDuration(500);
        }
        Aweme aweme = this.f57175c;
        String str2 = this.f57177e;
        if (PatchProxy.isSupport(new Object[]{aweme, str2}, this, m, false, 61697, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2}, this, m, false, 61697, new Class[]{Aweme.class, String.class}, Void.TYPE);
        } else if (aweme != null) {
            a.C0419a.f33262a = aweme.getAid();
            a.C0419a.f33263b = aweme.getAuthorUid();
            if (aweme.getAwemeType() == 13) {
                if (aweme.getForwardItem() == null) {
                    com.ss.android.ugc.aweme.util.c.a("aweme.getForwardItem()为空");
                } else {
                    aweme = aweme.getForwardItem();
                }
            }
            if (aweme.getMusic() == null || !aweme.getMusic().isOriginMusic()) {
                this.mTvMusicOriginal.setVisibility(8);
                this.mIvMusicIcon.setImageResource(2130838964);
            } else {
                this.mTvMusicOriginal.setVisibility(0);
                this.mIvMusicIcon.setImageResource(2130839645);
            }
            Music music = aweme.getMusic();
            if (music != null) {
                marqueeView = this.mMusicTitleView;
                resources = getResources();
                i = C0906R.string.bf4;
                objArr = new Object[2];
                objArr[0] = music.getMusicName();
                str = music.getAuthorName();
            } else {
                marqueeView = this.mMusicTitleView;
                resources = getResources();
                i = C0906R.string.bf3;
                objArr = new Object[2];
                objArr[0] = getResources().getString(C0906R.string.bem);
                if (aweme.getAuthor() == null) {
                    str = "";
                } else {
                    str = aweme.getAuthor().getNickname();
                }
            }
            objArr[1] = str;
            marqueeView.setText(resources.getString(i, objArr));
        }
        Aweme aweme2 = this.f57175c;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, m, false, 61727, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, m, false, 61727, new Class[]{Aweme.class}, Void.TYPE);
        } else if (this.mAdDownloadButton != null) {
            if (!com.ss.android.ugc.aweme.commercialize.utils.c.t(aweme2)) {
                com.ss.android.ugc.aweme.commercialize.utils.ao.a((View) this.mAdDownloadButton, 0);
            } else {
                if (!(this.mDragView == null || this.f57174b == null || ((FollowFeedVideoContent) this.f57174b).mProgressbar == null)) {
                    DragView dragView = this.mDragView;
                    ((FollowFeedVideoContent) this.f57174b).addOnLayoutChangeListener(new o(((FollowFeedVideoContent) this.f57174b).mProgressbar, dragView));
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(UIUtils.dip2Px(this, 4.0f));
                gradientDrawable.setColor(Color.parseColor(com.ss.android.ugc.aweme.commercialize.utils.c.C(this.f57175c)));
                this.mAdDownloadButton.setBackground(gradientDrawable);
                if (this.mAdDownloadButtonPercent != null) {
                    this.mAdDownloadButtonPercent.setTextColor(getResources().getColor(C0906R.color.ao4));
                    this.mAdDownloadButtonPercent.setText(com.ss.android.ugc.aweme.commercialize.utils.c.D(aweme2));
                }
                if (this.mAdDownloadButtonSize != null) {
                    this.mAdDownloadButtonSize.setVisibility(8);
                }
                if (this.mAdDownloadButtonDetail != null) {
                    this.mAdDownloadButtonDetail.setVisibility(8);
                }
                this.mAdDownloadButton.setOnClickListener(new p(this));
            }
        }
        this.mIvPlay.setOnClickListener(this);
        this.mIvPause.setOnClickListener(this);
        this.mTvMusicOriginal.setOnClickListener(this);
        this.mMusicTitleLayout.setOnClickListener(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onCreate", false);
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.f.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, m, false, 61712, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, m, false, 61712, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.f.class}, Void.TYPE);
            return;
        }
        ((FollowFeedVideoContent) this.f57174b).mProgressbar.a(fVar, (int) fVar.f67646a);
        if (com.ss.android.ugc.aweme.commercialize.utils.c.t(this.f57175c) && fVar.f67648c == 7) {
            com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f57175c).a("draw_ad").b("play_over").d("video").b((long) this.f57175c.getVideo().getVideoLength()).a((Context) this);
            com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.f57175c).a("draw_ad").b("play").a((Context) this);
        }
    }

    public final void b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, m, false, 61726, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, m, false, 61726, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        float[] fArr = new float[9];
        Matrix matrix = new Matrix();
        ((TextureView) a().a()).getTransform(matrix);
        matrix.getValues(fArr);
        a((int) (((float) i) * fArr[0]), (int) (((float) i2) * fArr[4]), (int) fArr[2], (int) fArr[5]);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, m, false, 61706, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, m, false, 61706, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mInteractStickers.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.mInteractStickers.setLayoutParams(layoutParams);
        b(i, i2);
        p();
        if (PatchProxy.isSupport(new Object[0], this, m, false, 61694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 61694, new Class[0], Void.TYPE);
            return;
        }
        Aweme c2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c(this.f57175c);
        if (c2 != null) {
            new a.C0734a().a(c2).a(this.j).a(this.n.f()).a().c();
        }
    }

    public final void a(int i, int i2, float f2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2)}, this, m, false, 61707, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2)}, this, m, false, 61707, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mInteractStickers.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.mInteractStickers.setLayoutParams(layoutParams);
        b(i, i2);
    }

    private void a(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, m, false, 61695, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, m, false, 61695, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Aweme c2 = com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.c(this.f57175c);
        if (c2 != null) {
            com.ss.android.ugc.aweme.sticker.c cVar = new com.ss.android.ugc.aweme.sticker.c();
            cVar.b(c2.getAuthorUid()).a(this.f57176d).c(c2.getAid()).d(ai.a().a(c2.getRequestId()));
            int i5 = i;
            int i6 = i2;
            new a.C0734a().a(c2).a(this.j).a((com.ss.android.ugc.aweme.sticker.a.a) this.u).a((com.ss.android.ugc.aweme.sticker.a.b) new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b(i, i2, i3, i4)).a(cVar).a(this.n.f()).a((com.ss.android.ugc.aweme.sticker.a.c) this.t).a().a();
        }
    }
}
