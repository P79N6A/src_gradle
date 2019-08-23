package com.ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/miniapp_api/model/MiniAppCard;", "Ljava/io/Serializable;", "imageUrl", "", "text", "waitTime", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "getText", "setText", "getWaitTime", "()I", "setWaitTime", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "miniapp_api_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("image_url")
    @NotNull
    public String imageUrl;
    @SerializedName("text")
    @NotNull
    public String text;
    @SerializedName("wait_time")
    public int waitTime;

    public static /* synthetic */ h copy$default(h hVar, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hVar.imageUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = hVar.text;
        }
        if ((i2 & 4) != 0) {
            i = hVar.waitTime;
        }
        return hVar.copy(str, str2, i);
    }

    @NotNull
    public final String component1() {
        return this.imageUrl;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    public final int component3() {
        return this.waitTime;
    }

    @NotNull
    public final h copy(@NotNull String str, @NotNull String str2, int i) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i)}, this, changeQuickRedirect, false, 59638, new Class[]{String.class, String.class, Integer.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i)}, this, changeQuickRedirect, false, 59638, new Class[]{String.class, String.class, Integer.TYPE}, h.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "imageUrl");
        Intrinsics.checkParameterIsNotNull(str4, "text");
        return new h(str3, str4, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 59641, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 59641, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (Intrinsics.areEqual((Object) this.imageUrl, (Object) hVar.imageUrl) && Intrinsics.areEqual((Object) this.text, (Object) hVar.text)) {
                    if (this.waitTime == hVar.waitTime) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 59640, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 59640, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.imageUrl;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.waitTime;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 59639, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 59639, new Class[0], String.class);
        }
        return "MiniAppCard(imageUrl=" + this.imageUrl + ", text=" + this.text + ", waitTime=" + this.waitTime + ")";
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final void setWaitTime(int i) {
        this.waitTime = i;
    }

    public final void setImageUrl(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 59636, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 59636, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.imageUrl = str2;
    }

    public final void setText(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 59637, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 59637, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.text = str2;
    }

    public h(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "imageUrl");
        Intrinsics.checkParameterIsNotNull(str2, "text");
        this.imageUrl = str;
        this.text = str2;
        this.waitTime = i;
    }
}
