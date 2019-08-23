package com.ss.android.ugc.aweme.friends.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.model.SummonFriendRecentModel;
import java.util.List;

public final class k extends b<SummonFriendRecentModel, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48874a;

    /* renamed from: b  reason: collision with root package name */
    List<SummonFriendItem> f48875b;

    public k() {
        a(new SummonFriendRecentModel());
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48874a, false, 46704, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48874a, false, 46704, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48876a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f48876a, false, 46705, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f48876a, false, 46705, new Class[0], Void.TYPE);
                    return;
                }
                if (z2) {
                    k.this.f48875b = ((SummonFriendRecentModel) k.this.i()).refreshData();
                } else {
                    k.this.f48875b = ((SummonFriendRecentModel) k.this.i()).loadMore();
                }
                a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48879a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f48879a, false, 46706, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48879a, false, 46706, new Class[0], Void.TYPE);
                        } else if (z2) {
                            ((c) k.this.f2979f).a(k.this.f48875b, ((SummonFriendRecentModel) k.this.i()).isHasMore());
                        } else {
                            ((c) k.this.f2979f).b(k.this.f48875b, ((SummonFriendRecentModel) k.this.i()).isHasMore());
                        }
                    }
                });
            }
        });
    }
}
