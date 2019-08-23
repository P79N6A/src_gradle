package com.bytedance.jedi.arch.ext.list.differ;

import android.support.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;", "", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "enablePrefetch", "", "prefetchDistance", "", "(Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;ZI)V", "getFetcher", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "loadAround", "", "index", "loadAround$ext_list_release", "Builder", "Fetcher", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public final class e {
    @NotNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: a  reason: collision with root package name */
    public final b f21380a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21381b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21382c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Builder;", "", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "enablePrefetch", "", "prefetchDistance", "", "build", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;", "setEnablePrefetch", "setPrefetchDistance", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f21383a;

        /* renamed from: b  reason: collision with root package name */
        boolean f21384b;

        /* renamed from: c  reason: collision with root package name */
        final b f21385c;

        public a(@NotNull b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "fetcher");
            this.f21385c = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "", "tryPrefetch", "", "indexToPrefetch", "", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(int i);
    }

    public final void a(int i) {
        if (this.f21381b) {
            this.f21380a.a(i + this.f21382c);
        }
    }

    private e(b bVar, boolean z, int i) {
        this.f21380a = bVar;
        this.f21381b = z;
        this.f21382c = i;
    }

    public /* synthetic */ e(b bVar, boolean z, int i, byte b2) {
        this(bVar, z, i);
    }
}
