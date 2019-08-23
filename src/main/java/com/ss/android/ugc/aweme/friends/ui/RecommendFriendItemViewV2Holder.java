package com.ss.android.ugc.aweme.friends.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;

public class RecommendFriendItemViewV2Holder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49331a;

    /* renamed from: b  reason: collision with root package name */
    private ak f49332b;

    public final User a() {
        if (PatchProxy.isSupport(new Object[0], this, f49331a, false, 47422, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], this, f49331a, false, 47422, new Class[0], User.class);
        } else if (this.f49332b == null) {
            return null;
        } else {
            return this.f49332b.getData();
        }
    }

    public RecommendFriendItemViewV2Holder(View view) {
        super(view);
        this.f49332b = (ak) view;
    }

    public final void a(User user, int i, boolean z, int i2) {
        User user2 = user;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f49331a, false, 47420, new Class[]{User.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(i), Byte.valueOf(z), Integer.valueOf(i2)}, this, f49331a, false, 47420, new Class[]{User.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f49332b.setData(user2);
        if (!z || i3 == 5 || i3 == 6) {
            this.f49332b.setNewFriendRecommendMask(false);
        } else {
            this.f49332b.setNewFriendRecommendMask(true);
        }
        this.f49332b.setPositionInApiList(i);
    }
}
