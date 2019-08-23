package com.ss.android.ugc.aweme.im.sdk.arch.adpater;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.arch.adpater.a;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/im/sdk/arch/adpater/AsyncListDiffer$submitList$1$result$1", "Landroid/support/v7/util/DiffUtil$Callback;", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "getNewListSize", "getOldListSize", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AsyncListDiffer$submitList$1$result$1 extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50111a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a.b f50112b;

    public final int getNewListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f50111a, false, 50151, new Class[0], Integer.TYPE)) {
            return this.f50112b.f50131d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50111a, false, 50151, new Class[0], Integer.TYPE)).intValue();
    }

    public final int getOldListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f50111a, false, 50150, new Class[0], Integer.TYPE)) {
            return this.f50112b.f50130c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f50111a, false, 50150, new Class[0], Integer.TYPE)).intValue();
    }

    AsyncListDiffer$submitList$1$result$1(a.b bVar) {
        this.f50112b = bVar;
    }

    public final boolean areItemsTheSame(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50111a, false, 50152, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50111a, false, 50152, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Object obj = this.f50112b.f50130c.get(i);
        Object obj2 = this.f50112b.f50131d.get(i2);
        if (obj != null && obj2 != null) {
            return this.f50112b.f50129b.f50125f.f50138a.areItemsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object getChangePayload(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50111a, false, 50154, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50111a, false, 50154, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class);
        }
        Object obj = this.f50112b.f50130c.get(i);
        Object obj2 = this.f50112b.f50131d.get(i2);
        if (obj != null && obj2 != null) {
            return this.f50112b.f50129b.f50125f.f50138a.getChangePayload(obj, obj2);
        }
        throw new AssertionError();
    }

    public final boolean areContentsTheSame(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50111a, false, 50153, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f50111a, false, 50153, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Object obj = this.f50112b.f50130c.get(i);
        Object obj2 = this.f50112b.f50131d.get(i2);
        if (obj != null && obj2 != null) {
            return this.f50112b.f50129b.f50125f.f50138a.areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }
}
