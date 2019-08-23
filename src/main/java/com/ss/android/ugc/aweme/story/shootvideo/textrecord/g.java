package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import a.i;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.e;
import java.io.File;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74249a;

    /* renamed from: b  reason: collision with root package name */
    private final String f74250b;

    g(String str) {
        this.f74250b = str;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f74249a, false, 86203, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f74249a, false, 86203, new Class[]{i.class}, Object.class);
        }
        String str = this.f74250b;
        if (iVar.d() || iVar.e() == null) {
            return Boolean.FALSE;
        }
        boolean a2 = e.a((Bitmap) iVar.e(), new File(str), 100, Bitmap.CompressFormat.PNG);
        e.a((Bitmap) iVar.e());
        return Boolean.valueOf(a2);
    }
}
