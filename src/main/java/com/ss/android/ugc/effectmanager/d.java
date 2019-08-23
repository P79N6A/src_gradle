package com.ss.android.ugc.effectmanager;

import android.os.SystemClock;
import com.bef.effectsdk.RequirementResourceMapper;
import com.ss.android.ugc.effectmanager.c;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.f;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.d.a;
import com.ss.android.ugc.effectmanager.effect.a.b;
import com.ss.android.ugc.effectmanager.effect.e.a.e;
import com.ss.android.ugc.effectmanager.k;
import com.ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class d implements com.ss.android.ugc.effectmanager.effect.a.a {

    /* renamed from: a  reason: collision with root package name */
    l f77338a;

    /* renamed from: b  reason: collision with root package name */
    private a f77339b;

    /* renamed from: c  reason: collision with root package name */
    private a f77340c;

    /* renamed from: d  reason: collision with root package name */
    private m f77341d;

    /* renamed from: e  reason: collision with root package name */
    private f f77342e;

    /* renamed from: f  reason: collision with root package name */
    private c.a f77343f;
    private final b g;
    private com.ss.android.ugc.effectmanager.common.d.d h;
    private final Object i = new Object();

    class a extends com.ss.android.ugc.effectmanager.effect.d.a<e> {

        /* renamed from: a  reason: collision with root package name */
        com.ss.android.ugc.effectmanager.effect.d.a<e> f77344a;

        /* renamed from: b  reason: collision with root package name */
        b f77345b;

        public final void a() {
            try {
                a(this);
                d.this.b(this.f77345b);
                this.f77344a.a();
            } catch (RuntimeException e2) {
                a((com.ss.android.ugc.effectmanager.effect.d.a<T>) this, new com.ss.android.ugc.effectmanager.common.e.c((Exception) e2));
            }
        }

        public a(com.ss.android.ugc.effectmanager.effect.d.a<e> aVar, b bVar) {
            this.f77344a = aVar;
            this.f77345b = bVar;
            this.f77344a.f77386d = new com.ss.android.ugc.effectmanager.effect.d.b<e>() {
                public final void a() {
                }

                public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                    a.this.a((com.ss.android.ugc.effectmanager.effect.d.a<T>) a.this, cVar);
                }

                public final /* bridge */ /* synthetic */ void a(com.ss.android.ugc.effectmanager.effect.d.a aVar, Object obj) {
                    a.this.a((com.ss.android.ugc.effectmanager.effect.d.a<T>) a.this, (e) obj);
                }

                public final void a(com.ss.android.ugc.effectmanager.effect.d.a<e> aVar, int i, long j) {
                    a.this.a(aVar, i, j);
                }
            };
        }
    }

    private boolean a(String[] strArr) {
        for (String b2 : strArr) {
            if (!b(b2)) {
                return false;
            }
        }
        return true;
    }

    private boolean b(String str) {
        a aVar = this.f77339b;
        return aVar.a("model/" + str);
    }

    public final com.ss.android.ugc.effectmanager.effect.d.a<e> a(b bVar) {
        return new a(new com.ss.android.ugc.effectmanager.effect.e.b.b(this.f77340c, this.h, this.g.l, this.g.m).a(bVar), bVar);
    }

    private String a(String str) {
        for (k.a aVar : this.f77338a.a().f77513a.a()) {
            if (aVar.a().equals(str)) {
                return aVar.f77514a.getVersion();
            }
        }
        throw new RuntimeException("Can not find compatible version from server" + str);
    }

    /* access modifiers changed from: package-private */
    public final void b(b bVar) {
        String str;
        List<String> list = bVar.f77352a.requirements;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        if (list != null && !list.isEmpty()) {
            String[] a2 = RequirementResourceMapper.a((String[]) list.toArray(new String[list.size()]));
            synchronized (this.i) {
                try {
                    k a3 = this.f77338a.a();
                    ArrayList arrayList = new ArrayList();
                    int length = a2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = a2[i2];
                        String a4 = com.ss.android.ugc.effectmanager.common.c.a(str2);
                        String a5 = a(a4);
                        if (b(str2)) {
                            str2.lastIndexOf("/");
                            int lastIndexOf = str2.lastIndexOf("_v");
                            int a6 = f.a(str2, ".model|.dat");
                            if (lastIndexOf > 0) {
                                str = str2.substring(lastIndexOf + 2, a6);
                            } else {
                                str = "v1.0";
                            }
                            if (new BigDecimal(str).compareTo(new BigDecimal(a5)) == 0) {
                                i2++;
                            }
                        }
                        LocalModelInfo a7 = this.f77342e.a(a4);
                        if (a7 == null || !a7.getVersion().equals(a5)) {
                            UrlModel a8 = a3.a(a4);
                            ModelInfo modelInfo = new ModelInfo();
                            modelInfo.setName(a4);
                            modelInfo.setVersion(a5);
                            modelInfo.setFile_url(a8);
                            arrayList.add(modelInfo);
                            i2++;
                        } else {
                            i2++;
                        }
                    }
                    a(bVar, arrayList);
                } catch (RuntimeException e2) {
                    if (!a(a2)) {
                        throw e2;
                    }
                }
            }
        }
    }

    private void a(b bVar, Collection<ModelInfo> collection) {
        String str;
        for (ModelInfo next : collection) {
            o oVar = new o(SystemClock.uptimeMillis());
            try {
                long currentTimeMillis = System.currentTimeMillis();
                long a2 = this.f77341d.a(next) / ((long) EffectConstants.f77264a);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (this.h != null) {
                    com.ss.android.ugc.effectmanager.common.d.d dVar = this.h;
                    com.ss.android.ugc.effectmanager.common.f.c a3 = com.ss.android.ugc.effectmanager.common.f.c.a().a("app_id", this.g.l).a("access_key", this.g.m).a("duration", Long.valueOf(currentTimeMillis2));
                    if (next == null) {
                        str = "";
                    } else {
                        str = next.getName();
                    }
                    dVar.a("resource_download_success_rate", 0, a3.a("resource_name", str).a("size", Long.valueOf(a2)).b());
                }
                if (this.f77343f != null) {
                    this.f77343f.a(bVar.f77352a, next, SystemClock.uptimeMillis() - oVar.f77535a);
                }
            } catch (RuntimeException e2) {
                com.ss.android.ugc.effectmanager.common.e.c cVar = new com.ss.android.ugc.effectmanager.common.e.c((Exception) e2);
                String str2 = next.getFile_url().url_list.get(0);
                String str3 = "";
                try {
                    str3 = InetAddress.getByName(new URL(str2).getHost()).getHostAddress();
                } catch (MalformedURLException | UnknownHostException unused) {
                }
                if (this.h != null) {
                    this.h.a("resource_download_success_rate", 1, com.ss.android.ugc.effectmanager.common.f.c.a().a("app_id", this.g.l).a("access_key", this.g.m).a("resource_name", next.getName()).a("error_msg", e2.getMessage()).a("error_code", Integer.valueOf(cVar.f77315a)).a("download_url", str2).a("host_ip", str3).b());
                }
                if (this.f77343f != null) {
                    this.f77343f.a(bVar.f77352a, next, (Exception) e2);
                    throw e2;
                }
            }
        }
    }

    public d(b bVar, a aVar, f fVar, a aVar2, l lVar, c.a aVar3) {
        this.g = bVar;
        this.h = bVar.n;
        this.f77339b = aVar;
        this.f77342e = fVar;
        this.f77340c = aVar2;
        this.f77338a = lVar;
        this.f77341d = new m(this.f77342e, aVar2);
        this.f77343f = aVar3;
    }
}
