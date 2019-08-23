package com.ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0016\u0018\u0000 r2\u00020\u0001:\u0002rsB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\\\u001a\u0004\u0018\u00010\u000eJ\u0006\u0010]\u001a\u00020^J\u0006\u0010_\u001a\u00020^J\u0006\u0010`\u001a\u00020^J\u0006\u0010a\u001a\u00020^J\u0006\u0010b\u001a\u00020^J\u0006\u0010c\u001a\u00020^J\u0006\u0010d\u001a\u00020^J\u0006\u0010e\u001a\u00020^J\u0006\u0010f\u001a\u00020^J\u0006\u0010g\u001a\u00020^J\u0006\u0010h\u001a\u00020^J\u0006\u0010i\u001a\u00020^J\u0006\u0010j\u001a\u00020^J\u0006\u0010k\u001a\u00020^J\u0006\u0010l\u001a\u00020^J\u0006\u0010m\u001a\u00020^J\u0006\u0010n\u001a\u00020^J\u0006\u0010o\u001a\u00020\u000eJ\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0014J\u0006\u0010q\u001a\u00020\u000eR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R \u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R \u0010(\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010\u0012R&\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R\u001e\u0010.\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001e\u00101\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\"\"\u0004\b3\u0010$R \u00104\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012R \u00107\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0010\"\u0004\b9\u0010\u0012R\u001e\u0010:\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$R \u0010A\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0010\"\u0004\bC\u0010\u0012R\u001e\u0010D\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R \u0010G\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR \u0010M\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0010\"\u0004\bO\u0010\u0012R \u0010P\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR \u0010V\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[¨\u0006t"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion;", "Ljava/io/Serializable;", "()V", "brandIcon", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getBrandIcon", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setBrandIcon", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "commodityType", "", "getCommodityType", "()J", "detailUrl", "", "getDetailUrl", "()Ljava/lang/String;", "setDetailUrl", "(Ljava/lang/String;)V", "elasticImages", "", "getElasticImages", "()Ljava/util/List;", "setElasticImages", "(Ljava/util/List;)V", "elasticIntroduction", "getElasticIntroduction", "setElasticIntroduction", "elasticTitle", "getElasticTitle", "setElasticTitle", "elasticType", "", "getElasticType", "()I", "setElasticType", "(I)V", "images", "getImages", "setImages", "jumpToAppUrl", "getJumpToAppUrl", "setJumpToAppUrl", "labels", "getLabels", "setLabels", "marketPrice", "getMarketPrice", "setMarketPrice", "price", "getPrice", "setPrice", "productId", "getProductId", "setProductId", "promotionId", "getPromotionId", "setPromotionId", "promotionSource", "getPromotionSource", "setPromotionSource", "(J)V", "sales", "getSales", "setSales", "smallAppUrl", "getSmallAppUrl", "setSmallAppUrl", "status", "getStatus", "setStatus", "taobao", "Lcom/ss/android/ugc/aweme/commerce/service/models/TaoBao;", "getTaobao", "()Lcom/ss/android/ugc/aweme/commerce/service/models/TaoBao;", "setTaobao", "(Lcom/ss/android/ugc/aweme/commerce/service/models/TaoBao;)V", "title", "getTitle", "setTitle", "toutiao", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionToutiao;", "getToutiao", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionToutiao;", "setToutiao", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionToutiao;)V", "visitor", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;", "getVisitor", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;", "setVisitor", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;)V", "getFirstFullReduction", "hasCoupon", "", "hasTaobaoCoupon", "hasToutiaoCoupon", "isAppointment", "isGoodInAppointment", "isGoodInPreSale", "isGoodInSecKill", "isJDGood", "isKaolaGood", "isMiniProgramGood", "isOnSale", "isOtherTypeGood", "isPreSaleGood", "isSecKillGood", "isTaobaoGood", "isThirdParty", "isVirtualGood", "longTitle", "preferredImages", "shortTitle", "Companion", "SourceType", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public class c implements Serializable {
    public static final a Companion = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("brand_icon")
    @Nullable
    private UrlModel brandIcon;
    @SerializedName("detail_url")
    @Nullable
    private String detailUrl = "";
    @SerializedName("elastic_images")
    @Nullable
    private List<? extends UrlModel> elasticImages = CollectionsKt.emptyList();
    @SerializedName("elastic_introduction")
    @Nullable
    private String elasticIntroduction = "";
    @SerializedName("elastic_title")
    @Nullable
    private String elasticTitle = "";
    @SerializedName("elastic_type")
    private int elasticType;
    @SerializedName("images")
    @Nullable
    private List<? extends UrlModel> images = CollectionsKt.emptyList();
    @SerializedName("open_app_url")
    @Nullable
    private String jumpToAppUrl;
    @SerializedName("label")
    @Nullable
    private List<String> labels = CollectionsKt.emptyList();
    @SerializedName("market_price")
    private int marketPrice;
    @SerializedName("price")
    private int price;
    @SerializedName("product_id")
    @Nullable
    private String productId = "";
    @SerializedName("promotion_id")
    @Nullable
    private String promotionId = "";
    @SerializedName("promotion_source")
    private long promotionSource = -1;
    @SerializedName("sales")
    private int sales;
    @SerializedName("small_app_url")
    @Nullable
    private String smallAppUrl;
    @SerializedName("status")
    private int status = 2;
    @SerializedName("taobao")
    @Nullable
    private ad taobao;
    @SerializedName("title")
    @Nullable
    private String title = "";
    @SerializedName("toutiao")
    @Nullable
    private r toutiao;
    @SerializedName("visitor")
    @Nullable
    private PromotionVisitor visitor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion$Companion;", "", "()V", "ELASTIC_TYPE_UPDATE", "", "NEW", "NORMAL", "RECOMMEND", "isTaobaoGood", "", "promotionSource", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38198a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        public final boolean a(long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f38198a, false, 29802, new Class[]{Long.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f38198a, false, 29802, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
            } else if (j2 == b.TAOBAO.getType() || j2 == b.TAOBAO_PHONE.getType() || j2 == b.TAOBAO_COMMAND.getType()) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion$SourceType;", "", "type", "", "(Ljava/lang/String;IJ)V", "getType", "()J", "TAOBAO", "GAME", "EASY_GO", "EASY_GO_SELECTED", "TAOBAO_PHONE", "XIAO_DIAN", "TAOBAO_COMMAND", "JINGDONG", "KAOLA", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public enum b {
        TAOBAO(1),
        GAME(2),
        EASY_GO(3),
        EASY_GO_SELECTED(4),
        TAOBAO_PHONE(5),
        XIAO_DIAN(6),
        TAOBAO_COMMAND(7),
        JINGDONG(8),
        KAOLA(9);
        
        public static final a Companion = null;
        public static ChangeQuickRedirect changeQuickRedirect;
        private final long type;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/BaseDetailPromotion$SourceType$Companion;", "", "()V", "contains", "", "source", "", "(Ljava/lang/Long;)Z", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38199a;

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            public final boolean a(@Nullable Long l) {
                if (PatchProxy.isSupport(new Object[]{l}, this, f38199a, false, 29805, new Class[]{Long.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{l}, this, f38199a, false, 29805, new Class[]{Long.class}, Boolean.TYPE)).booleanValue();
                } else if (l == null) {
                    return false;
                } else {
                    for (b type : b.values()) {
                        long type2 = type.getType();
                        if (l != null && type2 == l.longValue()) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }

        public final long getType() {
            return this.type;
        }

        static {
            Companion = new a((byte) 0);
        }

        private b(long j) {
            this.type = j;
        }
    }

    @JvmStatic
    public static final boolean isTaobaoGood(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, changeQuickRedirect, true, 29801, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return Companion.a(j2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, changeQuickRedirect, true, 29801, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public final UrlModel getBrandIcon() {
        return this.brandIcon;
    }

    public final long getCommodityType() {
        return this.promotionSource;
    }

    @Nullable
    public final String getDetailUrl() {
        return this.detailUrl;
    }

    @Nullable
    public final List<UrlModel> getElasticImages() {
        return this.elasticImages;
    }

    @Nullable
    public final String getElasticIntroduction() {
        return this.elasticIntroduction;
    }

    @Nullable
    public final String getElasticTitle() {
        return this.elasticTitle;
    }

    public final int getElasticType() {
        return this.elasticType;
    }

    @Nullable
    public final List<UrlModel> getImages() {
        return this.images;
    }

    @Nullable
    public final String getJumpToAppUrl() {
        return this.jumpToAppUrl;
    }

    @Nullable
    public final List<String> getLabels() {
        return this.labels;
    }

    public final int getMarketPrice() {
        return this.marketPrice;
    }

    public final int getPrice() {
        return this.price;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getPromotionId() {
        return this.promotionId;
    }

    public final long getPromotionSource() {
        return this.promotionSource;
    }

    public final int getSales() {
        return this.sales;
    }

    @Nullable
    public final String getSmallAppUrl() {
        return this.smallAppUrl;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final ad getTaobao() {
        return this.taobao;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final r getToutiao() {
        return this.toutiao;
    }

    @Nullable
    public final PromotionVisitor getVisitor() {
        return this.visitor;
    }

    public final boolean isOnSale() {
        if (this.status == 2) {
            return true;
        }
        return false;
    }

    public final boolean hasCoupon() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29797, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29797, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (hasTaobaoCoupon() || hasToutiaoCoupon()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean hasTaobaoCoupon() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29799, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29799, new Class[0], Boolean.TYPE)).booleanValue();
        }
        ad adVar = this.taobao;
        if (adVar != null) {
            ae coupon = adVar.getCoupon();
            if (coupon == null || !coupon.isValid()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean isAppointment() {
        PromotionAppointment promotionAppointment;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29788, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29788, new Class[0], Boolean.TYPE)).booleanValue();
        }
        r rVar = this.toutiao;
        if (rVar != null) {
            promotionAppointment = rVar.getAppointment();
        } else {
            promotionAppointment = null;
        }
        if (promotionAppointment != null) {
            return true;
        }
        return false;
    }

    public final boolean isJDGood() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29784, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29784, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.promotionSource == b.JINGDONG.getType()) {
            z = true;
        }
        return z;
    }

    public final boolean isKaolaGood() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29785, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29785, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.promotionSource == b.KAOLA.getType()) {
            z = true;
        }
        return z;
    }

    public final boolean isOtherTypeGood() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29800, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29800, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!b.Companion.a(Long.valueOf(this.promotionSource))) {
            z = true;
        }
        return z;
    }

    public final boolean isPreSaleGood() {
        PromotionPreSale promotionPreSale;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29787, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29787, new Class[0], Boolean.TYPE)).booleanValue();
        }
        r rVar = this.toutiao;
        if (rVar != null) {
            promotionPreSale = rVar.getPreSale();
        } else {
            promotionPreSale = null;
        }
        if (promotionPreSale != null) {
            return true;
        }
        return false;
    }

    public final boolean isThirdParty() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29783, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29783, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (isTaobaoGood() || isMiniProgramGood() || isOtherTypeGood()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean isVirtualGood() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29786, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29786, new Class[0], Boolean.TYPE)).booleanValue();
        }
        r rVar = this.toutiao;
        if (rVar != null) {
            am virtualPromotion = rVar.getVirtualPromotion();
            if (virtualPromotion != null) {
                z = virtualPromotion.isVirtualGoods();
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFirstFullReduction() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 29793(0x7461, float:4.1749E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 29793(0x7461, float:4.1749E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            com.ss.android.ugc.aweme.commerce.service.models.r r1 = r9.toutiao
            r2 = 0
            if (r1 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.commerce.service.models.af r1 = r1.getReductionInfo()
            if (r1 == 0) goto L_0x0036
            java.util.List r1 = r1.getFullReduction()
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x0045
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r3 = 0
            goto L_0x0046
        L_0x0045:
            r3 = 1
        L_0x0046:
            if (r3 != 0) goto L_0x004f
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.c.getFirstFullReduction():java.lang.String");
    }

    public final boolean hasToutiaoCoupon() {
        List<String> list;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29798, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29798, new Class[0], Boolean.TYPE)).booleanValue();
        }
        r rVar = this.toutiao;
        if (rVar != null) {
            list = rVar.getCouponRule();
        } else {
            list = null;
        }
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }

    public final boolean isGoodInAppointment() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29791, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29791, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isAppointment()) {
            return false;
        } else {
            r rVar = this.toutiao;
            if (rVar != null) {
                PromotionAppointment appointment = rVar.getAppointment();
                if (appointment != null) {
                    if (appointment.getServerTime() < appointment.getStartTime()) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    public final boolean isGoodInPreSale() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29790, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29790, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isPreSaleGood()) {
            return false;
        } else {
            r rVar = this.toutiao;
            if (rVar != null) {
                PromotionPreSale preSale = rVar.getPreSale();
                if (preSale != null) {
                    if (preSale.getServerTime() < preSale.getEndTime()) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    public final boolean isGoodInSecKill() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29792, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29792, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isSecKillGood()) {
            return false;
        } else {
            r rVar = this.toutiao;
            if (rVar != null) {
                s secKillInfo = rVar.getSecKillInfo();
                if (secKillInfo != null) {
                    long beginTime = secKillInfo.getBeginTime();
                    long endTime = secKillInfo.getEndTime();
                    long currentTime = secKillInfo.getCurrentTime();
                    if (beginTime <= currentTime && endTime >= currentTime) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    public final boolean isMiniProgramGood() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29782, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29782, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.promotionSource == b.JINGDONG.getType() || this.promotionSource == b.KAOLA.getType()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean isSecKillGood() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29789, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29789, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!isPreSaleGood() && !isAppointment()) {
            r rVar = this.toutiao;
            if (rVar != null) {
                s secKillInfo = rVar.getSecKillInfo();
                if (secKillInfo == null || !secKillInfo.canBeShow()) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String longTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29796, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29796, new Class[0], String.class);
        } else if (!TextUtils.isEmpty(this.title)) {
            String str = this.title;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            return str;
        } else if (TextUtils.isEmpty(this.elasticTitle)) {
            return "";
        } else {
            String str2 = this.elasticTitle;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            return str2;
        }
    }

    @Nullable
    public final List<UrlModel> preferredImages() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29794, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29794, new Class[0], List.class);
        }
        List<? extends UrlModel> list = this.elasticImages;
        if (list != null && (!list.isEmpty())) {
            return this.elasticImages;
        }
        List<? extends UrlModel> list2 = this.images;
        if (list2 == null || !(!list2.isEmpty())) {
            return CollectionsKt.emptyList();
        }
        return this.images;
    }

    @NotNull
    public final String shortTitle() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29795, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29795, new Class[0], String.class);
        } else if (!TextUtils.isEmpty(this.elasticTitle)) {
            String str = this.elasticTitle;
            if (str == null) {
                Intrinsics.throwNpe();
            }
            return str;
        } else if (TextUtils.isEmpty(this.title)) {
            return "";
        } else {
            String str2 = this.title;
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            return str2;
        }
    }

    public final boolean isTaobaoGood() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29781, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29781, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.promotionSource == b.TAOBAO.getType() || this.promotionSource == b.TAOBAO_PHONE.getType() || this.promotionSource == b.TAOBAO_COMMAND.getType()) {
            return true;
        } else {
            return false;
        }
    }

    public final void setBrandIcon(@Nullable UrlModel urlModel) {
        this.brandIcon = urlModel;
    }

    public final void setDetailUrl(@Nullable String str) {
        this.detailUrl = str;
    }

    public final void setElasticImages(@Nullable List<? extends UrlModel> list) {
        this.elasticImages = list;
    }

    public final void setElasticIntroduction(@Nullable String str) {
        this.elasticIntroduction = str;
    }

    public final void setElasticTitle(@Nullable String str) {
        this.elasticTitle = str;
    }

    public final void setElasticType(int i) {
        this.elasticType = i;
    }

    public final void setImages(@Nullable List<? extends UrlModel> list) {
        this.images = list;
    }

    public final void setJumpToAppUrl(@Nullable String str) {
        this.jumpToAppUrl = str;
    }

    public final void setLabels(@Nullable List<String> list) {
        this.labels = list;
    }

    public final void setMarketPrice(int i) {
        this.marketPrice = i;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setProductId(@Nullable String str) {
        this.productId = str;
    }

    public final void setPromotionId(@Nullable String str) {
        this.promotionId = str;
    }

    public final void setPromotionSource(long j) {
        this.promotionSource = j;
    }

    public final void setSales(int i) {
        this.sales = i;
    }

    public final void setSmallAppUrl(@Nullable String str) {
        this.smallAppUrl = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTaobao(@Nullable ad adVar) {
        this.taobao = adVar;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setToutiao(@Nullable r rVar) {
        this.toutiao = rVar;
    }

    public final void setVisitor(@Nullable PromotionVisitor promotionVisitor) {
        this.visitor = promotionVisitor;
    }
}
