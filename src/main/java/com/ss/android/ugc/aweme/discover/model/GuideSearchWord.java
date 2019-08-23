package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/GuideSearchWord;", "Ljava/io/Serializable;", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "type", "getType", "setType", "word", "getWord", "setWord", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GuideSearchWord implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    @Nullable
    private String id;
    @SerializedName("type")
    @Nullable
    private String type;
    @SerializedName("word")
    @Nullable
    private String word;

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getWord() {
        return this.word;
    }

    @NotNull
    public final String toString() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37052, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37052, new Class[0], String.class);
        }
        if (this.word != null) {
            str = this.word;
            if (str == null) {
                Intrinsics.throwNpe();
                return str;
            }
        } else {
            str = "";
        }
        return str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setWord(@Nullable String str) {
        this.word = str;
    }
}
