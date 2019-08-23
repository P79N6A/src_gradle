package com.ss.android.ugc.aweme.crossplatform.view;

import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/view/ViewStatusRegistry;", "", "()V", "viewListenerList", "", "Lcom/ss/android/ugc/aweme/crossplatform/view/ViewListener;", "addObserver", "", "observer", "dispatch", "status", "Lcom/ss/android/ugc/aweme/crossplatform/view/ViewStatusRegistry$Status;", "dispatch$main_douyinCnRelease", "release", "release$main_douyinCnRelease", "removeObserver", "Status", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41028a;

    /* renamed from: b  reason: collision with root package name */
    final List<d> f41029b = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/view/ViewStatusRegistry$Status;", "", "(Ljava/lang/String;I)V", "LOAD_START", "LOAD_FINISH", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public enum a {
        LOAD_START,
        LOAD_FINISH;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @MainThread
    public final void a(@NotNull d dVar) {
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f41028a, false, 34614, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f41028a, false, 34614, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "observer");
        this.f41029b.add(dVar2);
    }

    @MainThread
    public final void a(@NotNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f41028a, false, 34616, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f41028a, false, 34616, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "status");
        switch (f.f41030a[aVar.ordinal()]) {
            case 1:
                for (d p : this.f41029b) {
                    p.p();
                }
                return;
            case 2:
                for (d q : this.f41029b) {
                    q.q();
                }
                break;
        }
    }
}
