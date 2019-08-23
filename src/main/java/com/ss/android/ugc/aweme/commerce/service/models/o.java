package com.ss.android.ugc.aweme.commerce.service.models;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u0006\u0010'\u001a\u00020(J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J{\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00104\u001a\u00020(2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001e\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionActivity;", "Ljava/io/Serializable;", "text", "", "icon", "url", "detailText", "title", "startTime", "", "endTime", "serverTime", "cardImage", "logo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;)V", "getCardImage", "()Ljava/lang/String;", "setCardImage", "(Ljava/lang/String;)V", "getDetailText", "setDetailText", "getEndTime", "()J", "setEndTime", "(J)V", "getIcon", "setIcon", "getLogo", "setLogo", "getServerTime", "setServerTime", "getStartTime", "setStartTime", "getText", "setText", "getTitle", "setTitle", "getUrl", "setUrl", "canBeShown", "", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class o implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("card_image")
    @Nullable
    private String cardImage;
    @SerializedName("detail_text")
    @Nullable
    private String detailText;
    @SerializedName("end_time")
    private long endTime;
    @SerializedName("icon")
    @Nullable
    private String icon;
    @SerializedName("logo")
    @Nullable
    private String logo;
    @SerializedName("server_time")
    private long serverTime;
    @SerializedName("start_time")
    private long startTime;
    @SerializedName("text")
    @Nullable
    private String text;
    @SerializedName("title")
    @Nullable
    private String title;
    @SerializedName("url")
    @Nullable
    private String url;

    public o() {
        this(null, null, null, null, null, 0, 0, 0, null, null, 1023, null);
    }

    public static /* synthetic */ o copy$default(o oVar, String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, String str6, String str7, int i, Object obj) {
        o oVar2 = oVar;
        int i2 = i;
        return oVar.copy((i2 & 1) != 0 ? oVar2.text : str, (i2 & 2) != 0 ? oVar2.icon : str2, (i2 & 4) != 0 ? oVar2.url : str3, (i2 & 8) != 0 ? oVar2.detailText : str4, (i2 & 16) != 0 ? oVar2.title : str5, (i2 & 32) != 0 ? oVar2.startTime : j, (i2 & 64) != 0 ? oVar2.endTime : j2, (i2 & SearchJediMixFeedAdapter.f42517f) != 0 ? oVar2.serverTime : j3, (i2 & 256) != 0 ? oVar2.cardImage : str6, (i2 & 512) != 0 ? oVar2.logo : str7);
    }

    @Nullable
    public final String component1() {
        return this.text;
    }

    @Nullable
    public final String component10() {
        return this.logo;
    }

    @Nullable
    public final String component2() {
        return this.icon;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final String component4() {
        return this.detailText;
    }

    @Nullable
    public final String component5() {
        return this.title;
    }

    public final long component6() {
        return this.startTime;
    }

    public final long component7() {
        return this.endTime;
    }

    public final long component8() {
        return this.serverTime;
    }

    @Nullable
    public final String component9() {
        return this.cardImage;
    }

    @NotNull
    public final o copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j, long j2, long j3, @Nullable String str6, @Nullable String str7) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5, new Long(j4), new Long(j5), new Long(j6), str6, str7}, this, changeQuickRedirect, false, 29856, new Class[]{String.class, String.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class}, o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4, str5, new Long(j4), new Long(j5), new Long(j6), str6, str7}, this, changeQuickRedirect, false, 29856, new Class[]{String.class, String.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Long.TYPE, String.class, String.class}, o.class);
        }
        o oVar = new o(str, str2, str3, str4, str5, j, j2, j3, str6, str7);
        return oVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29859, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29859, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (Intrinsics.areEqual((Object) this.text, (Object) oVar.text) && Intrinsics.areEqual((Object) this.icon, (Object) oVar.icon) && Intrinsics.areEqual((Object) this.url, (Object) oVar.url) && Intrinsics.areEqual((Object) this.detailText, (Object) oVar.detailText) && Intrinsics.areEqual((Object) this.title, (Object) oVar.title)) {
                    if (this.startTime == oVar.startTime) {
                        if (this.endTime == oVar.endTime) {
                            if (!(this.serverTime == oVar.serverTime) || !Intrinsics.areEqual((Object) this.cardImage, (Object) oVar.cardImage) || !Intrinsics.areEqual((Object) this.logo, (Object) oVar.logo)) {
                                return false;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29858, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29858, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.text;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.icon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.detailText;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.title;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        long j = this.startTime;
        long j2 = this.endTime;
        long j3 = this.serverTime;
        int i2 = (((((((hashCode4 + hashCode5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str6 = this.cardImage;
        int hashCode6 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.logo;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29857, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29857, new Class[0], String.class);
        }
        return "PromotionActivity(text=" + this.text + ", icon=" + this.icon + ", url=" + this.url + ", detailText=" + this.detailText + ", title=" + this.title + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", serverTime=" + this.serverTime + ", cardImage=" + this.cardImage + ", logo=" + this.logo + ")";
    }

    @Nullable
    public final String getCardImage() {
        return this.cardImage;
    }

    @Nullable
    public final String getDetailText() {
        return this.detailText;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean canBeShown() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29855, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29855, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.text)) {
            z = true;
        }
        return z;
    }

    public final void setCardImage(@Nullable String str) {
        this.cardImage = str;
    }

    public final void setDetailText(@Nullable String str) {
        this.detailText = str;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final void setServerTime(long j) {
        this.serverTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public o(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j, long j2, long j3, @Nullable String str6, @Nullable String str7) {
        this.text = str;
        this.icon = str2;
        this.url = str3;
        this.detailText = str4;
        this.title = str5;
        this.startTime = j;
        this.endTime = j2;
        this.serverTime = j3;
        this.cardImage = str6;
        this.logo = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ o(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, long r19, long r21, long r23, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r13 = this;
            r0 = r27
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = ""
            goto L_0x0012
        L_0x0011:
            r2 = r15
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = ""
            goto L_0x001b
        L_0x0019:
            r3 = r16
        L_0x001b:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0022
            java.lang.String r4 = ""
            goto L_0x0024
        L_0x0022:
            r4 = r17
        L_0x0024:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002b
            java.lang.String r5 = ""
            goto L_0x002d
        L_0x002b:
            r5 = r18
        L_0x002d:
            r6 = r0 & 32
            r7 = 0
            if (r6 == 0) goto L_0x0035
            r9 = r7
            goto L_0x0037
        L_0x0035:
            r9 = r19
        L_0x0037:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x003d
            r11 = r7
            goto L_0x003f
        L_0x003d:
            r11 = r21
        L_0x003f:
            r6 = r0 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r7 = r23
        L_0x0046:
            r6 = r0 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x004d
            java.lang.String r6 = ""
            goto L_0x004f
        L_0x004d:
            r6 = r25
        L_0x004f:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = ""
            goto L_0x0058
        L_0x0056:
            r0 = r26
        L_0x0058:
            r14 = r13
            r15 = r1
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r9
            r22 = r11
            r24 = r7
            r26 = r6
            r27 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r22, r24, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.o.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long, long, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
