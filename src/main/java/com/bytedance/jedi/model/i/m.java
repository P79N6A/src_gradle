package com.bytedance.jedi.model.i;

import com.ss.android.ugc.aweme.web.jsbridge.q;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/bytedance/jedi/model/util/ValueReference;", "K", "V", "Ljava/lang/ref/WeakReference;", "k", "v", "q", "Ljava/lang/ref/ReferenceQueue;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V", "getK", "()Ljava/lang/Object;", "Ljava/lang/Object;", "model_release"}, k = 1, mv = {1, 1, 15})
public final class m<K, V> extends WeakReference<V> {

    /* renamed from: a  reason: collision with root package name */
    public final K f21758a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(K k, V v, @NotNull ReferenceQueue<V> referenceQueue) {
        super(v, referenceQueue);
        Intrinsics.checkParameterIsNotNull(referenceQueue, q.f76814b);
        this.f21758a = k;
    }
}
