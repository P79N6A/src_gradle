package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolder;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.StoryMultiTypeAdapter;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryRawAdapter;", "VH", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeAdapter;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderFactoryManagerOwner;", "parent", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "manager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderFactoryManager;", "getManager", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderFactoryManager;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class StoryRawAdapter<VH extends StoryViewHolder<? extends d, ?>> extends StoryMultiTypeAdapter<VH> implements d<VH> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final c<VH> f72622a;

    @NotNull
    /* renamed from: b */
    public c<VH> c() {
        return this.f72622a;
    }

    public StoryRawAdapter(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "parent");
        c<VH> cVar = new c<>(lifecycleOwner);
        a((b<VH>) cVar);
        this.f72622a = cVar;
    }
}
