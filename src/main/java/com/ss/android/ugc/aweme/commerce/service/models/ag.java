package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/ToutiaoDynamicInfo;", "Ljava/io/Serializable;", "()V", "seckillInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "getSeckillInfo", "()Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "setSeckillInfo", "(Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;)V", "statusCode", "", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "virtualPromotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/VirtualPromotionBean;", "getVirtualPromotion", "()Lcom/ss/android/ugc/aweme/commerce/service/models/VirtualPromotionBean;", "setVirtualPromotion", "(Lcom/ss/android/ugc/aweme/commerce/service/models/VirtualPromotionBean;)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class ag implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("seckill_info")
    @Nullable
    private s seckillInfo;
    @SerializedName("status_code")
    @Nullable
    private Integer statusCode = 0;
    @SerializedName("virtual_promotion")
    @Nullable
    private am virtualPromotion;

    @Nullable
    public final s getSeckillInfo() {
        return this.seckillInfo;
    }

    @Nullable
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final am getVirtualPromotion() {
        return this.virtualPromotion;
    }

    public final void setSeckillInfo(@Nullable s sVar) {
        this.seckillInfo = sVar;
    }

    public final void setStatusCode(@Nullable Integer num) {
        this.statusCode = num;
    }

    public final void setVirtualPromotion(@Nullable am amVar) {
        this.virtualPromotion = amVar;
    }
}
