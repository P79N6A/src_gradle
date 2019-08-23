package com.ss.android.ugc.aweme.friends.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.friends.model.ContactFriendModel;
import java.util.List;

public final class a extends b<ContactFriendModel> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48846a;

    public final void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f48846a, false, 46674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48846a, false, 46674, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null) {
            int i = ((ContactFriendModel) this.f2978e).mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        if (((ContactFriendModel) this.f2978e).isDataEmpty()) {
                            ((c) this.f2979f).y_();
                            return;
                        } else if (this.f2979f instanceof e) {
                            ((e) this.f2979f).a(((ContactFriendModel) this.f2978e).getItems(), ((ContactFriendModel) this.f2978e).isHasMore(), ((ContactFriendModel) this.f2978e).getRegisteredCount());
                            return;
                        } else {
                            ((c) this.f2979f).a(((ContactFriendModel) this.f2978e).getItems(), ((ContactFriendModel) this.f2978e).isHasMore());
                            return;
                        }
                    case 2:
                        ((c) this.f2979f).c(((ContactFriendModel) this.f2978e).getItems(), !((ContactFriendModel) this.f2978e).isNewDataEmpty());
                        break;
                }
                return;
            }
            c cVar = (c) this.f2979f;
            List items = ((ContactFriendModel) this.f2978e).getItems();
            if (((ContactFriendModel) this.f2978e).isHasMore() && !((ContactFriendModel) this.f2978e).isNewDataEmpty()) {
                z = true;
            }
            cVar.b(items, z);
        }
    }
}
