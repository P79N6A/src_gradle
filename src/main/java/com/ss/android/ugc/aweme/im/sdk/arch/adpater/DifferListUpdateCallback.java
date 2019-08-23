package com.ss.android.ugc.aweme.im.sdk.arch.adpater;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/DifferListUpdateCallback;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/im/sdk/arch/adpater/ExtendedListUpdateCallback;", "adapter", "positionMapper", "Lkotlin/Function1;", "", "(Landroid/support/v7/widget/RecyclerView$Adapter;Lkotlin/jvm/functions/Function1;)V", "Landroid/support/v7/widget/RecyclerView$Adapter;", "notifyDataSetChanged", "", "onChanged", "position", "count", "payload", "", "onInserted", "onMoved", "from", "to", "onRemoved", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DifferListUpdateCallback<T extends RecyclerView.Adapter<?>> implements ExtendedListUpdateCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50115a;

    /* renamed from: b  reason: collision with root package name */
    private final T f50116b;

    /* renamed from: c  reason: collision with root package name */
    private final Function1<Integer, Integer> f50117c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50115a, false, 50175, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50115a, false, 50175, new Class[0], Void.TYPE);
            return;
        }
        this.f50116b.notifyDataSetChanged();
    }

    public DifferListUpdateCallback(@NotNull T t, @NotNull Function1<? super Integer, Integer> function1) {
        Intrinsics.checkParameterIsNotNull(t, "adapter");
        Intrinsics.checkParameterIsNotNull(function1, "positionMapper");
        this.f50116b = t;
        this.f50117c = function1;
    }

    public final void onInserted(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50115a, false, 50173, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50115a, false, 50173, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 0) {
            this.f50116b.notifyItemRangeInserted(((Number) this.f50117c.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    public final void onMoved(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50115a, false, 50172, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50115a, false, 50172, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f50116b.notifyItemMoved(((Number) this.f50117c.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f50117c.invoke(Integer.valueOf(i2))).intValue());
    }

    public final void onRemoved(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50115a, false, 50174, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50115a, false, 50174, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 0) {
            if (i == 0 && i2 == this.f50116b.getItemCount()) {
                this.f50116b.notifyDataSetChanged();
            }
            this.f50116b.notifyItemRangeRemoved(((Number) this.f50117c.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    public final void onChanged(int i, int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f50115a, false, 50171, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f50115a, false, 50171, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        int i3 = i2;
        this.f50116b.notifyItemRangeChanged(((Number) this.f50117c.invoke(Integer.valueOf(i))).intValue(), i2, obj2);
    }
}
