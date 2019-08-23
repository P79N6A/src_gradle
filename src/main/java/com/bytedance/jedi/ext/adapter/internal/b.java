package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0002\b\fJ\u0006\u0010\r\u001a\u00020\u0001J\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "", "parentLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "host", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyHost;", "(Landroid/arch/lifecycle/Lifecycle;Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyHost;)V", "proxies", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/bytedance/jedi/ext/adapter/IJediViewHolderProxy;", "load", "proxy", "load$ext_adapter_release", "requireHost", "unload", "unload$ext_adapter_release", "Companion", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21484a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArraySet<com.bytedance.jedi.ext.adapter.b> f21485b = new CopyOnWriteArraySet<>();

    /* renamed from: c  reason: collision with root package name */
    private final Lifecycle f21486c;

    /* renamed from: d  reason: collision with root package name */
    private final JediViewHolderProxyHost f21487d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager$Companion;", "", "()V", "create", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "parentLifecycle", "Landroid/arch/lifecycle/Lifecycle;", "host", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyHost;", "fragmentActivity", "Landroid/support/v4/app/FragmentActivity;", "fragment", "Landroid/support/v4/app/Fragment;", "of", "activity", "widget", "Lcom/bytedance/widget/Widget;", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(Lifecycle lifecycle, JediViewHolderProxyHost jediViewHolderProxyHost) {
            b a2 = jediViewHolderProxyHost.a(lifecycle);
            if (a2 != null) {
                return a2;
            }
            b bVar = new b(lifecycle, jediViewHolderProxyHost);
            jediViewHolderProxyHost.a(lifecycle, bVar);
            return bVar;
        }

        public final b a(FragmentActivity fragmentActivity, Fragment fragment) {
            JediViewHolderProxyHost a2 = JediViewHolderProxyHost.a.a(fragmentActivity, fragment);
            Lifecycle lifecycle = a2.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "proxyHost.lifecycle");
            return a(lifecycle, a2);
        }
    }

    @NotNull
    public final b a(@NotNull com.bytedance.jedi.ext.adapter.b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "proxy");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) bVar;
        if (this.f21485b.add(jediViewHolderProxy)) {
            jediViewHolderProxy.f2299c = this;
            this.f21486c.addObserver(jediViewHolderProxy);
        }
        return this;
    }

    @NotNull
    public final b b(@NotNull com.bytedance.jedi.ext.adapter.b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "proxy");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) bVar;
        this.f21486c.removeObserver(jediViewHolderProxy);
        switch (c.f21488a[this.f21486c.getCurrentState().ordinal()]) {
            case 2:
                if (!jediViewHolderProxy.f2300d) {
                    jediViewHolderProxy.onDestroy();
                    break;
                }
                break;
            case 3:
                jediViewHolderProxy.onDestroy();
                break;
            case 4:
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
                break;
            case 5:
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
                break;
        }
        jediViewHolderProxy.f2299c = null;
        this.f21485b.remove(jediViewHolderProxy);
        return this;
    }

    public b(@NotNull Lifecycle lifecycle, @NotNull JediViewHolderProxyHost jediViewHolderProxyHost) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "parentLifecycle");
        Intrinsics.checkParameterIsNotNull(jediViewHolderProxyHost, "host");
        this.f21486c = lifecycle;
        this.f21487d = jediViewHolderProxyHost;
    }
}
