package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010'\u001a\u00020\tHÆ\u0003JD\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/SkuItem;", "Ljava/io/Serializable;", "id", "", "stockNum", "", "price", "userLimit", "isActivity", "", "(Ljava/lang/String;IILjava/lang/Integer;Z)V", "canSelect", "getCanSelect", "()Z", "setCanSelect", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "imageUrl", "getImageUrl", "setImageUrl", "setActivity", "getPrice", "()I", "setPrice", "(I)V", "getStockNum", "setStockNum", "getUserLimit", "()Ljava/lang/Integer;", "setUserLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;IILjava/lang/Integer;Z)Lcom/ss/android/ugc/aweme/commerce/service/models/SkuItem;", "equals", "other", "", "hashCode", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class z implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean canSelect;
    @SerializedName("id")
    @Nullable
    private String id;
    @Nullable
    private String imageUrl;
    @SerializedName("is_activity")
    private boolean isActivity;
    @SerializedName("price")
    private int price;
    @SerializedName("stock_num")
    private int stockNum;
    @SerializedName("user_limit")
    @Nullable
    private Integer userLimit;

    public static /* synthetic */ z copy$default(z zVar, String str, int i, int i2, Integer num, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = zVar.id;
        }
        if ((i3 & 2) != 0) {
            i = zVar.stockNum;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = zVar.price;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            num = zVar.userLimit;
        }
        Integer num2 = num;
        if ((i3 & 16) != 0) {
            z = zVar.isActivity;
        }
        return zVar.copy(str, i4, i5, num2, z);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.stockNum;
    }

    public final int component3() {
        return this.price;
    }

    @Nullable
    public final Integer component4() {
        return this.userLimit;
    }

    public final boolean component5() {
        return this.isActivity;
    }

    @NotNull
    public final z copy(@Nullable String str, int i, int i2, @Nullable Integer num, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), num, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 29885, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.class, Boolean.TYPE}, z.class)) {
            return (z) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), num, Byte.valueOf(z)}, this, changeQuickRedirect, false, 29885, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.class, Boolean.TYPE}, z.class);
        }
        z zVar = new z(str, i, i2, num, z);
        return zVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29888, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29888, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                if (Intrinsics.areEqual((Object) this.id, (Object) zVar.id)) {
                    if (this.stockNum == zVar.stockNum) {
                        if ((this.price == zVar.price) && Intrinsics.areEqual((Object) this.userLimit, (Object) zVar.userLimit)) {
                            if (this.isActivity == zVar.isActivity) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29887, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29887, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.id;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.stockNum) * 31) + this.price) * 31;
        Integer num = this.userLimit;
        if (num != null) {
            i = num.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.isActivity;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29886, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29886, new Class[0], String.class);
        }
        return "SkuItem(id=" + this.id + ", stockNum=" + this.stockNum + ", price=" + this.price + ", userLimit=" + this.userLimit + ", isActivity=" + this.isActivity + ")";
    }

    public final boolean getCanSelect() {
        return this.canSelect;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getStockNum() {
        return this.stockNum;
    }

    @Nullable
    public final Integer getUserLimit() {
        return this.userLimit;
    }

    public final boolean isActivity() {
        return this.isActivity;
    }

    public final void setActivity(boolean z) {
        this.isActivity = z;
    }

    public final void setCanSelect(boolean z) {
        this.canSelect = z;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setStockNum(int i) {
        this.stockNum = i;
    }

    public final void setUserLimit(@Nullable Integer num) {
        this.userLimit = num;
    }

    public z(@Nullable String str, int i, int i2, @Nullable Integer num, boolean z) {
        this.id = str;
        this.stockNum = i;
        this.price = i2;
        this.userLimit = num;
        this.isActivity = z;
        this.canSelect = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ z(java.lang.String r7, int r8, int r9, java.lang.Integer r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 8
            if (r13 == 0) goto L_0x0005
            r10 = 0
        L_0x0005:
            r4 = r10
            r10 = r12 & 16
            if (r10 == 0) goto L_0x000d
            r11 = 0
            r5 = 0
            goto L_0x000e
        L_0x000d:
            r5 = r11
        L_0x000e:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.models.z.<init>(java.lang.String, int, int, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
