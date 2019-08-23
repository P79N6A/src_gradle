package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ar;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class fv implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67812a;

    /* renamed from: b  reason: collision with root package name */
    public final int f67813b = -1;

    /* renamed from: c  reason: collision with root package name */
    final VideoRecordNewActivity f67814c;

    public fv(VideoRecordNewActivity videoRecordNewActivity) {
        this.f67814c = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f67812a, false, 74706, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f67812a, false, 74706, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != ar.class) {
            return null;
        } else {
            return new fw(this);
        }
    }
}
