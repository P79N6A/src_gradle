package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/CommerceChallengeBanner;", "Ljava/io/Serializable;", "icon", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "webUrl", "", "openUrl", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getOpenUrl", "()Ljava/lang/String;", "getWebUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mainservice_release"}, k = 1, mv = {1, 1, 15})
public final class CommerceChallengeBanner implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("icon")
    @NotNull
    private final UrlModel icon;
    @SerializedName("open_url")
    @NotNull
    private final String openUrl;
    @SerializedName("web_url")
    @NotNull
    private final String webUrl;

    public static /* synthetic */ CommerceChallengeBanner copy$default(CommerceChallengeBanner commerceChallengeBanner, UrlModel urlModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = commerceChallengeBanner.icon;
        }
        if ((i & 2) != 0) {
            str = commerceChallengeBanner.webUrl;
        }
        if ((i & 4) != 0) {
            str2 = commerceChallengeBanner.openUrl;
        }
        return commerceChallengeBanner.copy(urlModel, str, str2);
    }

    @NotNull
    public final UrlModel component1() {
        return this.icon;
    }

    @NotNull
    public final String component2() {
        return this.webUrl;
    }

    @NotNull
    public final String component3() {
        return this.openUrl;
    }

    @NotNull
    public final CommerceChallengeBanner copy(@NotNull UrlModel urlModel, @NotNull String str, @NotNull String str2) {
        UrlModel urlModel2 = urlModel;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{urlModel2, str3, str4}, this, changeQuickRedirect, false, 37016, new Class[]{UrlModel.class, String.class, String.class}, CommerceChallengeBanner.class)) {
            return (CommerceChallengeBanner) PatchProxy.accessDispatch(new Object[]{urlModel2, str3, str4}, this, changeQuickRedirect, false, 37016, new Class[]{UrlModel.class, String.class, String.class}, CommerceChallengeBanner.class);
        }
        Intrinsics.checkParameterIsNotNull(urlModel2, "icon");
        Intrinsics.checkParameterIsNotNull(str3, "webUrl");
        Intrinsics.checkParameterIsNotNull(str4, "openUrl");
        return new CommerceChallengeBanner(urlModel2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37019, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37019, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof CommerceChallengeBanner) {
                CommerceChallengeBanner commerceChallengeBanner = (CommerceChallengeBanner) obj;
                if (!Intrinsics.areEqual((Object) this.icon, (Object) commerceChallengeBanner.icon) || !Intrinsics.areEqual((Object) this.webUrl, (Object) commerceChallengeBanner.webUrl) || !Intrinsics.areEqual((Object) this.openUrl, (Object) commerceChallengeBanner.openUrl)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37018, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37018, new Class[0], Integer.TYPE)).intValue();
        }
        UrlModel urlModel = this.icon;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.webUrl;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.openUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37017, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37017, new Class[0], String.class);
        }
        return "CommerceChallengeBanner(icon=" + this.icon + ", webUrl=" + this.webUrl + ", openUrl=" + this.openUrl + ")";
    }

    @NotNull
    public final UrlModel getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getOpenUrl() {
        return this.openUrl;
    }

    @NotNull
    public final String getWebUrl() {
        return this.webUrl;
    }

    public CommerceChallengeBanner(@NotNull UrlModel urlModel, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(urlModel, "icon");
        Intrinsics.checkParameterIsNotNull(str, "webUrl");
        Intrinsics.checkParameterIsNotNull(str2, "openUrl");
        this.icon = urlModel;
        this.webUrl = str;
        this.openUrl = str2;
    }
}
