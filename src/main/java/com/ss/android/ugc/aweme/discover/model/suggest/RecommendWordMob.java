package com.ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/suggest/RecommendWordMob;", "Ljava/io/Serializable;", "()V", "info", "", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "queryId", "getQueryId", "setQueryId", "wordsSource", "getWordsSource", "setWordsSource", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendWordMob implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("info")
    @Nullable
    private String info;
    @SerializedName("query_id")
    @Nullable
    private String queryId;
    @SerializedName("words_source")
    @Nullable
    private String wordsSource;

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final String getQueryId() {
        return this.queryId;
    }

    @Nullable
    public final String getWordsSource() {
        return this.wordsSource;
    }

    public final void setInfo(@Nullable String str) {
        this.info = str;
    }

    public final void setQueryId(@Nullable String str) {
        this.queryId = str;
    }

    public final void setWordsSource(@Nullable String str) {
        this.wordsSource = str;
    }
}
