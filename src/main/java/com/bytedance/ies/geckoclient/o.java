package com.bytedance.ies.geckoclient;

import com.bytedance.ies.geckoclient.e.c;
import com.bytedance.ies.geckoclient.model.CommonParamsModel;
import com.bytedance.ies.geckoclient.model.PackageStatisticModel;
import com.bytedance.ies.geckoclient.model.k;
import java.util.ArrayList;
import java.util.Locale;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    static o f20831a;

    /* renamed from: b  reason: collision with root package name */
    private k f20832b;

    /* renamed from: c  reason: collision with root package name */
    private CommonParamsModel f20833c;

    private o() {
    }

    private void c() {
        this.f20832b = new k(this.f20833c, new ArrayList());
    }

    public final synchronized k b() {
        k kVar;
        kVar = this.f20832b;
        c();
        return kVar;
    }

    public static synchronized o a() {
        o oVar;
        synchronized (o.class) {
            if (f20831a == null) {
                f20831a = new o();
            }
            oVar = f20831a;
        }
        return oVar;
    }

    public final synchronized void a(PackageStatisticModel packageStatisticModel) {
        this.f20832b.f20827b.add(packageStatisticModel);
    }

    public o(f fVar) {
        String str = fVar.f20736a.f20787c;
        String country = Locale.getDefault().getCountry();
        String str2 = fVar.f20736a.f20786b;
        CommonParamsModel commonParamsModel = new CommonParamsModel(str, 0, country, str2, c.c(f.l), c.a());
        this.f20833c = commonParamsModel;
        c();
    }
}
