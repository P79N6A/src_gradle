package com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.StoryMultiTypeViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0018J3\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\r2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000b¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rJ&\u0010 \u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\t2\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u0015\u0010!\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\"JW\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032%\u0010$\u001a!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0007j\u0002`\u00122 \u0010%\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\tH\u0016J8\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001d\u001a\u00020\r2 \u0010%\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\tH\u0016R.\u0010\u0005\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\t0\u0006X\u0004¢\u0006\u0002\n\u0000RY\u0010\n\u001aM\u0012I\u0012G\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\t\u0012#\u0012!\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0007j\u0002`\u00120\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryRawViewHolderFactoryManager;", "VH", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryViewHolderFactoryRegistry;", "()V", "factories", "Landroid/util/SparseArray;", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/ViewHolderFactory;", "holderCreators", "", "Lkotlin/Pair;", "", "Lkotlin/ParameterName;", "name", "position", "", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/ViewHolderTypeMatcher;", "bindViewHolder", "", "holder", "item", "", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;Ljava/lang/Object;I)V", "payloads", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;Ljava/lang/Object;ILjava/util/List;)V", "createViewHolder", "parent", "viewType", "(Landroid/view/ViewGroup;I)Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;", "findItemViewType", "getFactory", "initViewHolder", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;)Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;", "register", "typeMatcher", "factory", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class a<VH extends StoryMultiTypeViewHolder<?>> implements b<VH> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f72654d;

    /* renamed from: a  reason: collision with root package name */
    private final List<Pair<Function1<ViewGroup, VH>, Function1<Integer, Boolean>>> f72655a = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    final SparseArray<Function1<ViewGroup, VH>> f72656e = new SparseArray<>();

    @NotNull
    public VH a(@NotNull VH vh) {
        VH vh2 = vh;
        if (PatchProxy.isSupport(new Object[]{vh2}, this, f72654d, false, 83593, new Class[]{StoryMultiTypeViewHolder.class}, StoryMultiTypeViewHolder.class)) {
            return (StoryMultiTypeViewHolder) PatchProxy.accessDispatch(new Object[]{vh2}, this, f72654d, false, 83593, new Class[]{StoryMultiTypeViewHolder.class}, StoryMultiTypeViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(vh2, "holder");
        return vh2;
    }

    public final int a(int i) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72654d, false, 83595, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72654d, false, 83595, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Iterator it2 = this.f72655a.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((Boolean) ((Function1) ((Pair) obj).component2()).invoke(Integer.valueOf(i))).booleanValue()) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            Function1 function1 = (Function1) pair.component1();
            int hashCode = ((Function1) pair.component2()).hashCode();
            if (this.f72656e.get(hashCode) == null) {
                this.f72656e.put(hashCode, function1);
            }
            return hashCode;
        }
        throw new IllegalArgumentException("no factory is registered for this item type".toString());
    }

    @NotNull
    public final b<VH> a(@NotNull Function1<? super Integer, Boolean> function1, @NotNull Function1<? super ViewGroup, ? extends VH> function12) {
        if (PatchProxy.isSupport(new Object[]{function1, function12}, this, f72654d, false, 83591, new Class[]{Function1.class, Function1.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{function1, function12}, this, f72654d, false, 83591, new Class[]{Function1.class, Function1.class}, b.class);
        }
        Intrinsics.checkParameterIsNotNull(function1, "typeMatcher");
        Intrinsics.checkParameterIsNotNull(function12, "factory");
        this.f72655a.add(TuplesKt.to(function12, function1));
        return this;
    }
}
