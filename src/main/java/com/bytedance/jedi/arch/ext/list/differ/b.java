package com.bytedance.jedi.arch.ext.list.differ;

import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import com.bytedance.jedi.arch.ext.list.differ.e;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\b\u0016\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB'\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u0015\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0016J\u001e\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "T", "", "adapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Landroid/support/v7/widget/RecyclerView$Adapter;Landroid/support/v7/util/DiffUtil$ItemCallback;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "mUpdateCallback", "Landroid/support/v7/util/ListUpdateCallback;", "mConfig", "Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;", "mPrefetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;", "(Landroid/support/v7/util/ListUpdateCallback;Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;)V", "mList", "", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "mMaxScheduledGeneration", "", "getCurrentList", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "latchList", "", "newList", "diffResult", "Landroid/support/v7/util/DiffUtil$DiffResult;", "submitList", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f21356a;

    /* renamed from: b  reason: collision with root package name */
    public int f21357b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends T> f21358c;

    /* renamed from: d  reason: collision with root package name */
    public final ListUpdateCallback f21359d;

    /* renamed from: e  reason: collision with root package name */
    public final c<T> f21360e;

    /* renamed from: f  reason: collision with root package name */
    private final e f21361f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, k = 3, mv = {1, 1, 15})
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f21363b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f21364c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f21365d;

        public a(b bVar, List list, List list2, int i) {
            this.f21362a = bVar;
            this.f21363b = list;
            this.f21364c = list2;
            this.f21365d = i;
        }

        public final void run() {
            final DiffUtil.DiffResult calculateDiff = DiffUtil.calculateDiff(new JediAsyncListDiffer$submitList$1$result$1(this));
            Intrinsics.checkExpressionValueIsNotNull(calculateDiff, "DiffUtil.calculateDiff(o…                       })");
            this.f21362a.f21356a.execute(new Runnable(this) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f21366a;

                {
                    this.f21366a = r1;
                }

                public final void run() {
                    if (this.f21366a.f21362a.f21357b == this.f21366a.f21365d) {
                        b bVar = this.f21366a.f21362a;
                        List<? extends T> list = this.f21366a.f21364c;
                        DiffUtil.DiffResult diffResult = calculateDiff;
                        bVar.f21358c = list;
                        diffResult.dispatchUpdatesTo(bVar.f21359d);
                    }
                }
            });
        }
    }

    public final int a() {
        List<? extends T> list = this.f21358c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Nullable
    public final T a(int i) {
        List<? extends T> list = this.f21358c;
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        e eVar = this.f21361f;
        if (eVar != null) {
            eVar.a(i);
        }
        return list.get(i);
    }

    public b(@NotNull ListUpdateCallback listUpdateCallback, @NotNull c<T> cVar, @Nullable e eVar) {
        Intrinsics.checkParameterIsNotNull(listUpdateCallback, "mUpdateCallback");
        Intrinsics.checkParameterIsNotNull(cVar, "mConfig");
        this.f21359d = listUpdateCallback;
        this.f21360e = cVar;
        this.f21361f = eVar;
        this.f21356a = this.f21360e.f21370c == null ? new g() : this.f21360e.f21370c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(@org.jetbrains.annotations.NotNull android.support.v7.widget.RecyclerView.Adapter<?> r3, @org.jetbrains.annotations.NotNull android.support.v7.util.DiffUtil.ItemCallback<T> r4, @org.jetbrains.annotations.Nullable com.bytedance.jedi.arch.ext.list.differ.e.b r5) {
        /*
            r2 = this;
            java.lang.String r0 = "adapter"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "diffCallback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.support.v7.util.AdapterListUpdateCallback r0 = new android.support.v7.util.AdapterListUpdateCallback
            r0.<init>(r3)
            android.support.v7.util.ListUpdateCallback r0 = (android.support.v7.util.ListUpdateCallback) r0
            com.bytedance.jedi.arch.ext.list.differ.c$a r3 = new com.bytedance.jedi.arch.ext.list.differ.c$a
            r3.<init>(r4)
            com.bytedance.jedi.arch.ext.list.differ.c r3 = r3.a()
            if (r5 == 0) goto L_0x0023
            r4 = 3
            r1 = 0
            com.bytedance.jedi.arch.ext.list.differ.e r4 = com.bytedance.jedi.arch.ext.list.differ.f.a(r5, true, 10)
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            r2.<init>((android.support.v7.util.ListUpdateCallback) r0, (com.bytedance.jedi.arch.ext.list.differ.c<T>) r3, (com.bytedance.jedi.arch.ext.list.differ.e) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.differ.b.<init>(android.support.v7.widget.RecyclerView$Adapter, android.support.v7.util.DiffUtil$ItemCallback, com.bytedance.jedi.arch.ext.list.differ.e$b):void");
    }

    public /* synthetic */ b(RecyclerView.Adapter adapter, DiffUtil.ItemCallback itemCallback, e.b bVar, int i) {
        this(adapter, itemCallback, (e.b) null);
    }
}
