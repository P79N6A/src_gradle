package com.ss.android.ugc.aweme.story.feed.jedi.adapter;

import android.arch.lifecycle.Lifecycle;
import android.support.v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;", "Landroid/support/v4/app/Fragment;", "()V", "proxies", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/IStoryViewHolderProxy;", "load", "proxy", "load$awemestory_douyinCnRelease", "unload", "unload$awemestory_douyinCnRelease", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryViewHolderProxyManager extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72623a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f72624b = StoryViewHolderProxyManager.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static final a f72625c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f72626d = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private HashMap f72627e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "create", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/StoryViewHolderProxyManager;", "fragmentActivity", "Landroid/support/v4/app/FragmentActivity;", "fragment", "Landroid/support/v4/app/Fragment;", "of", "activity", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72630a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x004c, code lost:
            if (r0 == null) goto L_0x004e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager a(android.support.v4.app.FragmentActivity r20, android.support.v4.app.Fragment r21) {
            /*
                r19 = this;
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r20
                r11 = 1
                r3[r11] = r21
                com.meituan.robust.ChangeQuickRedirect r5 = f72630a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.support.v4.app.FragmentActivity> r4 = android.support.v4.app.FragmentActivity.class
                r8[r10] = r4
                java.lang.Class<android.support.v4.app.Fragment> r4 = android.support.v4.app.Fragment.class
                r8[r11] = r4
                java.lang.Class<com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager> r9 = com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager.class
                r6 = 0
                r7 = 83547(0x1465b, float:1.17074E-40)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0046
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r20
                r12[r11] = r21
                com.meituan.robust.ChangeQuickRedirect r14 = f72630a
                r15 = 0
                r16 = 83547(0x1465b, float:1.17074E-40)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.support.v4.app.FragmentActivity> r1 = android.support.v4.app.FragmentActivity.class
                r0[r10] = r1
                java.lang.Class<android.support.v4.app.Fragment> r1 = android.support.v4.app.Fragment.class
                r0[r11] = r1
                java.lang.Class<com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager> r18 = com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager.class
                r13 = r19
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager r0 = (com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager) r0
                return r0
            L_0x0046:
                if (r20 == 0) goto L_0x004e
                android.support.v4.app.FragmentManager r0 = r20.getSupportFragmentManager()
                if (r0 != 0) goto L_0x005c
            L_0x004e:
                if (r21 != 0) goto L_0x0053
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0053:
                android.support.v4.app.FragmentManager r0 = r21.getChildFragmentManager()
                java.lang.String r2 = "fragment!!.childFragmentManager"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            L_0x005c:
                com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager r2 = new com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager
                r2.<init>()
                if (r21 == 0) goto L_0x0073
                android.support.v4.app.FragmentManager r1 = r21.getFragmentManager()
                if (r1 == 0) goto L_0x0073
                com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager$Companion$create$1 r3 = new com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager$Companion$create$1
                r3.<init>(r2)
                android.support.v4.app.FragmentManager$FragmentLifecycleCallbacks r3 = (android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks) r3
                r1.registerFragmentLifecycleCallbacks(r3, r10)
            L_0x0073:
                android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
                r1 = r2
                android.support.v4.app.Fragment r1 = (android.support.v4.app.Fragment) r1
                java.lang.String r3 = com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager.f72624b
                android.support.v4.app.FragmentTransaction r0 = r0.add((android.support.v4.app.Fragment) r1, (java.lang.String) r3)
                r0.commitNowAllowingStateLoss()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager.a.a(android.support.v4.app.FragmentActivity, android.support.v4.app.Fragment):com.ss.android.ugc.aweme.story.feed.jedi.adapter.StoryViewHolderProxyManager");
        }
    }

    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72623a, false, 83541, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72623a, false, 83541, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f72623a, false, 83543, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72623a, false, 83543, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f72623a, false, 83542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72623a, false, 83542, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72623a, false, 83544, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72623a, false, 83544, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f72623a, false, 83540, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72623a, false, 83540, new Class[0], Void.TYPE);
            return;
        }
        if (this.f72627e != null) {
            this.f72627e.clear();
        }
    }

    @NotNull
    public final StoryViewHolderProxyManager a(@NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f72623a, false, 83537, new Class[]{a.class}, StoryViewHolderProxyManager.class)) {
            return (StoryViewHolderProxyManager) PatchProxy.accessDispatch(new Object[]{aVar}, this, f72623a, false, 83537, new Class[]{a.class}, StoryViewHolderProxyManager.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "proxy");
        StoryViewHolderProxy storyViewHolderProxy = (StoryViewHolderProxy) aVar;
        StoryViewHolderProxyManager storyViewHolderProxyManager = this;
        storyViewHolderProxy.f4131d = storyViewHolderProxyManager;
        this.f72626d.add(storyViewHolderProxy);
        getLifecycle().addObserver(storyViewHolderProxy);
        return storyViewHolderProxyManager;
    }

    @NotNull
    public final StoryViewHolderProxyManager b(@NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f72623a, false, 83538, new Class[]{a.class}, StoryViewHolderProxyManager.class)) {
            return (StoryViewHolderProxyManager) PatchProxy.accessDispatch(new Object[]{aVar}, this, f72623a, false, 83538, new Class[]{a.class}, StoryViewHolderProxyManager.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar, "proxy");
        StoryViewHolderProxy storyViewHolderProxy = (StoryViewHolderProxy) aVar;
        getLifecycle().removeObserver(storyViewHolderProxy);
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "lifecycle");
        switch (f.f72638a[lifecycle.getCurrentState().ordinal()]) {
            case 2:
                if (!storyViewHolderProxy.f4132e) {
                    storyViewHolderProxy.onDestroy();
                    break;
                }
                break;
            case 3:
                storyViewHolderProxy.onDestroy();
                break;
            case 4:
                storyViewHolderProxy.onStop();
                storyViewHolderProxy.onDestroy();
                break;
            case 5:
                storyViewHolderProxy.onStop();
                storyViewHolderProxy.onDestroy();
                break;
        }
        storyViewHolderProxy.f4131d = null;
        this.f72626d.remove(storyViewHolderProxy);
        return this;
    }
}
