package com.ss.android.ugc.aweme.commerce.service.models;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionMarketFloor;", "Ljava/io/Serializable;", "title", "", "name", "url", "tma_url", "icon", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "getIcon", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setIcon", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getTma_url", "setTma_url", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class PromotionMarketFloor implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("icon")
    @Nullable
    private UrlModel icon;
    @SerializedName("name")
    @Nullable
    private String name;
    @SerializedName("title")
    @Nullable
    private String title;
    @SerializedName("tma_url")
    @Nullable
    private String tma_url;
    @SerializedName("url")
    @Nullable
    private String url;

    public PromotionMarketFloor() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PromotionMarketFloor copy$default(PromotionMarketFloor promotionMarketFloor, String str, String str2, String str3, String str4, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotionMarketFloor.title;
        }
        if ((i & 2) != 0) {
            str2 = promotionMarketFloor.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = promotionMarketFloor.url;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = promotionMarketFloor.tma_url;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            urlModel = promotionMarketFloor.icon;
        }
        return promotionMarketFloor.copy(str, str5, str6, str7, urlModel);
    }

    @Nullable
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.url;
    }

    @Nullable
    public final String component4() {
        return this.tma_url;
    }

    @Nullable
    public final UrlModel component5() {
        return this.icon;
    }

    @NotNull
    public final PromotionMarketFloor copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, urlModel}, this, changeQuickRedirect, false, 29864, new Class[]{String.class, String.class, String.class, String.class, UrlModel.class}, PromotionMarketFloor.class)) {
            return (PromotionMarketFloor) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4, urlModel}, this, changeQuickRedirect, false, 29864, new Class[]{String.class, String.class, String.class, String.class, UrlModel.class}, PromotionMarketFloor.class);
        }
        PromotionMarketFloor promotionMarketFloor = new PromotionMarketFloor(str, str2, str3, str4, urlModel);
        return promotionMarketFloor;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29867, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29867, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof PromotionMarketFloor) {
                PromotionMarketFloor promotionMarketFloor = (PromotionMarketFloor) obj;
                if (!Intrinsics.areEqual((Object) this.title, (Object) promotionMarketFloor.title) || !Intrinsics.areEqual((Object) this.name, (Object) promotionMarketFloor.name) || !Intrinsics.areEqual((Object) this.url, (Object) promotionMarketFloor.url) || !Intrinsics.areEqual((Object) this.tma_url, (Object) promotionMarketFloor.tma_url) || !Intrinsics.areEqual((Object) this.icon, (Object) promotionMarketFloor.icon)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29866, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29866, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.title;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.tma_url;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29865, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29865, new Class[0], String.class);
        }
        return "PromotionMarketFloor(title=" + this.title + ", name=" + this.name + ", url=" + this.url + ", tma_url=" + this.tma_url + ", icon=" + this.icon + ")";
    }

    @Nullable
    public final UrlModel getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTma_url() {
        return this.tma_url;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setIcon(@Nullable UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTma_url(@Nullable String str) {
        this.tma_url = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }

    public PromotionMarketFloor(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable UrlModel urlModel) {
        this.title = str;
        this.name = str2;
        this.url = str3;
        this.tma_url = str4;
        this.icon = urlModel;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PromotionMarketFloor(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, com.ss.android.ugc.aweme.base.model.UrlModel r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = ""
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.lang.String r5 = ""
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            java.lang.String r6 = ""
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            java.lang.String r7 = ""
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0020
            r8 = 0
        L_0x0020:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
