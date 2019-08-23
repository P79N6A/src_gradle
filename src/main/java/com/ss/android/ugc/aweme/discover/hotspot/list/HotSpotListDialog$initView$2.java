package com.ss.android.ugc.aweme.discover.hotspot.list;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.widget.EdgeEffect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/hotspot/list/HotSpotListDialog$initView$2", "Landroid/support/v7/widget/RecyclerView$EdgeEffectFactory;", "createEdgeEffect", "Landroid/widget/EdgeEffect;", "view", "Landroid/support/v7/widget/RecyclerView;", "direction", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotListDialog$initView$2 extends RecyclerView.EdgeEffectFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42471a;

    HotSpotListDialog$initView$2() {
    }

    @NotNull
    public final EdgeEffect createEdgeEffect(@NotNull RecyclerView recyclerView, int i) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f42471a, false, 36608, new Class[]{RecyclerView.class, Integer.TYPE}, EdgeEffect.class)) {
            return (EdgeEffect) PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i)}, this, f42471a, false, 36608, new Class[]{RecyclerView.class, Integer.TYPE}, EdgeEffect.class);
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "view");
        EdgeEffect edgeEffect = new EdgeEffect(recyclerView.getContext());
        edgeEffect.setColor(Color.parseColor("#ffffff"));
        return edgeEffect;
    }
}
