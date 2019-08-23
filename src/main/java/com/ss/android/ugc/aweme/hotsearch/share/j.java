package com.ss.android.ugc.aweme.hotsearch.share;

import android.app.AlertDialog;
import android.content.Context;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.hotsearch.share.g;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.u.ae;
import java.io.File;

public final /* synthetic */ class j implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49838a;

    /* renamed from: b  reason: collision with root package name */
    private final g f49839b;

    /* renamed from: c  reason: collision with root package name */
    private final a f49840c;

    j(g gVar, a aVar) {
        this.f49839b = gVar;
        this.f49840c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f49838a, false, 49783, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f49838a, false, 49783, new Class[]{File.class}, Void.TYPE);
            return;
        }
        g gVar = this.f49839b;
        a aVar = this.f49840c;
        ShareInfo shareInfo = gVar.f49832e;
        if (PatchProxy.isSupport(new Object[]{aVar, shareInfo, file}, gVar, g.f49828a, false, 49774, new Class[]{a.class, ShareInfo.class, File.class}, Void.TYPE)) {
            Object[] objArr = {aVar, shareInfo, file};
            Object[] objArr2 = objArr;
            g gVar2 = gVar;
            ChangeQuickRedirect changeQuickRedirect = g.f49828a;
            PatchProxy.accessDispatch(objArr2, gVar2, changeQuickRedirect, false, 49774, new Class[]{a.class, ShareInfo.class, File.class}, Void.TYPE);
        } else {
            new ae().a(gVar.g).b(aVar.d()).c("general").e("normal_share").e();
            if (!aVar.a()) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) gVar.f49830c, aVar.c(), 0).a();
            } else if (cg.b(aVar.d())) {
                String d2 = aVar.d();
                String f2 = aVar.f();
                if (PatchProxy.isSupport(new Object[]{d2, f2}, gVar, g.f49828a, false, 49775, new Class[]{String.class, String.class}, Void.TYPE)) {
                    Object[] objArr3 = {d2, f2};
                    g gVar3 = gVar;
                    ChangeQuickRedirect changeQuickRedirect2 = g.f49828a;
                    PatchProxy.accessDispatch(objArr3, gVar3, changeQuickRedirect2, false, 49775, new Class[]{String.class, String.class}, Void.TYPE);
                } else {
                    gVar.dismiss();
                    if (d2.equals("save_local")) {
                        com.bytedance.ies.dmt.ui.d.a.c((Context) gVar.f49830c, (int) C0906R.string.et, 0).a();
                    } else {
                        new AlertDialog.Builder(gVar.f49830c, C0906R.style.kx).setTitle(C0906R.string.et).setNegativeButton(C0906R.string.pm, new m(gVar)).setPositiveButton(gVar.f49830c.getString(C0906R.string.c66, new Object[]{f2}), new n(gVar, d2)).show();
                    }
                }
            } else {
                aVar.b(i.a((Context) gVar.f49830c, shareInfo, file.getPath()));
            }
        }
        gVar.dismiss();
    }
}
