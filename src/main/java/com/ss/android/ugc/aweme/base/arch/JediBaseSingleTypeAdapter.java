package com.ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.differ.c;
import com.bytedance.jedi.arch.ext.list.differ.e;
import com.bytedance.jedi.ext.adapter.JediListUpdateCallback;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0016\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0005B+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB'\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0016\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u0019H\u0016J$\u0010\u001e\u001a\u00020\u001f2\u001a\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00030!H\u0004R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/base/arch/JediBaseSingleTypeAdapter;", "T", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseRawAdapter;", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Landroid/arch/lifecycle/LifecycleOwner;Landroid/support/v7/util/DiffUtil$ItemCallback;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "prefetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;", "config", "Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;", "(Landroid/arch/lifecycle/LifecycleOwner;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;)V", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "createViewHolder", "Landroid/view/ViewGroup;", "getBasicItemCount", "", "getItemAt", "", "position", "getItemCount", "registerFactories", "", "registry", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryRegistry;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class JediBaseSingleTypeAdapter<T> extends JediBaseRawAdapter<JediViewHolder<? extends d, T>> implements com.bytedance.jedi.arch.ext.list.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34639a;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.jedi.arch.ext.list.differ.b<T> f34640f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "it", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<Integer, Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ JediBaseSingleTypeAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(JediBaseSingleTypeAdapter jediBaseSingleTypeAdapter) {
            super(1);
            this.this$0 = jediBaseSingleTypeAdapter;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(invoke(((Number) obj).intValue()));
        }

        public final int invoke(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24514, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return i + this.this$0.c();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 24514, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "T", "it", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<ViewGroup, JediViewHolder<? extends d, T>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ JediBaseSingleTypeAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(JediBaseSingleTypeAdapter jediBaseSingleTypeAdapter) {
            super(1);
            this.this$0 = jediBaseSingleTypeAdapter;
        }

        @NotNull
        public final JediViewHolder<? extends d, T> invoke(@NotNull ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 24515, new Class[]{ViewGroup.class}, JediViewHolder.class)) {
                return (JediViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 24515, new Class[]{ViewGroup.class}, JediViewHolder.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, AdvanceSetting.NETWORK_TYPE);
            return this.this$0.a(viewGroup2);
        }
    }

    @NotNull
    public abstract JediViewHolder<? extends d, T> a(@NotNull ViewGroup viewGroup);

    @NotNull
    public final com.bytedance.jedi.arch.ext.list.differ.b<T> a() {
        return this.f34640f;
    }

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f34639a, false, 24509, new Class[0], Integer.TYPE)) {
            return a().a() + c();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34639a, false, 24509, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f34639a, false, 24510, new Class[0], Integer.TYPE)) {
            return super.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f34639a, false, 24510, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(@Nullable List<? extends T> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f34639a, false, 24513, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f34639a, false, 24513, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a.C0194a.a((com.bytedance.jedi.arch.ext.list.a<T>) this, list);
    }

    @NotNull
    public final Object a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34639a, false, 24507, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34639a, false, 24507, new Class[]{Integer.TYPE}, Object.class);
        }
        Object a2 = a().a(i - c());
        if (a2 != null) {
            return a2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
    }

    public final void a(@NotNull com.bytedance.jedi.ext.adapter.multitype.d<JediViewHolder<? extends d, T>> dVar) {
        com.bytedance.jedi.ext.adapter.multitype.d<JediViewHolder<? extends d, T>> dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f34639a, false, 24508, new Class[]{com.bytedance.jedi.ext.adapter.multitype.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f34639a, false, 24508, new Class[]{com.bytedance.jedi.ext.adapter.multitype.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "registry");
        dVar2.a(0, new b(this));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private JediBaseSingleTypeAdapter(@org.jetbrains.annotations.NotNull android.arch.lifecycle.LifecycleOwner r4, @org.jetbrains.annotations.NotNull android.support.v7.util.DiffUtil.ItemCallback<T> r5, @org.jetbrains.annotations.Nullable com.bytedance.jedi.arch.ext.list.differ.e.b r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
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
            com.bytedance.jedi.arch.ext.list.differ.c r5 = kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, "$this$asDifferConfig")
            r3.<init>((android.arch.lifecycle.LifecycleOwner) r4, (com.bytedance.jedi.arch.ext.list.differ.e) r6, (com.bytedance.jedi.arch.ext.list.differ.c<T>) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter.<init>(android.arch.lifecycle.LifecycleOwner, android.support.v7.util.DiffUtil$ItemCallback, com.bytedance.jedi.arch.ext.list.differ.e$b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private JediBaseSingleTypeAdapter(@NotNull LifecycleOwner lifecycleOwner, @Nullable e eVar, @NotNull c<T> cVar) {
        super(lifecycleOwner);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        Intrinsics.checkParameterIsNotNull(cVar, "config");
        this.f34640f = new com.bytedance.jedi.arch.ext.list.differ.b<>((ListUpdateCallback) new JediListUpdateCallback(this, new a(this)), cVar, eVar);
    }

    public /* synthetic */ JediBaseSingleTypeAdapter(LifecycleOwner lifecycleOwner, DiffUtil.ItemCallback itemCallback, e.b bVar, int i) {
        this(lifecycleOwner, itemCallback, (e.b) null);
    }
}
