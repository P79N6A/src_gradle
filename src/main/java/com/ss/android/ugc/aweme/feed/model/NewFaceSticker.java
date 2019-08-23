package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/model/NewFaceSticker;", "Ljava/io/Serializable;", "()V", "desc", "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "effectId", "getEffectId", "setEffectId", "iconUrl", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getIconUrl", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "setIconUrl", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;)V", "id", "getId", "setId", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "getLogPb", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "setLogPb", "(Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "name", "getName", "setName", "ownerId", "getOwnerId", "setOwnerId", "ownerNickName", "getOwnerNickName", "setOwnerNickName", "userCount", "", "getUserCount", "()I", "setUserCount", "(I)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class NewFaceSticker implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    @Nullable
    private String desc;
    @SerializedName("effect_id")
    @Nullable
    private String effectId;
    @SerializedName("icon_url")
    @Nullable
    private UrlModel iconUrl;
    @SerializedName("id")
    @Nullable
    private String id;
    @SerializedName("log_pb")
    @Nullable
    private LogPbBean logPb;
    @SerializedName("name")
    @Nullable
    private String name;
    @SerializedName("owner_id")
    @Nullable
    private String ownerId;
    @SerializedName("owner_nickname")
    @Nullable
    private String ownerNickName;
    @SerializedName("user_count")
    private int userCount;

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final String getEffectId() {
        return this.effectId;
    }

    @Nullable
    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getOwnerId() {
        return this.ownerId;
    }

    @Nullable
    public final String getOwnerNickName() {
        return this.ownerNickName;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setEffectId(@Nullable String str) {
        this.effectId = str;
    }

    public final void setIconUrl(@Nullable UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLogPb(@Nullable LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOwnerId(@Nullable String str) {
        this.ownerId = str;
    }

    public final void setOwnerNickName(@Nullable String str) {
        this.ownerNickName = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }
}
