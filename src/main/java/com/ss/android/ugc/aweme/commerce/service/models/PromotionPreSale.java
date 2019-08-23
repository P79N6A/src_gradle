package com.ss.android.ugc.aweme.commerce.service.models;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003JW\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R \u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionPreSale;", "Ljava/io/Serializable;", "deliveryTime", "", "serverTime", "endTime", "endTimeText", "", "deliveryInfoPrefix", "deliveryInfo", "buttonPrefix", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonPrefix", "()Ljava/lang/String;", "setButtonPrefix", "(Ljava/lang/String;)V", "getDeliveryInfo", "setDeliveryInfo", "getDeliveryInfoPrefix", "setDeliveryInfoPrefix", "getDeliveryTime", "()J", "setDeliveryTime", "(J)V", "getEndTime", "setEndTime", "getEndTimeText", "setEndTimeText", "getServerTime", "setServerTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class PromotionPreSale implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("button_prefix")
    @Nullable
    private String buttonPrefix;
    @SerializedName("delivery_info")
    @Nullable
    private String deliveryInfo;
    @SerializedName("delivery_info_prefix")
    @Nullable
    private String deliveryInfoPrefix;
    @SerializedName("delivery_time")
    private long deliveryTime;
    @SerializedName("end_time")
    private long endTime;
    @SerializedName("end_time_text")
    @Nullable
    private String endTimeText;
    @SerializedName("server_time")
    private long serverTime;

    public PromotionPreSale() {
        this(0, 0, 0, null, null, null, null, 127, null);
    }

    public static /* synthetic */ PromotionPreSale copy$default(PromotionPreSale promotionPreSale, long j, long j2, long j3, String str, String str2, String str3, String str4, int i, Object obj) {
        PromotionPreSale promotionPreSale2 = promotionPreSale;
        return promotionPreSale.copy((i & 1) != 0 ? promotionPreSale2.deliveryTime : j, (i & 2) != 0 ? promotionPreSale2.serverTime : j2, (i & 4) != 0 ? promotionPreSale2.endTime : j3, (i & 8) != 0 ? promotionPreSale2.endTimeText : str, (i & 16) != 0 ? promotionPreSale2.deliveryInfoPrefix : str2, (i & 32) != 0 ? promotionPreSale2.deliveryInfo : str3, (i & 64) != 0 ? promotionPreSale2.buttonPrefix : str4);
    }

    public final long component1() {
        return this.deliveryTime;
    }

    public final long component2() {
        return this.serverTime;
    }

    public final long component3() {
        return this.endTime;
    }

    @Nullable
    public final String component4() {
        return this.endTimeText;
    }

    @Nullable
    public final String component5() {
        return this.deliveryInfoPrefix;
    }

    @Nullable
    public final String component6() {
        return this.deliveryInfo;
    }

    @Nullable
    public final String component7() {
        return this.buttonPrefix;
    }

    @NotNull
    public final PromotionPreSale copy(long j, long j2, long j3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5), new Long(j6), str, str2, str3, str4}, this, changeQuickRedirect, false, 29868, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class, String.class, String.class}, PromotionPreSale.class)) {
            return (PromotionPreSale) PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5), new Long(j6), str, str2, str3, str4}, this, changeQuickRedirect, false, 29868, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class, String.class, String.class}, PromotionPreSale.class);
        }
        PromotionPreSale promotionPreSale = new PromotionPreSale(j, j2, j3, str, str2, str3, str4);
        return promotionPreSale;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29871, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29871, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof PromotionPreSale) {
                PromotionPreSale promotionPreSale = (PromotionPreSale) obj;
                if (this.deliveryTime == promotionPreSale.deliveryTime) {
                    if (this.serverTime == promotionPreSale.serverTime) {
                        if (!(this.endTime == promotionPreSale.endTime) || !Intrinsics.areEqual((Object) this.endTimeText, (Object) promotionPreSale.endTimeText) || !Intrinsics.areEqual((Object) this.deliveryInfoPrefix, (Object) promotionPreSale.deliveryInfoPrefix) || !Intrinsics.areEqual((Object) this.deliveryInfo, (Object) promotionPreSale.deliveryInfo) || !Intrinsics.areEqual((Object) this.buttonPrefix, (Object) promotionPreSale.buttonPrefix)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29870, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29870, new Class[0], Integer.TYPE)).intValue();
        }
        long j = this.deliveryTime;
        long j2 = this.serverTime;
        long j3 = this.endTime;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        String str = this.endTimeText;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.deliveryInfoPrefix;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.deliveryInfo;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.buttonPrefix;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29869, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29869, new Class[0], String.class);
        }
        return "PromotionPreSale(deliveryTime=" + this.deliveryTime + ", serverTime=" + this.serverTime + ", endTime=" + this.endTime + ", endTimeText=" + this.endTimeText + ", deliveryInfoPrefix=" + this.deliveryInfoPrefix + ", deliveryInfo=" + this.deliveryInfo + ", buttonPrefix=" + this.buttonPrefix + ")";
    }

    @Nullable
    public final String getButtonPrefix() {
        return this.buttonPrefix;
    }

    @Nullable
    public final String getDeliveryInfo() {
        return this.deliveryInfo;
    }

    @Nullable
    public final String getDeliveryInfoPrefix() {
        return this.deliveryInfoPrefix;
    }

    public final long getDeliveryTime() {
        return this.deliveryTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getEndTimeText() {
        return this.endTimeText;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public final void setButtonPrefix(@Nullable String str) {
        this.buttonPrefix = str;
    }

    public final void setDeliveryInfo(@Nullable String str) {
        this.deliveryInfo = str;
    }

    public final void setDeliveryInfoPrefix(@Nullable String str) {
        this.deliveryInfoPrefix = str;
    }

    public final void setDeliveryTime(long j) {
        this.deliveryTime = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setEndTimeText(@Nullable String str) {
        this.endTimeText = str;
    }

    public final void setServerTime(long j) {
        this.serverTime = j;
    }

    public PromotionPreSale(long j, long j2, long j3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.deliveryTime = j;
        this.serverTime = j2;
        this.endTime = j3;
        this.endTimeText = str;
        this.deliveryInfoPrefix = str2;
        this.deliveryInfo = str3;
        this.buttonPrefix = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PromotionPreSale(long r11, long r13, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r1 = r21 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0008
            r4 = r2
            goto L_0x0009
        L_0x0008:
            r4 = r11
        L_0x0009:
            r1 = r21 & 2
            if (r1 == 0) goto L_0x000f
            r6 = r2
            goto L_0x0010
        L_0x000f:
            r6 = r13
        L_0x0010:
            r1 = r21 & 4
            if (r1 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r2 = r15
        L_0x0016:
            r1 = r21 & 8
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = ""
            goto L_0x001f
        L_0x001d:
            r1 = r17
        L_0x001f:
            r8 = r21 & 16
            if (r8 == 0) goto L_0x0026
            java.lang.String r8 = ""
            goto L_0x0028
        L_0x0026:
            r8 = r18
        L_0x0028:
            r9 = r21 & 32
            if (r9 == 0) goto L_0x002f
            java.lang.String r9 = ""
            goto L_0x0031
        L_0x002f:
            r9 = r19
        L_0x0031:
            r0 = r21 & 64
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = ""
            goto L_0x003a
        L_0x0038:
            r0 = r20
        L_0x003a:
            r11 = r10
            r12 = r4
            r14 = r6
            r16 = r2
            r18 = r1
            r19 = r8
            r20 = r9
            r21 = r0
            r11.<init>(r12, r14, r16, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.PromotionPreSale.<init>(long, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
