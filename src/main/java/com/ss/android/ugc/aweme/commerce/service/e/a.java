package com.ss.android.ugc.aweme.commerce.service.e;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.ak;
import com.ss.android.ugc.aweme.commerce.service.models.n;
import com.ss.android.ugc.aweme.commerce.service.widgets.PriceView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JS\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00070\u0011H&J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0001\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u00122\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011H'J\b\u0010.\u001a\u00020\u0012H&J\f\u0010/\u001a\u0006\u0012\u0002\b\u000300H&J\b\u00101\u001a\u000202H&J\f\u00103\u001a\u0006\u0012\u0002\b\u000300H&J\n\u00104\u001a\u0004\u0018\u000105H&J\n\u00106\u001a\u0004\u0018\u000107H&J\b\u00108\u001a\u00020\u0012H&J\b\u00109\u001a\u00020\u0007H&J$\u0010:\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010;\u001a\u0004\u0018\u00010\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u000bH&J\u0018\u0010=\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u000bH&J \u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000bH&J \u0010D\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000bH&J0\u0010F\u001a\u00020\u00072\b\u0010G\u001a\u0004\u0018\u00010\u000b2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0I2\b\u0010\b\u001a\u0004\u0018\u00010\tH&J.\u0010J\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010K\u001a\u0004\u0018\u00010\u000b2\b\u0010L\u001a\u0004\u0018\u00010\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u000bH&J(\u0010M\u001a\u00020\u00072\b\u0010N\u001a\u0004\u0018\u00010\u000b2\u0014\u0010O\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010P\u0012\u0004\u0012\u00020\u00070\u0011H&JV\u0010Q\u001a\u00020\u00072\u0006\u0010R\u001a\u00020S2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u000b2\b\u0010U\u001a\u0004\u0018\u00010\u000b2\b\u0010V\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u000b2\b\u0010X\u001a\u0004\u0018\u00010\u000bH&JB\u0010Y\u001a\u00020\u00072\u0006\u0010R\u001a\u00020S2\b\u0010N\u001a\u0004\u0018\u00010\u000b2\b\u0010Z\u001a\u0004\u0018\u00010\u000b2\b\u0010[\u001a\u0004\u0018\u00010\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u000b2\b\u0010X\u001a\u0004\u0018\u00010\u000bH&J`\u0010\\\u001a\u00020\u00072\u0006\u0010R\u001a\u00020S2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010T\u001a\u0004\u0018\u00010\u000b2\b\u0010U\u001a\u0004\u0018\u00010\u000b2\b\u0010V\u001a\u0004\u0018\u00010\u000b2\b\u0010W\u001a\u0004\u0018\u00010\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u000b2\b\u0010X\u001a\u0004\u0018\u00010\u000b2\b\u0010]\u001a\u0004\u0018\u00010\u000bH&J\u0010\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020`H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006a"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/env/ICommerceProxy;", "", "currentUser", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "getCurrentUser", "()Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "appointPromotion", "", "context", "Landroid/content/Context;", "promotionId", "", "awemeId", "authorId", "type", "", "onResult", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "bindPhone", "bindSkuLogic", "Lcom/ss/android/ugc/aweme/commerce/service/sku/SkuLogic;", "avatar", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "popPriceView", "Lcom/ss/android/ugc/aweme/commerce/service/widgets/PriceView;", "titleView", "Landroid/widget/TextView;", "preSaleView", "skuLayout", "Landroid/widget/LinearLayout;", "skuBox", "noStockHintLayout", "Landroid/view/View;", "minusBtn", "plusBtn", "selectCount", "userLimitTxt", "skuInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "defaultPrice", "buySingleOnly", "shouldChangeStatus", "enableLawWindow", "getBrowserClass", "Ljava/lang/Class;", "getCommerceSettings", "Lcom/ss/android/ugc/aweme/commerce/service/configs/CommerceSettings;", "getPortfolioClass", "getShoppingDesc", "Lcom/ss/android/ugc/aweme/commerce/service/setting/ShoppingDesc;", "getTopFeedPromotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/SimplePromotion;", "isUserLogin", "onCommerceMessageReceived", "openAdWebUrl", "url", "title", "openEasyGoByMiniApp", "uri", "openLawHintDialog", "yesListener", "Landroid/view/View$OnClickListener;", "noListener", "content", "openMiniApp", "enterFrom", "openRN", "schema", "options", "", "openSchemaWithH5Fallback", "webUrl", "schemaUrl", "queryUserInfo", "userId", "ucb", "Lcom/ss/android/ugc/aweme/profile/model/User;", "schemaToOrderShare", "fromAct", "Landroid/app/Activity;", "productId", "targetUid", "secTargetUid", "itemId", "enterMethod", "schemaToPortfolio", "secUserId", "entranceLocation", "schemaToSeeding", "playId", "startPreview", "previewParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/PreviewParams;", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public interface a {
    @NotNull
    @SuppressLint({"TooManyMethodParam"})
    com.ss.android.ugc.aweme.commerce.service.k.a a(@NotNull RemoteImageView remoteImageView, @NotNull Context context, @NotNull PriceView priceView, @NotNull TextView textView, @NotNull TextView textView2, @NotNull LinearLayout linearLayout, @NotNull LinearLayout linearLayout2, @NotNull View view, @NotNull View view2, @NotNull View view3, @NotNull TextView textView3, @NotNull TextView textView4, @NotNull ak akVar, @NotNull String str, boolean z, @Nullable Function1<? super Boolean, Unit> function1);

    @NotNull
    Class<?> a();

    void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5);

    void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7);

    void a(@NotNull Activity activity, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8);

    void a(@NotNull Context context);

    void a(@NotNull Context context, @Nullable String str, @Nullable String str2);

    void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull Function1<? super Boolean, Unit> function1);

    void a(@NotNull View.OnClickListener onClickListener, @NotNull View.OnClickListener onClickListener2, @NotNull String str);

    void a(@NotNull n nVar);

    void a(@Nullable String str, @NotNull Map<String, String> map, @Nullable Context context);

    void a(@Nullable String str, @NotNull Function1<? super User, Unit> function1);

    @NotNull
    CommerceUser b();

    @Nullable
    com.ss.android.ugc.aweme.commerce.service.j.a c();

    boolean d();

    boolean e();

    @NotNull
    Class<?> f();
}
