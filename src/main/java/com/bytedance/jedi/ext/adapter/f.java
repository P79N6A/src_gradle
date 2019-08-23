package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import com.bytedance.jedi.ext.adapter.internal.a;
import com.bytedance.jedi.ext.adapter.internal.b;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.c;
import com.bytedance.widget.Widget;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0015R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/JediViewHolderFactoryManager;", "VH", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "Lcom/bytedance/jedi/arch/IReceiver;", "Lcom/bytedance/jedi/ext/adapter/multitype/ViewHolderFactoryManager;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "(Landroid/arch/lifecycle/LifecycleOwner;)V", "itemInitStateManager", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderItemInitiationStatusManager;", "getItemInitStateManager$ext_adapter_release", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderItemInitiationStatusManager;", "proxyProvider", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyProvider;", "getProxyProvider$ext_adapter_release", "()Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyProvider;", "createProxyManager", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "parent", "initViewHolder", "holder", "(Lcom/bytedance/jedi/ext/adapter/JediViewHolder;)Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class f<VH extends JediViewHolder<? extends d, ?>> extends c<VH> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final a f21470a = new a();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.jedi.ext.adapter.internal.d f21471b;

    /* renamed from: d  reason: collision with root package name */
    private final LifecycleOwner f21472d;

    public final /* synthetic */ MultiTypeViewHolder a(MultiTypeViewHolder multiTypeViewHolder) {
        JediViewHolder jediViewHolder = (JediViewHolder) multiTypeViewHolder;
        Intrinsics.checkParameterIsNotNull(jediViewHolder, "holder");
        JediViewHolder jediViewHolder2 = (JediViewHolder) super.a(jediViewHolder);
        LifecycleOwner lifecycleOwner = this.f21472d;
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "<set-?>");
        jediViewHolder2.f2287c = lifecycleOwner;
        a aVar = this.f21470a;
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        jediViewHolder2.f2288d = aVar;
        com.bytedance.jedi.ext.adapter.internal.d dVar = this.f21471b;
        Intrinsics.checkParameterIsNotNull(dVar, "<set-?>");
        jediViewHolder2.f2289e = dVar;
        return jediViewHolder2;
    }

    public f(@NotNull LifecycleOwner lifecycleOwner) {
        b bVar;
        JediViewHolderProxyHost jediViewHolderProxyHost;
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        this.f21472d = lifecycleOwner;
        LifecycleOwner lifecycleOwner2 = this.f21472d;
        if (lifecycleOwner2 instanceof Fragment) {
            b.a aVar = b.f21484a;
            Fragment fragment = (Fragment) lifecycleOwner2;
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            bVar = aVar.a((FragmentActivity) null, fragment);
        } else if (lifecycleOwner2 instanceof FragmentActivity) {
            b.a aVar2 = b.f21484a;
            FragmentActivity fragmentActivity = (FragmentActivity) lifecycleOwner2;
            Intrinsics.checkParameterIsNotNull(fragmentActivity, PushConstants.INTENT_ACTIVITY_NAME);
            bVar = aVar2.a(fragmentActivity, (Fragment) null);
        } else if (lifecycleOwner2 instanceof Widget) {
            b.a aVar3 = b.f21484a;
            Widget widget = (Widget) lifecycleOwner2;
            Intrinsics.checkParameterIsNotNull(widget, "widget");
            Lifecycle lifecycle = widget.getLifecycle();
            JediViewHolderProxyHost.a aVar4 = JediViewHolderProxyHost.f21477c;
            Intrinsics.checkParameterIsNotNull(widget, "widget");
            Object j = widget.j();
            if (j instanceof Fragment) {
                jediViewHolderProxyHost = JediViewHolderProxyHost.a.a(null, (Fragment) j);
            } else if (j instanceof FragmentActivity) {
                jediViewHolderProxyHost = JediViewHolderProxyHost.a.a((FragmentActivity) j, null);
            } else {
                throw new IllegalStateException();
            }
            bVar = b.a.a(lifecycle, jediViewHolderProxyHost);
        } else if (lifecycleOwner2 instanceof JediViewHolder) {
            throw new IllegalStateException("JediViewHolder:" + this.f21472d + " is not support for now");
        } else {
            throw new IllegalStateException("owner:" + this.f21472d + " is not in support list([FragmentActivity, Fragment, Widget])");
        }
        this.f21471b = new com.bytedance.jedi.ext.adapter.internal.d(bVar);
    }
}
