package com.bytedance.jedi.model.g;

import io.reactivex.internal.util.OpenHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/jedi/model/sync/CompositeReceipt;", "Lcom/bytedance/jedi/model/sync/ISyncReceipt;", "()V", "hashSet", "Lio/reactivex/internal/util/OpenHashSet;", "add", "", "receipt", "release", "remove", "model_release"}, k = 1, mv = {1, 1, 15})
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final OpenHashSet<b> f21586a = new OpenHashSet<>(32);

    public final void a() {
        Object[] keys = this.f21586a.keys();
        Intrinsics.checkExpressionValueIsNotNull(keys, "hashSet.keys()");
        for (Object obj : keys) {
            if (obj instanceof b) {
                ((b) obj).a();
                this.f21586a.remove(obj);
            }
        }
    }
}
