package com.ss.android.ugc.aweme;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.EffectModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/EffectDiff;", "Landroid/support/v7/util/DiffUtil$Callback;", "old", "", "Lcom/ss/android/ugc/aweme/effect/EffectModel;", "new", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getNewListSize", "getOldListSize", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EffectDiff extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31554a;

    /* renamed from: b  reason: collision with root package name */
    private final List<EffectModel> f31555b;

    /* renamed from: c  reason: collision with root package name */
    private final List<EffectModel> f31556c;

    public final int getNewListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f31554a, false, 19455, new Class[0], Integer.TYPE)) {
            return this.f31556c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f31554a, false, 19455, new Class[0], Integer.TYPE)).intValue();
    }

    public final int getOldListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f31554a, false, 19454, new Class[0], Integer.TYPE)) {
            return this.f31555b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f31554a, false, 19454, new Class[0], Integer.TYPE)).intValue();
    }

    public EffectDiff(@NotNull List<? extends EffectModel> list, @NotNull List<? extends EffectModel> list2) {
        Intrinsics.checkParameterIsNotNull(list, "old");
        Intrinsics.checkParameterIsNotNull(list2, "new");
        this.f31555b = list;
        this.f31556c = list2;
    }

    public final boolean areContentsTheSame(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f31554a, false, 19456, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return Intrinsics.areEqual((Object) this.f31555b.get(i), (Object) this.f31556c.get(i2));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f31554a, false, 19456, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public final boolean areItemsTheSame(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f31554a, false, 19453, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return Intrinsics.areEqual((Object) this.f31555b.get(i).name, (Object) this.f31556c.get(i2).name);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f31554a, false, 19453, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
