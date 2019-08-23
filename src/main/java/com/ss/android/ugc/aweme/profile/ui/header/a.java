package com.ss.android.ugc.aweme.profile.ui.header;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.discover.hitrank.c;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.profile.d.aa;
import com.ss.android.ugc.aweme.profile.d.q;
import com.ss.android.ugc.aweme.profile.j;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;
import com.ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.ss.android.ugc.aweme.profile.model.HotSearchSprintStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.t;
import com.ss.android.ugc.aweme.profile.ui.BaseProfileFragment;
import com.ss.android.ugc.aweme.profile.ui.BindAccountView;
import com.ss.android.ugc.aweme.profile.ui.EnterpriseChallengeLayout;
import com.ss.android.ugc.aweme.profile.ui.di;
import com.ss.android.ugc.aweme.profile.ui.widget.ProfileStarRankView;
import com.ss.android.ugc.aweme.profile.ui.y;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.model.VerifyActionManager;
import com.ss.android.ugc.aweme.setting.model.VerifyTypeAction;
import com.ss.android.ugc.aweme.story.api.model.f;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.p;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

public abstract class a extends FrameLayout implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3815a;
    protected StoryCircleView A;
    protected ImageView B;
    protected AnimationImageView C;
    protected AnimationImageView D;
    protected RemoteImageView E;
    protected TextView F;
    protected View G;
    public AwemeViewPagerNavigator H;
    protected LinearLayout I;
    protected TextView J;
    protected TextView K;
    protected TextView L;
    protected TextView M;
    protected FrameLayout N;
    public View O;
    protected BindAccountView P;
    protected RemoteImageView Q;
    protected q R;
    protected aa S;
    protected BaseProfileFragment T;
    protected ay U;
    protected di V;
    protected ProfileStarRankView W;
    protected String aa;
    DmtTextView ab;
    DmtTextView ac;
    protected DataCenter ad;
    protected WidgetManager ae;
    protected C0679a af;
    protected ar ag;
    protected Aweme ah;
    private View ai;
    private View aj;
    private EnterpriseChallengeLayout ak;
    private int al;
    private BindAccountView.a am = new BindAccountView.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62786a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: com.ss.android.ugc.aweme.profile.model.FollowerDetail} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r16 = this;
                r7 = r16
                r8 = 0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r2 = f62786a
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 69410(0x10f22, float:9.7264E-41)
                r1 = r16
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0029
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.meituan.robust.ChangeQuickRedirect r2 = f62786a
                r3 = 0
                r4 = 69410(0x10f22, float:9.7264E-41)
                java.lang.Class[] r5 = new java.lang.Class[r8]
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r16
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0029:
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                boolean r0 = r0.v
                if (r0 == 0) goto L_0x0035
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                r0.k()
                return
            L_0x0035:
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                boolean r0 = r0.u
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L_0x00ab
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.f3817c
                boolean r0 = com.ss.android.ugc.aweme.utils.ex.k(r0)
                if (r0 == 0) goto L_0x00ab
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.ui.header.s r3 = new com.ss.android.ugc.aweme.profile.ui.header.s
                r3.<init>(r7)
                java.lang.Object[] r9 = new java.lang.Object[r2]
                r9[r8] = r3
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.profile.ui.header.a.f3815a
                r12 = 0
                r13 = 69328(0x10ed0, float:9.7149E-41)
                java.lang.Class[] r14 = new java.lang.Class[r2]
                java.lang.Class<android.content.DialogInterface$OnClickListener> r4 = android.content.DialogInterface.OnClickListener.class
                r14[r8] = r4
                java.lang.Class r15 = java.lang.Void.TYPE
                r10 = r0
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                if (r4 == 0) goto L_0x007f
                java.lang.Object[] r9 = new java.lang.Object[r2]
                r9[r8] = r3
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.profile.ui.header.a.f3815a
                r12 = 0
                r13 = 69328(0x10ed0, float:9.7149E-41)
                java.lang.Class[] r14 = new java.lang.Class[r2]
                java.lang.Class<android.content.DialogInterface$OnClickListener> r1 = android.content.DialogInterface.OnClickListener.class
                r14[r8] = r1
                java.lang.Class r15 = java.lang.Void.TYPE
                r10 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0195
            L_0x007f:
                android.support.v7.app.AlertDialog$Builder r4 = new android.support.v7.app.AlertDialog$Builder
                android.content.Context r5 = r0.getContext()
                r4.<init>(r5)
                java.lang.String[] r1 = new java.lang.String[r1]
                android.content.Context r5 = r0.getContext()
                r6 = 2131560195(0x7f0d0703, float:1.8745755E38)
                java.lang.String r5 = r5.getString(r6)
                r1[r8] = r5
                android.content.Context r0 = r0.getContext()
                r5 = 2131560187(0x7f0d06fb, float:1.874574E38)
                java.lang.String r0 = r0.getString(r5)
                r1[r2] = r0
                r4.setItems((java.lang.CharSequence[]) r1, (android.content.DialogInterface.OnClickListener) r3)
                r4.show()
                return
            L_0x00ab:
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                boolean r0 = r0.u
                if (r0 == 0) goto L_0x00c1
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.f3817c
                boolean r0 = com.ss.android.ugc.aweme.utils.ex.k(r0)
                if (r0 != 0) goto L_0x00c1
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                r0.l()
                return
            L_0x00c1:
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                boolean r0 = r0.u
                if (r0 != 0) goto L_0x0195
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.f3817c
                boolean r0 = com.ss.android.ugc.aweme.utils.ex.k(r0)
                if (r0 == 0) goto L_0x0195
                com.ss.android.ugc.aweme.profile.ui.header.a r0 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.d.aa r0 = r0.S
                com.ss.android.ugc.aweme.profile.ui.header.a r3 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                android.content.Context r3 = r3.getContext()
                com.ss.android.ugc.aweme.profile.ui.header.a r4 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.ui.header.a r5 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.model.User r5 = r5.f3817c
                java.lang.String r6 = "com.ss.android.article.news"
                java.lang.Object[] r9 = new java.lang.Object[r1]
                r9[r8] = r5
                r9[r2] = r6
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.profile.ui.header.a.f3815a
                r12 = 0
                r13 = 69327(0x10ecf, float:9.7148E-41)
                java.lang.Class[] r14 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r10 = com.ss.android.ugc.aweme.profile.model.User.class
                r14[r8] = r10
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                r14[r2] = r10
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.FollowerDetail> r15 = com.ss.android.ugc.aweme.profile.model.FollowerDetail.class
                r10 = r4
                boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                r15 = 0
                if (r9 == 0) goto L_0x0126
                java.lang.Object[] r9 = new java.lang.Object[r1]
                r9[r8] = r5
                r9[r2] = r6
                com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.profile.ui.header.a.f3815a
                r12 = 0
                r13 = 69327(0x10ecf, float:9.7148E-41)
                java.lang.Class[] r14 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r1 = com.ss.android.ugc.aweme.profile.model.User.class
                r14[r8] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r14[r2] = r1
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.FollowerDetail> r1 = com.ss.android.ugc.aweme.profile.model.FollowerDetail.class
                r10 = r4
                r2 = r15
                r15 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                r15 = r1
                com.ss.android.ugc.aweme.profile.model.FollowerDetail r15 = (com.ss.android.ugc.aweme.profile.model.FollowerDetail) r15
                goto L_0x0150
            L_0x0126:
                r2 = r15
                if (r5 == 0) goto L_0x014f
                java.util.List r1 = r5.getFollowerDetailList()
                if (r1 == 0) goto L_0x014f
                java.util.List r1 = r5.getFollowerDetailList()
                java.util.Iterator r1 = r1.iterator()
            L_0x0137:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x014f
                java.lang.Object r4 = r1.next()
                r15 = r4
                com.ss.android.ugc.aweme.profile.model.FollowerDetail r15 = (com.ss.android.ugc.aweme.profile.model.FollowerDetail) r15
                java.lang.String r4 = r15.getPackageName()
                boolean r4 = android.text.TextUtils.equals(r4, r6)
                if (r4 == 0) goto L_0x0137
                goto L_0x0150
            L_0x014f:
                r15 = r2
            L_0x0150:
                com.ss.android.ugc.aweme.profile.ui.header.a r1 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.model.User r1 = r1.f3817c
                r0.a(r3, r15, r1, r2)
                java.lang.String r0 = "click_link"
                com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
                java.lang.String r2 = "enter_from"
                com.ss.android.ugc.aweme.profile.ui.header.a r3 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.model.User r3 = r3.f3817c
                boolean r3 = r3.isMe()
                if (r3 == 0) goto L_0x016c
                java.lang.String r3 = "personal_homepage"
                goto L_0x016e
            L_0x016c:
                java.lang.String r3 = "others_homepage"
            L_0x016e:
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "link_type"
                java.lang.String r3 = "news_article"
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "author_id"
                com.ss.android.ugc.aweme.profile.ui.header.a r3 = com.ss.android.ugc.aweme.profile.ui.header.a.this
                com.ss.android.ugc.aweme.profile.model.User r3 = r3.f3817c
                java.lang.String r3 = r3.getUid()
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
                java.lang.String r2 = "scene_id"
                r3 = 1006(0x3ee, float:1.41E-42)
                com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (int) r3)
                java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            L_0x0195:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.header.a.AnonymousClass1.a():void");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(int i) {
            String str;
            if (i == 0) {
                a.this.S.a(a.this.getContext(), d.a().getCurUserFollowDetail("com.ss.android.article.news"), a.this.f3817c, null);
                com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                if (a.this.f3817c.isMe()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                r.a("click_link", (Map) a2.a("enter_from", str).a("link_type", "news_article").a("author_id", a.this.f3817c.getUid()).a("scene_id", 1006).f34114b);
                return;
            }
            if (i == 1) {
                a.this.l();
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    protected String f3816b;

    /* renamed from: c  reason: collision with root package name */
    protected User f3817c;

    /* renamed from: d  reason: collision with root package name */
    protected int f3818d;

    /* renamed from: e  reason: collision with root package name */
    protected int f3819e;

    /* renamed from: f  reason: collision with root package name */
    protected String f3820f;
    protected TextView g;
    @Nullable
    protected DmtTextView h;
    protected TextView i;
    protected TextView j;
    protected ViewGroup k;
    protected ViewGroup l;
    public ViewGroup m;
    protected TextView n;
    protected TranslationStatusView o;
    protected View p;
    protected TextView q;
    protected View r;
    protected String s;
    public float t;
    protected boolean u;
    public boolean v;
    protected View w;
    protected TextView x;
    protected AvatarWithBorderView y;
    protected LiveCircleView z;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.header.a$a  reason: collision with other inner class name */
    public interface C0679a {
        void a();

        void b();
    }

    public void a(ActivityLinkResponse.LinkInfo linkInfo) {
    }

    public final void a(User user) {
    }

    public void aa_() {
    }

    public void b() {
    }

    public final void b(Exception exc) {
    }

    public void b(boolean z2) {
    }

    public void d() {
    }

    public void d(User user) {
    }

    public void f(User user) {
    }

    public void g() {
    }

    public abstract int getLayout();

    public void h() {
    }

    public void h(int i2) {
    }

    public abstract void j();

    public void n() {
    }

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public void setVisible(boolean z2) {
    }

    public int getHeadStatus() {
        return this.al;
    }

    public Aweme getSourceAweme() {
        return this.ah;
    }

    public String getUserUniqueId() {
        return this.aa;
    }

    public final void a(boolean z2, boolean z3) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f3815a, false, 69335, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3815a, false, 69335, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a() && !TimeLockRuler.isTeenModeON()) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3815a, false, 69336, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3815a, false, 69336, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            } else if (!(this.A == null || this.D == null || this.C == null)) {
                if (!z2 || !z3) {
                    i2 = u.a(102.0d);
                } else {
                    i2 = u.a(104.0d);
                    u.a(1.0d);
                }
                ViewGroup.LayoutParams layoutParams = this.r.getLayoutParams();
                layoutParams.width = i2;
                layoutParams.height = i2;
                this.r.setLayoutParams(layoutParams);
            }
            if (z2) {
                if (z3) {
                    g(false);
                } else {
                    g(true);
                }
                this.y.setBorderWidthPx(0);
                return;
            }
            if (this.A != null) {
                this.A.setVisibility(8);
            }
        }
    }

    public final void a(String str, int i2, BlueVBrandInfo blueVBrandInfo, User user) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2), blueVBrandInfo, user}, this, f3815a, false, 69340, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2), blueVBrandInfo, user}, this, f3815a, false, 69340, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Void.TYPE);
            return;
        }
        if (this.T.isViewValid()) {
            if (!TextUtils.isEmpty(str)) {
                this.F.setText(str);
                b(str, i2, blueVBrandInfo, user);
                n();
            }
            this.s = str2;
        }
    }

    public final void a(f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f3815a, false, 69365, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f3815a, false, 69365, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (this.ag != null) {
            this.ag.a(fVar);
        }
    }

    public void a(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5}, this, f3815a, false, 69367, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5}, this, f3815a, false, 69367, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (getActivity() != null) {
            a.C0185a c2 = new a.C0185a(getContext()).c(2130840182);
            Context context = getContext();
            String str6 = str4;
            if (PatchProxy.isSupport(new Object[]{context, str5, str6}, null, com.ss.android.ugc.aweme.profile.ui.n.f62960a, true, 67957, new Class[]{Context.class, String.class, String.class}, String.class)) {
                str3 = (String) PatchProxy.accessDispatch(new Object[]{context, str5, str6}, null, com.ss.android.ugc.aweme.profile.ui.n.f62960a, true, 67957, new Class[]{Context.class, String.class, String.class}, String.class);
            } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str6)) {
                str3 = "";
            } else if (com.ss.android.g.a.a()) {
                str3 = "\"" + str5 + "\" " + context.getResources().getString(C0906R.string.ag8) + " " + str6 + " " + context.getResources().getString(C0906R.string.ag9);
            } else {
                str3 = "\"" + str5 + "\"" + context.getResources().getString(C0906R.string.ag8) + str6 + context.getResources().getString(C0906R.string.ag9);
            }
            c2.b(str3).a((int) C0906R.string.ag_, (DialogInterface.OnClickListener) null).a().b();
            MobClick eventName = MobClick.obtain().setEventName("click_like_count");
            eventName.setLabelName(ex.g(this.f3817c) ? "personal_homepage" : "others_homepage");
            r.onEvent(eventName);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void w() {
        g.a(getContext(), this.f3817c.getBioSecureUrl(), "");
        b("click_link", "weblink");
    }

    private boolean y() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69374, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69374, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (z() || s()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean z() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69375, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69375, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f3817c != null && this.f3817c.getVerificationType() == 2) {
            z2 = true;
        }
        return z2;
    }

    public boolean e() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69385, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69385, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.T != null && this.T.e()) {
            z2 = true;
        }
        return z2;
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69317, new Class[0], Void.TYPE);
            return;
        }
        if (this.ag != null) {
            this.ag.a();
        }
    }

    public Activity getActivity() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69368, new Class[0], Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69368, new Class[0], Activity.class);
        }
        if (this.T == null) {
            Context context = getContext();
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return this.T.getActivity();
    }

    public int getBgAvatarMarginTop() {
        if (!PatchProxy.isSupport(new Object[0], this, f3815a, false, 69319, new Class[0], Integer.TYPE)) {
            return ((ViewGroup.MarginLayoutParams) this.E.getLayoutParams()).topMargin;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69319, new Class[0], Integer.TYPE)).intValue();
    }

    public int getTabCount() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69329, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69329, new Class[0], Integer.TYPE)).intValue();
        } else if (this.H == null) {
            return 0;
        } else {
            return this.H.getTabCount();
        }
    }

    public final boolean m() {
        if (!PatchProxy.isSupport(new Object[0], this, f3815a, false, 69332, new Class[0], Boolean.TYPE)) {
            return ex.a(this.f3817c, ex.g(this.f3817c));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69332, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean o() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69354, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69354, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f3817c != null && this.f3817c.getVerificationType() == 2) {
            z2 = true;
        }
        return z2;
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69389, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69389, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        bg.c(this);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69390, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69390, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69388, new Class[0], Void.TYPE);
            return;
        }
        if (this.ag != null) {
            this.ag.i();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void v() {
        String str;
        if (this.f3817c == null) {
            str = c.a("others_homepage");
        } else {
            str = c.a("others_homepage", this.f3817c.getUid(), this.f3817c.getSecUid());
        }
        h.a().a(str);
    }

    public int getCollectPosi() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69378, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69378, new Class[0], Integer.TYPE)).intValue();
        } else if (this.T == null || this.T.k() == null) {
            return -1;
        } else {
            return this.T.k().indexOf(4);
        }
    }

    public int getDynamicPosi() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69381, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69381, new Class[0], Integer.TYPE)).intValue();
        } else if (this.T == null) {
            return -1;
        } else {
            if (!AbTestManager.a().aV() || !ex.g(this.f3817c)) {
                i2 = 5;
            } else {
                i2 = 8;
            }
            if (this.T.k() == null) {
                return -1;
            }
            return this.T.k().indexOf(Integer.valueOf(i2));
        }
    }

    public int getFavoritePosi() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69379, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69379, new Class[0], Integer.TYPE)).intValue();
        } else if (this.T == null || this.T.k() == null) {
            return -1;
        } else {
            return this.T.k().indexOf(1);
        }
    }

    public int getOriginMusicsionPosi() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69380, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69380, new Class[0], Integer.TYPE)).intValue();
        } else if (this.T == null || this.T.k() == null) {
            return -1;
        } else {
            return this.T.k().indexOf(3);
        }
    }

    public int getPublishPosi() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69377, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69377, new Class[0], Integer.TYPE)).intValue();
        } else if (this.T == null || this.T.k() == null) {
            return -1;
        } else {
            return this.T.k().indexOf(0);
        }
    }

    public int getStoryPosi() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69382, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69382, new Class[0], Integer.TYPE)).intValue();
        } else if (this.T == null || this.T.k() == null) {
            return -1;
        } else {
            return this.T.k().indexOf(2);
        }
    }

    public int getToolPosi() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69383, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69383, new Class[0], Integer.TYPE)).intValue();
        } else if (this.T == null || this.T.k() == null) {
            return -1;
        } else {
            return this.T.k().indexOf(6);
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69323, new Class[0], Void.TYPE);
            return;
        }
        if (this.ab != null && this.ab.getVisibility() == 0) {
            b("show_link", "email");
        }
        if (this.ac != null && this.ac.getVisibility() == 0) {
            b("show_link", "weblink");
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69330, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3817c.isMe()) {
            r.onEvent(MobClick.obtain().setEventName("rocket_click").setLabelName("personal_homepage"));
        } else {
            r.onEvent(MobClick.obtain().setEventName("rocket_click").setLabelName("others_homepage"));
        }
        com.ss.android.ugc.aweme.profile.q.a(getContext(), this.f3817c.getrFansGroupInfo());
    }

    public final boolean s() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69376, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69376, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3817c == null || (this.f3817c.getVerificationType() != 3 && !this.f3817c.isEffectArtist())) {
            return false;
        } else {
            return true;
        }
    }

    public void t() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69386, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69386, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.setText("-");
        }
        if (this.i != null) {
            this.i.setText("-");
        }
        if (this.j != null) {
            this.j.setText("-");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void x() {
        Context context = getContext();
        String bioEmail = this.f3817c.getBioEmail();
        if (PatchProxy.isSupport(new Object[]{context, bioEmail}, null, g.f39783a, true, 32376, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, bioEmail}, null, g.f39783a, true, 32376, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(bioEmail)) {
            g.a(context, new Intent("android.intent.action.SENDTO", Uri.parse("mailto:" + bioEmail)));
        }
        b("click_link", "email");
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69356, new Class[0], Void.TYPE);
        } else if (this.f3817c == null || !TextUtils.isEmpty(this.f3817c.getEnterpriseVerifyReason()) || !y()) {
            this.K.setVisibility(8);
        } else {
            Context context = this.K.getContext();
            if (!TextUtils.isEmpty(this.f3817c.getCustomVerify())) {
                this.K.setText(this.f3817c.getCustomVerify());
            } else if (z()) {
                this.K.setText(C0906R.string.a78);
            } else if (s()) {
                this.K.setText(C0906R.string.a7_);
            }
            if (z()) {
                this.K.setCompoundDrawablesWithIntrinsicBounds(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130839422), null, null, null);
            } else if (s()) {
                this.K.setCompoundDrawablesWithIntrinsicBounds(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130839420), null, null, null);
            }
            this.K.setVisibility(0);
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69331, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3817c.isMe()) {
            r.onEvent(MobClick.obtain().setEventName("weibo_link").setLabelName("personal_homepage"));
        } else {
            r.onEvent(MobClick.obtain().setEventName("weibo_link").setLabelName("others_homepage"));
        }
        Context context = getContext();
        String weiboSchema = this.f3817c.getWeiboSchema();
        String weiboUrl = this.f3817c.getWeiboUrl();
        String weiboNickname = this.f3817c.getWeiboNickname();
        if (PatchProxy.isSupport(new Object[]{context, weiboSchema, weiboUrl, weiboNickname}, null, t.f61677a, true, 67351, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, weiboSchema, weiboUrl, weiboNickname};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, t.f61677a, true, 67351, new Class[]{Context.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            if (t.a(context)) {
                if (!TextUtils.isEmpty(weiboSchema)) {
                    try {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.VIEW");
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.setData(Uri.parse(weiboSchema));
                        context.startActivity(intent);
                    } catch (Exception unused) {
                        com.bytedance.ies.dmt.ui.d.a.b(context, "找不到对应的Activity,微博客户端存在异常").a();
                    }
                }
            } else if (!TextUtils.isEmpty(weiboUrl) && !TextUtils.isEmpty(weiboNickname)) {
                Intent intent2 = new Intent(context, CrossPlatformActivity.class);
                intent2.setData(Uri.parse(weiboUrl));
                intent2.putExtra(PushConstants.TITLE, weiboNickname);
                context.startActivity(intent2);
            }
        }
    }

    public void setClickEventListener(C0679a aVar) {
        this.af = aVar;
    }

    public void setFragment(BaseProfileFragment baseProfileFragment) {
        this.T = baseProfileFragment;
    }

    public void setSourceAweme(Aweme aweme) {
        this.ah = aweme;
    }

    public final void g(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69371, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69371, new Class[]{User.class}, Void.TYPE);
            return;
        }
        j(user);
    }

    private void g(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3815a, false, 69366, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3815a, false, 69366, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.ag != null) {
            this.ag.a(z2);
        }
    }

    public final void a(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69337, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69337, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.T.isViewValid()) {
            if (i2 < 0) {
                i3 = 0;
            } else {
                i3 = i2;
            }
            this.f3819e = i3;
            this.i.setText(b.a((long) i3));
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69341, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69341, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.T.isViewValid()) {
            this.f3820f = b.a((long) i2);
            this.j.setText(this.f3820f);
        }
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3815a, false, 69357, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3815a, false, 69357, new Class[]{String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str) || this.f3817c == null || TextUtils.isEmpty(this.f3817c.getEnterpriseVerifyReason())) {
            this.L.setVisibility(8);
        } else {
            this.L.setVisibility(0);
            this.L.setText(str);
        }
    }

    public void e(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3815a, false, 69392, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3815a, false, 69392, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ey.a("user_id", getContext(), this.aa);
    }

    public final void f(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3815a, false, 69325, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3815a, false, 69325, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2) {
            i();
        }
    }

    public final void j(int i2) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69384, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69384, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Activity activity = getActivity();
        if (i2 != C0906R.id.a_q) {
            z2 = false;
        }
        com.ss.android.ugc.aweme.profile.d.n.a(activity, z2, "certification_user_profile");
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onJsBroacastReceiver(BroadcastMethod.a aVar) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3815a, false, 69391, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3815a, false, 69391, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        try {
            if (TextUtils.equals(aVar.f44432b.getString("eventName"), "star_atlas_cooperation") && aVar.f44432b.has("data") && this.h != null) {
                DmtTextView dmtTextView = this.h;
                if (!aVar.f44432b.getJSONObject("data").getBoolean("is_open")) {
                    i2 = 8;
                }
                dmtTextView.setVisibility(i2);
            }
        } catch (JSONException unused) {
        }
    }

    public void setHeadStatus(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69387, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69387, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.al = i2;
        if (this.ag != null) {
            this.ag.a(this.al);
        }
    }

    public void setVisibleHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69318, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69318, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.w == null || this.E == null)) {
            int i3 = ((ViewGroup.MarginLayoutParams) this.E.getLayoutParams()).topMargin;
            if (i2 >= i3) {
                this.w.getLayoutParams().height = i2 - i3;
                this.t = (float) i2;
            }
        }
    }

    private void j(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69372, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69372, new Class[]{User.class}, Void.TYPE);
        } else if (user != null && !com.ss.android.g.a.a() && this.x != null && this.aj != null && this.ai != null) {
            this.x.setVisibility(8);
            this.ai.setVisibility(8);
            this.aj.setVisibility(8);
            if (user.getDefaultAdCoverUrl() != null) {
                AdCoverTitle adCoverTitle = user.getAdCoverTitle();
                if (adCoverTitle != null) {
                    this.x.setVisibility(0);
                    this.ai.setVisibility(0);
                    this.aj.setVisibility(0);
                    this.x.setText(adCoverTitle.getTitle());
                    this.x.setOnClickListener(new j(this, adCoverTitle));
                }
            }
        }
    }

    public final void b(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69338, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3815a, false, 69338, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.T.isViewValid()) {
            if (i2 < 0) {
                i3 = 0;
            } else {
                i3 = i2;
            }
            this.f3818d = i3;
            this.g.setText(b.a((long) i3));
        }
    }

    public final void c(User user) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69352, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69352, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (this.Q != null) {
            if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69353, new Class[]{User.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69353, new Class[]{User.class}, Boolean.TYPE)).booleanValue();
            } else if (user == null || !com.ss.android.ugc.aweme.commercialize.model.b.a(user) || (user.isLive() && com.ss.android.ugc.aweme.story.a.a() && !user.isBlock())) {
                z2 = false;
            }
            if (z2) {
                this.Q.setVisibility(0);
                com.ss.android.ugc.aweme.commercialize.model.b.a(user, this.Q);
                return;
            }
            this.Q.setVisibility(8);
        }
    }

    public final void d(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3815a, false, 69364, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3815a, false, 69364, new Class[]{View.class}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        } else {
            final int id = view.getId();
            if (id == C0906R.id.ank) {
                if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    if (this.af != null) {
                        this.af.a();
                    }
                    p();
                }
            } else if (id == C0906R.id.ahd) {
                if (!m() || ex.m(this.f3817c)) {
                    r();
                }
            } else if (id == C0906R.id.ahh) {
                if (!m() || ex.m(this.f3817c)) {
                    q();
                }
            } else if (id == C0906R.id.a7x) {
                a(this.f3820f, this.s);
            } else {
                if ((id != C0906R.id.dxd && id != C0906R.id.bvg && id != C0906R.id.a_q) || com.ss.android.ugc.aweme.c.a.a.a(view)) {
                    return;
                }
                if (!d.a().isLogin()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("block_bind_phone", true);
                    e.a(getActivity(), "personal_homepage", "click", bundle, (com.ss.android.ugc.aweme.base.component.f) new com.ss.android.ugc.aweme.base.component.f() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f62792a;

                        public final void a(Bundle bundle) {
                            if (PatchProxy.isSupport(new Object[]{null}, this, f62792a, false, 69415, new Class[]{Bundle.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{null}, this, f62792a, false, 69415, new Class[]{Bundle.class}, Void.TYPE);
                            }
                        }

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f62792a, false, 69414, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f62792a, false, 69414, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.j(id);
                        }
                    });
                    return;
                }
                j(id);
            }
        }
    }

    public final void e(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69362, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69362, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.c()) {
            if (!m()) {
                this.P.setVisibility(0);
                this.P.a(user);
                return;
            }
            this.P.setVisibility(8);
        }
    }

    public final void i(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69373, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69373, new Class[]{User.class}, Void.TYPE);
        } else if (user != null && com.ss.android.g.a.a()) {
            if (this.V == null) {
                this.V = new di(getContext(), this.o, this.n);
            }
            this.V.a(user);
        }
    }

    public void setUser(User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69359, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69359, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69361, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69361, new Class[]{User.class}, Void.TYPE);
        } else if (this.f3817c == null || (TextUtils.equals(this.f3817c.getUid(), user.getUid()) && this.f3817c.getUserStoryCount() != user.getUserStoryCount())) {
            this.ad.a(j.f61548a, (Object) user);
        }
        this.f3817c = user;
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69360, new Class[0], Void.TYPE);
        } else if (this.f3817c != null && !TextUtils.isEmpty(this.f3817c.getShopMicroApp())) {
            ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).preloadMiniApp(this.f3817c.getShopMicroApp());
        }
        if (this.ag != null) {
            this.ag.a(this.f3817c);
        }
    }

    public void b(View view) {
        View.OnClickListener onClickListener;
        View.OnClickListener onClickListener2;
        View.OnClickListener onClickListener3;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3815a, false, 69326, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3815a, false, 69326, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.l.setOnClickListener(new k(this));
        this.k.setOnClickListener(new l(this));
        this.m.setOnClickListener(new m(this));
        TextView textView = this.J;
        if (!com.ss.android.g.a.a()) {
            onClickListener = new n(this);
        } else {
            onClickListener = new o(this);
        }
        textView.setOnClickListener(onClickListener);
        TextView textView2 = this.K;
        if (!com.ss.android.g.a.a()) {
            onClickListener2 = new p(this);
        } else {
            onClickListener2 = new q(this);
        }
        textView2.setOnClickListener(onClickListener2);
        TextView textView3 = this.L;
        if (!com.ss.android.g.a.a()) {
            onClickListener3 = new r(this);
        } else {
            onClickListener3 = new d(this);
        }
        textView3.setOnClickListener(onClickListener3);
        this.P.setEventListener(this.am);
        this.y.setOnClickListener(new e(this));
        this.q.setOnClickListener(new f(this));
    }

    public final void c(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3815a, false, 69363, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3815a, false, 69363, new Class[]{View.class}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view) && this.f3817c != null) {
            VerifyTypeAction verifyTypeAction = null;
            int id = view.getId();
            if (id == C0906R.id.bvg) {
                verifyTypeAction = VerifyActionManager.Companion.getVerifyActionByType(String.valueOf(this.f3817c.getVerificationType()));
            } else if (id == C0906R.id.a_q) {
                verifyTypeAction = VerifyActionManager.Companion.getVerifyActionByType("commerce_user");
            } else if (id == C0906R.id.dxd) {
                verifyTypeAction = VerifyActionManager.Companion.getVerifyActionByType(PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            if (verifyTypeAction != null) {
                String str2 = "";
                switch (this.f3817c.getVerificationType()) {
                    case 1:
                        str2 = "认证号";
                        break;
                    case 2:
                        str2 = "音乐人";
                        break;
                    case 3:
                        str2 = "特效师";
                        break;
                }
                switch (verifyTypeAction.actionType) {
                    case 1:
                        str = "toast";
                        com.bytedance.ies.dmt.ui.d.a.c(getContext(), getContext().getString(C0906R.string.cmp)).a();
                        break;
                    case 2:
                        str = "link";
                        if (!TextUtils.isEmpty(verifyTypeAction.link)) {
                            h.a().a(verifyTypeAction.link);
                            break;
                        }
                        break;
                    default:
                        str = "toast";
                        com.bytedance.ies.dmt.ui.d.a.c(getContext(), getContext().getString(C0906R.string.cmp)).a();
                        break;
                }
                r.a("click_varified_badge", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.f3816b).a("landing_page", str).a("user_type", str2).f34114b);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r0 != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(boolean r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3815a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 69350(0x10ee6, float:9.718E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3815a
            r3 = 0
            r4 = 69350(0x10ee6, float:9.718E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = r10
        L_0x0043:
            if (r0 == 0) goto L_0x0079
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3815a
            r3 = 0
            r4 = 69351(0x10ee7, float:9.7181E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0070
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3815a
            r3 = 0
            r4 = 69351(0x10ee7, float:9.7181E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x0076
        L_0x0070:
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.f3817c
            boolean r0 = com.ss.android.ugc.aweme.utils.ex.n(r0)
        L_0x0076:
            if (r0 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r7 = 0
        L_0x007a:
            r9.v = r7
            com.ss.android.ugc.aweme.profile.ui.BindAccountView r0 = r9.P
            com.ss.android.ugc.aweme.profile.model.User r1 = r9.f3817c
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.header.a.d(boolean):void");
    }

    public final void e(boolean z2) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3815a, false, 69358, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3815a, false, 69358, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        TextView textView = this.M;
        if (!z2) {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }

    public void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f3815a, false, 69320, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f3815a, false, 69320, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.g = (TextView) view2.findViewById(C0906R.id.ahf);
        this.i = (TextView) view2.findViewById(C0906R.id.ahb);
        this.m = (ViewGroup) view2.findViewById(C0906R.id.a7x);
        this.j = (TextView) view2.findViewById(C0906R.id.a4d);
        this.n = (TextView) view2.findViewById(C0906R.id.dqe);
        if (AbTestManager.a().L()) {
            this.n.setTextSize(1, 15.0f);
            this.n.setTextColor(ContextCompat.getColor(getContext(), C0906R.color.hx));
        } else {
            this.n.setTextSize(1, 12.0f);
            this.n.setTextColor(ContextCompat.getColor(getContext(), C0906R.color.a0b));
        }
        this.h = (DmtTextView) view2.findViewById(C0906R.id.cua);
        this.o = (TranslationStatusView) view2.findViewById(C0906R.id.d6m);
        this.l = (ViewGroup) view2.findViewById(C0906R.id.ahd);
        this.k = (ViewGroup) view2.findViewById(C0906R.id.ahh);
        this.p = view2.findViewById(C0906R.id.c70);
        this.q = (TextView) view2.findViewById(C0906R.id.dpp);
        if (PatchProxy.isSupport(new Object[0], this, f3815a, false, 69333, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3815a, false, 69333, new Class[0], Void.TYPE);
        } else if (this.o != null) {
            this.o.a();
        }
        this.S = new aa();
        this.y = (AvatarWithBorderView) view2.findViewById(C0906R.id.ank);
        this.z = (LiveCircleView) view2.findViewById(C0906R.id.bd_);
        this.A = (StoryCircleView) view2.findViewById(C0906R.id.cw3);
        this.B = (ImageView) view2.findViewById(C0906R.id.cw4);
        this.C = (AnimationImageView) view2.findViewById(C0906R.id.i9);
        this.D = (AnimationImageView) view2.findViewById(C0906R.id.i_);
        this.F = (TextView) view2.findViewById(C0906R.id.bqo);
        this.G = view2.findViewById(C0906R.id.c6v);
        this.E = (RemoteImageView) view2.findViewById(C0906R.id.k7);
        this.I = (LinearLayout) view2.findViewById(C0906R.id.czc);
        this.J = (TextView) view2.findViewById(C0906R.id.dxd);
        this.K = (TextView) view2.findViewById(C0906R.id.bvg);
        this.L = (TextView) view2.findViewById(C0906R.id.a_q);
        this.M = (TextView) view2.findViewById(C0906R.id.dxt);
        this.N = (FrameLayout) view2.findViewById(C0906R.id.bx2);
        this.P = (BindAccountView) view2.findViewById(C0906R.id.l6);
        this.O = view2.findViewById(C0906R.id.c73);
        this.R = new com.ss.android.ugc.aweme.profile.d.r(this.I);
        this.H = (AwemeViewPagerNavigator) view2.findViewById(C0906R.id.c77);
        this.w = view2.findViewById(C0906R.id.abq);
        if (this.w != null) {
            this.w.clearFocus();
            this.w.setFocusable(false);
        }
        this.x = (TextView) view2.findViewById(C0906R.id.bp);
        this.ai = view2.findViewById(C0906R.id.bq);
        this.aj = view2.findViewById(C0906R.id.bo);
        this.Q = (RemoteImageView) view2.findViewById(C0906R.id.hu);
        this.r = view2.findViewById(C0906R.id.a2k);
        this.ak = (EnterpriseChallengeLayout) view2.findViewById(C0906R.id.a_m);
        this.W = (ProfileStarRankView) view2.findViewById(C0906R.id.c7g);
        if (!(this.w == null || this.E == null)) {
            this.t = (float) (this.w.getLayoutParams().height + ((ViewGroup.MarginLayoutParams) this.E.getLayoutParams()).topMargin);
        }
        if (!com.ss.android.g.a.a()) {
            aw awVar = new aw(getContext(), this.T, this, this.y, this.A, this.C, this.D, this.B, this);
            this.ag = awVar;
        }
        if (PatchProxy.isSupport(new Object[]{view2}, this, f3815a, false, 69321, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f3815a, false, 69321, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.ab = (DmtTextView) view2.findViewById(C0906R.id.dp_);
        if (this.ab != null) {
            this.ab.setOnClickListener(new b(this));
        }
        this.ac = (DmtTextView) view2.findViewById(C0906R.id.dpa);
        if (this.ac != null) {
            this.ac.setOnClickListener(new c(this));
        }
    }

    public final void b(@Nullable User user) {
        if (PatchProxy.isSupport(new Object[]{user}, this, f3815a, false, 69346, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, this, f3815a, false, 69346, new Class[]{User.class}, Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            this.I.setVisibility(8);
        } else if (!com.ss.android.g.a.a() && user != null && user.isGovMediaVip()) {
            this.I.setVisibility(8);
        } else if (ex.e(user)) {
            this.I.setVisibility(8);
        } else if (user == null || !user.isStar()) {
            this.I.setVisibility(0);
            this.R.a(user);
        } else {
            this.I.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r0 == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3815a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 69348(0x10ee4, float:9.7177E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3815a
            r3 = 0
            r4 = 69348(0x10ee4, float:9.7177E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = r10
        L_0x0043:
            if (r0 == 0) goto L_0x0080
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3815a
            r3 = 0
            r4 = 69349(0x10ee5, float:9.7179E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0070
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3815a
            r3 = 0
            r4 = 69349(0x10ee5, float:9.7179E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x007d
        L_0x0070:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.ae()
            if (r0 != r7) goto L_0x007c
            r0 = 1
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r7 = 0
        L_0x0081:
            r9.u = r7
            com.ss.android.ugc.aweme.profile.ui.BindAccountView r0 = r9.P
            com.ss.android.ugc.aweme.profile.model.User r1 = r9.f3817c
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.header.a.c(boolean):void");
    }

    public void a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f3815a, false, 69342, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel}, this, f3815a, false, 69342, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        if (urlModel != null && this.T.isViewValid()) {
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 100.0f);
            com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.y, urlModel, dip2Px, dip2Px);
            com.ss.android.ugc.aweme.base.c.a(this.E, urlModel, dip2Px, dip2Px);
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3815a, false, 69347, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3815a, false, 69347, new Class[]{String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str) || this.f3817c == null || !TextUtils.isEmpty(this.f3817c.getEnterpriseVerifyReason()) || y()) {
            this.J.setVisibility(8);
            this.J.setText("");
        } else {
            this.J.setVisibility(0);
            this.J.setText(str);
        }
    }

    public final void h(User user) {
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        boolean z2;
        boolean z3;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f3815a, false, 69369, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f3815a, false, 69369, new Class[]{User.class}, Void.TYPE);
            return;
        }
        User user3 = this.f3817c;
        setUser(user);
        if (this.T != null && this.T.isViewValid()) {
            if (PatchProxy.isSupport(new Object[]{user2}, this, f3815a, false, 69370, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user2}, this, f3815a, false, 69370, new Class[]{User.class}, Void.TYPE);
            } else if (!com.ss.android.g.a.a()) {
                if (user.isStar()) {
                    this.q.setVisibility(8);
                    if (this.W != null) {
                        HotSearchSprintStruct sprintSupportUserInfo = user.getSprintSupportUserInfo();
                        if (user.getStarBillboardRank() <= 0 || sprintSupportUserInfo == null) {
                            this.W.setVisibility(8);
                        } else {
                            if (((Integer) SharePrefCache.inst().getHitRankActivityStatus().c()).intValue() != 0) {
                                this.W.setBackgroundImage((String) SharePrefCache.inst().getHitRankActivityProfileBackground().c());
                            }
                            this.W.setVisibility(0);
                            this.W.setRank(user.getStarBillboardRank());
                            this.W.setHitRankPeopleNumber(sprintSupportUserInfo.getSprint());
                            this.W.setHitRankUsers(sprintSupportUserInfo.getHitRankPeoples());
                            this.W.getStarRankView().setOnClickListener(new h(this));
                            this.W.getHitRankView().setOnClickListener(new i(this, sprintSupportUserInfo));
                        }
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
                    marginLayoutParams.topMargin = u.a(12.0d);
                    marginLayoutParams.bottomMargin = u.a(-4.0d);
                    this.n.setLayoutParams(marginLayoutParams);
                    if (this.ak != null) {
                        EnterpriseChallengeLayout enterpriseChallengeLayout = this.ak;
                        Activity activity = getActivity();
                        if ((this.W == null || this.W.getVisibility() == 8) && findViewById(C0906R.id.agc) == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        enterpriseChallengeLayout.a(activity, user2, z3);
                    }
                } else {
                    this.q.setVisibility(0);
                    this.P.setVisibility(0);
                    if (this.W != null) {
                        this.W.setVisibility(8);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
                    marginLayoutParams2.topMargin = u.a(8.0d);
                    marginLayoutParams2.bottomMargin = u.a(0.0d);
                    this.n.setLayoutParams(marginLayoutParams2);
                    if (this.ak != null) {
                        this.ak.setVisibility(8);
                    }
                }
            }
            b(user.getFollowingCount());
            if (PatchProxy.isSupport(new Object[]{user2}, this, f3815a, false, 69345, new Class[]{User.class}, Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{user2}, this, f3815a, false, 69345, new Class[]{User.class}, Integer.TYPE)).intValue();
            } else if (y.a(user)) {
                i2 = user.getFansCount();
            } else {
                i2 = user.getFollowerCount();
            }
            a(i2);
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                a(user.getRemarkName(), user.getStarBillboardRank(), user.getBrandInfo(), user2);
            } else {
                a(user.getNickname(), user.getStarBillboardRank(), user.getBrandInfo(), user2);
            }
            c(user.getTotalFavorited());
            a(user.getFollowStatus(), user.getSignature());
            if (PatchProxy.isSupport(new Object[]{user2}, this, f3815a, false, 69334, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user2}, this, f3815a, false, 69334, new Class[]{User.class}, Void.TYPE);
            } else if (this.h != null) {
                if (user.getCommerceUserInfo() == null || user.getCommerceUserInfo().getStarAtlas() != 1 || !user.getCommerceUserInfo().isShowStarAtlasCooperation()) {
                    this.h.setVisibility(8);
                } else {
                    if (TextUtils.equals(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), user.getUid())) {
                        this.h.setVisibility(0);
                        this.h.setText(C0906R.string.ccz);
                    } else {
                        AbTestManager a2 = AbTestManager.a();
                        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71705, new Class[0], Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71705, new Class[0], Boolean.TYPE)).booleanValue();
                        } else {
                            AbTestModel d2 = a2.d();
                            if (d2 == null) {
                                z2 = false;
                            } else {
                                z2 = d2.starAtlasCooperationEntryOpen;
                            }
                        }
                        if (z2) {
                            this.h.setVisibility(0);
                            this.h.setText(C0906R.string.cd0);
                        } else {
                            this.h.setVisibility(8);
                        }
                    }
                    this.h.setOnClickListener(new g(this, user2));
                }
            }
            b(user.isLive(), ex.l(user), StoryUnreadUtils.hasUnreadStoryWithCheck(user3, user2));
            c(user);
            a(com.ss.android.ugc.aweme.utils.t.b(user));
            g(user);
            d(user.getAwemeCount());
            a(user.isWithFusionShopEntry(), user.isWithNewGoods(), user.isWithCommerceEntry());
            e(user.getFavoritingCount());
            if (!AbTestManager.a().aV() || !ex.g(this.f3817c)) {
                g(user.getDongtaiCount());
            } else {
                g(user.getCollectCount());
            }
            f(user.getStoryCount());
            if (user.getOriginalMusician() != null) {
                i3 = user.getOriginalMusician().getMusicCount();
            } else {
                i3 = 0;
            }
            h(i3);
            if (user.getEffectArtistDetail() != null) {
                i4 = user.getEffectArtistDetail().getTotal();
            } else {
                i4 = 0;
            }
            i(i4);
            b(user);
            if (TextUtils.isEmpty(user.getCustomVerify())) {
                str = user.getWeiboVerify();
            } else {
                str = user.getCustomVerify();
            }
            b(str);
            a();
            d(user.getEnterpriseVerifyReason());
            if (TextUtils.isEmpty(user.getUniqueId())) {
                str2 = user.getShortId();
            } else {
                str2 = user.getUniqueId();
            }
            c(str2);
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setHasShowToutiaoLink(this.P);
            c(user.isBindedWeibo());
            d(ex.n(user));
            d(user);
            f(user);
            if (TextUtils.equals(user.getUid(), d.a().getCurUserId())) {
                a(3, user.getFollowerStatus());
                b(false);
            } else {
                a(user.getFollowStatus(), user.getFollowerStatus());
            }
            e(user.hasMedal());
            e(user);
            user.getCustomVerify();
            b();
            if (m()) {
                this.H.setScrollable(false);
                ViewPager viewPager = this.H.getViewPager();
                if (viewPager != null && (viewPager instanceof p)) {
                    ((p) viewPager).setScrollable(false);
                }
            }
            if (PatchProxy.isSupport(new Object[]{user2}, this, f3815a, false, 69322, new Class[]{User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{user2}, this, f3815a, false, 69322, new Class[]{User.class}, Void.TYPE);
                return;
            }
            if (user2 != null) {
                if (this.ab != null) {
                    if (!TextUtils.isEmpty(user.getBioEmail())) {
                        this.ab.setVisibility(0);
                        this.ab.setText(user.getBioEmail());
                    } else {
                        this.ab.setVisibility(8);
                    }
                }
                if (this.ac != null) {
                    if (!TextUtils.isEmpty(user.getBioUrl())) {
                        this.ac.setVisibility(0);
                        this.ac.setText(user.getBioUrl());
                    } else {
                        this.ac.setVisibility(8);
                    }
                }
                i();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(HotSearchSprintStruct hotSearchSprintStruct) {
        String str;
        if (hotSearchSprintStruct.getSprint() >= 30) {
            if (this.f3817c == null) {
                if (PatchProxy.isSupport(new Object[]{"others_homepage"}, null, c.f42384a, true, 36397, new Class[]{String.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{"others_homepage"}, null, c.f42384a, true, 36397, new Class[]{String.class}, String.class);
                } else {
                    str = c.b("others_homepage", "", "");
                }
            } else {
                str = c.b("others_homepage", this.f3817c.getUid(), this.f3817c.getSecUid());
            }
            h.a().a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AdCoverTitle adCoverTitle, View view) {
        com.ss.android.ugc.aweme.commercialize.log.d.a().a("starpage_ad").b("click").d("link").g("{}").c(this.f3817c.getAdOrderId()).a(getContext());
        g.a(view.getContext(), adCoverTitle.getWebUrl(), "");
    }

    private void b(String str, String str2) {
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f3815a, false, 69324, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f3815a, false, 69324, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (ex.g(this.f3817c)) {
            str3 = "personal_homepage";
        } else {
            str3 = "others_homepage";
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", str3).a("link_type", str2).a("scene_id", "1008");
        if (this.f3817c == null) {
            str4 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str4 = this.f3817c.getUid();
        }
        r.a(str, (Map) a2.a("author_id", str4).f34114b);
    }

    public void a(int i2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f3815a, false, 69344, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f3815a, false, 69344, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (this.T.isViewValid()) {
            if (!com.ss.android.g.a.a()) {
                this.n.setVisibility(0);
                if (!TextUtils.isEmpty(str)) {
                    this.n.setText(str);
                } else if (i2 == 1 || i2 == 2) {
                    this.n.setText(C0906R.string.c8i);
                } else {
                    this.n.setVisibility(8);
                }
            } else if (TextUtils.isEmpty(str)) {
                this.n.setText(C0906R.string.c8f);
            } else {
                String str2 = str;
                while (str2.contains("\n\n")) {
                    str2 = str2.replaceAll("\n\n", "\n");
                }
                this.n.setText(str2);
            }
        }
    }

    public a(@NonNull Context context, BaseProfileFragment baseProfileFragment, ay ayVar) {
        super(context);
        this.T = baseProfileFragment;
        this.U = ayVar;
        View inflate = LayoutInflater.from(context).inflate(getLayout(), this, true);
        this.ad = DataCenter.a(ViewModelProviders.of((Fragment) baseProfileFragment), (LifecycleOwner) baseProfileFragment);
        this.ae = WidgetManager.a((Fragment) baseProfileFragment, inflate);
        this.ae.a(this.ad);
        aa_();
        a(inflate);
        b(inflate);
    }

    public boolean b(String str, int i2, BlueVBrandInfo blueVBrandInfo, User user) {
        String str2;
        int i3;
        String str3 = str;
        final BlueVBrandInfo blueVBrandInfo2 = blueVBrandInfo;
        final User user2 = user;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), blueVBrandInfo2, user2}, this, f3815a, false, 69339, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i2), blueVBrandInfo2, user2}, this, f3815a, false, 69339, new Class[]{String.class, Integer.TYPE, BlueVBrandInfo.class, User.class}, Boolean.TYPE)).booleanValue();
        } else if (blueVBrandInfo2 == null || com.ss.android.g.a.a() || blueVBrandInfo.getRank() <= 0 || blueVBrandInfo.getRank() > 30) {
            return false;
        } else {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            if (ex.g(user)) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            r.a("show_brand_list_entrance", (Map) a2.a("enter_from", str2).a("author_id", user.getUid()).f34114b);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3 + " T");
            com.ss.android.ugc.aweme.hotsearch.view.h hVar = new com.ss.android.ugc.aweme.hotsearch.view.h(blueVBrandInfo.getRank(), blueVBrandInfo.getTagName(), 7);
            int length = str.length() + 1;
            int length2 = str.length() + " T".length();
            spannableStringBuilder.setSpan(hVar, length, length2, 33);
            spannableStringBuilder.setSpan(new ClickableSpan() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62788a;

                public final void onClick(@NonNull View view) {
                    String str;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62788a, false, 69413, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62788a, false, 69413, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                    if (ex.g(user2)) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    r.a("click_brand_list_entrance", (Map) a2.a("enter_from", str).a("author_id", user2.getUid()).f34114b);
                    String uri = com.ss.android.ugc.aweme.music.util.f.a((String) SharePrefCache.inst().getBrandScheme().c()).a("brand_category_id", String.valueOf(blueVBrandInfo2.getCategoryId())).a().toString();
                    if (!TextUtils.isEmpty(uri)) {
                        h.a().a(uri);
                    }
                }
            }, length, length2, 33);
            this.F.setMovementMethod(LinkMovementMethod.getInstance());
            if (getContext() != null) {
                float textSize = this.F.getTextSize();
                int size = hVar.getSize(this.F.getPaint(), spannableStringBuilder, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), this.F.getPaint().getFontMetricsInt());
                this.F.getPaint().setTextSize(textSize);
                i3 = size;
            } else {
                i3 = SearchJediMixFeedAdapter.g;
            }
            this.F.setText(com.ss.android.ugc.aweme.hotsearch.d.h.a(spannableStringBuilder, this.F.getPaint(), this.F.getMeasuredWidth(), this.F.getMaxLines(), 1, i3));
            return true;
        }
    }
}
