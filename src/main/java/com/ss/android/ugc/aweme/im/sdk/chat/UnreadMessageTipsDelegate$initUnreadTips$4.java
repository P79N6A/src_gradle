package com.ss.android.ugc.aweme.im.sdk.chat;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/chat/UnreadMessageTipsDelegate$initUnreadTips$4", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UnreadMessageTipsDelegate$initUnreadTips$4 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50272a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f50273b;

    UnreadMessageTipsDelegate$initUnreadTips$4(r rVar) {
        this.f50273b = rVar;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f50272a, false, 50513, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f50272a, false, 50513, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && this.f50273b.f50712d) {
            LinearLayoutManager linearLayoutManager = this.f50273b.m;
            if (linearLayoutManager != null) {
                i2 = linearLayoutManager.findLastVisibleItemPosition();
            } else {
                i2 = -1;
            }
            if (i2 == this.f50273b.h) {
                recyclerView.smoothScrollBy(0, -this.f50273b.j);
                this.f50273b.f50712d = false;
                return;
            }
            recyclerView.smoothScrollToPosition(this.f50273b.h);
        }
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f50272a, false, 50512, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f50272a, false, 50512, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        r rVar = this.f50273b;
        if (PatchProxy.isSupport(new Object[0], rVar, r.f50709a, false, 50504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], rVar, r.f50709a, false, 50504, new Class[0], Void.TYPE);
            return;
        }
        if (rVar.k.getVisibility() != 8) {
            LinearLayoutManager linearLayoutManager = rVar.m;
            if (linearLayoutManager != null) {
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (findLastVisibleItemPosition >= 0 && findLastVisibleItemPosition < rVar.p.f50220d.size()) {
                    n nVar = rVar.p.f50220d.get(findLastVisibleItemPosition);
                    if (nVar != null) {
                        if (nVar.getIndex() <= rVar.f50714f) {
                            z = true;
                        }
                        if (z) {
                            rVar.a();
                        } else if (findLastVisibleItemPosition == rVar.p.getItemCount() - 1 && !rVar.p.l) {
                            rVar.a();
                        }
                    }
                }
            }
        }
    }
}
