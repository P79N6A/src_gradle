package com.ss.android.ugc.aweme.face2face.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.ui.d;
import com.ss.android.ugc.aweme.face2face.viewmodel.Face2FaceInviteStatusViewModel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

public final class c implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44063a;

    /* renamed from: b  reason: collision with root package name */
    private FragmentActivity f44064b;

    private Face2FaceInviteStatusViewModel b() {
        if (!PatchProxy.isSupport(new Object[0], this, f44063a, false, 39212, new Class[0], Face2FaceInviteStatusViewModel.class)) {
            return (Face2FaceInviteStatusViewModel) ViewModelProviders.of(this.f44064b).get(Face2FaceInviteStatusViewModel.class);
        }
        return (Face2FaceInviteStatusViewModel) PatchProxy.accessDispatch(new Object[0], this, f44063a, false, 39212, new Class[0], Face2FaceInviteStatusViewModel.class);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44063a, false, 39209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44063a, false, 39209, new Class[0], Void.TYPE);
            return;
        }
        b().f44110a += 2;
    }

    public c(@NonNull FragmentActivity fragmentActivity) {
        this.f44064b = fragmentActivity;
    }

    public final void a(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f44063a, false, 39210, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f44063a, false, 39210, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        b().a();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f44063a, false, 39211, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f44063a, false, 39211, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        b().a();
    }
}
