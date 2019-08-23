package com.bytedance.jedi.arch.ext.list.differ;

import android.support.v7.util.DiffUtil;
import com.bytedance.jedi.arch.ext.list.differ.b;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer$submitList$1$result$1", "Landroid/support/v7/util/DiffUtil$Callback;", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "getNewListSize", "getOldListSize", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public final class JediAsyncListDiffer$submitList$1$result$1 extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b.a f21352a;

    public final int getNewListSize() {
        return this.f21352a.f21364c.size();
    }

    public final int getOldListSize() {
        return this.f21352a.f21363b.size();
    }

    JediAsyncListDiffer$submitList$1$result$1(b.a aVar) {
        this.f21352a = aVar;
    }

    public final boolean areContentsTheSame(int i, int i2) {
        Object obj = this.f21352a.f21363b.get(i);
        Object obj2 = this.f21352a.f21364c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f21352a.f21362a.f21360e.f21369b.areContentsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public final boolean areItemsTheSame(int i, int i2) {
        Object obj = this.f21352a.f21363b.get(i);
        Object obj2 = this.f21352a.f21364c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f21352a.f21362a.f21360e.f21369b.areItemsTheSame(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object getChangePayload(int i, int i2) {
        Object obj = this.f21352a.f21363b.get(i);
        Object obj2 = this.f21352a.f21364c.get(i2);
        if (obj != null && obj2 != null) {
            return this.f21352a.f21362a.f21360e.f21369b.getChangePayload(obj, obj2);
        }
        throw new AssertionError();
    }
}
