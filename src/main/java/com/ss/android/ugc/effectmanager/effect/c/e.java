package com.ss.android.ugc.effectmanager.effect.c;

import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.effectmanager.a.a;
import com.ss.android.ugc.effectmanager.common.f.g;
import com.ss.android.ugc.effectmanager.common.h;
import com.ss.android.ugc.effectmanager.common.i;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.o;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.b.q;
import com.ss.android.ugc.effectmanager.effect.e.a.k;
import com.ss.android.ugc.effectmanager.effect.e.a.l;
import com.ss.android.ugc.effectmanager.effect.e.b.r;
import com.ss.android.ugc.effectmanager.j;
import java.util.HashMap;

public final class e implements i.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f77371a = "UpdateTagRepository";

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, String> f77372b;

    /* renamed from: c  reason: collision with root package name */
    private a f77373c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f77374d;

    public e(a aVar) {
        this.f77373c = aVar;
        this.f77374d = new i(this);
    }

    public final void a(Message message) {
        switch (message.what) {
            case 51:
                if (message.obj instanceof l) {
                    l lVar = (l) message.obj;
                    if (this.f77373c != null) {
                        j jVar = this.f77373c.f77204a.z;
                        String str = lVar.f77314a;
                        if (jVar.f77511e == null) {
                            jVar.f77511e = new HashMap();
                        }
                        q qVar = jVar.f77511e.get(str);
                        if (qVar != null) {
                            qVar.a();
                        }
                        j jVar2 = this.f77373c.f77204a.z;
                        String str2 = lVar.f77314a;
                        if (jVar2.f77511e != null) {
                            jVar2.f77511e.remove(str2);
                            break;
                        }
                    } else {
                        return;
                    }
                }
                break;
            case 52:
                if (message.obj instanceof k) {
                    k kVar = (k) message.obj;
                    if (this.f77373c != null) {
                        j jVar3 = this.f77373c.f77204a.z;
                        String str3 = kVar.f77314a;
                        if (jVar3.f77512f == null) {
                            jVar3.f77512f = new HashMap();
                        }
                        o oVar = jVar3.f77512f.get(str3);
                        if (this.f77372b == null) {
                            this.f77372b = new HashMap<>();
                        }
                        if (kVar.f77415c == null) {
                            this.f77372b.putAll(kVar.f77414b);
                            if (oVar != null) {
                                oVar.a();
                            }
                        } else if (oVar != null) {
                            oVar.b();
                        }
                        if (oVar != null) {
                            oVar.c();
                        }
                        j jVar4 = this.f77373c.f77204a.z;
                        String str4 = kVar.f77314a;
                        if (jVar4.f77512f != null) {
                            jVar4.f77512f.remove(str4);
                        }
                        return;
                    }
                    return;
                }
                break;
        }
    }

    public final void a(String str, String str2, m mVar) {
        if (this.f77372b == null) {
            mVar.a();
        } else if (!this.f77372b.containsKey(str) || g.a(str2, -1) > g.a(this.f77372b.get(str), -1)) {
            mVar.a();
        } else {
            mVar.b();
        }
    }

    public final void b(String str, String str2, String str3, p pVar) {
        if (this.f77372b != null) {
            a(str, str2, str3, pVar);
        } else if (this.f77373c == null) {
            if (pVar != null) {
                pVar.a();
            }
        } else {
            j jVar = this.f77373c.f77204a.z;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final p pVar2 = pVar;
            AnonymousClass2 r1 = new o() {
                public final void a() {
                }

                public final void b() {
                }

                public final void c() {
                    e.this.a(str4, str5, str6, pVar2);
                }
            };
            jVar.a(str, (o) r1);
            h hVar = this.f77373c.f77204a.q;
            com.ss.android.ugc.effectmanager.effect.e.b.p pVar3 = new com.ss.android.ugc.effectmanager.effect.e.b.p(this.f77374d, this.f77373c, str4, str5, str6);
            hVar.a(pVar3);
        }
    }

    public final void a(String str, final String str2, final String str3, final m mVar) {
        if (this.f77372b != null) {
            a(str2, str3, mVar);
        } else if (this.f77373c == null) {
            if (mVar != null) {
                mVar.b();
            }
        } else {
            this.f77373c.f77204a.z.a(str, (o) new o() {
                public final void c() {
                }

                public final void b() {
                    mVar.a();
                }

                public final void a() {
                    e.this.a(str2, str3, mVar);
                }
            });
            h hVar = this.f77373c.f77204a.q;
            com.ss.android.ugc.effectmanager.effect.e.b.p pVar = new com.ss.android.ugc.effectmanager.effect.e.b.p(this.f77374d, this.f77373c, str, str2, str3);
            hVar.a(pVar);
        }
    }

    public final void a(String str, String str2, String str3, final p pVar) {
        if (this.f77373c == null) {
            if (pVar != null) {
                pVar.a();
            }
            return;
        }
        if (this.f77372b == null) {
            pVar.a();
        }
        this.f77372b.put(str2, str3);
        j jVar = this.f77373c.f77204a.z;
        AnonymousClass1 r5 = new q() {
            public final void a() {
                if (pVar != null) {
                    pVar.a();
                }
            }
        };
        if (jVar.f77511e == null) {
            jVar.f77511e = new HashMap();
        }
        jVar.f77511e.put(str, r5);
        this.f77373c.f77204a.q.a(new r(this.f77374d, this.f77373c, str, this.f77372b));
    }
}
