package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.feed.h.q;
import com.ss.android.ugc.aweme.live.feedpage.g;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0014J\u0016\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0014J\u0016\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012J\u0006\u0010&\u001a\u00020\u0014J\u0006\u0010'\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0016J\u001c\u0010*\u001a\u00020\u000f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0018\u001a\u00020\u0014J\u0014\u0010,\u001a\u00020\u000f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0.J\u000e\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u0012J\u0016\u00101\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0014J&\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00122\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\u0006\u0010\u001d\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightHelper;", "", "()V", "mListView", "Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightListView;", "mPopupWindow", "Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightPopupWindow;", "mPresenter", "Lcom/ss/android/ugc/aweme/feed/presenter/FollowLiveSkyLightPresenter;", "mRoomList", "", "Lcom/ss/android/ugc/aweme/live/feedpage/RoomItem;", "mUrlString", "", "dismissSkyLightPopupWindow", "", "doArrowAnimation", "view", "Landroid/view/View;", "isDown", "", "doOnCancelFollow", "", "uid", "needRefresh", "doShowListView", "getLiveSkyLightHeightWithMargin", "hasTopSpace", "hideSkyLightTxt", "needAnim", "init", "context", "Landroid/content/Context;", "fragment", "Lcom/ss/android/ugc/aweme/feed/ui/FeedFollowFragment;", "initContainerTopMargin", "topContainer", "bottomContainer", "isDataEmpty", "onDestroy", "refreshList", "refreshType", "setData", "roomList", "setListEnterLiveCallBack", "callback", "Lkotlin/Function0;", "showSkyLightPopupWindow", "textLayout", "showSkyLightTxt", "toggleSkyLightTopContainer", "container", "start", "", "end", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46463a;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f46464f;
    public static boolean g = true;
    public static final a h = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    q f46465b;

    /* renamed from: c  reason: collision with root package name */
    FollowLiveSkyLightListView f46466c;

    /* renamed from: d  reason: collision with root package name */
    ah f46467d;

    /* renamed from: e  reason: collision with root package name */
    List<g> f46468e = new ArrayList();
    private String i = "https://webcast.amemv.com/webcast/feed/?content_type=1&channel_id=37";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0007J\b\u0010\u001f\u001a\u00020\u0016H\u0007J\b\u0010 \u001a\u00020\u0016H\u0007J\b\u0010!\u001a\u00020\u0016H\u0007J\b\u0010\"\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011XT¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightHelper$Companion;", "", "()V", "ANIMATOR_DURATION", "", "BOTTOM_CONTAINER_MARGIN", "", "DEFAULT_URL_STRING", "", "LIVE_SKY_LIGHT_STYLE_C_MARGIN", "ROTATION_VALUE", "", "SHORT_ANIMATOR_DURATION", "SKYLIGHT_HEIGHT", "SKYLIGHT_HEIGHT_WITH_TOP_SPACE", "TOP_CONTAINER_MARGIN", "TYPE_AUTO_REFRESH", "", "TYPE_BOTTOM_TAB", "TYPE_LEAVE_LIVE_REFRESH", "TYPE_SLIDE_REFRESH", "isColdStart", "", "isColdStart$annotations", "()Z", "setColdStart", "(Z)V", "isFollowLiveLabelShowing", "isFollowLiveLabelShowing$annotations", "setFollowLiveLabelShowing", "isFollowFeedSkyLiveStyleB", "isFollowFeedSkyLiveStyleC", "needFollow2TabShowSkyLight", "needFollowLiveSkyLightAutoShow", "needShowFollowLiveSkyLight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46469a;

        private a() {
        }

        private static boolean f() {
            return ag.f46464f;
        }

        private static boolean g() {
            return ag.g;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
            if (r1.bN() == 0) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
            if (com.ss.android.ugc.aweme.main.MainPageExperimentHelper.b() != false) goto L_0x0047;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f46469a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r4 = 0
                r5 = 42820(0xa744, float:6.0004E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x002c
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f46469a
                r5 = 0
                r6 = 42820(0xa744, float:6.0004E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x002c:
                boolean r1 = com.ss.android.ugc.aweme.main.MainPageExperimentHelper.n()
                if (r1 == 0) goto L_0x0041
                com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r2 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                int r1 = r1.bN()
                if (r1 != 0) goto L_0x0047
            L_0x0041:
                boolean r1 = com.ss.android.ugc.aweme.main.MainPageExperimentHelper.b()
                if (r1 == 0) goto L_0x0048
            L_0x0047:
                r0 = 1
            L_0x0048:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.ag.a.a():boolean");
        }

        @JvmStatic
        public final boolean b() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f46469a, false, 42821, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46469a, false, 42821, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (MainPageExperimentHelper.n()) {
                AbTestManager a2 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                if (a2.bN() == 3) {
                    z = true;
                }
            }
            return z;
        }

        @JvmStatic
        public final boolean c() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f46469a, false, 42822, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46469a, false, 42822, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (MainPageExperimentHelper.n()) {
                AbTestManager a2 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                if (a2.bN() == 2) {
                    z = true;
                }
            }
            return z;
        }

        @JvmStatic
        public final boolean d() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f46469a, false, 42823, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46469a, false, 42823, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (MainPageExperimentHelper.b()) {
                AbTestManager a2 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                if (a2.bO() != 0) {
                    z = true;
                }
            }
            return z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
            if (r1.bP() != 1) goto L_0x0048;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean e() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f46469a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Boolean.TYPE
                r4 = 0
                r5 = 42824(0xa748, float:6.0009E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x002c
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f46469a
                r5 = 0
                r6 = 42824(0xa748, float:6.0009E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r3 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x002c:
                boolean r1 = f()
                r2 = 1
                if (r1 != 0) goto L_0x005a
                boolean r1 = g()
                if (r1 == 0) goto L_0x0048
                com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r3 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                int r1 = r1.bP()
                if (r1 == r2) goto L_0x005a
            L_0x0048:
                com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r3 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                int r1 = r1.bP()
                r3 = 2
                if (r1 != r3) goto L_0x0059
                goto L_0x005a
            L_0x0059:
                return r0
            L_0x005a:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.ag.a.e():boolean");
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightHelper$hideSkyLightTxt$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46470a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f46471b;

        b(View view) {
            this.f46471b = view;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f46470a, false, 42825, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f46470a, false, 42825, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            this.f46471b.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/feed/ui/FollowLiveSkyLightHelper$showSkyLightTxt$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f46473b;

        c(View view) {
            this.f46473b = view;
        }

        public final void onAnimationStart(@NotNull Animator animator) {
            Animator animator2 = animator;
            if (PatchProxy.isSupport(new Object[]{animator2}, this, f46472a, false, 42826, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator2}, this, f46472a, false, 42826, new Class[]{Animator.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(animator2, "animation");
            this.f46473b.setVisibility(0);
        }
    }

    public static final void b(boolean z) {
        f46464f = z;
    }

    @JvmStatic
    public static final boolean c() {
        return PatchProxy.isSupport(new Object[0], null, f46463a, true, 42815, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f46463a, true, 42815, new Class[0], Boolean.TYPE)).booleanValue() : h.a();
    }

    @JvmStatic
    public static final boolean d() {
        return PatchProxy.isSupport(new Object[0], null, f46463a, true, 42817, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f46463a, true, 42817, new Class[0], Boolean.TYPE)).booleanValue() : h.c();
    }

    @JvmStatic
    public static final boolean e() {
        return PatchProxy.isSupport(new Object[0], null, f46463a, true, 42818, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f46463a, true, 42818, new Class[0], Boolean.TYPE)).booleanValue() : h.d();
    }

    @JvmStatic
    public static final boolean f() {
        return PatchProxy.isSupport(new Object[0], null, f46463a, true, 42819, new Class[0], Boolean.TYPE) ? ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f46463a, true, 42819, new Class[0], Boolean.TYPE)).booleanValue() : h.e();
    }

    public final void a(@NotNull List<g> list, boolean z) {
        List<g> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f46463a, false, 42802, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f46463a, false, 42802, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "roomList");
        this.f46468e = list2;
        if (z) {
            a();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46463a, false, 42803, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46463a, false, 42803, new Class[0], Void.TYPE);
            return;
        }
        FollowLiveSkyLightListView followLiveSkyLightListView = this.f46466c;
        if (followLiveSkyLightListView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mListView");
        }
        followLiveSkyLightListView.setData(this.f46468e);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46463a, false, 42812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46463a, false, 42812, new Class[0], Void.TYPE);
            return;
        }
        ah ahVar = this.f46467d;
        if (ahVar != null) {
            ahVar.b();
            com.ss.android.ugc.aweme.feed.j.a.f45560b.c("auto_show");
            com.ss.android.ugc.aweme.feed.j.a.f45560b.a("auto_show", System.currentTimeMillis() - ahVar.f46478e);
        }
    }

    public final int a(boolean z) {
        double d2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f46463a, false, 42805, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f46463a, false, 42805, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        if (z) {
            d2 = 156.5d;
        } else {
            d2 = 172.5d;
        }
        return u.a(d2) + p.c();
    }

    public final void a(int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46463a, false, 42801, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46463a, false, 42801, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
            String bD = b2.bD();
            if (!TextUtils.isEmpty(bD)) {
                Intrinsics.checkExpressionValueIsNotNull(bD, "stringUrl");
                this.i = bD;
            }
        } catch (Exception unused) {
        }
        q qVar = this.f46465b;
        if (qVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        qVar.a(this.i, i2);
        com.ss.android.ugc.aweme.feed.j.a aVar = com.ss.android.ugc.aweme.feed.j.a.f45560b;
        if (i2 == 2) {
            str = "leave_refresh";
        } else {
            str = "auto_refresh";
        }
        aVar.a(str);
    }

    public final void a(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f46463a, false, 42811, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f46463a, false, 42811, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "textLayout");
        ah ahVar = this.f46467d;
        if (ahVar != null) {
            a();
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            ahVar.showAtLocation(view2, 8388659, iArr[0], iArr[1]);
        }
    }

    public final void b(@NotNull View view, boolean z) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f46463a, false, 42809, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, this, f46463a, false, 42809, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        if (view.getVisibility() == 0) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 0.0f});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 0.0f});
                animatorSet.setDuration(300);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new b(view2));
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                animatorSet.start();
                return;
            }
            view2.setVisibility(8);
        }
    }

    public final void a(@NotNull View view, boolean z) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f46463a, false, 42808, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, this, f46463a, false, 42808, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        if (view.getVisibility() != 0) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{0.0f, 1.0f});
                animatorSet.setDuration(300);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new c(view2));
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                animatorSet.start();
            } else {
                view2.setVisibility(0);
            }
            com.ss.android.ugc.aweme.feed.j.a.f45560b.a();
        }
    }

    public final void a(@NotNull View view, float f2, float f3, boolean z) {
        View view2 = view;
        float f4 = f3;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f46463a, false, 42810, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)}, this, f46463a, false, 42810, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "container");
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationY", new float[]{f2, f4});
            Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(300);
            ofFloat.start();
            return;
        }
        view2.setTranslationY(f4);
    }
}
