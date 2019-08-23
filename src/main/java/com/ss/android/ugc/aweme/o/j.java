package com.ss.android.ugc.aweme.o;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.a;
import com.ss.android.ugc.aweme.shortvideo.at;

public final /* synthetic */ class j implements com.ss.android.ugc.aweme.port.in.j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58291a;

    /* renamed from: b  reason: collision with root package name */
    static final com.ss.android.ugc.aweme.port.in.j f58292b = new j();

    private j() {
    }

    public final a a(at atVar) {
        at atVar2 = atVar;
        if (PatchProxy.isSupport(new Object[]{atVar2}, this, f58291a, false, 54540, new Class[]{at.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{atVar2}, this, f58291a, false, 54540, new Class[]{at.class}, a.class);
        }
        if (atVar2 instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) atVar2;
            if (createAwemeResponse.aweme != null) {
                a aVar = new a();
                aVar.aid = createAwemeResponse.aweme.getAid();
                return aVar;
            }
        }
        return null;
    }
}
