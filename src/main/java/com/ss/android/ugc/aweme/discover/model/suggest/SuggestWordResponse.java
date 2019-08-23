package com.ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\t8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestWordResponse;", "", "()V", "data", "", "Lcom/ss/android/ugc/aweme/discover/model/suggest/TypeWords;", "getData", "()Ljava/util/List;", "errno", "", "getErrno", "()I", "msg", "", "getMsg", "()Ljava/lang/String;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SuggestWordResponse {
    @SerializedName("data")
    @Nullable
    public final List<TypeWords> data;
    @SerializedName("errno")
    public final int errno;
    @SerializedName("msg")
    @Nullable
    public final String msg;
}
