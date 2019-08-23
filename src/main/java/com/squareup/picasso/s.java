package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f27437a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            boolean z;
            int i = message.what;
            if (i != 3) {
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        c cVar = (c) list.get(i2);
                        s sVar = cVar.f27402b;
                        a aVar = cVar.k;
                        List<a> list2 = cVar.l;
                        boolean z2 = true;
                        if (list2 == null || list2.isEmpty()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (aVar == null && !z) {
                            z2 = false;
                        }
                        if (z2) {
                            Bitmap bitmap = cVar.m;
                            d dVar = cVar.o;
                            if (aVar != null) {
                                sVar.a(bitmap, dVar, aVar);
                            }
                            if (z) {
                                int size2 = list2.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    sVar.a(bitmap, dVar, list2.get(i3));
                                }
                            }
                        }
                    }
                } else if (i == 13) {
                    List list3 = (List) message.obj;
                    int size3 = list3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        a aVar2 = (a) list3.get(i4);
                        s sVar2 = aVar2.f27381a;
                        Bitmap bitmap2 = null;
                        if (o.shouldReadFromMemoryCache(aVar2.f27385e)) {
                            bitmap2 = sVar2.a(aVar2.i);
                        }
                        if (bitmap2 != null) {
                            sVar2.a(bitmap2, d.MEMORY, aVar2);
                            if (sVar2.m) {
                                aVar2.f27382b.a();
                                new StringBuilder("from ").append(d.MEMORY);
                            }
                        } else {
                            sVar2.a(aVar2);
                            if (sVar2.m) {
                                aVar2.f27382b.a();
                            }
                        }
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                a aVar3 = (a) message.obj;
                if (aVar3.f27381a.m) {
                    aVar3.f27382b.a();
                }
                aVar3.f27381a.a(aVar3.c());
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    static volatile s f27438b = null;

    /* renamed from: c  reason: collision with root package name */
    public final List<x> f27439c;

    /* renamed from: d  reason: collision with root package name */
    final Context f27440d;

    /* renamed from: e  reason: collision with root package name */
    final Dispatcher f27441e;

    /* renamed from: f  reason: collision with root package name */
    final d f27442f;
    final z g;
    final Map<Object, a> h;
    final Map<ImageView, h> i;
    final ReferenceQueue<Object> j;
    final Bitmap.Config k;
    public boolean l;
    public volatile boolean m;
    boolean n;
    private final c o;
    private final f p;
    private final b q;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f27443a;

        /* renamed from: b  reason: collision with root package name */
        public i f27444b;

        /* renamed from: c  reason: collision with root package name */
        public ExecutorService f27445c;

        /* renamed from: d  reason: collision with root package name */
        public d f27446d;

        /* renamed from: e  reason: collision with root package name */
        public c f27447e;

        /* renamed from: f  reason: collision with root package name */
        public f f27448f;
        public List<x> g;
        public Bitmap.Config h;
        public boolean i;
        public boolean j;

        public a(Context context) {
            if (context != null) {
                this.f27443a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    static class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private final ReferenceQueue<Object> f27449a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f27450b;

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0319a aVar = (a.C0319a) this.f27449a.remove(1000);
                    Message obtainMessage = this.f27450b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f27387a;
                        this.f27450b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    this.f27450b.post(new Runnable() {
                        public final void run() {
                            throw new RuntimeException(e2);
                        }
                    });
                    return;
                }
            }
        }

        b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f27449a = referenceQueue;
            this.f27450b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    public interface c {
    }

    public enum d {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        private d(int i) {
            this.debugColor = i;
        }
    }

    public enum e {
        LOW,
        NORMAL,
        HIGH
    }

    public interface f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f27453a = new f() {
            public final v a(v vVar) {
                return vVar;
            }
        };

        v a(v vVar);
    }

    public final void a(ImageView imageView) {
        a((Object) imageView);
    }

    public final w a(Uri uri) {
        return new w(this, uri, 0);
    }

    /* access modifiers changed from: package-private */
    public final Bitmap a(String str) {
        Bitmap a2 = this.f27442f.a(str);
        if (a2 != null) {
            this.g.a();
        } else {
            this.g.f27486c.sendEmptyMessage(1);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final v a(v vVar) {
        v a2 = this.p.a(vVar);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Request transformer " + this.p.getClass().getCanonicalName() + " returned null for " + vVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        Object c2 = aVar.c();
        if (!(c2 == null || this.h.get(c2) == aVar)) {
            a(c2);
            this.h.put(c2, aVar);
        }
        Dispatcher dispatcher = this.f27441e;
        dispatcher.i.sendMessage(dispatcher.i.obtainMessage(1, aVar));
    }

    public final void a(Object obj) {
        ad.a();
        a remove = this.h.remove(obj);
        if (remove != null) {
            remove.b();
            this.f27441e.a(remove);
        }
        if (obj instanceof ImageView) {
            h remove2 = this.i.remove((ImageView) obj);
            if (remove2 != null) {
                remove2.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ImageView imageView, h hVar) {
        this.i.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    public void a(Bitmap bitmap, d dVar, a aVar) {
        if (!aVar.l) {
            if (!aVar.k) {
                this.h.remove(aVar.c());
            }
            if (bitmap == null) {
                aVar.a();
                if (this.m) {
                    aVar.f27382b.a();
                }
            } else if (dVar != null) {
                aVar.a(bitmap, dVar);
                if (this.m) {
                    aVar.f27382b.a();
                    new StringBuilder("from ").append(dVar);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public s(Context context, Dispatcher dispatcher, d dVar, c cVar, f fVar, List<x> list, z zVar, Bitmap.Config config, boolean z, boolean z2) {
        int i2;
        this.f27440d = context;
        this.f27441e = dispatcher;
        this.f27442f = dVar;
        this.o = cVar;
        this.p = fVar;
        this.k = config;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList(i2 + 7);
        arrayList.add(new y(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new f(context));
        arrayList.add(new n(context));
        arrayList.add(new g(context));
        arrayList.add(new b(context));
        arrayList.add(new j(context));
        arrayList.add(new q(dispatcher.f27374d, zVar));
        this.f27439c = Collections.unmodifiableList(arrayList);
        this.g = zVar;
        this.h = new WeakHashMap();
        this.i = new WeakHashMap();
        this.l = z;
        this.m = z2;
        this.j = new ReferenceQueue<>();
        this.q = new b(this.j, f27437a);
        this.q.start();
    }
}
