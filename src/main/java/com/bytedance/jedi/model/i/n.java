package com.bytedance.jedi.model.i;

import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.miniapp.k;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u001d\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0002R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/jedi/model/util/WeakRefStore;", "T", "", "Lcom/bytedance/jedi/model/util/IStore;", "()V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/lang/ref/WeakReference;", "valueReferenceQueue", "Ljava/lang/ref/ReferenceQueue;", "get", "k", "(Ljava/lang/String;)Ljava/lang/Object;", "getAll", "", "put", "", "v", "(Ljava/lang/String;Ljava/lang/Object;)V", "tryDrainReferenceQueues", "model_release"}, k = 1, mv = {1, 1, 15})
public final class n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, WeakReference<T>> f21759a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<T> f21760b = new ReferenceQueue<>();

    public final void a(@NotNull String str, @NotNull T t) {
        Intrinsics.checkParameterIsNotNull(str, k.f55809b);
        Intrinsics.checkParameterIsNotNull(t, NotifyType.VIBRATE);
        this.f21759a.put(str, new m(str, t, this.f21760b));
    }
}
