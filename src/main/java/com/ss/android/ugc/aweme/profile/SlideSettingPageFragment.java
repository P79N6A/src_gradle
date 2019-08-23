package com.ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItem;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.ui.widget.setting.a;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.facebook.react.common.MapBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commerce.service.logs.ai;
import com.ss.android.ugc.aweme.commerce.service.logs.av;
import com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity;
import com.ss.android.ugc.aweme.commercialize.utils.DouplusTitleHelper;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.pojo.DouyinOrderSetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.PoiSetting;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppListAdapter;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.poi.api.PoiMerchantApi;
import com.ss.android.ugc.aweme.profile.d.aa;
import com.ss.android.ugc.aweme.profile.d.x;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;
import com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget;
import com.ss.android.ugc.aweme.qrcode.d;
import com.ss.android.ugc.aweme.qrcode.v2.QRCodeActivityV2;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem;
import com.ss.android.ugc.aweme.utils.ex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010O\u001a\u00020MH\u0002J\b\u0010P\u001a\u00020MH\u0002J\b\u0010Q\u001a\u00020MH\u0002J\u0010\u0010R\u001a\u00020M2\u0006\u0010S\u001a\u00020\u001aH\u0002J\b\u0010T\u001a\u00020MH\u0002J\b\u0010U\u001a\u00020MH\u0002J\b\u0010V\u001a\u00020MH\u0002J\b\u0010W\u001a\u00020MH\u0002J\b\u0010X\u001a\u00020MH\u0002J\b\u0010Y\u001a\u00020MH\u0002J\b\u0010Z\u001a\u00020MH\u0002J\b\u0010[\u001a\u00020MH\u0002J\b\u0010\\\u001a\u00020MH\u0002J\b\u0010]\u001a\u00020MH\u0002J\b\u0010^\u001a\u00020MH\u0002J\b\u0010_\u001a\u00020MH\u0002J\b\u0010`\u001a\u00020MH\u0002J\b\u0010a\u001a\u00020MH\u0002J\b\u0010b\u001a\u00020MH\u0002J\b\u0010c\u001a\u00020MH\u0002J\b\u0010d\u001a\u00020MH\u0002J\b\u0010e\u001a\u00020MH\u0002J\b\u0010f\u001a\u00020MH\u0002J\b\u0010g\u001a\u00020MH\u0002J\b\u0010h\u001a\u00020MH\u0002J\b\u0010i\u001a\u00020MH\u0002J\b\u0010j\u001a\u0004\u0018\u00010\u000fJ\b\u0010k\u001a\u00020MH\u0002J\u001a\u0010l\u001a\u00020M2\b\b\u0002\u0010m\u001a\u00020\u001a2\b\b\u0002\u0010n\u001a\u00020\u001aJ\b\u0010o\u001a\u00020MH\u0002J\b\u0010p\u001a\u00020MH\u0002J\b\u0010q\u001a\u00020MH\u0002J\b\u0010r\u001a\u00020\u001aH\u0004J\b\u0010s\u001a\u00020\u001aH\u0016J\u0012\u0010t\u001a\u00020M2\b\u0010u\u001a\u0004\u0018\u00010\u0016H\u0016J&\u0010v\u001a\u0004\u0018\u00010\u00162\u0006\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010+2\b\u0010z\u001a\u0004\u0018\u00010{H\u0016J\u0012\u0010|\u001a\u00020M2\b\u0010}\u001a\u0004\u0018\u00010~H\u0007J\u0011\u0010\u001a\u00020M2\u0007\u0010\u0001\u001a\u00020\u001aH\u0016J\u0012\u0010\u0001\u001a\u00020M2\u0007\u0010\u0001\u001a\u00020\u0011H\u0016J$\u0010\u0001\u001a\u00020M2\u0007\u0010\u0001\u001a\u00020\u00112\u0007\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020\u0011H\u0016J\u0012\u0010\u0001\u001a\u00020M2\u0007\u0010\u0001\u001a\u00020\u0011H\u0016J\t\u0010\u0001\u001a\u00020MH\u0016J\t\u0010\u0001\u001a\u00020MH\u0016J\u001b\u0010\u0001\u001a\u00020M2\u0006\u0010N\u001a\u00020\u00162\b\u0010z\u001a\u0004\u0018\u00010{H\u0016J\u0011\u0010\u0001\u001a\u00020M2\u0006\u0010n\u001a\u00020\u001aH\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J\t\u0010\u0001\u001a\u00020MH\u0002J4\u0010\u0001\u001a\u00020M2\t\u0010\u0001\u001a\u0004\u0018\u00010\u00162\u0018\u0010\u0001\u001a\r\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0001\"\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0003\u0010\u0001J\u0012\u0010\u0001\u001a\u00020M2\u0007\u0010\u0001\u001a\u00020\u001aH\u0016J\t\u0010\u0001\u001a\u00020MH\u0002J\t\u0010\u0001\u001a\u00020\u001aH\u0002J\t\u0010\u0001\u001a\u00020MH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00168BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u00109\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010B\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010E\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010G\u001a\u00020H8BX\u0002¢\u0006\f\n\u0004\bK\u0010\r\u001a\u0004\bI\u0010J¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/SlideSettingPageFragment;", "Lcom/ss/android/ugc/aweme/main/base/mainpage/CommonPageFragment;", "Landroid/view/View$OnClickListener;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "Lcom/bytedance/ies/dmt/ui/widget/setting/EffectiveSettingItemBase$OnSettingItemClickListener;", "()V", "adapter", "Lcom/ss/android/ugc/aweme/miniapp/adapter/RecentlyMicroAppListAdapter;", "chooseAccountWidget", "Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget;", "getChooseAccountWidget", "()Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget;", "chooseAccountWidget$delegate", "Lkotlin/Lazy;", "enterMethod", "", "lastPageIndex", "", "Ljava/lang/Integer;", "mProtectionEnabled", "Landroid/widget/TextView;", "mTeenagerProtectionTools", "Landroid/view/View;", "pageWidth", "", "pauseByPageJump", "", "rvMicroApp", "Landroid/support/v7/widget/RecyclerView;", "scrollSwitchHelper", "Lcom/ss/android/ugc/aweme/main/IScrollSwitchHelper;", "shadowSettingView", "getShadowSettingView", "()Landroid/view/View;", "shoppingAssistantNotifyId", "", "turnToutiaoHelper", "Lcom/ss/android/ugc/aweme/profile/util/TurnToutiaoHelper;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "vgCoupon", "Lcom/bytedance/ies/dmt/ui/common/views/CommonItemView;", "vgDouHelper", "Landroid/view/ViewGroup;", "vgEPlatform", "vgExpandContainer", "vgFansPlus", "vgFreeLook", "vgMainContainer", "vgMicroAppList", "vgMostUseMicroApp", "Lcom/ss/android/ugc/aweme/setting/ui/ExpandSettingItem;", "vgMyQrCode", "vgOpenDebugTest", "vgOrder", "vgOrderExpand", "vgOrderHelper", "vgPoiMerchant", "vgRecentMicroApp", "vgRingtoneCenter", "vgSetting", "vgShareProfile", "vgShopHelper", "Lcom/bytedance/ies/dmt/ui/widget/setting/EffectiveSettingItem;", "vgUserTag", "vgWallet", "vwDivider1", "vwDivider2", "vwDivider3", "vwDivider5", "vwMyCollection", "widgetManager", "Lcom/ss/android/ugc/aweme/arch/widgets/base/WidgetManager;", "getWidgetManager", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/WidgetManager;", "widgetManager$delegate", "OnSettingItemClick", "", "view", "bindClickLinsenter", "bindViewVisibility", "checkNeedShowMircoApp", "checkShoppingAssistantStatus", "isClick", "checkVisibilityOnResume", "clickCoupon", "clickDouOrder", "clickEPlatform", "clickEditUserProfile", "clickFansPlus", "clickFreeCard", "clickMircoApp", "clickMircoAppList", "clickMyCollection", "clickMyQrCode", "clickOpenDebugPage", "clickOrder", "clickOrderHelper", "clickPoiMerchant", "clickRingtoneCenter", "clickSetting", "clickShareProfile", "clickShoppingAssistant", "clickTeenagerProtectionTools", "clickWalletForDouYin", "fetchMostUseMicroList", "getEnterMethod", "go2ShoppingAssistant", "hidePage", "needDelay", "needAnim", "initMicroListAdapter", "initView", "initViewById", "isPrivateAccount", "isRegisterEventBus", "onClick", "v", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "savedInstanceState", "Landroid/os/Bundle;", "onEvent", "setting", "Lcom/ss/android/ugc/aweme/antiaddic/lock/entity/TimeLockUserSetting;", "onHiddenChanged", "hidden", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "positionOffsetPixels", "onPageSelected", "onPause", "onResume", "onViewCreated", "scrollToProfileTab", "setDebugView", "setDividerForI18n", "setDividerVisibility", "divider", "views", "", "(Landroid/view/View;[Landroid/view/View;)V", "setUserVisibleHint", "isVisibleToUser", "setupDouplusTitleBySettings", "showMicroApp", "updateProtectEnabled", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SlideSettingPageFragment extends CommonPageFragment implements ViewPager.OnPageChangeListener, View.OnClickListener, a.C0015a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3772a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f3773b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SlideSettingPageFragment.class), "widgetManager", "getWidgetManager()Lcom/ss/android/ugc/aweme/arch/widgets/base/WidgetManager;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SlideSettingPageFragment.class), "chooseAccountWidget", "getChooseAccountWidget()Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget;"))};
    private ViewGroup A;
    private CommonItemView B;
    private CommonItemView C;
    private ViewGroup D;
    private ViewGroup E;
    private ViewGroup F;
    private View G;
    private View H;
    private View I;
    private boolean J;
    private float K;
    private User L;
    private aa M;
    private String N = "slide";
    private Integer O = -1;
    private View P;
    private TextView Q;
    private final Lazy R = LazyKt.lazy(new c(this));
    private HashMap S;

    /* renamed from: c  reason: collision with root package name */
    public CommonItemView f3774c;

    /* renamed from: d  reason: collision with root package name */
    public ExpandSettingItem f3775d;

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f3776e;

    /* renamed from: f  reason: collision with root package name */
    public EffectiveSettingItem f3777f;
    public ViewGroup g;
    public View h;
    public com.ss.android.ugc.aweme.main.e i;
    public long j;
    public RecyclerView k;
    public RecentlyMicroAppListAdapter l;
    public View m;
    final Lazy n = LazyKt.lazy(new i(this));
    private CommonItemView o;
    private ViewGroup p;
    private ViewGroup q;
    private ViewGroup r;
    private ViewGroup s;
    private CommonItemView t;
    private CommonItemView u;
    private ViewGroup v;
    private ViewGroup w;
    private CommonItemView x;
    private ExpandSettingItem y;
    private ViewGroup z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/profile/SlideSettingPageFragment$bindClickLinsenter$1", "Lcom/ss/android/ugc/aweme/setting/ui/ExpandSettingItem$OnExpandListener;", "onExpand", "", "isExpand", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements ExpandSettingItem.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SlideSettingPageFragment f61198b;

        a(SlideSettingPageFragment slideSettingPageFragment) {
            this.f61198b = slideSettingPageFragment;
        }

        public final void a(boolean z) {
            Object obj;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61197a, false, 67335, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61197a, false, 67335, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (z) {
                EffectiveSettingItem effectiveSettingItem = this.f61198b.f3777f;
                if (effectiveSettingItem != null) {
                    obj = effectiveSettingItem.getTag(C0906R.id.cka);
                } else {
                    obj = null;
                }
                if (!Intrinsics.areEqual((Object) "position_taken", obj)) {
                    EffectiveSettingItem effectiveSettingItem2 = this.f61198b.f3777f;
                    if (effectiveSettingItem2 != null) {
                        effectiveSettingItem2.setTag(C0906R.id.cka, "position_taken");
                    }
                    new av().a("setting_page").b();
                }
            }
            if (z) {
                ViewGroup viewGroup = this.f61198b.g;
                if (viewGroup != null && viewGroup.getVisibility() == 0) {
                    r.a("show_ringtone_service", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").f34114b);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/profile/SlideSettingPageFragment$checkShoppingAssistantStatus$1", "Lcom/ss/android/ugc/aweme/commerce/service/callbacks/CheckShoppingAssistantCallBack;", "updateShoppingAssistantNotify", "", "struct", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceProfileHintStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.ss.android.ugc.aweme.commerce.service.a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SlideSettingPageFragment f61200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f61201c;

        public final void a(@Nullable com.ss.android.ugc.aweme.commerce.service.models.g gVar) {
            String str;
            String str2;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f61199a, false, 67336, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.g.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{gVar}, this, f61199a, false, 67336, new Class[]{com.ss.android.ugc.aweme.commerce.service.models.g.class}, Void.TYPE);
                return;
            }
            long j = 0;
            if (gVar != null) {
                com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(this.f61200b.getContext());
                if (!(a2 == null || a2.a(0) == gVar.getId())) {
                    z = true;
                }
            }
            String str3 = null;
            if (z) {
                if (gVar != null) {
                    str = gVar.getText();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    EffectiveSettingItem effectiveSettingItem = this.f61200b.f3777f;
                    if (effectiveSettingItem != null) {
                        effectiveSettingItem.b();
                    }
                    EffectiveSettingItem effectiveSettingItem2 = this.f61200b.f3777f;
                    if (effectiveSettingItem2 != null) {
                        if (gVar != null) {
                            str2 = gVar.getText();
                        } else {
                            str2 = null;
                        }
                        effectiveSettingItem2.setRightTxt(str2);
                    }
                }
            }
            EffectiveSettingItem effectiveSettingItem3 = this.f61200b.f3777f;
            if (effectiveSettingItem3 != null) {
                if (gVar != null) {
                    str3 = gVar.getUrl();
                }
                effectiveSettingItem3.setTag(str3);
            }
            SlideSettingPageFragment slideSettingPageFragment = this.f61200b;
            if (gVar != null) {
                j = gVar.getId();
            }
            slideSettingPageFragment.j = j;
            if (this.f61201c) {
                this.f61200b.b();
            }
        }

        b(SlideSettingPageFragment slideSettingPageFragment, boolean z) {
            this.f61200b = slideSettingPageFragment;
            this.f61201c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/profile/widgets/DTChooseAccountWidget;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<DTChooseAccountWidget> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SlideSettingPageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SlideSettingPageFragment slideSettingPageFragment) {
            super(0);
            this.this$0 = slideSettingPageFragment;
        }

        @NotNull
        public final DTChooseAccountWidget invoke() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67337, new Class[0], DTChooseAccountWidget.class)) {
                return (DTChooseAccountWidget) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67337, new Class[0], DTChooseAccountWidget.class);
            }
            ViewGroup viewGroup = this.this$0.f3776e;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            DTChooseAccountWidget dTChooseAccountWidget = new DTChooseAccountWidget(viewGroup, this.this$0);
            SlideSettingPageFragment slideSettingPageFragment = this.this$0;
            if (PatchProxy.isSupport(new Object[0], slideSettingPageFragment, SlideSettingPageFragment.f3772a, false, 67279, new Class[0], WidgetManager.class)) {
                value = PatchProxy.accessDispatch(new Object[0], slideSettingPageFragment, SlideSettingPageFragment.f3772a, false, 67279, new Class[0], WidgetManager.class);
            } else {
                value = slideSettingPageFragment.n.getValue();
            }
            ((WidgetManager) value).a((View) (LinearLayout) this.this$0.a((int) C0906R.id.sl), (Widget) dTChooseAccountWidget);
            return dTChooseAccountWidget;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/miniapp_api/model/MicroAppListResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    static final class d<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61202a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f61203b = 3;

        d(int i) {
        }

        public final /* synthetic */ Object call() {
            if (!PatchProxy.isSupport(new Object[0], this, f61202a, false, 67338, new Class[0], com.ss.android.ugc.aweme.miniapp_api.model.g.class)) {
                return ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).getMicroAppList(0, this.f61203b, 1);
            }
            return (com.ss.android.ugc.aweme.miniapp_api.model.g) PatchProxy.accessDispatch(new Object[0], this, f61202a, false, 67338, new Class[0], com.ss.android.ugc.aweme.miniapp_api.model.g.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/miniapp_api/model/MicroAppListResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements a.g<com.ss.android.ugc.aweme.miniapp_api.model.g, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61204a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SlideSettingPageFragment f61205b;

        e(SlideSettingPageFragment slideSettingPageFragment) {
            this.f61205b = slideSettingPageFragment;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f61204a, false, 67339, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f61204a, false, 67339, new Class[]{a.i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
            if (!iVar.d() && iVar.e() != null) {
                Object e2 = iVar.e();
                Intrinsics.checkExpressionValueIsNotNull(e2, "task.result");
                List<com.ss.android.ugc.aweme.miniapp_api.model.f> list = ((com.ss.android.ugc.aweme.miniapp_api.model.g) e2).f56031a;
                Object e3 = iVar.e();
                Intrinsics.checkExpressionValueIsNotNull(e3, "task.result");
                boolean z = ((com.ss.android.ugc.aweme.miniapp_api.model.g) e3).f56032b;
                if (CollectionUtils.isEmpty(list)) {
                    View view = this.f61205b.h;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    RecyclerView recyclerView = this.f61205b.k;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                    }
                    ExpandSettingItem expandSettingItem = this.f61205b.f3775d;
                    if (expandSettingItem != null) {
                        expandSettingItem.setVisibility(8);
                    }
                    CommonItemView commonItemView = this.f61205b.f3774c;
                    if (commonItemView != null) {
                        commonItemView.setVisibility(0);
                    }
                } else {
                    View view2 = this.f61205b.h;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    RecyclerView recyclerView2 = this.f61205b.k;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                    ExpandSettingItem expandSettingItem2 = this.f61205b.f3775d;
                    if (expandSettingItem2 != null) {
                        expandSettingItem2.setVisibility(0);
                    }
                    CommonItemView commonItemView2 = this.f61205b.f3774c;
                    if (commonItemView2 != null) {
                        commonItemView2.setVisibility(8);
                    }
                    RecentlyMicroAppListAdapter recentlyMicroAppListAdapter = this.f61205b.l;
                    if (recentlyMicroAppListAdapter != null) {
                        recentlyMicroAppListAdapter.a(list, z);
                    }
                    ExpandSettingItem expandSettingItem3 = this.f61205b.f3775d;
                    if (expandSettingItem3 != null) {
                        expandSettingItem3.a();
                    }
                }
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61206a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SlideSettingPageFragment f61207b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f61208c;

        f(SlideSettingPageFragment slideSettingPageFragment, boolean z) {
            this.f61207b = slideSettingPageFragment;
            this.f61208c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f61206a, false, 67340, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61206a, false, 67340, new Class[0], Void.TYPE);
                return;
            }
            this.f61207b.a(this.f61208c);
            View a2 = this.f61207b.a();
            if (a2 != null) {
                a2.setVisibility(8);
            }
            View a3 = this.f61207b.a();
            if (a3 != null) {
                a3.setClickable(false);
            }
            com.ss.android.ugc.aweme.main.e eVar = this.f61207b.i;
            if (eVar != null) {
                eVar.b(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61209a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SlideSettingPageFragment f61210b;

        g(SlideSettingPageFragment slideSettingPageFragment) {
            this.f61210b = slideSettingPageFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f61209a, false, 67341, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f61209a, false, 67341, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            View a2 = this.f61210b.a();
            if (a2 != null) {
                a2.setClickable(false);
            }
            com.ss.android.ugc.aweme.main.e eVar = this.f61210b.i;
            if (eVar != null) {
                eVar.a(Boolean.TRUE);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61211a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SlideSettingPageFragment f61212b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f61213c;

        h(SlideSettingPageFragment slideSettingPageFragment, boolean z) {
            this.f61212b = slideSettingPageFragment;
            this.f61213c = z;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f61211a, false, 67342, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61211a, false, 67342, new Class[0], Void.TYPE);
                return;
            }
            this.f61212b.a(this.f61213c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/arch/widgets/base/WidgetManager;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<WidgetManager> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SlideSettingPageFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SlideSettingPageFragment slideSettingPageFragment) {
            super(0);
            this.this$0 = slideSettingPageFragment;
        }

        public final WidgetManager invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67343, new Class[0], WidgetManager.class)) {
                return WidgetManager.a((Fragment) this.this$0, this.this$0.getView());
            }
            return (WidgetManager) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67343, new Class[0], WidgetManager.class);
        }
    }

    private final DTChooseAccountWidget c() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67280, new Class[0], DTChooseAccountWidget.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67280, new Class[0], DTChooseAccountWidget.class);
        } else {
            value = this.R.getValue();
        }
        return (DTChooseAccountWidget) value;
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3772a, false, 67333, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3772a, false, 67333, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.S == null) {
            this.S = new HashMap();
        }
        View view = (View) this.S.get(Integer.valueOf(i2));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i2);
            this.S.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final View a() {
        View view;
        if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67278, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67278, new Class[0], View.class);
        }
        if (this.m == null) {
            com.ss.android.ugc.aweme.main.e eVar = this.i;
            if (eVar != null) {
                view = eVar.c();
            } else {
                view = null;
            }
            this.m = view;
        }
        return this.m;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67334, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67334, new Class[0], Void.TYPE);
            return;
        }
        if (this.S != null) {
            this.S.clear();
        }
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67302, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.J) {
            a(this.J, false);
            this.J = false;
        }
    }

    private final void d() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67287, new Class[0], Void.TYPE);
            return;
        }
        TextView textView = this.Q;
        if (textView != null) {
            if (!TimeLockRuler.isContentFilterOn() && !TimeLockRuler.isTimeLockOn() && com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b.b() != b.a.PARENT && com.ss.android.ugc.aweme.antiaddic.lock.b.f33436b.b() != b.a.CHILD) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
    }

    private final boolean f() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67295, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67295, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!com.ss.android.g.a.a() && Build.VERSION.SDK_INT >= 21) {
            SharePrefCache inst = SharePrefCache.inst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
            an<String> miniAppLabelTitle = inst.getMiniAppLabelTitle();
            Intrinsics.checkExpressionValueIsNotNull(miniAppLabelTitle, "SharePrefCache.inst().miniAppLabelTitle");
            if (!TextUtils.isEmpty((CharSequence) miniAppLabelTitle.c()) && !TimeLockRuler.isTeenModeON()) {
                z2 = true;
            }
        }
        return z2;
    }

    private final void g() {
        AwemeListFragment awemeListFragment;
        if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67327, new Class[0], Void.TYPE);
            return;
        }
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        User curUser = a2.getCurUser();
        com.ss.android.ugc.aweme.main.e eVar = this.i;
        ArrayList<Aweme> arrayList = null;
        if (eVar != null) {
            awemeListFragment = eVar.g();
        } else {
            awemeListFragment = null;
        }
        if (awemeListFragment != null) {
            com.ss.android.ugc.aweme.main.e eVar2 = this.i;
            if (eVar2 == null) {
                Intrinsics.throwNpe();
            }
            AwemeListFragment g2 = eVar2.g();
            if (g2 == null) {
                Intrinsics.throwNpe();
            }
            arrayList = g2.D();
        }
        if (arrayList != null) {
            com.ss.android.ugc.aweme.feed.k.a.a((List<Aweme>) arrayList);
        }
        QRCodeActivityV2.a(getContext(), new d.a().a(4, ex.h(curUser), "navigation_panel").a(ex.i(curUser), ex.j(curUser), ex.e(curUser)).f63387b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        if (r1 == null) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3772a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 67309(0x106ed, float:9.432E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3772a
            r5 = 0
            r6 = 67309(0x106ed, float:9.432E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            android.content.Context r0 = r9.getContext()
            boolean r0 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r0)
            if (r0 == 0) goto L_0x007b
            com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItem r0 = r9.f3777f
            if (r0 == 0) goto L_0x0036
            r0.c()
        L_0x0036:
            com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItem r0 = r9.f3777f
            if (r0 == 0) goto L_0x003f
            java.lang.String r1 = ""
            r0.setRightTxt(r1)
        L_0x003f:
            long r0 = r9.j
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.commerce.service.h.b r0 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b
            android.support.v4.app.FragmentActivity r1 = r9.getActivity()
            android.content.Context r1 = (android.content.Context) r1
            com.ss.android.ugc.aweme.commerce.service.h.a r0 = r0.a(r1)
            if (r0 == 0) goto L_0x005a
            long r1 = r9.j
            r0.b((long) r1)
        L_0x005a:
            com.bytedance.ies.dmt.ui.widget.setting.EffectiveSettingItem r0 = r9.f3777f
            r1 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r0.getTag()
            goto L_0x0065
        L_0x0064:
            r0 = r1
        L_0x0065:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L_0x006a
            r0 = r1
        L_0x006a:
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            android.content.Context r2 = r9.getContext()
            com.ss.android.ugc.aweme.commerce.a.a((java.lang.String) r0, (java.util.Map<java.lang.String, java.lang.String>) r1, (android.content.Context) r2)
            return
        L_0x007b:
            android.content.Context r0 = r9.getContext()
            android.content.Context r1 = r9.getContext()
            if (r1 == 0) goto L_0x008e
            r2 = 2131561430(0x7f0d0bd6, float:1.874826E38)
            java.lang.String r1 = r1.getString(r2)
            if (r1 != 0) goto L_0x0090
        L_0x008e:
            java.lang.String r1 = ""
        L_0x0090:
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment.b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3772a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 67301(0x106e5, float:9.4309E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3772a
            r5 = 0
            r6 = 67301(0x106e5, float:9.4309E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            super.onResume()
            r1 = 1
            r10.a((boolean) r0, (boolean) r1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3772a
            r5 = 0
            r6 = 67291(0x106db, float:9.4295E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r10
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0050
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f3772a
            r6 = 0
            r7 = 67291(0x106db, float:9.4295E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0050:
            boolean r2 = com.ss.android.g.a.a()
            if (r2 != 0) goto L_0x007c
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x007c
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r3 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.app.an r2 = r2.getMiniAppLabelTitle()
            java.lang.String r3 = "SharePrefCache.inst().miniAppLabelTitle"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object r2 = r2.c()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x007c
            r2 = 1
            goto L_0x007d
        L_0x007c:
            r2 = 0
        L_0x007d:
            com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r4 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.cd()
            if (r3 != 0) goto L_0x008e
            r3 = 1
            goto L_0x008f
        L_0x008e:
            r3 = 0
        L_0x008f:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r10.f3774c
            if (r4 == 0) goto L_0x00a4
            if (r2 == 0) goto L_0x009f
            if (r3 == 0) goto L_0x009f
            boolean r3 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r3 != 0) goto L_0x009f
            r3 = 0
            goto L_0x00a1
        L_0x009f:
            r3 = 8
        L_0x00a1:
            r4.setVisibility(r3)
        L_0x00a4:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r3 = r10.f3774c
            if (r3 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.app.SharePrefCache r4 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r5 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.app.an r4 = r4.getMiniAppLabelTitle()
            java.lang.String r5 = "SharePrefCache.inst().miniAppLabelTitle"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.Object r4 = r4.c()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setLeftText(r4)
        L_0x00c3:
            if (r2 == 0) goto L_0x00ea
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r3 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.app.an r2 = r2.getShowMiniAppFreshGuideNotify()
            java.lang.String r3 = "SharePrefCache.inst().showMiniAppFreshGuideNotify"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object r2 = r2.c()
            java.lang.String r3 = "SharePrefCache.inst().sh…AppFreshGuideNotify.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00ea
            r2 = 1
            goto L_0x00eb
        L_0x00ea:
            r2 = 0
        L_0x00eb:
            if (r2 == 0) goto L_0x00fa
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r2 = r10.f3774c
            if (r2 == 0) goto L_0x00f4
            r2.a()
        L_0x00f4:
            java.lang.String r2 = "show_mp_yellowdot"
            r3 = 0
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
        L_0x00fa:
            boolean r2 = com.ss.android.g.a.a()
            r3 = 2
            if (r2 == 0) goto L_0x0115
            android.view.View r2 = r10.G
            android.view.View[] r3 = new android.view.View[r3]
            android.view.ViewGroup r4 = r10.r
            android.view.View r4 = (android.view.View) r4
            r3[r0] = r4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r10.f3774c
            android.view.View r0 = (android.view.View) r0
            r3[r1] = r0
            r10.a((android.view.View) r2, (android.view.View[]) r3)
            return
        L_0x0115:
            android.view.View r2 = r10.H
            android.view.View[] r3 = new android.view.View[r3]
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r10.f3774c
            android.view.View r4 = (android.view.View) r4
            r3[r0] = r4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r10.B
            android.view.View r0 = (android.view.View) r0
            r3[r1] = r0
            r10.a((android.view.View) r2, (android.view.View[]) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment.onResume():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f3772a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 67288(0x106d8, float:9.429E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f3772a
            r5 = 0
            r6 = 67288(0x106d8, float:9.429E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r2 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            r9.L = r1
            android.view.ViewGroup r1 = r9.r
            r2 = 8
            if (r1 == 0) goto L_0x0066
            boolean r3 = com.ss.android.ugc.aweme.wallet.a.a()
            if (r3 == 0) goto L_0x0061
            com.ss.android.ugc.aweme.app.i r3 = com.ss.android.ugc.aweme.app.i.a()
            java.lang.String r4 = "AppContextInfoManager.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            java.lang.String r3 = r3.getChannel()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "amazon"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x005f
            boolean r3 = com.ss.android.g.a.a()
            if (r3 != 0) goto L_0x0061
        L_0x005f:
            r3 = 0
            goto L_0x0063
        L_0x0061:
            r3 = 8
        L_0x0063:
            r1.setVisibility(r3)
        L_0x0066:
            android.view.ViewGroup r1 = r9.s
            r3 = 1
            if (r1 == 0) goto L_0x009b
            com.ss.android.ugc.aweme.profile.model.User r4 = r9.L
            boolean r4 = com.ss.android.ugc.aweme.profile.ui.y.a((com.ss.android.ugc.aweme.profile.model.User) r4)
            if (r4 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.app.SharePrefCache r4 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r5 = "SharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.app.an r4 = r4.getSyncTT()
            java.lang.String r5 = "SharePrefCache.inst().syncTT"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.Object r4 = r4.c()
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x008e
            goto L_0x0096
        L_0x008e:
            int r4 = r4.intValue()
            if (r4 != r3) goto L_0x0096
            r4 = 0
            goto L_0x0098
        L_0x0096:
            r4 = 8
        L_0x0098:
            r1.setVisibility(r4)
        L_0x009b:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r9.B
            if (r1 == 0) goto L_0x00ac
            boolean r4 = com.ss.android.ugc.aweme.commercialize.coupon.api.CouponApi.a()
            if (r4 == 0) goto L_0x00a7
            r4 = 0
            goto L_0x00a9
        L_0x00a7:
            r4 = 8
        L_0x00a9:
            r1.setVisibility(r4)
        L_0x00ac:
            boolean r1 = com.ss.android.ugc.aweme.feed.y.b()
            if (r1 == 0) goto L_0x00d5
            java.lang.String r1 = "coupon_notice"
            com.ss.android.ugc.aweme.app.d.d r4 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r5 = "notice_type"
            java.lang.String r6 = "yellow_dot"
            com.ss.android.ugc.aweme.app.d.d r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = "navigation_panel"
            com.ss.android.ugc.aweme.app.d.d r4 = r4.a((java.lang.String) r5, (java.lang.String) r6)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r9.B
            if (r1 == 0) goto L_0x00dc
            r1.a()
            goto L_0x00dc
        L_0x00d5:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r9.B
            if (r1 == 0) goto L_0x00dc
            r1.b()
        L_0x00dc:
            boolean r1 = com.ss.android.ugc.aweme.utils.ex.a()
            if (r1 == 0) goto L_0x00f5
            android.view.ViewGroup r1 = r9.w
            if (r1 == 0) goto L_0x00e9
            r1.setVisibility(r0)
        L_0x00e9:
            java.lang.String r1 = "show_eplatform"
            com.ss.android.ugc.aweme.app.d.d r4 = com.ss.android.ugc.aweme.app.d.d.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r4)
            goto L_0x00fc
        L_0x00f5:
            android.view.ViewGroup r1 = r9.w
            if (r1 == 0) goto L_0x00fc
            r1.setVisibility(r2)
        L_0x00fc:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r9.C
            if (r1 == 0) goto L_0x010d
            boolean r4 = com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.b()
            if (r4 == 0) goto L_0x0108
            r4 = 0
            goto L_0x010a
        L_0x0108:
            r4 = 8
        L_0x010a:
            r1.setVisibility(r4)
        L_0x010d:
            boolean r1 = com.ss.android.ugc.aweme.poi.api.PoiMerchantApi.c()
            if (r1 == 0) goto L_0x011b
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r9.C
            if (r1 == 0) goto L_0x0122
            r1.a()
            goto L_0x0122
        L_0x011b:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r9.C
            if (r1 == 0) goto L_0x0122
            r1.b()
        L_0x0122:
            com.ss.android.ugc.aweme.profile.model.User r1 = r9.L
            if (r1 == 0) goto L_0x013a
            boolean r1 = r1.isWithDouplusEntry()
            if (r1 != r3) goto L_0x013a
            boolean r1 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isContentFilterOn()
            if (r1 != 0) goto L_0x013a
            android.view.ViewGroup r1 = r9.E
            if (r1 == 0) goto L_0x0141
            r1.setVisibility(r0)
            goto L_0x0141
        L_0x013a:
            android.view.ViewGroup r1 = r9.E
            if (r1 == 0) goto L_0x0141
            r1.setVisibility(r2)
        L_0x0141:
            com.ss.android.ugc.aweme.profile.model.User r1 = r9.L
            if (r1 == 0) goto L_0x014a
            java.lang.String r1 = r1.getBindPhone()
            goto L_0x014b
        L_0x014a:
            r1 = 0
        L_0x014b:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x015b
            android.view.ViewGroup r1 = r9.g
            if (r1 == 0) goto L_0x0162
            r1.setVisibility(r0)
            goto L_0x0162
        L_0x015b:
            android.view.ViewGroup r1 = r9.g
            if (r1 == 0) goto L_0x0162
            r1.setVisibility(r2)
        L_0x0162:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x0176
            android.view.View r1 = r9.H
            android.view.View[] r3 = new android.view.View[r3]
            android.view.ViewGroup r4 = r9.s
            android.view.View r4 = (android.view.View) r4
            r3[r0] = r4
            r9.a((android.view.View) r1, (android.view.View[]) r3)
            goto L_0x018a
        L_0x0176:
            android.view.View r1 = r9.H
            r4 = 2
            android.view.View[] r4 = new android.view.View[r4]
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r5 = r9.f3774c
            android.view.View r5 = (android.view.View) r5
            r4[r0] = r5
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r5 = r9.B
            android.view.View r5 = (android.view.View) r5
            r4[r3] = r5
            r9.a((android.view.View) r1, (android.view.View[]) r4)
        L_0x018a:
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r1 = com.ss.android.ugc.aweme.global.config.settings.g.b()     // Catch:{ Exception -> 0x0198 }
            java.lang.String r3 = "SettingsReader.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)     // Catch:{ Exception -> 0x0198 }
            java.lang.Boolean r1 = r1.bf()     // Catch:{ Exception -> 0x0198 }
            goto L_0x019a
        L_0x0198:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
        L_0x019a:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r3 = r9.x
            if (r3 == 0) goto L_0x01b5
            java.lang.String r4 = "enableCommerceOrder"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            boolean r4 = r1.booleanValue()
            if (r4 == 0) goto L_0x01b0
            boolean r4 = com.ss.android.g.a.a()
            if (r4 != 0) goto L_0x01b0
            goto L_0x01b2
        L_0x01b0:
            r0 = 8
        L_0x01b2:
            r3.setVisibility(r0)
        L_0x01b5:
            com.ss.android.ugc.aweme.commerce.service.h.b r0 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b
            android.support.v4.app.FragmentActivity r3 = r9.getActivity()
            android.content.Context r3 = (android.content.Context) r3
            com.ss.android.ugc.aweme.commerce.service.h.a r0 = r0.a(r3)
            com.ss.android.ugc.aweme.profile.model.User r3 = r9.L
            if (r3 == 0) goto L_0x020b
            com.ss.android.ugc.aweme.profile.model.User r3 = r9.L
            if (r3 != 0) goto L_0x01cc
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01cc:
            java.lang.String r3 = r3.getUid()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x020b
            if (r0 == 0) goto L_0x020b
            java.lang.String r3 = "enableCommerceOrder"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x020b
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x020b
            com.ss.android.ugc.aweme.commerce.service.h.b r1 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b
            com.ss.android.ugc.aweme.profile.model.User r3 = r9.L
            if (r3 != 0) goto L_0x01f4
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01f4:
            java.lang.String r3 = r3.getUid()
            java.lang.String r4 = "user!!.uid"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            boolean r0 = r1.c(r0, r3)
            if (r0 == 0) goto L_0x020b
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.x
            if (r0 == 0) goto L_0x0212
            r0.a()
            goto L_0x0212
        L_0x020b:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.x
            if (r0 == 0) goto L_0x0212
            r0.b()
        L_0x0212:
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r0 == 0) goto L_0x0266
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.o
            if (r0 == 0) goto L_0x021f
            r0.setVisibility(r2)
        L_0x021f:
            android.view.ViewGroup r0 = r9.r
            if (r0 == 0) goto L_0x0226
            r0.setVisibility(r2)
        L_0x0226:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.x
            if (r0 == 0) goto L_0x022d
            r0.setVisibility(r2)
        L_0x022d:
            com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem r0 = r9.y
            if (r0 == 0) goto L_0x0234
            r0.setVisibility(r2)
        L_0x0234:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.t
            if (r0 == 0) goto L_0x023b
            r0.setVisibility(r2)
        L_0x023b:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.B
            if (r0 == 0) goto L_0x0242
            r0.setVisibility(r2)
        L_0x0242:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.C
            if (r0 == 0) goto L_0x0249
            r0.setVisibility(r2)
        L_0x0249:
            com.ss.android.ugc.aweme.setting.ui.ExpandSettingItem r0 = r9.f3775d
            if (r0 == 0) goto L_0x0250
            r0.setVisibility(r2)
        L_0x0250:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r9.f3774c
            if (r0 == 0) goto L_0x0257
            r0.setVisibility(r2)
        L_0x0257:
            android.view.View r0 = r9.H
            if (r0 == 0) goto L_0x025e
            r0.setVisibility(r2)
        L_0x025e:
            android.view.View r0 = r9.I
            if (r0 == 0) goto L_0x0266
            r0.setVisibility(r2)
            return
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment.e():void");
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void onEvent(@Nullable TimeLockUserSetting timeLockUserSetting) {
        if (PatchProxy.isSupport(new Object[]{timeLockUserSetting}, this, f3772a, false, 67332, new Class[]{TimeLockUserSetting.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{timeLockUserSetting}, this, f3772a, false, 67332, new Class[]{TimeLockUserSetting.class}, Void.TYPE);
            return;
        }
        d();
    }

    private final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3772a, false, 67283, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3772a, false, 67283, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.setting.c.a("setting", new b(this, z2));
    }

    public final void onHiddenChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3772a, false, 67284, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3772a, false, 67284, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z2);
        if (z2) {
            this.m = null;
            com.ss.android.ugc.aweme.main.e eVar = this.i;
            if (eVar != null) {
                eVar.b((ViewPager.OnPageChangeListener) this);
            }
        } else {
            com.ss.android.ugc.aweme.main.e eVar2 = this.i;
            if (eVar2 != null) {
                eVar2.a((ViewPager.OnPageChangeListener) this);
            }
        }
    }

    public final void onPageScrollStateChanged(int i2) {
        String str;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3772a, false, 67315, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3772a, false, 67315, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 == 1) {
            CharSequence charSequence = this.N;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z2 = false;
            }
            if (z2) {
                this.N = "slide";
            }
            View a2 = a();
            if (a2 != null) {
                a2.setVisibility(0);
            }
        } else if (i2 == 2) {
            CharSequence charSequence2 = this.N;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                z2 = false;
            }
            if (z2) {
                this.N = "click";
            }
            View a3 = a();
            if (a3 != null) {
                a3.setVisibility(0);
            }
        } else {
            if (i2 == 0) {
                this.N = "";
                com.ss.android.ugc.aweme.main.e eVar = this.i;
                if (eVar != null) {
                    str = eVar.b();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual((Object) "page_setting", (Object) str)) {
                    View a4 = a();
                    if (a4 != null) {
                        a4.setVisibility(8);
                    }
                    View a5 = a();
                    if (a5 != null) {
                        a5.setClickable(false);
                    }
                    com.ss.android.ugc.aweme.main.e eVar2 = this.i;
                    if (eVar2 != null) {
                        eVar2.b(false);
                    }
                } else {
                    com.ss.android.ugc.aweme.main.e eVar3 = this.i;
                    if (eVar3 != null) {
                        eVar3.b(true);
                    }
                    View a6 = a();
                    if (a6 != null) {
                        a6.setOnClickListener(new g(this));
                    }
                }
            }
        }
    }

    public final void setUserVisibleHint(boolean z2) {
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3772a, false, 67331, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3772a, false, 67331, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        if (getView() != null) {
            if (z2) {
                c().e();
                AbTestManager a2 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AbTestManager.getInstance()");
                if (a2.cd() != 1) {
                    z3 = false;
                }
                if (f() && z3) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67296, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67296, new Class[0], Void.TYPE);
                    } else if (!TimeLockRuler.isTeenModeON()) {
                        a.i.a((Callable<TResult>) new d<TResult>(3)).a((a.g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(this), a.i.f1052b);
                    }
                }
                e();
                return;
            }
            ExpandSettingItem expandSettingItem = this.y;
            if (expandSettingItem != null && expandSettingItem.u) {
                ExpandSettingItem expandSettingItem2 = this.y;
                if (expandSettingItem2 != null) {
                    expandSettingItem2.a(false);
                }
            }
        }
    }

    public final void a(@Nullable View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3772a, false, 67299, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3772a, false, 67299, new Class[]{View.class}, Void.TYPE);
            return;
        }
        onClick(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
        if (r0.intValue() != r16) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageSelected(int r16) {
        /*
            r15 = this;
            r7 = r15
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r9 = 0
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3772a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 67314(0x106f2, float:9.4327E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f3772a
            r3 = 0
            r4 = 67314(0x106f2, float:9.4327E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003b:
            java.lang.Integer r0 = r7.O
            r10 = 0
            if (r0 != 0) goto L_0x0043
            r11 = r16
            goto L_0x004b
        L_0x0043:
            int r0 = r0.intValue()
            r11 = r16
            if (r0 == r11) goto L_0x00f3
        L_0x004b:
            java.lang.String r0 = "page_setting"
            com.ss.android.ugc.aweme.main.e r1 = r7.i
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r1.b()
            goto L_0x0057
        L_0x0056:
            r1 = r10
        L_0x0057:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x00f3
            java.lang.String r12 = "enter_navigation"
            com.ss.android.ugc.aweme.app.d.d r0 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "personal_homepage"
            com.ss.android.ugc.aweme.app.d.d r13 = r0.a((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r14 = "enter_method"
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3772a
            r3 = 0
            r4 = 67316(0x106f4, float:9.433E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0094
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3772a
            r3 = 0
            r4 = 67316(0x106f4, float:9.433E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00a3
        L_0x0094:
            java.lang.String r0 = com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.O
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r7.N
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r0 = com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.O
        L_0x00a3:
            com.ss.android.ugc.aweme.app.d.d r0 = r13.a((java.lang.String) r14, (java.lang.String) r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r12, (java.util.Map) r0)
            com.ss.android.ugc.aweme.profile.ui.MyProfileFragment.O = r10
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r0 = r0.al()
            if (r0 == 0) goto L_0x00fa
            android.content.Context r0 = r15.getContext()
            java.lang.Class<com.ss.android.ugc.aweme.profile.n> r1 = com.ss.android.ugc.aweme.profile.n.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.base.sharedpref.c.a(r0, r1)
            com.ss.android.ugc.aweme.profile.n r0 = (com.ss.android.ugc.aweme.profile.n) r0
            boolean r1 = r0.b((boolean) r8)
            if (r1 == 0) goto L_0x00fa
            java.lang.String r1 = "account_list_unfold"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "status"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (int) r9)
            java.lang.String r3 = "enter_method"
            java.lang.String r4 = "auto"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r2)
            com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget r1 = r15.c()
            r1.g()
            r0.a((boolean) r9)
            goto L_0x00fa
        L_0x00f3:
            com.ss.android.ugc.aweme.profile.widgets.DTChooseAccountWidget r0 = r15.c()
            r0.f()
        L_0x00fa:
            android.view.View r0 = r15.a()
            if (r0 == 0) goto L_0x0111
            java.lang.String r1 = "page_setting"
            com.ss.android.ugc.aweme.main.e r2 = r7.i
            if (r2 == 0) goto L_0x010a
            java.lang.String r10 = r2.b()
        L_0x010a:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r10)
            r0.setClickable(r1)
        L_0x0111:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r7.O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment.onPageSelected(int):void");
    }

    public final void a(boolean z2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3772a, false, 67304, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3772a, false, 67304, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.main.e eVar = this.i;
        if (eVar != null) {
            str = eVar.b();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual((Object) "page_setting", (Object) str)) {
            com.ss.android.ugc.aweme.main.e eVar2 = this.i;
            if (eVar2 == null || !eVar2.h()) {
                com.ss.android.ugc.aweme.main.e eVar3 = this.i;
                if (eVar3 != null) {
                    eVar3.a(Boolean.valueOf(z2));
                }
            } else {
                ViewGroup viewGroup = this.f3776e;
                if (viewGroup != null) {
                    viewGroup.post(new h(this, z2));
                }
            }
        }
    }

    public final void onClick(@Nullable View view) {
        Object obj;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{view}, this, f3772a, false, 67300, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3772a, false, 67300, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (!com.ss.android.ugc.aweme.c.a.a.a(view, 500)) {
            this.J = true;
            if (Intrinsics.areEqual((Object) view, (Object) this.u)) {
                if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67324, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67324, new Class[0], Void.TYPE);
                } else {
                    if (com.ss.android.ugc.aweme.g.a.a()) {
                        com.ss.android.ugc.aweme.ag.h.a().a((Activity) getActivity(), "aweme://test_setting");
                        FragmentActivity activity = getActivity();
                        if (activity != null) {
                            activity.overridePendingTransition(C0906R.anim.d0, C0906R.anim.d9);
                        }
                    }
                }
            } else if (Intrinsics.areEqual((Object) view, (Object) this.f3774c)) {
                if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67322, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67322, new Class[0], Void.TYPE);
                } else {
                    CommonItemView commonItemView = this.f3774c;
                    if (commonItemView != null && commonItemView.f20330d) {
                        CommonItemView commonItemView2 = this.f3774c;
                        if (commonItemView2 != null) {
                            commonItemView2.b();
                        }
                        SharePrefCache inst = SharePrefCache.inst();
                        Intrinsics.checkExpressionValueIsNotNull(inst, "SharePrefCache.inst()");
                        an<Boolean> showMiniAppFreshGuideNotify = inst.getShowMiniAppFreshGuideNotify();
                        Intrinsics.checkExpressionValueIsNotNull(showMiniAppFreshGuideNotify, "SharePrefCache.inst().showMiniAppFreshGuideNotify");
                        showMiniAppFreshGuideNotify.a(Boolean.FALSE);
                    }
                    r.a("click_mp_entrance", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").a("scene_id", "1001").f34114b);
                    Class<? extends Activity> microAppActivity = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).microAppActivity();
                    if (microAppActivity != null) {
                        Intent intent = new Intent(getActivity(), microAppActivity);
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            activity2.startActivity(intent);
                        }
                        FragmentActivity activity3 = getActivity();
                        if (activity3 != null) {
                            activity3.overridePendingTransition(C0906R.anim.d0, C0906R.anim.d9);
                        }
                    }
                }
            } else if (Intrinsics.areEqual((Object) view, (Object) this.p)) {
                g();
            } else {
                ArrayList<Aweme> arrayList = null;
                if (Intrinsics.areEqual((Object) view, (Object) this.q)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67325, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67325, new Class[0], Void.TYPE);
                    } else {
                        r.a("click_share_person", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").a("scene_id", "1001").f34114b);
                        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                        User curUser = a2.getCurUser();
                        if (curUser != null) {
                            Activity activity4 = getActivity();
                            com.ss.android.ugc.aweme.main.e eVar = this.i;
                            if (eVar != null) {
                                AwemeListFragment g2 = eVar.g();
                                if (g2 != null) {
                                    arrayList = g2.D();
                                }
                            }
                            x.a(activity4, curUser, arrayList);
                        }
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.v)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67328, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67328, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.common.lib.a.a(getActivity(), "set", "personal_homepage");
                        r.a("enter_setting_page", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("previous_page", "personal_homepage").a("enter_method", "click_button").f34114b);
                        Object service = ServiceManager.get().getService(IBridgeService.class);
                        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…ridgeService::class.java)");
                        Intent intent2 = new Intent(getActivity(), ((IBridgeService) service).getSettingActivityClass());
                        FragmentActivity activity5 = getActivity();
                        if (activity5 != null) {
                            activity5.startActivity(intent2);
                        }
                        FragmentActivity activity6 = getActivity();
                        if (activity6 != null) {
                            activity6.overridePendingTransition(C0906R.anim.d0, C0906R.anim.d9);
                        }
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.w)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67329, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67329, new Class[0], Void.TYPE);
                    } else {
                        String a3 = com.ss.android.ugc.aweme.i.a.a();
                        Map of = MapBuilder.of(PushConstants.TITLE, getString(C0906R.string.a8i));
                        Intrinsics.checkExpressionValueIsNotNull(of, "MapBuilder.of(CrossPlatf…ng.e_platform_lite_link))");
                        com.ss.android.ugc.aweme.commerce.a.a(a3, of, getContext());
                        FragmentActivity activity7 = getActivity();
                        if (activity7 != null) {
                            activity7.overridePendingTransition(C0906R.anim.d0, C0906R.anim.d9);
                        }
                        r.a("enter_eplatform", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.r)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67320, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67320, new Class[0], Void.TYPE);
                    } else {
                        r.a("wallet_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").f34114b);
                        com.ss.android.ugc.aweme.story.live.b.a("navigation_panel");
                        com.ss.android.ugc.aweme.sec.a.a("withdraw_money");
                        if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                        } else {
                            if (!com.ss.android.g.a.a()) {
                                com.ss.android.ugc.aweme.ag.h.a().a((Activity) getActivity(), "aweme://wallet_index");
                            } else {
                                com.ss.android.ugc.aweme.wallet.a.a(getActivity(), "page_index");
                            }
                            r.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
                            FragmentActivity activity8 = getActivity();
                            if (activity8 != null) {
                                activity8.overridePendingTransition(C0906R.anim.d0, C0906R.anim.d9);
                            }
                        }
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.s)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67321, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67321, new Class[0], Void.TYPE);
                    } else {
                        SharePrefCache inst2 = SharePrefCache.inst();
                        Intrinsics.checkExpressionValueIsNotNull(inst2, "SharePrefCache.inst()");
                        an<Integer> syncTT = inst2.getSyncTT();
                        Intrinsics.checkExpressionValueIsNotNull(syncTT, "SharePrefCache.inst().syncTT");
                        Integer num = (Integer) syncTT.c();
                        SharePrefCache inst3 = SharePrefCache.inst();
                        Intrinsics.checkExpressionValueIsNotNull(inst3, "SharePrefCache.inst()");
                        an<String> syncToTTUrl = inst3.getSyncToTTUrl();
                        Intrinsics.checkExpressionValueIsNotNull(syncToTTUrl, "SharePrefCache.inst().syncToTTUrl");
                        String str = (String) syncToTTUrl.c();
                        if (num != null && num.intValue() == 1) {
                            Intent intent3 = new Intent(getActivity(), CrossPlatformActivity.class);
                            r.onEvent(MobClick.obtain().setEventName("fans_power_click").setLabelName("personal_homepage"));
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("show_load_dialog", true);
                            intent3.putExtras(bundle);
                            intent3.setData(Uri.parse(str));
                            intent3.putExtra("hide_nav_bar", true);
                            intent3.putExtra("hide_status_bar", true);
                            FragmentActivity activity9 = getActivity();
                            if (activity9 != null) {
                                activity9.startActivity(intent3);
                            }
                            FragmentActivity activity10 = getActivity();
                            if (activity10 != null) {
                                activity10.overridePendingTransition(C0906R.anim.d0, C0906R.anim.d9);
                            }
                        }
                        r.a("fans_plus", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "personal_homepage").a("enter_method", "click_navigation").f34114b);
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.B)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67311, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67311, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.app.d.d a4 = com.ss.android.ugc.aweme.app.d.d.a();
                        a4.a("enter_from", "navigation_panel");
                        CommonItemView commonItemView3 = this.B;
                        if (commonItemView3 != null && commonItemView3.f20330d) {
                            a4.a("notice_type", "yellow_dot");
                        }
                        r.a("enter_card_bag", (Map) a4.f34114b);
                        CommonItemView commonItemView4 = this.B;
                        if (commonItemView4 != null) {
                            commonItemView4.b();
                        }
                        Intent intent4 = new Intent(getActivity(), CouponListActivity.class);
                        intent4.putExtra("is_coupon_valid", true);
                        startActivity(intent4);
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.C)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67310, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67310, new Class[0], Void.TYPE);
                    } else {
                        try {
                            com.ss.android.ugc.aweme.global.config.settings.pojo.a b2 = com.ss.android.ugc.aweme.global.config.settings.g.b();
                            Intrinsics.checkExpressionValueIsNotNull(b2, "SettingsReader.get()");
                            PoiSetting aq = b2.aq();
                            Intrinsics.checkExpressionValueIsNotNull(aq, "SettingsReader.get().poiSetting");
                            String merchantManagementUrl = aq.getMerchantManagementUrl();
                            r.a("click_im_seller", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").f34114b);
                            CommonItemView commonItemView5 = this.C;
                            if (commonItemView5 != null) {
                                commonItemView5.b();
                            }
                            PoiMerchantApi.a();
                            if (merchantManagementUrl == null) {
                                Intrinsics.throwNpe();
                            }
                            String uri = com.ss.android.ugc.aweme.music.util.f.a(merchantManagementUrl).a("enter_from", "navigation_panel").a().toString();
                            Intrinsics.checkExpressionValueIsNotNull(uri, "SchemeHelper.parseRnSche…      .build().toString()");
                            com.ss.android.ugc.aweme.ag.h.a().a(uri);
                        } catch (com.bytedance.ies.a unused) {
                        }
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.t)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67323, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67323, new Class[0], Void.TYPE);
                    } else {
                        IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
                        if (iMiniAppService != null) {
                            iMiniAppService.openMircoAppList(getActivity());
                        }
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.A)) {
                    g();
                } else if (Intrinsics.areEqual((Object) view, (Object) this.f3777f)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67308, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67308, new Class[0], Void.TYPE);
                    } else {
                        r.a("enter_shopping_assistant_page", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").f34114b);
                        EffectiveSettingItem effectiveSettingItem = this.f3777f;
                        if (effectiveSettingItem != null) {
                            obj = effectiveSettingItem.getTag();
                        } else {
                            obj = null;
                        }
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        if (TextUtils.isEmpty((String) obj)) {
                            b(true);
                        } else {
                            b();
                        }
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.E)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67305, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67305, new Class[0], Void.TYPE);
                    } else {
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openDouPlus(getActivity());
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.g)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67306, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67306, new Class[0], Void.TYPE);
                    } else {
                        r.a("click_ringtone_service", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").f34114b);
                        com.ss.android.ugc.aweme.ag.h a5 = com.ss.android.ugc.aweme.ag.h.a();
                        SharePrefCache inst4 = SharePrefCache.inst();
                        Intrinsics.checkExpressionValueIsNotNull(inst4, "SharePrefCache.inst()");
                        an<String> musicRingtoneScheme = inst4.getMusicRingtoneScheme();
                        Intrinsics.checkExpressionValueIsNotNull(musicRingtoneScheme, "SharePrefCache.inst().musicRingtoneScheme");
                        a5.a((String) musicRingtoneScheme.c());
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.F)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67307, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67307, new Class[0], Void.TYPE);
                    } else {
                        r.onEvent(MobClick.obtain().setEventName("enter_phone_card_apply").setLabelName("more_setting"));
                        r.a("enter_data_free_plan", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "settings_page").f34114b);
                        com.ss.android.ugc.aweme.freeflowcard.b a6 = com.ss.android.ugc.aweme.freeflowcard.b.a();
                        Intrinsics.checkExpressionValueIsNotNull(a6, "FlowCardDataManager.getInstance()");
                        String d2 = a6.d();
                        CharSequence charSequence = d2;
                        if (charSequence == null || charSequence.length() == 0) {
                            z2 = true;
                        }
                        if (!(!z2)) {
                            d2 = null;
                        }
                        if (d2 != null) {
                            com.ss.android.ugc.aweme.ag.h.a().a(d2);
                        }
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.D)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67318, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67318, new Class[0], Void.TYPE);
                    } else {
                        r.a("life_service_order", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").f34114b);
                        com.ss.android.ugc.aweme.ag.h.a().a("aweme://webview/?url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Frn%2Fservice_order%3Fhide_nav_bar%3D1%26enter_from%3Dwallet&hide_nav_bar=1&enter_from=wallet&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fchannel_name%3Drn_patch%26bundle_name%3Dbusiness%26module_name%3Dpage_service_order%26force_h5%3D0%26bg_theme%3D%2523112233%26hide_nav_bar%3D1%26pop_gesture_enable%3D1");
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.P)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67312, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67312, new Class[0], Void.TYPE);
                    } else {
                        r.a("enter_wellbeing", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").f34114b);
                        ParentalPlatformManager.a((Activity) getActivity());
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.x)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67319, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67319, new Class[0], Void.TYPE);
                    } else {
                        com.ss.android.ugc.aweme.commerce.service.h.a a7 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(getActivity());
                        User curUser2 = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                        if (!(a7 == null || curUser2 == null || TextUtils.isEmpty(curUser2.getUid()))) {
                            com.ss.android.ugc.aweme.commerce.service.h.b bVar = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b;
                            String uid = curUser2.getUid();
                            Intrinsics.checkExpressionValueIsNotNull(uid, "curUser.uid");
                            bVar.b(a7, uid, false);
                        }
                        CommonItemView commonItemView6 = this.x;
                        if (commonItemView6 != null) {
                            commonItemView6.b();
                        }
                        String str2 = "";
                        try {
                            com.ss.android.ugc.aweme.global.config.settings.pojo.a b3 = com.ss.android.ugc.aweme.global.config.settings.g.b();
                            Intrinsics.checkExpressionValueIsNotNull(b3, "SettingsReader.get()");
                            DouyinOrderSetting bg = b3.bg();
                            Intrinsics.checkExpressionValueIsNotNull(bg, "SettingsReader.get().douyinOrder");
                            String schema = bg.getSchema();
                            Intrinsics.checkExpressionValueIsNotNull(schema, "SettingsReader.get().douyinOrder.schema");
                            str2 = schema;
                        } catch (Exception unused2) {
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "aweme://webview/?url=https://aweme.snssdk.com/falcon/rn/order_collector?hide_nav_bar=1&bg_theme=161823&enter_from=order_entrance&hide_nav_bar=1&bg_theme=161823&enter_from=order_entrance";
                        }
                        com.ss.android.ugc.aweme.commerce.a.a(str2, (Map<String, String>) new HashMap<String,String>(), (Context) getActivity());
                        ai aiVar = new ai();
                        aiVar.f38070f = "navigation_panel";
                        aiVar.b();
                    }
                } else if (Intrinsics.areEqual((Object) view, (Object) this.y)) {
                    r.a("service_and_order", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").f34114b);
                } else if (Intrinsics.areEqual((Object) view, (Object) this.o)) {
                    if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67317, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67317, new Class[0], Void.TYPE);
                        return;
                    }
                    ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).enterMyFavorites(getActivity());
                    r.a("enter_personal_favourite", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "navigation_panel").a("enter_method", "click_button").a("scene_id", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST).f34114b);
                    if (com.ss.android.ugc.aweme.favorites.d.b.a()) {
                        SharePrefCache inst5 = SharePrefCache.inst();
                        Intrinsics.checkExpressionValueIsNotNull(inst5, "SharePrefCache.inst()");
                        an<Boolean> shouldShowFavouriteTip = inst5.getShouldShowFavouriteTip();
                        Intrinsics.checkExpressionValueIsNotNull(shouldShowFavouriteTip, "SharePrefCache.inst().shouldShowFavouriteTip");
                        shouldShowFavouriteTip.a(Boolean.FALSE);
                    }
                    CommonItemView commonItemView7 = this.o;
                    if (commonItemView7 != null) {
                        commonItemView7.b();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.view.View r20, android.view.View... r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f3772a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r8[r10] = r4
            java.lang.Class<android.view.View[]> r4 = android.view.View[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 67297(0x106e1, float:9.4303E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f3772a
            r15 = 0
            r16 = 67297(0x106e1, float:9.4303E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r10] = r1
            java.lang.Class<android.view.View[]> r1 = android.view.View[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            int r2 = r1.length
            r3 = 0
        L_0x0049:
            r4 = 8
            if (r3 >= r2) goto L_0x0061
            r5 = r1[r3]
            if (r5 == 0) goto L_0x0055
            int r4 = r5.getVisibility()
        L_0x0055:
            if (r4 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x005d
            r0.setVisibility(r10)
            return
        L_0x005d:
            return
        L_0x005e:
            int r3 = r3 + 1
            goto L_0x0049
        L_0x0061:
            if (r0 == 0) goto L_0x0067
            r0.setVisibility(r4)
            return
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.SlideSettingPageFragment.a(android.view.View, android.view.View[]):void");
    }

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f3772a, false, 67303, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3772a, false, 67303, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            View view = getView();
            if (view != null) {
                view.postDelayed(new f(this, z3), 1000);
            }
        } else {
            a(z3);
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        ViewGroup viewGroup;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3772a, false, 67282, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3772a, false, 67282, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67285, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67285, new Class[0], Void.TYPE);
        } else {
            int statusBarHeight = StatusBarUtils.getStatusBarHeight(getActivity());
            Space space = (Space) a((int) C0906R.id.csr);
            Intrinsics.checkExpressionValueIsNotNull(space, "sp_status_bar");
            space.getLayoutParams().height = statusBarHeight;
            if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67293, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67293, new Class[0], Void.TYPE);
            } else {
                if (com.ss.android.g.a.a()) {
                    View inflate = ((ViewStub) getView().findViewById(C0906R.id.dw1)).inflate();
                    if (inflate != null) {
                        viewGroup = (ViewGroup) inflate;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                } else {
                    View inflate2 = ((ViewStub) getView().findViewById(C0906R.id.dvs)).inflate();
                    if (inflate2 != null) {
                        viewGroup = (ViewGroup) inflate2;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                this.f3776e = viewGroup;
                ViewGroup viewGroup2 = this.f3776e;
                if (viewGroup2 == null) {
                    Intrinsics.throwNpe();
                }
                this.o = (CommonItemView) viewGroup2.findViewById(C0906R.id.bp8);
                ViewGroup viewGroup3 = this.f3776e;
                if (viewGroup3 == null) {
                    Intrinsics.throwNpe();
                }
                this.p = (ViewGroup) viewGroup3.findViewById(C0906R.id.bpc);
                ViewGroup viewGroup4 = this.f3776e;
                if (viewGroup4 == null) {
                    Intrinsics.throwNpe();
                }
                this.q = (ViewGroup) viewGroup4.findViewById(C0906R.id.cqc);
                ViewGroup viewGroup5 = this.f3776e;
                if (viewGroup5 == null) {
                    Intrinsics.throwNpe();
                }
                this.r = (ViewGroup) viewGroup5.findViewById(C0906R.id.bpl);
                ViewGroup viewGroup6 = this.f3776e;
                if (viewGroup6 == null) {
                    Intrinsics.throwNpe();
                }
                this.f3774c = (CommonItemView) viewGroup6.findViewById(C0906R.id.cau);
                ViewGroup viewGroup7 = this.f3776e;
                if (viewGroup7 == null) {
                    Intrinsics.throwNpe();
                }
                this.f3775d = (ExpandSettingItem) viewGroup7.findViewById(C0906R.id.bnp);
                ViewGroup viewGroup8 = this.f3776e;
                if (viewGroup8 == null) {
                    Intrinsics.throwNpe();
                }
                this.r = (ViewGroup) viewGroup8.findViewById(C0906R.id.bpl);
                ViewGroup viewGroup9 = this.f3776e;
                if (viewGroup9 == null) {
                    Intrinsics.throwNpe();
                }
                this.v = (ViewGroup) viewGroup9.findViewById(C0906R.id.dra);
                ViewGroup viewGroup10 = this.f3776e;
                if (viewGroup10 == null) {
                    Intrinsics.throwNpe();
                }
                this.w = (ViewGroup) viewGroup10.findViewById(C0906R.id.dr9);
                ViewGroup viewGroup11 = this.f3776e;
                if (viewGroup11 == null) {
                    Intrinsics.throwNpe();
                }
                this.s = (ViewGroup) viewGroup11.findViewById(C0906R.id.acg);
                ViewGroup viewGroup12 = this.f3776e;
                if (viewGroup12 == null) {
                    Intrinsics.throwNpe();
                }
                this.A = (ViewGroup) viewGroup12.findViewById(C0906R.id.dqf);
                ViewGroup viewGroup13 = this.f3776e;
                if (viewGroup13 == null) {
                    Intrinsics.throwNpe();
                }
                this.B = (CommonItemView) viewGroup13.findViewById(C0906R.id.a0m);
                ViewGroup viewGroup14 = this.f3776e;
                if (viewGroup14 == null) {
                    Intrinsics.throwNpe();
                }
                this.C = (CommonItemView) viewGroup14.findViewById(C0906R.id.bmj);
                ViewGroup viewGroup15 = this.f3776e;
                if (viewGroup15 == null) {
                    Intrinsics.throwNpe();
                }
                this.G = viewGroup15.findViewById(C0906R.id.dw9);
                ViewGroup viewGroup16 = this.f3776e;
                if (viewGroup16 == null) {
                    Intrinsics.throwNpe();
                }
                this.H = viewGroup16.findViewById(C0906R.id.dw_);
                ViewGroup viewGroup17 = this.f3776e;
                if (viewGroup17 == null) {
                    Intrinsics.throwNpe();
                }
                this.I = viewGroup17.findViewById(C0906R.id.dwa);
                ViewGroup viewGroup18 = this.f3776e;
                if (viewGroup18 == null) {
                    Intrinsics.throwNpe();
                }
                this.h = viewGroup18.findViewById(C0906R.id.dwc);
                ViewGroup viewGroup19 = this.f3776e;
                if (viewGroup19 == null) {
                    Intrinsics.throwNpe();
                }
                this.P = viewGroup19.findViewById(C0906R.id.czz);
                ViewGroup viewGroup20 = this.f3776e;
                if (viewGroup20 == null) {
                    Intrinsics.throwNpe();
                }
                this.Q = (TextView) viewGroup20.findViewById(C0906R.id.c8a);
                ViewGroup viewGroup21 = this.f3776e;
                if (viewGroup21 == null) {
                    Intrinsics.throwNpe();
                }
                this.x = (CommonItemView) viewGroup21.findViewById(C0906R.id.bv_);
                ViewGroup viewGroup22 = this.f3776e;
                if (viewGroup22 == null) {
                    Intrinsics.throwNpe();
                }
                this.y = (ExpandSettingItem) viewGroup22.findViewById(C0906R.id.co4);
                ViewGroup viewGroup23 = this.f3776e;
                if (viewGroup23 == null) {
                    Intrinsics.throwNpe();
                }
                this.z = (ViewGroup) viewGroup23.findViewById(C0906R.id.biq);
                ViewGroup viewGroup24 = this.f3776e;
                if (viewGroup24 == null) {
                    Intrinsics.throwNpe();
                }
                this.f3777f = (EffectiveSettingItem) viewGroup24.findViewById(C0906R.id.cqw);
                ViewGroup viewGroup25 = this.f3776e;
                if (viewGroup25 == null) {
                    Intrinsics.throwNpe();
                }
                this.D = (ViewGroup) viewGroup25.findViewById(C0906R.id.bva);
                ViewGroup viewGroup26 = this.f3776e;
                if (viewGroup26 == null) {
                    Intrinsics.throwNpe();
                }
                this.E = (ViewGroup) viewGroup26.findViewById(C0906R.id.a6c);
                ViewGroup viewGroup27 = this.f3776e;
                if (viewGroup27 == null) {
                    Intrinsics.throwNpe();
                }
                this.g = (ViewGroup) viewGroup27.findViewById(C0906R.id.cf4);
                ViewGroup viewGroup28 = this.f3776e;
                if (viewGroup28 == null) {
                    Intrinsics.throwNpe();
                }
                this.F = (ViewGroup) viewGroup28.findViewById(C0906R.id.ain);
                ExpandSettingItem expandSettingItem = this.y;
                if (expandSettingItem != null) {
                    expandSettingItem.a((View) this.z, this.H);
                }
                this.t = (CommonItemView) a((int) C0906R.id.dr_);
                this.u = (CommonItemView) a((int) C0906R.id.bv3);
                ViewGroup viewGroup29 = this.f3776e;
                if (viewGroup29 == null) {
                    Intrinsics.throwNpe();
                }
                this.k = (RecyclerView) viewGroup29.findViewById(C0906R.id.bmz);
            }
            if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67289, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67289, new Class[0], Void.TYPE);
            } else {
                CommonItemView commonItemView = this.o;
                if (commonItemView != null) {
                    commonItemView.setOnClickListener(this);
                }
                ViewGroup viewGroup30 = this.q;
                if (viewGroup30 != null) {
                    viewGroup30.setOnClickListener(this);
                }
                CommonItemView commonItemView2 = this.f3774c;
                if (commonItemView2 != null) {
                    commonItemView2.setOnClickListener(this);
                }
                CommonItemView commonItemView3 = this.t;
                if (commonItemView3 != null) {
                    commonItemView3.setOnClickListener(this);
                }
                ViewGroup viewGroup31 = this.p;
                if (viewGroup31 != null) {
                    viewGroup31.setOnClickListener(this);
                }
                ViewGroup viewGroup32 = this.q;
                if (viewGroup32 != null) {
                    viewGroup32.setOnClickListener(this);
                }
                ViewGroup viewGroup33 = this.r;
                if (viewGroup33 != null) {
                    viewGroup33.setOnClickListener(this);
                }
                ViewGroup viewGroup34 = this.v;
                if (viewGroup34 != null) {
                    viewGroup34.setOnClickListener(this);
                }
                ViewGroup viewGroup35 = this.w;
                if (viewGroup35 != null) {
                    viewGroup35.setOnClickListener(this);
                }
                CommonItemView commonItemView4 = this.u;
                if (commonItemView4 != null) {
                    commonItemView4.setOnClickListener(this);
                }
                ViewGroup viewGroup36 = this.s;
                if (viewGroup36 != null) {
                    viewGroup36.setOnClickListener(this);
                }
                ViewGroup viewGroup37 = this.A;
                if (viewGroup37 != null) {
                    viewGroup37.setOnClickListener(this);
                }
                ViewGroup viewGroup38 = this.E;
                if (viewGroup38 != null) {
                    viewGroup38.setOnClickListener(this);
                }
                ViewGroup viewGroup39 = this.g;
                if (viewGroup39 != null) {
                    viewGroup39.setOnClickListener(this);
                }
                ViewGroup viewGroup40 = this.F;
                if (viewGroup40 != null) {
                    viewGroup40.setOnClickListener(this);
                }
                ViewGroup viewGroup41 = this.D;
                if (viewGroup41 != null) {
                    viewGroup41.setOnClickListener(this);
                }
                CommonItemView commonItemView5 = this.B;
                if (commonItemView5 != null) {
                    commonItemView5.setOnClickListener(this);
                }
                CommonItemView commonItemView6 = this.C;
                if (commonItemView6 != null) {
                    commonItemView6.setOnClickListener(this);
                }
                View view2 = this.P;
                if (view2 != null) {
                    view2.setOnClickListener(this);
                }
                CommonItemView commonItemView7 = this.x;
                if (commonItemView7 != null) {
                    commonItemView7.setOnClickListener(this);
                }
                ExpandSettingItem expandSettingItem2 = this.y;
                if (expandSettingItem2 != null) {
                    expandSettingItem2.setOnClickListener(this);
                }
                ExpandSettingItem expandSettingItem3 = this.y;
                if (expandSettingItem3 != null) {
                    expandSettingItem3.setOnExpandListener(new a(this));
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67286, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67286, new Class[0], Void.TYPE);
            } else {
                CommonItemView commonItemView8 = this.t;
                if (commonItemView8 != null) {
                    if (com.ss.android.ugc.aweme.g.a.a()) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    commonItemView8.setVisibility(i4);
                }
                ViewGroup viewGroup42 = this.p;
                if (viewGroup42 != null) {
                    if (!com.ss.android.g.a.a()) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    viewGroup42.setVisibility(i3);
                }
                d();
            }
            e();
            if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67292, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67292, new Class[0], Void.TYPE);
            } else {
                CommonItemView commonItemView9 = this.u;
                if (commonItemView9 != null) {
                    commonItemView9.setLeftText("Debug Test");
                }
                CommonItemView commonItemView10 = this.u;
                if (commonItemView10 != null) {
                    if (com.ss.android.ugc.aweme.g.a.a()) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    commonItemView10.setVisibility(i2);
                }
            }
            if (com.ss.android.g.a.a()) {
                if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67290, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67290, new Class[0], Void.TYPE);
                } else {
                    a(this.G, this.r, this.f3774c);
                    a(this.H, this.s);
                    a(this.I, this.v);
                    c().e();
                }
            }
            if (AbTestManager.a().aV()) {
                CommonItemView commonItemView11 = this.o;
                if (commonItemView11 != null) {
                    commonItemView11.setVisibility(8);
                }
            } else {
                CommonItemView commonItemView12 = this.o;
                if (commonItemView12 != null) {
                    commonItemView12.setVisibility(0);
                }
                if (com.ss.android.ugc.aweme.favorites.d.b.a()) {
                    CommonItemView commonItemView13 = this.o;
                    if (commonItemView13 != null) {
                        commonItemView13.a();
                    }
                } else {
                    CommonItemView commonItemView14 = this.o;
                    if (commonItemView14 != null) {
                        commonItemView14.b();
                    }
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67298, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67298, new Class[0], Void.TYPE);
            } else {
                ViewGroup viewGroup43 = this.E;
                if (!(viewGroup43 instanceof SettingItem)) {
                    viewGroup43 = null;
                }
                SettingItem settingItem = (SettingItem) viewGroup43;
                if (settingItem != null) {
                    String a2 = DouplusTitleHelper.a(3, null);
                    if (a2 != null) {
                        settingItem.setStartText(a2);
                    }
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f3772a, false, 67294, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3772a, false, 67294, new Class[0], Void.TYPE);
            } else {
                AbTestManager a3 = AbTestManager.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AbTestManager.getInstance()");
                if (a3.cd() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (f() && z2) {
                    ExpandSettingItem expandSettingItem4 = this.f3775d;
                    if (expandSettingItem4 != null) {
                        expandSettingItem4.setVisibility(0);
                    }
                    SlideSettingPageFragment$initMicroListAdapter$layoutManager$1 slideSettingPageFragment$initMicroListAdapter$layoutManager$1 = new SlideSettingPageFragment$initMicroListAdapter$layoutManager$1(this, getContext(), 1, false);
                    RecyclerView recyclerView = this.k;
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(slideSettingPageFragment$initMicroListAdapter$layoutManager$1);
                    }
                    this.l = new RecentlyMicroAppListAdapter(1);
                    RecyclerView recyclerView2 = this.k;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(this.l);
                    }
                    RecyclerView recyclerView3 = this.k;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(0);
                    }
                    View view3 = this.h;
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                    ExpandSettingItem expandSettingItem5 = this.f3775d;
                    if (expandSettingItem5 != null) {
                        expandSettingItem5.a((View) this.k, this.h);
                    }
                }
            }
        }
        this.M = new aa();
        Context context = getContext();
        if (context == null) {
            Intrinsics.throwNpe();
        }
        this.K = UIUtils.dip2Px(context, 250.0f);
        this.i = com.ss.android.ugc.aweme.main.base.d.a(getActivity());
        if (!isHidden()) {
            com.ss.android.ugc.aweme.main.e eVar = this.i;
            if (eVar != null) {
                eVar.a((ViewPager.OnPageChangeListener) this);
            }
        }
        b(false);
        EffectiveSettingItem effectiveSettingItem = this.f3777f;
        if (effectiveSettingItem != null) {
            effectiveSettingItem.setOnSettingItemClickListener(this);
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3772a, false, 67281, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3772a, false, 67281, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        this.L = a2.getCurUser();
        return layoutInflater2.inflate(C0906R.layout.qd, viewGroup2, false);
    }

    public final void onPageScrolled(int i2, float f2, int i3) {
        int i4;
        int i5 = i2;
        int i6 = 1;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f3772a, false, 67313, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f3772a, false, 67313, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.main.e eVar = this.i;
        if (eVar != null) {
            i4 = eVar.a("page_home");
        } else {
            i4 = 1;
        }
        if (i5 != i4) {
            com.ss.android.ugc.aweme.main.e eVar2 = this.i;
            if (eVar2 != null) {
                i6 = eVar2.a("page_setting");
            }
            if (i5 != i6) {
                com.ss.android.ugc.aweme.main.e eVar3 = this.i;
                if (eVar3 != null) {
                    eVar3.a(Boolean.FALSE);
                    return;
                }
                return;
            }
        }
        float f3 = (((float) i3) / this.K) * 0.34f;
        View a2 = a();
        if (a2 != null) {
            a2.setAlpha(f3);
        }
    }
}
