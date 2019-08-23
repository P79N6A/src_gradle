package com.ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "Ljava/io/Serializable;", "()V", "id", "", "getId", "()Ljava/lang/String;", "isShowed", "", "()Z", "setShowed", "(Z)V", "word", "getWord", "wordPosition", "", "getWordPosition", "()I", "wordSource", "getWordSource", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class Word implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(alternate = {"group_id"}, value = "id")
    @Nullable
    private final String id;
    private boolean isShowed;
    @SerializedName(alternate = {"words_content"}, value = "word")
    @Nullable
    private final String word;
    @SerializedName("words_position")
    private final int wordPosition;
    @SerializedName("words_source")
    @Nullable
    private final String wordSource;

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getWord() {
        return this.word;
    }

    public final int getWordPosition() {
        return this.wordPosition;
    }

    @Nullable
    public final String getWordSource() {
        return this.wordSource;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }
}
