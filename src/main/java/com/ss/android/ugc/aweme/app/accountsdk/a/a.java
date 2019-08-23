package com.ss.android.ugc.aweme.app.accountsdk.a;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/app/accountsdk/afteractions/AccountActionManager;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33682a;

    /* renamed from: b  reason: collision with root package name */
    public static List<com.ss.android.ugc.aweme.account.util.a> f33683b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final CopyOnWriteArrayList<c> f33684c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public static final C0433a f33685d = new C0433a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0003J\b\u0010\u000b\u001a\u00020\nH\u0003J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0007J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/app/accountsdk/afteractions/AccountActionManager$Companion;", "", "()V", "mNeedRunActions", "", "Lcom/ss/android/ugc/aweme/account/util/AfterLoginUiAction;", "mRunActionListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/ugc/aweme/app/accountsdk/afteractions/IActionRunListener;", "notifyListenerFinish", "", "notifyListenerStart", "registerActionRunListener", "listener", "runActionAfterLogin", "bundle", "Landroid/os/Bundle;", "runNextActionAfterLogin", "unregisterActionRunListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.app.accountsdk.a.a$a  reason: collision with other inner class name */
    public static final class C0433a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33686a;

        private C0433a() {
        }

        @JvmStatic
        private void b() {
            if (PatchProxy.isSupport(new Object[0], this, f33686a, false, 23010, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33686a, false, 23010, new Class[0], Void.TYPE);
                return;
            }
            for (c a2 : a.f33684c) {
                a2.a();
            }
        }

        @JvmStatic
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f33686a, false, 23009, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33686a, false, 23009, new Class[0], Void.TYPE);
                return;
            }
            Iterator it2 = a.f33684c.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }

        public /* synthetic */ C0433a(byte b2) {
            this();
        }

        @JvmStatic
        public final void a(@Nullable Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, this, f33686a, false, 23006, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle2}, this, f33686a, false, 23006, new Class[]{Bundle.class}, Void.TYPE);
            } else if (true ^ a.f33683b.isEmpty()) {
                a.f33683b.remove(0).a(bundle2);
            } else {
                b();
            }
        }
    }

    @JvmStatic
    public static final void a(@Nullable Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, null, f33682a, true, 23000, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, null, f33682a, true, 23000, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        f33685d.a(bundle2);
    }
}
