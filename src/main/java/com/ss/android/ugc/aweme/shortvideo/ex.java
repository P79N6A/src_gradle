package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.k;
import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;

public final /* synthetic */ class ex implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67625a;

    /* renamed from: b  reason: collision with root package name */
    static final s f67626b = new ex();

    private ex() {
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f67625a, false, 74517, new Class[0], Object.class)) {
            return k.fromNullable(ServiceManager.get().getService(IAVStoryService.class));
        }
        return PatchProxy.accessDispatch(new Object[0], this, f67625a, false, 74517, new Class[0], Object.class);
    }
}
