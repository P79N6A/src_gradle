package com.ss.android.ugc.aweme.app.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.h.q;
import com.ss.android.ugc.aweme.poi.e.p;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/PoiMainService;", "Lcom/ss/android/ugc/aweme/main/service/IPoiMainService;", "()V", "isSupportPoiStickers", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class v implements q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34289a;

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f34289a, false, 23644, new Class[0], Boolean.TYPE)) {
            return p.c();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f34289a, false, 23644, new Class[0], Boolean.TYPE)).booleanValue();
    }
}
