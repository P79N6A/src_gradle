package com.ss.android.ugc.aweme.face2face.a;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.face2face.Face2FaceInviteDialogFragment;
import com.ss.android.ugc.aweme.face2face.net.b;
import java.util.Map;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43915a;

    /* renamed from: b  reason: collision with root package name */
    private FragmentActivity f43916b;

    d(FragmentActivity fragmentActivity) {
        this.f43916b = fragmentActivity;
    }

    public final void a(@NonNull b bVar, @NonNull i iVar) {
        Face2FaceInviteDialogFragment face2FaceInviteDialogFragment;
        b bVar2 = bVar;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, iVar2}, this, f43915a, false, 39158, new Class[]{b.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, iVar2}, this, f43915a, false, 39158, new Class[]{b.class, i.class}, Void.TYPE);
        } else if (bVar.getFroInviteUser().followStatus != 0) {
            iVar.a();
        } else {
            if (PatchProxy.isSupport(new Object[]{bVar2}, null, Face2FaceInviteDialogFragment.f43897a, true, 39104, new Class[]{b.class}, Face2FaceInviteDialogFragment.class)) {
                face2FaceInviteDialogFragment = (Face2FaceInviteDialogFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, null, Face2FaceInviteDialogFragment.f43897a, true, 39104, new Class[]{b.class}, Face2FaceInviteDialogFragment.class);
            } else {
                Bundle bundle = new Bundle();
                bundle.putSerializable("face_to_face_user", bVar2);
                Face2FaceInviteDialogFragment face2FaceInviteDialogFragment2 = new Face2FaceInviteDialogFragment();
                face2FaceInviteDialogFragment2.setArguments(bundle);
                face2FaceInviteDialogFragment = face2FaceInviteDialogFragment2;
            }
            face2FaceInviteDialogFragment.f43899c = new e(iVar2);
            face2FaceInviteDialogFragment.show(this.f43916b.getSupportFragmentManager(), "Face2FaceInviteDialogFragment");
            r.a("note_invite_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("event_type", "spring_festival").a("enter_from", "face_to_face").a("to_user_id", bVar.getFroInviteUser().uId).f34114b);
        }
    }
}
