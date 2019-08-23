package com.ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.e.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\rH\u0016J@\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0016J\u001a\u0010\u001c\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutMultiVideoSegmentTouchCallback;", "Landroid/support/v7/widget/helper/ItemTouchHelper$Callback;", "adapter", "Lcom/ss/android/ugc/aweme/shortvideo/cut/ItemTouchHelperAdapter;", "(Lcom/ss/android/ugc/aweme/shortvideo/cut/ItemTouchHelperAdapter;)V", "isSelectedChanged", "", "recoverAnimateEnable", "clearView", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "viewHolder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "getMovementFlags", "", "p0", "p1", "onChildDraw", "c", "Landroid/graphics/Canvas;", "dX", "", "dY", "actionState", "isCurrentlyActive", "onMove", "p2", "onSelectedChanged", "onSwiped", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VECutMultiVideoSegmentTouchCallback extends ItemTouchHelper.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66185a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f66186b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66187c;

    /* renamed from: d  reason: collision with root package name */
    private final aj f66188d;

    public final void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f66185a, false, 75534, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f66185a, false, 75534, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "p0");
    }

    public VECutMultiVideoSegmentTouchCallback(@NotNull aj ajVar) {
        Intrinsics.checkParameterIsNotNull(ajVar, "adapter");
        this.f66188d = ajVar;
    }

    public final void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, viewHolder}, this, f66185a, false, 75536, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, viewHolder}, this, f66185a, false, 75536, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder, "viewHolder");
        this.f66188d.a(viewHolder, this.f66186b);
        super.clearView(recyclerView, viewHolder);
        this.f66186b = false;
    }

    public final int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, viewHolder2}, this, f66185a, false, 75532, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{recyclerView2, viewHolder2}, this, f66185a, false, 75532, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "p0");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "p1");
        return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
    }

    public final void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f66185a, false, 75535, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f66185a, false, 75535, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 != 0 && viewHolder2 != null) {
            ak.a(a.a(), 100);
            this.f66188d.a(viewHolder2, i2);
        }
        super.onSelectedChanged(viewHolder, i);
    }

    public final boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2) {
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.ViewHolder viewHolder3 = viewHolder;
        RecyclerView.ViewHolder viewHolder4 = viewHolder2;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, viewHolder3, viewHolder4}, this, f66185a, false, 75533, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView2, viewHolder3, viewHolder4}, this, f66185a, false, 75533, new Class[]{RecyclerView.class, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(recyclerView2, "p0");
        Intrinsics.checkParameterIsNotNull(viewHolder3, "p1");
        Intrinsics.checkParameterIsNotNull(viewHolder4, "p2");
        ak.a(a.a(), 50);
        this.f66188d.a(viewHolder3, viewHolder4);
        this.f66186b = true;
        return true;
    }

    public final void onChildDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float f2, float f3, int i, boolean z) {
        int i2;
        float f4;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{canvas2, recyclerView2, viewHolder2, Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f66185a, false, 75537, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.ViewHolder.class, Float.TYPE, Float.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, recyclerView2, viewHolder2, Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Byte.valueOf(z)}, this, f66185a, false, 75537, new Class[]{Canvas.class, RecyclerView.class, RecyclerView.ViewHolder.class, Float.TYPE, Float.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(canvas2, "c");
        Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "viewHolder");
        View view = viewHolder2.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.itemView");
        double height = (double) view.getHeight();
        Double.isNaN(height);
        double d2 = (height * 0.25d) / 2.0d;
        View view2 = viewHolder2.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "viewHolder.itemView");
        double top = (double) view2.getTop();
        Double.isNaN(top);
        float f5 = f3;
        double d3 = (double) f5;
        Double.isNaN(d3);
        double d4 = (top - d2) + d3;
        View view3 = viewHolder2.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "viewHolder.itemView");
        double height2 = (double) (((float) view3.getHeight()) * 1.25f);
        Double.isNaN(height2);
        double d5 = height2 + d4;
        if (d4 < 0.0d) {
            View view4 = viewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "viewHolder.itemView");
            double top2 = (double) view4.getTop();
            Double.isNaN(top2);
            f4 = -((float) (top2 - d2));
        } else if (d5 > ((double) recyclerView.getHeight())) {
            double bottom = (double) recyclerView.getBottom();
            double bottom2 = (double) view.getBottom();
            Double.isNaN(bottom2);
            Double.isNaN(bottom);
            f4 = (float) (bottom - (bottom2 + d2));
        } else {
            i2 = i;
            if (i2 == 2 || z) {
                float f6 = f2;
                super.onChildDraw(canvas, recyclerView, viewHolder, f2, f5, i, z);
                this.f66187c = true;
            } else if (this.f66187c) {
                this.f66187c = false;
                this.f66188d.a(viewHolder2).translationX(0.0f).translationY(0.0f).setDuration(getAnimationDuration(recyclerView2, 8, f2, f5)).start();
                return;
            }
        }
        i2 = i;
        f5 = f4;
        if (i2 == 2) {
        }
        float f62 = f2;
        super.onChildDraw(canvas, recyclerView, viewHolder, f2, f5, i, z);
        this.f66187c = true;
    }
}
