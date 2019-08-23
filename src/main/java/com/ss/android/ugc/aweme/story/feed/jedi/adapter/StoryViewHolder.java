package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.CallSuper;
import android.support.annotation.RestrictTo;
import android.view.View;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.e;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.r;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.i;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.StoryMultiTypeViewHolder;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u00052\u00020\u00062\b\u0012\u0004\u0012\u0002H\u00010\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u00104\u001a\u000205H\u0016J\u001d\u00106\u001a\u0002052\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u00107\u001a\u00020\u0013H\u0007¢\u0006\u0002\u00108J\u0010\u00109\u001a\u0002052\u0006\u00107\u001a\u00020\u0013H\u0002J\b\u0010:\u001a\u000205H\u0007J\b\u0010;\u001a\u000205H\u0016J\b\u0010<\u001a\u00020\u0005H\u0007J\b\u0010=\u001a\u00020>H\u0016J\b\u0010?\u001a\u000205H\u0002J\b\u0010@\u001a\u000205H\u0002J\u001d\u0010A\u001a\u0002052\u0006\u0010\u000f\u001a\u00028\u00012\u0006\u00107\u001a\u00020\u0013H$¢\u0006\u0002\u00108J\b\u0010B\u001a\u000205H\u0017J\b\u0010C\u001a\u000205H\u0017J\b\u0010D\u001a\u000205H\u0017J\b\u0010E\u001a\u000205H\u0017J\b\u0010F\u001a\u000205H\u0017J\b\u0010G\u001a\u000205H\u0017R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00028\u00018DX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138DX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u0004\u0018\u00018\u0001X\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020 X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X.¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u0001018WX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006H"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolder;", "R", "Lcom/bytedance/jedi/arch/IReceiver;", "ITEM", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;", "Landroid/arch/lifecycle/LifecycleOwner;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderSubscriber;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "currentProxy", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxy;", "isResumed", "", "item", "getItem", "()Ljava/lang/Object;", "itemPosition", "", "getItemPosition", "()I", "latestItemInternal", "Ljava/lang/Object;", "latestItemPositionInternal", "lifecycleRegistry", "Landroid/arch/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroid/arch/lifecycle/LifecycleRegistry;", "lifecycleRegistry$delegate", "Lkotlin/Lazy;", "manager", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderItemInitiationStatusManager;", "getManager$awemestory_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderItemInitiationStatusManager;", "setManager$awemestory_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderItemInitiationStatusManager;)V", "parent", "getParent$awemestory_douyinCnRelease", "()Landroid/arch/lifecycle/LifecycleOwner;", "setParent$awemestory_douyinCnRelease", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "provider", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyProvider;", "getProvider$awemestory_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyProvider;", "setProvider$awemestory_douyinCnRelease", "(Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyProvider;)V", "proxy", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/IStoryViewHolderProxy;", "getProxy", "()Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/IStoryViewHolderProxy;", "attachToWindow", "", "bind", "position", "(Ljava/lang/Object;I)V", "bindWidget", "create", "detachFromWindow", "getHost", "getLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "moveToResumed", "moveToStop", "onBindItem", "onCreate", "onDestroy", "onPause", "onResume", "onStart", "onStop", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class StoryViewHolder<R extends d, ITEM> extends StoryMultiTypeViewHolder<ITEM> implements LifecycleObserver, LifecycleOwner, i<R> {
    public static ChangeQuickRedirect m;
    static final /* synthetic */ KProperty[] n = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(StoryViewHolder.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: a  reason: collision with root package name */
    private ITEM f4124a;

    /* renamed from: b  reason: collision with root package name */
    private StoryViewHolderProxy f4125b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f4126c = LazyKt.lazy(new a(this));

    /* renamed from: d  reason: collision with root package name */
    private boolean f4127d;
    @NotNull
    public LifecycleOwner o;
    @NotNull
    public e p;
    @NotNull
    public g q;
    public int r;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002 \u0001*\u00020\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/arch/lifecycle/LifecycleRegistry;", "R", "Lcom/bytedance/jedi/arch/IReceiver;", "ITEM", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<LifecycleRegistry> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ StoryViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(StoryViewHolder storyViewHolder) {
            super(0);
            this.this$0 = storyViewHolder;
        }

        @NotNull
        public final LifecycleRegistry invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83515, new Class[0], LifecycleRegistry.class)) {
                return new LifecycleRegistry(this.this$0);
            }
            return (LifecycleRegistry) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83515, new Class[0], LifecycleRegistry.class);
        }
    }

    private final LifecycleRegistry d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83478, new Class[0], LifecycleRegistry.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, m, false, 83478, new Class[0], LifecycleRegistry.class);
        } else {
            value = this.f4126c.getValue();
        }
        return (LifecycleRegistry) value;
    }

    public abstract void a(ITEM item, int i);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final a t() {
        return this.f4125b;
    }

    private final void e() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83493, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f4127d) {
            this.f4127d = true;
            LifecycleOwner lifecycleOwner = this.o;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parent");
            }
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    @NotNull
    public Lifecycle getLifecycle() {
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 83491, new Class[0], Lifecycle.class)) {
            return d();
        }
        return (Lifecycle) PatchProxy.accessDispatch(new Object[0], this, m, false, 83491, new Class[0], Lifecycle.class);
    }

    @CallSuper
    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83485, new Class[0], Void.TYPE);
            return;
        }
        d().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    @CallSuper
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83490, new Class[0], Void.TYPE);
            return;
        }
        d().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    @CallSuper
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83488, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83488, new Class[0], Void.TYPE);
            return;
        }
        d().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    @CallSuper
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83487, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83487, new Class[0], Void.TYPE);
            return;
        }
        d().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    @CallSuper
    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83486, new Class[0], Void.TYPE);
            return;
        }
        d().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    @CallSuper
    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83489, new Class[0], Void.TYPE);
            return;
        }
        d().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public final ITEM s() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83479, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, m, false, 83479, new Class[0], Object.class);
        }
        ITEM item = this.f4124a;
        if (item == null) {
            Intrinsics.throwNpe();
        }
        return item;
    }

    @NotNull
    public final k a() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83495, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], this, m, false, 83495, new Class[0], k.class);
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, i.a.f72646a, true, 83559, new Class[]{i.class}, k.class)) {
            obj = PatchProxy.accessDispatch(new Object[]{this}, null, i.a.f72646a, true, 83559, new Class[]{i.class}, k.class);
        } else {
            obj = t();
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.LifecycleOwnerHolder");
            }
        }
        return (k) obj;
    }

    @NotNull
    public final r<R> b() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83496, new Class[0], r.class)) {
            return (r) PatchProxy.accessDispatch(new Object[0], this, m, false, 83496, new Class[0], r.class);
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, i.a.f72646a, true, 83560, new Class[]{i.class}, r.class)) {
            obj = PatchProxy.accessDispatch(new Object[]{this}, null, i.a.f72646a, true, 83560, new Class[]{i.class}, r.class);
        } else {
            obj = t();
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.ReceiverHolder<VH>");
            }
        }
        return (r) obj;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83497, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, m, false, 83497, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!PatchProxy.isSupport(new Object[]{this}, null, i.a.f72646a, true, 83561, new Class[]{i.class}, Boolean.TYPE)) {
            return true;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{this}, null, i.a.f72646a, true, 83561, new Class[]{i.class}, Boolean.TYPE)).booleanValue();
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83482, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83482, new Class[0], Void.TYPE);
            return;
        }
        super.u();
        StoryViewHolderProxy storyViewHolderProxy = this.f4125b;
        if (storyViewHolderProxy != null) {
            if (PatchProxy.isSupport(new Object[]{this}, storyViewHolderProxy, StoryViewHolderProxy.f4128a, false, 83528, new Class[]{StoryViewHolder.class}, Void.TYPE)) {
                Object[] objArr = {this};
                StoryViewHolderProxy storyViewHolderProxy2 = storyViewHolderProxy;
                PatchProxy.accessDispatch(objArr, storyViewHolderProxy2, StoryViewHolderProxy.f4128a, false, 83528, new Class[]{StoryViewHolder.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(this, "holder");
                storyViewHolderProxy.f4130c = this;
            }
        }
        e();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83484, new Class[0], Void.TYPE);
            return;
        }
        e eVar = this.p;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("manager");
        }
        int i = this.r;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, eVar, e.f72636a, false, 83518, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            Object[] objArr = {Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            e eVar2 = eVar;
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar2, e.f72636a, false, 83518, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i >= 0 && i < eVar.f72637b.size()) {
            z = eVar.f72637b.get(i).booleanValue();
        }
        if (!z) {
            l();
            e eVar3 = this.p;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
            }
            eVar3.a(this.r, true);
        }
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, m, false, 83483, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83483, new Class[0], Void.TYPE);
            return;
        }
        if (!PatchProxy.isSupport(new Object[0], this, m, false, 83494, new Class[0], Void.TYPE)) {
            this.f4127d = false;
            LifecycleOwner lifecycleOwner = this.o;
            if (lifecycleOwner == null) {
                Intrinsics.throwUninitializedPropertyAccessException("parent");
            }
            lifecycleOwner.getLifecycle().removeObserver(this);
            switch (b.f72631a[getLifecycle().getCurrentState().ordinal()]) {
                case 1:
                    onStop();
                    break;
                case 2:
                    onStop();
                    break;
                case 3:
                    onPause();
                    onStop();
                    break;
            }
        } else {
            PatchProxy.accessDispatch(new Object[0], this, m, false, 83494, new Class[0], Void.TYPE);
        }
        StoryViewHolderProxy storyViewHolderProxy = this.f4125b;
        if (storyViewHolderProxy != null) {
            storyViewHolderProxy.f4130c = null;
        }
        super.v();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "view");
    }

    public final <VM1 extends JediViewModel<S1>, S1 extends x, R> R a(@NotNull VM1 vm1, @NotNull Function1<? super S1, ? extends R> function1) {
        VM1 vm12 = vm1;
        Function1<? super S1, ? extends R> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{vm12, function12}, this, m, false, 83498, new Class[]{JediViewModel.class, Function1.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{vm12, function12}, this, m, false, 83498, new Class[]{JediViewModel.class, Function1.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(vm12, "viewModel1");
        Intrinsics.checkParameterIsNotNull(function12, "block");
        return i.a.a(this, vm1, function1);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void b(ITEM item, int i) {
        StoryViewHolderProxy storyViewHolderProxy;
        ITEM item2 = item;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{item2, Integer.valueOf(i)}, this, m, false, 83480, new Class[]{Object.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{item2, Integer.valueOf(i)}, this, m, false, 83480, new Class[]{Object.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f4124a = item2;
        this.r = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, m, false, 83481, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, m, false, 83481, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            g gVar = this.q;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("provider");
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, gVar, g.f72639a, false, 83549, new Class[]{Integer.TYPE}, StoryViewHolderProxy.class)) {
                storyViewHolderProxy = (StoryViewHolderProxy) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, gVar, g.f72639a, false, 83549, new Class[]{Integer.TYPE}, StoryViewHolderProxy.class);
            } else {
                h hVar = gVar.f72641c;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, hVar, h.f72643a, false, 83552, new Class[]{Integer.TYPE}, StoryViewHolderProxy.class)) {
                    storyViewHolderProxy = (StoryViewHolderProxy) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, hVar, h.f72643a, false, 83552, new Class[]{Integer.TYPE}, StoryViewHolderProxy.class);
                } else if (i2 < 0 || i2 >= hVar.f72644b.size()) {
                    storyViewHolderProxy = null;
                } else {
                    storyViewHolderProxy = hVar.f72644b.get(i2);
                }
                if (storyViewHolderProxy == null) {
                    storyViewHolderProxy = (StoryViewHolderProxy) gVar.f72640b.invoke();
                    gVar.f72641c.a(i2, storyViewHolderProxy);
                }
            }
            if (storyViewHolderProxy != this.f4125b) {
                StoryViewHolderProxy storyViewHolderProxy2 = this.f4125b;
                if (storyViewHolderProxy2 != null) {
                    g gVar2 = this.q;
                    if (gVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("provider");
                    }
                    storyViewHolderProxy2.a(gVar2.f72642d, null);
                }
                this.f4125b = storyViewHolderProxy;
            }
            g gVar3 = this.q;
            if (gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("provider");
            }
            storyViewHolderProxy.a(gVar3.f72642d, this);
        }
        e();
        a(item, i);
    }

    @NotNull
    public final <S extends x> Disposable a(@NotNull JediViewModel<S> jediViewModel, boolean z, boolean z2, @NotNull Function2<? super R, ? super S, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        Function2<? super R, ? super S, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, m, false, 83514, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, m, false, 83514, new Class[]{JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        if (PatchProxy.isSupport(new Object[]{this, jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, null, i.a.f72646a, true, 83578, new Class[]{i.class, JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{this, jediViewModel2, Byte.valueOf(z), Byte.valueOf(z2), function22}, null, i.a.f72646a, true, 83578, new Class[]{i.class, JediViewModel.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return e.a.a(this, jediViewModel2, z, z2, function22);
    }

    @NotNull
    public final <S extends x, A> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends A> kProperty1, boolean z, boolean z2, @NotNull Function2<? super R, ? super A, Unit> function2) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends A> kProperty12 = kProperty1;
        Function2<? super R, ? super A, Unit> function22 = function2;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function22}, this, m, false, 83509, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22}, this, m, false, 83509, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop1");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        Object[] objArr = {this, jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
        if (PatchProxy.isSupport(objArr, null, i.a.f72646a, true, 83573, new Class[]{i.class, JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class)) {
            Object[] objArr2 = {this, jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function22};
            return (Disposable) PatchProxy.accessDispatch(objArr2, null, i.a.f72646a, true, 83573, new Class[]{i.class, JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop1");
        Intrinsics.checkParameterIsNotNull(function22, "subscriber");
        return e.a.a(this, jediViewModel, kProperty1, z, z2, function2);
    }

    @NotNull
    public final <S extends x, T> Disposable a(@NotNull JediViewModel<S> jediViewModel, @NotNull KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty1, boolean z, boolean z2, @Nullable Function2<? super R, ? super Throwable, Unit> function2, @Nullable Function1<? super R, Unit> function1, @Nullable Function2<? super R, ? super T, Unit> function22) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        KProperty1<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kProperty12 = kProperty1;
        if (PatchProxy.isSupport(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), function2, function1, function22}, this, m, false, 83508, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, this, m, false, 83508, new Class[]{JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        Object[] objArr = {this, jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22};
        if (PatchProxy.isSupport(objArr, null, i.a.f72646a, true, 83572, new Class[]{i.class, JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class)) {
            return (Disposable) PatchProxy.accessDispatch(new Object[]{this, jediViewModel2, kProperty12, Byte.valueOf(z), Byte.valueOf(z2), function2, function1, function22}, null, i.a.f72646a, true, 83572, new Class[]{i.class, JediViewModel.class, KProperty1.class, Boolean.TYPE, Boolean.TYPE, Function2.class, Function1.class, Function2.class}, Disposable.class);
        }
        Intrinsics.checkParameterIsNotNull(jediViewModel2, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(kProperty12, "prop");
        return e.a.a((e<? extends RECEIVER>) this, jediViewModel, kProperty1, z, z2, function2, function1, function22);
    }
}
