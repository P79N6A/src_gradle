package com.ss.android.ugc.aweme.base.arch;

import android.view.View;
import com.bytedance.ies.dmt.ui.common.c;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/JediBaseItemWidgetViewHolder;", "ITEM", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class JediBaseItemWidgetViewHolder<ITEM> extends ItemWidgetViewHolder<ITEM> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediBaseItemWidgetViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        view2.setBackground(c.e(view3.getContext()));
    }
}
