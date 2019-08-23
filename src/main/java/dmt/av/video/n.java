package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83038a;

    /* renamed from: b  reason: collision with root package name */
    private static final a f83039b = new a((byte) 0);

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f83040a;

        /* renamed from: b  reason: collision with root package name */
        final WeakHashMap<p, b> f83041b;

        private a() {
            this.f83041b = new WeakHashMap<>();
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final void a(p pVar, m mVar) {
            if (PatchProxy.isSupport(new Object[]{pVar, mVar}, this, f83040a, false, 91991, new Class[]{p.class, m.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pVar, mVar}, this, f83040a, false, 91991, new Class[]{p.class, m.class}, Void.TYPE);
                return;
            }
            b bVar = this.f83041b.get(pVar);
            if (bVar != null) {
                bVar.a(mVar);
                return;
            }
            b bVar2 = new b((byte) 0);
            bVar2.a(mVar);
            pVar.b((m) bVar2);
            this.f83041b.put(pVar, bVar2);
        }

        /* access modifiers changed from: package-private */
        public final void b(p pVar, m mVar) {
            p pVar2 = pVar;
            m mVar2 = mVar;
            if (PatchProxy.isSupport(new Object[]{pVar2, mVar2}, this, f83040a, false, 91992, new Class[]{p.class, m.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{pVar2, mVar2}, this, f83040a, false, 91992, new Class[]{p.class, m.class}, Void.TYPE);
                return;
            }
            b bVar = this.f83041b.get(pVar2);
            if (bVar != null) {
                bVar.b(mVar2);
            }
        }
    }

    static class b implements m {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f83042a;

        /* renamed from: b  reason: collision with root package name */
        private CopyOnWriteArrayList<m> f83043b;

        private b() {
            this.f83043b = new CopyOnWriteArrayList<>();
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(m mVar) {
            m mVar2 = mVar;
            if (PatchProxy.isSupport(new Object[]{mVar2}, this, f83042a, false, 91994, new Class[]{m.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mVar2}, this, f83042a, false, 91994, new Class[]{m.class}, Void.TYPE);
                return;
            }
            this.f83043b.add(mVar2);
        }

        public final void b(m mVar) {
            m mVar2 = mVar;
            if (PatchProxy.isSupport(new Object[]{mVar2}, this, f83042a, false, 91995, new Class[]{m.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mVar2}, this, f83042a, false, 91995, new Class[]{m.class}, Void.TYPE);
                return;
            }
            this.f83043b.remove(mVar2);
        }

        public final void a(int i, int i2, float f2, String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str2}, this, f83042a, false, 91993, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str2}, this, f83042a, false, 91993, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
                return;
            }
            Iterator<m> it2 = this.f83043b.iterator();
            while (it2.hasNext()) {
                it2.next().a(i, i2, f2, str2);
            }
        }
    }

    public static void a(p pVar, m mVar) {
        p pVar2 = pVar;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{pVar2, mVar2}, null, f83038a, true, 91989, new Class[]{p.class, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2, mVar2}, null, f83038a, true, 91989, new Class[]{p.class, m.class}, Void.TYPE);
            return;
        }
        f83039b.a(pVar2, mVar2);
    }

    public static void b(p pVar, m mVar) {
        p pVar2 = pVar;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{pVar2, mVar2}, null, f83038a, true, 91990, new Class[]{p.class, m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pVar2, mVar2}, null, f83038a, true, 91990, new Class[]{p.class, m.class}, Void.TYPE);
            return;
        }
        f83039b.b(pVar2, mVar2);
    }
}
