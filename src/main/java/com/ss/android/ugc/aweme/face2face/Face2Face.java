package com.ss.android.ugc.aweme.face2face;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.face2face.ui.c;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public final class Face2Face {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43888a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Face2FaceFollowType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Face2FaceInviteStatus {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Face2FaceNoticeSubType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Face2FaceType {
    }

    public static void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, null, f43888a, true, 39054, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, null, f43888a, true, 39054, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
        } else if (context2 != null && !TextUtils.isEmpty(str)) {
            if (PatchProxy.isSupport(new Object[]{context2, str3, str4, "others_homepage", "spring_festival", "face_to_face", "in_app"}, null, UserProfileActivity.f62385b, true, 69118, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {context2, str3, str4, "others_homepage", "spring_festival", "face_to_face", "in_app"};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, UserProfileActivity.f62385b, true, 69118, new Class[]{Context.class, String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            } else if (!(context2 == null || str3 == null || str3.equals(""))) {
                Intent intent = new Intent(context2, UserProfileActivity.class);
                intent.putExtra("enter_from", "others_homepage");
                intent.putExtra("extra_from_event_enter_from", "others_homepage");
                intent.putExtra("uid", str3);
                intent.putExtra("sec_user_id", str4);
                intent.putExtra("extra_from_event_type", "spring_festival");
                intent.putExtra("extra_from_pre_page", "face_to_face");
                intent.putExtra("extra_from_pre_relation_from", "in_app");
                context2.startActivity(intent);
            }
            r.a("enter_personal_detail", (Map) d.a().a("event_type", "spring_festival").a("enter_from", "face_to_face").a("to_user_id", str3).f34114b);
        }
    }

    public static void a(@Nullable FragmentActivity fragmentActivity, @NonNull LifecycleOwner lifecycleOwner, @NonNull User user, @NonNull FollowUserBtn followUserBtn) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        User user2 = user;
        FollowUserBtn followUserBtn2 = followUserBtn;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, lifecycleOwner, user2, followUserBtn2}, null, f43888a, true, 39055, new Class[]{FragmentActivity.class, LifecycleOwner.class, User.class, FollowUserBtn.class}, Void.TYPE)) {
            Object[] objArr = {fragmentActivity2, lifecycleOwner, user2, followUserBtn2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f43888a, true, 39055, new Class[]{FragmentActivity.class, LifecycleOwner.class, User.class, FollowUserBtn.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.face2face.ui.d dVar = new com.ss.android.ugc.aweme.face2face.ui.d(followUserBtn2, new n(user.getUid()));
        if (fragmentActivity2 != null) {
            dVar.f44070f = new c(fragmentActivity2);
        }
        dVar.a(user2);
    }
}
