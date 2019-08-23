package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.z;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import java.io.File;

public final /* synthetic */ class ad implements z.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64609a;

    /* renamed from: b  reason: collision with root package name */
    private final z f64610b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64611c;

    ad(z zVar, a aVar) {
        this.f64610b = zVar;
        this.f64611c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64609a, false, 73020, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f64609a, false, 73020, new Class[]{File.class}, Void.TYPE);
            return;
        }
        z zVar = this.f64610b;
        a aVar = this.f64611c;
        zVar.n = false;
        if (file != null && file.exists()) {
            if (f.c(zVar.f65324b) != 0) {
                com.ss.android.ugc.aweme.utils.permission.a.a(zVar.f65324b, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a(aVar, file) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65326a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ com.douyin.baseshare.a f65327b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ File f65328c;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f65326a, false, 73021, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f65326a, false, 73021, new Class[0], Void.TYPE);
                            return;
                        }
                        z.this.a(this.f65327b, this.f65328c);
                        z.this.dismiss();
                    }

                    {
                        this.f65327b = r2;
                        this.f65328c = r3;
                    }
                });
                return;
            }
            zVar.a(aVar, file);
            zVar.dismiss();
        }
    }
}
