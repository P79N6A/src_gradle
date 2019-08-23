package com.ss.android.ugc.aweme.lego.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u001e\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00052\u0006\u0010\u0012\u001a\u00020\u000bJ!\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0005J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\u0019\u001a\u00020\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0005R(\u0010\u0003\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0005\u0012\u0004\u0012\u00020\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0005\u0012\u0004\u0012\u00020\u000b0\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/processor/InflateProcessor;", "Lcom/ss/android/ugc/aweme/lego/processor/IProcessor;", "()V", "activityCache", "", "Ljava/lang/Class;", "Landroid/app/Activity;", "Ljava/lang/ref/WeakReference;", "context", "Landroid/content/Context;", "inflateProviders", "Lcom/ss/android/ugc/aweme/lego/LegoInflate;", "inflates", "addActivity", "", "activity", "addProvider", "name", "inflate", "getInflate", "T", "(Ljava/lang/Class;)Ljava/lang/Object;", "hasInflate", "", "init", "initInflate", "ActivityMonitor", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53009a;

    /* renamed from: b  reason: collision with root package name */
    public Context f53010b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<? extends Activity>, WeakReference<Activity>> f53011c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends c>, c> f53012d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<Class<? extends c>, c> f53013e = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/processor/InflateProcessor$ActivityMonitor;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "(Lcom/ss/android/ugc/aweme/lego/processor/InflateProcessor;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.lego.a.a$a  reason: collision with other inner class name */
    public final class C0612a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53014a;

        public final void onActivityPaused(@Nullable Activity activity) {
        }

        public final void onActivityResumed(@Nullable Activity activity) {
        }

        public final void onActivitySaveInstanceState(@Nullable Activity activity, @Nullable Bundle bundle) {
        }

        public final void onActivityStarted(@Nullable Activity activity) {
        }

        public final void onActivityStopped(@Nullable Activity activity) {
        }

        public C0612a() {
        }

        public final void onActivityDestroyed(@Nullable Activity activity) {
            if (PatchProxy.isSupport(new Object[]{activity}, this, f53014a, false, 55151, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity}, this, f53014a, false, 55151, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            if (activity != null) {
                a.this.f53011c.remove(activity.getClass());
            }
        }

        public final void onActivityCreated(@Nullable Activity activity, @Nullable Bundle bundle) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2, bundle}, this, f53014a, false, 55150, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, bundle}, this, f53014a, false, 55150, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
                return;
            }
            if (activity2 != null) {
                a.this.f53011c.put(activity.getClass(), new WeakReference(activity2));
            }
        }
    }

    public final <T> T a(@NotNull Class<? extends c> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f53009a, false, 55147, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls}, this, f53009a, false, 55147, new Class[]{Class.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(cls, "name");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.f53012d) {
            objectRef.element = (c) this.f53012d.get(cls);
        }
        if (((c) objectRef.element) == null) {
            objectRef.element = c(cls);
        }
        return (Object) ((c) objectRef.element);
    }

    public final boolean b(@NotNull Class<? extends c> cls) {
        Class<? extends c> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f53009a, false, 55148, new Class[]{Class.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cls2}, this, f53009a, false, 55148, new Class[]{Class.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(cls2, "name");
        return this.f53012d.containsKey(cls2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.lego.c c(@org.jetbrains.annotations.NotNull java.lang.Class<? extends com.ss.android.ugc.aweme.lego.c> r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f53009a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r6[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.lego.c> r7 = com.ss.android.ugc.aweme.lego.c.class
            r4 = 0
            r5 = 55149(0xd76d, float:7.728E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0035
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f53009a
            r4 = 0
            r5 = 55149(0xd76d, float:7.728E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            r6[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.lego.c> r7 = com.ss.android.ugc.aweme.lego.c.class
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.lego.c r0 = (com.ss.android.ugc.aweme.lego.c) r0
            return r0
        L_0x0035:
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r1)
            java.util.Map<java.lang.Class<? extends com.ss.android.ugc.aweme.lego.c>, com.ss.android.ugc.aweme.lego.c> r1 = r10.f53013e
            java.lang.Object r1 = r1.get(r11)
            if (r1 != 0) goto L_0x0045
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0045:
            com.ss.android.ugc.aweme.lego.c r1 = (com.ss.android.ugc.aweme.lego.c) r1
            monitor-enter(r1)
            java.util.Map<java.lang.Class<? extends com.ss.android.ugc.aweme.lego.c>, com.ss.android.ugc.aweme.lego.c> r2 = r10.f53012d     // Catch:{ all -> 0x00a1 }
            boolean r2 = r2.containsKey(r11)     // Catch:{ all -> 0x00a1 }
            if (r2 != 0) goto L_0x0092
            android.content.Context r2 = r10.f53010b     // Catch:{ all -> 0x00a1 }
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ all -> 0x00a1 }
        L_0x0059:
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper     // Catch:{ all -> 0x00a1 }
            android.content.Context r3 = r10.f53010b     // Catch:{ all -> 0x00a1 }
            if (r3 != 0) goto L_0x0064
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)     // Catch:{ all -> 0x00a1 }
        L_0x0064:
            r4 = 2131493135(0x7f0c010f, float:1.8609742E38)
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00a1 }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ all -> 0x00a1 }
            java.util.Map<java.lang.Class<? extends android.app.Activity>, java.lang.ref.WeakReference<android.app.Activity>> r3 = r10.f53011c     // Catch:{ all -> 0x00a1 }
            java.lang.Class r4 = r1.a()     // Catch:{ all -> 0x00a1 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00a1 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x00a1 }
            r4 = 0
            if (r3 == 0) goto L_0x0082
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x00a1 }
            r4 = r3
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ all -> 0x00a1 }
        L_0x0082:
            r1.a(r2, r4)     // Catch:{ all -> 0x00a1 }
            java.util.Map<java.lang.Class<? extends com.ss.android.ugc.aweme.lego.c>, com.ss.android.ugc.aweme.lego.c> r2 = r10.f53012d     // Catch:{ all -> 0x00a1 }
            monitor-enter(r2)     // Catch:{ all -> 0x00a1 }
            java.util.Map<java.lang.Class<? extends com.ss.android.ugc.aweme.lego.c>, com.ss.android.ugc.aweme.lego.c> r3 = r10.f53012d     // Catch:{ all -> 0x008f }
            r3.put(r11, r1)     // Catch:{ all -> 0x008f }
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            goto L_0x0092
        L_0x008f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x0092:
            java.util.Map<java.lang.Class<? extends com.ss.android.ugc.aweme.lego.c>, com.ss.android.ugc.aweme.lego.c> r2 = r10.f53012d     // Catch:{ all -> 0x00a1 }
            java.lang.Object r0 = r2.get(r11)     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x009d
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x00a1 }
        L_0x009d:
            com.ss.android.ugc.aweme.lego.c r0 = (com.ss.android.ugc.aweme.lego.c) r0     // Catch:{ all -> 0x00a1 }
            monitor-exit(r1)
            return r0
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lego.a.a.c(java.lang.Class):com.ss.android.ugc.aweme.lego.c");
    }

    public final void a(@NotNull Class<? extends c> cls, @NotNull c cVar) {
        if (PatchProxy.isSupport(new Object[]{cls, cVar}, this, f53009a, false, 55145, new Class[]{Class.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls, cVar}, this, f53009a, false, 55145, new Class[]{Class.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cls, "name");
        Intrinsics.checkParameterIsNotNull(cVar, "inflate");
        if (!this.f53013e.containsKey(cls)) {
            this.f53013e.put(cls, cVar);
        }
    }
}
