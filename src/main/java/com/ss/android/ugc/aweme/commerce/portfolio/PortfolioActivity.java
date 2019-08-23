package com.ss.android.ugc.aweme.commerce.portfolio;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.e.a;
import com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity;
import com.ss.android.ugc.aweme.commerce.portfolio.PortfolioAdapter;
import com.ss.android.ugc.aweme.commerce.portfolio.a.a;
import com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity;
import com.ss.android.ugc.aweme.commerce.preview.b;
import com.ss.android.ugc.aweme.commerce.preview.h;
import com.ss.android.ugc.aweme.commerce.service.l.a;
import com.ss.android.ugc.aweme.commerce.service.l.e;
import com.ss.android.ugc.aweme.commerce.service.logs.am;
import com.ss.android.ugc.aweme.commerce.service.logs.ao;
import com.ss.android.ugc.aweme.commerce.service.logs.au;
import com.ss.android.ugc.aweme.commerce.service.logs.av;
import com.ss.android.ugc.aweme.commerce.service.logs.ax;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.PromotionVisitor;
import com.ss.android.ugc.aweme.commerce.service.models.al;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.stagger.SmartRecyclerAdapter;
import com.ss.android.ugc.aweme.commerce.service.widgets.NoneSymmetryDecoration;
import com.ss.android.ugc.aweme.commerce.service.widgets.PhantomImagesView;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceTextView;
import com.ss.android.ugc.aweme.commerce.service.widgets.SuffixTextView;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.SimpleShareDialog;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dr;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.views.RoundedLinearLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0017H\u0002J\u0016\u0010U\u001a\u00020S2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020-06H\u0002J\b\u0010W\u001a\u00020SH\u0002J\b\u0010X\u001a\u00020SH\u0002J\b\u0010Y\u001a\u00020SH\u0002J\b\u0010Z\u001a\u00020FH\u0002J\b\u0010[\u001a\u00020FH\u0002J\b\u0010\\\u001a\u00020SH\u0002J\b\u0010]\u001a\u00020SH\u0002J\b\u0010^\u001a\u00020SH\u0002J\b\u0010_\u001a\u00020SH\u0016J\b\u0010`\u001a\u000207H\u0016J\b\u0010a\u001a\u00020SH\u0002J\u0010\u0010b\u001a\u00020S2\u0006\u0010c\u001a\u00020\u0019H\u0002J\u0010\u0010d\u001a\u00020S2\u0006\u0010e\u001a\u00020\u0017H\u0002J\u0010\u0010f\u001a\u00020S2\u0006\u0010g\u001a\u00020FH\u0002J\b\u0010h\u001a\u00020SH\u0002J\b\u0010i\u001a\u00020SH\u0002J\b\u0010j\u001a\u00020SH\u0002J\u0010\u0010k\u001a\u00020S2\u0006\u0010l\u001a\u000207H\u0002J\b\u0010m\u001a\u00020SH\u0002J\"\u0010n\u001a\u00020S2\u0006\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010\u001c2\u0006\u0010r\u001a\u00020-H\u0002J\u0010\u0010s\u001a\u00020S2\u0006\u0010t\u001a\u00020FH\u0016J\u0012\u0010u\u001a\u00020S2\b\u0010v\u001a\u0004\u0018\u00010wH\u0014J\b\u0010x\u001a\u00020SH\u0014J\u0010\u0010y\u001a\u00020S2\u0006\u0010z\u001a\u00020{H\u0007J\b\u0010|\u001a\u00020SH\u0016J\b\u0010}\u001a\u00020SH\u0014J\b\u0010~\u001a\u00020SH\u0014J\u0012\u0010\u001a\u00020S2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020SH\u0002J\u0011\u0010\u0001\u001a\u00020S2\u0006\u0010r\u001a\u00020-H\u0002J\u001a\u0010\u0001\u001a\u00020S2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106H\u0002J\u001a\u0010\u0001\u001a\u00020S2\u0007\u0010\u0001\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u0017H\u0002J\t\u0010\u0001\u001a\u00020SH\u0002J\t\u0010\u0001\u001a\u00020SH\u0002J\u0011\u0010\u0001\u001a\u00020S2\u0006\u0010r\u001a\u00020-H\u0002J\u0011\u0010\u0001\u001a\u00020S2\u0006\u0010r\u001a\u00020-H\u0002J\t\u0010\u0001\u001a\u00020SH\u0014J\t\u0010\u0001\u001a\u00020SH\u0002J\u0015\u0010\u0001\u001a\u00020S2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u0012\u0010\u0001\u001a\u00020S2\u0007\u0010\u0001\u001a\u00020\u0019H\u0002J\t\u0010\u0001\u001a\u00020SH\u0002J\t\u0010\u0001\u001a\u00020SH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\"\u0010\u001eR\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0)X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020-0)X\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106X\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010;\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b=\u0010 \u001a\u0004\b<\u0010\u001eR\u001a\u0010>\u001a\u000207X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020DX.¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010FX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u001cXD¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX.¢\u0006\u0002\n\u0000R\u001d\u0010J\u001a\u0004\u0018\u00010\u001c8BX\u0002¢\u0006\f\n\u0004\bL\u0010 \u001a\u0004\bK\u0010\u001eR\u001b\u0010M\u001a\u00020N8BX\u0002¢\u0006\f\n\u0004\bQ\u0010 \u001a\u0004\bO\u0010P¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "Lcom/ss/android/ugc/aweme/commerce/service/stagger/SmartRecyclerAdapter$OnMoreCallback;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioAdapter$SelectContainer;", "()V", "adapter", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioAdapter;", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "awemePlayerBox", "Lcom/ss/android/ugc/aweme/commerce/floatvideo/AwemePlayerBox;", "bubble", "Lcom/ss/android/ugc/aweme/commerce/portfolio/widget/PortfolioBubbleView;", "getBubble", "()Lcom/ss/android/ugc/aweme/commerce/portfolio/widget/PortfolioBubbleView;", "setBubble", "(Lcom/ss/android/ugc/aweme/commerce/portfolio/widget/PortfolioBubbleView;)V", "cancelCallback", "Ljava/lang/Runnable;", "classifyColumnAdapter", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioClassifyColumnAdapter;", "colorS2", "", "darkMode", "", "diffHeight", "enterMethod", "", "getEnterMethod", "()Ljava/lang/String;", "enterMethod$delegate", "Lkotlin/Lazy;", "entranceLocation", "getEntranceLocation", "entranceLocation$delegate", "footerView", "Landroid/widget/FrameLayout;", "forTheFirstTime", "headerView", "mCategories", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/UserShopCategory;", "mCursor", "mGoods", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "mHasMore", "mHeadGood", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "mLoading", "mOrderType", "mSearchHint", "mShopColumns", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "mY", "recordTime", "", "referFrom", "getReferFrom", "referFrom$delegate", "selectColumn", "getSelectColumn", "()Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "setSelectColumn", "(Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;)V", "sortAdapter", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioSortAdapter;", "sortView", "Landroid/view/View;", "sourcePage", "staggeredGridLayoutManager", "Landroid/support/v7/widget/StaggeredGridLayoutManager;", "triggerAwemeId", "getTriggerAwemeId", "triggerAwemeId$delegate", "userInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "getUserInfo", "()Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "userInfo$delegate", "assignGoodsCount", "", "count", "bindHeadBlock", "recommends", "bindViews", "cancelBubbleTask", "clickShoppingGuide", "constructFootView", "constructHeadView", "dismissBubbleIn5Seconds", "fetchShoppingAssistant", "findViews", "finish", "getSelectedColumn", "handleExceptionHappened", "handleSuccessLoad", "hasMore", "handleYChange", "dy", "initBubble", "anchorView", "initHeadAndFooterView", "loadData", "loadGoods", "loadGoodsBySort", "column", "loadUserCategoryInfo", "mutePlayVideoIfAvailable", "firstVideoArea", "Landroid/widget/RelativeLayout;", "awemeId", "good", "onClick", "v", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "event", "Lcom/ss/android/ugc/aweme/im/service/model/ShareCompleteEvent;", "onMore", "onPause", "onResume", "onSuccessLoad", "response", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "openShoppingAssistant", "performPurchase", "refreshSortRecyclerView", "shopColumns", "refreshUI", "lastSize", "renderUserInfo", "resetAndReload", "setHeadBlockActivityTag", "setHeadBlockCouponAndReduction", "setStatusBarColor", "showLoading", "showShoppingAssistantBubble", "commerceProfileHintStruct", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceProfileHintStruct;", "toggleDarkMode", "lightMode", "traceTimeEnd", "traceTimeStart", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioActivity extends AmeActivity implements View.OnClickListener, PortfolioAdapter.a, SmartRecyclerAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2884a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2885b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PortfolioActivity.class), "entranceLocation", "getEntranceLocation()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PortfolioActivity.class), "userInfo", "getUserInfo()Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PortfolioActivity.class), "enterMethod", "getEnterMethod()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PortfolioActivity.class), "referFrom", "getReferFrom()Ljava/lang/String;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PortfolioActivity.class), "triggerAwemeId", "getTriggerAwemeId()Ljava/lang/String;"))};
    public static final a z = new a((byte) 0);
    private StaggeredGridLayoutManager A;
    private PortfolioAdapter B;
    private boolean C = true;
    private final Lazy D = LazyKt.lazy(new n(this));
    private ImmersionBar E;
    private final Lazy F = LazyKt.lazy(new ad(this));
    private final Lazy G = LazyKt.lazy(new m(this));
    private final Lazy H = LazyKt.lazy(new w(this));
    private final Lazy I = LazyKt.lazy(new ac(this));
    private int J;
    private long K = SystemClock.elapsedRealtime();
    private HashMap L;

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f2886c;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout f2887d;

    /* renamed from: e  reason: collision with root package name */
    final List<com.ss.android.ugc.aweme.commerce.service.models.w> f2888e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<al> f2889f = new ArrayList();
    final List<com.ss.android.ugc.aweme.commerce.service.models.w> g = new ArrayList();
    boolean h;
    public PortfolioSortAdapter i;
    public PortfolioClassifyColumnAdapter j;
    View k;
    @NotNull
    public com.ss.android.ugc.aweme.commerce.service.models.t l = new com.ss.android.ugc.aweme.commerce.service.models.t(PushConstants.PUSH_TYPE_NOTIFY, true);
    public List<com.ss.android.ugc.aweme.commerce.service.models.t> m;
    public String n = "";
    public final String o = "store_page";
    public String p = "general_sort";
    final ArgbEvaluator q = new ArgbEvaluator();
    public com.ss.android.ugc.aweme.commerce.floatvideo.a r;
    int s;
    boolean t;
    boolean u = true;
    int v;
    int w;
    @Nullable
    public com.ss.android.ugc.aweme.commerce.portfolio.a.a x;
    Runnable y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioActivity$Companion;", "", "()V", "BATCH_SIZE", "", "BUBBLE_DELLAY_MILLIS", "", "VALUE_0_POINT_5", "", "VALUE_122", "VALUE_136", "VALUE_14", "VALUE_17", "VALUE_176", "VALUE_1_POINT_5", "VALUE_2", "VALUE_34", "VALUE_35", "VALUE_49", "VALUE_50", "VALUE_68", "VALUE_8", "VALUE_80", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/commerce/portfolio/PortfolioActivity$setHeadBlockCouponAndReduction$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class aa implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36976b;

        public final void onGlobalLayout() {
            if (PatchProxy.isSupport(new Object[0], this, f36975a, false, 28409, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36975a, false, 28409, new Class[0], Void.TYPE);
                return;
            }
            DmtTextView dmtTextView = (DmtTextView) PortfolioActivity.a(this.f36976b).findViewById(C0906R.id.an8);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.head_reduction_tag");
            int width = dmtTextView.getWidth();
            ((DmtTextView) PortfolioActivity.a(this.f36976b).findViewById(C0906R.id.an8)).measure(0, 0);
            DmtTextView dmtTextView2 = (DmtTextView) PortfolioActivity.a(this.f36976b).findViewById(C0906R.id.an8);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "headerView.head_reduction_tag");
            if (width < dmtTextView2.getMeasuredWidth()) {
                LinearLayout linearLayout = (LinearLayout) PortfolioActivity.a(this.f36976b).findViewById(C0906R.id.amx);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.head_coupon_ll");
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = (LinearLayout) PortfolioActivity.a(this.f36976b).findViewById(C0906R.id.amy);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.head_coupon_reduction_ll");
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        aa(PortfolioActivity portfolioActivity) {
            this.f36976b = portfolioActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ab extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(PortfolioActivity portfolioActivity) {
            super(0);
            this.this$0 = portfolioActivity;
        }

        public final void invoke() {
            float f2;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28410, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28410, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.service.l.a aVar = com.ss.android.ugc.aweme.commerce.service.l.a.f37978b;
            View view = this.this$0.x;
            com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar2 = this.this$0.x;
            if (aVar2 != null) {
                f2 = aVar2.getTrianglePivotX();
            } else {
                f2 = 0.0f;
            }
            Function0 r4 = new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ ab this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    float f2;
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28411, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28411, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.commerce.service.l.a aVar = com.ss.android.ugc.aweme.commerce.service.l.a.f37978b;
                    View view = this.this$0.this$0.x;
                    com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar2 = this.this$0.this$0.x;
                    if (aVar2 != null) {
                        f2 = aVar2.getTrianglePivotX();
                    } else {
                        f2 = 0.0f;
                    }
                    if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(0.0f), -1}, aVar, com.ss.android.ugc.aweme.commerce.service.l.a.f37977a, false, 29950, new Class[]{View.class, Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr = {view, Float.valueOf(f2), Float.valueOf(0.0f), -1};
                        Object[] objArr2 = objArr;
                        com.ss.android.ugc.aweme.commerce.service.l.a aVar3 = aVar;
                        PatchProxy.accessDispatch(objArr2, aVar3, com.ss.android.ugc.aweme.commerce.service.l.a.f37977a, false, 29950, new Class[]{View.class, Float.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (view != null) {
                        view.clearAnimation();
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, f2, 1, 0.0f);
                        scaleAnimation.setRepeatMode(2);
                        scaleAnimation.setRepeatCount(-1);
                        scaleAnimation.setDuration(600);
                        scaleAnimation.setFillAfter(true);
                        view.startAnimation(scaleAnimation);
                    }
                }
            };
            if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(0.0f), r4}, aVar, com.ss.android.ugc.aweme.commerce.service.l.a.f37977a, false, 29951, new Class[]{View.class, Float.TYPE, Float.TYPE, Function0.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.commerce.service.l.a aVar3 = aVar;
                PatchProxy.accessDispatch(new Object[]{view, Float.valueOf(f2), Float.valueOf(0.0f), r4}, aVar3, com.ss.android.ugc.aweme.commerce.service.l.a.f37977a, false, 29951, new Class[]{View.class, Float.TYPE, Float.TYPE, Function0.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(r4, "callback");
                if (view != null) {
                    view.clearAnimation();
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, f2, 1, 0.0f);
                    scaleAnimation.setDuration(400);
                    scaleAnimation.setFillAfter(true);
                    view.startAnimation(scaleAnimation);
                    scaleAnimation.setAnimationListener(new a.c(r4));
                }
            }
            PortfolioActivity portfolioActivity = this.this$0;
            if (PatchProxy.isSupport(new Object[0], portfolioActivity, PortfolioActivity.f2884a, false, 28349, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], portfolioActivity, PortfolioActivity.f2884a, false, 28349, new Class[0], Void.TYPE);
                return;
            }
            portfolioActivity.y = new l(portfolioActivity);
            com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar4 = portfolioActivity.x;
            if (aVar4 != null) {
                aVar4.postDelayed(portfolioActivity.y, 5000);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ac extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(PortfolioActivity portfolioActivity) {
            super(0);
            this.this$0 = portfolioActivity;
        }

        @NotNull
        public final String invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28412, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28412, new Class[0], String.class);
            }
            String stringExtra = this.this$0.getIntent().getStringExtra("key_trigger_aweme_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            return stringExtra;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class ad extends Lambda implements Function0<CommerceUser> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(PortfolioActivity portfolioActivity) {
            super(0);
            this.this$0 = portfolioActivity;
        }

        @NotNull
        public final CommerceUser invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28413, new Class[0], CommerceUser.class)) {
                return (CommerceUser) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28413, new Class[0], CommerceUser.class);
            }
            CommerceUser commerceUser = (CommerceUser) this.this$0.getIntent().getSerializableExtra("key_user_info");
            if (commerceUser == null) {
                commerceUser = new CommerceUser();
            }
            return commerceUser;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36977a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36978b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.w f36979c;

        b(PortfolioActivity portfolioActivity, com.ss.android.ugc.aweme.commerce.service.models.w wVar) {
            this.f36978b = portfolioActivity;
            this.f36979c = wVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36977a, false, 28375, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36977a, false, 28375, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Activity activity = this.f36978b;
            com.ss.android.ugc.aweme.commerce.service.models.w wVar = this.f36979c;
            String uid = this.f36978b.d().getUid();
            if (PatchProxy.isSupport(new Object[]{activity, wVar, uid}, null, com.ss.android.ugc.aweme.commerce.a.f36660a, true, 27868, new Class[]{Activity.class, com.ss.android.ugc.aweme.commerce.service.models.w.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, wVar, uid}, null, com.ss.android.ugc.aweme.commerce.a.f36660a, true, 27868, new Class[]{Activity.class, com.ss.android.ugc.aweme.commerce.service.models.w.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity, "fromAct");
            if (wVar != null) {
                new am().a(Long.valueOf(wVar.getCommodityType())).c(wVar.getLastAwemeId()).b(uid).a(wVar.getPromotionId()).d("store_page").a(wVar.getElasticType()).b();
                if (!TextUtils.isEmpty(wVar.getLastAwemeId())) {
                    com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
                    a2.a(activity, "aweme://aweme/detail/" + wVar.getLastAwemeId());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.w f36986c;

        c(PortfolioActivity portfolioActivity, com.ss.android.ugc.aweme.commerce.service.models.w wVar) {
            this.f36985b = portfolioActivity;
            this.f36986c = wVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36984a, false, 28376, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36984a, false, 28376, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f36985b.a(this.f36986c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "good", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimpleDetailPromotion;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function2<com.ss.android.ugc.aweme.commerce.service.models.w, String, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PortfolioActivity portfolioActivity) {
            super(2);
            this.this$0 = portfolioActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((com.ss.android.ugc.aweme.commerce.service.models.w) obj, (String) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.w wVar, @NotNull String str) {
            com.ss.android.ugc.aweme.commerce.service.models.w wVar2 = wVar;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{wVar2, str2}, this, changeQuickRedirect, false, 28377, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.w.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{wVar2, str2}, this, changeQuickRedirect, false, 28377, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.w.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(wVar2, "good");
            Intrinsics.checkParameterIsNotNull(str2, "<anonymous parameter 1>");
            this.this$0.a(wVar2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/commerce/service/models/UserShopCategory;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function1<al, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PortfolioActivity portfolioActivity) {
            super(1);
            this.this$0 = portfolioActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((al) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull al alVar) {
            al alVar2 = alVar;
            if (PatchProxy.isSupport(new Object[]{alVar2}, this, changeQuickRedirect, false, 28378, new Class[]{al.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{alVar2}, this, changeQuickRedirect, false, 28378, new Class[]{al.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(alVar2, AdvanceSetting.NETWORK_TYPE);
            List<com.ss.android.ugc.aweme.commerce.service.models.t> list = this.this$0.m;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            if (alVar.getId() != null && !TextUtils.isEmpty(alVar.getName())) {
                com.ss.android.ugc.aweme.commerce.service.logs.r rVar = new com.ss.android.ugc.aweme.commerce.service.logs.r();
                rVar.f38152f = alVar.getName();
                rVar.b();
                ClassifyResultActivity.a aVar = ClassifyResultActivity.f36967b;
                Activity activity = this.this$0;
                Long id = alVar.getId();
                if (id == null) {
                    Intrinsics.throwNpe();
                }
                long longValue = id.longValue();
                String name = alVar.getName();
                if (name == null) {
                    Intrinsics.throwNpe();
                }
                CommerceUser d2 = this.this$0.d();
                if (PatchProxy.isSupport(new Object[]{activity, new Long(longValue), name, d2, list}, aVar, ClassifyResultActivity.a.f36972a, false, 28320, new Class[]{Activity.class, Long.TYPE, String.class, CommerceUser.class, List.class}, Void.TYPE)) {
                    ClassifyResultActivity.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{activity, new Long(longValue), name, d2, list}, aVar2, ClassifyResultActivity.a.f36972a, false, 28320, new Class[]{Activity.class, Long.TYPE, String.class, CommerceUser.class, List.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
                Intrinsics.checkParameterIsNotNull(name, "categoryName");
                Intrinsics.checkParameterIsNotNull(d2, AllStoryActivity.f73306b);
                Intrinsics.checkParameterIsNotNull(list, "shopColumns");
                Intent intent = new Intent(activity, ClassifyResultActivity.class);
                intent.putExtra("category_id", longValue);
                intent.putExtra(AllStoryActivity.f73306b, d2);
                intent.putExtra("shopColumns", (Serializable) list);
                intent.putExtra("category_name", name);
                activity.startActivity(intent);
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function1<View, Boolean> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((View) obj));
        }

        public final boolean invoke(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 28379, new Class[]{View.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 28379, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            return view2 instanceof FrameLayout;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36988b;

        g(PortfolioActivity portfolioActivity) {
            this.f36988b = portfolioActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f36987a, false, 28381, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36987a, false, 28381, new Class[0], Void.TYPE);
                return;
            }
            RemoteImageView remoteImageView = (RemoteImageView) this.f36988b.a((int) C0906R.id.lr);
            Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "blur_glass_area");
            ViewGroup.LayoutParams layoutParams = remoteImageView.getLayoutParams();
            LinearLayout linearLayout = (LinearLayout) PortfolioActivity.a(this.f36988b).findViewById(C0906R.id.dpq);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.user_info_area");
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 != null) {
                int i = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                LinearLayout linearLayout2 = (LinearLayout) PortfolioActivity.a(this.f36988b).findViewById(C0906R.id.dpq);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.user_info_area");
                layoutParams.height = (i + linearLayout2.getHeight()) - ((int) UIUtils.dip2Px(this.f36988b, 2.0f));
                ((RemoteImageView) this.f36988b.a((int) C0906R.id.lr)).requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36990b;

        h(PortfolioActivity portfolioActivity) {
            this.f36990b = portfolioActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36989a, false, 28382, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36989a, false, 28382, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f36990b.d().isMe()) {
                com.ss.android.ugc.aweme.commerce.a aVar = com.ss.android.ugc.aweme.commerce.a.f36661b;
                Context context = this.f36990b;
                if (PatchProxy.isSupport(new Object[]{context}, aVar, com.ss.android.ugc.aweme.commerce.a.f36660a, false, 27869, new Class[]{Context.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.commerce.a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{context}, aVar2, com.ss.android.ugc.aweme.commerce.a.f36660a, false, 27869, new Class[]{Context.class}, Void.TYPE);
                } else {
                    Intrinsics.checkParameterIsNotNull(context, "ctx");
                    Intent intent = new Intent(context, MainActivity.class);
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                    context.startActivity(intent);
                }
            } else {
                com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
                a2.a("aweme://user/profile/" + this.f36990b.d().getUid());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36992b;

        i(PortfolioActivity portfolioActivity) {
            this.f36992b = portfolioActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36991a, false, 28383, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36991a, false, 28383, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            DrawerLayout drawerLayout = (DrawerLayout) this.f36992b.a((int) C0906R.id.a80);
            if (drawerLayout != null) {
                drawerLayout.openDrawer((View) (LinearLayout) this.f36992b.a((int) C0906R.id.bfz));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36993a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36994b;

        j(PortfolioActivity portfolioActivity) {
            this.f36994b = portfolioActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36993a, false, 28384, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36993a, false, 28384, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ((DrawerLayout) this.f36994b.a((int) C0906R.id.a80)).closeDrawer((View) (LinearLayout) this.f36994b.a((int) C0906R.id.bfz));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onResultOK"}, k = 3, mv = {1, 1, 15})
    static final class k implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36996b;

        k(PortfolioActivity portfolioActivity) {
            this.f36996b = portfolioActivity;
        }

        public final void a(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f36995a, false, 28389, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f36995a, false, 28389, new Class[]{Bundle.class}, Void.TYPE);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f36995a, false, 28388, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36995a, false, 28388, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.a.a(this.f36996b, this.f36996b.o);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f36998b;

        l(PortfolioActivity portfolioActivity) {
            this.f36998b = portfolioActivity;
        }

        public final void run() {
            float f2;
            if (PatchProxy.isSupport(new Object[0], this, f36997a, false, 28390, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36997a, false, 28390, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commerce.service.l.a aVar = com.ss.android.ugc.aweme.commerce.service.l.a.f37978b;
            View view = this.f36998b.x;
            com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar2 = this.f36998b.x;
            if (aVar2 != null) {
                f2 = aVar2.getTrianglePivotX();
            } else {
                f2 = 0.0f;
            }
            Function0 r4 = new Function0<Unit>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ l this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28391, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28391, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar = this.this$0.f36998b.x;
                    if (aVar != null) {
                        aVar.clearAnimation();
                    }
                    com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar2 = this.this$0.f36998b.x;
                    if (aVar2 != null) {
                        aVar2.setVisibility(8);
                    }
                }
            };
            if (PatchProxy.isSupport(new Object[]{view, Float.valueOf(f2), Float.valueOf(0.0f), r4}, aVar, com.ss.android.ugc.aweme.commerce.service.l.a.f37977a, false, 29952, new Class[]{View.class, Float.TYPE, Float.TYPE, Function0.class}, Void.TYPE)) {
                Object[] objArr = {view, Float.valueOf(f2), Float.valueOf(0.0f), r4};
                Object[] objArr2 = objArr;
                com.ss.android.ugc.aweme.commerce.service.l.a aVar3 = aVar;
                PatchProxy.accessDispatch(objArr2, aVar3, com.ss.android.ugc.aweme.commerce.service.l.a.f37977a, false, 29952, new Class[]{View.class, Float.TYPE, Float.TYPE, Function0.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(r4, "callback");
            if (view != null) {
                view.clearAnimation();
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, f2, 1, 0.0f);
                scaleAnimation.setDuration(400);
                scaleAnimation.setFillAfter(true);
                view.startAnimation(scaleAnimation);
                scaleAnimation.setAnimationListener(new a.d(r4));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(PortfolioActivity portfolioActivity) {
            super(0);
            this.this$0 = portfolioActivity;
        }

        @NotNull
        public final String invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28392, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28392, new Class[0], String.class);
            }
            String stringExtra = this.this$0.getIntent().getStringExtra("key_enter_method");
            if (stringExtra == null) {
                stringExtra = "click_comment";
            }
            return stringExtra;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class n extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(PortfolioActivity portfolioActivity) {
            super(0);
            this.this$0 = portfolioActivity;
        }

        @NotNull
        public final String invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28393, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28393, new Class[0], String.class);
            }
            String stringExtra = this.this$0.getIntent().getStringExtra("key_entrance_location");
            if (stringExtra == null) {
                stringExtra = "others_homepage";
            }
            return stringExtra;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commerce/portfolio/PortfolioActivity$fetchShoppingAssistant$1", "Lcom/ss/android/ugc/aweme/commerce/service/callbacks/CheckShoppingAssistantCallBack;", "updateShoppingAssistantNotify", "", "struct", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceProfileHintStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class o implements com.ss.android.ugc.aweme.commerce.service.a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36999a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f37000b;

        o(PortfolioActivity portfolioActivity) {
            this.f37000b = portfolioActivity;
        }

        public final void a(@Nullable com.ss.android.ugc.aweme.commerce.service.models.g gVar) {
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f36999a, false, 28394, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f36999a, false, 28394, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.g.class}, Void.TYPE);
                return;
            }
            PortfolioActivity portfolioActivity = this.f37000b;
            if (PatchProxy.isSupport(new Object[]{gVar}, portfolioActivity, PortfolioActivity.f2884a, false, 28348, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.g.class}, Void.TYPE)) {
                PortfolioActivity portfolioActivity2 = portfolioActivity;
                PatchProxy.accessDispatch(new Object[]{gVar}, portfolioActivity2, PortfolioActivity.f2884a, false, 28348, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.g.class}, Void.TYPE);
            } else if (!portfolioActivity.d().isMe() && gVar != null && !TextUtils.isEmpty(gVar.getUrl())) {
                Context context = portfolioActivity;
                com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(context);
                long j = 0;
                if (a2 != null) {
                    j = a2.c(0);
                }
                if (j != gVar.getId() && !TextUtils.isEmpty(gVar.getText())) {
                    com.ss.android.ugc.aweme.commerce.service.h.a a3 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(context);
                    if (a3 != null) {
                        a3.d(gVar.getId());
                    }
                    DmtTextView dmtTextView = (DmtTextView) portfolioActivity.a((int) C0906R.id.xn);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerce_title_right");
                    View view = dmtTextView;
                    if (PatchProxy.isSupport(new Object[]{view}, portfolioActivity, PortfolioActivity.f2884a, false, 28347, new Class[]{View.class}, Void.TYPE)) {
                        PortfolioActivity portfolioActivity3 = portfolioActivity;
                        PatchProxy.accessDispatch(new Object[]{view}, portfolioActivity3, PortfolioActivity.f2884a, false, 28347, new Class[]{View.class}, Void.TYPE);
                    } else {
                        portfolioActivity.x = new com.ss.android.ugc.aweme.commerce.portfolio.a.a(context, view);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.topMargin = -((int) UIUtils.dip2Px(context, 8.0f));
                        layoutParams.addRule(11);
                        layoutParams.addRule(3, C0906R.id.ft);
                        com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar = portfolioActivity.x;
                        if (aVar != null) {
                            aVar.setLayoutParams(layoutParams);
                        }
                        ((RelativeLayout) portfolioActivity.a((int) C0906R.id.chv)).addView(portfolioActivity.x);
                    }
                    com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar2 = portfolioActivity.x;
                    if (aVar2 != null) {
                        aVar2.setOnClickListener(portfolioActivity);
                    }
                    com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar3 = portfolioActivity.x;
                    if (aVar3 != null) {
                        String text = gVar.getText();
                        Function0 abVar = new ab(portfolioActivity);
                        if (PatchProxy.isSupport(new Object[]{text, abVar}, aVar3, com.ss.android.ugc.aweme.commerce.portfolio.a.a.f37041a, false, 28507, new Class[]{String.class, Function0.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar4 = aVar3;
                            PatchProxy.accessDispatch(new Object[]{text, abVar}, aVar4, com.ss.android.ugc.aweme.commerce.portfolio.a.a.f37041a, false, 28507, new Class[]{String.class, Function0.class}, Void.TYPE);
                        } else {
                            Intrinsics.checkParameterIsNotNull(text, "text");
                            Intrinsics.checkParameterIsNotNull(abVar, "callBack");
                            aVar3.f37043c.setText(text);
                            aVar3.post(new a.C0467a(aVar3, abVar));
                        }
                    }
                }
                DmtTextView dmtTextView2 = (DmtTextView) portfolioActivity.a((int) C0906R.id.xn);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "commerce_title_right");
                dmtTextView2.setTag(gVar.getUrl());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "success", "", "shopPromotionListResponse", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class p extends Lambda implements Function2<Boolean, com.ss.android.ugc.aweme.commerce.service.models.u, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(PortfolioActivity portfolioActivity) {
            super(2);
            this.this$0 = portfolioActivity;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Boolean) obj).booleanValue(), (com.ss.android.ugc.aweme.commerce.service.models.u) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, @Nullable com.ss.android.ugc.aweme.commerce.service.models.u uVar) {
            com.ss.android.ugc.aweme.commerce.service.models.u uVar2 = uVar;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), uVar2}, this, changeQuickRedirect, false, 28395, new Class[]{Boolean.TYPE, com.ss.android.ugc.aweme.commerce.service.models.u.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), uVar2}, this, changeQuickRedirect, false, 28395, new Class[]{Boolean.TYPE, com.ss.android.ugc.aweme.commerce.service.models.u.class}, Void.TYPE);
            } else if (z) {
                PortfolioActivity portfolioActivity = this.this$0;
                if (uVar2 == null) {
                    Intrinsics.throwNpe();
                }
                portfolioActivity.a(uVar2);
            } else {
                PortfolioActivity portfolioActivity2 = this.this$0;
                if (PatchProxy.isSupport(new Object[0], portfolioActivity2, PortfolioActivity.f2884a, false, 28342, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], portfolioActivity2, PortfolioActivity.f2884a, false, 28342, new Class[0], Void.TYPE);
                    return;
                }
                portfolioActivity2.t = false;
                if (!portfolioActivity2.f2888e.isEmpty() || !portfolioActivity2.g.isEmpty()) {
                    RelativeLayout relativeLayout = (RelativeLayout) portfolioActivity2.a((int) C0906R.id.a34);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "default_load_area");
                    relativeLayout.setVisibility(4);
                    FrameLayout frameLayout = portfolioActivity2.f2887d;
                    if (frameLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerView");
                    }
                    LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.bjb);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "footerView.loading_more_area");
                    linearLayout.setVisibility(0);
                    FrameLayout frameLayout2 = portfolioActivity2.f2887d;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerView");
                    }
                    ProgressBar progressBar = (ProgressBar) frameLayout2.findViewById(C0906R.id.bjd);
                    Intrinsics.checkExpressionValueIsNotNull(progressBar, "footerView.loading_more_progress");
                    progressBar.setVisibility(4);
                    FrameLayout frameLayout3 = portfolioActivity2.f2887d;
                    if (frameLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerView");
                    }
                    DmtTextView dmtTextView = (DmtTextView) frameLayout3.findViewById(C0906R.id.bjc);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "footerView.loading_more_content");
                    dmtTextView.setVisibility(0);
                    FrameLayout frameLayout4 = portfolioActivity2.f2887d;
                    if (frameLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("footerView");
                    }
                    DmtTextView dmtTextView2 = (DmtTextView) frameLayout4.findViewById(C0906R.id.bjc);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "footerView.loading_more_content");
                    dmtTextView2.setText(portfolioActivity2.getString(C0906R.string.b77));
                    portfolioActivity2.u = false;
                    return;
                }
                FrameLayout frameLayout5 = portfolioActivity2.f2887d;
                if (frameLayout5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                }
                LinearLayout linearLayout2 = (LinearLayout) frameLayout5.findViewById(C0906R.id.bjb);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "footerView.loading_more_area");
                linearLayout2.setVisibility(4);
                RelativeLayout relativeLayout2 = (RelativeLayout) portfolioActivity2.a((int) C0906R.id.a34);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "default_load_area");
                relativeLayout2.setVisibility(0);
                ProgressBar progressBar2 = (ProgressBar) portfolioActivity2.a((int) C0906R.id.a35);
                Intrinsics.checkExpressionValueIsNotNull(progressBar2, "default_load_progress");
                progressBar2.setVisibility(4);
                DmtTextView dmtTextView3 = (DmtTextView) portfolioActivity2.a((int) C0906R.id.a36);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "default_load_text");
                dmtTextView3.setVisibility(0);
                DmtTextView dmtTextView4 = (DmtTextView) portfolioActivity2.a((int) C0906R.id.a36);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "default_load_text");
                dmtTextView4.setText(portfolioActivity2.getString(C0906R.string.ake));
                portfolioActivity2.u = true;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/portfolio/UserShopCategoryResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class q<TTaskResult, TContinuationResult> implements a.g<c, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f37002b;

        q(PortfolioActivity portfolioActivity) {
            this.f37002b = portfolioActivity;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f37001a, false, 28396, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37001a, false, 28396, new Class[]{a.i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (iVar.d() || iVar.e() == null || ((c) iVar.e()).statusCode != 0) {
                RecyclerView recyclerView = (RecyclerView) this.f37002b.a((int) C0906R.id.cie);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rv_classify_list");
                recyclerView.setVisibility(8);
                DmtTextView dmtTextView = (DmtTextView) this.f37002b.a((int) C0906R.id.dtm);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "view_classify_column_empty");
                dmtTextView.setVisibility(0);
            } else {
                List<al> list = ((c) iVar.e()).f37059a;
                if (list == null) {
                    list = new ArrayList<>();
                }
                if (list.isEmpty()) {
                    RecyclerView recyclerView2 = (RecyclerView) this.f37002b.a((int) C0906R.id.cie);
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rv_classify_list");
                    recyclerView2.setVisibility(8);
                    DmtTextView dmtTextView2 = (DmtTextView) this.f37002b.a((int) C0906R.id.dtm);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "view_classify_column_empty");
                    dmtTextView2.setVisibility(0);
                } else {
                    RecyclerView recyclerView3 = (RecyclerView) this.f37002b.a((int) C0906R.id.cie);
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rv_classify_list");
                    recyclerView3.setVisibility(0);
                    DmtTextView dmtTextView3 = (DmtTextView) this.f37002b.a((int) C0906R.id.dtm);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "view_classify_column_empty");
                    dmtTextView3.setVisibility(8);
                    this.f37002b.f2889f.clear();
                    this.f37002b.f2889f.addAll(list);
                    PortfolioClassifyColumnAdapter portfolioClassifyColumnAdapter = this.f37002b.j;
                    if (portfolioClassifyColumnAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("classifyColumnAdapter");
                    }
                    portfolioClassifyColumnAdapter.notifyDataSetChanged();
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"playVideo", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class r extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $awemeId;
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.w $good;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(PortfolioActivity portfolioActivity, com.ss.android.ugc.aweme.commerce.service.models.w wVar, String str) {
            super(0);
            this.this$0 = portfolioActivity;
            this.$good = wVar;
            this.$awemeId = str;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28397, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28397, new Class[0], Void.TYPE);
                return;
            }
            new am().a(Long.valueOf(this.$good.getCommodityType())).c(this.$good.getLastAwemeId()).b(this.this$0.d().getUid()).a(this.$good.getPromotionId()).d("store_page").a(this.$good.getElasticType()).b();
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            a2.a(com.ss.android.ugc.aweme.ag.j.a("aweme://aweme/detail/" + this.$awemeId).a("page_type", "store_page").a("promotion_id", this.$good.getPromotionId()).a("refer", "store_page").a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    static final class s<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37004b;

        s(String str) {
            this.f37004b = str;
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f37003a, false, 28398, new Class[0], Aweme.class)) {
                return DetailApi.a(this.f37004b, "store_page");
            }
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f37003a, false, 28398, new Class[0], Aweme.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class t<TTaskResult, TContinuationResult> implements a.g<Aweme, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f37006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f37007c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RelativeLayout f37008d;

        t(PortfolioActivity portfolioActivity, r rVar, RelativeLayout relativeLayout) {
            this.f37006b = portfolioActivity;
            this.f37007c = rVar;
            this.f37008d = relativeLayout;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00de  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37005a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r3 = 0
                r4 = 28399(0x6eef, float:3.9795E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f37005a
                r3 = 0
                r4 = 28399(0x6eef, float:3.9795E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<java.lang.Void> r6 = java.lang.Void.class
                r1 = r18
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Void r0 = (java.lang.Void) r0
                return r0
            L_0x0039:
                java.lang.String r0 = "task"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                boolean r0 = r19.d()
                r1 = 0
                if (r0 != 0) goto L_0x0145
                java.lang.Object r0 = r19.e()
                if (r0 == 0) goto L_0x0145
                java.lang.Object r0 = r19.e()
                r12 = r0
                com.ss.android.ugc.aweme.feed.model.Aweme r12 = (com.ss.android.ugc.aweme.feed.model.Aweme) r12
                java.lang.String r0 = "aweme"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r12, r0)
                int r0 = r12.getAwemeType()
                r2 = 2
                if (r0 != r2) goto L_0x00e2
                java.util.List r0 = r12.getImageInfos()
                if (r0 == 0) goto L_0x00e2
                java.util.List r0 = r12.getImageInfos()
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x00e2
                java.util.List r0 = r12.getImageInfos()
                if (r0 == 0) goto L_0x0081
                java.lang.Object r0 = r0.get(r10)
                com.ss.android.ugc.aweme.feed.model.ImageInfo r0 = (com.ss.android.ugc.aweme.feed.model.ImageInfo) r0
                if (r0 == 0) goto L_0x0081
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getLabelThumb()
                goto L_0x0082
            L_0x0081:
                r0 = r1
            L_0x0082:
                if (r0 == 0) goto L_0x00e2
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity.a((com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity) r0)
                android.view.View r0 = (android.view.View) r0
                r2 = 2131166873(0x7f070699, float:1.7948004E38)
                android.view.View r0 = r0.findViewById(r2)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
                java.util.List r3 = r12.getImageInfos()
                if (r3 == 0) goto L_0x00a8
                java.lang.Object r3 = r3.get(r10)
                com.ss.android.ugc.aweme.feed.model.ImageInfo r3 = (com.ss.android.ugc.aweme.feed.model.ImageInfo) r3
                if (r3 == 0) goto L_0x00a8
                com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getLabelThumb()
                goto L_0x00a9
            L_0x00a8:
                r3 = r1
            L_0x00a9:
                com.ss.android.ugc.aweme.base.c.b(r0, r3)
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                android.widget.FrameLayout r0 = com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity.a((com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity) r0)
                android.view.View r0 = (android.view.View) r0
                android.view.View r0 = r0.findViewById(r2)
                com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity$t$1 r2 = new com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity$t$1
                r2.<init>(r7)
                android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
                r0.setOnClickListener(r2)
                android.widget.RelativeLayout r0 = r7.f37008d
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r2 = r7.f37006b
                com.ss.android.ugc.aweme.commerce.floatvideo.a r2 = r2.r
                android.view.View r2 = (android.view.View) r2
                r0.removeView(r2)
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                com.ss.android.ugc.aweme.commerce.floatvideo.a r0 = r0.r
                if (r0 == 0) goto L_0x00d8
                r0.c()
            L_0x00d8:
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                com.ss.android.ugc.aweme.commerce.floatvideo.a r0 = r0.r
                if (r0 == 0) goto L_0x0145
                r0.a()
                goto L_0x0145
            L_0x00e2:
                android.widget.RelativeLayout r0 = r7.f37008d
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r2 = r7.f37006b
                com.ss.android.ugc.aweme.commerce.floatvideo.a r2 = r2.r
                android.view.View r2 = (android.view.View) r2
                r0.removeView(r2)
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                com.ss.android.ugc.aweme.commerce.floatvideo.a r2 = new com.ss.android.ugc.aweme.commerce.floatvideo.a
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r3 = r7.f37006b
                android.content.Context r3 = (android.content.Context) r3
                r4 = 6
                r2.<init>(r3, r1, r10, r4)
                r0.r = r2
                android.widget.RelativeLayout r0 = r7.f37008d
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r2 = r7.f37006b
                com.ss.android.ugc.aweme.commerce.floatvideo.a r2 = r2.r
                android.view.View r2 = (android.view.View) r2
                android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
                android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
                r5 = -1
                r4.<init>(r5, r5)
                r3.<init>(r4)
                r0.addView(r2, r3)
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                com.ss.android.ugc.aweme.commerce.floatvideo.a r11 = r0.r
                if (r11 == 0) goto L_0x0135
                r13 = 3
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                android.content.Context r0 = (android.content.Context) r0
                r2 = 1117782016(0x42a00000, float:80.0)
                float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r2)
                int r14 = (int) r0
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                android.content.Context r0 = (android.content.Context) r0
                r2 = 1123287040(0x42f40000, float:122.0)
                float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r2)
                int r15 = (int) r0
                r16 = 0
                r17 = 0
                r11.a(r12, r13, r14, r15, r16, r17)
            L_0x0135:
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity r0 = r7.f37006b
                com.ss.android.ugc.aweme.commerce.floatvideo.a r0 = r0.r
                if (r0 == 0) goto L_0x0145
                com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity$t$2 r2 = new com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity$t$2
                r2.<init>(r7)
                android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
                r0.setOnClickListener(r2)
            L_0x0145:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity.t.then(a.i):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onResultOK"}, k = 3, mv = {1, 1, 15})
    static final class u implements com.ss.android.ugc.aweme.base.component.f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f37014b;

        u(PortfolioActivity portfolioActivity) {
            this.f37014b = portfolioActivity;
        }

        public final void a(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f37013a, false, 28403, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f37013a, false, 28403, new Class[]{Bundle.class}, Void.TYPE);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f37013a, false, 28402, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37013a, false, 28402, new Class[0], Void.TYPE);
                return;
            }
            this.f37014b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class v extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.w $good;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(PortfolioActivity portfolioActivity, com.ss.android.ugc.aweme.commerce.service.models.w wVar) {
            super(0);
            this.this$0 = portfolioActivity;
            this.$good = wVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28404, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28404, new Class[0], Void.TYPE);
                return;
            }
            h.a aVar = com.ss.android.ugc.aweme.commerce.preview.h.f37502d;
            n.a aVar2 = com.ss.android.ugc.aweme.commerce.service.models.n.r;
            Context context = this.this$0;
            CommerceUser d2 = this.this$0.d();
            String promotionId = this.$good.getPromotionId();
            if (promotionId == null) {
                promotionId = "";
            }
            String str = promotionId;
            String productId = this.$good.getProductId();
            if (productId == null) {
                productId = "";
            }
            aVar.a(n.a.a(aVar2, context, d2, str, productId, this.$good.getDetailUrl(), this.this$0.o, "click_store_product", null, null, "full_screen_card", null, null, SystemClock.uptimeMillis(), this.$good.getPromotionSource(), this.this$0.p, null, null, null, 232448));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class w extends Lambda implements Function0<String> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(PortfolioActivity portfolioActivity) {
            super(0);
            this.this$0 = portfolioActivity;
        }

        @NotNull
        public final String invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28405, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28405, new Class[0], String.class);
            }
            String stringExtra = this.this$0.getIntent().getStringExtra("key_refer_from");
            if (stringExtra == null) {
                stringExtra = "INVALID_ENTER_FROM";
            }
            return stringExtra;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "column", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class x extends Lambda implements Function1<com.ss.android.ugc.aweme.commerce.service.models.t, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(PortfolioActivity portfolioActivity) {
            super(1);
            this.this$0 = portfolioActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.ss.android.ugc.aweme.commerce.service.models.t) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.ss.android.ugc.aweme.commerce.service.models.t tVar) {
            if (PatchProxy.isSupport(new Object[]{tVar}, this, changeQuickRedirect, false, 28406, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.t.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{tVar}, this, changeQuickRedirect, false, 28406, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.t.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(tVar, "column");
            if (!tVar.getSelected()) {
                PortfolioSortAdapter portfolioSortAdapter = this.this$0.i;
                if (portfolioSortAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sortAdapter");
                }
                for (com.ss.android.ugc.aweme.commerce.service.models.t selected : portfolioSortAdapter.f37037b) {
                    selected.setSelected(false);
                }
                tVar.setSelected(true);
                if (Intrinsics.areEqual((Object) tVar.getId(), (Object) "3")) {
                    tVar.setSort(1);
                }
                this.this$0.a(tVar);
            } else if (tVar.getCanReverse()) {
                if (tVar.getSort() == 0) {
                    tVar.setSort(1);
                } else {
                    tVar.setSort(0);
                }
                this.this$0.a(tVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class y extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ List $shopColumns;
        final /* synthetic */ PortfolioActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(PortfolioActivity portfolioActivity, List list) {
            super(0);
            this.this$0 = portfolioActivity;
            this.$shopColumns = list;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28407, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28407, new Class[0], Void.TYPE);
                return;
            }
            PortfolioSearchActivity.a aVar = PortfolioSearchActivity.f37088b;
            Activity activity = this.this$0;
            CommerceUser d2 = this.this$0.d();
            List list = this.$shopColumns;
            String str = this.this$0.n;
            if (PatchProxy.isSupport(new Object[]{activity, d2, list, str}, aVar, PortfolioSearchActivity.a.f37093a, false, 28483, new Class[]{Activity.class, CommerceUser.class, List.class, String.class}, Void.TYPE)) {
                Object[] objArr = {activity, d2, list, str};
                PortfolioSearchActivity.a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr, aVar2, PortfolioSearchActivity.a.f37093a, false, 28483, new Class[]{Activity.class, CommerceUser.class, List.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(d2, AllStoryActivity.f73306b);
            if (list == null) {
                list = new ArrayList();
            }
            Intent intent = new Intent(activity, PortfolioSearchActivity.class);
            intent.putExtra(AllStoryActivity.f73306b, d2);
            if (list != null) {
                intent.putExtra("shopColumns", (Serializable) list);
                if (str == null) {
                    str = "";
                }
                intent.putExtra("search_hint", str);
                activity.startActivity(intent);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.io.Serializable");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/commerce/portfolio/PortfolioActivity$setHeadBlockCouponAndReduction$1$1", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagAdapter;", "", "getView", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "position", "", "o", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class z extends com.ss.android.ugc.aweme.widget.flowlayout.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioActivity f37016b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commerce.service.models.w f37017c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(List list, PortfolioActivity portfolioActivity, com.ss.android.ugc.aweme.commerce.service.models.w wVar) {
            super(list);
            this.f37016b = portfolioActivity;
            this.f37017c = wVar;
        }

        public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
            FlowLayout flowLayout2 = flowLayout;
            String str = (String) obj;
            if (PatchProxy.isSupport(new Object[]{flowLayout2, Integer.valueOf(i), str}, this, f37015a, false, 28408, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{flowLayout2, Integer.valueOf(i), str}, this, f37015a, false, 28408, new Class[]{FlowLayout.class, Integer.TYPE, String.class}, View.class);
            }
            Intrinsics.checkParameterIsNotNull(flowLayout, "parent");
            Intrinsics.checkParameterIsNotNull(str, "o");
            View inflate = LayoutInflater.from(this.f37016b).inflate(C0906R.layout.a2r, (TagFlowLayout) PortfolioActivity.a(this.f37016b).findViewById(C0906R.id.aht), false);
            if (inflate != null) {
                TextView textView = (TextView) inflate;
                textView.setText(str);
                textView.setIncludeFontPadding(false);
                return textView;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
    }

    private final String e() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28326, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28326, new Class[0], String.class);
        } else {
            value = this.D.getValue();
        }
        return (String) value;
    }

    private final String f() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28328, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28328, new Class[0], String.class);
        } else {
            value = this.G.getValue();
        }
        return (String) value;
    }

    private final String g() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28330, new Class[0], String.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28330, new Class[0], String.class);
        } else {
            value = this.I.getValue();
        }
        return (String) value;
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2884a, false, 28371, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2884a, false, 28371, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.L == null) {
            this.L = new HashMap();
        }
        View view = (View) this.L.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.L.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final CommerceUser d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28327, new Class[0], CommerceUser.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28327, new Class[0], CommerceUser.class);
        } else {
            value = this.F.getValue();
        }
        return (CommerceUser) value;
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2884a, false, 28373, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2884a, false, 28373, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    @NotNull
    public final com.ss.android.ugc.aweme.commerce.service.models.t c() {
        return this.l;
    }

    public final void a(com.ss.android.ugc.aweme.commerce.service.models.w wVar) {
        if (PatchProxy.isSupport(new Object[]{wVar}, this, f2884a, false, 28335, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, f2884a, false, 28335, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.w.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.g.a((Context) this, this.o, f(), wVar.getPromotionSource(), (Function0<Unit>) new v<Unit>(this, wVar));
    }

    public final void a(com.ss.android.ugc.aweme.commerce.service.models.u uVar) {
        Collection collection;
        if (PatchProxy.isSupport(new Object[]{uVar}, this, f2884a, false, 28345, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.u.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uVar}, this, f2884a, false, 28345, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.u.class}, Void.TYPE);
            return;
        }
        this.t = false;
        List<com.ss.android.ugc.aweme.commerce.service.models.w> list = uVar.f38229a;
        if (list == null) {
            list = new ArrayList<>();
        }
        List<com.ss.android.ugc.aweme.commerce.service.models.w> list2 = list;
        this.n = uVar.f38233e;
        this.J += 20;
        if (Intrinsics.areEqual((Object) this.l.getId(), (Object) PushConstants.PUSH_TYPE_NOTIFY)) {
            int i2 = uVar.f38231c;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2884a, false, 28351, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2884a, false, 28351, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                FrameLayout frameLayout = this.f2886c;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                DmtTextView dmtTextView = (DmtTextView) frameLayout.findViewById(C0906R.id.ei);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.all_goods_count");
                dmtTextView.setText(getString(C0906R.string.e_, new Object[]{Integer.valueOf(i2)}));
            }
        }
        List<com.ss.android.ugc.aweme.commerce.service.models.t> list3 = uVar.f38230b;
        if (PatchProxy.isSupport(new Object[]{list3}, this, f2884a, false, 28353, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3}, this, f2884a, false, 28353, new Class[]{List.class}, Void.TYPE);
        } else {
            this.m = list3;
            if (this.C) {
                com.ss.android.ugc.aweme.commerce.service.models.t tVar = this.l;
                tVar.setName(getString(C0906R.string.air));
                List mutableListOf = CollectionsKt.mutableListOf(tVar);
                if (list3 != null) {
                    mutableListOf.addAll(list3);
                }
                this.i = new PortfolioSortAdapter(mutableListOf, new x(this), new y(this, list3));
                ViewGroup.LayoutParams layoutParams = ((RelativeLayout) a((int) C0906R.id.a34)).getLayoutParams();
                if (layoutParams != null) {
                    Context context = this;
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = StatusBarUtils.getStatusBarHeight(context) + ((int) UIUtils.dip2Px(context, 176.0f));
                    FrameLayout frameLayout2 = this.f2886c;
                    if (frameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    RecyclerView recyclerView = (RecyclerView) frameLayout2.findViewById(C0906R.id.cit);
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "headerView.rv_sort_column");
                    recyclerView.setVisibility(0);
                    FrameLayout frameLayout3 = this.f2886c;
                    if (frameLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    RecyclerView recyclerView2 = (RecyclerView) frameLayout3.findViewById(C0906R.id.cit);
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "headerView.rv_sort_column");
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
                    linearLayoutManager.setOrientation(0);
                    recyclerView2.setLayoutManager(linearLayoutManager);
                    FrameLayout frameLayout4 = this.f2886c;
                    if (frameLayout4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    RecyclerView recyclerView3 = (RecyclerView) frameLayout4.findViewById(C0906R.id.cit);
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "headerView.rv_sort_column");
                    PortfolioSortAdapter portfolioSortAdapter = this.i;
                    if (portfolioSortAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sortAdapter");
                    }
                    recyclerView3.setAdapter(portfolioSortAdapter);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        if (!list2.isEmpty()) {
            if (this.f2888e.size() == 0 && list2.size() == 1) {
                a(list2);
            } else if (Intrinsics.areEqual((Object) this.l.getId(), (Object) PushConstants.PUSH_TYPE_NOTIFY)) {
                Iterable iterable = list2;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (((com.ss.android.ugc.aweme.commerce.service.models.w) next).getElasticType() == 3) {
                        arrayList.add(next);
                    }
                }
                a((List) arrayList);
                int size = this.f2888e.size();
                Collection arrayList2 = new ArrayList();
                for (Object next2 : iterable) {
                    if (((com.ss.android.ugc.aweme.commerce.service.models.w) next2).getElasticType() != 3) {
                        arrayList2.add(next2);
                    }
                }
                List list4 = (List) arrayList2;
                this.f2888e.addAll(list4);
                a(size, list4.size());
            } else {
                a(CollectionsKt.emptyList());
                int size2 = this.f2888e.size();
                this.f2888e.addAll(collection);
                a(size2, list2.size());
            }
        }
        boolean z2 = uVar.f38232d;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f2884a, false, 28343, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f2884a, false, 28343, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else {
            this.u = z2;
            if (this.u) {
                RelativeLayout relativeLayout = (RelativeLayout) a((int) C0906R.id.a34);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "default_load_area");
                relativeLayout.setVisibility(4);
                FrameLayout frameLayout5 = this.f2887d;
                if (frameLayout5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                }
                LinearLayout linearLayout = (LinearLayout) frameLayout5.findViewById(C0906R.id.bjb);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout, "footerView.loading_more_area");
                linearLayout.setVisibility(4);
            } else if (!this.f2888e.isEmpty() || !this.g.isEmpty()) {
                RelativeLayout relativeLayout2 = (RelativeLayout) a((int) C0906R.id.a34);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "default_load_area");
                relativeLayout2.setVisibility(4);
                FrameLayout frameLayout6 = this.f2887d;
                if (frameLayout6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                }
                LinearLayout linearLayout2 = (LinearLayout) frameLayout6.findViewById(C0906R.id.bjb);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "footerView.loading_more_area");
                linearLayout2.setVisibility(0);
                FrameLayout frameLayout7 = this.f2887d;
                if (frameLayout7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                }
                ProgressBar progressBar = (ProgressBar) frameLayout7.findViewById(C0906R.id.bjd);
                Intrinsics.checkExpressionValueIsNotNull(progressBar, "footerView.loading_more_progress");
                progressBar.setVisibility(4);
                FrameLayout frameLayout8 = this.f2887d;
                if (frameLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                }
                DmtTextView dmtTextView2 = (DmtTextView) frameLayout8.findViewById(C0906R.id.bjc);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "footerView.loading_more_content");
                dmtTextView2.setVisibility(0);
                FrameLayout frameLayout9 = this.f2887d;
                if (frameLayout9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                }
                DmtTextView dmtTextView3 = (DmtTextView) frameLayout9.findViewById(C0906R.id.bjc);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "footerView.loading_more_content");
                dmtTextView3.setText(getString(C0906R.string.b77));
            } else {
                FrameLayout frameLayout10 = this.f2887d;
                if (frameLayout10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                }
                LinearLayout linearLayout3 = (LinearLayout) frameLayout10.findViewById(C0906R.id.bjb);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "footerView.loading_more_area");
                linearLayout3.setVisibility(4);
                RelativeLayout relativeLayout3 = (RelativeLayout) a((int) C0906R.id.a34);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "default_load_area");
                relativeLayout3.setVisibility(0);
                ProgressBar progressBar2 = (ProgressBar) a((int) C0906R.id.a35);
                Intrinsics.checkExpressionValueIsNotNull(progressBar2, "default_load_progress");
                progressBar2.setVisibility(4);
                DmtTextView dmtTextView4 = (DmtTextView) a((int) C0906R.id.a36);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "default_load_text");
                dmtTextView4.setVisibility(0);
                DmtTextView dmtTextView5 = (DmtTextView) a((int) C0906R.id.a36);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView5, "default_load_text");
                dmtTextView5.setText(getString(C0906R.string.bq7));
            }
        }
        if (this.C) {
            this.C = false;
            if (!d().isMe()) {
                if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28346, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28346, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.commerce.setting.c.a("shop", new o(this));
                }
            }
            if (getIntent().getLongExtra("key_click_time", 0) != 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - getIntent().getLongExtra("key_click_time", 0));
                com.ss.android.ugc.aweme.app.n.a("aweme_shop_promotion_display_time", jSONObject, (JSONObject) null);
            }
        }
    }

    private final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28339, new Class[0], Void.TYPE);
            return;
        }
        k();
        j();
    }

    private final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28350, new Class[0], Void.TYPE);
            return;
        }
        if (this.y != null) {
            com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar = this.x;
            if (aVar != null) {
                aVar.removeCallbacks(this.y);
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28363, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28363, new Class[0], Void.TYPE);
            return;
        }
        if (this.u && !this.t) {
            i();
        }
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28369, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (isTaskRoot()) {
            com.ss.android.ugc.aweme.ag.h.a().a((Activity) this, "aweme://main");
        }
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28334, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        this.E = ImmersionBar.with((Activity) this);
        ImmersionBar immersionBar = this.E;
        if (immersionBar != null) {
            ImmersionBar statusBarDarkFont = immersionBar.statusBarDarkFont(false);
            if (statusBarDarkFont != null) {
                statusBarDarkFont.init();
            }
        }
    }

    private final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28338, new Class[0], Void.TYPE);
            return;
        }
        ((RecyclerView) a((int) C0906R.id.ccf)).scrollToPosition(0);
        this.v = 0;
        this.J = 0;
        this.u = true;
        this.f2888e.clear();
        this.g.clear();
        PortfolioAdapter portfolioAdapter = this.B;
        if (portfolioAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        portfolioAdapter.a();
        PortfolioAdapter portfolioAdapter2 = this.B;
        if (portfolioAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        portfolioAdapter2.notifyDataSetChanged();
        i();
        com.ss.android.ugc.aweme.commerce.service.l.j.f38034e = false;
    }

    private final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28340, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.portfolio.api.a.a(20, this.J, d().getUid(), this.l.getId(), Integer.valueOf(this.l.getSort()), null, null, new p(this));
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28364, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28364, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        bg.d(this);
        com.ss.android.ugc.aweme.commerce.floatvideo.a aVar = this.r;
        if (aVar != null) {
            aVar.a();
        }
        ImmersionBar immersionBar = this.E;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        if (isTaskRoot()) {
            com.ss.android.ugc.aweme.ag.h.a().a((Activity) this, "aweme://main");
        }
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28366, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28367, new Class[0], Void.TYPE);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ax axVar = new ax();
            axVar.f38100f = d().getUid();
            axVar.g = Long.valueOf(elapsedRealtime - this.K);
            axVar.b();
        }
        com.ss.android.ugc.aweme.commerce.floatvideo.a aVar = this.r;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28365, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28365, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity", "onResume", true);
        super.onResume();
        if (com.ss.android.ugc.aweme.commerce.service.l.j.f38034e) {
            h();
        }
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28368, new Class[0], Void.TYPE);
        } else {
            this.K = SystemClock.elapsedRealtime();
        }
        com.ss.android.ugc.aweme.commerce.floatvideo.a aVar = this.r;
        if (aVar != null) {
            aVar.b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity", "onResume", false);
    }

    private final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28344, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28344, new Class[0], Void.TYPE);
            return;
        }
        this.t = true;
        if (!this.f2888e.isEmpty() || !this.g.isEmpty()) {
            RelativeLayout relativeLayout = (RelativeLayout) a((int) C0906R.id.a34);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "default_load_area");
            relativeLayout.setVisibility(4);
            FrameLayout frameLayout = this.f2887d;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.bjb);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "footerView.loading_more_area");
            linearLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.f2887d;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            ProgressBar progressBar = (ProgressBar) frameLayout2.findViewById(C0906R.id.bjd);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "footerView.loading_more_progress");
            progressBar.setVisibility(0);
            FrameLayout frameLayout3 = this.f2887d;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            DmtTextView dmtTextView = (DmtTextView) frameLayout3.findViewById(C0906R.id.bjc);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "footerView.loading_more_content");
            dmtTextView.setVisibility(0);
            FrameLayout frameLayout4 = this.f2887d;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            DmtTextView dmtTextView2 = (DmtTextView) frameLayout4.findViewById(C0906R.id.bjc);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "footerView.loading_more_content");
            dmtTextView2.setText(getString(C0906R.string.akg));
            return;
        }
        FrameLayout frameLayout5 = this.f2887d;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("footerView");
        }
        LinearLayout linearLayout2 = (LinearLayout) frameLayout5.findViewById(C0906R.id.bjb);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "footerView.loading_more_area");
        linearLayout2.setVisibility(4);
        RelativeLayout relativeLayout2 = (RelativeLayout) a((int) C0906R.id.a34);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "default_load_area");
        relativeLayout2.setVisibility(0);
        ProgressBar progressBar2 = (ProgressBar) a((int) C0906R.id.a35);
        Intrinsics.checkExpressionValueIsNotNull(progressBar2, "default_load_progress");
        progressBar2.setVisibility(0);
        DmtTextView dmtTextView3 = (DmtTextView) a((int) C0906R.id.a36);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "default_load_text");
        dmtTextView3.setVisibility(0);
        DmtTextView dmtTextView4 = (DmtTextView) a((int) C0906R.id.a36);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "default_load_text");
        dmtTextView4.setText(getString(C0906R.string.akg));
    }

    public final void a() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28323, new Class[0], Void.TYPE);
            return;
        }
        Context context = this;
        if (NetworkUtils.isNetworkAvailable(context)) {
            l();
            com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar = this.x;
            if (aVar != null) {
                aVar.clearAnimation();
            }
            com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar2 = this.x;
            if (aVar2 != null) {
                aVar2.setVisibility(8);
            }
            DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.xn);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerce_title_right");
            Object tag = dmtTextView.getTag();
            if (tag != null) {
                z2 = tag instanceof String;
            } else {
                z2 = true;
            }
            if (z2) {
                com.ss.android.ugc.aweme.commerce.a.a((String) tag, (Map<String, String>) new HashMap<String,String>(), context);
            }
        } else {
            UIUtils.displayToast(context, (int) C0906R.string.bgf);
        }
    }

    public static final /* synthetic */ FrameLayout a(PortfolioActivity portfolioActivity) {
        FrameLayout frameLayout = portfolioActivity.f2886c;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        return frameLayout;
    }

    @Subscribe
    public final void onEvent(@NotNull com.ss.android.ugc.aweme.im.service.model.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f2884a, false, 28370, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f2884a, false, 28370, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(gVar, "event");
        if (TextUtils.equals("good_window", gVar.itemType)) {
            dv.a(this, (RecyclerView) a((int) C0906R.id.ccf), gVar);
        }
    }

    private final void b(com.ss.android.ugc.aweme.commerce.service.models.w wVar) {
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{wVar}, this, f2884a, false, 28360, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, f2884a, false, 28360, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.w.class}, Void.TYPE);
            return;
        }
        int i2 = 8;
        if (wVar.hasCoupon()) {
            FrameLayout frameLayout = this.f2886c;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(C0906R.id.amx);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.head_coupon_ll");
            linearLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.f2886c;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            TagFlowLayout tagFlowLayout = (TagFlowLayout) frameLayout2.findViewById(C0906R.id.aht);
            Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout, "headerView.for_you_tags");
            tagFlowLayout.setVisibility(8);
            e.a aVar = com.ss.android.ugc.aweme.commerce.service.l.e.f38011b;
            FrameLayout frameLayout3 = this.f2886c;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView = (DmtTextView) frameLayout3.findViewById(C0906R.id.amz);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.head_coupon_tag");
            aVar.a((TextView) dmtTextView, (com.ss.android.ugc.aweme.commerce.service.models.c) wVar);
            z2 = true;
        } else {
            FrameLayout frameLayout4 = this.f2886c;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout2 = (LinearLayout) frameLayout4.findViewById(C0906R.id.amx);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.head_coupon_ll");
            linearLayout2.setVisibility(8);
            List labels = wVar.getLabels();
            if (labels != null) {
                if (!labels.isEmpty()) {
                    FrameLayout frameLayout5 = this.f2886c;
                    if (frameLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    TagFlowLayout tagFlowLayout2 = (TagFlowLayout) frameLayout5.findViewById(C0906R.id.aht);
                    Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout2, "headerView.for_you_tags");
                    tagFlowLayout2.setVisibility(0);
                    FrameLayout frameLayout6 = this.f2886c;
                    if (frameLayout6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    TagFlowLayout tagFlowLayout3 = (TagFlowLayout) frameLayout6.findViewById(C0906R.id.aht);
                    Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout3, "headerView.for_you_tags");
                    tagFlowLayout3.setAdapter(new z(wVar.getLabels(), this, wVar));
                } else {
                    FrameLayout frameLayout7 = this.f2886c;
                    if (frameLayout7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    TagFlowLayout tagFlowLayout4 = (TagFlowLayout) frameLayout7.findViewById(C0906R.id.aht);
                    Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout4, "headerView.for_you_tags");
                    tagFlowLayout4.setVisibility(8);
                }
            }
            z2 = false;
        }
        CharSequence firstFullReduction = wVar.getFirstFullReduction();
        if (!TextUtils.isEmpty(firstFullReduction)) {
            FrameLayout frameLayout8 = this.f2886c;
            if (frameLayout8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView2 = (DmtTextView) frameLayout8.findViewById(C0906R.id.an8);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "headerView.head_reduction_tag");
            dmtTextView2.setVisibility(0);
            FrameLayout frameLayout9 = this.f2886c;
            if (frameLayout9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView3 = (DmtTextView) frameLayout9.findViewById(C0906R.id.an8);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "headerView.head_reduction_tag");
            dmtTextView3.setText(firstFullReduction);
        } else {
            FrameLayout frameLayout10 = this.f2886c;
            if (frameLayout10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView4 = (DmtTextView) frameLayout10.findViewById(C0906R.id.an8);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "headerView.head_reduction_tag");
            dmtTextView4.setVisibility(8);
            z3 = false;
        }
        FrameLayout frameLayout11 = this.f2886c;
        if (frameLayout11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        LinearLayout linearLayout3 = (LinearLayout) frameLayout11.findViewById(C0906R.id.amy);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "headerView.head_coupon_reduction_ll");
        if (z2 || z3) {
            i2 = 0;
        }
        linearLayout3.setVisibility(i2);
        if (z2 && z3) {
            FrameLayout frameLayout12 = this.f2886c;
            if (frameLayout12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            LinearLayout linearLayout4 = (LinearLayout) frameLayout12.findViewById(C0906R.id.amy);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "headerView.head_coupon_reduction_ll");
            linearLayout4.getViewTreeObserver().addOnGlobalLayoutListener(new aa(this));
        }
    }

    private final void c(com.ss.android.ugc.aweme.commerce.service.models.w wVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{wVar}, this, f2884a, false, 28361, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, f2884a, false, 28361, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.w.class}, Void.TYPE);
            return;
        }
        if (wVar.isGoodInPreSale()) {
            str = getString(C0906R.string.bq_);
        } else if (wVar.isGoodInAppointment()) {
            str = getString(C0906R.string.ft);
        } else if (wVar.isGoodInSecKill()) {
            str = getString(C0906R.string.c2t);
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence)) {
            FrameLayout frameLayout = this.f2886c;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView = (DmtTextView) frameLayout.findViewById(C0906R.id.az);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.activity_tag");
            dmtTextView.setVisibility(0);
            FrameLayout frameLayout2 = this.f2886c;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView2 = (DmtTextView) frameLayout2.findViewById(C0906R.id.az);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "headerView.activity_tag");
            dmtTextView2.setText(charSequence);
            SpannableString spannableString = new SpannableString(wVar.longTitle());
            FrameLayout frameLayout3 = this.f2886c;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView3 = (DmtTextView) frameLayout3.findViewById(C0906R.id.ahu);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "headerView.for_you_title");
            a.a(spannableString, new LeadingMarginSpan.Standard(com.ss.android.ugc.aweme.framework.e.b.a(dmtTextView3.getContext(), 34.0f), 0), 0, spannableString.length(), 18);
            FrameLayout frameLayout4 = this.f2886c;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView4 = (DmtTextView) frameLayout4.findViewById(C0906R.id.ahu);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "headerView.for_you_title");
            dmtTextView4.setText(spannableString);
            return;
        }
        FrameLayout frameLayout5 = this.f2886c;
        if (frameLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        DmtTextView dmtTextView5 = (DmtTextView) frameLayout5.findViewById(C0906R.id.az);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView5, "headerView.activity_tag");
        dmtTextView5.setVisibility(8);
        FrameLayout frameLayout6 = this.f2886c;
        if (frameLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerView");
        }
        DmtTextView dmtTextView6 = (DmtTextView) frameLayout6.findViewById(C0906R.id.ahu);
        Intrinsics.checkExpressionValueIsNotNull(dmtTextView6, "headerView.for_you_title");
        dmtTextView6.setText(wVar.longTitle());
    }

    public final void onClick(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f2884a, false, 28322, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f2884a, false, 28322, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        Intrinsics.checkParameterIsNotNull(view2, NotifyType.VIBRATE);
        if (view.getId() == C0906R.id.ix) {
            finish();
            return;
        }
        if (view.getId() != C0906R.id.xn) {
            int id = view.getId();
            com.ss.android.ugc.aweme.commerce.portfolio.a.a aVar = this.x;
            if (aVar == null || id != aVar.getId()) {
                if (Intrinsics.areEqual((Object) (DmtTextView) a((int) C0906R.id.a36), (Object) view2)) {
                    DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.a36);
                    Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "default_load_text");
                    if (dmtTextView.getVisibility() == 0) {
                        DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.a36);
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "default_load_text");
                        if (TextUtils.equals(dmtTextView2.getText(), getString(C0906R.string.ake))) {
                            i();
                            return;
                        }
                    }
                }
                if (view.getId() == C0906R.id.cr1) {
                    if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28324, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28324, new Class[0], Void.TYPE);
                    } else {
                        RemoteImageView remoteImageView = (RemoteImageView) a((int) C0906R.id.cr1);
                        Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "shopping_guide");
                        if (remoteImageView.getAlpha() != 0.0f) {
                            com.ss.android.ugc.aweme.commerce.service.logs.q qVar = new com.ss.android.ugc.aweme.commerce.service.logs.q();
                            qVar.f38150f = d().getUid();
                            qVar.b();
                            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                            if (a2.isLogin()) {
                                com.ss.android.ugc.aweme.commerce.a.a(this, this.o);
                            } else {
                                com.ss.android.ugc.aweme.login.e.a((Activity) this, this.o, f(), (com.ss.android.ugc.aweme.base.component.f) new k(this));
                            }
                        }
                        return;
                    }
                } else if (view.getId() == C0906R.id.cp4 || view.getId() == C0906R.id.cp4) {
                    Activity activity = this;
                    CommerceUser d2 = d();
                    String e2 = e();
                    String str = this.o;
                    String f2 = f();
                    if (PatchProxy.isSupport(new Object[]{activity, d2, e2, str, f2}, null, com.ss.android.ugc.aweme.commerce.preview.b.f37347a, true, 28529, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class}, Void.TYPE)) {
                        Object[] objArr = {activity, d2, e2, str, f2};
                        Object[] objArr2 = objArr;
                        PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.commerce.preview.b.f37347a, true, 28529, new Class[]{Activity.class, CommerceUser.class, String.class, String.class, String.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(activity, "context");
                    if (d2 == null) {
                        com.bytedance.ies.dmt.ui.d.a.a((Context) activity, (int) C0906R.string.zg).a();
                        return;
                    }
                    ao aoVar = new ao();
                    aoVar.f38082f = d2.getUid();
                    aoVar.b();
                    ck ckVar = new ck();
                    ckVar.h = false;
                    ckVar.o = true;
                    ckVar.j = false;
                    ckVar.k = false;
                    ckVar.l = true;
                    ckVar.f64974c = false;
                    ckVar.s = false;
                    ckVar.t = false;
                    ckVar.i = true;
                    SimpleShareDialog simpleShareDialog = new SimpleShareDialog(activity, ckVar);
                    simpleShareDialog.setActionHandler(new b.a(d2, activity));
                    IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
                    shareStruct.appName = activity.getApplicationContext().getString(C0906R.string.ak);
                    shareStruct.url = "https://aweme.snssdk.com";
                    shareStruct.itemType = "good_window";
                    shareStruct.extraParams = new HashMap<>();
                    shareStruct.extraParams.put("user_id", d2.getUid());
                    if (!TextUtils.isEmpty(dr.a().a(d2.getUid()))) {
                        shareStruct.extraParams.put("sec_user_id", dr.a().a(d2.getUid()));
                    }
                    shareStruct.extraParams.put("name", d2.getNickname());
                    shareStruct.videoCover = d2.getAvatarMedium();
                    simpleShareDialog.updateShareStruct(shareStruct);
                    simpleShareDialog.show();
                }
                return;
            }
        }
        IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
        if (a3.isLogin()) {
            a();
        } else {
            com.ss.android.ugc.aweme.login.e.a((Activity) this, this.o, f(), (com.ss.android.ugc.aweme.base.component.f) new u(this));
        }
    }

    private final void a(List<com.ss.android.ugc.aweme.commerce.service.models.w> list) {
        int i2;
        Integer num;
        List<com.ss.android.ugc.aweme.commerce.service.models.w> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f2884a, false, 28359, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f2884a, false, 28359, new Class[]{List.class}, Void.TYPE);
        } else if (!(!this.f2888e.isEmpty())) {
            this.g.clear();
            this.g.addAll(list2);
            if (list.isEmpty()) {
                RoundedLinearLayout roundedLinearLayout = (RoundedLinearLayout) a((int) C0906R.id.ahq);
                Intrinsics.checkExpressionValueIsNotNull(roundedLinearLayout, "for_you_area");
                roundedLinearLayout.setVisibility(8);
                FrameLayout frameLayout = this.f2886c;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                DmtTextView dmtTextView = (DmtTextView) frameLayout.findViewById(C0906R.id.ahp);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "headerView.for_u_label");
                dmtTextView.setVisibility(8);
                return;
            }
            RoundedLinearLayout roundedLinearLayout2 = (RoundedLinearLayout) a((int) C0906R.id.ahq);
            Intrinsics.checkExpressionValueIsNotNull(roundedLinearLayout2, "for_you_area");
            roundedLinearLayout2.setVisibility(0);
            com.ss.android.ugc.aweme.commerce.service.models.w wVar = list2.get(0);
            FrameLayout frameLayout2 = this.f2886c;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView2 = (DmtTextView) frameLayout2.findViewById(C0906R.id.ahp);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "headerView.for_u_label");
            if (wVar.getElasticType() != 3 || !Intrinsics.areEqual((Object) this.l.getId(), (Object) PushConstants.PUSH_TYPE_NOTIFY)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            dmtTextView2.setVisibility(i2);
            if (!TextUtils.isEmpty(wVar.getLastAwemeId())) {
                SharePrefCache inst = SharePrefCache.inst();
                Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
                an<Boolean> enableFloatVideo = inst.getEnableFloatVideo();
                Intrinsics.checkExpressionValueIsNotNull(enableFloatVideo, "SharePrefCache.inst().enableFloatVideo");
                Object c2 = enableFloatVideo.c();
                Intrinsics.checkExpressionValueIsNotNull(c2, "SharePrefCache.inst().enableFloatVideo.cache");
                if (((Boolean) c2).booleanValue()) {
                    FrameLayout frameLayout3 = this.f2886c;
                    if (frameLayout3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) frameLayout3.findViewById(C0906R.id.aek);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "headerView.first_item_area");
                    a(relativeLayout, wVar.getLastAwemeId(), wVar);
                }
            }
            if (wVar.isThirdParty()) {
                FrameLayout frameLayout4 = this.f2886c;
                if (frameLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                ((PriceTextView) frameLayout4.findViewById(C0906R.id.c5y)).a(wVar.getPrice(), com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.color.ga), 14.0f, 17.0f, 14.0f);
            } else {
                com.ss.android.ugc.aweme.commerce.service.models.r toutiao = wVar.getToutiao();
                if (toutiao != null) {
                    num = Integer.valueOf(toutiao.getMinPrice());
                } else {
                    num = null;
                }
                if (num == null) {
                    FrameLayout frameLayout5 = this.f2886c;
                    if (frameLayout5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    PriceTextView priceTextView = (PriceTextView) frameLayout5.findViewById(C0906R.id.c5y);
                    Intrinsics.checkExpressionValueIsNotNull(priceTextView, "headerView.price_view");
                    priceTextView.setVisibility(4);
                } else {
                    FrameLayout frameLayout6 = this.f2886c;
                    if (frameLayout6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    ((PriceTextView) frameLayout6.findViewById(C0906R.id.c5y)).a(num.intValue(), com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.color.ga), 14.0f, 17.0f, 14.0f);
                }
            }
            FrameLayout frameLayout7 = this.f2886c;
            if (frameLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            ((RemoteImageView) frameLayout7.findViewById(C0906R.id.ahs)).setOnClickListener(new b(this, wVar));
            List preferredImages = wVar.preferredImages();
            if (preferredImages != null && (!preferredImages.isEmpty())) {
                FrameLayout frameLayout8 = this.f2886c;
                if (frameLayout8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                com.ss.android.ugc.aweme.base.c.b((RemoteImageView) frameLayout8.findViewById(C0906R.id.ahs), (UrlModel) preferredImages.get(0));
            }
            if (wVar.getVisitor() != null) {
                PromotionVisitor visitor = wVar.getVisitor();
                if (visitor != null) {
                    if (!(!visitor.getAvatars().isEmpty()) || visitor.getCount() <= 0) {
                        FrameLayout frameLayout9 = this.f2886c;
                        if (frameLayout9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        PhantomImagesView phantomImagesView = (PhantomImagesView) frameLayout9.findViewById(C0906R.id.ahr);
                        Intrinsics.checkExpressionValueIsNotNull(phantomImagesView, "headerView.for_you_icons");
                        phantomImagesView.setVisibility(8);
                        FrameLayout frameLayout10 = this.f2886c;
                        if (frameLayout10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        LinearLayout linearLayout = (LinearLayout) frameLayout10.findViewById(C0906R.id.cmh);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "headerView.see_count_area");
                        linearLayout.setVisibility(8);
                        FrameLayout frameLayout11 = this.f2886c;
                        if (frameLayout11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        DmtTextView dmtTextView3 = (DmtTextView) frameLayout11.findViewById(C0906R.id.cmi);
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "headerView.see_count_view");
                        dmtTextView3.setVisibility(8);
                    } else {
                        FrameLayout frameLayout12 = this.f2886c;
                        if (frameLayout12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        LinearLayout linearLayout2 = (LinearLayout) frameLayout12.findViewById(C0906R.id.cmh);
                        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "headerView.see_count_area");
                        linearLayout2.setVisibility(0);
                        FrameLayout frameLayout13 = this.f2886c;
                        if (frameLayout13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        DmtTextView dmtTextView4 = (DmtTextView) frameLayout13.findViewById(C0906R.id.cmi);
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "headerView.see_count_view");
                        dmtTextView4.setVisibility(0);
                        FrameLayout frameLayout14 = this.f2886c;
                        if (frameLayout14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        ((PhantomImagesView) frameLayout14.findViewById(C0906R.id.ahr)).a(visitor.getAvatars(), 1.5f);
                        FrameLayout frameLayout15 = this.f2886c;
                        if (frameLayout15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("headerView");
                        }
                        DmtTextView dmtTextView5 = (DmtTextView) frameLayout15.findViewById(C0906R.id.cmi);
                        Intrinsics.checkExpressionValueIsNotNull(dmtTextView5, "headerView.see_count_view");
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
                        String string = getString(C0906R.string.blr);
                        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.people_see)");
                        String format = String.format(locale, string, Arrays.copyOf(new Object[]{com.ss.android.ugc.aweme.commerce.service.l.m.f38042b.a(visitor.getCount())}, 1));
                        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
                        dmtTextView5.setText(format);
                    }
                }
            } else {
                FrameLayout frameLayout16 = this.f2886c;
                if (frameLayout16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                PhantomImagesView phantomImagesView2 = (PhantomImagesView) frameLayout16.findViewById(C0906R.id.ahr);
                Intrinsics.checkExpressionValueIsNotNull(phantomImagesView2, "headerView.for_you_icons");
                phantomImagesView2.setVisibility(8);
                FrameLayout frameLayout17 = this.f2886c;
                if (frameLayout17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                LinearLayout linearLayout3 = (LinearLayout) frameLayout17.findViewById(C0906R.id.cmh);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "headerView.see_count_area");
                linearLayout3.setVisibility(8);
                FrameLayout frameLayout18 = this.f2886c;
                if (frameLayout18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                DmtTextView dmtTextView6 = (DmtTextView) frameLayout18.findViewById(C0906R.id.cmi);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView6, "headerView.see_count_view");
                dmtTextView6.setVisibility(8);
            }
            FrameLayout frameLayout19 = this.f2886c;
            if (frameLayout19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            RemoteImageView remoteImageView = (RemoteImageView) frameLayout19.findViewById(C0906R.id.ahs);
            remoteImageView.getLayoutParams().width = com.ss.android.ugc.aweme.commerce.service.l.j.f38032c;
            remoteImageView.getLayoutParams().height = com.ss.android.ugc.aweme.commerce.service.l.j.f38032c;
            ((RoundedLinearLayout) a((int) C0906R.id.ahq)).getLayoutParams().height = com.ss.android.ugc.aweme.commerce.service.l.j.f38032c;
            c(wVar);
            b(wVar);
            FrameLayout frameLayout20 = this.f2886c;
            if (frameLayout20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            DmtTextView dmtTextView7 = (DmtTextView) frameLayout20.findViewById(C0906R.id.an9);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView7, "headerView.head_sale");
            dmtTextView7.setText(com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(this, C0906R.string.bci, com.ss.android.ugc.aweme.commerce.service.l.m.f38042b.a((long) wVar.getSales())));
            ((RoundedLinearLayout) a((int) C0906R.id.ahq)).setOnClickListener(new c(this, wVar));
            new com.ss.android.ugc.aweme.commerce.service.logs.al().f(d().getUid()).b(Boolean.valueOf(wVar.hasCoupon())).d(g()).c(wVar.getPromotionId()).a(Integer.valueOf((int) wVar.getCommodityType())).b("store_page").b(Integer.valueOf(wVar.getElasticType())).e(f()).a(this.o).i(this.p).b();
            if (!TextUtils.isEmpty(wVar.getLastAwemeId())) {
                au d2 = new au().d(d().getUid());
                String promotionId = wVar.getPromotionId();
                if (promotionId == null) {
                    promotionId = "";
                }
                d2.c(promotionId).a(Long.valueOf(wVar.getCommodityType())).a(this.o).a(wVar.getElasticType()).b(wVar.getLastAwemeId()).b();
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        View view;
        View view2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2884a, false, 28333, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2884a, false, 28333, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity", "onCreate", true);
        super.onCreate(bundle);
        bg.c(this);
        com.ss.android.ugc.aweme.commerce.service.l.j.f38034e = false;
        setContentView((int) C0906R.layout.d7);
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28337, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28337, new Class[0], Void.TYPE);
        } else {
            a.C0465a aVar = com.ss.android.ugc.aweme.commerce.e.a.f36891a;
            View a2 = a((int) C0906R.id.cv0);
            Intrinsics.checkExpressionValueIsNotNull(a2, "status_bar");
            aVar.a(a2);
            a.C0465a aVar2 = com.ss.android.ugc.aweme.commerce.e.a.f36891a;
            View a3 = a((int) C0906R.id.t2);
            Intrinsics.checkExpressionValueIsNotNull(a3, "classify_column_status_bar");
            aVar2.a(a3);
            View a4 = a((int) C0906R.id.k5);
            Intrinsics.checkExpressionValueIsNotNull(a4, "bg_alpha");
            Context context = this;
            a4.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(context) + ((int) UIUtils.dip2Px(context, 49.0f));
        }
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28355, new Class[0], Void.TYPE);
        } else {
            Context context2 = this;
            this.f2886c = new FrameLayout(context2);
            FrameLayout frameLayout = this.f2886c;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = this.f2886c;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28356, new Class[0], View.class)) {
                view = (View) PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28356, new Class[0], View.class);
            } else {
                LayoutInflater from = LayoutInflater.from(context2);
                FrameLayout frameLayout3 = this.f2886c;
                if (frameLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                view = from.inflate(C0906R.layout.a7i, frameLayout3, false);
                Intrinsics.checkExpressionValueIsNotNull(view, "LayoutInflater.from(this…block, headerView, false)");
            }
            frameLayout2.addView(view, new RecyclerView.LayoutParams(-1, -2));
            this.f2887d = new FrameLayout(context2);
            FrameLayout frameLayout4 = this.f2887d;
            if (frameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            frameLayout4.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            FrameLayout frameLayout5 = this.f2887d;
            if (frameLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28357, new Class[0], View.class)) {
                view2 = (View) PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28357, new Class[0], View.class);
            } else {
                LayoutInflater from2 = LayoutInflater.from(context2);
                FrameLayout frameLayout6 = this.f2887d;
                if (frameLayout6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("footerView");
                }
                view2 = from2.inflate(C0906R.layout.a5l, frameLayout6, false);
                Intrinsics.checkExpressionValueIsNotNull(view2, "LayoutInflater.from(this…folio, footerView, false)");
            }
            frameLayout5.addView(view2, new RecyclerView.LayoutParams(-1, -2));
        }
        if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28336, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28336, new Class[0], Void.TYPE);
        } else {
            Context context3 = this;
            this.s = com.ss.android.ugc.aweme.commerce.service.l.g.f38016b.a(context3, C0906R.color.a17);
            this.w = (int) UIUtils.dip2Px(context3, 80.0f);
            PortfolioAdapter portfolioAdapter = new PortfolioAdapter(this.f2888e, d().getUid(), f(), this.o, this, "store_page", new d(this));
            this.B = portfolioAdapter;
            this.A = new StaggeredGridLayoutManager(2, 1);
            PortfolioAdapter portfolioAdapter2 = this.B;
            if (portfolioAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            SmartRecyclerAdapter smartRecyclerAdapter = new SmartRecyclerAdapter(portfolioAdapter2);
            smartRecyclerAdapter.f38253d = this;
            FrameLayout frameLayout7 = this.f2887d;
            if (frameLayout7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("footerView");
            }
            smartRecyclerAdapter.b(frameLayout7);
            FrameLayout frameLayout8 = this.f2886c;
            if (frameLayout8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            smartRecyclerAdapter.a(frameLayout8);
            RecyclerView recyclerView = (RecyclerView) a((int) C0906R.id.ccf);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recycler_view_portfolio");
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.A;
            if (staggeredGridLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("staggeredGridLayoutManager");
            }
            recyclerView.setLayoutManager(staggeredGridLayoutManager);
            ((RecyclerView) a((int) C0906R.id.ccf)).addItemDecoration(new NoneSymmetryDecoration(context3, 8.0f, 2.0f, f.INSTANCE));
            RecyclerView recyclerView2 = (RecyclerView) a((int) C0906R.id.ccf);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recycler_view_portfolio");
            recyclerView2.setAdapter(smartRecyclerAdapter);
            ((RecyclerView) a((int) C0906R.id.ccf)).addOnScrollListener(new PortfolioActivity$bindViews$3(this));
            View.OnClickListener onClickListener = this;
            ((ImageView) a((int) C0906R.id.ix)).setOnClickListener(onClickListener);
            ((ImageView) a((int) C0906R.id.cp5)).setOnClickListener(onClickListener);
            ((ImageView) a((int) C0906R.id.cp4)).setOnClickListener(onClickListener);
            com.ss.android.ugc.aweme.commerce.service.l.o oVar = com.ss.android.ugc.aweme.commerce.service.l.o.f38047b;
            ImageView imageView = (ImageView) a((int) C0906R.id.ix);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "back_btn");
            oVar.a(imageView);
            com.ss.android.ugc.aweme.commerce.service.l.o oVar2 = com.ss.android.ugc.aweme.commerce.service.l.o.f38047b;
            DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.xn);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerce_title_right");
            oVar2.a(dmtTextView);
            if (d().isMe()) {
                DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.xn);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "commerce_title_right");
                dmtTextView2.setVisibility(8);
            } else {
                DmtTextView dmtTextView3 = (DmtTextView) a((int) C0906R.id.xn);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "commerce_title_right");
                dmtTextView3.setVisibility(0);
                ((DmtTextView) a((int) C0906R.id.xn)).setOnClickListener(onClickListener);
                ((DmtTextView) a((int) C0906R.id.xn)).setText(C0906R.string.zl);
                new av().a(this.o).b();
            }
            ((DmtTextView) a((int) C0906R.id.a36)).setOnClickListener(onClickListener);
            FrameLayout frameLayout9 = this.f2886c;
            if (frameLayout9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("headerView");
            }
            ViewGroup.LayoutParams layoutParams = ((LinearLayout) frameLayout9.findViewById(C0906R.id.dpq)).getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = StatusBarUtils.getStatusBarHeight(context3) + ((int) UIUtils.dip2Px(context3, 68.0f));
                FrameLayout frameLayout10 = this.f2886c;
                if (frameLayout10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                ((LinearLayout) frameLayout10.findViewById(C0906R.id.dpq)).post(new g(this));
                Object service = ServiceManager.get().getService(IUserService.class);
                Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…IUserService::class.java)");
                User currentUser = ((IUserService) service).getCurrentUser();
                IAccountUserService a5 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a5, "AccountUserProxyService.get()");
                if (!a5.isLogin() || (!d().isMe() && currentUser != null && !currentUser.isWithCommerceEntry())) {
                    RemoteImageView remoteImageView = (RemoteImageView) a((int) C0906R.id.cr1);
                    Intrinsics.checkExpressionValueIsNotNull(remoteImageView, "shopping_guide");
                    remoteImageView.setVisibility(0);
                    ((RemoteImageView) a((int) C0906R.id.cr1)).setOnClickListener(onClickListener);
                } else {
                    RemoteImageView remoteImageView2 = (RemoteImageView) a((int) C0906R.id.cr1);
                    Intrinsics.checkExpressionValueIsNotNull(remoteImageView2, "shopping_guide");
                    remoteImageView2.setVisibility(8);
                }
                if (PatchProxy.isSupport(new Object[0], this, f2884a, false, 28358, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2884a, false, 28358, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.base.c.b((RemoteImageView) a((int) C0906R.id.lr), d().getAvatarMedium());
                    FrameLayout frameLayout11 = this.f2886c;
                    if (frameLayout11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    com.ss.android.ugc.aweme.base.c.b((CircleImageView) frameLayout11.findViewById(C0906R.id.dq1), d().getAvatarMedium());
                    FrameLayout frameLayout12 = this.f2886c;
                    if (frameLayout12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("headerView");
                    }
                    ((SuffixTextView) frameLayout12.findViewById(C0906R.id.c4l)).setText(d().getNickname());
                }
                FrameLayout frameLayout13 = this.f2886c;
                if (frameLayout13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                ((CircleImageView) frameLayout13.findViewById(C0906R.id.dq1)).setOnClickListener(new h(this));
                FrameLayout frameLayout14 = this.f2886c;
                if (frameLayout14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("headerView");
                }
                this.k = (FrameLayout) frameLayout14.findViewById(C0906R.id.aga);
                View view3 = this.k;
                if (view3 != null) {
                    DmtTextView dmtTextView4 = (DmtTextView) view3.findViewById(C0906R.id.d_g);
                    if (dmtTextView4 != null) {
                        dmtTextView4.setOnClickListener(new i(this));
                    }
                }
                DmtTextView dmtTextView5 = (DmtTextView) a((int) C0906R.id.dtm);
                if (dmtTextView5 != null) {
                    dmtTextView5.setOnClickListener(new j(this));
                }
                ((DrawerLayout) a((int) C0906R.id.a80)).addDrawerListener(new PortfolioActivity$bindViews$9(this));
                RecyclerView recyclerView3 = (RecyclerView) a((int) C0906R.id.cie);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rv_classify_list");
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context3);
                linearLayoutManager.setOrientation(1);
                recyclerView3.setLayoutManager(linearLayoutManager);
                this.j = new PortfolioClassifyColumnAdapter(this.f2889f, new e(this));
                RecyclerView recyclerView4 = (RecyclerView) a((int) C0906R.id.cie);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "rv_classify_list");
                PortfolioClassifyColumnAdapter portfolioClassifyColumnAdapter = this.j;
                if (portfolioClassifyColumnAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("classifyColumnAdapter");
                }
                recyclerView4.setAdapter(portfolioClassifyColumnAdapter);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        new com.ss.android.ugc.aweme.commerce.service.logs.ac().a(e()).c("normal").b(d().getUid()).b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.PortfolioActivity", "onCreate", false);
    }

    public final void a(com.ss.android.ugc.aweme.commerce.service.models.t tVar) {
        if (PatchProxy.isSupport(new Object[]{tVar}, this, f2884a, false, 28354, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.t.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{tVar}, this, f2884a, false, 28354, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.t.class}, Void.TYPE);
            return;
        }
        this.p = com.ss.android.ugc.aweme.commerce.service.c.a.f37960a.a(tVar.getId());
        com.ss.android.ugc.aweme.commerce.service.logs.l lVar = new com.ss.android.ugc.aweme.commerce.service.logs.l();
        lVar.f38140f = this.p;
        lVar.g = "store_page";
        lVar.b();
        PortfolioSortAdapter portfolioSortAdapter = this.i;
        if (portfolioSortAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sortAdapter");
        }
        portfolioSortAdapter.notifyDataSetChanged();
        this.l = tVar;
        h();
    }

    private final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2884a, false, 28352, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f2884a, false, 28352, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 == 0) {
            PortfolioAdapter portfolioAdapter = this.B;
            if (portfolioAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            portfolioAdapter.notifyDataSetChanged();
        } else {
            PortfolioAdapter portfolioAdapter2 = this.B;
            if (portfolioAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            portfolioAdapter2.notifyItemRangeInserted(i2 + 1, i3);
        }
    }

    private final void a(RelativeLayout relativeLayout, String str, com.ss.android.ugc.aweme.commerce.service.models.w wVar) {
        RelativeLayout relativeLayout2 = relativeLayout;
        String str2 = str;
        com.ss.android.ugc.aweme.commerce.service.models.w wVar2 = wVar;
        if (PatchProxy.isSupport(new Object[]{relativeLayout2, str2, wVar2}, this, f2884a, false, 28362, new Class[]{RelativeLayout.class, String.class, com.ss.android.ugc.aweme.commerce.service.models.w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{relativeLayout2, str2, wVar2}, this, f2884a, false, 28362, new Class[]{RelativeLayout.class, String.class, com.ss.android.ugc.aweme.commerce.service.models.w.class}, Void.TYPE);
            return;
        }
        a.i.a((Callable<TResult>) new s<TResult>(str2)).a((a.g<TResult, TContinuationResult>) new t<TResult,TContinuationResult>(this, new r(this, wVar2, str2), relativeLayout2), a.i.f1052b);
    }
}
