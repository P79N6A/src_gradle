package com.ss.android.ugc.aweme.commerce.service;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import com.ss.android.ugc.aweme.ag.d;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.c;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.commerce.service.models.m;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001IJ<\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u000fH&J\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J*\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u001d\u001a\u00020\u0003H&J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H&J:\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010\u00072\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030-H&J:\u0010.\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0007H&Jd\u00103\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u00072\b\u00104\u001a\u0004\u0018\u00010%2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u00105\u001a\u0004\u0018\u00010\u00072\b\u00106\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u00010\u0007H'J\u0010\u00109\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010:\u001a\u00020\u00032\u0006\u0010;\u001a\u00020<H'J6\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010@\u001a\u0004\u0018\u00010A2\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fH&J \u0010C\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H&J2\u0010D\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010E\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010G\u001a\u0004\u0018\u00010HH&¨\u0006J"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/ICommerceService;", "", "checkLoginAndLawHint", "", "context", "Landroid/content/Context;", "enterFrom", "", "enterMethod", "promotionSource", "", "callback", "Lkotlin/Function0;", "fetchCommerceRights", "generateRegisterRouter", "Lcom/ss/android/ugc/aweme/router/IRouter;", "goBindTaobao", "schema", "gotoGoodShop", "goodsShopIntentData", "Lcom/ss/android/ugc/aweme/commerce/service/models/PortfolioParams;", "enterMethodForAuth", "entranceLocation", "initCommerce", "configs", "Lcom/ss/android/ugc/aweme/commerce/service/configs/CommerceConfigs;", "environment", "Lcom/ss/android/ugc/aweme/commerce/service/env/ICommerceProxy;", "launchPayTest", "onCommerceCardRelease", "onReceiveFeedPromotionSuccess", "", "ownerUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "awemeId", "promotionList", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/DetailPromotion;", "openApp", "promotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "fromAct", "Landroid/app/Activity;", "url", "jumpAppSuccess", "Lkotlin/Function1;", "openPortfolioAccordingToAB", "userInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "triggerAwemeId", "referFrom", "openTaobao", "good", "uid", "carrierType", "withLog", "sourcePage", "shouldNeedGuideFootprint", "showFullPreview", "previewParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "showSkuPanelGoodsDialogFromFeedCard", "Landroid/support/v4/app/DialogFragment;", "promotionId", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "dialogDismissListener", "startAppByUrl", "tryCheckRealName", "verifyStatus", "", "vcb", "Lcom/ss/android/ugc/aweme/commerce/service/callbacks/AuthCB;", "Add2WillDialogListener", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public interface ICommerceService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/ICommerceService$Add2WillDialogListener;", "", "onDimiss", "", "onShow", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public interface a {
    }

    void checkLoginAndLawHint(@Nullable Context context, @Nullable String str, @Nullable String str2, long j, @NotNull Function0<Unit> function0);

    void fetchCommerceRights();

    @NotNull
    d generateRegisterRouter();

    void goBindTaobao(@NotNull String str, @Nullable Context context);

    void gotoGoodShop(@Nullable m mVar, @NotNull String str, @NotNull String str2, @NotNull String str3);

    void initCommerce(@NotNull Context context, @NotNull com.ss.android.ugc.aweme.commerce.service.b.a aVar, @NotNull com.ss.android.ugc.aweme.commerce.service.e.a aVar2);

    void launchPayTest(@NotNull Context context);

    void onCommerceCardRelease();

    boolean onReceiveFeedPromotionSuccess(@NotNull User user, @NotNull String str, @Nullable List<h> list);

    void openApp(@Nullable c cVar, @Nullable Activity activity, @Nullable String str, @NotNull Function1<? super Boolean, Unit> function1);

    void openPortfolioAccordingToAB(@NotNull Activity activity, @NotNull CommerceUser commerceUser, @Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4);

    @SuppressLint({"TooManyMethodParam"})
    void openTaobao(@NotNull Activity activity, @Nullable String str, @Nullable h hVar, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull String str6, boolean z, @Nullable String str7);

    boolean shouldNeedGuideFootprint(@NotNull Context context);

    @SuppressLint({"TooManyMethodParam"})
    void showFullPreview(@NotNull n nVar);

    @NotNull
    DialogFragment showSkuPanelGoodsDialogFromFeedCard(@Nullable String str, @Nullable String str2, @Nullable FragmentManager fragmentManager, @Nullable Function0<Unit> function0);

    void startAppByUrl(@NotNull Context context, @NotNull String str, @NotNull String str2);

    void tryCheckRealName(@NotNull Context context, int i, @NotNull String str, @NotNull String str2, @Nullable com.ss.android.ugc.aweme.commerce.service.a.a aVar);
}
