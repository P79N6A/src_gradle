package com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.StoryMultiTypeViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH$J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rJ\u001b\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u0012J)\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001e\u001a\u00020\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000 H$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeAdapter;", "VH", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryRawViewHolderFactoryManagerOwner;", "()V", "manager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryRawViewHolderFactoryManager;", "getManager", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryRawViewHolderFactoryManager;", "getItemAt", "", "position", "", "getItemViewType", "onBindViewHolder", "", "holder", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;I)V", "payloads", "", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;ILjava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;", "onViewAttachedToWindow", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;)V", "onViewDetachedFromWindow", "registerFactories", "registry", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryViewHolderFactoryRegistry;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class StoryMultiTypeAdapter<VH extends StoryMultiTypeViewHolder<?>> extends RecyclerView.Adapter<VH> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f72652c;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final a<VH> f72653a;

    @NotNull
    public abstract Object a(int i);

    public abstract void a(@NotNull b<VH> bVar);

    @NotNull
    public a<VH> c() {
        return this.f72653a;
    }

    public StoryMultiTypeAdapter() {
        a<VH> aVar = new a<>();
        a((b<VH>) aVar);
        this.f72653a = aVar;
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(@NotNull VH vh) {
        VH vh2 = vh;
        if (PatchProxy.isSupport(new Object[]{vh2}, this, f72652c, false, 83583, new Class[]{StoryMultiTypeViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vh2}, this, f72652c, false, 83583, new Class[]{StoryMultiTypeViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(vh2, "holder");
        vh.u();
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(@NotNull VH vh) {
        VH vh2 = vh;
        if (PatchProxy.isSupport(new Object[]{vh2}, this, f72652c, false, 83584, new Class[]{StoryMultiTypeViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vh2}, this, f72652c, false, 83584, new Class[]{StoryMultiTypeViewHolder.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(vh2, "holder");
        vh.v();
    }

    public final int getItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72652c, false, 83585, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return c().a(i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72652c, false, 83585, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        StoryMultiTypeViewHolder storyMultiTypeViewHolder = (StoryMultiTypeViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{storyMultiTypeViewHolder, Integer.valueOf(i)}, this, f72652c, false, 83588, new Class[]{StoryMultiTypeViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{storyMultiTypeViewHolder, Integer.valueOf(i)}, this, f72652c, false, 83588, new Class[]{StoryMultiTypeViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(storyMultiTypeViewHolder, "holder");
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        StoryMultiTypeViewHolder storyMultiTypeViewHolder;
        Function1 function1;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72652c, false, 83586, new Class[]{ViewGroup.class, Integer.TYPE}, StoryMultiTypeViewHolder.class)) {
            storyMultiTypeViewHolder = (StoryMultiTypeViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72652c, false, 83586, new Class[]{ViewGroup.class, Integer.TYPE}, StoryMultiTypeViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            a c2 = c();
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, c2, a.f72654d, false, 83592, new Class[]{ViewGroup.class, Integer.TYPE}, StoryMultiTypeViewHolder.class)) {
                a aVar = c2;
                storyMultiTypeViewHolder = (StoryMultiTypeViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, aVar, a.f72654d, false, 83592, new Class[]{ViewGroup.class, Integer.TYPE}, StoryMultiTypeViewHolder.class);
            } else {
                Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, c2, a.f72654d, false, 83596, new Class[]{Integer.TYPE}, Function1.class)) {
                    a aVar2 = c2;
                    function1 = (Function1) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, aVar2, a.f72654d, false, 83596, new Class[]{Integer.TYPE}, Function1.class);
                } else {
                    if (c2.f72656e.indexOfKey(i2) >= 0) {
                        z = true;
                    }
                    if (z) {
                        Function1<ViewGroup, VH> function12 = c2.f72656e.get(i2);
                        Intrinsics.checkExpressionValueIsNotNull(function12, "factories[viewType]");
                        function1 = function12;
                    } else {
                        throw new IllegalArgumentException(("no factory for viewType " + i2 + " is registered").toString());
                    }
                }
                storyMultiTypeViewHolder = (StoryMultiTypeViewHolder) function1.invoke(viewGroup2);
                c2.a(storyMultiTypeViewHolder);
            }
        }
        return storyMultiTypeViewHolder;
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        int i2 = i;
        List list2 = list;
        StoryMultiTypeViewHolder storyMultiTypeViewHolder = (StoryMultiTypeViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{storyMultiTypeViewHolder, Integer.valueOf(i), list2}, this, f72652c, false, 83587, new Class[]{StoryMultiTypeViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{storyMultiTypeViewHolder, Integer.valueOf(i), list2}, this, f72652c, false, 83587, new Class[]{StoryMultiTypeViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(storyMultiTypeViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        a c2 = c();
        Object a2 = a(i2);
        if (PatchProxy.isSupport(new Object[]{storyMultiTypeViewHolder, a2, Integer.valueOf(i), list2}, c2, a.f72654d, false, 83594, new Class[]{StoryMultiTypeViewHolder.class, Object.class, Integer.TYPE, List.class}, Void.TYPE)) {
            a aVar = c2;
            PatchProxy.accessDispatch(new Object[]{storyMultiTypeViewHolder, a2, Integer.valueOf(i), list2}, aVar, a.f72654d, false, 83594, new Class[]{StoryMultiTypeViewHolder.class, Object.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(storyMultiTypeViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(a2, "item");
        Object obj = a2;
        if (PatchProxy.isSupport(new Object[]{a2, Integer.valueOf(i), list2}, storyMultiTypeViewHolder, StoryMultiTypeViewHolder.s, false, 83589, new Class[]{Object.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), list2}, storyMultiTypeViewHolder, StoryMultiTypeViewHolder.s, false, 83589, new Class[]{Object.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        storyMultiTypeViewHolder.b(obj, i2);
    }
}
