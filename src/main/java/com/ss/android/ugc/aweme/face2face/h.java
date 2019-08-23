package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.face2face.widget.Face2FaceTitleWidget;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43937a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendFragment f43938b;

    h(Face2FaceAddFriendFragment face2FaceAddFriendFragment) {
        this.f43938b = face2FaceAddFriendFragment;
    }

    public final void onChanged(Object obj) {
        int i;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43937a, false, 39090, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43937a, false, 39090, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Integer num = (Integer) obj;
        Face2FaceTitleWidget face2FaceTitleWidget = this.f43938b.f43890b;
        if (num == null) {
            i = 65281;
        } else {
            i = num.intValue();
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, face2FaceTitleWidget, Face2FaceTitleWidget.f44141a, false, 39326, new Class[]{Integer.TYPE}, Void.TYPE)) {
            Face2FaceTitleWidget face2FaceTitleWidget2 = face2FaceTitleWidget;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, face2FaceTitleWidget2, Face2FaceTitleWidget.f44141a, false, 39326, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i) {
            case 65281:
                face2FaceTitleWidget.f44143c.setTitle((int) C0906R.string.ac8);
                return;
            case 65282:
                face2FaceTitleWidget.f44143c.setTitle((int) C0906R.string.ac9);
                break;
        }
    }
}
