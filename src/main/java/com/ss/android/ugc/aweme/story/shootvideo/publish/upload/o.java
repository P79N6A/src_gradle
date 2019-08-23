package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import com.google.common.util.concurrent.e;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.util.LinkedHashMap;

public final /* synthetic */ class o implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73767a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoCreation f73768b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashMap f73769c;

    o(VideoCreation videoCreation, LinkedHashMap linkedHashMap) {
        this.f73768b = videoCreation;
        this.f73769c = linkedHashMap;
    }

    public final q a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73767a, false, 85508, new Class[]{Object.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{obj}, this, f73767a, false, 85508, new Class[]{Object.class}, q.class);
        }
        VideoCreation videoCreation = this.f73768b;
        return a.z.a(videoCreation.materialId, this.f73769c);
    }
}
