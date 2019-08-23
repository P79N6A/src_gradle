package com.ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/suggest/TypeWords;", "", "()V", "source", "", "getSource", "()Ljava/lang/String;", "type", "getType", "words", "", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "getWords", "()Ljava/util/List;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TypeWords {
    @SerializedName("source")
    @Nullable
    public final String source;
    @SerializedName("type")
    @Nullable
    public final String type;
    @SerializedName("words")
    @Nullable
    public final List<Word> words;
}
