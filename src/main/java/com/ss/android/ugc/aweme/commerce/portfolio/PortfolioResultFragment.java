package com.ss.android.ugc.aweme.commerce.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.commerce.portfolio.PortfolioAdapter;
import com.ss.android.ugc.aweme.commerce.preview.h;
import com.ss.android.ugc.aweme.commerce.service.c.a;
import com.ss.android.ugc.aweme.commerce.service.logs.l;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.models.t;
import com.ss.android.ugc.aweme.commerce.service.models.u;
import com.ss.android.ugc.aweme.commerce.service.models.w;
import com.ss.android.ugc.aweme.commerce.service.stagger.SmartRecyclerAdapter;
import com.ss.android.ugc.aweme.commerce.service.widgets.NoneSymmetryDecoration;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\n\u0010 \u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\"H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\"H\u0002J&\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\"H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u000202H\u0002J\u001a\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\u0011H\u0002J\u0018\u00107\u001a\u00020\"2\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002J\b\u00109\u001a\u00020\"H\u0002J\u0018\u0010:\u001a\u00020\"2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010<H\u0002J\b\u0010=\u001a\u00020\"H\u0002J\b\u0010>\u001a\u00020\"H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioResultFragment;", "Lcom/bytedance/ies/uikit/base/AbsFragment;", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioAdapter$SelectContainer;", "Lcom/ss/android/ugc/aweme/commerce/service/stagger/SmartRecyclerAdapter$OnMoreCallback;", "()V", "footerView", "Landroid/widget/FrameLayout;", "mCarrierType", "", "mCategoryId", "", "Ljava/lang/Long;", "mCursor", "", "mEnterMethod", "mGoods", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "mGoodsAdapter", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioAdapter;", "mHasMore", "", "mKeyWord", "mLoading", "mSourcePage", "mUser", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "selectColumn", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "sortColumns", "getFooterView", "Landroid/view/View;", "getSelectedColumn", "handleExceptionHappened", "", "initData", "initGoodsView", "initSortColumn", "initViews", "loadData", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMore", "onSuccessLoad", "response", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "onViewCreated", "view", "performPurchase", "good", "refreshGoods", "goods", "refreshMoreView", "refreshSort", "columns", "", "resetAndReload", "showLoading", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioResultFragment extends AbsFragment implements PortfolioAdapter.a, SmartRecyclerAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37027a;
    public static final a o = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public t f37028b;

    /* renamed from: c  reason: collision with root package name */
    public List<t> f37029c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    final List<w> f37030d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    int f37031e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f37032f;
    boolean g = true;
    public FrameLayout h;
    public CommerceUser i;
    String j;
    public String k = "";
    public final String l = "store_page";
    public String m = "";
    PortfolioAdapter n;
    private Long p;
    private HashMap q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioResultFragment$Companion;", "", "()V", "BATCH_SIZE", "", "CATEGORY_ID", "", "COLUMNS", "KEY_WORD", "USER", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "<anonymous parameter 1>", "", "invoke", "com/ss/android/ugc/aweme/commerce/portfolio/PortfolioResultFragment$initGoodsView$1$2"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<w, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioResultFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PortfolioResultFragment portfolioResultFragment) {
            super(2);
            this.this$0 = portfolioResultFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((w) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull w wVar, @NotNull String str) {
            w wVar2 = wVar;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{wVar2, str2}, this, changeQuickRedirect, false, 28443, new Class[]{w.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{wVar2, str2}, this, changeQuickRedirect, false, 28443, new Class[]{w.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(wVar2, "good");
            Intrinsics.checkParameterIsNotNull(str2, "<anonymous parameter 1>");
            PortfolioResultFragment portfolioResultFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[]{wVar2}, portfolioResultFragment, PortfolioResultFragment.f37027a, false, 28428, new Class[]{w.class}, Void.TYPE)) {
                PortfolioResultFragment portfolioResultFragment2 = portfolioResultFragment;
                PatchProxy.accessDispatch(new Object[]{wVar2}, portfolioResultFragment2, PortfolioResultFragment.f37027a, false, 28428, new Class[]{w.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.g.a(portfolioResultFragment.getContext(), portfolioResultFragment.l, portfolioResultFragment.k, wVar.getPromotionSource(), (Function0<Unit>) new g<Unit>(portfolioResultFragment, wVar2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<View, Boolean> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((View) obj));
        }

        public final boolean invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 28444, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 28444, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            return view2 instanceof FrameLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "column", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function1<t, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioResultFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PortfolioResultFragment portfolioResultFragment) {
            super(1);
            this.this$0 = portfolioResultFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((t) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull t tVar) {
            String str;
            t tVar2 = tVar;
            if (PatchProxy.isSupport(new Object[]{tVar2}, this, changeQuickRedirect, false, 28445, new Class[]{t.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{tVar2}, this, changeQuickRedirect, false, 28445, new Class[]{t.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(tVar2, "column");
            if (!this.this$0.f37032f) {
                if (!tVar.getSelected()) {
                    for (t selected : this.this$0.f37029c) {
                        selected.setSelected(false);
                    }
                    tVar2.setSelected(true);
                    if (Intrinsics.areEqual((Object) tVar.getId(), (Object) "3")) {
                        tVar2.setSort(1);
                    }
                } else if (!tVar.getCanReverse()) {
                    return;
                } else {
                    if (tVar.getSort() == 0) {
                        tVar2.setSort(1);
                    } else {
                        tVar2.setSort(0);
                    }
                }
                this.this$0.f37028b = tVar2;
                RecyclerView recyclerView = (RecyclerView) this.this$0.a(C0906R.id.cit);
                if (recyclerView != null) {
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    if (adapter != null) {
                        adapter.notifyDataSetChanged();
                    }
                }
                l lVar = new l();
                a.C0494a aVar = com.ss.android.ugc.aweme.commerce.service.c.a.f37960a;
                t tVar3 = this.this$0.f37028b;
                if (tVar3 != null) {
                    str = tVar3.getId();
                } else {
                    str = null;
                }
                lVar.f38140f = aVar.a(str);
                lVar.g = this.this$0.m;
                lVar.b();
                PortfolioResultFragment portfolioResultFragment = this.this$0;
                if (PatchProxy.isSupport(new Object[0], portfolioResultFragment, PortfolioResultFragment.f37027a, false, 28430, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], portfolioResultFragment, PortfolioResultFragment.f37027a, false, 28430, new Class[0], Void.TYPE);
                    return;
                }
                portfolioResultFragment.f37031e = 0;
                portfolioResultFragment.g = true;
                portfolioResultFragment.f37030d.clear();
                PortfolioAdapter portfolioAdapter = portfolioResultFragment.n;
                if (portfolioAdapter != null) {
                    portfolioAdapter.a();
                }
                PortfolioAdapter portfolioAdapter2 = portfolioResultFragment.n;
                if (portfolioAdapter2 != null) {
                    portfolioAdapter2.notifyDataSetChanged();
                }
                portfolioResultFragment.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioResultFragment f37034b;

        e(PortfolioResultFragment portfolioResultFragment) {
            this.f37034b = portfolioResultFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37033a, false, 28446, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37033a, false, 28446, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            DmtTextView dmtTextView = (DmtTextView) this.f37034b.a(C0906R.id.a36);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "default_load_text");
            if (dmtTextView.getVisibility() == 0) {
                DmtTextView dmtTextView2 = (DmtTextView) this.f37034b.a(C0906R.id.a36);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "default_load_text");
                if (TextUtils.equals(dmtTextView2.getText(), this.f37034b.getString(C0906R.string.ake))) {
                    this.f37034b.a();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "success", "", "shopPromotionListResponse", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<Boolean, u, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioResultFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PortfolioResultFragment portfolioResultFragment) {
            super(2);
            this.this$0 = portfolioResultFragment;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), (u) obj2);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Removed duplicated region for block: B:53:0x01de  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x01f1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(boolean r24, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.commerce.service.models.u r25) {
            /*
                r23 = this;
                r7 = r23
                r8 = r25
                r9 = 2
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r24)
                r10 = 0
                r0[r10] = r1
                r11 = 1
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r10] = r1
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.u> r1 = com.ss.android.ugc.aweme.commerce.service.models.u.class
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 28447(0x6f1f, float:3.9863E-41)
                r1 = r23
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x004b
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Byte r1 = java.lang.Byte.valueOf(r24)
                r0[r10] = r1
                r0[r11] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
                r3 = 0
                r4 = 28447(0x6f1f, float:3.9863E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Boolean.TYPE
                r5[r10] = r1
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.u> r1 = com.ss.android.ugc.aweme.commerce.service.models.u.class
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r23
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x004b:
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r0 = r7.this$0
                r0.f37032f = r10
                r0 = 2131561051(0x7f0d0a5b, float:1.8747492E38)
                r1 = 2131166294(0x7f070456, float:1.794683E38)
                r2 = 2131168298(0x7f070c2a, float:1.7950894E38)
                r3 = 2131168299(0x7f070c2b, float:1.7950896E38)
                r4 = 2131166068(0x7f070374, float:1.794637E38)
                r5 = 2131168297(0x7f070c29, float:1.7950892E38)
                r6 = 8
                r9 = 4
                if (r24 == 0) goto L_0x0303
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r15 = r7.this$0
                if (r8 != 0) goto L_0x006d
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x006d:
                java.lang.Object[] r12 = new java.lang.Object[r11]
                r12[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r16 = 0
                r17 = 28432(0x6f10, float:3.9842E-41)
                java.lang.Class[] r13 = new java.lang.Class[r11]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.u> r18 = com.ss.android.ugc.aweme.commerce.service.models.u.class
                r13[r10] = r18
                java.lang.Class r18 = java.lang.Void.TYPE
                r19 = r13
                r13 = r15
                r20 = r15
                r15 = r16
                r16 = r17
                r17 = r19
                boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r12 == 0) goto L_0x00aa
                java.lang.Object[] r12 = new java.lang.Object[r11]
                r12[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r15 = 0
                r16 = 28432(0x6f10, float:3.9842E-41)
                java.lang.Class[] r0 = new java.lang.Class[r11]
                java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.u> r1 = com.ss.android.ugc.aweme.commerce.service.models.u.class
                r0[r10] = r1
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r20
                r17 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x03d2
            L_0x00aa:
                r15 = r20
                java.lang.String r12 = r15.j
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                boolean r12 = android.text.TextUtils.isEmpty(r12)
                if (r12 != 0) goto L_0x00da
                int r12 = r15.f37031e
                if (r12 != 0) goto L_0x00da
                com.ss.android.ugc.aweme.commerce.service.logs.ay r12 = new com.ss.android.ugc.aweme.commerce.service.logs.ay
                r12.<init>()
                java.lang.String r13 = r15.j
                r12.f38102f = r13
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r13 = r8.f38229a
                if (r13 == 0) goto L_0x00d3
                java.util.Collection r13 = (java.util.Collection) r13
                boolean r13 = r13.isEmpty()
                r13 = r13 ^ r11
                if (r13 != r11) goto L_0x00d3
                java.lang.String r13 = "true"
                goto L_0x00d5
            L_0x00d3:
                java.lang.String r13 = "false"
            L_0x00d5:
                r12.g = r13
                r12.b()
            L_0x00da:
                int r12 = r15.f37031e
                int r12 = r12 + 20
                r15.f37031e = r12
                boolean r12 = r8.f38232d
                r15.g = r12
                android.view.View r1 = r15.a(r1)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                java.lang.String r12 = "default_load_area"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r12)
                r1.setVisibility(r6)
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.t> r1 = r8.f38230b
                java.lang.Object[] r12 = new java.lang.Object[r11]
                r12[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r16 = 0
                r17 = 28434(0x6f12, float:3.9845E-41)
                java.lang.Class[] r13 = new java.lang.Class[r11]
                java.lang.Class<java.util.List> r18 = java.util.List.class
                r13[r10] = r18
                java.lang.Class r18 = java.lang.Void.TYPE
                r19 = r13
                r13 = r15
                r21 = r15
                r15 = r16
                r16 = r17
                r17 = r19
                boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r12 == 0) goto L_0x0132
                java.lang.Object[] r12 = new java.lang.Object[r11]
                r12[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r15 = 0
                r16 = 28434(0x6f12, float:3.9845E-41)
                java.lang.Class[] r1 = new java.lang.Class[r11]
                java.lang.Class<java.util.List> r13 = java.util.List.class
                r1[r10] = r13
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r21
                r17 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                r15 = r21
                goto L_0x0160
            L_0x0132:
                r15 = r21
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.t> r12 = r15.f37029c
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L_0x0160
                if (r1 == 0) goto L_0x0160
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r12 = r1.isEmpty()
                r12 = r12 ^ r11
                if (r12 != r11) goto L_0x0160
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.t> r12 = r15.f37029c
                r12.addAll(r1)
                r1 = 2131169647(0x7f07116f, float:1.795363E38)
                android.view.View r1 = r15.a(r1)
                android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
                if (r1 == 0) goto L_0x0160
                android.support.v7.widget.RecyclerView$Adapter r1 = r1.getAdapter()
                if (r1 == 0) goto L_0x0160
                r1.notifyDataSetChanged()
            L_0x0160:
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r1 = r8.f38229a
                java.lang.Object[] r12 = new java.lang.Object[r11]
                r12[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r8 = 0
                r16 = 28435(0x6f13, float:3.9846E-41)
                java.lang.Class[] r13 = new java.lang.Class[r11]
                java.lang.Class<java.util.List> r17 = java.util.List.class
                r13[r10] = r17
                java.lang.Class r18 = java.lang.Void.TYPE
                r17 = r13
                r13 = r15
                r22 = r15
                r15 = r8
                boolean r8 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r8 == 0) goto L_0x019a
                java.lang.Object[] r12 = new java.lang.Object[r11]
                r12[r10] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r15 = 0
                r16 = 28435(0x6f13, float:3.9846E-41)
                java.lang.Class[] r1 = new java.lang.Class[r11]
                java.lang.Class<java.util.List> r8 = java.util.List.class
                r1[r10] = r8
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r22
                r17 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            L_0x0197:
                r8 = r22
                goto L_0x01ca
            L_0x019a:
                if (r1 == 0) goto L_0x0197
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r8 = r1.isEmpty()
                r8 = r8 ^ r11
                if (r8 != r11) goto L_0x0197
                r8 = r22
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r12 = r8.f37030d
                int r12 = r12.size()
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r13 = r8.f37030d
                r13.addAll(r1)
                if (r12 != 0) goto L_0x01bc
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioAdapter r1 = r8.n
                if (r1 == 0) goto L_0x01ca
                r1.notifyDataSetChanged()
                goto L_0x01ca
            L_0x01bc:
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioAdapter r1 = r8.n
                if (r1 == 0) goto L_0x01ca
                int r12 = r12 + r11
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r11 = r8.f37030d
                int r11 = r11.size()
                r1.notifyItemRangeInserted(r12, r11)
            L_0x01ca:
                java.lang.Object[] r12 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r15 = 0
                r16 = 28433(0x6f11, float:3.9843E-41)
                java.lang.Class[] r1 = new java.lang.Class[r10]
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r8
                r17 = r1
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r1 == 0) goto L_0x01f1
                java.lang.Object[] r12 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r15 = 0
                r16 = 28433(0x6f11, float:3.9843E-41)
                java.lang.Class[] r0 = new java.lang.Class[r10]
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r8
                r17 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                goto L_0x03d2
            L_0x01f1:
                boolean r1 = r8.g
                if (r1 != 0) goto L_0x02a0
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r1 = r8.f37030d
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x023f
                android.widget.FrameLayout r0 = r8.h
                if (r0 != 0) goto L_0x0206
                java.lang.String r1 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            L_0x0206:
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r5)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                java.lang.String r1 = "footerView.loading_more_area"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r9)
                android.view.View r0 = r8.a(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
                r0.setVisibility(r10)
                android.support.v4.app.FragmentActivity r1 = r8.getActivity()
                boolean r1 = r1 instanceof com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity
                if (r1 == 0) goto L_0x0231
                r1 = 2131559393(0x7f0d03e1, float:1.8744129E38)
                java.lang.String r1 = r8.getString(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                goto L_0x023a
            L_0x0231:
                r1 = 2131559318(0x7f0d0396, float:1.8743977E38)
                java.lang.String r1 = r8.getString(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            L_0x023a:
                r0.setText(r1)
                goto L_0x03d2
            L_0x023f:
                android.view.View r1 = r8.a(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r4 = "commerce_portfolio_result_empty"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                r1.setVisibility(r6)
                android.widget.FrameLayout r1 = r8.h
                if (r1 != 0) goto L_0x0256
                java.lang.String r4 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x0256:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r5)
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
                java.lang.String r4 = "footerView.loading_more_area"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                r1.setVisibility(r10)
                android.widget.FrameLayout r1 = r8.h
                if (r1 != 0) goto L_0x026f
                java.lang.String r4 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x026f:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                java.lang.String r3 = "footerView.loading_more_progress"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setVisibility(r9)
                android.widget.FrameLayout r1 = r8.h
                if (r1 != 0) goto L_0x0288
                java.lang.String r3 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x0288:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r2)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r2 = "footerView.loading_more_content"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                java.lang.String r0 = r8.getString(r0)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setText(r0)
                goto L_0x03d2
            L_0x02a0:
                android.widget.FrameLayout r0 = r8.h
                if (r0 != 0) goto L_0x02a9
                java.lang.String r1 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            L_0x02a9:
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r5)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                java.lang.String r1 = "footerView.loading_more_area"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r10)
                android.view.View r0 = r8.a(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
                java.lang.String r1 = "commerce_portfolio_result_empty"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r6)
                android.widget.FrameLayout r0 = r8.h
                if (r0 != 0) goto L_0x02d0
                java.lang.String r1 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            L_0x02d0:
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r3)
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                java.lang.String r1 = "footerView.loading_more_progress"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r10)
                android.widget.FrameLayout r0 = r8.h
                if (r0 != 0) goto L_0x02e9
                java.lang.String r1 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            L_0x02e9:
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r2)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
                java.lang.String r1 = "footerView.loading_more_content"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r1 = 2131560212(0x7f0d0714, float:1.874579E38)
                java.lang.String r1 = r8.getString(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                return
            L_0x0303:
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r8 = r7.this$0
                java.lang.Object[] r12 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r15 = 0
                r16 = 28436(0x6f14, float:3.9847E-41)
                java.lang.Class[] r13 = new java.lang.Class[r10]
                java.lang.Class r18 = java.lang.Void.TYPE
                r17 = r13
                r13 = r8
                boolean r12 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r12 == 0) goto L_0x032c
                java.lang.Object[] r0 = new java.lang.Object[r10]
                com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f37027a
                r11 = 0
                r12 = 28436(0x6f14, float:3.9847E-41)
                java.lang.Class[] r13 = new java.lang.Class[r10]
                java.lang.Class r14 = java.lang.Void.TYPE
                r15 = r8
                r8 = r0
                r9 = r15
                r10 = r1
                com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
                return
            L_0x032c:
                r15 = r8
                java.util.List<com.ss.android.ugc.aweme.commerce.service.models.w> r8 = r15.f37030d
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x0398
                android.widget.FrameLayout r0 = r15.h
                if (r0 != 0) goto L_0x033e
                java.lang.String r2 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            L_0x033e:
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r5)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                java.lang.String r2 = "footerView.loading_more_area"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r0.setVisibility(r9)
                android.view.View r0 = r15.a(r4)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
                java.lang.String r2 = "commerce_portfolio_result_empty"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
                r0.setVisibility(r6)
                android.view.View r0 = r15.a(r1)
                android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
                java.lang.String r1 = "default_load_area"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r10)
                r0 = 2131166295(0x7f070457, float:1.7946831E38)
                android.view.View r0 = r15.a(r0)
                android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
                java.lang.String r1 = "default_load_progress"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r0.setVisibility(r9)
                r0 = 2131166296(0x7f070458, float:1.7946833E38)
                android.view.View r0 = r15.a(r0)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
                java.lang.String r1 = "default_load_text"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                r1 = 2131560210(0x7f0d0712, float:1.8745786E38)
                java.lang.String r1 = r15.getString(r1)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                r15.g = r11
                return
            L_0x0398:
                android.widget.FrameLayout r1 = r15.h
                if (r1 != 0) goto L_0x03a1
                java.lang.String r4 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            L_0x03a1:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r3)
                android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
                java.lang.String r3 = "footerView.loading_more_progress"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
                r1.setVisibility(r9)
                android.widget.FrameLayout r1 = r15.h
                if (r1 != 0) goto L_0x03ba
                java.lang.String r3 = "footerView"
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            L_0x03ba:
                android.view.View r1 = (android.view.View) r1
                android.view.View r1 = r1.findViewById(r2)
                com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
                java.lang.String r2 = "footerView.loading_more_content"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                java.lang.String r0 = r15.getString(r0)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1.setText(r0)
                r15.g = r10
            L_0x03d2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment.f.invoke(boolean, com.ss.android.ugc.aweme.commerce.service.models.u):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ w $good;
        final /* synthetic */ PortfolioResultFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PortfolioResultFragment portfolioResultFragment, w wVar) {
            super(0);
            this.this$0 = portfolioResultFragment;
            this.$good = wVar;
        }

        public final void invoke() {
            String str;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28448, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28448, new Class[0], Void.TYPE);
                return;
            }
            if (this.this$0.getContext() != null) {
                h.a aVar = h.f37502d;
                n.a aVar2 = n.r;
                Context context = this.this$0.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                CommerceUser commerceUser = this.this$0.i;
                if (commerceUser == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mUser");
                }
                String promotionId = this.$good.getPromotionId();
                if (promotionId == null) {
                    promotionId = "";
                }
                String str2 = promotionId;
                String productId = this.$good.getProductId();
                if (productId == null) {
                    productId = "";
                }
                String str3 = productId;
                String detailUrl = this.$good.getDetailUrl();
                String str4 = this.this$0.l;
                String str5 = this.this$0.k;
                String str6 = this.this$0.m;
                long uptimeMillis = SystemClock.uptimeMillis();
                long promotionSource = this.$good.getPromotionSource();
                a.C0494a aVar3 = com.ss.android.ugc.aweme.commerce.service.c.a.f37960a;
                t tVar = this.this$0.f37028b;
                if (tVar != null) {
                    str = tVar.getId();
                } else {
                    str = null;
                }
                aVar.a(n.a.a(aVar2, context, commerceUser, str2, str3, detailUrl, str4, str5, null, null, str6, null, null, uptimeMillis, promotionSource, aVar3.a(str), null, null, null, 232448));
            }
        }
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37027a, false, 28439, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37027a, false, 28439, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.q == null) {
            this.q = new HashMap();
        }
        View view = (View) this.q.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.q.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    @Nullable
    public final t c() {
        return this.f37028b;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28438, new Class[0], Void.TYPE);
            return;
        }
        if ((!this.f37030d.isEmpty()) && this.g && !this.f37032f) {
            a();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28440, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.clear();
        }
    }

    public final void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28431, new Class[0], Void.TYPE);
        } else if (!this.f37032f) {
            this.f37032f = true;
            d();
            int i2 = this.f37031e;
            CommerceUser commerceUser = this.i;
            if (commerceUser == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mUser");
            }
            String uid = commerceUser.getUid();
            t tVar = this.f37028b;
            Integer num = null;
            if (tVar != null) {
                str = tVar.getId();
            } else {
                str = null;
            }
            t tVar2 = this.f37028b;
            if (tVar2 != null) {
                num = Integer.valueOf(tVar2.getSort());
            }
            com.ss.android.ugc.aweme.commerce.portfolio.api.a.a(20, i2, uid, str, num, this.j, this.p, new f(this));
        }
    }

    private final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28437, new Class[0], Void.TYPE);
        } else if (this.f37030d.isEmpty()) {
            DmtTextView dmtTextView = (DmtTextView) a(C0906R.id.x0);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerce_portfolio_result_empty");
            dmtTextView.setVisibility(8);
            FrameLayout frameLayout = this.h;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.bjb);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "footerView.loading_more_area");
            linearLayout.setVisibility(4);
            LinearLayout linearLayout2 = (LinearLayout) a(C0906R.id.a34);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "default_load_area");
            linearLayout2.setVisibility(0);
            ProgressBar progressBar = (ProgressBar) a(C0906R.id.a35);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "default_load_progress");
            progressBar.setVisibility(0);
            DmtTextView dmtTextView2 = (DmtTextView) a(C0906R.id.a36);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "default_load_text");
            dmtTextView2.setText(getString(C0906R.string.akg));
        } else {
            DmtTextView dmtTextView3 = (DmtTextView) a(C0906R.id.x0);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "commerce_portfolio_result_empty");
            dmtTextView3.setVisibility(8);
            FrameLayout frameLayout2 = this.h;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            LinearLayout linearLayout3 = (LinearLayout) frameLayout2.findViewById(C0906R.id.bjb);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "footerView.loading_more_area");
            linearLayout3.setVisibility(0);
            LinearLayout linearLayout4 = (LinearLayout) a(C0906R.id.a34);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "default_load_area");
            linearLayout4.setVisibility(8);
            FrameLayout frameLayout3 = this.h;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            ProgressBar progressBar2 = (ProgressBar) frameLayout3.findViewById(C0906R.id.bjd);
            Intrinsics.checkExpressionValueIsNotNull(progressBar2, "footerView.loading_more_progress");
            progressBar2.setVisibility(0);
            FrameLayout frameLayout4 = this.h;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            DmtTextView dmtTextView4 = (DmtTextView) frameLayout4.findViewById(C0906R.id.bjc);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "footerView.loading_more_content");
            dmtTextView4.setText(getString(C0906R.string.akg));
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Object obj;
        Serializable serializable;
        String str;
        Serializable serializable2;
        Long l2;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f37027a, false, 28423, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f37027a, false, 28423, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28424, new Class[0], Void.TYPE);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable(AllStoryActivity.f73306b);
            } else {
                serializable = null;
            }
            if (serializable != null) {
                this.i = (CommerceUser) serializable;
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    str = arguments2.getString("key_word");
                } else {
                    str = null;
                }
                this.j = str;
                if (getActivity() instanceof ClassifyResultActivity) {
                    Bundle arguments3 = getArguments();
                    if (arguments3 != null) {
                        l2 = Long.valueOf(arguments3.getLong("category_id"));
                    } else {
                        l2 = null;
                    }
                    this.p = l2;
                    this.m = "classification_result";
                    this.k = "click_classification_result";
                } else {
                    this.m = "search_result";
                    this.k = "click_search_result";
                }
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    serializable2 = arguments4.getSerializable("columns");
                } else {
                    serializable2 = null;
                }
                if (serializable2 != null) {
                    this.f37029c = TypeIntrinsics.asMutableList(serializable2);
                    if (!this.f37029c.isEmpty()) {
                        for (t selected : this.f37029c) {
                            selected.setSelected(false);
                        }
                        this.f37028b = this.f37029c.get(0);
                        t tVar = this.f37028b;
                        if (tVar != null) {
                            tVar.setSelected(true);
                        }
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.commerce.service.models.ShopColumn>");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.service.models.CommerceUser");
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28425, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28429, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28429, new Class[0], Void.TYPE);
            } else {
                RecyclerView recyclerView = (RecyclerView) a(C0906R.id.cit);
                if (recyclerView != null) {
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                    linearLayoutManager.setOrientation(0);
                    recyclerView.setLayoutManager(linearLayoutManager);
                }
                RecyclerView recyclerView2 = (RecyclerView) a(C0906R.id.cit);
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(new PortfolioSortAdapter(this.f37029c, new d(this), null, 4));
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28427, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28427, new Class[0], Void.TYPE);
            } else {
                RecyclerView recyclerView3 = (RecyclerView) a(C0906R.id.ccf);
                if (recyclerView3 != null) {
                    recyclerView3.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
                    Context context = recyclerView3.getContext();
                    if (context == null) {
                        context = k.g();
                        Intrinsics.checkExpressionValueIsNotNull(context, "AwemeApplication.getAppContext()");
                    }
                    recyclerView3.addItemDecoration(new NoneSymmetryDecoration(context, 8.0f, 2.0f, c.INSTANCE));
                    List<w> list = this.f37030d;
                    CommerceUser commerceUser = this.i;
                    if (commerceUser == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mUser");
                    }
                    PortfolioAdapter portfolioAdapter = new PortfolioAdapter(list, commerceUser.getUid(), this.k, this.l, this, this.m, new b(this));
                    this.n = portfolioAdapter;
                    PortfolioAdapter portfolioAdapter2 = this.n;
                    if (portfolioAdapter2 == null) {
                        Intrinsics.throwNpe();
                    }
                    SmartRecyclerAdapter smartRecyclerAdapter = new SmartRecyclerAdapter(portfolioAdapter2);
                    smartRecyclerAdapter.f38253d = this;
                    if (PatchProxy.isSupport(new Object[0], this, f37027a, false, 28426, new Class[0], View.class)) {
                        obj = PatchProxy.accessDispatch(new Object[0], this, f37027a, false, 28426, new Class[0], View.class);
                    } else {
                        if (this.h == null) {
                            this.h = new FrameLayout(getContext());
                            FrameLayout frameLayout = this.h;
                            if (frameLayout == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("footerView");
                            }
                            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                            LayoutInflater from = LayoutInflater.from(getContext());
                            FrameLayout frameLayout2 = this.h;
                            if (frameLayout2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("footerView");
                            }
                            View inflate = from.inflate(C0906R.layout.a5l, frameLayout2, false);
                            FrameLayout frameLayout3 = this.h;
                            if (frameLayout3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("footerView");
                            }
                            frameLayout3.addView(inflate, new RecyclerView.LayoutParams(-1, -2));
                        }
                        FrameLayout frameLayout4 = this.h;
                        if (frameLayout4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("footerView");
                        }
                        frameLayout4.setVisibility(0);
                        obj = this.h;
                        if (obj == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("footerView");
                        }
                    }
                    smartRecyclerAdapter.b((View) obj);
                    recyclerView3.setAdapter(smartRecyclerAdapter);
                }
            }
            ((DmtTextView) a(C0906R.id.a36)).setOnClickListener(new e(this));
        }
        a();
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f37027a, false, 28422, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f37027a, false, 28422, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.abv, viewGroup2, false);
    }
}
