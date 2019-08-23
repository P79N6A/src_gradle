package com.ss.android.ugc.aweme.commerce.live;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/live/HalfBoxParams;", "Ljava/io/Serializable;", "halfHeight", "", "url", "", "corner", "", "bgColor", "enableDrag", "", "(ILjava/lang/String;FIZ)V", "getBgColor", "()I", "setBgColor", "(I)V", "getCorner", "()F", "setCorner", "(F)V", "getEnableDrag", "()Z", "setEnableDrag", "(Z)V", "getHalfHeight", "setHalfHeight", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int bgColor;
    private float corner;
    private boolean enableDrag;
    private int halfHeight;
    @NotNull
    private String url;

    public static /* synthetic */ b copy$default(b bVar, int i, String str, float f2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bVar.halfHeight;
        }
        if ((i3 & 2) != 0) {
            str = bVar.url;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            f2 = bVar.corner;
        }
        float f3 = f2;
        if ((i3 & 8) != 0) {
            i2 = bVar.bgColor;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            z = bVar.enableDrag;
        }
        return bVar.copy(i, str2, f3, i4, z);
    }

    public final int component1() {
        return this.halfHeight;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    public final float component3() {
        return this.corner;
    }

    public final int component4() {
        return this.bgColor;
    }

    public final boolean component5() {
        return this.enableDrag;
    }

    @NotNull
    public final b copy(int i, @NotNull String str, float f2, int i2, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Float.valueOf(f2), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 28231, new Class[]{Integer.TYPE, String.class, Float.TYPE, Integer.TYPE, Boolean.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Float.valueOf(f2), Integer.valueOf(i2), Byte.valueOf(z)}, this, changeQuickRedirect, false, 28231, new Class[]{Integer.TYPE, String.class, Float.TYPE, Integer.TYPE, Boolean.TYPE}, b.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        b bVar = new b(i, str, f2, i2, z);
        return bVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 28234, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 28234, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if ((this.halfHeight == bVar.halfHeight) && Intrinsics.areEqual((Object) this.url, (Object) bVar.url) && Float.compare(this.corner, bVar.corner) == 0) {
                    if (this.bgColor == bVar.bgColor) {
                        if (this.enableDrag == bVar.enableDrag) {
                            return true;
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28233, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28233, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.halfHeight * 31;
        String str = this.url;
        if (str != null) {
            i = str.hashCode();
        }
        int floatToIntBits = (((((i2 + i) * 31) + Float.floatToIntBits(this.corner)) * 31) + this.bgColor) * 31;
        boolean z = this.enableDrag;
        if (z) {
            z = true;
        }
        return floatToIntBits + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28232, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28232, new Class[0], String.class);
        }
        return "HalfBoxParams(halfHeight=" + this.halfHeight + ", url=" + this.url + ", corner=" + this.corner + ", bgColor=" + this.bgColor + ", enableDrag=" + this.enableDrag + ")";
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final float getCorner() {
        return this.corner;
    }

    public final boolean getEnableDrag() {
        return this.enableDrag;
    }

    public final int getHalfHeight() {
        return this.halfHeight;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setBgColor(int i) {
        this.bgColor = i;
    }

    public final void setCorner(float f2) {
        this.corner = f2;
    }

    public final void setEnableDrag(boolean z) {
        this.enableDrag = z;
    }

    public final void setHalfHeight(int i) {
        this.halfHeight = i;
    }

    public final void setUrl(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 28230, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 28230, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.url = str2;
    }

    public b(int i, @NotNull String str, float f2, int i2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        this.halfHeight = i;
        this.url = str;
        this.corner = f2;
        this.bgColor = i2;
        this.enableDrag = z;
    }
}
