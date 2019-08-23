package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.bytedance.jedi.arch.ext.list.k;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchPayLoad;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "searchId", "", "hasMore", "", "cursor", "", "apiResult", "Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;", "(Ljava/lang/String;ZILcom/ss/android/ugc/aweme/discover/model/SearchApiResult;)V", "getApiResult", "()Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;", "getSearchId", "()Ljava/lang/String;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends k {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f42532c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final SearchApiResult f42533d;

    public e() {
        this(null, false, 0, null, 15);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(@NotNull String str, boolean z, int i, @Nullable SearchApiResult searchApiResult) {
        super(z, i);
        Intrinsics.checkParameterIsNotNull(str, "searchId");
        this.f42532c = str;
        this.f42533d = searchApiResult;
    }

    public /* synthetic */ e(String str, boolean z, int i, SearchApiResult searchApiResult, int i2) {
        this("", true, 0, null);
    }
}
