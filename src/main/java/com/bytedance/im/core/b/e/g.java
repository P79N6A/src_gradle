package com.bytedance.im.core.b.e;

import android.text.TextUtils;
import com.bytedance.im.core.d.b;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.bytedance.im.core.d.k;
import com.bytedance.im.core.d.m;
import com.bytedance.im.core.d.n;
import com.bytedance.im.core.d.p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class g implements h, i, k {

    /* renamed from: f  reason: collision with root package name */
    private static g f21190f;

    /* renamed from: a  reason: collision with root package name */
    public k f21191a;

    /* renamed from: b  reason: collision with root package name */
    public h f21192b;

    /* renamed from: c  reason: collision with root package name */
    public i f21193c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, List<h>> f21194d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public Map<String, List<k>> f21195e = new HashMap();

    interface a<T> {
        void a(T t);
    }

    public final void a(boolean z) {
    }

    @Deprecated
    public final void d(List<n> list) {
    }

    @Deprecated
    public final void e(List<n> list) {
    }

    private g() {
    }

    public static g a() {
        if (f21190f == null) {
            synchronized (g.class) {
                if (f21190f == null) {
                    f21190f = new g();
                }
            }
        }
        return f21190f;
    }

    public final void c(final b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            b(bVar.getConversationId(), (a<h>) new a<h>() {
                public final /* synthetic */ void a(Object obj) {
                    ((h) obj).c(bVar);
                }
            });
        }
    }

    public final void d(final b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            b(bVar.getConversationId(), (a<h>) new a<h>() {
                public final /* synthetic */ void a(Object obj) {
                    ((h) obj).d(bVar);
                }
            });
        }
    }

    public final void e(final b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            b(bVar.getConversationId(), (a<h>) new a<h>() {
                public final /* synthetic */ void a(Object obj) {
                    ((h) obj).e(bVar);
                }
            });
        }
    }

    public final void f(final List<n> list) {
        if (list != null && !list.isEmpty()) {
            a(list.get(0).getConversationId(), (a<k>) new a<k>() {
                public final /* synthetic */ void a(Object obj) {
                    ((k) obj).f(list);
                }
            });
        }
    }

    public final void h(final List<m> list) {
        if (list != null && !list.isEmpty()) {
            AnonymousClass13 r0 = new a<i>() {
                public final /* synthetic */ void a(Object obj) {
                    ((i) obj).h(list);
                }
            };
            if (this.f21193c != null) {
                r0.a(this.f21193c);
            }
        }
    }

    public final void c(final List<n> list) {
        if (list != null && !list.isEmpty()) {
            a(list.get(0).getConversationId(), (a<k>) new a<k>() {
                public final /* synthetic */ void a(Object obj) {
                    ((k) obj).c(list);
                }
            });
        }
    }

    public final void g(final List<p> list) {
        if (list != null && !list.isEmpty()) {
            p pVar = list.get(0);
            if (pVar != null && !TextUtils.isEmpty(pVar.getConversationId())) {
                a(pVar.getConversationId(), (a<k>) new a<k>() {
                    public final /* synthetic */ void a(Object obj) {
                        ((k) obj).g(list);
                    }
                });
            }
        }
    }

    public final void b(final b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            b(bVar.getConversationId(), (a<h>) new a<h>() {
                public final /* synthetic */ void a(Object obj) {
                    ((h) obj).b(bVar);
                }
            });
        }
    }

    public final void a(final b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.getConversationId())) {
            b(bVar.getConversationId(), (a<h>) new a<h>() {
                public final /* bridge */ /* synthetic */ void a(Object obj) {
                    ((h) obj).a(bVar);
                }
            });
        }
    }

    public final void b(final n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.getConversationId())) {
            a(nVar.getConversationId(), (a<k>) new a<k>() {
                public final /* synthetic */ void a(Object obj) {
                    ((k) obj).b(nVar);
                }
            });
        }
    }

    public final void a(final n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.getConversationId())) {
            a(nVar.getConversationId(), (a<k>) new a<k>() {
                public final /* bridge */ /* synthetic */ void a(Object obj) {
                    ((k) obj).a(nVar);
                }
            });
        }
    }

    public final void b(final List<m> list) {
        if (list != null && !list.isEmpty()) {
            b(list.get(0).getConversationId(), (a<h>) new a<h>() {
                public final /* synthetic */ void a(Object obj) {
                    ((h) obj).b(list);
                }
            });
        }
    }

    public final void a(final List<m> list) {
        if (list != null && !list.isEmpty()) {
            b(list.get(0).getConversationId(), (a<h>) new a<h>() {
                public final /* bridge */ /* synthetic */ void a(Object obj) {
                    ((h) obj).a(list);
                }
            });
        }
    }

    public final void a(final String str, final List<m> list) {
        if (!TextUtils.isEmpty(str)) {
            b(str, (a<h>) new a<h>() {
                public final /* bridge */ /* synthetic */ void a(Object obj) {
                    ((h) obj).a(str, list);
                }
            });
        }
    }

    public final void b(String str, final List<n> list) {
        if (!TextUtils.isEmpty(str)) {
            a(str, (a<k>) new a<k>() {
                public final /* synthetic */ void a(Object obj) {
                    ((k) obj).e(list);
                }
            });
        }
    }

    public final void b(final int i, final n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.getConversationId())) {
            a(nVar.getConversationId(), (a<k>) new a<k>() {
                public final /* synthetic */ void a(Object obj) {
                    ((k) obj).b(i, nVar);
                }
            });
        }
    }

    private void b(String str, a<h> aVar) {
        List<h> list = this.f21194d.get(str);
        if (list != null) {
            for (h a2 : list) {
                aVar.a(a2);
            }
        }
        if (this.f21192b != null) {
            aVar.a(this.f21192b);
        }
    }

    public final void a(final int i, final n nVar) {
        if (nVar != null && !TextUtils.isEmpty(nVar.getConversationId())) {
            a(nVar.getConversationId(), (a<k>) new a<k>() {
                public final /* bridge */ /* synthetic */ void a(Object obj) {
                    ((k) obj).a(i, nVar);
                }
            });
        }
    }

    public final void a(final int i, final p pVar) {
        if (pVar != null && !TextUtils.isEmpty(pVar.getConversationId())) {
            a(pVar.getConversationId(), (a<k>) new a<k>() {
                public final /* bridge */ /* synthetic */ void a(Object obj) {
                    ((k) obj).a(i, pVar);
                }
            });
        }
    }

    public void a(String str, a<k> aVar) {
        List<k> list = this.f21195e.get(str);
        if (list != null) {
            for (k a2 : list) {
                aVar.a(a2);
            }
        }
        if (this.f21191a != null) {
            aVar.a(this.f21191a);
        }
    }
}
