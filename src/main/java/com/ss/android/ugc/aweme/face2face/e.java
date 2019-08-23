package com.ss.android.ugc.aweme.face2face;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43930a;

    /* renamed from: b  reason: collision with root package name */
    private final Face2FaceAddFriendActivity f43931b;

    e(Face2FaceAddFriendActivity face2FaceAddFriendActivity) {
        this.f43931b = face2FaceAddFriendActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43930a, false, 39078, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f43930a, false, 39078, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Face2FaceAddFriendActivity face2FaceAddFriendActivity = this.f43931b;
        if (PatchProxy.isSupport(new Object[]{face2FaceAddFriendActivity, 65281}, null, l.f43945a, true, 39102, new Class[]{FragmentActivity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{face2FaceAddFriendActivity, 65281}, null, l.f43945a, true, 39102, new Class[]{FragmentActivity.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        face2FaceAddFriendActivity.startActivityForResult(intent, 65281);
    }
}
