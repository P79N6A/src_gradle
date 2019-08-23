package com.ss.android.ugc.aweme.base.arch;

import android.support.v7.util.ListUpdateCallback;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.differ.b;
import com.bytedance.jedi.arch.ext.list.differ.c;
import com.bytedance.jedi.arch.ext.list.differ.e;
import com.bytedance.widget.ext.list.ItemWidgetListUpdateCallback;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/MultiTypeWidgetListAdapter;", "Lcom/ss/android/ugc/aweme/base/arch/BaseWidgetListAdapter;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Lcom/bytedance/widget/WidgetManager;Landroid/support/v7/util/DiffUtil$ItemCallback;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "prefetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;", "config", "Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;", "(Lcom/bytedance/widget/WidgetManager;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;)V", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getBasicItemCount", "", "getItemAt", "position", "getItemCount", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@Deprecated(level = kotlin.a.WARNING, message = "use JediBaseMultiTypeAdapter")
public abstract class MultiTypeWidgetListAdapter extends BaseWidgetListAdapter<ItemWidgetViewHolder<?>> implements com.bytedance.jedi.arch.ext.list.a<Object> {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f2731e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final b<Object> f2732f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<Integer, Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ MultiTypeWidgetListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MultiTypeWidgetListAdapter multiTypeWidgetListAdapter) {
            super(1);
            this.this$0 = multiTypeWidgetListAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(invoke(((Number) obj).intValue()));
        }

        public final int invoke(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24533, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return i + this.this$0.d();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24533, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
    }

    @NotNull
    public final b<Object> a() {
        return this.f2732f;
    }

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f2731e, false, 24528, new Class[0], Integer.TYPE)) {
            return a().a() + d();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2731e, false, 24528, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f2731e, false, 24529, new Class[0], Integer.TYPE)) {
            return super.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2731e, false, 24529, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(@Nullable List<? extends Object> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f2731e, false, 24532, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f2731e, false, 24532, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a.C0194a.a((com.bytedance.jedi.arch.ext.list.a<T>) this, list);
    }

    @NotNull
    public final Object a(int i) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f2731e, false, 24527, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f2731e, false, 24527, new Class[]{Integer.TYPE}, Object.class);
        }
        int d2 = i - d();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(d2)}, this, f2731e, false, 24531, new Class[]{Integer.TYPE}, Object.class)) {
            obj = PatchProxy.accessDispatch(new Object[]{Integer.valueOf(d2)}, this, f2731e, false, 24531, new Class[]{Integer.TYPE}, Object.class);
        } else {
            obj = a.C0194a.a((com.bytedance.jedi.arch.ext.list.a<T>) this, d2);
        }
        if (obj != null) {
            return obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiTypeWidgetListAdapter(@org.jetbrains.annotations.NotNull com.bytedance.widget.a r4, @org.jetbrains.annotations.NotNull android.support.v7.util.DiffUtil.ItemCallback<java.lang.Object> r5, @org.jetbrains.annotations.Nullable com.bytedance.jedi.arch.ext.list.differ.e.b r6) {
        /*
            r3 = this;
            java.lang.String r0 = "widgetManager"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "diffCallback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            r0 = 0
            if (r6 == 0) goto L_0x0014
            r1 = 3
            r2 = 0
            com.bytedance.jedi.arch.ext.list.differ.e r6 = com.bytedance.jedi.arch.ext.list.differ.f.a(r6, true, 10)
            goto L_0x0015
        L_0x0014:
            r6 = r0
        L_0x0015:
            r1 = 1
            com.bytedance.jedi.arch.ext.list.differ.c r5 = com.bytedance.jedi.arch.ext.list.differ.d.a(r5, r0, r1)
            r3.<init>((com.bytedance.widget.a) r4, (com.bytedance.jedi.arch.ext.list.differ.e) r6, (com.bytedance.jedi.arch.ext.list.differ.c<java.lang.Object>) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.arch.MultiTypeWidgetListAdapter.<init>(com.bytedance.widget.a, android.support.v7.util.DiffUtil$ItemCallback, com.bytedance.jedi.arch.ext.list.differ.e$b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MultiTypeWidgetListAdapter(@NotNull com.bytedance.widget.a aVar, @Nullable e eVar, @NotNull c<Object> cVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "widgetManager");
        Intrinsics.checkParameterIsNotNull(cVar, "config");
        this.f2732f = new b<>((ListUpdateCallback) new ItemWidgetListUpdateCallback(this, new a(this)), cVar, eVar);
    }
}
