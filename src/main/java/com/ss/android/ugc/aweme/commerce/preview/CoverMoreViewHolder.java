package com.ss.android.ugc.aweme.commerce.preview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/CoverMoreViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "loadMoreClickListener", "Lcom/ss/android/ugc/aweme/commerce/preview/OnClickListener;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/commerce/preview/OnClickListener;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CoverMoreViewHolder extends RecyclerView.ViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoverMoreViewHolder(@NotNull View view, @Nullable final c cVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f37125a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f37125a, false, 28536, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f37125a, false, 28536, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                c cVar = cVar;
                if (cVar != null) {
                    cVar.a();
                }
            }
        });
    }
}
