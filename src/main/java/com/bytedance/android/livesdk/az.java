package com.bytedance.android.livesdk;

import com.bytedance.android.live.base.model.user.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;

public final /* synthetic */ class az implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9078a;

    /* renamed from: b  reason: collision with root package name */
    static final Predicate f9079b = new az();

    private az() {
    }

    public final boolean test(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9078a, false, 2849, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f9078a, false, 2849, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        User user = (User) obj;
        return (user == null || user.getAvatarMedium() == null) ? false : true;
    }
}
