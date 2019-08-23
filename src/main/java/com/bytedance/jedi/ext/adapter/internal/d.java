package com.bytedance.jedi.ext.adapter.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyProvider;", "", "proxyManager", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "(Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;)V", "proxyFactory", "Lkotlin/Function0;", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxy;", "getProxyManager", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "store", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyStore;", "getStore", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyStore;", "get", "position", "", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Function0<JediViewHolderProxy> f21489a = a.INSTANCE;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final e f21490b = new e(this.f21491c);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final b f21491c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxy;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<JediViewHolderProxy> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        @NotNull
        public final JediViewHolderProxy invoke() {
            return new JediViewHolderProxy();
        }
    }

    public d(@NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "proxyManager");
        this.f21491c = bVar;
    }
}
