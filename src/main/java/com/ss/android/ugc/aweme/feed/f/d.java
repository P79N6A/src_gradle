package com.ss.android.ugc.aweme.feed.f;

import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.u.aa;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public NearbyCities.CityBean f45298a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f45299b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f45300c;

    public d(NearbyCities.CityBean cityBean, boolean z) {
        this(cityBean, z, true);
    }

    public d(NearbyCities.CityBean cityBean, boolean z, boolean z2) {
        this.f45300c = true;
        this.f45298a = cityBean;
        this.f45299b = z;
        this.f45300c = z2;
        aa.f75006c = "change";
    }
}
