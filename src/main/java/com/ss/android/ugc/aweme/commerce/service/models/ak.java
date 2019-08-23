package com.ss.android.ugc.aweme.commerce.service.models;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0007\u0010¢\u0001\u001a\u000204J\u0007\u0010£\u0001\u001a\u000204J\u0007\u0010¤\u0001\u001a\u000204J\u0007\u0010¥\u0001\u001a\u000204R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 R\u001c\u0010-\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001c\u00100\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001e\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b3\u00105\"\u0004\b6\u00107R\u001a\u00109\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\u001e\u0010?\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b?\u00105\"\u0004\b@\u00107R\u001a\u0010A\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R\u001a\u0010C\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010:\"\u0004\bD\u0010<R\u001a\u0010E\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010:\"\u0004\bF\u0010<R\u001e\u0010G\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\bG\u00105\"\u0004\bH\u00107R\u001c\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR\u001c\u0010X\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\f\"\u0004\bZ\u0010\u000eR\u001c\u0010[\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\f\"\u0004\b]\u0010\u000eR\u001c\u0010^\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\f\"\u0004\b`\u0010\u000eR\u001c\u0010a\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\f\"\u0004\bc\u0010\u000eR\u001c\u0010d\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\f\"\u0004\bf\u0010\u000eR\u001c\u0010g\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\f\"\u0004\bi\u0010\u000eR(\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010kX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001c\u0010p\u001a\u0004\u0018\u00010qX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020PX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010R\"\u0004\bx\u0010TR\u001c\u0010y\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\f\"\u0004\b{\u0010\u000eR \u0010|\u001a\u0004\u0018\u00010PX\u000e¢\u0006\u0012\n\u0003\u0010\u0001\u001a\u0004\b}\u0010~\"\u0005\b\u0010\u0001R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\f\"\u0005\b\u0001\u0010\u000eR\"\u0010\u0001\u001a\u0005\u0018\u00010\u0001X\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\f\"\u0005\b\u0001\u0010\u000eR,\u0010\u0001\u001a\u0011\u0012\u0004\u0012\u00020\n\u0012\u0005\u0012\u00030\u0001\u0018\u00010kX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010m\"\u0005\b\u0001\u0010oR\u001d\u0010\u0001\u001a\u00020PX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010R\"\u0005\b\u0001\u0010TR&\u0010\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0001\u0018\u00010\u001cX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\u001e\"\u0005\b\u0001\u0010 R\u001d\u0010\u0001\u001a\u00020PX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010R\"\u0005\b\u0001\u0010TR\u001f\u0010\u0001\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0001\u0010\f\"\u0005\b\u0001\u0010\u000eR!\u0010\u0001\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0012\n\u0002\u00108\u001a\u0005\b \u0001\u00105\"\u0005\b¡\u0001\u00107¨\u0006¦\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/UISkuInfo;", "", "()V", "appointment", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionAppointment;", "getAppointment", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionAppointment;", "setAppointment", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionAppointment;)V", "authorId", "", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "awemeId", "getAwemeId", "setAwemeId", "cartUrl", "getCartUrl", "setCartUrl", "commodityType", "", "getCommodityType", "()J", "setCommodityType", "(J)V", "couponRuleList", "", "getCouponRuleList", "()Ljava/util/List;", "setCouponRuleList", "(Ljava/util/List;)V", "defaultImageUrl", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getDefaultImageUrl", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setDefaultImageUrl", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "enterFrom", "getEnterFrom", "setEnterFrom", "fullReductionList", "getFullReductionList", "setFullReductionList", "h5Url", "getH5Url", "setH5Url", "imUrl", "getImUrl", "setImUrl", "isOverLimit", "", "()Ljava/lang/Boolean;", "setOverLimit", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isPostFree", "()Z", "setPostFree", "(Z)V", "isRequestVirtual", "setRequestVirtual", "isSelf", "setSelf", "isShowCoupon", "setShowCoupon", "isTaobao", "setTaobao", "isUpdatePromotion", "setUpdatePromotion", "isVirtual", "setVirtual", "logParams", "Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;", "getLogParams", "()Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;", "setLogParams", "(Lcom/ss/android/ugc/aweme/commerce/service/models/LogParams;)V", "maxPrice", "", "getMaxPrice", "()I", "setMaxPrice", "(I)V", "minPrice", "getMinPrice", "setMinPrice", "orderMiniAppUrl", "getOrderMiniAppUrl", "setOrderMiniAppUrl", "orderUrl", "getOrderUrl", "setOrderUrl", "originId", "getOriginId", "setOriginId", "originMediaId", "getOriginMediaId", "setOriginMediaId", "originType", "getOriginType", "setOriginType", "originUserId", "getOriginUserId", "setOriginUserId", "pictureMap", "", "getPictureMap", "()Ljava/util/Map;", "setPictureMap", "(Ljava/util/Map;)V", "preSale", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionPreSale;", "getPreSale", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionPreSale;", "setPreSale", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionPreSale;)V", "price", "getPrice", "setPrice", "productId", "getProductId", "setProductId", "productLabel", "getProductLabel", "()Ljava/lang/Integer;", "setProductLabel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "promotionId", "getPromotionId", "setPromotionId", "seckillInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "getSeckillInfo", "()Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "setSeckillInfo", "(Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;)V", "skuJsonString", "getSkuJsonString", "setSkuJsonString", "skuList", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuItem;", "getSkuList", "setSkuList", "specAndCouponLayoutOffset", "getSpecAndCouponLayoutOffset", "setSpecAndCouponLayoutOffset", "specInfoList", "Lcom/ss/android/ugc/aweme/commerce/service/models/SpecInfo;", "getSpecInfoList", "setSpecInfoList", "status", "getStatus", "setStatus", "title", "getTitle", "setTitle", "withCoupon", "getWithCoupon", "setWithCoupon", "isAppointment", "isOnSale", "isPreSaleGood", "isSecKillGood", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ak {
    @Nullable
    public List<String> A;
    @Nullable
    public List<String> B;
    @Nullable
    public String C;
    public boolean D;
    @Nullable
    public String E;
    @Nullable
    public String F;
    @Nullable
    public String G;
    @Nullable
    public Boolean H;
    @Nullable
    public Boolean I;
    @Nullable
    public Integer J;
    @Nullable
    public Boolean K = Boolean.FALSE;
    @Nullable
    public Boolean L = Boolean.FALSE;
    public boolean M;
    public int N;
    public boolean O;
    public int P = 2;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public List<ab> f38187a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f38188b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Map<String, z> f38189c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f38190d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f38191e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f38192f;
    @Nullable
    public String g;
    @Nullable
    public k h;
    @Nullable
    public String i;
    public long j;
    @Nullable
    public String k;
    @Nullable
    public UrlModel l;
    @Nullable
    public String m;
    public int n;
    public int o;
    public int p;
    @Nullable
    public String q;
    @Nullable
    public String r;
    @Nullable
    public String s;
    public boolean t;
    @Nullable
    public PromotionPreSale u;
    @Nullable
    public PromotionAppointment v;
    @Nullable
    public s w;
    @Nullable
    public String x;
    @Nullable
    public String y;
    public boolean z;

    public final boolean a() {
        if (this.u != null) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.v != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.w != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.P == 2) {
            return true;
        }
        return false;
    }
}
