package com.ss.android.ugc.aweme.lego.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0007J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u000fJ\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/processor/TaskProcessor;", "Lcom/ss/android/ugc/aweme/lego/processor/IProcessor;", "()V", "context", "Landroid/content/Context;", "taskQueues", "", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "", "Lcom/ss/android/ugc/aweme/lego/LegoTask;", "taskTarget", "addTasks", "", "type", "task", "", "ensureTask", "hasTask", "", "init", "peekTask", "peekTasks", "tasks", "runTask", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53031a;

    /* renamed from: b  reason: collision with root package name */
    public Context f53032b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<f, List<LegoTask>> f53033c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<f, List<LegoTask>> f53034d = new ConcurrentHashMap();

    public final boolean a(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f53031a, false, 55171, new Class[]{f.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{fVar2}, this, f53031a, false, 55171, new Class[]{f.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "type");
        List<LegoTask> list = this.f53033c.get(fVar2);
        if (list == null) {
            Intrinsics.throwNpe();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void b(@NotNull LegoTask legoTask) {
        if (PatchProxy.isSupport(new Object[]{legoTask}, this, f53031a, false, 55170, new Class[]{LegoTask.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{legoTask}, this, f53031a, false, 55170, new Class[]{LegoTask.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(legoTask, "task");
        synchronized (legoTask) {
            List<LegoTask> list = this.f53034d.get(legoTask.type());
            if (list == null) {
                Intrinsics.throwNpe();
            }
            if (list.contains(legoTask)) {
                Context context = this.f53032b;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                }
                legoTask.run(context);
                synchronized (this.f53034d) {
                    List<LegoTask> list2 = this.f53034d.get(legoTask.type());
                    if (list2 == null) {
                        Intrinsics.throwNpe();
                    }
                    list2.remove(legoTask);
                }
            }
        }
    }

    @Nullable
    public final LegoTask b(@NotNull f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f53031a, false, 55172, new Class[]{f.class}, LegoTask.class)) {
            return (LegoTask) PatchProxy.accessDispatch(new Object[]{fVar}, this, f53031a, false, 55172, new Class[]{f.class}, LegoTask.class);
        }
        Intrinsics.checkParameterIsNotNull(fVar, "type");
        synchronized (this.f53033c) {
            List<LegoTask> list = this.f53033c.get(fVar);
            if (list == null) {
                Intrinsics.throwNpe();
            }
            if (list.isEmpty()) {
                return null;
            }
            List<LegoTask> list2 = this.f53033c.get(fVar);
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            LegoTask legoTask = (LegoTask) list2.remove(0);
            synchronized (this.f53034d) {
                List<LegoTask> list3 = this.f53034d.get(legoTask.type());
                if (list3 == null) {
                    Intrinsics.throwNpe();
                }
                list3.add(legoTask);
            }
            return legoTask;
        }
    }

    public final void a(@NotNull LegoTask legoTask) {
        if (PatchProxy.isSupport(new Object[]{legoTask}, this, f53031a, false, 55169, new Class[]{LegoTask.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{legoTask}, this, f53031a, false, 55169, new Class[]{LegoTask.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(legoTask, "task");
        List<LegoTask> list = this.f53033c.get(legoTask.type());
        if (list == null) {
            Intrinsics.throwNpe();
        }
        if (list.contains(legoTask)) {
            synchronized (this.f53033c) {
                List<LegoTask> list2 = this.f53033c.get(legoTask.type());
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                list2.remove(legoTask);
            }
            synchronized (this.f53034d) {
                List<LegoTask> list3 = this.f53034d.get(legoTask.type());
                if (list3 == null) {
                    Intrinsics.throwNpe();
                }
                if (!list3.contains(legoTask)) {
                    List<LegoTask> list4 = this.f53034d.get(legoTask.type());
                    if (list4 == null) {
                        Intrinsics.throwNpe();
                    }
                    list4.add(legoTask);
                }
            }
        }
        List<LegoTask> list5 = this.f53034d.get(legoTask.type());
        if (list5 == null) {
            Intrinsics.throwNpe();
        }
        if (list5.contains(legoTask)) {
            b(legoTask);
        }
    }

    @NotNull
    public final List<LegoTask> a(@NotNull f fVar, @NotNull List<? extends LegoTask> list) {
        if (PatchProxy.isSupport(new Object[]{fVar, list}, this, f53031a, false, 55173, new Class[]{f.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{fVar, list}, this, f53031a, false, 55173, new Class[]{f.class, List.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(fVar, "type");
        Intrinsics.checkParameterIsNotNull(list, "tasks");
        synchronized (this.f53033c) {
            for (LegoTask legoTask : list) {
                List<LegoTask> list2 = this.f53033c.get(fVar);
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                list2.remove(legoTask);
            }
            synchronized (this.f53034d) {
                List<LegoTask> list3 = this.f53034d.get(fVar);
                if (list3 == null) {
                    Intrinsics.throwNpe();
                }
                list3.addAll(list);
            }
        }
        return list;
    }

    public final void b(@NotNull f fVar, @NotNull List<? extends LegoTask> list) {
        if (PatchProxy.isSupport(new Object[]{fVar, list}, this, f53031a, false, 55174, new Class[]{f.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, list}, this, f53031a, false, 55174, new Class[]{f.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar, "type");
        Intrinsics.checkParameterIsNotNull(list, "task");
        synchronized (this.f53033c) {
            List<LegoTask> list2 = this.f53033c.get(fVar);
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            list2.addAll(list);
        }
    }
}
