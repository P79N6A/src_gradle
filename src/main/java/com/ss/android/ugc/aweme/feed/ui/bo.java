package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.hitrank.f;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.f.n;
import com.ss.android.ugc.aweme.feed.f.z;
import com.ss.android.ugc.aweme.feed.h.ab;
import com.ss.android.ugc.aweme.feed.h.u;
import com.ss.android.ugc.aweme.feed.k.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.widget.DiggAnimationView;
import com.ss.android.ugc.aweme.festival.common.FestivalResHandler;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.login.a.c;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.main.bt;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.u.v;
import com.ss.android.ugc.aweme.u.w;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bf;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONObject;

public class bo extends e implements Observer<a>, u {
    public static ChangeQuickRedirect l;
    private int A;
    private Drawable B;
    private View.OnClickListener C = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46624a;

        public final void onClick(View view) {
            boolean z;
            int i;
            String str;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{view}, this, f46624a, false, 43220, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f46624a, false, 43220, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            int cg = AbTestManager.a().cg();
            if (cg == 0) {
                z = !d.a().isLogin();
            } else if (cg <= 0 || d.a().isLogin() || bo.this.p || bo.this.f3210b.getUserDigg() != 0 || bo.this.s.b() < cg) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                new w().a(bo.this.r).a(bo.this.f3214f).b(bo.this.f3210b.getAid()).f(bo.this.f3210b).c("click_like").b(bo.this.s.d() ^ true ? 1 : 0).c(1).e();
                if (!bo.this.s.d()) {
                    bo.this.s.c();
                }
                if (TextUtils.equals(bo.this.r, "homepage_hot")) {
                    i = C0906R.string.b92;
                } else {
                    i = C0906R.string.b5f;
                }
                String string = bo.this.h.getString(i);
                bg.a(new c(0));
                if (bo.this.f3210b != null) {
                    str = bo.this.f3210b.getAid();
                } else {
                    str = "";
                }
                e.a((Activity) bo.this.h, bo.this.r, "click_like", ad.a().a("login_title", string).a("group_id", str).a("log_pb", aa.g(str)).f75487b);
            } else if (com.ss.android.ugc.aweme.login.utils.a.a(bo.this.f3210b) && bo.this.f3210b.getUserDigg() == 0) {
                com.bytedance.ies.dmt.ui.d.a.b(bo.this.h, com.ss.android.ugc.aweme.login.utils.a.a(bo.this.f3210b, C0906R.string.drx)).a();
            } else if (bo.this.f3210b.isCanPlay() || bo.this.f3210b.getUserDigg() != 0) {
                if (bo.this.f3210b.getVideoControl() != null && bo.this.f3210b.getVideoControl().timerStatus == 0) {
                    com.bytedance.ies.dmt.ui.d.a.c(bo.this.h, (int) C0906R.string.drc).a();
                } else if (bo.this.p || !com.ss.android.ugc.aweme.utils.u.f75965b.d(bo.this.f3210b) || !com.ss.android.ugc.aweme.utils.u.f75965b.a(bo.this.f3210b)) {
                    DiggAnimationView diggAnimationView = bo.this.m;
                    if (PatchProxy.isSupport(new Object[]{view}, diggAnimationView, DiggAnimationView.f46962a, false, 43635, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, diggAnimationView, DiggAnimationView.f46962a, false, 43635, new Class[]{View.class}, Void.TYPE);
                    } else {
                        if (PatchProxy.isSupport(new Object[0], diggAnimationView, DiggAnimationView.f46962a, false, 43634, new Class[0], Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], diggAnimationView, DiggAnimationView.f46962a, false, 43634, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            Boolean bool = (Boolean) diggAnimationView.getTag(com.ss.android.ugc.aweme.festival.christmas.a.cr6);
                            if (bool != null) {
                                z2 = bool.booleanValue();
                            }
                        }
                        if (z2 || diggAnimationView.isSelected() || com.ss.android.ugc.aweme.theme.a.a(diggAnimationView.getContext())) {
                            h.a(view);
                        } else {
                            diggAnimationView.a();
                        }
                    }
                    if (!NetworkUtils.isNetworkAvailable(bo.this.h)) {
                        com.bytedance.ies.dmt.ui.d.a.b(bo.this.h, (int) C0906R.string.bgf).a();
                    } else {
                        bo.this.a(bo.this.f3210b);
                    }
                } else {
                    com.bytedance.ies.dmt.ui.d.a.c(bo.this.h, (int) C0906R.string.du6).a();
                }
            } else if (bo.this.f3210b.isImage()) {
                com.bytedance.ies.dmt.ui.d.a.b(bo.this.h, (int) C0906R.string.b0y).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.b(bo.this.h, (int) C0906R.string.drx).a();
            }
        }
    };
    DiggAnimationView m;
    TextView n;
    View o;
    public boolean p;
    public ab q;
    public String r;
    public bt s = new bt();
    private int t;
    private int u;
    private int v;
    private View w;
    private int x;
    private int y;
    private int z;

    public final void a(VideoItemParams videoItemParams) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{videoItemParams}, this, l, false, 43194, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams}, this, l, false, 43194, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
        this.n.setVisibility(0);
        this.t = this.f3210b.getStatistics() == null ? 0 : this.f3210b.getStatistics().getDiggCount();
        this.u = this.t;
        this.v = this.f3210b.getUserDigg();
        com.ss.android.ugc.aweme.gesturelog.a a2 = com.ss.android.ugc.aweme.gesturelog.a.a();
        if (a2.b()) {
            a2.a(this.o);
        }
        AwemeStatistics statistics = this.f3210b.getStatistics();
        if (statistics != null) {
            try {
                int diggCount = statistics.getDiggCount();
                if (diggCount < 0 || com.ss.android.ugc.aweme.login.utils.a.a(this.f3210b)) {
                    diggCount = 0;
                }
                this.n.setText(b.a((long) diggCount));
            } catch (NullPointerException unused) {
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43203, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43203, new Class[0], Void.TYPE);
        } else {
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            if (!com.ss.android.ugc.aweme.theme.a.a(this.h) && (layoutParams.width != this.x || layoutParams.height != this.y)) {
                layoutParams.width = this.x;
                layoutParams.height = this.y;
                this.m.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.m.setLayoutParams(layoutParams);
            } else if (!(layoutParams.width == this.z && layoutParams.height == this.A)) {
                layoutParams.width = this.z;
                layoutParams.height = this.A;
                this.m.setLayoutParams(layoutParams);
            }
            a();
        }
        if (this.f3210b.getUserDigg() != 1) {
            z2 = false;
        }
        a(z2);
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43196, new Class[0], Void.TYPE);
            return;
        }
        this.o.setOnClickListener(this.C);
        this.n.setOnClickListener(this.C);
        this.w.setOnClickListener(this.C);
    }

    public final void a(Aweme aweme) {
        Aweme aweme2 = aweme;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, l, false, 43198, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, l, false, 43198, new Class[]{Aweme.class}, Void.TYPE);
        } else if (this.h != null && aweme2 != null) {
            com.ss.android.ugc.aweme.feed.g.e.a().a(this.m, this.r, aa.m(this.f3210b), aa.a(this.f3210b));
            this.g.a("handle_digg_click", (Object) aweme2);
            if (this.p || aweme.getUserDigg() != 0) {
                if (!this.p || aweme.getUserDigg() == 0) {
                    if (aweme.getUserDigg() == 1) {
                        z2 = true;
                    }
                    this.p = z2;
                    h();
                    a(this.p);
                    if (this.p) {
                        this.t++;
                        return;
                    }
                    this.t--;
                } else {
                    this.g.a("video_digg", (Object) 6);
                    this.t--;
                    a(false);
                    if (PatchProxy.isSupport(new Object[]{aweme2}, this, l, false, 43207, new Class[]{Aweme.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aweme2}, this, l, false, 43207, new Class[]{Aweme.class}, Void.TYPE);
                    } else {
                        bg.a(new n());
                        if (!m.a().c()) {
                            com.bytedance.ies.dmt.ui.d.a.b(this.h, (int) C0906R.string.bgf).a();
                        } else {
                            if (aweme2 != null) {
                                new v("like_cancel").e(this.r).f(this.r).a(this.f3214f).f(aweme2).e();
                                if (!com.ss.android.g.a.a() || !TextUtils.equals("opus", this.r)) {
                                    r.a(this.h, "like_cancel", this.r, aweme.getAid(), 0, f());
                                } else if (this.f3213e) {
                                    r.a(this.h, "like_cancel", "personal_homepage", aweme.getAid(), 0, f());
                                } else {
                                    r.a(this.h, "like_cancel", "others_homepage", aweme.getAid(), 0, f());
                                }
                                if (aweme.getAwemeType() != 34) {
                                    a(aweme.getAid(), 0);
                                } else {
                                    g.m(this.h, aweme2);
                                }
                            }
                            return;
                        }
                    }
                }
                return;
            }
            this.g.a("video_digg", (Object) 5);
            this.t++;
            a(true);
            a(aweme2, "click_like");
        }
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, l, false, 43211, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, l, false, 43211, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        if (dataCenter != null) {
            dataCenter.a("video_resume_play", (Observer<a>) this).a("handle_double_click", (Observer<a>) this).a("show_festival_activity_icon", (Observer<a>) this).a("on_page_selected", (Observer<a>) this);
        }
    }

    public final void a(final Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, l, false, 43214, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, l, false, 43214, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
            b(exc);
        } else if (this.h instanceof FragmentActivity) {
            com.ss.android.ugc.aweme.captcha.c.b.a(((FragmentActivity) this.h).getSupportFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46626a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f46626a, false, 43222, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46626a, false, 43222, new Class[0], Void.TYPE);
                        return;
                    }
                    bo.this.q.a();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f46626a, false, 43223, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f46626a, false, 43223, new Class[0], Void.TYPE);
                        return;
                    }
                    bo.this.b(exc);
                }
            });
        }
    }

    private JSONObject f() {
        if (!PatchProxy.isSupport(new Object[0], this, l, false, 43204, new Class[0], JSONObject.class)) {
            return com.ss.android.ugc.aweme.feed.k.b.a(this.f3210b, this.f3214f, this.j, this.r);
        }
        return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, l, false, 43204, new Class[0], JSONObject.class);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43218, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null && com.ss.android.ugc.aweme.login.utils.a.a(this.f3210b)) {
            this.n.setText(PushConstants.PUSH_TYPE_NOTIFY);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43217, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
    }

    private void h() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43219, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a()) {
            Context context = this.h;
            if (this.p) {
                i = C0906R.string.ly;
            } else {
                i = C0906R.string.lz;
            }
            String string = context.getString(i, new Object[]{b.a((long) this.t)});
            this.w.setContentDescription(string);
            this.m.setContentDescription(string);
        }
    }

    public final void a() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43201, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.festival.christmas.a.a()) {
            this.m.setImageDrawable(this.B);
        } else {
            Drawable a2 = FestivalResHandler.a();
            DiggAnimationView diggAnimationView = this.m;
            int i = com.ss.android.ugc.aweme.festival.christmas.a.cr6;
            if (a2 != null) {
                z2 = true;
            }
            diggAnimationView.setTag(i, Boolean.valueOf(z2));
            if (a2 == null) {
                a2 = this.B;
            }
            this.m.setImageDrawable(a2);
        }
    }

    private void c(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, l, false, 43209, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, l, false, 43209, new Class[]{Aweme.class}, Void.TYPE);
        } else if (this.h != null && aweme != null) {
            if (!this.p) {
                this.t++;
                a(true);
                return;
            }
            if (this.p) {
                this.t--;
                a(false);
            }
        }
    }

    public final void b(Exception exc) {
        int i;
        if (PatchProxy.isSupport(new Object[]{exc}, this, l, false, 43216, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, l, false, 43216, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        c(this.f3210b);
        Context context = this.h;
        if (this.q.c() == 1) {
            i = C0906R.string.a5i;
        } else {
            i = C0906R.string.dnt;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(context, exc, i);
    }

    @Subscribe
    public void onEventDiggUpdate(z zVar) {
        if (PatchProxy.isSupport(new Object[]{zVar}, this, l, false, 43213, new Class[]{z.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{zVar}, this, l, false, 43213, new Class[]{z.class}, Void.TYPE);
            return;
        }
        if (zVar != null && TextUtils.equals(zVar.f45321a, aa.m(this.f3210b))) {
            a(zVar.f45322b);
        }
    }

    private com.ss.android.ugc.aweme.app.d.c b(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, l, false, 43208, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.app.d.c.class)) {
            return (com.ss.android.ugc.aweme.app.d.c) PatchProxy.accessDispatch(new Object[]{aweme}, this, l, false, 43208, new Class[]{Aweme.class}, com.ss.android.ugc.aweme.app.d.c.class);
        }
        com.ss.android.ugc.aweme.app.d.c a2 = new com.ss.android.ugc.aweme.app.d.c().a("author_id", aa.a(aweme)).a("request_id", aa.a(aweme, this.f3214f)).a("is_photo", aa.n(aweme));
        if (!TextUtils.isEmpty(aa.e(aweme))) {
            a2.a("poi_id", aa.e(aweme));
        }
        if (aa.c(this.r)) {
            a2.a("poi_type", aa.h(aweme)).a("poi_channel", aa.b()).a("city_info", aa.a()).a("distance_info", aa.i(aweme));
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            com.ss.android.ugc.aweme.arch.widgets.base.a r7 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r7
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = l
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 43212(0xa8cc, float:6.0553E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43212(0xa8cc, float:6.0553E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            if (r7 == 0) goto L_0x01ca
            java.lang.String r0 = r7.f34376a
            r1 = -1
            int r2 = r0.hashCode()
            r3 = -1475411887(0xffffffffa80f0051, float:-7.938163E-15)
            if (r2 == r3) goto L_0x0071
            r3 = 281945252(0x10ce24a4, float:8.130913E-29)
            if (r2 == r3) goto L_0x0067
            r3 = 350216171(0x14dfdfeb, float:2.2605566E-26)
            if (r2 == r3) goto L_0x005d
            r3 = 710615618(0x2a5b2242, float:1.9462993E-13)
            if (r2 == r3) goto L_0x0053
            goto L_0x007b
        L_0x0053:
            java.lang.String r2 = "video_resume_play"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 0
            goto L_0x007c
        L_0x005d:
            java.lang.String r2 = "on_page_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r2 = "show_festival_activity_icon"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 3
            goto L_0x007c
        L_0x0071:
            java.lang.String r2 = "handle_double_click"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007b
            r0 = 1
            goto L_0x007c
        L_0x007b:
            r0 = -1
        L_0x007c:
            switch(r0) {
                case 0: goto L_0x0141;
                case 1: goto L_0x0086;
                case 2: goto L_0x0081;
                case 3: goto L_0x0081;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x01ca
        L_0x0081:
            r10.a()
            goto L_0x01ca
        L_0x0086:
            java.lang.Object r0 = r7.a()
            r7 = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43210(0xa8ca, float:6.055E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00be
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43210(0xa8ca, float:6.055E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ca
        L_0x00be:
            android.content.Context r0 = r10.h
            if (r0 == 0) goto L_0x01ca
            if (r7 == 0) goto L_0x01ca
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r0 == 0) goto L_0x00cc
            goto L_0x01ca
        L_0x00cc:
            boolean r0 = r10.p
            if (r0 != 0) goto L_0x0140
            int r0 = r7.getUserDigg()
            if (r0 != 0) goto L_0x0140
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r10.g
            java.lang.String r1 = "video_digg"
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.a((java.lang.String) r1, (java.lang.Object) r2)
            int r0 = r10.t
            int r0 = r0 + r8
            r10.t = r0
            r10.a((boolean) r8)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43202(0xa8c2, float:6.0539E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0115
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43202(0xa8c2, float:6.0539E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            goto L_0x0126
        L_0x0115:
            com.ss.android.ugc.aweme.feed.widget.DiggAnimationView r0 = r10.m
            int r1 = com.ss.android.ugc.aweme.festival.christmas.a.cr6
            java.lang.Object r0 = r0.getTag(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L_0x0122
            goto L_0x0126
        L_0x0122:
            boolean r9 = r0.booleanValue()
        L_0x0126:
            if (r9 == 0) goto L_0x012e
            com.ss.android.ugc.aweme.feed.widget.DiggAnimationView r0 = r10.m
            com.ss.android.ugc.aweme.feed.k.h.a(r0)
            goto L_0x013b
        L_0x012e:
            android.content.Context r0 = r10.h
            boolean r0 = com.ss.android.ugc.aweme.theme.a.a(r0)
            if (r0 != 0) goto L_0x013b
            com.ss.android.ugc.aweme.feed.widget.DiggAnimationView r0 = r10.m
            r0.a()
        L_0x013b:
            java.lang.String r0 = "click_double_like"
            r10.a((com.ss.android.ugc.aweme.feed.model.Aweme) r7, (java.lang.String) r0)
        L_0x0140:
            return
        L_0x0141:
            java.lang.Object r0 = r7.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L_0x01ca
            boolean r1 = r0.isAd()
            if (r1 == 0) goto L_0x01ca
            int r0 = r0.getUserDigg()
            if (r0 != r8) goto L_0x0157
            r7 = 1
            goto L_0x0158
        L_0x0157:
            r7 = 0
        L_0x0158:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r7)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43200(0xa8c0, float:6.0536E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0190
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r7)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = l
            r3 = 0
            r4 = 43200(0xa8c0, float:6.0536E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ca
        L_0x0190:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f3210b
            if (r0 == 0) goto L_0x01c9
            r10.p = r7
            r10.h()
            com.ss.android.ugc.aweme.feed.widget.DiggAnimationView r0 = r10.m
            r0.setSelected(r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r0.getStatistics()
            if (r0 != 0) goto L_0x01a8
            r0 = 0
            goto L_0x01b2
        L_0x01a8:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f3210b
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r0.getStatistics()
            int r0 = r0.getDiggCount()
        L_0x01b2:
            r10.t = r0
            int r0 = r10.t
            if (r0 >= 0) goto L_0x01ba
            r10.t = r9
        L_0x01ba:
            android.widget.TextView r0 = r10.n
            int r1 = r10.t
            long r1 = (long) r1
            java.lang.String r1 = com.ss.android.ugc.aweme.i18n.b.a(r1)
            r0.setText(r1)
            r10.g()
        L_0x01c9:
            return
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.bo.onChanged(java.lang.Object):void");
    }

    private void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, l, false, 43197, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, l, false, 43197, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3210b != null) {
            this.p = z2;
            h();
            this.m.setSelected(z2);
            if (!z2) {
                try {
                    if (this.v == 1) {
                        if (this.u <= 0) {
                            this.u = 1;
                        }
                        this.n.setText(b.a((long) (this.u - 1)));
                    } else {
                        this.n.setText(b.a((long) this.u));
                    }
                } catch (NullPointerException unused) {
                }
            } else if (this.v == 1) {
                if (this.u <= 0) {
                    this.u = 1;
                }
                this.n.setText(b.a((long) this.u));
            } else {
                this.n.setText(b.a((long) (this.u + 1)));
            }
            this.g.a("update_diig_view", (Object) Boolean.valueOf(z2));
            g();
        }
    }

    public final void a(Pair<String, Integer> pair) {
        Pair<String, Integer> pair2 = pair;
        if (PatchProxy.isSupport(new Object[]{pair2}, this, l, false, 43215, new Class[]{Pair.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pair2}, this, l, false, 43215, new Class[]{Pair.class}, Void.TYPE);
            return;
        }
        bg.a(new ar(13, pair2.first));
        if (com.ss.android.g.a.a() && ((Integer) pair2.second).intValue() == 1) {
            bf.a();
        }
        f.f42393c.a(this.f3210b, 4);
    }

    public final void a(View view) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43193, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43193, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.layout_video_digg);
        this.m = (DiggAnimationView) a2.findViewById(C0906R.id.a4x);
        this.n = (TextView) a2.findViewById(C0906R.id.a50);
        this.o = a2.findViewById(C0906R.id.a4z);
        this.w = a2.findViewById(C0906R.id.a54);
        this.x = (int) UIUtils.dip2Px(this.h, 50.0f);
        this.y = this.x;
        this.A = this.x;
        this.z = this.x;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43195, new Class[0], Void.TYPE);
        } else {
            boolean z3 = !com.ss.android.ugc.aweme.utils.u.a();
            if (this.m != null) {
                z2 = false;
            }
            if ((!z3 && !z2) && this.n != null) {
                this.x = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 36.0f);
                this.y = this.x;
                this.z = this.x;
                this.A = this.x;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.m.getLayoutParams();
                layoutParams.leftMargin = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 1.0f);
                this.m.setLayoutParams(layoutParams);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.n.getLayoutParams();
                layoutParams2.leftMargin = com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 1.0f);
                this.n.setPadding(this.n.getPaddingLeft(), this.n.getPaddingTop(), this.n.getPaddingRight(), this.n.getPaddingBottom() - com.ss.android.ugc.aweme.framework.e.b.a(GlobalContext.getContext(), 3.0f));
                this.n.setLayoutParams(layoutParams2);
            }
        }
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
    }

    public bo(View view, @Nullable String str) {
        super(view);
        this.r = str;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 43192, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 43192, new Class[0], Void.TYPE);
            return;
        }
        this.q = new ab();
        this.q.a(new com.ss.android.ugc.aweme.feed.h.aa());
        this.q.a(this);
        this.B = com.ss.android.ugc.bytex.a.a.a.a(this.h.getResources(), 2130838053);
        bg.c(this);
    }

    private void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, l, false, 43206, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, l, false, 43206, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!this.s.d()) {
            this.s.c();
        }
        if (AbTestManager.a().cg() == 0 || d.a().isLogin()) {
            this.q.a(str, Integer.valueOf(i), this.r);
        } else if (i == 1) {
            this.s.a(this.s.b() + 1);
            this.f3210b.setUserDigg(1);
        } else {
            if (i == 0) {
                this.s.a(Math.max(this.s.b() - 1, 0));
                this.f3210b.setUserDigg(0);
            }
        }
    }

    private void a(Aweme aweme, String str) {
        String str2;
        Aweme aweme2 = aweme;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3}, this, l, false, 43205, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3}, this, l, false, 43205, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        bg.a(new n());
        if (!com.ss.android.g.a.a()) {
            r.onEvent(MobClick.obtain().setEventName("like").setLabelName(this.r).setValue(aa.m(aweme)).setJsonObject(b(aweme).b()));
            new v().e(this.r).f(this.r).a(this.f3214f).f(aweme2).e();
        } else {
            if (!TextUtils.equals("opus", this.r)) {
                r.a(this.h, "like", this.r, aweme.getAid(), 0, f());
            } else if (this.f3213e) {
                r.a(this.h, "like", "personal_homepage", aweme.getAid(), 0, f());
            } else {
                r.a(this.h, "like", "others_homepage", aweme.getAid(), 0, f());
            }
            if (com.ss.android.g.a.b()) {
                str2 = com.ss.android.ugc.aweme.feed.g.c.a(this.f3213e, this.r);
            } else {
                str2 = com.ss.android.ugc.aweme.feed.g.c.a(this.f3214f, this.r, true);
            }
            if (!d.a().isLogin()) {
                new w().a(this.r).a(this.f3214f).b(this.f3210b.getAid()).f(this.f3210b).c(str3).b(this.s.d() ^ true ? 1 : 0).c(0).e();
            } else {
                new v().e(str2).f(str2).a((String) this.g.b("playlist_type", "")).c((String) this.g.b("playlist_id", "")).b((String) this.g.b("playlist_id_key", "")).f(aweme2).e();
            }
        }
        if (aweme.getAwemeType() != 34) {
            a(aweme.getAid(), 1);
        } else {
            g.l(this.h, aweme2);
        }
    }
}
