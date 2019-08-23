package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/music/model/ExternalMusicInfo;", "Ljava/io/Serializable;", "()V", "externalSongKey", "", "getExternalSongKey", "()Ljava/lang/String;", "setExternalSongKey", "(Ljava/lang/String;)V", "jumpUrl", "getJumpUrl", "setJumpUrl", "partnerName", "getPartnerName", "setPartnerName", "partnerSongId", "getPartnerSongId", "setPartnerSongId", "mainservice_release"}, k = 1, mv = {1, 1, 15})
public final class ExternalMusicInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("external_song_key")
    @Nullable
    public String externalSongKey;
    @SerializedName("h5_url")
    @Nullable
    public String jumpUrl;
    @SerializedName("partner_name")
    @Nullable
    public String partnerName;
    @SerializedName("partner_song_id")
    @Nullable
    public String partnerSongId;

    @Nullable
    public final String getExternalSongKey() {
        return this.externalSongKey;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getPartnerName() {
        return this.partnerName;
    }

    @Nullable
    public final String getPartnerSongId() {
        return this.partnerSongId;
    }

    public final void setExternalSongKey(@Nullable String str) {
        this.externalSongKey = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setPartnerName(@Nullable String str) {
        this.partnerName = str;
    }

    public final void setPartnerSongId(@Nullable String str) {
        this.partnerSongId = str;
    }
}
