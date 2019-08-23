package com.ss.android.ugc.aweme.friends.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.friends.model.SummonFriendSearchModel;

public class l extends b<SummonFriendSearchModel, f> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48881a;

    public l() {
        a(new SummonFriendSearchModel());
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f48881a, false, 46710, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48881a, false, 46710, new Class[0], Boolean.TYPE)).booleanValue();
        }
        SummonFriendList data = ((SummonFriendSearchModel) i()).getData();
        if (data == null) {
            return false;
        }
        return data.hasMore;
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f48881a, false, 46708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48881a, false, 46708, new Class[0], Void.TYPE);
            return;
        }
        super.n_();
        if (this.f2979f != null && ((SummonFriendSearchModel) this.f2978e).mIsRefresh) {
            ((f) this.f2979f).b();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48881a, false, 46709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48881a, false, 46709, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        SummonFriendList data = ((SummonFriendSearchModel) i()).getData();
        if (!(data == null || this.f2979f == null)) {
            ((f) this.f2979f).a(data.items);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f48881a, false, 46707, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f48881a, false, 46707, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2979f != null) {
            ((f) this.f2979f).a(exc);
        }
    }
}
