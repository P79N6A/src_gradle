package com.ss.android.ugc.aweme.face2face.ui.viewholder;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.face2face.Face2Face;
import com.ss.android.ugc.aweme.face2face.net.f;
import com.ss.android.ugc.aweme.face2face.ui.Face2FaceFriendsAdapter;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

public class Face2FaceUserViewHolder extends Face2FaceBaseViewHolder {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f44095e;

    /* renamed from: f  reason: collision with root package name */
    private FollowUserBtn f44096f;
    private FragmentActivity g = ((FragmentActivity) v.c((View) this.f44096f));

    public Face2FaceUserViewHolder(@NonNull View view, Face2FaceFriendsAdapter.a aVar) {
        super(view, aVar);
        this.f44096f = (FollowUserBtn) ViewCompat.requireViewById(view, C0906R.id.avv);
    }

    public final void a(f fVar, int i) {
        if (PatchProxy.isSupport(new Object[]{fVar, Integer.valueOf(i)}, this, f44095e, false, 39268, new Class[]{f.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, Integer.valueOf(i)}, this, f44095e, false, 39268, new Class[]{f.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(fVar, i);
        Face2Face.a(this.g, this.g, this.f44091c.getUser(), this.f44096f);
    }

    public final void a(f fVar, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{fVar, bundle}, this, f44095e, false, 39269, new Class[]{f.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar, bundle}, this, f44095e, false, 39269, new Class[]{f.class, Bundle.class}, Void.TYPE);
            return;
        }
        this.f44091c = fVar;
        for (String str : bundle.keySet()) {
            char c2 = 65535;
            if (str.hashCode() == -1888307776 && str.equals("face_to_face_follow_status")) {
                c2 = 0;
            }
            if (c2 == 0) {
                FollowStatus followStatus = new FollowStatus();
                followStatus.userId = this.f44091c.getUser().getUid();
                followStatus.followStatus = this.f44091c.getUser().getFollowStatus();
                com.ss.android.ugc.aweme.follow.f.a().b().postValue(followStatus);
            }
        }
    }
}
