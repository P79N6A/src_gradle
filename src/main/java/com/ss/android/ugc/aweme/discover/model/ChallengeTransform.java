package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/ChallengeTransform;", "Ljava/io/Serializable;", "text", "", "iconUrlModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "action", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getIconUrlModel", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setIconUrlModel", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "getText", "setText", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "mainservice_release"}, k = 1, mv = {1, 1, 15})
public final class ChallengeTransform implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action")
    @Nullable
    public String action;
    @SerializedName("icon")
    @Nullable
    public UrlModel iconUrlModel;
    @SerializedName("text")
    @Nullable
    public String text;

    public ChallengeTransform() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChallengeTransform copy$default(ChallengeTransform challengeTransform, String str, UrlModel urlModel, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeTransform.text;
        }
        if ((i & 2) != 0) {
            urlModel = challengeTransform.iconUrlModel;
        }
        if ((i & 4) != 0) {
            str2 = challengeTransform.action;
        }
        return challengeTransform.copy(str, urlModel, str2);
    }

    @Nullable
    public final String component1() {
        return this.text;
    }

    @Nullable
    public final UrlModel component2() {
        return this.iconUrlModel;
    }

    @Nullable
    public final String component3() {
        return this.action;
    }

    @NotNull
    public final ChallengeTransform copy(@Nullable String str, @Nullable UrlModel urlModel, @Nullable String str2) {
        String str3 = str;
        UrlModel urlModel2 = urlModel;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, urlModel2, str4}, this, changeQuickRedirect, false, 37012, new Class[]{String.class, UrlModel.class, String.class}, ChallengeTransform.class)) {
            return new ChallengeTransform(str3, urlModel2, str4);
        }
        return (ChallengeTransform) PatchProxy.accessDispatch(new Object[]{str3, urlModel2, str4}, this, changeQuickRedirect, false, 37012, new Class[]{String.class, UrlModel.class, String.class}, ChallengeTransform.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37015, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37015, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ChallengeTransform) {
                ChallengeTransform challengeTransform = (ChallengeTransform) obj;
                if (!Intrinsics.areEqual((Object) this.text, (Object) challengeTransform.text) || !Intrinsics.areEqual((Object) this.iconUrlModel, (Object) challengeTransform.iconUrlModel) || !Intrinsics.areEqual((Object) this.action, (Object) challengeTransform.action)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37014, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37014, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.text;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.iconUrlModel;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.action;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37013, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37013, new Class[0], String.class);
        }
        return "ChallengeTransform(text=" + this.text + ", iconUrlModel=" + this.iconUrlModel + ", action=" + this.action + ")";
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final UrlModel getIconUrlModel() {
        return this.iconUrlModel;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setAction(@Nullable String str) {
        this.action = str;
    }

    public final void setIconUrlModel(@Nullable UrlModel urlModel) {
        this.iconUrlModel = urlModel;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public ChallengeTransform(@Nullable String str, @Nullable UrlModel urlModel, @Nullable String str2) {
        this.text = str;
        this.iconUrlModel = urlModel;
        this.action = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeTransform(String str, UrlModel urlModel, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : urlModel, (i & 4) != 0 ? null : str2);
    }
}
