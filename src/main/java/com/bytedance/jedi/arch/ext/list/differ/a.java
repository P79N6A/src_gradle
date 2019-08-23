package com.bytedance.jedi.arch.ext.list.differ;

import com.bytedance.jedi.arch.ext.list.differ.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH$J\u001c\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\fH$J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/FetcherDelegate;", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "()V", "appendCountRequested", "", "enablePrefetch", "", "isPrefetching", "actualLoad", "", "actualPrefetch", "itemCountSupplier", "Lkotlin/Function1;", "onLoaded", "loadedCount", "error", "", "schedulePrefetch", "tryPrefetch", "indexToPrefetch", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public abstract class a implements e.b {

    /* renamed from: b  reason: collision with root package name */
    public boolean f21353b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21354c;

    /* renamed from: d  reason: collision with root package name */
    public int f21355d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "size", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.arch.ext.list.differ.a$a  reason: collision with other inner class name */
    static final class C0195a extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ int $indexToPrefetch;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0195a(a aVar, int i) {
            super(1);
            this.this$0 = aVar;
            this.$indexToPrefetch = i;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            int i2 = this.$indexToPrefetch - i;
            this.this$0.f21355d = Math.max(this.this$0.f21355d, i2);
            if (this.this$0.f21355d > 0) {
                this.this$0.b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(@NotNull Function1<? super Integer, Unit> function1);

    public final void b() {
        if (!this.f21353b) {
            this.f21353b = true;
            a();
        }
    }

    public final void a(int i) {
        this.f21354c = true;
        a((Function1<? super Integer, Unit>) new C0195a<Object,Unit>(this, i));
    }
}
