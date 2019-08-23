package com.ss.android.ugc.aweme.story.shootvideo.edit;

import a.g;
import a.i;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.e;
import java.io.File;

public final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73495a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73496b;

    l(a aVar) {
        this.f73496b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f73495a, false, 85251, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f73495a, false, 85251, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f73496b;
        if (iVar.d() || iVar.e() == null) {
            return Boolean.FALSE;
        }
        boolean a2 = e.a((Bitmap) iVar.e(), new File(aVar.f73440e.getOutputFile()), 100, Bitmap.CompressFormat.PNG);
        e.a((Bitmap) iVar.e());
        aVar.a(aVar.f73440e.getOutputFile(), "/sdcard/Download/photo.png");
        return Boolean.valueOf(a2);
    }
}
