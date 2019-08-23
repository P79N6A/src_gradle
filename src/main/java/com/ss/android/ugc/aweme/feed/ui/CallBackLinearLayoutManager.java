package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/CallBackLinearLayoutManager;", "Landroid/support/v7/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "callback", "Lkotlin/Function0;", "", "(Landroid/content/Context;IZLkotlin/jvm/functions/Function0;)V", "getCallback", "()Lkotlin/jvm/functions/Function0;", "onLayoutCompleted", "state", "Landroid/support/v7/widget/RecyclerView$State;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CallBackLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46083a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Function0<Unit> f46084b;

    public final void onLayoutCompleted(@Nullable RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{state}, this, f46083a, false, 42459, new Class[]{RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{state}, this, f46083a, false, 42459, new Class[]{RecyclerView.State.class}, Void.TYPE);
            return;
        }
        super.onLayoutCompleted(state);
        this.f46084b.invoke();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallBackLinearLayoutManager(@NotNull Context context, int i, boolean z, @NotNull Function0<Unit> function0) {
        super(context, 0, false);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        this.f46084b = function0;
    }
}
