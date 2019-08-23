package com.ss.android.ugc.aweme.newfollow.vh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commercialize.log.aa;
import com.ss.android.ugc.aweme.commercialize.utils.c;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.discover.mob.k;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.hotsearch.d.h;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.newfollow.c.d;
import com.ss.android.ugc.aweme.newfollow.ui.AbsFollowFeedDetailActivity;
import com.ss.android.ugc.aweme.newfollow.ui.FollowEnterDetailViewModel;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.i;
import com.ss.android.ugc.aweme.newfollow.util.j;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.util.n;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.av;
import com.ss.android.ugc.aweme.shortvideo.f.f;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar;
import com.ss.android.ugc.aweme.u.ar;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dp;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

public class FollowVideoViewHolder extends BaseFollowViewHolder implements com.ss.android.ugc.aweme.video.a.a {
    public static ChangeQuickRedirect S;
    protected i T;
    protected o U;
    public a V;
    public boolean W;
    protected boolean X;

    /* renamed from: a  reason: collision with root package name */
    private RotateAnimation f3676a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.feed.b.a f3677b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3678c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3679d;

    /* renamed from: e  reason: collision with root package name */
    private InteractStickerWidget f3680e;
    @Nullable
    @BindView(2131497369)
    ViewStub mDynamicStub;
    @Nullable
    @BindView(2131494836)
    ViewGroup mInteractStickers;
    @Nullable
    @BindView(2131495084)
    ImageView mIvLoading;
    @Nullable
    @BindView(2131495818)
    ImageView mIvMusicIcon;
    @Nullable
    @BindView(2131495112)
    ImageView mIvPause;
    @Nullable
    @BindView(2131495122)
    ImageView mIvPlay;
    @Nullable
    @BindView(2131495272)
    protected ViewGroup mMusicLayout;
    @Nullable
    @BindView(2131495273)
    protected ViewGroup mMusicTitleLayout;
    @Nullable
    @BindView(2131495834)
    MarqueeView mMusicTitleView;
    @Nullable
    @BindView(2131498465)
    VideoPlayerProgressbar mProgressbar;
    @Nullable
    @BindView(2131495824)
    TextView mTvMusicOriginal;
    @Nullable
    @BindView(2131495315)
    protected FrameLayout mVideoLayout;
    @Nullable
    @BindView(2131497551)
    protected KeepSurfaceTextureView mVideoView;

    public interface b extends BaseFollowViewHolder.a {
        void a(View view, View view2, Aweme aweme);

        void b(View view, View view2, Aweme aweme);
    }

    public interface a {
        void a(Aweme aweme);
    }

    @NotNull
    public String D_() {
        return "from_follow_page";
    }

    public final void a(float f2) {
    }

    public final void b(View view) {
    }

    public final void b(e eVar) {
    }

    public final void c(boolean z) {
    }

    public int e() {
        return 1;
    }

    public String g() {
        return null;
    }

    public boolean j() {
        return this.f3679d;
    }

