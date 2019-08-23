package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/Differ;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "", "()V", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "getChangePayload", "oldItem", "newItem", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class Differ extends DiffUtil.ItemCallback<Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41579a;

    public final boolean areContentsTheSame(@NotNull Object obj, @NotNull Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, obj4}, this, f41579a, false, 35546, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, this, f41579a, false, 35546, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj3, "p0");
        Intrinsics.checkParameterIsNotNull(obj4, "p1");
        return true;
    }

    public final boolean areItemsTheSame(@NotNull Object obj, @NotNull Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, obj4}, this, f41579a, false, 35544, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj3, obj4}, this, f41579a, false, 35544, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj3, "p0");
        Intrinsics.checkParameterIsNotNull(obj4, "p1");
        Intrinsics.areEqual(obj, obj2);
        return Intrinsics.areEqual(obj, obj2);
    }

    @Nullable
    public final Object getChangePayload(@NotNull Object obj, @NotNull Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (PatchProxy.isSupport(new Object[]{obj3, obj4}, this, f41579a, false, 35545, new Class[]{Object.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj3, obj4}, this, f41579a, false, 35545, new Class[]{Object.class, Object.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(obj3, "oldItem");
        Intrinsics.checkParameterIsNotNull(obj4, "newItem");
        return super.getChangePayload(obj, obj2);
    }
}
