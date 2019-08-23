package com.ss.android.ugc.aweme.photomovie.edit.music;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.ugc.b.a;
import com.ss.android.ugc.b.c;
import java.io.File;

public final class MusicWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58929a;

    /* renamed from: b  reason: collision with root package name */
    public String f58930b;

    /* renamed from: c  reason: collision with root package name */
    public String f58931c;

    /* renamed from: d  reason: collision with root package name */
    public e f58932d;
    @State

    /* renamed from: e  reason: collision with root package name */
    public int f58933e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f58934f;

    public @interface State {
    }

    MusicWrapper(e eVar) {
        String str;
        this.f58932d = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f58929a, false, 64097, new Class[]{e.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{eVar}, this, f58929a, false, 64097, new Class[]{e.class}, String.class);
        } else {
            if (eVar.getPlayUrl() != null && !CollectionUtils.isEmpty(eVar.getPlayUrl().getUrlList())) {
                this.f58931c = eVar.getPlayUrl().getUrlList().get(0);
            }
            if (c.a().b().endsWith("/")) {
                str = r0 + a.b(this.f58931c);
            } else {
                str = r0 + File.separator + a.b(this.f58931c);
            }
        }
        this.f58930b = str;
        if (b.b(this.f58930b)) {
            this.f58933e = 1;
        } else {
            this.f58933e = 2;
        }
    }
}
