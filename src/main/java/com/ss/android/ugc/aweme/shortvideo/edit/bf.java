package com.ss.android.ugc.aweme.shortvideo.edit;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bf implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67105a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67106b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f67107c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67108d;

    /* renamed from: e  reason: collision with root package name */
    private final int f67109e;

    bf(VEVideoPublishEditActivity vEVideoPublishEditActivity, boolean z, int i, int i2) {
        this.f67106b = vEVideoPublishEditActivity;
        this.f67107c = z;
        this.f67108d = i;
        this.f67109e = i2;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f67105a, false, 76482, new Class[]{i.class}, Object.class)) {
            return this.f67106b.a(this.f67107c, this.f67108d, this.f67109e, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f67105a, false, 76482, new Class[]{i.class}, Object.class);
    }
}
