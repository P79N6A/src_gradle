package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.support.v7.util.ListUpdateCallback;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u00032\u00020\u0004B#\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u00028\u0000X\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryListUpdateCallback;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderFactoryManagerOwner;", "Landroid/support/v7/util/ListUpdateCallback;", "adapter", "positionMapper", "Lkotlin/Function1;", "", "(Landroid/support/v7/widget/RecyclerView$Adapter;Lkotlin/jvm/functions/Function1;)V", "Landroid/support/v7/widget/RecyclerView$Adapter;", "manager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderItemInitiationStatusManager;", "getManager", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderItemInitiationStatusManager;", "proxyWidgetStore", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyStore;", "getProxyWidgetStore", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyStore;", "onChanged", "", "position", "count", "payload", "", "onInserted", "onMoved", "from", "to", "onRemoved", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryListUpdateCallback<T extends RecyclerView.Adapter<?> & d<?>> implements ListUpdateCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72619a;

    /* renamed from: b  reason: collision with root package name */
    private final T f72620b;

    /* renamed from: c  reason: collision with root package name */
    private final Function1<Integer, Integer> f72621c;

    private final e a() {
        if (!PatchProxy.isSupport(new Object[0], this, f72619a, false, 83461, new Class[0], e.class)) {
            return ((d) this.f72620b).b().f72633b;
        }
        return (e) PatchProxy.accessDispatch(new Object[0], this, f72619a, false, 83461, new Class[0], e.class);
    }

    private final h b() {
        if (!PatchProxy.isSupport(new Object[0], this, f72619a, false, 83462, new Class[0], h.class)) {
            return ((d) this.f72620b).b().f72634c.f72641c;
        }
        return (h) PatchProxy.accessDispatch(new Object[0], this, f72619a, false, 83462, new Class[0], h.class);
    }

    private StoryListUpdateCallback(@NotNull T t, @NotNull Function1<? super Integer, Integer> function1) {
        Intrinsics.checkParameterIsNotNull(t, "adapter");
        Intrinsics.checkParameterIsNotNull(function1, "positionMapper");
        this.f72620b = t;
        this.f72621c = function1;
    }

    public final void onInserted(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72619a, false, 83465, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72619a, false, 83465, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i2 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                a().a(i4, false);
                b().a(i4, null);
            }
            this.f72620b.notifyItemRangeInserted(((Number) this.f72621c.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    public final void onMoved(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72619a, false, 83464, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72619a, false, 83464, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        e a2 = a();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, a2, e.f72636a, false, 83522, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            e eVar = a2;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, eVar, e.f72636a, false, 83522, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            List<Boolean> list = a2.f72637b;
            if (i3 < list.size() && i4 < list.size()) {
                boolean booleanValue = list.get(i3).booleanValue();
                list.set(i3, list.get(i4));
                list.set(i4, Boolean.valueOf(booleanValue));
            }
        }
        h b2 = b();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, b2, h.f72643a, false, 83556, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            h hVar = b2;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, hVar, h.f72643a, false, 83556, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            List<StoryViewHolderProxy> list2 = b2.f72644b;
            if (i3 < list2.size() && i4 < list2.size()) {
                list2.set(i3, list2.get(i4));
                list2.set(i4, list2.get(i3));
            }
        }
        this.f72620b.notifyItemMoved(((Number) this.f72621c.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f72621c.invoke(Integer.valueOf(i2))).intValue());
    }

    public final void onRemoved(int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72619a, false, 83466, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72619a, false, 83466, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i5 != 0) {
            e a2 = a();
            if (i4 == 0) {
                if (PatchProxy.isSupport(new Object[0], a2, e.f72636a, false, 83517, new Class[0], Integer.TYPE)) {
                    i3 = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, e.f72636a, false, 83517, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i3 = a2.f72637b.size();
                }
                if (i5 >= i3) {
                    if (PatchProxy.isSupport(new Object[0], a2, e.f72636a, false, 83524, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], a2, e.f72636a, false, 83524, new Class[0], Void.TYPE);
                    } else if (a2.f72637b.size() != 0) {
                        a2.f72637b.clear();
                    }
                    b().a();
                    this.f72620b.notifyDataSetChanged();
                    return;
                }
            }
            for (int i6 = 0; i6 < i5; i6++) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, a2, e.f72636a, false, 83523, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    e eVar = a2;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, eVar, e.f72636a, false, 83523, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (i4 < a2.f72637b.size()) {
                    a2.f72637b.remove(i4);
                }
                h b2 = b();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, b2, h.f72643a, false, 83557, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    h hVar = b2;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, hVar, h.f72643a, false, 83557, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (i4 < b2.f72644b.size()) {
                    StoryViewHolderProxy remove = b2.f72644b.remove(i4);
                    if (remove != null) {
                        b2.f72645c.b(remove);
                    }
                }
            }
            this.f72620b.notifyItemRangeRemoved(((Number) this.f72621c.invoke(Integer.valueOf(i))).intValue(), i5);
        }
    }

    public /* synthetic */ StoryListUpdateCallback(RecyclerView.Adapter adapter, Function1 function1, int i) {
        this(adapter, AnonymousClass1.INSTANCE);
    }

    public final void onChanged(int i, int i2, @Nullable Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f72619a, false, 83463, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f72619a, false, 83463, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        int i3 = i2;
        this.f72620b.notifyItemRangeChanged(((Number) this.f72621c.invoke(Integer.valueOf(i))).intValue(), i2, obj2);
    }
}
