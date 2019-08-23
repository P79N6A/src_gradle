package com.ss.android.ugc.aweme.base.arch;

import android.support.v7.util.ListUpdateCallback;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.differ.c;
import com.bytedance.jedi.arch.ext.list.differ.e;
import com.bytedance.widget.ext.list.ItemWidgetListUpdateCallback;
import com.bytedance.widget.ext.list.ItemWidgetViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0002\u0010\u0010J$\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u0018H$J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u001bH$J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020\u0018H\u0016J\u001c\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030$H\u0014R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/SingleTypeWidgetListAdapter;", "T", "Lcom/ss/android/ugc/aweme/base/arch/BaseWidgetListAdapter;", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "widgetManager", "Lcom/bytedance/widget/WidgetManager;", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Lcom/bytedance/widget/WidgetManager;Landroid/support/v7/util/DiffUtil$ItemCallback;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "prefetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;", "config", "Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;", "(Lcom/bytedance/widget/WidgetManager;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;)V", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "createItemWidget", "Lcom/bytedance/widget/ext/list/ItemWidget;", "viewType", "", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "getBasicItemCount", "getItemAt", "", "position", "getItemCount", "registerFactories", "", "registry", "Lcom/bytedance/viewholder/typesafe/ViewHolderFactoryRegistry;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@Deprecated(level = kotlin.a.WARNING, message = "use JediBaseSingleTypeAdapter")
public abstract class SingleTypeWidgetListAdapter<T> extends BaseWidgetListAdapter<ItemWidgetViewHolder<T>> implements com.bytedance.jedi.arch.ext.list.a<T> {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f2733e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.jedi.arch.ext.list.differ.b<T> f2734f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "it", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<Integer, Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SingleTypeWidgetListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SingleTypeWidgetListAdapter singleTypeWidgetListAdapter) {
            super(1);
            this.this$0 = singleTypeWidgetListAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(invoke(((Number) obj).intValue()));
        }

        public final int invoke(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24542, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return i + this.this$0.d();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24542, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/widget/ext/list/ItemWidgetViewHolder;", "T", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<ViewGroup, ItemWidgetViewHolder<T>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SingleTypeWidgetListAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SingleTypeWidgetListAdapter singleTypeWidgetListAdapter) {
            super(1);
            this.this$0 = singleTypeWidgetListAdapter;
        }

        @NotNull
        public final ItemWidgetViewHolder<T> invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 24543, new Class[]{ViewGroup.class}, ItemWidgetViewHolder.class)) {
                return (ItemWidgetViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 24543, new Class[]{ViewGroup.class}, ItemWidgetViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return this.this$0.a(viewGroup2);
        }
    }

    @NotNull
    public abstract ItemWidgetViewHolder<T> a(@NotNull ViewGroup viewGroup);

    @NotNull
    public final com.bytedance.jedi.arch.ext.list.differ.b<T> a() {
        return this.f2734f;
    }

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f2733e, false, 24536, new Class[0], Integer.TYPE)) {
            return a().a() + d();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2733e, false, 24536, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f2733e, false, 24537, new Class[0], Integer.TYPE)) {
            return super.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2733e, false, 24537, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(@Nullable List<? extends T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f2733e, false, 24541, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f2733e, false, 24541, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a.C0194a.a((com.bytedance.jedi.arch.ext.list.a<T>) this, list);
    }

    public final void a(@NotNull com.bytedance.viewholder.typesafe.b<ItemWidgetViewHolder<T>> bVar) {
        com.bytedance.viewholder.typesafe.b<ItemWidgetViewHolder<T>> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f2733e, false, 24538, new Class[]{com.bytedance.viewholder.typesafe.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f2733e, false, 24538, new Class[]{com.bytedance.viewholder.typesafe.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "registry");
        bVar2.a(0, new b(this));
    }

    @NotNull
    public final Object a(int i) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f2733e, false, 24535, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f2733e, false, 24535, new Class[]{Integer.TYPE}, Object.class);
        }
        int d2 = i - d();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(d2)}, this, f2733e, false, 24540, new Class[]{Integer.TYPE}, Object.class)) {
            obj = PatchProxy.accessDispatch(new Object[]{Integer.valueOf(d2)}, this, f2733e, false, 24540, new Class[]{Integer.TYPE}, Object.class);
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
    public SingleTypeWidgetListAdapter(@org.jetbrains.annotations.NotNull com.bytedance.widget.a r4, @org.jetbrains.annotations.NotNull android.support.v7.util.DiffUtil.ItemCallback<T> r5, @org.jetbrains.annotations.Nullable com.bytedance.jedi.arch.ext.list.differ.e.b r6) {
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
            r3.<init>((com.bytedance.widget.a) r4, (com.bytedance.jedi.arch.ext.list.differ.e) r6, (com.bytedance.jedi.arch.ext.list.differ.c<T>) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.arch.SingleTypeWidgetListAdapter.<init>(com.bytedance.widget.a, android.support.v7.util.DiffUtil$ItemCallback, com.bytedance.jedi.arch.ext.list.differ.e$b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SingleTypeWidgetListAdapter(@NotNull com.bytedance.widget.a aVar, @Nullable e eVar, @NotNull c<T> cVar) {
        super(aVar);
        Intrinsics.checkParameterIsNotNull(aVar, "widgetManager");
        Intrinsics.checkParameterIsNotNull(cVar, "config");
        this.f2734f = new com.bytedance.jedi.arch.ext.list.differ.b<>((ListUpdateCallback) new ItemWidgetListUpdateCallback(this, new a(this)), cVar, eVar);
    }
}
