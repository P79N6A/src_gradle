package com.ss.android.ugc.aweme.o;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photomovie.edit.music.b;
import com.ss.android.ugc.aweme.port.in.ao;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.fg;
import java.io.File;

public final class w implements ao {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58335a;

    public final void a(Context context, c cVar) {
        Context context2 = context;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{context2, cVar2}, this, f58335a, false, 54879, new Class[]{Context.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, cVar2}, this, f58335a, false, 54879, new Class[]{Context.class, c.class}, Void.TYPE);
            return;
        }
        b bVar = new b(context2, cVar2);
        if (PatchProxy.isSupport(new Object[0], bVar, b.f58969a, false, 64117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, b.f58969a, false, 64117, new Class[0], Void.TYPE);
            return;
        }
        bVar.f58971c = com.ss.android.ugc.aweme.shortvideo.view.c.a(bVar.f58972d, bVar.f58972d.getResources().getString(C0906R.string.cnt));
        bVar.f58971c.setIndeterminate(true);
        bVar.f58970b.a(new Object[0]);
    }

    public final String[] a(String str, int i, int i2, int i3) {
        String str2;
        String[] strArr;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f58335a, false, 54878, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f58335a, false, 54878, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, String[].class);
        }
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String md5Hex = DigestUtils.md5Hex(str);
        if (TextUtils.isEmpty(iUserService.getCurrentUser().getUniqueId())) {
            str2 = iUserService.getCurrentUser().getShortId();
        } else {
            str2 = iUserService.getCurrentUser().getUniqueId();
        }
        if (!a.a()) {
            str2 = k.a().getString(C0906R.string.iw, new Object[]{str2});
        }
        String str3 = str2;
        new File(fg.k).mkdirs();
        if (a.a()) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            String str4 = fg.k;
            if (i3 == 2) {
                z = true;
            } else {
                z = false;
            }
            strArr = iAVService.createWaterMarkImages(i, i2, str3, str4, md5Hex, true, z, com.ss.android.ugc.aweme.shortvideo.festival.k.INSTANCE.getWaterPicDir(), true);
        } else {
            strArr = ((IAVService) ServiceManager.get().getService(IAVService.class)).waIWaterMarkService().createWaterMarkImages(str3, fg.k, md5Hex, com.ss.android.ugc.aweme.shortvideo.festival.k.INSTANCE.getWaterPicDir(), true);
        }
        return strArr;
    }
}
