package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.video.e.b;
import com.ss.android.ugc.playerkit.videoview.d.f;

public final /* synthetic */ class m implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76174a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f76175b = new m();

    private m() {
    }

    public final i a(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, f76174a, false, 88938, new Class[]{String.class}, i.class)) {
            return b.b(str);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str}, this, f76174a, false, 88938, new Class[]{String.class}, i.class);
    }
}
