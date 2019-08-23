package com.ss.android.ugc.aweme.discover.delegate.a;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.ss.android.ugc.aweme.discover.delegate.a.h;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge;
import com.ss.android.ugc.aweme.feed.ai;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchChallengeSuggestDelegate;", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestDelegate$SubSuggestDelegate;", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchChallengeViewHolder$ChallengeItemListener;", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "(Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;)V", "onBindViewHolder", "", "items", "", "", "position", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "sendEnterTagDetail", "challenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "order", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends h.a implements SearchChallengeViewHolder.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42249a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull SearchSquareAdapter<?> searchSquareAdapter) {
        super(searchSquareAdapter);
        Intrinsics.checkParameterIsNotNull(searchSquareAdapter, "adapter");
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42249a, false, 36234, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42249a, false, 36234, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        SearchChallengeViewHolder a2 = SearchChallengeViewHolder.a(viewGroup2, "", this, null);
        Intrinsics.checkExpressionValueIsNotNull(a2, "SearchChallengeViewHolde…e(parent, \"\", this, null)");
        a2.f41781f = "search_for_you_list";
        return a2;
    }

    public final void a(@NotNull Challenge challenge, int i) {
        Challenge challenge2 = challenge;
        if (PatchProxy.isSupport(new Object[]{challenge2, Integer.valueOf(i)}, this, f42249a, false, 36236, new Class[]{Challenge.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{challenge2, Integer.valueOf(i)}, this, f42249a, false, 36236, new Class[]{Challenge.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(challenge2, "challenge");
        r.a("enter_tag_detail", (Map) d.a().a("enter_from", "search_for_you_list").a("tag_id", challenge.getCid()).a("log_pb", ai.a().a(challenge.getRequestId())).a("order", a((Object) challenge)).f34114b);
    }

    public final void a(@NotNull List<? extends Object> list, int i, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull List<Object> list2) {
        List<? extends Object> list3 = list;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<Object> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list4}, this, f42249a, false, 36235, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list4}, this, f42249a, false, 36235, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list4, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            ((SearchChallengeViewHolder) viewHolder2).a((SuggestChallenge) obj, "");
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestChallenge");
    }
}
