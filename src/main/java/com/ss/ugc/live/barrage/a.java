package com.ss.ugc.live.barrage;

import com.ss.ugc.live.barrage.a.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0006\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u0010\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/ugc/live/barrage/BarrageCopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "()V", "onChangerListener", "Lcom/ss/ugc/live/barrage/BarrageCopyOnWriteArrayList$OnChangerListener;", "add", "", "element", "", "index", "", "addAll", "elements", "", "remove", "removeAll", "removeAt", "setOnChangeListener", "listener", "OnChangerListener", "barrage_release"}, k = 1, mv = {1, 1, 15})
public final class a extends CopyOnWriteArrayList<com.ss.ugc.live.barrage.a.a> {
    private C0839a onChangerListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/ugc/live/barrage/BarrageCopyOnWriteArrayList$OnChangerListener;", "", "onChanger", "", "isAdd", "", "barrage", "Lcom/ss/ugc/live/barrage/barrage/AbsBarrage;", "barrage_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.ugc.live.barrage.a$a  reason: collision with other inner class name */
    public interface C0839a {
        void a(boolean z, @NotNull com.ss.ugc.live.barrage.a.a aVar);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(com.ss.ugc.live.barrage.a.a aVar) {
        return super.contains(aVar);
    }

    public final /* bridge */ int indexOf(com.ss.ugc.live.barrage.a.a aVar) {
        return super.indexOf(aVar);
    }

    public final /* bridge */ int lastIndexOf(com.ss.ugc.live.barrage.a.a aVar) {
        return super.lastIndexOf(aVar);
    }

    public final com.ss.ugc.live.barrage.a.a remove(int i) {
        return remove(i);
    }

    public final void setOnChangeListener(@NotNull C0839a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.onChangerListener = aVar;
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof com.ss.ugc.live.barrage.a.a;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return contains((com.ss.ugc.live.barrage.a.a) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof com.ss.ugc.live.barrage.a.a;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return indexOf((com.ss.ugc.live.barrage.a.a) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof com.ss.ugc.live.barrage.a.a;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return lastIndexOf((com.ss.ugc.live.barrage.a.a) obj);
    }

    public final boolean remove(@Nullable com.ss.ugc.live.barrage.a.a aVar) {
        boolean remove = super.remove(aVar);
        if (aVar != null) {
            aVar.a((a.C0840a) a.C0840a.C0841a.f78684a);
            C0839a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.a(false, aVar);
            }
        }
        return remove;
    }

    @NotNull
    /* renamed from: removeAt */
    public final com.ss.ugc.live.barrage.a.a remove(int i) {
        com.ss.ugc.live.barrage.a.a aVar = (com.ss.ugc.live.barrage.a.a) super.remove(i);
        if (aVar != null) {
            aVar.a((a.C0840a) a.C0840a.C0841a.f78684a);
            C0839a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.a(false, aVar);
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(aVar, "barrage");
        return aVar;
    }

    public final boolean add(@NotNull com.ss.ugc.live.barrage.a.a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "element");
        boolean add = super.add(aVar);
        aVar.a((a.C0840a) a.C0840a.d.f78687a);
        C0839a aVar2 = this.onChangerListener;
        if (aVar2 != null) {
            aVar2.a(true, aVar);
        }
        return add;
    }

    public final /* bridge */ boolean remove(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof com.ss.ugc.live.barrage.a.a;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return remove((com.ss.ugc.live.barrage.a.a) obj);
    }

    public final boolean removeAll(@NotNull Collection<? extends Object> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        boolean removeAll = super.removeAll(collection);
        Iterator<? extends Object> it2 = collection.iterator();
        while (it2.hasNext()) {
            com.ss.ugc.live.barrage.a.a aVar = (com.ss.ugc.live.barrage.a.a) it2.next();
            if (aVar != null) {
                aVar.a((a.C0840a) a.C0840a.C0841a.f78684a);
                C0839a aVar2 = this.onChangerListener;
                if (aVar2 != null) {
                    aVar2.a(false, aVar);
                }
            }
        }
        return removeAll;
    }

    public final boolean addAll(@NotNull Collection<? extends com.ss.ugc.live.barrage.a.a> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        boolean addAll = super.addAll(collection);
        for (com.ss.ugc.live.barrage.a.a aVar : collection) {
            aVar.a((a.C0840a) a.C0840a.d.f78687a);
            C0839a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.a(true, aVar);
            }
        }
        return addAll;
    }

    public final void add(int i, @NotNull com.ss.ugc.live.barrage.a.a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "element");
        super.add(i, aVar);
        aVar.a((a.C0840a) a.C0840a.d.f78687a);
        C0839a aVar2 = this.onChangerListener;
        if (aVar2 != null) {
            aVar2.a(true, aVar);
        }
    }

    public final boolean addAll(int i, @NotNull Collection<? extends com.ss.ugc.live.barrage.a.a> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "elements");
        boolean addAll = super.addAll(i, collection);
        for (com.ss.ugc.live.barrage.a.a aVar : collection) {
            aVar.a((a.C0840a) a.C0840a.d.f78687a);
            C0839a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.a(true, aVar);
            }
        }
        return addAll;
    }
}
