package com.bytedance.jedi.model.c;

import com.bytedance.jedi.model.i.n;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.miniapp.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0001J\u0017\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\bH\u0001J!\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H\u0001¨\u0006\f"}, d2 = {"Lcom/bytedance/jedi/model/datasource/DataSourceStore;", "Lcom/bytedance/jedi/model/util/IStore;", "Lcom/bytedance/jedi/model/datasource/IDataSource;", "()V", "get", "k", "", "getAll", "", "put", "", "v", "model_release"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f21554a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ n f21555b = new n();

    public final void a(@NotNull String str, @NotNull d<?, ?> dVar) {
        Intrinsics.checkParameterIsNotNull(str, k.f55809b);
        Intrinsics.checkParameterIsNotNull(dVar, NotifyType.VIBRATE);
        this.f21555b.a(str, dVar);
    }

    private c() {
    }
}
