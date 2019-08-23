package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceUserListViewModel;
import com.ss.android.ugc.aweme.face2face.widget.Face2FaceAvatarWidget;

public final /* synthetic */ class i implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43939a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendFragment f43940b;

    i(Face2FaceAddFriendFragment face2FaceAddFriendFragment) {
        this.f43940b = face2FaceAddFriendFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f43939a, false, 39091, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f43939a, false, 39091, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Face2FaceAddFriendFragment face2FaceAddFriendFragment = this.f43940b;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            if (!bool.booleanValue()) {
                ((Face2FaceUserListViewModel) ViewModelProviders.of(face2FaceAddFriendFragment.getActivity()).get(Face2FaceUserListViewModel.class)).a(az.a());
            }
            Face2FaceAvatarWidget face2FaceAvatarWidget = face2FaceAddFriendFragment.f43892d;
            boolean booleanValue = bool.booleanValue();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, face2FaceAvatarWidget, Face2FaceAvatarWidget.f44124a, false, 39298, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                Face2FaceAvatarWidget face2FaceAvatarWidget2 = face2FaceAvatarWidget;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, face2FaceAvatarWidget2, Face2FaceAvatarWidget.f44124a, false, 39298, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (booleanValue) {
                face2FaceAvatarWidget.f44127d.setText(C0906R.string.ace);
            } else {
                face2FaceAvatarWidget.f44127d.setText(C0906R.string.acx);
            }
        }
    }
}
