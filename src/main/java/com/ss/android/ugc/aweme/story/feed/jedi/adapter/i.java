package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.e;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderSubscriber;", "VH", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/bytedance/jedi/arch/ISubscriber;", "lifecycleOwnerHolder", "Lcom/bytedance/jedi/arch/LifecycleOwnerHolder;", "getLifecycleOwnerHolder", "()Lcom/bytedance/jedi/arch/LifecycleOwnerHolder;", "proxy", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/IStoryViewHolderProxy;", "getProxy", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/IStoryViewHolderProxy;", "receiverHolder", "Lcom/bytedance/jedi/arch/ReceiverHolder;", "getReceiverHolder", "()Lcom/bytedance/jedi/arch/ReceiverHolder;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface i<VH extends d> extends d, e<VH> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72646a;

        public static <VH extends d, VM1 extends JediViewModel<S1>, S1 extends x, R> R a(i<? extends VH> iVar, @NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
            VM1 vm12 = vm1;
            Function1<? super S1, ? extends R> function12 = function1;
            if (PatchProxy.isSupport(new Object[]{iVar, vm12, function12}, null, f72646a, true, 83562, new Class[]{i.class, JediViewModel.class, Function1.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{iVar, vm12, function12}, null, f72646a, true, 83562, new Class[]{i.class, JediViewModel.class, Function1.class}, Object.class);
            }
            Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
            Intrinsics.checkParameterIsNotNull(function12, "block");
            return e.a.a(vm1, function1);
        }
    }

    @Nullable
    a t();
}
