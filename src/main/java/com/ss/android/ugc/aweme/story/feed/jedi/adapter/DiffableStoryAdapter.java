package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v7.util.DiffUtil;
import android.support.v7.util.ListUpdateCallback;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.ext.list.a;
import com.bytedance.jedi.arch.ext.list.differ.b;
import com.bytedance.jedi.arch.ext.list.differ.c;
import com.bytedance.jedi.arch.ext.list.differ.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0014\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB'\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0014R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/DiffableStoryAdapter;", "ITEM", "VH", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryRawAdapter;", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "fetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "(Landroid/arch/lifecycle/LifecycleOwner;Landroid/support/v7/util/DiffUtil$ItemCallback;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;)V", "prefetcher", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;", "config", "Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;", "(Landroid/arch/lifecycle/LifecycleOwner;Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher;Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;)V", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "manager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderFactoryManager;", "getManager", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderFactoryManager;", "getItemAt", "", "position", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class DiffableStoryAdapter<ITEM, VH extends StoryViewHolder<? extends d, ITEM>> extends StoryRawAdapter<VH> implements a<ITEM> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72613a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final b<ITEM> f72614b;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final c<VH> f72615d;

    @NotNull
    public final b<ITEM> a() {
        return this.f72614b;
    }

    @NotNull
    /* renamed from: b */
    public final c<VH> c() {
        return this.f72615d;
    }

    @NotNull
    public final List<ITEM> d() {
        if (PatchProxy.isSupport(new Object[0], this, f72613a, false, 83444, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f72613a, false, 83444, new Class[0], List.class);
        }
        List<? extends T> list = a().f21358c;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return list;
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f72613a, false, 83443, new Class[0], Integer.TYPE)) {
            return a.C0194a.a(this);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72613a, false, 83443, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(@Nullable List<? extends ITEM> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f72613a, false, 83446, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f72613a, false, 83446, new Class[]{List.class}, Void.TYPE);
            return;
        }
        a.C0194a.a((a<T>) this, list);
    }

    @NotNull
    public final Object a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72613a, false, 83442, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72613a, false, 83442, new Class[]{Integer.TYPE}, Object.class);
        }
        Object b2 = b(i);
        if (b2 != null) {
            return b2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Any");
    }

    @Nullable
    public final ITEM b(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72613a, false, 83445, new Class[]{Integer.TYPE}, Object.class)) {
            return a.C0194a.a((a<T>) this, i);
        }
        return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72613a, false, 83445, new Class[]{Integer.TYPE}, Object.class);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private DiffableStoryAdapter(@org.jetbrains.annotations.NotNull android.arch.lifecycle.LifecycleOwner r4, @org.jetbrains.annotations.NotNull android.support.v7.util.DiffUtil.ItemCallback<ITEM> r5, @org.jetbrains.annotations.Nullable com.bytedance.jedi.arch.ext.list.differ.e.b r6) {
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
            r3.<init>((android.arch.lifecycle.LifecycleOwner) r4, (com.bytedance.jedi.arch.ext.list.differ.e) r6, (com.bytedance.jedi.arch.ext.list.differ.c<ITEM>) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.jedi.adapter.DiffableStoryAdapter.<init>(android.arch.lifecycle.LifecycleOwner, android.support.v7.util.DiffUtil$ItemCallback, com.bytedance.jedi.arch.ext.list.differ.e$b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DiffableStoryAdapter(@NotNull LifecycleOwner lifecycleOwner, @Nullable e eVar, @NotNull c<ITEM> cVar) {
        super(lifecycleOwner);
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        Intrinsics.checkParameterIsNotNull(cVar, "config");
        this.f72614b = new b<>((ListUpdateCallback) new StoryListUpdateCallback(this, null, 2), cVar, eVar);
        c<VH> cVar2 = new c<>(lifecycleOwner);
        a((com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.b<VH>) cVar2);
        this.f72615d = cVar2;
    }

    public /* synthetic */ DiffableStoryAdapter(LifecycleOwner lifecycleOwner, DiffUtil.ItemCallback itemCallback, e.b bVar, int i) {
        this(lifecycleOwner, itemCallback, (e.b) null);
    }
}
