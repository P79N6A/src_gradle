package com.ss.android.chooser;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Message;
import android.provider.MediaStore;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class e implements WeakHandler.IHandler {
    private static e j;

    /* renamed from: a  reason: collision with root package name */
    public Context f27980a;

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f27981b = new WeakHandler(this);

    /* renamed from: c  reason: collision with root package name */
    c f27982c = new c(this.f27981b);

    /* renamed from: d  reason: collision with root package name */
    boolean f27983d = false;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, f> f27984e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    final HashMap<Integer, List<f>> f27985f = new HashMap<>();
    final List<f> g = new ArrayList();
    final Set<b> h = new HashSet();
    final Set<c> i = new HashSet();
    private final Set<d> k = new HashSet();

    public interface a {
        ArrayList<f> a();
    }

    public interface b {
        void a(int i);
    }

    public interface c {
        void a(boolean z);
    }

    public interface d {
        void a();
    }

    public static e a() {
        return j;
    }

    public final List<f> e() {
        return new ArrayList(this.g);
    }

    public final int f() {
        return this.g.size();
    }

    public final void d() {
        this.g.clear();
        c();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        for (d a2 : this.k) {
            a2.a();
        }
    }

    private boolean g() {
        int[] iArr = {1, 4, 3, 2};
        for (int i2 = 0; i2 < 4; i2++) {
            if (!Lists.isEmpty(b(iArr[i2]))) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (g() && !this.f27983d) {
            this.f27983d = true;
            ContentResolver contentResolver = this.f27980a.getContentResolver();
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, false, this.f27982c);
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, false, this.f27982c);
        }
    }

    public final void a(d dVar) {
        this.k.add(dVar);
    }

    public final void b(d dVar) {
        this.k.remove(dVar);
    }

    public static synchronized void a(Context context) {
        synchronized (e.class) {
            if (j == null) {
                j = new e(context);
            }
        }
    }

    public final List<f> b(int i2) {
        List list = this.f27985f.get(Integer.valueOf(i2));
        if (list != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    /* access modifiers changed from: package-private */
    public void a(int i2) {
        for (b a2 : this.h) {
            a2.a(i2);
        }
    }

    private e(Context context) {
        this.f27980a = context;
    }

    public final void a(f fVar) {
        if (fVar != null) {
            if (!this.g.contains(fVar)) {
                this.g.add(fVar);
            }
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(f fVar) {
        if (fVar != null) {
            String str = fVar.f27990b;
            if (!this.f27984e.containsKey(str)) {
                this.f27984e.put(str, fVar);
            }
        }
    }

    public final void a(List<String> list) {
        if (!Lists.isEmpty(list)) {
            for (String next : list) {
                if (this.f27984e.containsKey(next)) {
                    f fVar = this.f27984e.get(next);
                    if (!this.g.contains(fVar)) {
                        this.g.add(fVar);
                    }
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        boolean z;
        if (10 == message.what) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<f> list = (List) message.obj;
            int i2 = message.arg1;
            if (list != null) {
                List<f> list2 = this.f27985f.get(Integer.valueOf(i2));
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.f27985f.put(Integer.valueOf(i2), list2);
                }
                for (f fVar : list2) {
                    this.f27984e.remove(fVar.f27990b);
                }
                list2.clear();
                for (f b2 : list) {
                    b(b2);
                }
                list2.addAll(list);
                a(i2);
                Iterator<f> it2 = this.g.iterator();
                while (it2.hasNext()) {
                    if (!this.f27984e.containsKey(it2.next().f27990b)) {
                        it2.remove();
                    }
                }
                c();
            }
            b();
        }
        for (c a2 : this.i) {
            a2.a(z);
        }
    }

    public final void a(final int i2, boolean z) {
        final int i3 = z ? 1 : 0;
        new ThreadPlus("get image thread") {
            public final void run() {
                try {
                    ArrayList arrayList = new ArrayList();
                    if (1 == i2) {
                        arrayList.addAll(d.a(e.this.f27980a, true));
                    } else if (4 == i2) {
                        arrayList.addAll(d.b(e.this.f27980a));
                    } else if (3 == i2) {
                        arrayList.addAll(d.a(e.this.f27980a, false));
                    } else if (2 == i2) {
                        arrayList.addAll(d.a(e.this.f27980a));
                    } else if (i2 == 0) {
                        arrayList.addAll(d.b(e.this.f27980a));
                        arrayList.addAll(d.a(e.this.f27980a, true));
                        Collections.sort(arrayList);
                    }
                    Message obtainMessage = e.this.f27981b.obtainMessage(10);
                    obtainMessage.arg1 = i2;
                    obtainMessage.arg2 = i3;
                    obtainMessage.obj = arrayList;
                    obtainMessage.sendToTarget();
                } catch (Exception e2) {
                    Message obtainMessage2 = e.this.f27981b.obtainMessage(11);
                    obtainMessage2.arg2 = i3;
                    obtainMessage2.obj = e2;
                    obtainMessage2.sendToTarget();
                }
            }
        }.start();
    }
}
