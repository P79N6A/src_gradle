package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.audio.i;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashEvent;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.f.al;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.ui.seekbar.a.b;
import com.ss.android.ugc.aweme.feed.ui.seekbar.d;
import com.ss.android.ugc.aweme.feed.ui.seekbar.g;
import com.ss.android.ugc.aweme.feed.ui.seekbar.h;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.shortvideo.f.f;
import com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Iterator;
import org.greenrobot.eventbus.Subscribe;

public class bx extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    public AudioControlView m;
    private View n;
    private Activity o;
    private NewVideoPlayerProgressbar p;
    private LineProgressBar q;
    private com.ss.android.ugc.aweme.base.activity.a r;
    private AnimatorSet s;
    private AnimatorSet t;
    private AnimatorSet u;
    private boolean v;
    private boolean w = true;
    private long x;

    @Subscribe
    public void onVideoPlayerStatusUpdate(f fVar) {
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43322, new Class[0], Void.TYPE);
            return;
        }
        this.p.setProgress(0);
        this.x = SystemClock.elapsedRealtime();
        if (this.f3210b != null) {
            if (this.f3210b.getVideoControl() == null || this.f3210b.getVideoControl().showProgressBar != 1) {
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
            }
            if (this.f3210b.getVideo() != null) {
                this.p.setMax(this.f3210b.getVideo().getDuration());
            }
        }
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43323, new Class[0], Void.TYPE);
        } else if (this.o instanceof MainActivity) {
            ((MainActivity) this.o).registerActivityOnKeyDownListener(this.r);
        } else {
            if (this.o instanceof DetailActivity) {
                ((DetailActivity) this.o).a(this.r);
            }
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43324, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43324, new Class[0], Void.TYPE);
        } else if (this.o instanceof MainActivity) {
            ((MainActivity) this.o).unRegisterActivityOnKeyDownListener(this.r);
        } else {
            if (this.o instanceof DetailActivity) {
                ((DetailActivity) this.o).b(this.r);
            }
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43310, new Class[0], Void.TYPE);
        } else if (this.p != null && this.m != null) {
            this.u = new AnimatorSet();
            this.u.play(this.p.getShowAnim()).after(this.m.getHideVolumeAnim());
            this.u.start();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43311, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43311, new Class[0], Void.TYPE);
        } else if (this.p != null && this.m != null) {
            if (this.u != null) {
                this.u.cancel();
            }
            this.p.setAlpha(0.0f);
            this.m.setAlpha(1.0f);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43319, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43319, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43312, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43312, new Class[0], Void.TYPE);
        } else {
            g();
            if (this.s != null) {
                this.s.removeAllListeners();
                this.s.cancel();
            }
            if (this.t != null) {
                this.t.removeAllListeners();
                this.t.cancel();
            }
            if (this.m != null) {
                this.m.f34902d = null;
            }
            if (this.q != null) {
                this.q.c();
                this.q.clearAnimation();
            }
            if (this.p != null) {
                this.p.clearAnimation();
            }
            j();
        }
        bg.d(this);
        this.o = null;
    }

    @Subscribe
    public void onAwesomeSplashEvent(AwesomeSplashEvent awesomeSplashEvent) {
        boolean z;
        if (awesomeSplashEvent.f39420b != 4) {
            z = true;
        } else {
            z = false;
        }
        this.v = z;
    }

    @Subscribe
    public void onShareEndEvent(al alVar) {
        if (PatchProxy.isSupport(new Object[]{alVar}, this, l, false, 43318, new Class[]{al.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{alVar}, this, l, false, 43318, new Class[]{al.class}, Void.TYPE);
            return;
        }
        v.a(this.n, 0);
    }

    @Subscribe
    public void VideoSeekBarHideEvent(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, l, false, 43328, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, l, false, 43328, new Class[]{h.class}, Void.TYPE);
        } else if (this.f3210b != null && hVar.f46900a != null && hVar.f46900a.getAid().equals(this.f3210b.getAid())) {
            if (this.f3210b.getVideoControl() == null || this.f3210b.getVideoControl().showProgressBar != 1) {
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
            }
        }
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, l, false, 43320, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, l, false, 43320, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        if (dataCenter != null) {
            dataCenter.a("load_progress_bar", (Observer<a>) this).a("in_video_view_holder", (Observer<a>) this).a("on_page_unselected", (Observer<a>) this).a("on_page_selected", (Observer<a>) this).a("stopPlayAnimation", (Observer<a>) this);
        }
    }

    @Subscribe
    public void onStopTrackingTouchEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, l, false, 43325, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, l, false, 43325, new Class[]{com.ss.android.ugc.aweme.feed.ui.seekbar.f.class}, Void.TYPE);
        } else if (this.f3210b != null && fVar.f46894b != null && fVar.f46894b.getAid().equals(this.f3210b.getAid())) {
            NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.p;
            double duration = (double) this.f3210b.getVideo().getDuration();
            Double.isNaN(duration);
            newVideoPlayerProgressbar.setProgress((int) (duration * (fVar.f46893a / 100.0d)));
        }
    }

    @Subscribe
    public void onVideoCleanModeEvent(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, l, false, 43327, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, l, false, 43327, new Class[]{b.class}, Void.TYPE);
        } else if (this.f3210b != null && bVar.f46857b != null && bVar.f46857b.getAid().equals(this.f3210b.getAid())) {
            if (bVar.f46856a) {
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
            }
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43306, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43306, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.n = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.view_video_progress_bar);
            this.m = (AudioControlView) this.n.findViewById(C0906R.id.gk);
            this.p = (NewVideoPlayerProgressbar) this.n.findViewById(C0906R.id.dsn);
            this.q = (LineProgressBar) this.n.findViewById(C0906R.id.bbu);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, u.a(1.0d));
            layoutParams.gravity = 80;
            if (com.ss.android.ugc.aweme.profile.a.a().o) {
                int a2 = u.a(8.0d);
                layoutParams.leftMargin = a2;
                layoutParams.rightMargin = a2;
            }
            frameLayout.addView(this.n, layoutParams);
        }
    }

    @Subscribe
    public void onPlayerControllerVideoPlayProgressEvent(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, l, false, 43326, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, l, false, 43326, new Class[]{d.class}, Void.TYPE);
        } else if (this.f3210b != null && dVar.f46867a != null && dVar.f46867a.getAid().equals(this.f3210b.getAid())) {
            if (this.p.getProgress() != 0 || SystemClock.elapsedRealtime() >= this.x + 600) {
                this.p.setMax(this.f3210b.getVideo().getDuration());
                NewVideoPlayerProgressbar newVideoPlayerProgressbar = this.p;
                double duration = (double) this.f3210b.getVideo().getDuration();
                double d2 = (double) dVar.f46870d;
                Double.isNaN(d2);
                Double.isNaN(duration);
                newVideoPlayerProgressbar.setProgress((int) (duration * (d2 / 100.0d)));
            }
        }
    }

    public final void a(VideoItemParams videoItemParams) {
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, l, false, 43307, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, l, false, 43307, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
        if (this.m != null) {
            this.m.setOnAudioControlViewHideListener(new AudioControlView.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46641a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f46641a, false, 43330, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46641a, false, 43330, new Class[0], Void.TYPE);
                        return;
                    }
                    bx.this.f();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f46641a, false, 43331, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46641a, false, 43331, new Class[0], Void.TYPE);
                        return;
                    }
                    bx.this.g();
                }
            });
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r20) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            com.ss.android.ugc.aweme.arch.widgets.base.a r8 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43321(0xa939, float:6.0706E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43321(0xa939, float:6.0706E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            if (r8 == 0) goto L_0x01d6
            java.lang.String r0 = r8.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            r11 = 4
            switch(r2) {
                case -1661876786: goto L_0x0070;
                case -904341062: goto L_0x0066;
                case 350216171: goto L_0x005c;
                case 1628582276: goto L_0x0052;
                case 2000201256: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x007a
        L_0x0048:
            java.lang.String r2 = "in_video_view_holder"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007a
            r0 = 1
            goto L_0x007b
        L_0x0052:
            java.lang.String r2 = "on_page_unselected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007a
            r0 = 3
            goto L_0x007b
        L_0x005c:
            java.lang.String r2 = "on_page_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007a
            r0 = 2
            goto L_0x007b
        L_0x0066:
            java.lang.String r2 = "load_progress_bar"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007a
            r0 = 0
            goto L_0x007b
        L_0x0070:
            java.lang.String r2 = "stopPlayAnimation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007a
            r0 = 4
            goto L_0x007b
        L_0x007a:
            r0 = -1
        L_0x007b:
            switch(r0) {
                case 0: goto L_0x016a;
                case 1: goto L_0x0156;
                case 2: goto L_0x014a;
                case 3: goto L_0x0141;
                case 4: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x01d6
        L_0x0080:
            boolean r0 = r7.w
            if (r0 != 0) goto L_0x01d6
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43313(0xa931, float:6.0694E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00aa
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43313(0xa931, float:6.0694E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00aa:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43314(0xa932, float:6.0696E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00d0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43314(0xa932, float:6.0696E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x010b
        L_0x00d0:
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r0 = r7.p
            if (r0 == 0) goto L_0x010b
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r0 = r7.p
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar.f70512a
            r15 = 0
            r16 = 80253(0x1397d, float:1.12458E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x00fe
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar.f70512a
            r15 = 0
            r16 = 80253(0x1397d, float:1.12458E-40)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0101
        L_0x00fe:
            r0.setProgress(r10)
        L_0x0101:
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r0 = r7.p
            r0.clearAnimation()
            com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar r0 = r7.p
            r0.setVisibility(r11)
        L_0x010b:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43315(0xa933, float:6.0697E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0131
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43315(0xa933, float:6.0697E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0131:
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r7.q
            if (r0 == 0) goto L_0x01d6
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r7.q
            r0.clearAnimation()
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r7.q
            r0.c()
            goto L_0x01d6
        L_0x0141:
            r7.w = r10
            r19.j()
            r19.h()
            return
        L_0x014a:
            r7.w = r9
            r19.f()
            r19.i()
            r19.h()
            return
        L_0x0156:
            java.lang.Object r0 = r8.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0166
            r19.i()
            return
        L_0x0166:
            r19.j()
            return
        L_0x016a:
            java.lang.Object r0 = r8.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43317(0xa935, float:6.07E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x019c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43317(0xa935, float:6.07E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01d6
        L_0x019c:
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r7.q
            if (r0 == 0) goto L_0x01a5
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r7.q
            r0.a()
        L_0x01a5:
            return
        L_0x01a6:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43316(0xa934, float:6.0699E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01cc
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43316(0xa934, float:6.0699E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01d6
        L_0x01cc:
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r7.q
            if (r0 == 0) goto L_0x01d5
            com.ss.android.ugc.aweme.feed.widget.LineProgressBar r0 = r7.q
            r0.b()
        L_0x01d5:
            return
        L_0x01d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bx.onChanged(java.lang.Object):void");
    }

    public bx(View view, @NonNull Activity activity) {
        super(view);
        bg.c(this);
        this.o = activity;
        this.r = new by(this);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i != 25 && i != 24) {
            return false;
        }
        if (com.ss.android.g.a.a()) {
            i a2 = i.a();
            if (i == 24) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z5 ? (byte) 1 : 0)}, a2, i.f34431a, false, 23920, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                i iVar = a2;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z5)}, iVar, i.f34431a, false, 23920, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                synchronized (i.f34432b) {
                    if (a2.f34434c != null) {
                        Iterator<i.a> it2 = a2.f34434c.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().a(z5)) {
                                it2.remove();
                            }
                        }
                    }
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43305, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, l, false, 43305, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            if (!(this.o instanceof MainActivity) || !((MainActivity) this.o).isFeedPage() || !(((MainActivity) this.o).getCurFragment() instanceof MainFragment) || (!((MainFragment) ((MainActivity) this.o).getCurFragment()).l() && !((MainFragment) ((MainActivity) this.o).getCurFragment()).m())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!(this.o instanceof DetailActivity) || !((DetailActivity) this.o).c()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!(this.o instanceof MainActivity) || !MainPageExperimentHelper.b() || !TextUtils.equals(((MainActivity) this.o).getTabChangeManager().f54419e, "FOLLOW")) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z2 || z3 || z4) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            return false;
        }
        g gVar = new g(this.f3210b, this.f3211c, this.f3214f, i, keyEvent);
        bg.a(gVar);
        if (this.p != null) {
            this.p.setAlpha(0.0f);
        }
        if (i == 25) {
            if (PatchProxy.isSupport(new Object[0], this, l, false, 43308, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, l, false, 43308, new Class[0], Void.TYPE);
            } else if (this.m != null) {
                if (this.v) {
                    this.m.b();
                } else if (this.p != null) {
                    this.s = new AnimatorSet();
                    this.s.play(this.m.getShowVolumeAnim()).after(this.p.getHideAnim());
                    this.s.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f46643a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f46643a, false, 43332, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f46643a, false, 43332, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            if (bx.this.m != null) {
                                bx.this.m.b();
                            }
                        }
                    });
                    this.s.start();
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, l, false, 43309, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, l, false, 43309, new Class[0], Void.TYPE);
            } else if (this.m != null) {
                if (this.v) {
                    this.m.c();
                } else if (this.p != null) {
                    this.t = new AnimatorSet();
                    this.t.play(this.m.getShowVolumeAnim()).after(this.p.getHideAnim());
                    this.t.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f46645a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f46645a, false, 43333, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f46645a, false, 43333, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            if (bx.this.m != null) {
                                bx.this.m.c();
                            }
                        }
                    });
                    this.t.start();
                }
            }
        }
        return true;
    }
}
