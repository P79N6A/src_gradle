package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0002\b\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\u0012R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyHost;", "Landroid/support/v4/app/Fragment;", "()V", "managerMap", "", "Landroid/arch/lifecycle/Lifecycle;", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyManager;", "myParentFragment", "getMyParentFragment", "()Landroid/support/v4/app/Fragment;", "setMyParentFragment", "(Landroid/support/v4/app/Fragment;)V", "get", "lifecycle", "get$ext_adapter_release", "set", "", "manager", "set$ext_adapter_release", "Companion", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class JediViewHolderProxyHost extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final String f21476b = JediViewHolderProxyHost.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static final a f21477c = new a((byte) 0);
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public Fragment f21478a;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Lifecycle, b> f21479d = new WeakHashMap();

    /* renamed from: e  reason: collision with root package name */
    private HashMap f21480e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\fJ\u001d\u0010\r\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0002\b\u0010J\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0010R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyHost$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "create", "Lcom/bytedance/jedi/ext/adapter/internal/JediViewHolderProxyHost;", "activity", "Landroid/support/v4/app/FragmentActivity;", "fragment", "Landroid/support/v4/app/Fragment;", "create$ext_adapter_release", "of", "viewHolder", "Lcom/bytedance/jedi/ext/adapter/JediViewHolder;", "of$ext_adapter_release", "widget", "Lcom/bytedance/widget/Widget;", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            if (r3 == null) goto L_0x0008;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost a(@org.jetbrains.annotations.Nullable android.support.v4.app.FragmentActivity r3, @org.jetbrains.annotations.Nullable android.support.v4.app.Fragment r4) {
            /*
                if (r3 == 0) goto L_0x0008
                android.support.v4.app.FragmentManager r3 = r3.getSupportFragmentManager()
                if (r3 != 0) goto L_0x0016
            L_0x0008:
                if (r4 != 0) goto L_0x000d
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x000d:
                android.support.v4.app.FragmentManager r3 = r4.getChildFragmentManager()
                java.lang.String r0 = "fragment!!.childFragmentManager"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r0)
            L_0x0016:
                java.lang.String r0 = com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost.f21476b
                android.support.v4.app.Fragment r0 = r3.findFragmentByTag(r0)
                boolean r1 = r0 instanceof com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost
                if (r1 != 0) goto L_0x0021
                r0 = 0
            L_0x0021:
                com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost r0 = (com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost) r0
                if (r0 != 0) goto L_0x004f
                com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost r0 = new com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost
                r0.<init>()
                r0.f21478a = r4
                if (r4 == 0) goto L_0x003f
                android.support.v4.app.FragmentManager r4 = r4.getFragmentManager()
                if (r4 == 0) goto L_0x003f
                com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost$Companion$create$1$1 r1 = new com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost$Companion$create$1$1
                r1.<init>(r0)
                android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks r1 = (android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks) r1
                r2 = 0
                r4.registerFragmentLifecycleCallbacks(r1, r2)
            L_0x003f:
                android.support.v4.app.FragmentTransaction r3 = r3.beginTransaction()
                r4 = r0
                android.support.v4.app.Fragment r4 = (android.support.v4.app.Fragment) r4
                java.lang.String r1 = com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost.f21476b
                android.support.v4.app.FragmentTransaction r3 = r3.add((android.support.v4.app.Fragment) r4, (java.lang.String) r1)
                r3.commitNowAllowingStateLoss()
            L_0x004f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost.a.a(android.support.v4.app.FragmentActivity, android.support.v4.app.Fragment):com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost");
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f21480e != null) {
            this.f21480e.clear();
        }
    }

    @Nullable
    public final b a(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        return this.f21479d.get(lifecycle);
    }

    public final void a(@NotNull Lifecycle lifecycle, @NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
        this.f21479d.put(lifecycle, bVar);
    }
}
