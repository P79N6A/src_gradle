package com.ss.android.ugc.aweme.shortvideo.q.b;

import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IFestivalService;
import com.ss.android.ugc.aweme.shortvideo.ey;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.ugc.aweme.shortvideo.q.b.c;
import com.ss.android.vesdk.an;
import java.io.File;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68953a;

    /* renamed from: b  reason: collision with root package name */
    private String f68954b;

    /* renamed from: c  reason: collision with root package name */
    private int f68955c;

    /* renamed from: d  reason: collision with root package name */
    private int f68956d;

    /* renamed from: e  reason: collision with root package name */
    private int f68957e;

    public final n a() {
        if (PatchProxy.isSupport(new Object[0], this, f68953a, false, 81114, new Class[0], n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[0], this, f68953a, false, 81114, new Class[0], n.class);
        }
        int i = 20;
        if (ey.a(this.f68957e)) {
            int i2 = this.f68956d - this.f68955c;
            if (i2 > 0) {
                i = 20 + (i2 / 2);
            }
        }
        n nVar = new n();
        nVar.xOffset = 16;
        nVar.yOffset = i;
        nVar.position = an.TL_BR;
        return nVar;
    }

    public final String[] a(boolean z) {
        String str;
        String[] strArr;
        String str2;
        String str3;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68953a, false, 81113, new Class[]{Boolean.TYPE}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68953a, false, 81113, new Class[]{Boolean.TYPE}, String[].class);
        }
        String md5Hex = DigestUtils.md5Hex(this.f68954b);
        f fVar = com.ss.android.ugc.aweme.port.in.a.x;
        if (fVar == null) {
            str = null;
        } else if (TextUtils.isEmpty(fVar.e().a())) {
            str = fVar.e().b();
        } else {
            str = fVar.e().a();
        }
        if (TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new IllegalArgumentException("userId is empty"));
            return null;
        }
        if (!com.ss.android.g.a.a()) {
            str = com.ss.android.ugc.aweme.port.in.a.f61119b.getString(C0906R.string.iw, new Object[]{str});
        }
        String str4 = str;
        File file = new File(fg.k);
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        }
        if (this.f68955c == 0 || this.f68956d == 0) {
            return null;
        }
        if (!z2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new IllegalStateException("provide error " + z2 + " " + this.f68955c + " " + this.f68956d));
            return null;
        }
        if (com.ss.android.g.a.a()) {
            c.a aVar = new c.a();
            if (this.f68957e == 1) {
                aVar.f68963b = 2130839888;
            }
            aVar.a(((IFestivalService) ServiceManager.get().getService(IFestivalService.class)).getWaterPicDir());
            b[] a2 = d.a(this.f68955c, this.f68956d, str4, true, ey.a(this.f68957e), z, aVar.a());
            String str5 = fg.k;
            StringBuilder sb = new StringBuilder();
            sb.append(md5Hex);
            if (z) {
                str3 = "_leftalign";
            } else {
                str3 = "_rightalign";
            }
            sb.append(str3);
            strArr = d.a(a2, str5, sb.toString());
        } else {
            l[] a3 = m.a(str4, z);
            String str6 = fg.k;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(md5Hex);
            if (z) {
                str2 = "_leftalign";
            } else {
                str2 = "_rightalign";
            }
            sb2.append(str2);
            strArr = m.a(a3, str6, sb2.toString());
        }
        return strArr;
    }

    public a(String str, int i, int i2, int i3) {
        this.f68954b = str;
        this.f68955c = i;
        this.f68956d = i2;
        this.f68957e = i3;
    }
}
