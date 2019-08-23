package com.ss.android.ugc.aweme.im.sdk.relations.select;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.ss.android.ugc.aweme.im.sdk.relations.IndexView;
import com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/relations/select/BaseSelectFragment$initViews$2$1", "Lcom/ss/android/ugc/aweme/framework/fresco/FrescoRecycleViewScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BaseSelectFragment$initViews$$inlined$apply$lambda$1 extends FrescoRecycleViewScrollListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52208b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ RecyclerView f52209c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BaseSelectFragment f52210d;

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f52208b, false, 52983, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f52208b, false, 52983, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            if (findFirstVisibleItemPosition >= this.f52210d.m().b()) {
                ((IndexView) this.f52210d.a((int) C0906R.id.au5)).setRecycleViewPos(findFirstVisibleItemPosition - this.f52210d.m().b());
            } else {
                ((IndexView) this.f52210d.a((int) C0906R.id.au5)).setCurrentIndex(-1);
            }
            ((SearchHeadListView) this.f52210d.a((int) C0906R.id.cle)).b();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseSelectFragment$initViews$$inlined$apply$lambda$1(RecyclerView recyclerView, Context context, BaseSelectFragment baseSelectFragment) {
        super(context);
        this.f52209c = recyclerView;
        this.f52210d = baseSelectFragment;
    }
}
