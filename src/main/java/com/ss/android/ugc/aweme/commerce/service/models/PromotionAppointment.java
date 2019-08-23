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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003JU\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010+\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\fHÖ\u0001J\t\u0010/\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u00060"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionAppointment;", "Ljava/io/Serializable;", "startTime", "", "serverTime", "startTimeText", "", "showText", "showLabel", "isAppointment", "", "appointmentNum", "", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "getAppointmentNum", "()I", "setAppointmentNum", "(I)V", "()Z", "setAppointment", "(Z)V", "getServerTime", "()J", "setServerTime", "(J)V", "getShowLabel", "()Ljava/lang/String;", "setShowLabel", "(Ljava/lang/String;)V", "getShowText", "setShowText", "getStartTime", "setStartTime", "getStartTimeText", "setStartTimeText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class PromotionAppointment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("appointment_num")
    private int appointmentNum;
    @SerializedName("is_appointment")
    private boolean isAppointment;
    @SerializedName("server_time")
    private long serverTime;
    @SerializedName("show_label")
    @Nullable
    private String showLabel;
    @SerializedName("show_text")
    @Nullable
    private String showText;
    @SerializedName("start_time")
    private long startTime;
    @SerializedName("start_time_text")
    @Nullable
    private String startTimeText;

    public PromotionAppointment() {
        this(0, 0, null, null, null, false, 0, 127, null);
    }

    public static /* synthetic */ PromotionAppointment copy$default(PromotionAppointment promotionAppointment, long j, long j2, String str, String str2, String str3, boolean z, int i, int i2, Object obj) {
        PromotionAppointment promotionAppointment2 = promotionAppointment;
        return promotionAppointment.copy((i2 & 1) != 0 ? promotionAppointment2.startTime : j, (i2 & 2) != 0 ? promotionAppointment2.serverTime : j2, (i2 & 4) != 0 ? promotionAppointment2.startTimeText : str, (i2 & 8) != 0 ? promotionAppointment2.showText : str2, (i2 & 16) != 0 ? promotionAppointment2.showLabel : str3, (i2 & 32) != 0 ? promotionAppointment2.isAppointment : z, (i2 & 64) != 0 ? promotionAppointment2.appointmentNum : i);
    }

    public final long component1() {
        return this.startTime;
    }

    public final long component2() {
        return this.serverTime;
    }

    @Nullable
    public final String component3() {
        return this.startTimeText;
    }

    @Nullable
    public final String component4() {
        return this.showText;
    }

    @Nullable
    public final String component5() {
        return this.showLabel;
    }

    public final boolean component6() {
        return this.isAppointment;
    }

    public final int component7() {
        return this.appointmentNum;
    }

    @NotNull
    public final PromotionAppointment copy(long j, long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, this, changeQuickRedirect, false, 29860, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE}, PromotionAppointment.class)) {
            return (PromotionAppointment) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Byte.valueOf(z), Integer.valueOf(i)}, this, changeQuickRedirect, false, 29860, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Boolean.TYPE, Integer.TYPE}, PromotionAppointment.class);
        }
        PromotionAppointment promotionAppointment = new PromotionAppointment(j, j2, str, str2, str3, z, i);
        return promotionAppointment;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29863, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29863, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof PromotionAppointment) {
                PromotionAppointment promotionAppointment = (PromotionAppointment) obj;
                if (this.startTime == promotionAppointment.startTime) {
                    if ((this.serverTime == promotionAppointment.serverTime) && Intrinsics.areEqual((Object) this.startTimeText, (Object) promotionAppointment.startTimeText) && Intrinsics.areEqual((Object) this.showText, (Object) promotionAppointment.showText) && Intrinsics.areEqual((Object) this.showLabel, (Object) promotionAppointment.showLabel)) {
                        if (this.isAppointment == promotionAppointment.isAppointment) {
                            if (this.appointmentNum == promotionAppointment.appointmentNum) {
                                return true;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29862, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29862, new Class[0], Integer.TYPE)).intValue();
        }
        long j = this.startTime;
        long j2 = this.serverTime;
        int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31;
        String str = this.startTimeText;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.showText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.showLabel;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i3 = (hashCode2 + i) * 31;
        boolean z = this.isAppointment;
        if (z) {
            z = true;
        }
        return ((i3 + (z ? 1 : 0)) * 31) + this.appointmentNum;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29861, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29861, new Class[0], String.class);
        }
        return "PromotionAppointment(startTime=" + this.startTime + ", serverTime=" + this.serverTime + ", startTimeText=" + this.startTimeText + ", showText=" + this.showText + ", showLabel=" + this.showLabel + ", isAppointment=" + this.isAppointment + ", appointmentNum=" + this.appointmentNum + ")";
    }

    public final int getAppointmentNum() {
        return this.appointmentNum;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    @Nullable
    public final String getShowLabel() {
        return this.showLabel;
    }

    @Nullable
    public final String getShowText() {
        return this.showText;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getStartTimeText() {
        return this.startTimeText;
    }

    public final boolean isAppointment() {
        return this.isAppointment;
    }

    public final void setAppointment(boolean z) {
        this.isAppointment = z;
    }

    public final void setAppointmentNum(int i) {
        this.appointmentNum = i;
    }

    public final void setServerTime(long j) {
        this.serverTime = j;
    }

    public final void setShowLabel(@Nullable String str) {
        this.showLabel = str;
    }

    public final void setShowText(@Nullable String str) {
        this.showText = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStartTimeText(@Nullable String str) {
        this.startTimeText = str;
    }

    public PromotionAppointment(long j, long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i) {
        this.startTime = j;
        this.serverTime = j2;
        this.startTimeText = str;
        this.showText = str2;
        this.showLabel = str3;
        this.isAppointment = z;
        this.appointmentNum = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PromotionAppointment(long r11, long r13, java.lang.String r15, java.lang.String r16, java.lang.String r17, boolean r18, int r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r1 = r20 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0008
            r4 = r2
            goto L_0x0009
        L_0x0008:
            r4 = r11
        L_0x0009:
            r1 = r20 & 2
            if (r1 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = r13
        L_0x000f:
            r1 = r20 & 4
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = ""
            goto L_0x0017
        L_0x0016:
            r1 = r15
        L_0x0017:
            r6 = r20 & 8
            if (r6 == 0) goto L_0x001e
            java.lang.String r6 = ""
            goto L_0x0020
        L_0x001e:
            r6 = r16
        L_0x0020:
            r7 = r20 & 16
            if (r7 == 0) goto L_0x0027
            java.lang.String r7 = ""
            goto L_0x0029
        L_0x0027:
            r7 = r17
        L_0x0029:
            r8 = r20 & 32
            r9 = 0
            if (r8 == 0) goto L_0x0030
            r8 = 0
            goto L_0x0032
        L_0x0030:
            r8 = r18
        L_0x0032:
            r0 = r20 & 64
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r9 = r19
        L_0x0039:
            r11 = r10
            r12 = r4
            r14 = r2
            r16 = r1
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r11.<init>(r12, r14, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.PromotionAppointment.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
