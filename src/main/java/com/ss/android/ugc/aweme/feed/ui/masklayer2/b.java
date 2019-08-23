package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeItem;", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/Item;", "descVO", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionDescVO;", "reasons", "", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonVO;", "dislikeReasonAction", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonAction;", "(Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionDescVO;Ljava/util/List;Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonAction;)V", "getDescVO", "()Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionDescVO;", "getDislikeReasonAction", "()Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/DislikeReasonAction;", "getReasons", "()Ljava/util/List;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends l {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final p f46757a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final List<g> f46758b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final c f46759c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull p pVar, @NotNull List<g> list, @NotNull c cVar) {
        super(pVar);
        Intrinsics.checkParameterIsNotNull(pVar, "descVO");
        Intrinsics.checkParameterIsNotNull(list, "reasons");
        Intrinsics.checkParameterIsNotNull(cVar, "dislikeReasonAction");
        this.f46757a = pVar;
        this.f46758b = list;
        this.f46759c = cVar;
    }
}
