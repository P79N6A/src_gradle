package com.ss.android.ugc.aweme.shortvideo.q.b;

import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.fg;
import com.ss.android.vesdk.an;
import java.io.File;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68966a;

    /* renamed from: b  reason: collision with root package name */
    private String f68967b;

    /* renamed from: c  reason: collision with root package name */
    private int f68968c;

    /* renamed from: d  reason: collision with root package name */
    private int f68969d;

    public final n a() {
        if (PatchProxy.isSupport(new Object[0], this, f68966a, false, 81131, new Class[0], n.class)) {
            return (n) PatchProxy.accessDispatch(new Object[0], this, f68966a, false, 81131, new Class[0], n.class);
        }
        float f2 = ((float) this.f68968c) / 720.0f;
        n nVar = new n();
        nVar.xOffset = (int) (26.0f * f2);
        nVar.yOffset = (int) (f2 * 28.0f);
        nVar.position = an.BR;
        return nVar;
    }

    public final String[] a(boolean z) {
        String str;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68966a, false, 81130, new Class[]{Boolean.TYPE}, String[].class)) {
            return (String[]) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68966a, false, 81130, new Class[]{Boolean.TYPE}, String[].class);
        }
        String md5Hex = DigestUtils.md5Hex(this.f68967b);
        com.ss.android.ugc.aweme.account.f fVar = a.x;
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
            str = a.f61119b.getString(C0906R.string.iw, new Object[]{str});
        }
        String str2 = str;
        File file = new File(fg.k);
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f68968c == 0 || this.f68969d == 0) {
            return null;
        }
        if (!z2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new IllegalStateException("provide error " + z2 + " " + this.f68968c + " " + this.f68969d));
            return null;
        }
        String str3 = fg.k + File.separator + md5Hex + ".png";
        new l().a(this.f68968c, this.f68969d, str2, 2130840589, z).a(str3);
        return new String[]{str3};
    }

    public f(String str, int i, int i2) {
        this.f68967b = str;
        this.f68968c = i;
        this.f68969d = i2;
    }
}
