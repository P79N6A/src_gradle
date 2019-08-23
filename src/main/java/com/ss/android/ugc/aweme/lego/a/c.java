package com.ss.android.ugc.aweme.lego.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.LegoService;
import com.ss.android.ugc.aweme.lego.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00072\u0006\u0010\u0010\u001a\u00020\bJ$\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\n2\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0013J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007J!\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\nJ\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010\u001b\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007J\u0018\u0010\u001c\u001a\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\nJ\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00132\u0006\u0010\u0012\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/processor/ServiceProcessor;", "Lcom/ss/android/ugc/aweme/lego/processor/IProcessor;", "()V", "context", "Landroid/content/Context;", "serviceProviders", "", "Ljava/lang/Class;", "Lcom/ss/android/ugc/aweme/lego/LegoService;", "serviceQueues", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "", "services", "addProvider", "", "name", "service", "addServices", "type", "", "convertService", "getService", "T", "(Ljava/lang/Class;)Ljava/lang/Object;", "hasService", "", "init", "initService", "peekService", "peekServices", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53024a;

    /* renamed from: b  reason: collision with root package name */
    private Context f53025b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Class<? extends LegoService>, LegoService> f53026c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends LegoService>, LegoService> f53027d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<f, List<Class<? extends LegoService>>> f53028e = new HashMap();

    public final <T> T a(@NotNull Class<? extends LegoService> cls) {
        Class<? extends LegoService> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f53024a, false, 55161, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls2}, this, f53024a, false, 55161, new Class[]{Class.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "name");
        T t = (LegoService) this.f53026c.get(cls2);
        if (t == null) {
            t = b(cls);
        }
        return (Object) t;
    }

    @NotNull
    public final LegoService b(@NotNull Class<? extends LegoService> cls) {
        LegoService legoService;
        if (PatchProxy.isSupport(new Object[]{cls}, this, f53024a, false, 55162, new Class[]{Class.class}, LegoService.class)) {
            return (LegoService) PatchProxy.accessDispatch(new Object[]{cls}, this, f53024a, false, 55162, new Class[]{Class.class}, LegoService.class);
        }
        Intrinsics.checkParameterIsNotNull(cls, "name");
        LegoService legoService2 = this.f53027d.get(cls);
        if (legoService2 == null) {
            Intrinsics.throwNpe();
        }
        LegoService legoService3 = legoService2;
        synchronized (legoService3) {
            if (!this.f53026c.containsKey(cls)) {
                Context context = this.f53025b;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                }
                legoService3.init(context);
                this.f53026c.put(cls, legoService3);
            }
            LegoService legoService4 = this.f53026c.get(cls);
            if (legoService4 == null) {
                Intrinsics.throwNpe();
            }
            legoService = legoService4;
        }
        return legoService;
    }

    @Nullable
    public final LegoService c(@NotNull Class<? extends LegoService> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f53024a, false, 55165, new Class[]{Class.class}, LegoService.class)) {
            return (LegoService) PatchProxy.accessDispatch(new Object[]{cls}, this, f53024a, false, 55165, new Class[]{Class.class}, LegoService.class);
        }
        Intrinsics.checkParameterIsNotNull(cls, "name");
        if (this.f53026c.containsKey(cls)) {
            return null;
        }
        LegoService legoService = this.f53027d.get(cls);
        if (legoService == null) {
            Intrinsics.throwNpe();
        }
        return legoService;
    }

    public final void a(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f53024a, false, 55159, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f53024a, false, 55159, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f53025b = context;
        for (f put : f.values()) {
            this.f53028e.put(put, new ArrayList());
        }
    }

    @Nullable
    public final Class<? extends LegoService> b(@NotNull f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f53024a, false, 55166, new Class[]{f.class}, Class.class)) {
            return (Class) PatchProxy.accessDispatch(new Object[]{fVar}, this, f53024a, false, 55166, new Class[]{f.class}, Class.class);
        }
        Intrinsics.checkParameterIsNotNull(fVar, "type");
        synchronized (this.f53028e) {
            List<Class<? extends LegoService>> list = this.f53028e.get(fVar);
            if (list == null) {
                Intrinsics.throwNpe();
            }
            if (list.isEmpty()) {
                return null;
            }
            List<Class<? extends LegoService>> list2 = this.f53028e.get(fVar);
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            Class<? extends LegoService> cls = (Class) list2.remove(0);
            return cls;
        }
    }

    @NotNull
    public final List<Class<? extends LegoService>> c(@NotNull f fVar) {
        List<Class<? extends LegoService>> list;
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f53024a, false, 55167, new Class[]{f.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{fVar}, this, f53024a, false, 55167, new Class[]{f.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(fVar, "type");
        synchronized (this.f53028e) {
            List<Class<? extends LegoService>> list2 = this.f53028e.get(fVar);
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            ArrayList arrayList = new ArrayList(list2);
            List<Class<? extends LegoService>> list3 = this.f53028e.get(fVar);
            if (list3 == null) {
                Intrinsics.throwNpe();
            }
            list3.clear();
            list = arrayList;
        }
        return list;
    }

    public final boolean a(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f53024a, false, 55163, new Class[]{f.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fVar2}, this, f53024a, false, 55163, new Class[]{f.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "type");
        List<Class<? extends LegoService>> list = this.f53028e.get(fVar2);
        if (list == null) {
            Intrinsics.throwNpe();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a(@NotNull f fVar, @NotNull List<? extends Class<? extends LegoService>> list) {
        if (PatchProxy.isSupport(new Object[]{fVar, list}, this, f53024a, false, 55164, new Class[]{f.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, list}, this, f53024a, false, 55164, new Class[]{f.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar, "type");
        Intrinsics.checkParameterIsNotNull(list, "services");
        synchronized (this.f53028e) {
            List<Class<? extends LegoService>> list2 = this.f53028e.get(fVar);
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            list2.addAll(list);
        }
    }

    public final void a(@NotNull Class<? extends LegoService> cls, @NotNull LegoService legoService) {
        if (PatchProxy.isSupport(new Object[]{cls, legoService}, this, f53024a, false, 55160, new Class[]{Class.class, LegoService.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls, legoService}, this, f53024a, false, 55160, new Class[]{Class.class, LegoService.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cls, "name");
        Intrinsics.checkParameterIsNotNull(legoService, "service");
        if (!this.f53027d.containsKey(cls)) {
            this.f53027d.put(cls, legoService);
        }
    }
}
