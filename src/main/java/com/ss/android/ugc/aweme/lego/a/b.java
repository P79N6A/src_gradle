package com.ss.android.ugc.aweme.lego.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.lego.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/processor/RequestProcessor;", "Lcom/ss/android/ugc/aweme/lego/processor/IProcessor;", "()V", "context", "Landroid/content/Context;", "requestQueues", "", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "addRequests", "", "type", "requests", "", "copyRequest", "hasRequest", "", "init", "peekRequest", "removeRequest", "request", "runRequest", "isColdBoot", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53018a;

    /* renamed from: b  reason: collision with root package name */
    private Context f53019b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<e, List<d>> f53020c = new HashMap();

    private final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f53018a, false, 55155, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f53018a, false, 55155, new Class[]{d.class}, Void.TYPE);
            return;
        }
        synchronized (this.f53020c) {
            List<d> list = this.f53020c.get(dVar.a());
            if (list == null) {
                Intrinsics.throwNpe();
            }
            list.remove(dVar);
        }
    }

    @NotNull
    public final List<d> b(@NotNull e eVar) {
        List<d> arrayList;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f53018a, false, 55157, new Class[]{e.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{eVar}, this, f53018a, false, 55157, new Class[]{e.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar, "type");
        synchronized (this.f53020c) {
            List<d> list = this.f53020c.get(eVar);
            if (list == null) {
                Intrinsics.throwNpe();
            }
            arrayList = new ArrayList<>(list);
        }
        return arrayList;
    }

    @Nullable
    public final d c(@NotNull e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f53018a, false, 55158, new Class[]{e.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{eVar}, this, f53018a, false, 55158, new Class[]{e.class}, d.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar, "type");
        synchronized (this.f53020c) {
            List<d> list = this.f53020c.get(eVar);
            if (list == null) {
                Intrinsics.throwNpe();
            }
            if (list.isEmpty()) {
                return null;
            }
            List<d> list2 = this.f53020c.get(eVar);
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            d dVar = (d) list2.get(0);
            return dVar;
        }
    }

    public final void a(@NotNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f53018a, false, 55152, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f53018a, false, 55152, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f53019b = context;
        for (e put : e.values()) {
            this.f53020c.put(put, new ArrayList());
        }
    }

    public final boolean a(@NotNull e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f53018a, false, 55154, new Class[]{e.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{eVar2}, this, f53018a, false, 55154, new Class[]{e.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "type");
        List<d> list = this.f53020c.get(eVar2);
        if (list == null) {
            Intrinsics.throwNpe();
        }
        if (!list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void a(@NotNull d dVar, boolean z) {
        if (PatchProxy.isSupport(new Object[]{dVar, Byte.valueOf(z ? (byte) 1 : 0)}, this, f53018a, false, 55153, new Class[]{d.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar, Byte.valueOf(z)}, this, f53018a, false, 55153, new Class[]{d.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar, "request");
        synchronized (dVar) {
            List<d> list = this.f53020c.get(dVar.a());
            if (list == null) {
                Intrinsics.throwNpe();
            }
            if (list.contains(dVar)) {
                a(dVar);
                Context context = this.f53019b;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("context");
                }
                dVar.a(context, z);
            }
        }
    }

    public final void a(@NotNull e eVar, @NotNull List<? extends d> list) {
        if (PatchProxy.isSupport(new Object[]{eVar, list}, this, f53018a, false, 55156, new Class[]{e.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, list}, this, f53018a, false, 55156, new Class[]{e.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(eVar, "type");
        Intrinsics.checkParameterIsNotNull(list, "requests");
        synchronized (this.f53020c) {
            List<d> list2 = this.f53020c.get(eVar);
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            list2.addAll(list);
        }
    }
}
