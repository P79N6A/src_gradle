package com.ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftGuide;", "Ljava/io/Serializable;", "desc", "", "imageUrl", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getImageUrl", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setImageUrl", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    @NotNull
    private String desc;
    @SerializedName("icon")
    @NotNull
    private UrlModel imageUrl;

    public static /* synthetic */ d copy$default(d dVar, String str, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.desc;
        }
        if ((i & 2) != 0) {
            urlModel = dVar.imageUrl;
        }
        return dVar.copy(str, urlModel);
    }

    @NotNull
    public final String component1() {
        return this.desc;
    }

    @NotNull
    public final UrlModel component2() {
        return this.imageUrl;
    }

    @NotNull
    public final d copy(@NotNull String str, @NotNull UrlModel urlModel) {
        String str2 = str;
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{str2, urlModel2}, this, changeQuickRedirect, false, 31302, new Class[]{String.class, UrlModel.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str2, urlModel2}, this, changeQuickRedirect, false, 31302, new Class[]{String.class, UrlModel.class}, d.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "desc");
        Intrinsics.checkParameterIsNotNull(urlModel2, "imageUrl");
        return new d(str2, urlModel2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 31305, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 31305, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!Intrinsics.areEqual((Object) this.desc, (Object) dVar.desc) || !Intrinsics.areEqual((Object) this.imageUrl, (Object) dVar.imageUrl)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31304, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31304, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.desc;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.imageUrl;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 31303, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 31303, new Class[0], String.class);
        }
        return "LoftGuide(desc=" + this.desc + ", imageUrl=" + this.imageUrl + ")";
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final void setDesc(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 31300, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 31300, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.desc = str2;
    }

    public final void setImageUrl(@NotNull UrlModel urlModel) {
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, this, changeQuickRedirect, false, 31301, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2}, this, changeQuickRedirect, false, 31301, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(urlModel2, "<set-?>");
        this.imageUrl = urlModel2;
    }

    public d(@NotNull String str, @NotNull UrlModel urlModel) {
        Intrinsics.checkParameterIsNotNull(str, "desc");
        Intrinsics.checkParameterIsNotNull(urlModel, "imageUrl");
        this.desc = str;
        this.imageUrl = urlModel;
    }
}