    public final void a(Aweme aweme, List<Comment> list, List<User> list2, BaseFollowViewHolder.a aVar) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, list, list2, aVar}, this, S, false, 62329, new Class[]{Aweme.class, List.class, List.class, BaseFollowViewHolder.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, list, list2, aVar}, this, S, false, 62329, new Class[]{Aweme.class, List.class, List.class, BaseFollowViewHolder.a.class}, Void.TYPE);
            return;
        }
        super.a(aweme, list, list2, aVar);
        this.T.a(aweme);
        this.T.f57423d = d();
        this.f3677b.f45077a = 0;
        this.f3678c = false;
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62330, new Class[0], Void.TYPE);
        } else {
            ViewGroup.LayoutParams layoutParams = this.mMusicLayout.getLayoutParams();
            layoutParams.width = (int) (((float) this.mVideoLayout.getLayoutParams().width) * 0.6f);
            this.mMusicLayout.setLayoutParams(layoutParams);
        }
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62323, new Class[0], Void.TYPE);
        } else {
            new a.C0734a().a(this.j).a(this.f3680e.e()).a().d();
        }
        ab();
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, S, false, 62356, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, S, false, 62356, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
        } else if (!this.v && g(aVar.f76010a)) {
            c(0);
            I();
            this.f3677b.f45077a = 2;
            com.ss.android.ugc.aweme.feed.b.a(this.s, aVar.f76010a, this.j != null ? this.j.getAwemeType() : 0);
            bg.a(new d(this.j));
            a(new f(0, aVar.f76012c));
        }
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, S, false, 62357, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, S, false, 62357, new Class[]{e.class}, Void.TYPE);
        } else if (g(eVar.f76049b)) {
            K();
            a(new f(1));
            c(1);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, S, false, 62358, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, S, false, 62358, new Class[]{String.class}, Void.TYPE);
        } else if (g(str)) {
            c(2);
            this.f3677b.f45077a = 1;
            a(new f(2));
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
        com.ss.android.ugc.aweme.video.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, S, false, 62369, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, S, false, 62369, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        String str = bVar2.f76013a;
        if (g(str)) {
            av.INSTANCE.setVideoId(str);
            E();
            a(new f(5));
            aj();
            ak();
            Context X2 = X();
            aa.a aVar = this.o;
            if (PatchProxy.isSupport(new Object[]{X2, aVar}, null, aa.f39286a, true, 31855, new Class[]{Context.class, aa.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{X2, aVar}, null, aa.f39286a, true, 31855, new Class[]{Context.class, aa.a.class}, Void.TYPE);
            } else {
                aa.a(X2, aVar, "safety_video_play");
            }
            if (c.t(this.j)) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("play").a(X());
            }
            if (TextUtils.equals(d(), "homepage_follow") && (X() instanceof FragmentActivity)) {
                FollowPageFirstFrameViewModel.a((FragmentActivity) X()).d();
            }
        }
    }

    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, S, false, 62374, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, S, false, 62374, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (X() instanceof MainActivity) {
            FollowEnterDetailViewModel.a(d(), (MainActivity) X()).f57208b = z;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean af() {
        this.n.b(this.mHeadUserNameView, this.itemView, this.j, this.j.getAuthor());
        return false;
    }

    private boolean ag() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62338, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, S, false, 62338, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return ah();
        } else {
            return ai();
        }
    }

    private boolean ah() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62339, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, S, false, 62339, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.T.f57422c = al();
        this.T.b();
        return true;
    }

    private void ak() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62361, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.d M = M();
        if (M != null) {
            M.a();
        }
    }

    public void I() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62353, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62353, new Class[0], Void.TYPE);
            return;
        }
        super.I();
        this.x.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57586a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f57586a, false, 62389, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f57586a, false, 62389, new Class[0], Void.TYPE);
                    return;
                }
                if (FollowVideoViewHolder.this.mMusicTitleView != null && FollowVideoViewHolder.this.C) {
                    FollowVideoViewHolder.this.mMusicTitleView.a();
                }
            }
        }, 100);
    }

    public void J() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62354, new Class[0], Void.TYPE);
            return;
        }
        super.J();
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.c();
        }
    }

    public final void K() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62355, new Class[0], Void.TYPE);
            return;
        }
        super.K();
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.b();
        }
    }

    public void P() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62346, new Class[0], Void.TYPE);
            return;
        }
        super.P();
        ae();
        this.W = false;
        if (this.j != null) {
            com.ss.android.ugc.aweme.newfollow.util.d M = M();
            if (M != null) {
                M.f57412c = 0;
            }
        }
    }

    public void V() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62370, new Class[0], Void.TYPE);
            return;
        }
        super.V();
        a(false);
    }

    public void W() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62373, new Class[0], Void.TYPE);
            return;
        }
        super.W();
        if (!com.ss.android.ugc.aweme.c.a.a.a(this.mVideoLayout)) {
            a();
        }
    }

    public final void ad() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62345, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62345, new Class[0], Void.TYPE);
            return;
        }
        this.x.removeMessages(16);
        Message message = new Message();
        message.what = 16;
        message.obj = this.j;
        this.x.sendMessageDelayed(message, 150);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62322, new Class[0], Void.TYPE);
            return;
        }
        this.f3680e = new InteractStickerWidget();
        this.L.a((int) C0906R.id.av6, (Widget) this.f3680e);
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62331, new Class[0], Void.TYPE);
            return;
        }
        if (this.D) {
            D();
        }
    }

    private void aj() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62360, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.d M = M();
        if (M != null) {
            M.a(d(), this.G, this.I, this.f3678c, this.u);
            if (this.itemView.getContext() instanceof Activity) {
                Intent intent = ((Activity) this.itemView.getContext()).getIntent();
                if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                    String stringExtra = intent.getStringExtra("rule_id");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        new ar("video_play_from_push").h(stringExtra).e();
                    }
                }
            }
        }
    }

    private o al() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62379, new Class[0], o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[0], this, S, false, 62379, new Class[0], o.class);
        }
        if (this.U == null) {
            com.ss.android.ugc.aweme.newfollow.util.d M = M();
            if (M == null || M.i == null) {
                this.U = j.a().b();
            } else {
                this.U = M.i;
            }
        }
        return this.U;
    }

    public void A() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62335, new Class[0], Void.TYPE);
            return;
        }
        super.A();
        if (this.mMusicTitleLayout != null) {
            this.mMusicTitleLayout.setOnClickListener(new u(this));
        }
        if (this.mTvMusicOriginal != null) {
            this.mTvMusicOriginal.setOnClickListener(new v(this));
        }
    }

    public void D() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62348, new Class[0], Void.TYPE);
            return;
        }
        super.D();
        if (this.j.getVideo() != null) {
            com.ss.android.ugc.aweme.base.c.a(this.mCoverView, this.j.getVideo().getOriginCover(), this.mCoverView.getWidth(), this.mCoverView.getHeight());
        }
    }

    public void H() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62349, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.mVideoLayout.setOutlineProvider(new dp(this.mVideoLayout.getResources().getDimensionPixelOffset(C0906R.dimen.gh)));
            this.mVideoLayout.setClipToOutline(true);
        }
    }

    public void S() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62371, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62371, new Class[0], Void.TYPE);
        } else if (this.X) {
            this.X = false;
        } else {
            if (!c()) {
                super.S();
            }
            if (R()) {
                J();
                return;
            }
            this.W = true;
            ae();
            g.f().b();
        }
    }

    public final void ab() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62324, new Class[0], Void.TYPE);
            return;
        }
        new a.C0734a().a(this.j).a(this.f3680e.e()).a().b();
    }

    public final void ac() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62328, new Class[0], Void.TYPE);
        } else if (this.mVideoView != null) {
            float[] fArr = new float[9];
            Matrix matrix = new Matrix();
            this.mVideoView.getTransform(matrix);
            matrix.getValues(fArr);
            a(this.j, (int) (((float) this.mVideoLayout.getLayoutParams().width) * fArr[0]), (int) (((float) this.mVideoLayout.getLayoutParams().height) * fArr[4]), (int) fArr[2], (int) fArr[5]);
        }
    }

    public void ae() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62347, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            this.x.removeMessages(16);
            if (this.D || this.B.b()) {
                this.T.e();
            }
        }
    }

    public boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62375, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, S, false, 62375, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!(X() instanceof MainActivity)) {
            return false;
        } else {
            return FollowEnterDetailViewModel.a(d(), (MainActivity) X()).f57208b;
        }
    }

    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62336, new Class[0], Void.TYPE);
            return;
        }
        if (this.j.getVideo() != null) {
            a((View) this.mVideoLayout, this.j.getVideo().getWidth(), this.j.getVideo().getHeight());
            a(this.j, this.mVideoLayout.getLayoutParams().width, this.mVideoLayout.getLayoutParams().height, 0, 0);
        }
    }

    private boolean ai() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62340, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, S, false, 62340, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.ugc.aweme.framework.d.a.a(X()) || this.T.a(false) || !com.ss.android.ugc.aweme.freeflowcard.b.a().j || AbTestManager.a().d().followToastType == 0 || AbTestManager.a().d().newFlowStrategy == 1) {
            this.T.f57422c = al();
            this.T.b();
            return true;
        } else if ((M() == null || M().f57412c != 2) && M().f57412c != 4) {
            c(1);
            return false;
        } else {
            this.T.j();
            return true;
        }
    }

    public void C_() {
        com.ss.android.ugc.aweme.common.f.a aVar;
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62376, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            com.ss.android.ugc.aweme.newfollow.g.a.b(this.j, d());
            com.ss.android.ugc.aweme.feed.g.d.a().f45349b = al();
            com.ss.android.ugc.aweme.newfollow.util.d M = M();
            com.ss.android.ugc.aweme.feed.g.d.a().f45351d = M.g;
            if (M != null) {
                M.i = null;
                this.T.f57422c = null;
                this.U = null;
            }
            com.ss.android.ugc.aweme.feed.a a2 = com.ss.android.ugc.aweme.feed.a.a();
            Aweme aweme = this.j;
            if (PatchProxy.isSupport(new Object[]{aweme}, this, S, false, 62377, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.common.f.a.class)) {
                aVar = (com.ss.android.ugc.aweme.common.f.a) PatchProxy.accessDispatch(new Object[]{aweme}, this, S, false, 62377, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.common.f.a.class);
            } else {
                aVar = this.n.e();
                if (aVar instanceof com.ss.android.ugc.aweme.follow.presenter.b) {
                    com.ss.android.ugc.aweme.follow.presenter.b bVar = (com.ss.android.ugc.aweme.follow.presenter.b) aVar;
                    if (bVar.a()) {
                        bVar.a(new FollowFeed(aweme));
                    }
                }
            }
            a2.f44610c = aVar;
            this.X = true;
            a(true);
        }
    }

    public void n() {
        int i;
        Resources resources;
        MarqueeView marqueeView;
        Object[] objArr;
        String str;
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62333, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        t tVar = new t(this);
        if (this.j.getAuthor() != null) {
            h.a(this.mHeadUserNameView, this.j.getAuthor().getStarBillboardRank(), 4, d(), tVar);
        }
        if (this.j.getMusic() == null || !this.j.getMusic().isOriginMusic()) {
            this.mTvMusicOriginal.setVisibility(8);
            this.mIvMusicIcon.setImageResource(2130838964);
        } else {
            this.mTvMusicOriginal.setVisibility(0);
            this.mIvMusicIcon.setImageResource(2130839645);
        }
        Music music = this.j.getMusic();
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
            if (this.j.getAuthor() == null) {
                str = "";
            } else {
                str = this.j.getAuthor().getNickname();
            }
        }
        objArr[1] = str;
        marqueeView.setText(resources.getString(i, objArr));
        this.mProgressbar.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131495122, 2131495112})
    @Optional
    public void onClickPlayPause() {
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62372, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62372, new Class[0], Void.TYPE);
            return;
        }
        if (this.T.f57422c == null) {
            this.T.f57422c = al();
        }
        if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(X(), (int) C0906R.string.bgf).a();
        } else if (!this.v && this.j != null && this.j.getVideo() != null) {
            if (this.f3677b.f45077a == 2 || this.f3677b.f45077a == 1) {
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.j, d(), this.f3678c);
                ae();
                if (M() != null) {
                    M().f57412c = 3;
                }
            } else if ((this.f3677b.f45077a == 3 || this.f3677b.f45077a == 0) && this.j.getVideo().getProperPlayAddr() != null) {
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.j);
                this.j.getVideo().setRationAndSourceId(this.j.getAid());
                if (AbTestManager.a().d().followToastType == 0 || AbTestManager.a().d().newFlowStrategy == 1) {
                    this.T.f57422c = al();
                    this.T.i();
                } else {
                    this.T.j();
                }
                if (this.V != null) {
                    this.V.a(this.j);
                }
                if (M() != null) {
                    M().f57412c = 4;
                }
            }
        }
    }

    public void a() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, S, false, 62378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, S, false, 62378, new Class[0], Void.TYPE);
        } else if (this.j != null) {
            this.f3678c = true;
            com.ss.android.ugc.aweme.newfollow.util.d M = M();
            if (M != null) {
                M.f57413d.a(16777216);
                M.f57412c = this.f3677b.f45077a;
                M.f57414e = this.mMusicLayout.getLayoutParams().height;
                M.f57415f = this.mMusicLayout.getLayoutParams().width;
                M.i = al();
                if (this.T.f57422c == null) {
                    this.T.f57422c = al();
                }
                k.a(d(), this.j);
                int[] iArr = new int[2];
                this.mVideoView.getLocationOnScreen(iArr);
                if (this.j == null || this.j.getVideo() == null) {
                    f2 = ((float) this.mVideoView.getHeight()) / ((float) this.mVideoView.getWidth());
                } else {
                    f2 = ((float) this.j.getVideo().getHeight()) / ((float) this.j.getVideo().getWidth());
                }
                DragView.b bVar = new DragView.b(iArr[0], iArr[1], this.mVideoView.getHeight(), this.mVideoView.getWidth(), (float) this.mCoverView.getResources().getDimensionPixelOffset(C0906R.dimen.gh), f2);
                int i = this.f3677b.f45077a;
                if (i != 0) {
                    switch (i) {
                        case 2:
                            AbsFollowFeedDetailActivity.a(X(), bVar, this.j, 4, d(), M.j, false, true);
                            break;
                        case 3:
                            break;
                        default:
                            AbsFollowFeedDetailActivity.a(X(), bVar, this.j, 2, d(), M.j, false, true);
                            break;
                    }
                }
                AbsFollowFeedDetailActivity.a(X(), bVar, this.j, 3, d(), M.j, false, true);
                Context X2 = X();
                aa.a aVar = this.o;
                if (PatchProxy.isSupport(new Object[]{X2, aVar}, null, aa.f39286a, true, 31856, new Class[]{Context.class, aa.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{X2, aVar}, null, aa.f39286a, true, 31856, new Class[]{Context.class, aa.a.class}, Void.TYPE);
                } else {
                    aa.a(X2, aVar, "safety_video_click");
                }
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("otherclick").d("video").a(X());
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, S, false, 62350, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, S, false, 62350, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(view);
    }

    private void a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, S, false, 62382, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, S, false, 62382, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.mProgressbar.a(fVar2, (int) fVar2.f67646a);
    }

    private void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, S, false, 62334, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, S, false, 62334, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            if (this.mIvLoading.getVisibility() != 0) {
                this.mIvLoading.startAnimation(this.f3676a);
                this.mIvLoading.setVisibility(0);
            }
        } else if (this.mIvLoading.getVisibility() != 8) {
            this.mIvLoading.clearAnimation();
            this.mIvLoading.setVisibility(8);
        }
    }

    private boolean g(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, S, false, 62366, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, S, false, 62366, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.j == null || !TextUtils.equals(str, this.j.getAid())) {
            return false;
        } else {
            return true;
        }
    }

    public void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, S, false, 62342, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, S, false, 62342, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.b(i);
        switch (i) {
            case 0:
            case 1:
                ad();
                break;
        }
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, S, false, 62365, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, S, false, 62365, new Class[]{String.class}, Void.TYPE);
        } else if (g(str)) {
            a(new f(6));
            a(0);
            com.ss.android.ugc.aweme.newfollow.g.a.a(this.j, this.G, this.I, d());
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, S, false, 62321, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, S, false, 62321, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        super.handleMsg(message);
        if (message2.what == 16) {
            d((Aweme) message2.obj);
        }
    }

    @Subscribe
    public void onFollowFeedDetailEvent(com.ss.android.ugc.aweme.newfollow.c.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, S, false, 62352, new Class[]{com.ss.android.ugc.aweme.newfollow.c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, S, false, 62352, new Class[]{com.ss.android.ugc.aweme.newfollow.c.b.class}, Void.TYPE);
        } else if (X() != null && bVar.f57083b != null && bVar.f57083b.getAid().equals(this.j.getAid())) {
            switch (bVar.f57082a) {
                case 1:
                    c(bVar.f57084c);
                    return;
                case 2:
                    a(0);
                    break;
            }
        }
    }

    private void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, S, false, 62380, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, S, false, 62380, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 0:
                this.mIvPlay.setVisibility(8);
                e(false);
                this.mIvPause.setVisibility(0);
                return;
            case 1:
                e(false);
                this.mIvPause.setVisibility(8);
                this.mIvPlay.setVisibility(0);
                return;
            case 2:
                this.mIvPlay.setVisibility(8);
                this.mIvPause.setVisibility(8);
                e(true);
                break;
            case 3:
                this.mIvPlay.setVisibility(8);
                e(false);
                this.mIvPause.setVisibility(8);
                return;
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, S, false, 62359, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, S, false, 62359, new Class[]{String.class}, Void.TYPE);
        } else if (g(str)) {
            this.W = false;
            E();
            c(0);
            I();
            this.f3677b.f45077a = 2;
            f fVar = new f(11, this.T.c(), this.T.d());
            a(fVar);
            aj();
            ak();
        }
    }

    public void d(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, S, false, 62337, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, S, false, 62337, new Class[]{Aweme.class}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            c(3);
            com.bytedance.ies.dmt.ui.d.a.b(X(), (int) C0906R.string.bgf).a();
        } else if (this.C && !this.v && h() && this.B.c() && aweme != null && this.j != null && TextUtils.equals(this.j.getAid(), aweme.getAid())) {
            com.ss.android.ugc.aweme.newfollow.util.d M = M();
            if (M == null) {
                this.f3677b.f45077a = 4;
            } else if (!M.f57413d.c(16777216)) {
                if (M.f57412c == 3) {
                    if (AbTestManager.a().aD()) {
                        ag();
                        ae();
                    }
                    c(1);
                    this.f3677b.f45077a = 3;
                    f fVar = new f(12, this.T.c(), this.T.d());
                    a(fVar);
                    return;
                }
            } else {
                return;
            }
            boolean ag = ag();
            if (this.V != null && ag) {
                this.V.a(this.j);
            }
        }
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, S, false, 62367, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, S, false, 62367, new Class[]{String.class}, Void.TYPE);
        } else if (g(str)) {
            a(new f(7));
            if (c.t(this.j)) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("play_over").d("video").b((long) this.j.getVideo().getVideoLength()).a(X());
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("play").a(X());
            }
        }
    }

    public void onViewDetachedFromWindow(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, S, false, 62351, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, S, false, 62351, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(view);
        this.x.removeMessages(16);
        ae();
        J();
        this.mProgressbar.setVisibility(8);
        if (!(this.U == null || this.j == null)) {
            g.f().b(this.j);
            if (c.t(this.j)) {
                com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.j).a("result_ad").b("play_break").d("video").a(this.U.c()).b((long) this.j.getVideo().getVideoLength()).a(X());
            }
        }
        if (this.D) {
            D();
            if (this.U != null) {
                j.a().a(this.U);
                this.T.a();
                this.T.f57422c = null;
                this.U = null;
            }
        }
        k();
    }

    public final void b(boolean z) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, S, false, 62368, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, S, false, 62368, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(new f(8, z, 0));
        if (z) {
            i = 2;
        }
        c(i);
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, S, false, 62363, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, S, false, 62363, new Class[]{String.class}, Void.TYPE);
        } else if (g(str)) {
            if (PatchProxy.isSupport(new Object[0], this, S, false, 62364, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, S, false, 62364, new Class[0], Void.TYPE);
            } else if (this.f3677b.f45077a != 3) {
                K();
                c(1);
                this.f3677b.f45077a = 3;
                a(new f(4));
            }
            if (!R()) {
                if (PatchProxy.isSupport(new Object[0], this, S, false, 62362, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, S, false, 62362, new Class[0], Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.newfollow.util.d M = M();
                if (!(M == null || this.U == null)) {
                    M.a(this.f3678c, d(), this.G, this.I);
                }
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, S, false, 62341, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, S, false, 62341, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i);
        switch (i) {
            case 0:
            case 1:
                if (!PatchProxy.isSupport(new Object[0], this, S, false, 62344, new Class[0], Void.TYPE)) {
                    this.x.removeMessages(16);
                    Message message = new Message();
                    message.what = 16;
                    message.obj = this.j;
                    this.x.sendMessage(message);
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, S, false, 62344, new Class[0], Void.TYPE);
                    return;
                }
        }
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, S, false, 62326, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, S, false, 62326, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        viewStub.setLayoutResource(C0906R.layout.a4h);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        viewStub3.setLayoutResource(C0906R.layout.a3z);
        a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwz);
        viewStub4.setLayoutResource(C0906R.layout.a4a);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwk);
        viewStub5.setLayoutResource(C0906R.layout.a40);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwg);
        viewStub6.setLayoutResource(C0906R.layout.a42);
        viewStub6.inflate();
        ViewStub viewStub7 = (ViewStub) view.findViewById(C0906R.id.cwm);
        viewStub7.setLayoutResource(C0906R.layout.a4d);
        a(viewStub7.inflate(), 12.0f);
    }

    public void a(com.ss.android.ugc.aweme.feed.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, S, false, 62327, new Class[]{com.ss.android.ugc.aweme.feed.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, S, false, 62327, new Class[]{com.ss.android.ugc.aweme.feed.d.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.playerkit.videoview.h a2 = com.ss.android.ugc.playerkit.videoview.h.a(this.mVideoView);
        this.T = new i(this.mVideoView, this, dVar);
        this.T.f57424e = true;
        a2.a((com.ss.android.ugc.playerkit.videoview.i) new com.ss.android.ugc.playerkit.videoview.i() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57584a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f57584a, false, 62388, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f57584a, false, 62388, new Class[0], Void.TYPE);
                    return;
                }
                if (FollowVideoViewHolder.this.D) {
                    FollowVideoViewHolder.this.D();
                }
                bg.d(FollowVideoViewHolder.this);
            }

            public final void a(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57584a, false, 62386, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57584a, false, 62386, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                FollowVideoViewHolder.this.v = false;
                FollowVideoViewHolder.this.W = false;
                if (FollowVideoViewHolder.this.h()) {
                    FollowVideoViewHolder.this.w.a(FollowVideoViewHolder.this.M);
                    FollowVideoViewHolder.this.w.d();
                }
                if (FollowVideoViewHolder.this.j.getVideo() != null) {
                    n.a(i, i2, FollowVideoViewHolder.this.mVideoView, ((float) FollowVideoViewHolder.this.j.getVideo().getHeight()) / ((float) FollowVideoViewHolder.this.j.getVideo().getWidth()));
                    FollowVideoViewHolder.this.ac();
                }
                bg.c(FollowVideoViewHolder.this);
            }

            public final void b(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57584a, false, 62387, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f57584a, false, 62387, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (FollowVideoViewHolder.this.j.getVideo() != null) {
                    n.a(i, i2, FollowVideoViewHolder.this.mVideoView, ((float) FollowVideoViewHolder.this.j.getVideo().getHeight()) / ((float) FollowVideoViewHolder.this.j.getVideo().getWidth()));
                    FollowVideoViewHolder.this.ac();
                }
            }
        });
    }

    public FollowVideoViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2, com.ss.android.ugc.aweme.feed.d dVar) {
        this(followFeedLayout, aVar, lVar, aVar2, dVar, false);
    }

    private void a(Aweme aweme, int i, int i2, int i3, int i4) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, S, false, 62325, new Class[]{Aweme.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, S, false, 62325, new Class[]{Aweme.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (aweme2 != null) {
            com.ss.android.ugc.aweme.sticker.c cVar = new com.ss.android.ugc.aweme.sticker.c();
            cVar.b(this.j.getAuthorUid()).a(d()).c(this.j.getAid()).d(ai.a().a(this.j.getRequestId()));
            new a.C0734a().a(aweme2).a((com.ss.android.ugc.aweme.sticker.a.b) new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b(i, i2, i3, i4)).a(cVar).a(false).a(this.f3680e.e()).a().a();
        }
    }

    public FollowVideoViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2, com.ss.android.ugc.aweme.feed.d dVar, boolean z) {
        super(followFeedLayout, aVar, lVar, aVar2);
        this.f3677b = new com.ss.android.ugc.aweme.feed.b.a();
        a(dVar);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f3676a = rotateAnimation;
        this.f3676a.setRepeatCount(-1);
        this.f3676a.setInterpolator(new LinearInterpolator());
        this.f3676a.setDuration(1000);
        this.f3679d = z;
        if (this.f3679d) {
            this.mCommentLayout.setDisplayType(AbTestManager.a().aB());
        }
    }
}
