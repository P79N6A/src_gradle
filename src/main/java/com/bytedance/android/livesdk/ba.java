package com.bytedance.android.livesdk;

import com.bytedance.android.live.base.model.user.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ba implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9096a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9097b;

    ba(StartLiveFragmentD startLiveFragmentD) {
        this.f9097b = startLiveFragmentD;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9096a, false, 2850, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9096a, false, 2850, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentD startLiveFragmentD = this.f9097b;
        User user = (User) obj;
        startLiveFragmentD.z.setAvatarLarge(user.getAvatarLarge());
        startLiveFragmentD.z.setAvatarMedium(user.getAvatarMedium());
        startLiveFragmentD.z.setAvatarThumb(user.getAvatarThumb());
        startLiveFragmentD.z.setWithCommercePermission(user.isWithCommercePermission());
    }
}
