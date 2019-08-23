package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b?\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 S2\u00020\u0001:\u0001SB£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0014J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010)J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\tHÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\tHÆ\u0003J\t\u0010I\u001a\u00020\tHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J¬\u0001\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PHÖ\u0003J\t\u0010Q\u001a\u00020\u0005HÖ\u0001J\t\u0010R\u001a\u00020\u0003HÖ\u0001R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\f\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b1\u0010)\"\u0004\b2\u0010+R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u0010\u0018R\u001e\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010 \"\u0004\b:\u0010\"R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b;\u0010)\"\u0004\b<\u0010+¨\u0006T"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceGoodCoupon;", "Ljava/io/Serializable;", "couponMetaId", "", "type", "", "couponName", "shopName", "threshold", "", "credit", "startTime", "expireTime", "discount", "", "discountLimit", "couponRange", "applyType", "periodType", "validPeriod", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIJJLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getApplyType", "()Ljava/lang/String;", "setApplyType", "(Ljava/lang/String;)V", "getCouponMetaId", "setCouponMetaId", "getCouponName", "setCouponName", "getCouponRange", "setCouponRange", "getCredit", "()I", "setCredit", "(I)V", "getDiscount", "()Ljava/lang/Float;", "setDiscount", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getDiscountLimit", "()Ljava/lang/Integer;", "setDiscountLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getExpireTime", "()J", "setExpireTime", "(J)V", "getPeriodType", "setPeriodType", "getShopName", "setShopName", "getStartTime", "setStartTime", "getThreshold", "setThreshold", "getType", "setType", "getValidPeriod", "setValidPeriod", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIJJLjava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceGoodCoupon;", "equals", "", "other", "", "hashCode", "toString", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class f implements Serializable {
    public static final a Companion = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("apply_type")
    @Nullable
    private String applyType;
    @SerializedName("coupon_meta_id")
    @Nullable
    private String couponMetaId;
    @SerializedName("coupon_name")
    @Nullable
    private String couponName;
    @SerializedName("coupon_range")
    @Nullable
    private String couponRange;
    @SerializedName("credit")
    private int credit;
    @SerializedName("discount")
    @Nullable
    private Float discount;
    @SerializedName("discount_limit")
    @Nullable
    private Integer discountLimit;
    @SerializedName("expire_time")
    private long expireTime;
    @SerializedName("period_type")
    @Nullable
    private Integer periodType;
    @SerializedName("shop_name")
    @Nullable
    private String shopName;
    @SerializedName("start_time")
    private long startTime;
    @SerializedName("threshold")
    private long threshold;
    @SerializedName("type")
    private int type;
    @SerializedName("valid_period")
    @Nullable
    private Integer validPeriod;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceGoodCoupon$Companion;", "", "()V", "TYPE_1", "", "TYPE_2", "TYPE_21", "TYPE_22", "TYPE_23", "TYPE_3", "TYPE_41", "TYPE_42", "TYPE_43", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public f() {
        this(null, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 16383, null);
    }

    public static /* synthetic */ f copy$default(f fVar, String str, int i, String str2, String str3, long j, int i2, long j2, long j3, Float f2, Integer num, String str4, String str5, Integer num2, Integer num3, int i3, Object obj) {
        f fVar2 = fVar;
        int i4 = i3;
        return fVar.copy((i4 & 1) != 0 ? fVar2.couponMetaId : str, (i4 & 2) != 0 ? fVar2.type : i, (i4 & 4) != 0 ? fVar2.couponName : str2, (i4 & 8) != 0 ? fVar2.shopName : str3, (i4 & 16) != 0 ? fVar2.threshold : j, (i4 & 32) != 0 ? fVar2.credit : i2, (i4 & 64) != 0 ? fVar2.startTime : j2, (i4 & SearchJediMixFeedAdapter.f42517f) != 0 ? fVar2.expireTime : j3, (i4 & 256) != 0 ? fVar2.discount : f2, (i4 & 512) != 0 ? fVar2.discountLimit : num, (i4 & 1024) != 0 ? fVar2.couponRange : str4, (i4 & 2048) != 0 ? fVar2.applyType : str5, (i4 & 4096) != 0 ? fVar2.periodType : num2, (i4 & 8192) != 0 ? fVar2.validPeriod : num3);
    }

    @Nullable
    public final String component1() {
        return this.couponMetaId;
    }

    @Nullable
    public final Integer component10() {
        return this.discountLimit;
    }

    @Nullable
    public final String component11() {
        return this.couponRange;
    }

    @Nullable
    public final String component12() {
        return this.applyType;
    }

    @Nullable
    public final Integer component13() {
        return this.periodType;
    }

    @Nullable
    public final Integer component14() {
        return this.validPeriod;
    }

    public final int component2() {
        return this.type;
    }

    @Nullable
    public final String component3() {
        return this.couponName;
    }

    @Nullable
    public final String component4() {
        return this.shopName;
    }

    public final long component5() {
        return this.threshold;
    }

    public final int component6() {
        return this.credit;
    }

    public final long component7() {
        return this.startTime;
    }

    public final long component8() {
        return this.expireTime;
    }

    @Nullable
    public final Float component9() {
        return this.discount;
    }

    @NotNull
    public final f copy(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, long j, int i2, long j2, long j3, @Nullable Float f2, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        Object[] objArr = {str, Integer.valueOf(i), str2, str3, new Long(j4), Integer.valueOf(i2), new Long(j5), new Long(j6), f2, num, str4, str5, num2, num3};
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, 29815, new Class[]{String.class, Integer.TYPE, String.class, String.class, Long.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Float.class, Integer.class, String.class, String.class, Integer.class, Integer.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str2, str3, new Long(j4), Integer.valueOf(i2), new Long(j5), new Long(j6), f2, num, str4, str5, num2, num3}, this, changeQuickRedirect, false, 29815, new Class[]{String.class, Integer.TYPE, String.class, String.class, Long.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Float.class, Integer.class, String.class, String.class, Integer.class, Integer.class}, f.class);
        }
        f fVar = new f(str, i, str2, str3, j, i2, j2, j3, f2, num, str4, str5, num2, num3);
        return fVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29818, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29818, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (Intrinsics.areEqual((Object) this.couponMetaId, (Object) fVar.couponMetaId)) {
                    if ((this.type == fVar.type) && Intrinsics.areEqual((Object) this.couponName, (Object) fVar.couponName) && Intrinsics.areEqual((Object) this.shopName, (Object) fVar.shopName)) {
                        if (this.threshold == fVar.threshold) {
                            if (this.credit == fVar.credit) {
                                if (this.startTime == fVar.startTime) {
                                    if (!(this.expireTime == fVar.expireTime) || !Intrinsics.areEqual((Object) this.discount, (Object) fVar.discount) || !Intrinsics.areEqual((Object) this.discountLimit, (Object) fVar.discountLimit) || !Intrinsics.areEqual((Object) this.couponRange, (Object) fVar.couponRange) || !Intrinsics.areEqual((Object) this.applyType, (Object) fVar.applyType) || !Intrinsics.areEqual((Object) this.periodType, (Object) fVar.periodType) || !Intrinsics.areEqual((Object) this.validPeriod, (Object) fVar.validPeriod)) {
                                        return false;
                                    }
                                }
                            }
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29817, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29817, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.couponMetaId;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.type) * 31;
        String str2 = this.couponName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.shopName;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.threshold;
        long j2 = this.startTime;
        long j3 = this.expireTime;
        int i2 = (((((((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.credit) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        Float f2 = this.discount;
        int hashCode4 = (i2 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Integer num = this.discountLimit;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        String str4 = this.couponRange;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.applyType;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num2 = this.periodType;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.validPeriod;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode8 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29816, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29816, new Class[0], String.class);
        }
        return "CommerceGoodCoupon(couponMetaId=" + this.couponMetaId + ", type=" + this.type + ", couponName=" + this.couponName + ", shopName=" + this.shopName + ", threshold=" + this.threshold + ", credit=" + this.credit + ", startTime=" + this.startTime + ", expireTime=" + this.expireTime + ", discount=" + this.discount + ", discountLimit=" + this.discountLimit + ", couponRange=" + this.couponRange + ", applyType=" + this.applyType + ", periodType=" + this.periodType + ", validPeriod=" + this.validPeriod + ")";
    }

    @Nullable
    public final String getApplyType() {
        return this.applyType;
    }

    @Nullable
    public final String getCouponMetaId() {
        return this.couponMetaId;
    }

    @Nullable
    public final String getCouponName() {
        return this.couponName;
    }

    @Nullable
    public final String getCouponRange() {
        return this.couponRange;
    }

    public final int getCredit() {
        return this.credit;
    }

    @Nullable
    public final Float getDiscount() {
        return this.discount;
    }

    @Nullable
    public final Integer getDiscountLimit() {
        return this.discountLimit;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final Integer getPeriodType() {
        return this.periodType;
    }

    @Nullable
    public final String getShopName() {
        return this.shopName;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getThreshold() {
        return this.threshold;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final Integer getValidPeriod() {
        return this.validPeriod;
    }

    public final void setApplyType(@Nullable String str) {
        this.applyType = str;
    }

    public final void setCouponMetaId(@Nullable String str) {
        this.couponMetaId = str;
    }

    public final void setCouponName(@Nullable String str) {
        this.couponName = str;
    }

    public final void setCouponRange(@Nullable String str) {
        this.couponRange = str;
    }

    public final void setCredit(int i) {
        this.credit = i;
    }

    public final void setDiscount(@Nullable Float f2) {
        this.discount = f2;
    }

    public final void setDiscountLimit(@Nullable Integer num) {
        this.discountLimit = num;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setPeriodType(@Nullable Integer num) {
        this.periodType = num;
    }

    public final void setShopName(@Nullable String str) {
        this.shopName = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setThreshold(long j) {
        this.threshold = j;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValidPeriod(@Nullable Integer num) {
        this.validPeriod = num;
    }

    public f(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, long j, int i2, long j2, long j3, @Nullable Float f2, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable Integer num2, @Nullable Integer num3) {
        this.couponMetaId = str;
        this.type = i;
        this.couponName = str2;
        this.shopName = str3;
        this.threshold = j;
        this.credit = i2;
        this.startTime = j2;
        this.expireTime = j3;
        this.discount = f2;
        this.discountLimit = num;
        this.couponRange = str4;
        this.applyType = str5;
        this.periodType = num2;
        this.validPeriod = num3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f(java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21, long r22, int r24, long r25, long r27, java.lang.Float r29, java.lang.Integer r30, java.lang.String r31, java.lang.String r32, java.lang.Integer r33, java.lang.Integer r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r17 = this;
            r0 = r35
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000b
        L_0x0009:
            r1 = r18
        L_0x000b:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0012
            r2 = 0
            goto L_0x0014
        L_0x0012:
            r2 = r19
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = ""
            goto L_0x001d
        L_0x001b:
            r4 = r20
        L_0x001d:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0024
            java.lang.String r5 = ""
            goto L_0x0026
        L_0x0024:
            r5 = r21
        L_0x0026:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L_0x002e
            r9 = r7
            goto L_0x0030
        L_0x002e:
            r9 = r22
        L_0x0030:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0036
            r6 = 0
            goto L_0x0038
        L_0x0036:
            r6 = r24
        L_0x0038:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x003e
            r11 = r7
            goto L_0x0040
        L_0x003e:
            r11 = r25
        L_0x0040:
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r7 = r27
        L_0x0047:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0051
            r13 = 0
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            goto L_0x0053
        L_0x0051:
            r13 = r29
        L_0x0053:
            r14 = r0 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x005c
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            goto L_0x005e
        L_0x005c:
            r14 = r30
        L_0x005e:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0065
            java.lang.String r15 = ""
            goto L_0x0067
        L_0x0065:
            r15 = r31
        L_0x0067:
            r3 = r0 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = ""
            goto L_0x0070
        L_0x006e:
            r3 = r32
        L_0x0070:
            r16 = r3
            r3 = r0 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x007c
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x007e
        L_0x007c:
            r3 = r33
        L_0x007e:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0088
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x008a
        L_0x0088:
            r0 = r34
        L_0x008a:
            r18 = r17
            r19 = r1
            r20 = r2
            r21 = r4
            r22 = r5
            r23 = r9
            r25 = r6
            r26 = r11
            r28 = r7
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r16
            r34 = r3
            r35 = r0
            r18.<init>(r19, r20, r21, r22, r23, r25, r26, r28, r30, r31, r32, r33, r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.f.<init>(java.lang.String, int, java.lang.String, java.lang.String, long, int, long, long, java.lang.Float, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
