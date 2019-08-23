package com.ss.android.ugc.aweme.di;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.language.I18nManagerServiceImpl;
import dagger.internal.c;
import dagger.internal.e;

public final class r implements c<I18nManagerService> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41464a;

    /* renamed from: b  reason: collision with root package name */
    static final r f41465b = new r();

    public final /* synthetic */ Object get() {
        Object obj;
        if (PatchProxy.isSupport(new Object[0], this, f41464a, false, 35256, new Class[0], I18nManagerService.class)) {
            return (I18nManagerService) PatchProxy.accessDispatch(new Object[0], this, f41464a, false, 35256, new Class[0], I18nManagerService.class);
        } else if (PatchProxy.isSupport(new Object[0], null, f41464a, true, 35257, new Class[0], I18nManagerService.class)) {
            return (I18nManagerService) PatchProxy.accessDispatch(new Object[0], null, f41464a, true, 35257, new Class[0], I18nManagerService.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], null, f41464a, true, 35258, new Class[0], I18nManagerService.class)) {
                return (I18nManagerService) PatchProxy.accessDispatch(new Object[0], null, f41464a, true, 35258, new Class[0], I18nManagerService.class);
            }
            if (PatchProxy.isSupport(new Object[0], null, b.f41427a, true, 35177, new Class[0], I18nManagerService.class)) {
                obj = (I18nManagerService) PatchProxy.accessDispatch(new Object[0], null, b.f41427a, true, 35177, new Class[0], I18nManagerService.class);
            } else {
                obj = new I18nManagerServiceImpl();
            }
            return (I18nManagerService) e.a(obj, "Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
