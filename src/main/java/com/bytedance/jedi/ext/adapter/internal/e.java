package com.bytedance.jedi.ext.adapter.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\tJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tJ\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tJ\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyStore;", "", "manager", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "(Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;)V", "proxyListInternal", "", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxy;", "widgetsCount", "", "getWidgetsCount", "()I", "clear", "", "get", "position", "insert", "put", "widget", "remove", "swap", "from", "to", "update", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<JediViewHolderProxy> f21492a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final b f21493b;

    private final void a(int i) {
        this.f21492a.add(i, null);
    }

    public e(@NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
        this.f21493b = bVar;
    }

    private final void b(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i < this.f21492a.size()) {
            this.f21492a.set(i, jediViewHolderProxy);
        } else {
            this.f21492a.add(i, jediViewHolderProxy);
        }
    }

    public final void a(int i, @Nullable JediViewHolderProxy jediViewHolderProxy) {
        if (i >= 0 && i <= this.f21492a.size()) {
            if (jediViewHolderProxy != null) {
                b(i, jediViewHolderProxy);
            } else {
                a(i);
            }
        }
    }
}
