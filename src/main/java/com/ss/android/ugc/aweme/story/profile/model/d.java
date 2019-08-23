package com.ss.android.ugc.aweme.story.profile.model;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/model/StoryCovers;", "", "covers", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "(Ljava/util/List;)V", "getCovers", "()Ljava/util/List;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final List<UrlModel> f73302a;

    public d() {
        this(null, 1);
    }

    public d(@NotNull List<UrlModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "covers");
        this.f73302a = list;
    }

    private /* synthetic */ d(List list, int i) {
        this(new ArrayList());
    }
}
