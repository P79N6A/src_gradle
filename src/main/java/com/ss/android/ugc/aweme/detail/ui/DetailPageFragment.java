package com.ss.android.ugc.aweme.detail.ui;

import android.animation.TimeInterpolator;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.JediViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.b;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.detail.operators.s;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.adapter.r;
import com.ss.android.ugc.aweme.feed.adapter.s;
import com.ss.android.ugc.aweme.feed.f.ag;
import com.ss.android.ugc.aweme.feed.f.ah;
import com.ss.android.ugc.aweme.feed.f.i;
import com.ss.android.ugc.aweme.feed.f.q;
import com.ss.android.ugc.aweme.feed.f.w;
import com.ss.android.ugc.aweme.feed.f.x;
import com.ss.android.ugc.aweme.feed.listener.a;
import com.ss.android.ugc.aweme.feed.listener.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.main.bu;
import com.ss.android.ugc.aweme.main.f;
import com.ss.android.ugc.aweme.main.g;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.u.aa;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class DetailPageFragment extends CommonPageFragment implements DetailFragmentPanel.a, r, s, a, b, f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3010a;

    /* renamed from: b  reason: collision with root package name */
    public DmtStatusView f3011b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.param.b f3012c = new com.ss.android.ugc.aweme.feed.param.b();

    /* renamed from: d  reason: collision with root package name */
    public DetailFragmentPanel f3013d = h();

    /* renamed from: e  reason: collision with root package name */
    protected boolean f3014e = false;

    /* renamed from: f  reason: collision with root package name */
    protected s.a f3015f = null;
    private final int g = c.f69428f;
    private boolean h = false;
    private TimeInterpolator i = new DecelerateInterpolator();
    private boolean j = false;
    private bu k;
    private com.ss.android.ugc.aweme.audio.c l;
    private DataCenter m;
    @BindView(2131493150)
    protected AudioControlView mAudioControlView;
    @BindView(2131493213)
    public View mBackView;
    @BindView(2131493982)
    protected DisLikeAwemeLayout mDisLikeAwemeLayout;
    @BindView(2131496852)
    View mLayout;
    @BindView(2131495555)
    LinearLayout mLlHorizontalContainer;
    @BindView(2131495647)
    LoadMoreFrameLayout mLoadMoreLayout;
    @BindView(2131497383)
    ViewStub mPrivateAccountTipStub;
    @BindView(2131496683)
    public FeedSwipeRefreshLayout mRefreshLayout;
    @BindView(2131495145)
    ImageView mSearchImageView;
    @BindView(2131494403)
    protected View mTopBarLayout;
    @BindView(2131498465)
    protected VideoPlayerProgressbar mVideoPlayerProgressbar;
    @BindView(2131494404)
    protected ViewStub mVolumeBtnStub;

    public String getPlayListId() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35158, new Class[0], String.class)) {
            return g.c();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35158, new Class[0], String.class);
    }

    public String getPlayListIdKey() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35157, new Class[0], String.class)) {
            return g.b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35157, new Class[0], String.class);
    }

    public String getPlayListType() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35156, new Class[0], String.class)) {
            return g.a();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35156, new Class[0], String.class);
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    private String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35119, new Class[0], String.class)) {
            return this.f3012c.getFrom();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35119, new Class[0], String.class);
    }

    private int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35135, new Class[0], Integer.TYPE)) {
            return this.f3012c.getVideoType();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35135, new Class[0], Integer.TYPE)).intValue();
    }

    private String e() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35149, new Class[0], String.class)) {
            return this.f3012c.getQueryAwemeMode();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35149, new Class[0], String.class);
    }

    private String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35151, new Class[0], String.class)) {
            return this.f3012c.getAid();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35151, new Class[0], String.class);
    }

    @OnClick({2131493213})
    public void back() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35128, new Class[0], Void.TYPE);
            return;
        }
        this.f3013d.x();
        l();
    }

    public Aweme getCurrentAweme() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35153, new Class[0], Aweme.class)) {
            return AwemeChangeCallBack.a(getActivity());
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35153, new Class[0], Aweme.class);
    }

    public String getLastUserId() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35154, new Class[0], String.class)) {
            return aa.q(AwemeChangeCallBack.a(getActivity()));
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35154, new Class[0], String.class);
    }

    public DetailFragmentPanel h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35105, new Class[0], DetailFragmentPanel.class)) {
            return new DetailFragmentPanel();
        }
        return (DetailFragmentPanel) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35105, new Class[0], DetailFragmentPanel.class);
    }

    public JediViewModel j() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35116, new Class[0], JediViewModel.class)) {
            return (JediViewModel) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35116, new Class[0], JediViewModel.class);
        }
        JediViewModel jediViewModel = com.ss.android.ugc.aweme.feed.a.a().f44611d;
        com.ss.android.ugc.aweme.feed.a.a().f44611d = null;
        return jediViewModel;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35123, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35123, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35132, new Class[0], Void.TYPE);
            return;
        }
        a(1);
    }

    public final Aweme o() {
        if (!PatchProxy.isSupport(new Object[0], this, f3010a, false, 35145, new Class[0], Aweme.class)) {
            return this.f3013d.s();
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35145, new Class[0], Aweme.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35121, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35121, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35120, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.l != null) {
            this.l.b();
        }
        this.f3013d.c(2);
    }

    public final boolean p() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35150, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35150, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f3013d != null && this.f3013d.aM()) {
            z = true;
        }
        return z;
    }

    @NonNull
    public SparseArray<com.ss.android.ugc.common.component.fragment.b> registerComponents() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35107, new Class[0], SparseArray.class)) {
            return (SparseArray) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35107, new Class[0], SparseArray.class);
        }
        SparseArray<com.ss.android.ugc.common.component.fragment.b> registerComponents = super.registerComponents();
        registerComponents.append(b.a.f34653c, this.f3013d);
        return registerComponents;
    }

    public final void w_() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35131, new Class[0], Void.TYPE);
            return;
        }
        a(4);
    }

    private int c() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35134, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35134, new Class[0], Integer.TYPE)).intValue();
        } else if (d() == 4) {
            return 1;
        } else {
            if (d() == 5) {
                return 2;
            }
            if (d() == 6) {
                return 3;
            }
            if (d() == 7) {
                return 4;
            }
            return d();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35147, new Class[0], Void.TYPE);
            return;
        }
        int privateAccountTipLayoutRes = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getPrivateAccountTipLayoutRes();
        if (privateAccountTipLayoutRes > 0) {
            this.mPrivateAccountTipStub.setLayoutResource(privateAccountTipLayoutRes);
            this.mPrivateAccountTipStub.inflate();
            this.k.a(false);
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35111, new Class[0], Void.TYPE);
            return;
        }
        an.a(this.mBackView, this.mBackView.getAlpha(), 1.0f);
        this.mDisLikeAwemeLayout.b(false);
        this.mDisLikeAwemeLayout.setInDislikeMode(false);
        bg.a(new i(false, 2, getActivity().hashCode()));
    }

    public final boolean m() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35130, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35130, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3015f == null || this.f3015f.b()) {
            return false;
        } else {
            if (this.f3015f instanceof s.b) {
                ((s.b) this.f3015f).a(true);
            } else {
                this.f3013d.d(true);
            }
            return a(4);
        }
    }

    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3010a, false, 35129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3010a, false, 35129, new Class[0], Void.TYPE);
        } else if (!this.f3014e) {
            if (this.mDisLikeAwemeLayout.m) {
                i();
                return;
            }
            if (TextUtils.equals(this.f3013d.f(), "preference_pop_up")) {
                com.ss.android.ugc.aweme.common.r.a("preference_exit_play", (Map) d.a().a("feed_count", this.f3013d.ah()).f34114b);
            }
            k();
            if (this.f3012c != null && this.f3012c.isFromAdsActivity()) {
                int aZ = AbTestManager.a().aZ();
                if (aZ == 1) {
                    getActivity().overridePendingTransition(C0906R.anim.d3, C0906R.anim.d3);
                } else if (aZ == 2) {
                    getActivity().overridePendingTransition(C0906R.anim.d3, C0906R.anim.d3);
                } else {
                    getActivity().overridePendingTransition(C0906R.anim.d4, C0906R.anim.d4);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:35|36|(2:38|(1:40)(2:41|(2:43|44)))|45|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0178 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroyView() {
        /*
            r23 = this;
            r8 = r23
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3010a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 35126(0x8936, float:4.9222E-41)
            r2 = r23
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0029
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3010a
            r4 = 0
            r5 = 35126(0x8936, float:4.9222E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0029:
            super.onDestroyView()
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r1 = r8.f3013d
            r1.n()
            com.ss.android.ugc.aweme.detail.operators.s$a r1 = r8.f3015f
            if (r1 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.detail.operators.s$a r1 = r8.f3015f
            r1.c()
        L_0x003a:
            com.ss.android.ugc.aweme.audio.c r1 = r8.l
            if (r1 == 0) goto L_0x0180
            com.ss.android.ugc.aweme.audio.c r1 = r8.l
            java.lang.Object[] r9 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.audio.c.f2712a
            r12 = 0
            r13 = 23898(0x5d5a, float:3.3488E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r9 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.audio.c.f2712a
            r12 = 0
            r13 = 23898(0x5d5a, float:3.3488E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0180
        L_0x0063:
            com.ss.android.ugc.aweme.audio.g r2 = r1.h
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.audio.g.f34417a
            r19 = 0
            r20 = 23910(0x5d66, float:3.3505E-41)
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r3
            r17 = r2
            r21 = r4
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r3 == 0) goto L_0x0093
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.audio.g.f34417a
            r19 = 0
            r20 = 23910(0x5d66, float:3.3505E-41)
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r3
            r17 = r2
            r21 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00a1
        L_0x0093:
            r2.f34420d = r0
            r3 = 0
            r2.h = r3
            android.os.Handler r4 = r2.g
            if (r4 == 0) goto L_0x00a1
            android.os.Handler r2 = r2.g
            r2.removeCallbacksAndMessages(r3)
        L_0x00a1:
            com.ss.android.ugc.aweme.audio.i r2 = r1.f2717f
            com.ss.android.ugc.aweme.audio.i$a r3 = r1.g
            r4 = 1
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r0] = r3
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.audio.i.f34431a
            r12 = 0
            r13 = 23919(0x5d6f, float:3.3518E-41)
            java.lang.Class[] r14 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.audio.i$a> r5 = com.ss.android.ugc.aweme.audio.i.a.class
            r14[r0] = r5
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r2
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r5 == 0) goto L_0x00d4
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r0] = r3
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.audio.i.f34431a
            r12 = 0
            r13 = 23919(0x5d6f, float:3.3518E-41)
            java.lang.Class[] r14 = new java.lang.Class[r4]
            java.lang.Class<com.ss.android.ugc.aweme.audio.i$a> r3 = com.ss.android.ugc.aweme.audio.i.a.class
            r14[r0] = r3
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00e1
        L_0x00d4:
            java.lang.Object r5 = com.ss.android.ugc.aweme.audio.i.f34432b
            monitor-enter(r5)
            java.util.List<com.ss.android.ugc.aweme.audio.i$a> r6 = r2.f34434c     // Catch:{ all -> 0x017d }
            if (r6 == 0) goto L_0x00e0
            java.util.List<com.ss.android.ugc.aweme.audio.i$a> r2 = r2.f34434c     // Catch:{ all -> 0x017d }
            r2.remove(r3)     // Catch:{ all -> 0x017d }
        L_0x00e0:
            monitor-exit(r5)     // Catch:{ all -> 0x017d }
        L_0x00e1:
            com.ss.android.ugc.aweme.utils.bg.d(r1)
            com.ss.android.ugc.aweme.audio.b$a r2 = r1.l
            if (r2 == 0) goto L_0x0180
            com.ss.android.ugc.aweme.audio.b r2 = com.ss.android.ugc.aweme.audio.b.a()
            android.app.Activity r3 = r1.f2715d
            com.ss.android.ugc.aweme.audio.b$a r1 = r1.l
            r5 = 2
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r0] = r3
            r9[r4] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.audio.b.f34397a
            r12 = 0
            r13 = 23887(0x5d4f, float:3.3473E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r14[r0] = r6
            java.lang.Class<com.ss.android.ugc.aweme.audio.b$a> r6 = com.ss.android.ugc.aweme.audio.b.a.class
            r14[r4] = r6
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r2
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r6 == 0) goto L_0x012b
            java.lang.Object[] r9 = new java.lang.Object[r5]
            r9[r0] = r3
            r9[r4] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.audio.b.f34397a
            r12 = 0
            r13 = 23887(0x5d4f, float:3.3473E-41)
            java.lang.Class[] r14 = new java.lang.Class[r5]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r14[r0] = r1
            java.lang.Class<com.ss.android.ugc.aweme.audio.b$a> r1 = com.ss.android.ugc.aweme.audio.b.a.class
            r14[r4] = r1
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0180
        L_0x012b:
            java.util.List<com.ss.android.ugc.aweme.audio.b$a> r5 = r2.f34399b
            monitor-enter(r5)
            java.util.List<com.ss.android.ugc.aweme.audio.b$a> r6 = r2.f34399b     // Catch:{ all -> 0x017a }
            r6.remove(r1)     // Catch:{ all -> 0x017a }
            java.util.List<com.ss.android.ugc.aweme.audio.b$a> r1 = r2.f34399b     // Catch:{ all -> 0x017a }
            int r1 = r1.size()     // Catch:{ all -> 0x017a }
            if (r1 != 0) goto L_0x0178
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x017a }
            r9[r0] = r3     // Catch:{ all -> 0x017a }
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.audio.b.f34397a     // Catch:{ all -> 0x017a }
            r12 = 0
            r13 = 23888(0x5d50, float:3.3474E-41)
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x017a }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r14[r0] = r1     // Catch:{ all -> 0x017a }
            java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ all -> 0x017a }
            r10 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x017a }
            if (r1 == 0) goto L_0x0169
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x017a }
            r9[r0] = r3     // Catch:{ all -> 0x017a }
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.audio.b.f34397a     // Catch:{ all -> 0x017a }
            r12 = 0
            r13 = 23888(0x5d50, float:3.3474E-41)
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x017a }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r14[r0] = r1     // Catch:{ all -> 0x017a }
            java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ all -> 0x017a }
            r10 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x017a }
            goto L_0x0178
        L_0x0169:
            boolean r1 = r2.f34401d     // Catch:{ all -> 0x017a }
            if (r1 == 0) goto L_0x0178
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ Exception -> 0x0178 }
            android.content.BroadcastReceiver r3 = r2.f34400c     // Catch:{ Exception -> 0x0178 }
            r1.unregisterReceiver(r3)     // Catch:{ Exception -> 0x0178 }
            r2.f34401d = r0     // Catch:{ Exception -> 0x0178 }
        L_0x0178:
            monitor-exit(r5)     // Catch:{ all -> 0x017a }
            goto L_0x0180
        L_0x017a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x017a }
            throw r0
        L_0x017d:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x017d }
            throw r0
        L_0x0180:
            com.ss.android.ugc.aweme.main.bu r1 = r8.k
            if (r1 == 0) goto L_0x01b5
            com.ss.android.ugc.aweme.main.bu r1 = r8.k
            java.lang.Object[] r9 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.main.bu.f54648a
            r12 = 0
            r13 = 57693(0xe15d, float:8.0845E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r1
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x01aa
            java.lang.Object[] r9 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.main.bu.f54648a
            r12 = 0
            r13 = 57693(0xe15d, float:8.0845E-41)
            java.lang.Class[] r14 = new java.lang.Class[r0]
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x01aa:
            com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager r0 = r1.j
            if (r0 == 0) goto L_0x01b5
            com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager r0 = r1.j
            android.support.v4.view.ViewPager$OnPageChangeListener r1 = r1.o
            r0.removeOnPageChangeListener(r1)
        L_0x01b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailPageFragment.onDestroyView():void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(float f2) {
        int i2;
        if (this.mTopBarLayout != null) {
            this.mTopBarLayout.setAlpha(f2);
            View view = this.mTopBarLayout;
            if (f2 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    @Subscribe
    public void onBlockUserEvent(com.ss.android.ugc.aweme.feed.f.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3010a, false, 35146, new Class[]{com.ss.android.ugc.aweme.feed.f.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3010a, false, 35146, new Class[]{com.ss.android.ugc.aweme.feed.f.b.class}, Void.TYPE);
            return;
        }
        a(1);
    }

    public void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3010a, false, 35108, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3010a, false, 35108, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.f3012c = (com.ss.android.ugc.aweme.feed.param.b) bundle.getSerializable("feed_param");
        this.h = bundle.getBoolean("extra_challenge_is_hashtag", false);
    }

    @Subscribe
    public void onCommentShowEvent(com.ss.android.ugc.aweme.comment.b.d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f3010a, false, 35136, new Class[]{com.ss.android.ugc.aweme.comment.b.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f3010a, false, 35136, new Class[]{com.ss.android.ugc.aweme.comment.b.d.class}, Void.TYPE);
            return;
        }
        if (!(dVar == null || this.k == null || getActivity() == null || dVar.f36378b == null || !TextUtils.equals(getActivity().getClass().getSimpleName(), dVar.f36378b.getClass().getSimpleName()))) {
            this.k.a(!dVar.f36377a);
        }
    }

    @Subscribe
    public void onFeedFetchEvent(q qVar) {
        q qVar2 = qVar;
        if (PatchProxy.isSupport(new Object[]{qVar2}, this, f3010a, false, 35143, new Class[]{q.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar2}, this, f3010a, false, 35143, new Class[]{q.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(qVar2.f45314a, "from_cell_recommend")) {
            a(4);
        }
    }

    @Subscribe
    public void onMobEnterFromEvent(w wVar) {
        if (PatchProxy.isSupport(new Object[]{wVar}, this, f3010a, false, 35139, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, f3010a, false, 35139, new Class[]{w.class}, Void.TYPE);
        } else if (wVar != null && this.k != null && getActivity() != null) {
            this.k.c(wVar.f45319a);
        }
    }

    @Subscribe
    public void onMobRequestIdEvent(x xVar) {
        if (PatchProxy.isSupport(new Object[]{xVar}, this, f3010a, false, 35140, new Class[]{x.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xVar}, this, f3010a, false, 35140, new Class[]{x.class}, Void.TYPE);
        } else if (xVar != null && this.k != null && getActivity() != null) {
            this.k.f54653f = xVar.f45320a;
        }
    }

    @Subscribe
    public void onScaleToCloseDetailEvent(ag agVar) {
        ag agVar2 = agVar;
        if (PatchProxy.isSupport(new Object[]{agVar2}, this, f3010a, false, 35138, new Class[]{ag.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{agVar2}, this, f3010a, false, 35138, new Class[]{ag.class}, Void.TYPE);
            return;
        }
        if (agVar2 != null && getActivity() != null && agVar2.f45283a == getActivity().hashCode()) {
            if (this.f3013d != null) {
                l();
            }
        }
    }

    @Subscribe
    public void onScrollToDetailEvent(ah ahVar) {
        if (PatchProxy.isSupport(new Object[]{ahVar}, this, f3010a, false, 35137, new Class[]{ah.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar}, this, f3010a, false, 35137, new Class[]{ah.class}, Void.TYPE);
        } else if (ahVar != null && this.k != null && getActivity() != null) {
            this.k.c(ahVar.f45284a);
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3010a, false, 35127, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3010a, false, 35127, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        this.f3013d.f(z);
        if (z) {
            this.f3013d.c(true);
            this.f3013d.k = true;
            this.f3013d.v();
        } else {
            this.f3013d.c(false);
            this.f3013d.k = false;
        }
        if (this.l != null) {
            this.l.b();
        }
    }

    private boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3010a, false, 35133, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3010a, false, 35133, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f3015f == null || this.f3015f.b()) {
            return false;
        } else {
            if (TextUtils.equals("from_local", e())) {
                Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(f());
                if (!(b2 == null || this.f3013d == null)) {
                    this.f3013d.a(b2);
                    return true;
                }
            }
            this.f3015f.a(i2, this.f3012c, c(), this.h);
            return true;
        }
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3010a, false, 35141, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f3010a, false, 35141, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f3015f == null || !this.f3015f.a(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01bc  */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.f.i r21) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.i> r1 = com.ss.android.ugc.aweme.feed.f.i.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 35112(0x8928, float:4.9202E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35112(0x8928, float:4.9202E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.i> r1 = com.ss.android.ugc.aweme.feed.f.i.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            android.support.v4.app.FragmentActivity r0 = r20.getActivity()
            if (r0 == 0) goto L_0x01e4
            int r0 = r8.f45311e
            android.support.v4.app.FragmentActivity r1 = r20.getActivity()
            int r1 = r1.hashCode()
            if (r0 == r1) goto L_0x004c
            goto L_0x01e4
        L_0x004c:
            int r0 = r8.f45308b
            r11 = 2
            if (r0 != r11) goto L_0x01e3
            boolean r0 = r8.f45307a
            if (r0 == 0) goto L_0x01e3
            float r12 = r8.f45309c
            float r8 = r8.f45310d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Float r1 = java.lang.Float.valueOf(r12)
            r0[r10] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35113(0x8929, float:4.9204E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00a7
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Float r1 = java.lang.Float.valueOf(r12)
            r0[r10] = r1
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35113(0x8929, float:4.9204E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00a7:
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout r0 = r7.mDisLikeAwemeLayout
            if (r0 == 0) goto L_0x01e2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r20.getCurrentAweme()
            if (r0 != 0) goto L_0x00b3
            goto L_0x01e2
        L_0x00b3:
            android.content.Context r0 = r20.getContext()
            java.lang.Class<com.ss.android.ugc.aweme.main.bm> r1 = com.ss.android.ugc.aweme.main.bm.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r0, r1)
            com.ss.android.ugc.aweme.main.bm r0 = (com.ss.android.ugc.aweme.main.bm) r0
            r0.s(r10)
            java.lang.String r0 = "click_trans_layer"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r20.getCurrentAweme()
            java.lang.String r3 = r3.getAid()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r20.getCurrentAweme()
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x00f0
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r20.getCurrentAweme()
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            java.lang.String r3 = r3.getUid()
            goto L_0x00f2
        L_0x00f0:
            java.lang.String r3 = ""
        L_0x00f2:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.feed.ai r3 = com.ss.android.ugc.aweme.feed.ai.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r20.getCurrentAweme()
            java.lang.String r4 = com.ss.android.ugc.aweme.u.aa.c((com.ss.android.ugc.aweme.feed.model.Aweme) r4)
            java.lang.String r3 = r3.a((java.lang.String) r4)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r3 = r7.f3013d
            java.lang.String r3 = r3.f()
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            android.view.View r0 = r7.mBackView
            android.view.View r1 = r7.mBackView
            float r1 = r1.getAlpha()
            r2 = 0
            com.ss.android.ugc.aweme.shortvideo.util.an.a(r0, r1, r2)
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r16 = 1
            r17 = 43420(0xa99c, float:6.0844E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r0 == 0) goto L_0x015a
            java.lang.Object[] r13 = new java.lang.Object[r10]
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f46750a
            r16 = 1
            r17 = 43420(0xa99c, float:6.0844E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r0
        L_0x014f:
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x019b
        L_0x015a:
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a$a r0 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.g
            java.lang.Object[] r13 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.C0564a.f46756a
            r16 = 0
            r17 = 43421(0xa99d, float:6.0846E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r0
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x0183
            java.lang.Object[] r13 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.feed.ui.masklayer2.a.C0564a.f46756a
            r16 = 0
            r17 = 43421(0xa99d, float:6.0846E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r14 = r0
            r18 = r1
            goto L_0x014f
        L_0x0183:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 == 0) goto L_0x019a
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.x()
            if (r0 == 0) goto L_0x019a
            r0 = 1
            goto L_0x019b
        L_0x019a:
            r0 = 0
        L_0x019b:
            if (r0 == 0) goto L_0x01bc
            com.ss.android.ugc.aweme.feed.ui.masklayer2.q r0 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.q
            android.content.Context r1 = r20.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r20.getCurrentAweme()
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r3 = r7.f3013d
            java.lang.String r3 = r3.f()
            r0.<init>(r1, r2, r3)
            com.ss.android.ugc.aweme.detail.ui.DetailPageFragment$2 r1 = new com.ss.android.ugc.aweme.detail.ui.DetailPageFragment$2
            r1.<init>()
            r0.setOnDismissListener(r1)
            r0.show()
            return
        L_0x01bc:
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout r0 = r7.mDisLikeAwemeLayout
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r1 = r7.f3013d
            java.lang.String r1 = r1.f()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r20.getCurrentAweme()
            r0.a(r12, r8, r1, r2)
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout r0 = r7.mDisLikeAwemeLayout
            r0.setInDislikeMode(r9)
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout r0 = r7.mDisLikeAwemeLayout
            com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x01e3
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout r0 = r7.mDisLikeAwemeLayout
            com.ss.android.ugc.aweme.feed.ui.masklayer.MaskLayerOptionsAdapter r0 = r0.getAdapter()
            r0.notifyDataSetChanged()
            goto L_0x01e3
        L_0x01e2:
            return
        L_0x01e3:
            return
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailPageFragment.onDislikeAwemeEvent(com.ss.android.ugc.aweme.feed.f.i):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x052e, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0588, code lost:
        if (r0 != null) goto L_0x026f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r23, android.os.Bundle r24) {
        /*
            r22 = this;
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 35115(0x892b, float:4.9207E-41)
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35115(0x892b, float:4.9207E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            super.onViewCreated(r23, r24)
            android.support.v4.app.FragmentActivity r0 = r22.getActivity()
            com.ss.android.ugc.aweme.main.e r0 = com.ss.android.ugc.aweme.main.base.d.a(r0)
            com.ss.android.ugc.aweme.main.bu r0 = (com.ss.android.ugc.aweme.main.bu) r0
            r7.k = r0
            android.os.Bundle r0 = r22.getArguments()
            r7.a((android.os.Bundle) r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35109(0x8925, float:4.9198E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r13 = 8
            r14 = -1
            if (r0 == 0) goto L_0x0087
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35109(0x8925, float:4.9198E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ca
        L_0x0087:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = new com.bytedance.ies.dmt.ui.widget.DmtStatusView
            android.content.Context r1 = r22.getContext()
            r0.<init>(r1)
            r7.f3011b = r0
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r7.f3011b
            android.content.Context r1 = r22.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131624266(0x7f0e014a, float:1.8875707E38)
            int r1 = r1.getColor(r2)
            r0.setBackgroundColor(r1)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r14, r14)
            com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout r1 = r7.mLoadMoreLayout
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r2 = r7.f3011b
            r1.addView(r2, r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r7.f3011b
            android.support.v4.app.FragmentActivity r1 = r22.getActivity()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = com.bytedance.ies.dmt.ui.widget.DmtStatusView.a.a((android.content.Context) r1)
            r0.setBuilder(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r7.f3011b
            r0.setBackgroundColor(r11)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r7.f3011b
            r0.setVisibility(r13)
            android.view.View r0 = r7.mTopBarLayout
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            android.content.Context r1 = r22.getContext()
            r2 = 1107296256(0x42000000, float:32.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r2)
            int r1 = (int) r1
            r0.topMargin = r1
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            if (r0 == 0) goto L_0x0107
            com.ss.android.ugc.aweme.main.bu r0 = r7.k
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r1 = r7.f3013d
            com.ss.android.ugc.aweme.main.bu$b r1 = r1.p
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r2 = r7.f3013d
            r0.a(r7, r1, r2)
            android.content.Context r0 = r22.getContext()
            boolean r0 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r0)
            if (r0 != 0) goto L_0x0107
            android.support.v4.app.FragmentActivity r0 = r22.getActivity()
            r1 = 2131561430(0x7f0d0bd6, float:1.874826E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x01ca
        L_0x0107:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35110(0x8926, float:4.92E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x012d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35110(0x8926, float:4.92E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0137
        L_0x012d:
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout r0 = r7.mDisLikeAwemeLayout
            com.ss.android.ugc.aweme.detail.ui.DetailPageFragment$1 r1 = new com.ss.android.ugc.aweme.detail.ui.DetailPageFragment$1
            r1.<init>()
            r0.setListener(r1)
        L_0x0137:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35117(0x892d, float:4.921E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x015d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35117(0x892d, float:4.921E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0173
        L_0x015d:
            com.ss.android.ugc.aweme.audio.c r0 = new com.ss.android.ugc.aweme.audio.c
            android.support.v4.app.FragmentActivity r1 = r22.getActivity()
            android.view.ViewStub r2 = r7.mVolumeBtnStub
            r0.<init>(r1, r2)
            r7.l = r0
            com.ss.android.ugc.aweme.audio.c r0 = r7.l
            java.lang.String r1 = r22.b()
            r0.a(r10, r1)
        L_0x0173:
            java.lang.Object[] r15 = new java.lang.Object[r11]
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.discover.helper.b.f42326a
            r18 = 1
            r19 = 36312(0x8dd8, float:5.0884E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class r21 = java.lang.Boolean.TYPE
            r20 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x01a6
            java.lang.Object[] r15 = new java.lang.Object[r11]
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.discover.helper.b.f42326a
            r18 = 1
            r19 = 36312(0x8dd8, float:5.0884E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]
            java.lang.Class r21 = java.lang.Boolean.TYPE
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01b3
        L_0x01a6:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.at()
            if (r0 != r10) goto L_0x01b2
            r0 = 1
            goto L_0x01b3
        L_0x01b2:
            r0 = 0
        L_0x01b3:
            if (r0 == 0) goto L_0x01bb
            android.widget.ImageView r0 = r7.mSearchImageView
            r0.setVisibility(r11)
            goto L_0x01c0
        L_0x01bb:
            android.widget.ImageView r0 = r7.mSearchImageView
            r0.setVisibility(r13)
        L_0x01c0:
            android.widget.ImageView r0 = r7.mSearchImageView
            com.ss.android.ugc.aweme.detail.ui.f r1 = new com.ss.android.ugc.aweme.detail.ui.f
            r1.<init>(r7)
            r0.setOnClickListener(r1)
        L_0x01ca:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35118(0x892e, float:4.9211E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f3010a
            r3 = 0
            r4 = 35118(0x892e, float:4.9211E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r22
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x020a
        L_0x01f0:
            android.support.v4.app.FragmentActivity r0 = r22.getActivity()
            android.arch.lifecycle.ViewModelProvider r0 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r0)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = com.ss.android.ugc.aweme.arch.widgets.base.DataCenter.a((android.arch.lifecycle.ViewModelProvider) r0, (android.arch.lifecycle.LifecycleOwner) r7)
            r7.m = r0
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.m
            java.lang.String r1 = com.ss.android.ugc.aweme.main.base.c.f54428a
            com.ss.android.ugc.aweme.detail.ui.h r2 = new com.ss.android.ugc.aweme.detail.ui.h
            r2.<init>(r7)
            r0.a((java.lang.String) r1, (android.arch.lifecycle.Observer<com.ss.android.ugc.aweme.arch.widgets.base.a>) r2)
        L_0x020a:
            com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout r0 = r7.mRefreshLayout
            r0.setEnabled(r11)
            com.ss.android.ugc.aweme.feed.a r0 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.common.f.a r0 = r0.f44610c
            com.ss.android.ugc.aweme.feed.param.b r1 = r7.f3012c
            com.bytedance.jedi.arch.JediViewModel r2 = r22.j()
            r3 = 3
            java.lang.Object[] r15 = new java.lang.Object[r3]
            r15[r11] = r1
            r15[r12] = r0
            r15[r10] = r2
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.detail.operators.s.f41278a
            r18 = 1
            r19 = 34825(0x8809, float:4.88E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.b> r5 = com.ss.android.ugc.aweme.feed.param.b.class
            r4[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.common.f.a> r5 = com.ss.android.ugc.aweme.common.f.a.class
            r4[r12] = r5
            java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r5 = com.bytedance.jedi.arch.JediViewModel.class
            r4[r10] = r5
            java.lang.Class<com.ss.android.ugc.aweme.detail.operators.s$a> r21 = com.ss.android.ugc.aweme.detail.operators.s.a.class
            r20 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
            r5 = 0
            if (r4 == 0) goto L_0x0272
            java.lang.Object[] r15 = new java.lang.Object[r3]
            r15[r11] = r1
            r15[r12] = r0
            r15[r10] = r2
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.detail.operators.s.f41278a
            r18 = 1
            r19 = 34825(0x8809, float:4.88E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.b> r1 = com.ss.android.ugc.aweme.feed.param.b.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.common.f.a> r1 = com.ss.android.ugc.aweme.common.f.a.class
            r0[r12] = r1
            java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r1 = com.bytedance.jedi.arch.JediViewModel.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.detail.operators.s$a> r21 = com.ss.android.ugc.aweme.detail.operators.s.a.class
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            com.ss.android.ugc.aweme.detail.operators.s$a r0 = (com.ss.android.ugc.aweme.detail.operators.s.a) r0
        L_0x026f:
            r1 = r0
            goto L_0x05b3
        L_0x0272:
            java.lang.String r4 = r1.getFrom()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x058c
            int r6 = r4.hashCode()
            switch(r6) {
                case -2129304096: goto L_0x0401;
                case -2129304095: goto L_0x03f7;
                case -2084096361: goto L_0x03ed;
                case -2021687896: goto L_0x03e3;
                case -2010463721: goto L_0x03d8;
                case -1799782064: goto L_0x03ce;
                case -1718955055: goto L_0x03c4;
                case -1696805560: goto L_0x03b9;
                case -1244334536: goto L_0x03af;
                case -1244326859: goto L_0x03a4;
                case -1188973400: goto L_0x0398;
                case -608921156: goto L_0x038c;
                case -352746994: goto L_0x0380;
                case -262584970: goto L_0x0374;
                case -185728731: goto L_0x0369;
                case -164819482: goto L_0x035d;
                case 53372288: goto L_0x0351;
                case 54656180: goto L_0x0345;
                case 80178893: goto L_0x0339;
                case 169715633: goto L_0x032d;
                case 197801949: goto L_0x0321;
                case 462133794: goto L_0x0315;
                case 503071540: goto L_0x0309;
                case 707647226: goto L_0x02fd;
                case 751892277: goto L_0x02f1;
                case 762374289: goto L_0x02e5;
                case 890576754: goto L_0x02d9;
                case 1217392887: goto L_0x02cd;
                case 1235538052: goto L_0x02c1;
                case 1251285931: goto L_0x02b5;
                case 1671103942: goto L_0x02a9;
                case 1803864987: goto L_0x029d;
                case 1921357281: goto L_0x0291;
                case 2065353855: goto L_0x0285;
                default: goto L_0x0283;
            }
        L_0x0283:
            goto L_0x040b
        L_0x0285:
            java.lang.String r6 = "from_discovery_challenge"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 11
            goto L_0x040c
        L_0x0291:
            java.lang.String r6 = "from_poi_categorized"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 14
            goto L_0x040c
        L_0x029d:
            java.lang.String r6 = "from_poi_detail"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 16
            goto L_0x040c
        L_0x02a9:
            java.lang.String r6 = "from_no_request"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 33
            goto L_0x040c
        L_0x02b5:
            java.lang.String r6 = "mp_page"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 31
            goto L_0x040c
        L_0x02c1:
            java.lang.String r6 = "from_roaming"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 29
            goto L_0x040c
        L_0x02cd:
            java.lang.String r6 = "from_window_following"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 12
            goto L_0x040c
        L_0x02d9:
            java.lang.String r6 = "from_challenge_children_mode"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 9
            goto L_0x040c
        L_0x02e5:
            java.lang.String r6 = "from_search_similar_aweme"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 25
            goto L_0x040c
        L_0x02f1:
            java.lang.String r6 = "from_user_perfer"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 30
            goto L_0x040c
        L_0x02fd:
            java.lang.String r6 = "from_search_mix"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 23
            goto L_0x040c
        L_0x0309:
            java.lang.String r6 = "from_music_children_mode"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 8
            goto L_0x040c
        L_0x0315:
            java.lang.String r6 = "from_search_jedi"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 24
            goto L_0x040c
        L_0x0321:
            java.lang.String r6 = "from_search"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 22
            goto L_0x040c
        L_0x032d:
            java.lang.String r6 = "from_hot_search_positive_aweme"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 27
            goto L_0x040c
        L_0x0339:
            java.lang.String r6 = "from_chat"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 28
            goto L_0x040c
        L_0x0345:
            java.lang.String r6 = "from_nearby"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 13
            goto L_0x040c
        L_0x0351:
            java.lang.String r6 = "from_commerce_seed"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 17
            goto L_0x040c
        L_0x035d:
            java.lang.String r6 = "from_follow"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 19
            goto L_0x040c
        L_0x0369:
            java.lang.String r6 = "from_profile_other"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 4
            goto L_0x040c
        L_0x0374:
            java.lang.String r6 = "from_commerce_bill_share"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 18
            goto L_0x040c
        L_0x0380:
            java.lang.String r6 = "from_challenge"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 10
            goto L_0x040c
        L_0x038c:
            java.lang.String r6 = "from_follow_tab"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 20
            goto L_0x040c
        L_0x0398:
            java.lang.String r6 = "from_user_state_tab"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 32
            goto L_0x040c
        L_0x03a4:
            java.lang.String r6 = "from_poi"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 15
            goto L_0x040c
        L_0x03af:
            java.lang.String r6 = "from_hot"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 3
            goto L_0x040c
        L_0x03b9:
            java.lang.String r6 = "from_follow_page"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 21
            goto L_0x040c
        L_0x03c4:
            java.lang.String r6 = "from_time_line"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 0
            goto L_0x040c
        L_0x03ce:
            java.lang.String r6 = "from_music"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 6
            goto L_0x040c
        L_0x03d8:
            java.lang.String r6 = "from_hot_search_aweme"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 26
            goto L_0x040c
        L_0x03e3:
            java.lang.String r6 = "from_sticker"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 7
            goto L_0x040c
        L_0x03ed:
            java.lang.String r6 = "from_profile_self"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 5
            goto L_0x040c
        L_0x03f7:
            java.lang.String r6 = "from_discovery_v3"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 2
            goto L_0x040c
        L_0x0401:
            java.lang.String r6 = "from_discovery_v2"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L_0x040b
            r6 = 1
            goto L_0x040c
        L_0x040b:
            r6 = -1
        L_0x040c:
            switch(r6) {
                case 0: goto L_0x054f;
                case 1: goto L_0x0549;
                case 2: goto L_0x0542;
                case 3: goto L_0x0531;
                case 4: goto L_0x051f;
                case 5: goto L_0x051f;
                case 6: goto L_0x0518;
                case 7: goto L_0x0511;
                case 8: goto L_0x0506;
                case 9: goto L_0x04fb;
                case 10: goto L_0x04f4;
                case 11: goto L_0x04f4;
                case 12: goto L_0x04ed;
                case 13: goto L_0x04e6;
                case 14: goto L_0x04df;
                case 15: goto L_0x04d8;
                case 16: goto L_0x04d1;
                case 17: goto L_0x04cb;
                case 18: goto L_0x04c5;
                case 19: goto L_0x04be;
                case 20: goto L_0x04b7;
                case 21: goto L_0x04b0;
                case 22: goto L_0x04a9;
                case 23: goto L_0x04a2;
                case 24: goto L_0x0499;
                case 25: goto L_0x0492;
                case 26: goto L_0x048b;
                case 27: goto L_0x048b;
                case 28: goto L_0x0484;
                case 29: goto L_0x047d;
                case 30: goto L_0x0476;
                case 31: goto L_0x046f;
                case 32: goto L_0x0468;
                case 33: goto L_0x0461;
                default: goto L_0x040f;
            }
        L_0x040f:
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r1
            r13[r12] = r0
            r13[r10] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.detail.operators.ah.f41211a
            r16 = 1
            r17 = 34858(0x882a, float:4.8846E-41)
            java.lang.Class[] r4 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.b> r6 = com.ss.android.ugc.aweme.feed.param.b.class
            r4[r11] = r6
            java.lang.Class<com.ss.android.ugc.aweme.common.f.a> r6 = com.ss.android.ugc.aweme.common.f.a.class
            r4[r12] = r6
            java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r6 = com.bytedance.jedi.arch.JediViewModel.class
            r4[r10] = r6
            java.lang.Class<com.ss.android.ugc.aweme.detail.operators.s$a> r19 = com.ss.android.ugc.aweme.detail.operators.s.a.class
            r18 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0555
            java.lang.Object[] r13 = new java.lang.Object[r3]
            r13[r11] = r1
            r13[r12] = r0
            r13[r10] = r2
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.detail.operators.ah.f41211a
            r16 = 1
            r17 = 34858(0x882a, float:4.8846E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.b> r2 = com.ss.android.ugc.aweme.feed.param.b.class
            r0[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.common.f.a> r2 = com.ss.android.ugc.aweme.common.f.a.class
            r0[r12] = r2
            java.lang.Class<com.bytedance.jedi.arch.JediViewModel> r2 = com.bytedance.jedi.arch.JediViewModel.class
            r0[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.detail.operators.s$a> r19 = com.ss.android.ugc.aweme.detail.operators.s.a.class
            r18 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.ss.android.ugc.aweme.detail.operators.s$a r0 = (com.ss.android.ugc.aweme.detail.operators.s.a) r0
            goto L_0x0588
        L_0x0461:
            com.ss.android.ugc.aweme.detail.operators.ai r1 = new com.ss.android.ugc.aweme.detail.operators.ai
            r1.<init>(r0)
            goto L_0x05b3
        L_0x0468:
            com.ss.android.ugc.aweme.detail.operators.af r1 = new com.ss.android.ugc.aweme.detail.operators.af
            r1.<init>(r0)
            goto L_0x05b3
        L_0x046f:
            com.ss.android.ugc.aweme.detail.operators.l r1 = new com.ss.android.ugc.aweme.detail.operators.l
            r1.<init>(r0)
            goto L_0x05b3
        L_0x0476:
            com.ss.android.ugc.aweme.detail.operators.ae r1 = new com.ss.android.ugc.aweme.detail.operators.ae
            r1.<init>(r0)
            goto L_0x05b3
        L_0x047d:
            com.ss.android.ugc.aweme.detail.operators.x r1 = new com.ss.android.ugc.aweme.detail.operators.x
            r1.<init>(r0)
            goto L_0x05b3
        L_0x0484:
            com.ss.android.ugc.aweme.detail.operators.e r0 = new com.ss.android.ugc.aweme.detail.operators.e
            r0.<init>()
            goto L_0x026f
        L_0x048b:
            com.ss.android.ugc.aweme.detail.operators.m r1 = new com.ss.android.ugc.aweme.detail.operators.m
            r1.<init>(r0, r4)
            goto L_0x05b3
        L_0x0492:
            com.ss.android.ugc.aweme.detail.operators.aa r1 = new com.ss.android.ugc.aweme.detail.operators.aa
            r1.<init>(r0)
            goto L_0x05b3
        L_0x0499:
            com.ss.android.ugc.aweme.detail.operators.o r0 = new com.ss.android.ugc.aweme.detail.operators.o
            com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel r2 = (com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel) r2
            r0.<init>(r2)
            goto L_0x026f
        L_0x04a2:
            com.ss.android.ugc.aweme.detail.operators.y r1 = new com.ss.android.ugc.aweme.detail.operators.y
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04a9:
            com.ss.android.ugc.aweme.detail.operators.z r1 = new com.ss.android.ugc.aweme.detail.operators.z
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04b0:
            com.ss.android.ugc.aweme.detail.operators.j r1 = new com.ss.android.ugc.aweme.detail.operators.j
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04b7:
            com.ss.android.ugc.aweme.detail.operators.k r1 = new com.ss.android.ugc.aweme.detail.operators.k
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04be:
            com.ss.android.ugc.aweme.detail.operators.i r1 = new com.ss.android.ugc.aweme.detail.operators.i
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04c5:
            com.ss.android.ugc.aweme.commerce.billshare.e r2 = new com.ss.android.ugc.aweme.commerce.billshare.e
            r2.<init>(r0, r1)
            goto L_0x052e
        L_0x04cb:
            com.ss.android.ugc.aweme.commerce.preview.a r2 = new com.ss.android.ugc.aweme.commerce.preview.a
            r2.<init>(r0, r1)
            goto L_0x052e
        L_0x04d1:
            com.ss.android.ugc.aweme.detail.operators.u r1 = new com.ss.android.ugc.aweme.detail.operators.u
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04d8:
            com.ss.android.ugc.aweme.detail.operators.v r1 = new com.ss.android.ugc.aweme.detail.operators.v
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04df:
            com.ss.android.ugc.aweme.detail.operators.t r1 = new com.ss.android.ugc.aweme.detail.operators.t
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04e6:
            com.ss.android.ugc.aweme.detail.operators.r r1 = new com.ss.android.ugc.aweme.detail.operators.r
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04ed:
            com.ss.android.ugc.aweme.detail.operators.ag r1 = new com.ss.android.ugc.aweme.detail.operators.ag
            r1.<init>(r0)
            goto L_0x05b3
        L_0x04f4:
            com.ss.android.ugc.aweme.detail.operators.d r1 = new com.ss.android.ugc.aweme.detail.operators.d
            r1.<init>(r0, r4)
            goto L_0x05b3
        L_0x04fb:
            com.ss.android.ugc.aweme.detail.operators.c r0 = new com.ss.android.ugc.aweme.detail.operators.c
            java.lang.String r1 = r1.getIds()
            r0.<init>(r1)
            goto L_0x026f
        L_0x0506:
            com.ss.android.ugc.aweme.detail.operators.p r0 = new com.ss.android.ugc.aweme.detail.operators.p
            java.lang.String r1 = r1.getIds()
            r0.<init>(r1)
            goto L_0x026f
        L_0x0511:
            com.ss.android.ugc.aweme.detail.operators.ab r1 = new com.ss.android.ugc.aweme.detail.operators.ab
            r1.<init>(r0)
            goto L_0x05b3
        L_0x0518:
            com.ss.android.ugc.aweme.detail.operators.q r1 = new com.ss.android.ugc.aweme.detail.operators.q
            r1.<init>(r0)
            goto L_0x05b3
        L_0x051f:
            com.ss.android.ugc.aweme.detail.operators.w r2 = new com.ss.android.ugc.aweme.detail.operators.w
            java.lang.String r3 = "from_profile_self"
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            java.lang.String r1 = r1.getUid()
            r2.<init>(r0, r3, r1)
        L_0x052e:
            r1 = r2
            goto L_0x05b3
        L_0x0531:
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r2 = r2.v()
            if (r2 == 0) goto L_0x058c
            com.ss.android.ugc.aweme.detail.operators.ad r1 = new com.ss.android.ugc.aweme.detail.operators.ad
            r1.<init>(r0)
            goto L_0x05b3
        L_0x0542:
            com.ss.android.ugc.aweme.detail.operators.h r1 = new com.ss.android.ugc.aweme.detail.operators.h
            r1.<init>(r0)
            goto L_0x05b3
        L_0x0549:
            com.ss.android.ugc.aweme.detail.operators.g r1 = new com.ss.android.ugc.aweme.detail.operators.g
            r1.<init>(r0)
            goto L_0x05b3
        L_0x054f:
            com.ss.android.ugc.aweme.detail.operators.ac r1 = new com.ss.android.ugc.aweme.detail.operators.ac
            r1.<init>(r0)
            goto L_0x05b3
        L_0x0555:
            java.lang.String r0 = "param"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r0)
            java.lang.String r0 = r1.getFrom()
            if (r0 != 0) goto L_0x0561
            goto L_0x0587
        L_0x0561:
            int r3 = r0.hashCode()
            r4 = 746206569(0x2c7a3569, float:3.5556785E-12)
            if (r3 == r4) goto L_0x056b
            goto L_0x0587
        L_0x056b:
            java.lang.String r3 = "trending_page"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0587
            com.ss.android.ugc.aweme.detail.operators.n r0 = new com.ss.android.ugc.aweme.detail.operators.n
            if (r2 == 0) goto L_0x057f
            com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel r2 = (com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel) r2
            r0.<init>(r2)
            com.ss.android.ugc.aweme.detail.operators.s$a r0 = (com.ss.android.ugc.aweme.detail.operators.s.a) r0
            goto L_0x0588
        L_0x057f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel"
            r0.<init>(r1)
            throw r0
        L_0x0587:
            r0 = r5
        L_0x0588:
            if (r0 == 0) goto L_0x058c
            goto L_0x026f
        L_0x058c:
            java.lang.String r0 = r1.getIds()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x05a8
            java.lang.String r0 = r1.getPushParams()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05a1
            goto L_0x05a8
        L_0x05a1:
            com.ss.android.ugc.aweme.detail.operators.f r0 = new com.ss.android.ugc.aweme.detail.operators.f
            r0.<init>()
            goto L_0x026f
        L_0x05a8:
            com.ss.android.ugc.aweme.detail.operators.b r0 = new com.ss.android.ugc.aweme.detail.operators.b
            java.lang.String r1 = r1.getIds()
            r0.<init>(r1)
            goto L_0x026f
        L_0x05b3:
            r7.f3015f = r1
            com.ss.android.ugc.aweme.detail.operators.s$a r0 = r7.f3015f
            int r1 = r22.d()
            int r0 = r0.a((int) r1)
            com.ss.android.ugc.aweme.detail.operators.s$a r1 = r7.f3015f
            boolean r1 = r1.a((android.support.v4.app.Fragment) r7)
            if (r1 != 0) goto L_0x05d5
            android.support.v4.app.FragmentActivity r0 = r22.getActivity()
            if (r0 == 0) goto L_0x05d4
            android.support.v4.app.FragmentActivity r0 = r22.getActivity()
            r0.finish()
        L_0x05d4:
            return
        L_0x05d5:
            com.ss.android.ugc.aweme.detail.operators.s$a r1 = r7.f3015f
            boolean r1 = r1 instanceof com.ss.android.ugc.aweme.detail.operators.s.b
            if (r1 == 0) goto L_0x05e4
            com.ss.android.ugc.aweme.detail.operators.s$a r1 = r7.f3015f
            com.ss.android.ugc.aweme.detail.operators.s$b r1 = (com.ss.android.ugc.aweme.detail.operators.s.b) r1
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r2 = r7.f3013d
            r1.a((com.ss.android.ugc.aweme.feed.h.x) r2)
        L_0x05e4:
            com.ss.android.ugc.aweme.feed.param.b r1 = r7.f3012c
            r1.setPageType(r0)
            com.ss.android.ugc.aweme.feed.g.d r0 = com.ss.android.ugc.aweme.feed.g.d.a()
            com.ss.android.ugc.aweme.video.o r0 = r0.f45349b
            com.ss.android.ugc.aweme.feed.g.d r1 = com.ss.android.ugc.aweme.feed.g.d.a()
            r1.f45349b = r5
            if (r0 == 0) goto L_0x0644
            android.support.v4.app.FragmentActivity r1 = r22.getActivity()
            if (r1 == 0) goto L_0x0644
            com.ss.android.ugc.aweme.feed.g.d r1 = com.ss.android.ugc.aweme.feed.g.d.a()
            com.ss.android.ugc.aweme.feed.param.b r2 = r7.f3012c
            java.lang.String r2 = r2.getAid()
            r1.f45350c = r2
            java.lang.String r1 = "DetailPageFragment"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "use share player manager, from "
            r2.<init>(r3)
            com.ss.android.ugc.aweme.feed.param.b r3 = r7.f3012c
            java.lang.String r3 = r3.getFrom()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.String) r1, (java.lang.String) r2)
            android.support.v4.app.FragmentActivity r1 = r22.getActivity()
            com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel r1 = com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel.getViewModel(r1)
            r1.player = r0
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r1 = r7.f3013d
            r1.a((com.ss.android.ugc.aweme.video.o) r0)
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            com.ss.android.ugc.aweme.feed.g.d r1 = com.ss.android.ugc.aweme.feed.g.d.a()
            long r1 = r1.f45351d
            r0.a((long) r1)
            com.ss.android.ugc.aweme.feed.g.d r0 = com.ss.android.ugc.aweme.feed.g.d.a()
            r1 = -1
            r0.f45351d = r1
        L_0x0644:
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            com.ss.android.ugc.aweme.detail.ui.g r1 = new com.ss.android.ugc.aweme.detail.ui.g
            r1.<init>(r7)
            r0.l = r1
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            com.ss.android.ugc.aweme.feed.param.b r1 = r7.f3012c
            r0.a((com.ss.android.ugc.aweme.feed.param.b) r1)
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r7
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commercialize.utils.ak.f39701a
            r16 = 1
            r17 = 32580(0x7f44, float:4.5654E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<android.support.v4.app.Fragment> r2 = android.support.v4.app.Fragment.class
            r1[r11] = r2
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x0691
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r11] = r7
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.commercialize.utils.ak.f39701a
            r16 = 1
            r17 = 32580(0x7f44, float:4.5654E-41)
            java.lang.Class[] r1 = new java.lang.Class[r12]
            java.lang.Class<android.support.v4.app.Fragment> r2 = android.support.v4.app.Fragment.class
            r1[r11] = r2
            java.lang.Class r19 = java.lang.Boolean.TYPE
            r18 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r11 = r1.booleanValue()
            goto L_0x06a4
        L_0x0691:
            android.os.Bundle r1 = r22.getArguments()
            if (r1 != 0) goto L_0x0698
            goto L_0x06a4
        L_0x0698:
            java.lang.String r2 = "trigger_by"
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "splash"
            boolean r11 = android.text.TextUtils.equals(r1, r2)
        L_0x06a4:
            r0.b((boolean) r11)
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            r0.a((android.view.View) r8, (android.os.Bundle) r9)
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            java.lang.String r1 = "from_profile_self"
            java.lang.String r2 = r22.b()
            boolean r1 = r1.equals(r2)
            r0.e((boolean) r1)
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            r0.q = r7
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            r0.j = r7
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            r0.a((com.ss.android.ugc.aweme.feed.listener.a) r7)
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            r0.H = r7
            java.lang.String r0 = r22.b()
            java.lang.String r1 = "from_follow_page"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x06de
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            java.lang.String r1 = "feed"
            r0.ak = r1
        L_0x06de:
            com.ss.android.ugc.aweme.detail.operators.s$a r0 = r7.f3015f
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r1 = r7.f3013d
            r0.a((com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel) r1)
            com.ss.android.ugc.aweme.detail.operators.s$a r0 = r7.f3015f
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x06f0
            r7.a((int) r12)
        L_0x06f0:
            com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel r0 = r7.f3013d
            r0.j()
            com.ss.android.ugc.aweme.feed.a r0 = com.ss.android.ugc.aweme.feed.a.a()
            r0.f44610c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.DetailPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3010a, false, 35114, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.nf, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3010a, false, 35114, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
