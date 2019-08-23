package com.ss.android.ugc.aweme.discover.hotspot.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotAwemes;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "awemeList", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "hasMore", "", "cursor", "", "qc", "", "logPb", "Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "(Ljava/util/List;ZILjava/lang/String;Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "getAwemeList", "()Ljava/util/List;", "setAwemeList", "(Ljava/util/List;)V", "getCursor", "()I", "setCursor", "(I)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getLogPb", "()Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;", "setLogPb", "(Lcom/ss/android/ugc/aweme/feed/model/LogPbBean;)V", "getQc", "()Ljava/lang/String;", "setQc", "(Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends BaseResponse {
    @SerializedName("aweme_list")
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Aweme> f42425a;
    @SerializedName("has_more")

    /* renamed from: b  reason: collision with root package name */
    public boolean f42426b;
    @SerializedName("cursor")

    /* renamed from: c  reason: collision with root package name */
    public int f42427c;
}
