package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.res.Resources;
import android.support.v4.app.AccessibilityUtil;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.utils.am;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicListActivity;
import com.ss.android.ugc.aweme.music.util.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ex;

public final class bu extends f implements Observer<a> {
    public static ChangeQuickRedirect o;
    ImageView p;
    TextView q;
    MarqueeView r;
    LinearLayout s;

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43293, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.c();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43295, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43295, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a((Observer<a>) this);
        }
    }

    public bu(View view) {
        super(view);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, o, false, 43283, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, o, false, 43283, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_title_music);
        this.r = (MarqueeView) a2.findViewById(C0906R.id.bov);
        this.q = (TextView) a2.findViewById(C0906R.id.bol);
        this.p = (ImageView) a2.findViewById(C0906R.id.bof);
        this.s = (LinearLayout) a2.findViewById(C0906R.id.bou);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, o, false, 43285, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, o, false, 43285, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        dataCenter.a("stopPlayAnimation", (Observer<a>) this).a("startPlayAnimation", (Observer<a>) this).a("pausePlayAnimation", (Observer<a>) this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r0.equals("pausePlayAnimation") != false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.ss.android.ugc.aweme.arch.widgets.base.a r7 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = o
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43294(0xa91e, float:6.0668E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43294(0xa91e, float:6.0668E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            if (r7 == 0) goto L_0x00f6
            java.lang.String r0 = r7.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -2058685350(0xffffffff854af45a, float:-9.542875E-36)
            if (r2 == r3) goto L_0x0062
            r3 = -1661876786(0xffffffff9cf1c5ce, float:-1.5999174E-21)
            if (r2 == r3) goto L_0x0058
            r3 = 307897710(0x125a256e, float:6.8834807E-28)
            if (r2 == r3) goto L_0x004e
            goto L_0x006b
        L_0x004e:
            java.lang.String r2 = "startPlayAnimation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006b
            r8 = 0
            goto L_0x006c
        L_0x0058:
            java.lang.String r2 = "stopPlayAnimation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006b
            r8 = 2
            goto L_0x006c
        L_0x0062:
            java.lang.String r2 = "pausePlayAnimation"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r8 = -1
        L_0x006c:
            switch(r8) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x0076;
                case 2: goto L_0x0071;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x00f6
        L_0x0071:
            r10.g()
            goto L_0x00f6
        L_0x0076:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43292(0xa91c, float:6.0665E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x009a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43292(0xa91c, float:6.0665E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00f6
        L_0x009a:
            com.ss.android.ugc.aweme.feed.widget.MarqueeView r0 = r10.r
            if (r0 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.feed.widget.MarqueeView r0 = r10.r
            r0.b()
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43291(0xa91b, float:6.0664E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00c8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43291(0xa91b, float:6.0664E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00f6
        L_0x00c8:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43290(0xa91a, float:6.0662E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ec
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = o
            r3 = 0
            r4 = 43290(0xa91a, float:6.0662E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00f6
        L_0x00ec:
            com.ss.android.ugc.aweme.feed.widget.MarqueeView r0 = r10.r
            if (r0 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.feed.widget.MarqueeView r0 = r10.r
            r0.a()
        L_0x00f5:
            return
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bu.onChanged(java.lang.Object):void");
    }

    public final void a(VideoItemParams videoItemParams) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        Object[] objArr;
        Resources resources;
        String str6;
        MarqueeView marqueeView;
        String str7;
        String str8;
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, o, false, 43284, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, o, false, 43284, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
        this.p.setVisibility(0);
        if (this.f3210b.getMusic() == null || !this.f3210b.getMusic().isOriginMusic()) {
            this.q.setVisibility(8);
            this.p.setImageResource(2130838964);
        } else {
            this.q.setVisibility(0);
            this.p.setImageResource(2130839645);
        }
        if (com.ss.android.g.a.a()) {
            Aweme aweme = this.f3210b;
            if (PatchProxy.isSupport(new Object[]{aweme, 3}, null, am.f39706a, true, 32605, new Class[]{Aweme.class, Integer.TYPE}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, 3}, null, am.f39706a, true, 32605, new Class[]{Aweme.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            } else {
                if (aweme != null) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        OmVast omVast = awemeRawAd.getOmVast();
                        if (omVast != null && omVast.providerType == 3) {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                this.r.setText((int) C0906R.string.bsq);
            } else {
                Music music = this.f3210b.getMusic();
                User author = this.f3210b.getAuthor();
                if (PatchProxy.isSupport(new Object[]{music, author}, this, o, false, 43288, new Class[]{Music.class, User.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{music, author}, this, o, false, 43288, new Class[]{Music.class, User.class}, Void.TYPE);
                } else {
                    int i = C0906R.string.bdn;
                    if (music != null) {
                        if (!TextUtils.isEmpty(music.getOwnerId())) {
                            if (AbTestManager.a().m() == 4 || AbTestManager.a().m() == 5) {
                                MarqueeView marqueeView2 = this.r;
                                if (TextUtils.isEmpty(music.getMusicName())) {
                                    str7 = "";
                                } else {
                                    str7 = music.getMusicName();
                                }
                                marqueeView2.setText(str7);
                            } else {
                                this.r.setText(this.h.getResources().getString(C0906R.string.bf4, new Object[]{music.getMusicName(), music.getAuthorName()}));
                            }
                            if (com.ss.android.g.a.b() && TextUtils.isEmpty(music.getMusicName())) {
                                marqueeView = this.r;
                                resources = this.h.getResources();
                                objArr = new Object[2];
                                objArr[0] = this.h.getResources().getString(C0906R.string.bdm);
                                if (TextUtils.isEmpty(music.getOwnerHandle())) {
                                    str6 = "";
                                } else {
                                    str6 = music.getOwnerHandle();
                                }
                            }
                            this.r.setVisibility(0);
                            this.r.setVisibility(4);
                        } else if (TextUtils.isEmpty(music.getMusicName()) && TextUtils.isEmpty(music.getAuthorName())) {
                            this.r.setText(this.h.getResources().getString(C0906R.string.bdm));
                            this.r.setVisibility(0);
                            this.r.setVisibility(4);
                        } else if (AbTestManager.a().m() == 4 || AbTestManager.a().m() == 5) {
                            MarqueeView marqueeView3 = this.r;
                            if (TextUtils.isEmpty(music.getMusicName())) {
                                str8 = "";
                            } else {
                                str8 = music.getMusicName();
                            }
                            marqueeView3.setText(str8);
                            this.r.setVisibility(0);
                            if (this.f3210b != null && !this.f3210b.isCanPlay() && d.a(this.f3210b)) {
                                this.r.setVisibility(4);
                            }
                        } else {
                            MarqueeView marqueeView4 = this.r;
                            Resources resources2 = this.h.getResources();
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = music.getMusicName();
                            objArr = objArr2;
                            str6 = music.getAuthorName();
                            resources = resources2;
                            marqueeView = marqueeView4;
                            i = C0906R.string.bf4;
                        }
                        objArr[1] = str6;
                        marqueeView.setText(resources.getString(i, objArr));
                        this.r.setVisibility(0);
                        this.r.setVisibility(4);
                    } else if (com.ss.android.g.a.b()) {
                        MarqueeView marqueeView5 = this.r;
                        Resources resources3 = this.h.getResources();
                        Object[] objArr3 = new Object[2];
                        objArr3[0] = this.h.getResources().getString(C0906R.string.bdm);
                        if (author == null) {
                            str5 = "";
                        } else {
                            if (PatchProxy.isSupport(new Object[]{author}, null, ex.f75854a, true, 88656, new Class[]{User.class}, String.class)) {
                                Object[] objArr4 = {author};
                                str5 = (String) PatchProxy.accessDispatch(objArr4, null, ex.f75854a, true, 88656, new Class[]{User.class}, String.class);
                            } else if (author == null) {
                                str5 = "";
                            } else if (com.ss.android.g.a.b()) {
                                str5 = ex.b(author);
                            } else {
                                str5 = author.getNickname();
                            }
                        }
                        objArr3[1] = str5;
                        marqueeView5.setText(resources3.getString(C0906R.string.bdn, objArr3));
                    } else if (AbTestManager.a().m() == 4 || AbTestManager.a().m() == 5) {
                        MarqueeView marqueeView6 = this.r;
                        Resources resources4 = this.h.getResources();
                        Object[] objArr5 = new Object[2];
                        objArr5[0] = this.h.getResources().getString(C0906R.string.bem);
                        if (author == null) {
                            str3 = "";
                        } else {
                            str3 = ex.b(author);
                        }
                        objArr5[1] = str3;
                        marqueeView6.setText(resources4.getString(C0906R.string.bf3, objArr5));
                    } else {
                        MarqueeView marqueeView7 = this.r;
                        Resources resources5 = this.h.getResources();
                        Object[] objArr6 = new Object[2];
                        objArr6[0] = this.h.getResources().getString(C0906R.string.bem);
                        if (author == null) {
                            str4 = "";
                        } else {
                            str4 = author.getNickname();
                        }
                        objArr6[1] = str4;
                        marqueeView7.setText(resources5.getString(C0906R.string.bf3, objArr6));
                    }
                    if (this.f3210b != null && this.f3210b.isWithPromotionalMusic()) {
                        if (music == null || TextUtils.isEmpty(music.getMusicName())) {
                            str2 = this.h.getResources().getString(C0906R.string.bsq);
                        } else {
                            str2 = music.getMusicName();
                        }
                        this.r.setText(str2);
                    }
                }
            }
        } else {
            Music music2 = this.f3210b.getMusic();
            User author2 = this.f3210b.getAuthor();
            if (PatchProxy.isSupport(new Object[]{music2, author2}, this, o, false, 43289, new Class[]{Music.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{music2, author2}, this, o, false, 43289, new Class[]{Music.class, User.class}, Void.TYPE);
            } else if (music2 != null) {
                this.r.setText(this.h.getResources().getString(C0906R.string.bf4, new Object[]{music2.getMusicName(), music2.getAuthorName()}));
                this.r.setVisibility(0);
                if (this.f3210b != null && !this.f3210b.isCanPlay() && d.a(this.f3210b)) {
                    this.r.setVisibility(4);
                }
                boolean isOriginMusic = music2.isOriginMusic();
                String musicName = music2.getMusicName();
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(isOriginMusic ? (byte) 1 : 0), musicName}, this, o, false, 43296, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(isOriginMusic), musicName}, this, o, false, 43296, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
                } else if (!com.ss.android.g.a.a()) {
                    if (isOriginMusic) {
                        this.q.setContentDescription(this.h.getString(C0906R.string.bkm));
                        AccessibilityUtil.setAccessibilityDelegate(this.q, new VideoMusicTitleView$2(this));
                    }
                    this.r.setContentDescription(this.h.getString(C0906R.string.bed, new Object[]{musicName}));
                    this.p.setContentDescription(this.h.getString(C0906R.string.bed, new Object[]{musicName}));
                }
            } else {
                MarqueeView marqueeView8 = this.r;
                Resources resources6 = this.h.getResources();
                Object[] objArr7 = new Object[2];
                objArr7[0] = this.h.getResources().getString(C0906R.string.bem);
                if (author2 == null) {
                    str = "";
                } else {
                    str = author2.getNickname();
                }
                objArr7[1] = str;
                marqueeView8.setText(resources6.getString(C0906R.string.bf3, objArr7));
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43287, new Class[0], Void.TYPE);
        } else {
            this.r.setOnClickListener(this.n);
            this.p.setOnClickListener(this.n);
        }
        if (PatchProxy.isSupport(new Object[0], this, o, false, 43286, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 43286, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            this.q.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46639a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f46639a, false, 43297, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f46639a, false, 43297, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (bu.this.f3210b.getMusic() != null && bu.this.f3210b.getMusic().isOriginMusic()) {
                        if (com.ss.android.ugc.aweme.account.d.a().isLogin() || !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
                            MusicListActivity.a(bu.this.h, "860", bu.this.h.getString(C0906R.string.bkm), 1);
                            r.onEvent(MobClick.obtain().setEventName("click_category").setLabelName("popular_song").setValue("860").setJsonObject(new c().a("enter_from", "origin_flag").b()));
                        } else {
                            com.ss.android.ugc.aweme.account.c.b().showLoginAndRegisterView(new IAccountService.d().a((Activity) bu.this.h).a(bu.this.f3211c).b(bu.this.j).a());
                            r.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName("click_origin_flag"));
                        }
                    }
                }
            });
        } else {
            this.q.setOnClickListener(this.n);
        }
    }
}
