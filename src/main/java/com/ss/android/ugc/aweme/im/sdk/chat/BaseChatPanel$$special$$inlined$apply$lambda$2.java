package com.ss.android.ugc.aweme.im.sdk.chat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/chat/BaseChatPanel$1$5", "Lcom/ss/android/ugc/aweme/framework/fresco/FrescoRecycleViewScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "newState", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BaseChatPanel$$special$$inlined$apply$lambda$2 extends FrescoRecycleViewScrollListener {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f50177b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BaseChatPanel f50178c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseChatPanel$$special$$inlined$apply$lambda$2(Context context, BaseChatPanel baseChatPanel) {
        super(context);
        this.f50178c = baseChatPanel;
    }

    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f50177b, false, 50219, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f50177b, false, 50219, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            this.f50178c.j.e();
        }
    }
}
