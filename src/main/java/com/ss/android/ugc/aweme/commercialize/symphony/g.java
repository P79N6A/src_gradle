package com.ss.android.ugc.aweme.commercialize.symphony;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R.\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00018F@FX\u000e¢\u0006\u0012\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/ThirdPartPlayerProxy;", "Lcom/ss/android/ugc/aweme/commercialize/symphony/ThirdPartPlayer;", "()V", "value", "player", "player$annotations", "getPlayer", "()Lcom/ss/android/ugc/aweme/commercialize/symphony/ThirdPartPlayer;", "setPlayer", "(Lcom/ss/android/ugc/aweme/commercialize/symphony/ThirdPartPlayer;)V", "wp", "Ljava/lang/ref/WeakReference;", "tryPause", "", "tryPlay", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39612a;

    /* renamed from: b  reason: collision with root package name */
    public static final g f39613b = new g();

    /* renamed from: c  reason: collision with root package name */
    private static WeakReference<f> f39614c;

    private g() {
    }

    @Nullable
    public static final f c() {
        if (PatchProxy.isSupport(new Object[0], null, f39612a, true, 32204, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f39612a, true, 32204, new Class[0], f.class);
        }
        WeakReference<f> weakReference = f39614c;
        if (weakReference != null) {
            return (f) weakReference.get();
        }
        return null;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f39612a, false, 32207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39612a, false, 32207, new Class[0], Void.TYPE);
            return;
        }
        f c2 = c();
        if (c2 != null) {
            c2.b();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39612a, false, 32206, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39612a, false, 32206, new Class[0], Void.TYPE);
            return;
        }
        f c2 = c();
        if (c2 != null) {
            c2.a();
        }
    }

    public static final void a(@Nullable f fVar) {
        WeakReference<f> weakReference;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, null, f39612a, true, 32205, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, null, f39612a, true, 32205, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (fVar2 == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(fVar2);
        }
        f39614c = weakReference;
    }
}
