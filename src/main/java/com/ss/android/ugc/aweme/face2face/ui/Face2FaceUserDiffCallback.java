package com.ss.android.ugc.aweme.face2face.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.face2face.net.f;
import java.util.List;

public class Face2FaceUserDiffCallback extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44052a;

    /* renamed from: b  reason: collision with root package name */
    private List<f> f44053b;

    /* renamed from: c  reason: collision with root package name */
    private List<f> f44054c;

    public int getNewListSize() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44052a, false, 39261, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44052a, false, 39261, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f44054c != null) {
            i = this.f44054c.size();
        }
        return i;
    }

    public int getOldListSize() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44052a, false, 39260, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44052a, false, 39260, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f44053b != null) {
            i = this.f44053b.size();
        }
        return i;
    }

    public Face2FaceUserDiffCallback(List<f> list, List<f> list2) {
        this.f44053b = list;
        this.f44054c = list2;
    }

    public boolean areContentsTheSame(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44052a, false, 39263, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return this.f44054c.get(i2).equals(this.f44053b.get(i));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44052a, false, 39263, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean areItemsTheSame(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44052a, false, 39262, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return TextUtils.equals(this.f44054c.get(i2).getUser().getNickname(), this.f44053b.get(i).getUser().getNickname());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44052a, false, 39262, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    @Nullable
    public Object getChangePayload(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44052a, false, 39264, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f44052a, false, 39264, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class);
        }
        f fVar = this.f44054c.get(i2);
        f fVar2 = this.f44053b.get(i);
        Bundle bundle = new Bundle();
        if (fVar.face2FaceInviteStatus != fVar2.face2FaceInviteStatus) {
            bundle.putInt("face_to_face_invite_status", fVar.face2FaceInviteStatus);
        }
        if (fVar.getUser().getFollowStatus() != fVar2.getUser().getFollowStatus()) {
            bundle.putInt("face_to_face_follow_status", fVar.getUser().getFollowStatus());
        }
        return bundle;
    }
}
