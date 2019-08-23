package com.ss.android.ugc.aweme.share.c;

import a.g;
import a.i;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final /* synthetic */ class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64883a;

    /* renamed from: b  reason: collision with root package name */
    private final View f64884b;

    e(View view) {
        this.f64884b = view;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64883a, false, 73747, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f64883a, false, 73747, new Class[]{i.class}, Object.class);
        }
        View view = this.f64884b;
        File file = null;
        if (iVar.e() != null) {
            String str = String.valueOf(view.hashCode()) + "_" + System.currentTimeMillis() + ".png";
            if (BitmapUtils.saveBitmapToSD((Bitmap) iVar.e(), b.a(), str)) {
                file = new File(b.a(), str);
            }
        }
        return file;
    }
}
