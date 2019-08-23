package com.ss.android.ugc.aweme.plugin.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.plugin.a.a;
import com.ss.android.ugc.aweme.plugin.b.g;
import com.ss.android.ugc.aweme.plugin.e.a;
import com.ss.android.ugc.aweme.plugin.e.b;
import com.ss.android.ugc.aweme.plugin.e.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class f implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59237a;

    /* renamed from: f  reason: collision with root package name */
    private static volatile f f59238f;

    /* renamed from: b  reason: collision with root package name */
    protected g f59239b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f59240c;

    /* renamed from: d  reason: collision with root package name */
    protected final Map<String, b> f59241d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    protected final List<a.C0664a> f59242e = new ArrayList();
    private final g.b g = new g.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59243a;

        public final void a(b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f59243a, false, 64581, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f59243a, false, 64581, new Class[]{b.class}, Void.TYPE);
                return;
            }
            f.this.f59241d.put(bVar.f59319b.f59324a, bVar);
            if (bVar.f59320c.isFailed()) {
                bVar.j++;
            }
            if (!Lists.isEmpty(f.this.f59242e)) {
                synchronized (f.this.f59242e) {
                    for (a.C0664a a2 : f.this.f59242e) {
                        a2.a(bVar);
                    }
                }
            }
        }

        public final void a(List<b> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f59243a, false, 64582, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f59243a, false, 64582, new Class[]{List.class}, Void.TYPE);
            } else if (!Lists.isEmpty(list)) {
                for (b next : list) {
                    f.this.f59241d.put(next.f59319b.f59324a, next);
                    if (!Lists.isEmpty(f.this.f59242e)) {
                        synchronized (f.this.f59242e) {
                            for (a.C0664a b2 : f.this.f59242e) {
                                b2.b(next);
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    };

    private f(Context context) {
        this.f59240c = context;
        this.f59239b = new g(context, this.g);
    }

    public static f a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f59237a, true, 64566, new Class[]{Context.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{context2}, null, f59237a, true, 64566, new Class[]{Context.class}, f.class);
        }
        if (f59238f == null) {
            synchronized (f.class) {
                if (f59238f == null) {
                    f59238f = new f(context2);
                }
            }
        }
        return f59238f;
    }

    public final b b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f59237a, false, 64574, new Class[]{String.class}, b.class)) {
            return this.f59241d.get(str2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{str2}, this, f59237a, false, 64574, new Class[]{String.class}, b.class);
    }

    public final void a(a.C0664a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59237a, false, 64570, new Class[]{a.C0664a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f59237a, false, 64570, new Class[]{a.C0664a.class}, Void.TYPE);
            return;
        }
        synchronized (this.f59242e) {
            if (!this.f59242e.contains(aVar)) {
                this.f59242e.add(aVar);
            }
        }
    }

    public final void b(a.C0664a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59237a, false, 64571, new Class[]{a.C0664a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f59237a, false, 64571, new Class[]{a.C0664a.class}, Void.TYPE);
            return;
        }
        synchronized (this.f59242e) {
            if (this.f59242e.contains(aVar)) {
                this.f59242e.remove(aVar);
            }
        }
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f59237a, false, 64568, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f59237a, false, 64568, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f59241d.containsKey(str)) {
            return false;
        } else {
            b bVar = this.f59241d.get(str);
            bVar.g = b.a.Retry;
            a(bVar.f59319b, bVar.i);
            return true;
        }
    }

    public final void a(c cVar, String str) {
        b bVar;
        com.ss.android.ugc.aweme.plugin.e.a aVar;
        b bVar2;
        boolean z;
        c cVar2 = cVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cVar2, str2}, this, f59237a, false, 64567, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, str2}, this, f59237a, false, 64567, new Class[]{c.class, String.class}, Void.TYPE);
        } else if (cVar2 != null && !TextUtils.isEmpty(str)) {
            if (this.f59241d.containsKey(cVar2.f59324a)) {
                bVar = this.f59241d.get(cVar2.f59324a);
                g gVar = this.f59239b;
                String str3 = cVar2.f59324a;
                if (PatchProxy.isSupport(new Object[]{str3}, gVar, g.f59245a, false, 64586, new Class[]{String.class}, b.class)) {
                    g gVar2 = gVar;
                    bVar2 = (b) PatchProxy.accessDispatch(new Object[]{str3}, gVar2, g.f59245a, false, 64586, new Class[]{String.class}, b.class);
                } else if (!gVar.f59249e.containsKey(str3)) {
                    bVar2 = null;
                } else {
                    bVar2 = gVar.f59249e.get(str3).f59261b;
                }
                if (bVar2 == null) {
                    bVar.a(b.C0667b.CREATED);
                } else if (bVar2.f59319b.f59325b >= bVar.f59319b.f59325b) {
                    g gVar3 = this.f59239b;
                    if (PatchProxy.isSupport(new Object[0], gVar3, g.f59245a, false, 64584, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], gVar3, g.f59245a, false, 64584, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (!gVar3.f59249e.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return;
                    }
                } else {
                    g gVar4 = this.f59239b;
                    String str4 = cVar2.f59324a;
                    if (PatchProxy.isSupport(new Object[]{str4}, gVar4, g.f59245a, false, 64588, new Class[]{String.class}, Void.TYPE)) {
                        g gVar5 = gVar4;
                        PatchProxy.accessDispatch(new Object[]{str4}, gVar5, g.f59245a, false, 64588, new Class[]{String.class}, Void.TYPE);
                    } else if (gVar4.f59249e.containsKey(str4)) {
                        gVar4.f59249e.get(str4).f59260a.f59233e = 3;
                    }
                }
            } else {
                if (PatchProxy.isSupport(new Object[]{cVar2, str2}, this, f59237a, false, 64580, new Class[]{c.class, String.class}, b.class)) {
                    bVar = (b) PatchProxy.accessDispatch(new Object[]{cVar2, str2}, this, f59237a, false, 64580, new Class[]{c.class, String.class}, b.class);
                } else {
                    bVar = new b();
                    bVar.a(b.C0667b.CREATED);
                    bVar.f59319b = cVar2;
                    bVar.i = str2;
                    bVar.h = System.currentTimeMillis();
                    bVar.g = b.a.Direct;
                }
                this.f59241d.put(cVar2.f59324a, bVar);
            }
            if (!NetworkUtils.isNetworkAvailable(this.f59240c)) {
                bVar.a(b.C0667b.PAUSED_BY_NETWORK);
                this.g.a(bVar);
            } else if (cVar2.k) {
                bVar.a(b.C0667b.PAUSED_BY_LOADPATCH_ONLY);
                cVar2.k = false;
            } else {
                g gVar6 = this.f59239b;
                if (PatchProxy.isSupport(new Object[]{bVar}, gVar6, g.f59245a, false, 64583, new Class[]{b.class}, Void.TYPE)) {
                    Object[] objArr = {bVar};
                    Object[] objArr2 = objArr;
                    g gVar7 = gVar6;
                    PatchProxy.accessDispatch(objArr2, gVar7, g.f59245a, false, 64583, new Class[]{b.class}, Void.TYPE);
                    return;
                }
                if (!gVar6.f59249e.containsKey(bVar.f59319b.f59324a)) {
                    a.C0666a aVar2 = new a.C0666a();
                    aVar2.f59313b = bVar.f59319b.f59326c;
                    aVar2.f59315d = bVar.i;
                    aVar2.f59314c = String.format("%s.jar", new Object[]{bVar.f59319b.f59324a});
                    aVar2.f59316e = bVar.f59319b.f59329f;
                    aVar2.f59317f = bVar.f59319b;
                    if (PatchProxy.isSupport(new Object[0], aVar2, a.C0666a.f59312a, false, 64645, new Class[0], com.ss.android.ugc.aweme.plugin.e.a.class)) {
                        aVar = (com.ss.android.ugc.aweme.plugin.e.a) PatchProxy.accessDispatch(new Object[0], aVar2, a.C0666a.f59312a, false, 64645, new Class[0], com.ss.android.ugc.aweme.plugin.e.a.class);
                    } else {
                        aVar = new com.ss.android.ugc.aweme.plugin.e.a(aVar2);
                    }
                    bVar.f59321d = aVar;
                    d dVar = new d(gVar6.f59246b, bVar.f59321d, gVar6.f59250f, new a());
                    g.a aVar3 = new g.a(dVar, bVar);
                    aVar3.f59260a.f59233e = 0;
                    gVar6.f59249e.put(bVar.f59319b.f59324a, aVar3);
                    gVar6.f59248d.execute(dVar);
                    gVar6.a();
                }
            }
        }
    }

    public final boolean a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, (byte) 0}, this, f59237a, false, 64569, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, (byte) 0}, this, f59237a, false, 64569, new Class[]{String.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.f59241d.containsKey(str)) {
            return false;
        } else {
            b bVar = this.f59241d.get(str);
            bVar.f59319b.f59329f = false;
            bVar.g = b.a.SwitchToFullNet;
            a(bVar.f59319b, bVar.i);
            return true;
        }
    }
}
