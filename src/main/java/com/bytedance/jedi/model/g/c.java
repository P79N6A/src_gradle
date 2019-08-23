package com.bytedance.jedi.model.g;

import io.reactivex.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/jedi/model/sync/SyncReceipt;", "Lcom/bytedance/jedi/model/sync/ISyncReceipt;", "disposable", "Lio/reactivex/disposables/Disposable;", "(Lio/reactivex/disposables/Disposable;)V", "release", "", "model_release"}, k = 1, mv = {1, 1, 15})
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Disposable f21587a;

    public final void a() {
        if (!this.f21587a.isDisposed()) {
            this.f21587a.dispose();
        }
    }

    public c(@NotNull Disposable disposable) {
        Intrinsics.checkParameterIsNotNull(disposable, "disposable");
        this.f21587a = disposable;
    }
}
