package com.ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b)\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010'\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftAnimationRes;", "Ljava/io/Serializable;", "()V", "backgroundUri", "", "getBackgroundUri", "()Ljava/lang/String;", "setBackgroundUri", "(Ljava/lang/String;)V", "downloadUrl", "getDownloadUrl", "setDownloadUrl", "endColor", "getEndColor", "setEndColor", "floatLeftBottomUri", "getFloatLeftBottomUri", "setFloatLeftBottomUri", "floatLeftTopUri", "getFloatLeftTopUri", "setFloatLeftTopUri", "floatRightBottomUri", "getFloatRightBottomUri", "setFloatRightBottomUri", "floatRightTopUri", "getFloatRightTopUri", "setFloatRightTopUri", "goodsBackgroundUri", "getGoodsBackgroundUri", "setGoodsBackgroundUri", "goodsUri", "getGoodsUri", "setGoodsUri", "logoLeftUri", "getLogoLeftUri", "setLogoLeftUri", "logoRightUri", "getLogoRightUri", "setLogoRightUri", "startColor", "getStartColor", "setStartColor", "timeDesc", "getTimeDesc", "setTimeDesc", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private String backgroundUri;
    @SerializedName("image_src")
    @NotNull
    private String downloadUrl = "";
    @SerializedName("end_color")
    @NotNull
    private String endColor = "#2c016d";
    @Nullable
    private String floatLeftBottomUri;
    @Nullable
    private String floatLeftTopUri;
    @Nullable
    private String floatRightBottomUri;
    @Nullable
    private String floatRightTopUri;
    @Nullable
    private String goodsBackgroundUri;
    @Nullable
    private String goodsUri;
    @Nullable
    private String logoLeftUri;
    @Nullable
    private String logoRightUri;
    @SerializedName("start_color")
    @NotNull
    private String startColor = "#ccaaff";
    @SerializedName("activity_time")
    @NotNull
    private String timeDesc = "";

    @Nullable
    public final String getBackgroundUri() {
        return this.backgroundUri;
    }

    @NotNull
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @NotNull
    public final String getEndColor() {
        return this.endColor;
    }

    @Nullable
    public final String getFloatLeftBottomUri() {
        return this.floatLeftBottomUri;
    }

    @Nullable
    public final String getFloatLeftTopUri() {
        return this.floatLeftTopUri;
    }

    @Nullable
    public final String getFloatRightBottomUri() {
        return this.floatRightBottomUri;
    }

    @Nullable
    public final String getFloatRightTopUri() {
        return this.floatRightTopUri;
    }

    @Nullable
    public final String getGoodsBackgroundUri() {
        return this.goodsBackgroundUri;
    }

    @Nullable
    public final String getGoodsUri() {
        return this.goodsUri;
    }

    @Nullable
    public final String getLogoLeftUri() {
        return this.logoLeftUri;
    }

    @Nullable
    public final String getLogoRightUri() {
        return this.logoRightUri;
    }

    @NotNull
    public final String getStartColor() {
        return this.startColor;
    }

    @NotNull
    public final String getTimeDesc() {
        return this.timeDesc;
    }

    public final void setBackgroundUri(@Nullable String str) {
        this.backgroundUri = str;
    }

    public final void setFloatLeftBottomUri(@Nullable String str) {
        this.floatLeftBottomUri = str;
    }

    public final void setFloatLeftTopUri(@Nullable String str) {
        this.floatLeftTopUri = str;
    }

    public final void setFloatRightBottomUri(@Nullable String str) {
        this.floatRightBottomUri = str;
    }

    public final void setFloatRightTopUri(@Nullable String str) {
        this.floatRightTopUri = str;
    }

    public final void setGoodsBackgroundUri(@Nullable String str) {
        this.goodsBackgroundUri = str;
    }

    public final void setGoodsUri(@Nullable String str) {
        this.goodsUri = str;
    }

    public final void setLogoLeftUri(@Nullable String str) {
        this.logoLeftUri = str;
    }

    public final void setLogoRightUri(@Nullable String str) {
        this.logoRightUri = str;
    }

    public final void setDownloadUrl(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 31284, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 31284, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.downloadUrl = str2;
    }

    public final void setEndColor(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 31286, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 31286, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.endColor = str2;
    }

    public final void setStartColor(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 31285, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 31285, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.startColor = str2;
    }

    public final void setTimeDesc(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 31287, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 31287, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.timeDesc = str2;
    }
}
