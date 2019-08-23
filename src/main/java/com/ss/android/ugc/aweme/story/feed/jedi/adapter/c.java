package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.jedi.arch.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolder;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.StoryMultiTypeViewHolder;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderFactoryManager;", "VH", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryRawViewHolderFactoryManager;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "itemInitStateManager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderItemInitiationStatusManager;", "getItemInitStateManager$awemestory_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderItemInitiationStatusManager;", "proxyProvider", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyProvider;", "getProxyProvider$awemestory_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyProvider;", "initViewHolder", "holder", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;)Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c<VH extends StoryViewHolder<? extends d, ?>> extends a<VH> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72632a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final e f72633b = new e();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final g f72634c;

    /* renamed from: f  reason: collision with root package name */
    private final LifecycleOwner f72635f;

    public c(@NotNull LifecycleOwner lifecycleOwner) {
        StoryViewHolderProxyManager storyViewHolderProxyManager;
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        this.f72635f = lifecycleOwner;
        LifecycleOwner lifecycleOwner2 = this.f72635f;
        if (lifecycleOwner2 instanceof Fragment) {
            StoryViewHolderProxyManager.a aVar = StoryViewHolderProxyManager.f72625c;
            Fragment fragment = (Fragment) this.f72635f;
            if (PatchProxy.isSupport(new Object[]{fragment}, aVar, StoryViewHolderProxyManager.a.f72630a, false, 83546, new Class[]{Fragment.class}, StoryViewHolderProxyManager.class)) {
                StoryViewHolderProxyManager.a aVar2 = aVar;
                storyViewHolderProxyManager = (StoryViewHolderProxyManager) PatchProxy.accessDispatch(new Object[]{fragment}, aVar2, StoryViewHolderProxyManager.a.f72630a, false, 83546, new Class[]{Fragment.class}, StoryViewHolderProxyManager.class);
            } else {
                Intrinsics.checkParameterIsNotNull(fragment, "fragment");
                storyViewHolderProxyManager = aVar.a(null, fragment);
            }
        } else if (lifecycleOwner2 instanceof FragmentActivity) {
            StoryViewHolderProxyManager.a aVar3 = StoryViewHolderProxyManager.f72625c;
            FragmentActivity fragmentActivity = (FragmentActivity) this.f72635f;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity}, aVar3, StoryViewHolderProxyManager.a.f72630a, false, 83545, new Class[]{FragmentActivity.class}, StoryViewHolderProxyManager.class)) {
                StoryViewHolderProxyManager.a aVar4 = aVar3;
                storyViewHolderProxyManager = (StoryViewHolderProxyManager) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, aVar4, StoryViewHolderProxyManager.a.f72630a, false, 83545, new Class[]{FragmentActivity.class}, StoryViewHolderProxyManager.class);
            } else {
                Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
                storyViewHolderProxyManager = aVar3.a(fragmentActivity, null);
            }
        } else {
            throw new IllegalStateException("owner must be either FragmentActivity or Fragment");
        }
        this.f72634c = new g(storyViewHolderProxyManager);
    }

    public final /* synthetic */ StoryMultiTypeViewHolder a(StoryMultiTypeViewHolder storyMultiTypeViewHolder) {
        StoryViewHolder storyViewHolder;
        StoryViewHolder storyViewHolder2 = (StoryViewHolder) storyMultiTypeViewHolder;
        if (PatchProxy.isSupport(new Object[]{storyViewHolder2}, this, f72632a, false, 83516, new Class[]{StoryViewHolder.class}, StoryViewHolder.class)) {
            storyViewHolder = (StoryViewHolder) PatchProxy.accessDispatch(new Object[]{storyViewHolder2}, this, f72632a, false, 83516, new Class[]{StoryViewHolder.class}, StoryViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(storyViewHolder2, "holder");
            storyViewHolder = (StoryViewHolder) super.a(storyViewHolder2);
            LifecycleOwner lifecycleOwner = this.f72635f;
            if (PatchProxy.isSupport(new Object[]{lifecycleOwner}, storyViewHolder, StoryViewHolder.m, false, 83473, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
                StoryViewHolder storyViewHolder3 = storyViewHolder;
                PatchProxy.accessDispatch(new Object[]{lifecycleOwner}, storyViewHolder3, StoryViewHolder.m, false, 83473, new Class[]{LifecycleOwner.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(lifecycleOwner, "<set-?>");
                storyViewHolder.o = lifecycleOwner;
            }
            e eVar = this.f72633b;
            if (PatchProxy.isSupport(new Object[]{eVar}, storyViewHolder, StoryViewHolder.m, false, 83475, new Class[]{e.class}, Void.TYPE)) {
                StoryViewHolder storyViewHolder4 = storyViewHolder;
                PatchProxy.accessDispatch(new Object[]{eVar}, storyViewHolder4, StoryViewHolder.m, false, 83475, new Class[]{e.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(eVar, "<set-?>");
                storyViewHolder.p = eVar;
            }
            g gVar = this.f72634c;
            if (PatchProxy.isSupport(new Object[]{gVar}, storyViewHolder, StoryViewHolder.m, false, 83477, new Class[]{g.class}, Void.TYPE)) {
                StoryViewHolder storyViewHolder5 = storyViewHolder;
                PatchProxy.accessDispatch(new Object[]{gVar}, storyViewHolder5, StoryViewHolder.m, false, 83477, new Class[]{g.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(gVar, "<set-?>");
                storyViewHolder.q = gVar;
            }
        }
        return storyViewHolder;
    }
}
