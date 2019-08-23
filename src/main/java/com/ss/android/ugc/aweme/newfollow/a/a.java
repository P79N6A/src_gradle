package com.ss.android.ugc.aweme.newfollow.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.ui.MusicListActivity;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.live.c;
import com.ss.android.ugc.aweme.utils.ap;
import javax.annotation.Nonnull;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57054a;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.a.a$a  reason: collision with other inner class name */
    public interface C0649a {
        void a();
    }

    public static boolean a(Aweme aweme, User user, Activity activity, String str) {
        String str2;
        Aweme aweme2 = aweme;
        User user2 = user;
        Activity activity2 = activity;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, user2, activity2, str3}, null, f57054a, true, 61142, new Class[]{Aweme.class, User.class, Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2, user2, activity2, str3}, null, f57054a, true, 61142, new Class[]{Aweme.class, User.class, Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme2 == null) {
            return false;
        } else {
            if (b.a(user)) {
                if (TextUtils.equals(str3, "challenge")) {
                    str2 = "challenge";
                } else {
                    str2 = TextUtils.equals(str3, "general_search") ? "general_search" : "homepage_follow";
                }
                c.a aVar = new c.a(activity2, user2);
                aVar.b(str2);
                aVar.c("video_head");
                c.a().a(aVar);
                return true;
            } else if (user2 == null || TextUtils.isEmpty(user.getUid())) {
                return false;
            } else {
                j a2 = j.a("aweme://user/profile/" + user.getUid());
                a2.a("enter_from", str3);
                a2.a("sec_user_id", user.getSecUid());
                if (a(aweme2, str3)) {
                    a2.a("extra_previous_page_position", "content_card_button");
                } else {
                    a2.a("extra_previous_page_position", "main_head");
                }
                h.a().a(activity2, a2.a());
                return true;
            }
        }
    }

    public static boolean a(User user, Activity activity, String str, String str2) {
        User user2 = user;
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{user2, activity2, str3, str4}, null, f57054a, true, 61143, new Class[]{User.class, Activity.class, String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{user2, activity2, str3, str4}, null, f57054a, true, 61143, new Class[]{User.class, Activity.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        c.a aVar = new c.a(activity2, user2);
        aVar.b(str3);
        aVar.c("live_cell");
        aVar.a("live_cell_position", "video_head".equals(str4) ? "card_head" : "card_content");
        aVar.d(user.getRequestId());
        c.a().a(aVar);
        return true;
    }

    private static boolean a(Aweme aweme, String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{aweme, str2}, null, f57054a, true, 61146, new Class[]{Aweme.class, String.class}, Boolean.TYPE)) {
            return aweme.getAuthor() != null && aweme.getAuthor().getFollowStatus() == 0 && "homepage_follow".equals(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, str2}, null, f57054a, true, 61146, new Class[]{Aweme.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public static void a(Activity activity, C0649a aVar) {
        final Activity activity2 = activity;
        final C0649a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2}, null, f57054a, true, 61148, new Class[]{Activity.class, C0649a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aVar2}, null, f57054a, true, 61148, new Class[]{Activity.class, C0649a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.g.a.d();
        if (activity2 != null) {
            if (ap.b(activity)) {
                activity2.startActivityForResult(ContactsActivity.a((Context) activity2, (String) null, false), 1);
                aVar.a();
                return;
            }
            com.bytedance.ies.dmt.ui.d.a.c((Context) activity2, (int) C0906R.string.eh).a();
            ap.a(activity2, (ap.a) new ap.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57055a;

                public final void b() {
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f57055a, false, 61153, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57055a, false, 61153, new Class[0], Void.TYPE);
                        return;
                    }
                    activity2.startActivityForResult(ContactsActivity.a((Context) activity2, (String) null, true), 1);
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                }
            });
        }
    }

    public static void a(Fragment fragment, C0649a aVar) {
        final Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2, null}, null, f57054a, true, 61149, new Class[]{Fragment.class, C0649a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment2, null}, null, f57054a, true, 61149, new Class[]{Fragment.class, C0649a.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.g.a.d();
        if (fragment2 != null) {
            final FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                if (ap.b(activity)) {
                    fragment2.startActivityForResult(ContactsActivity.a((Context) activity, (String) null, false), 1);
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c((Context) activity, (int) C0906R.string.eh).a();
                ap.a((Activity) activity, (ap.a) new ap.a(null) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f57058a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f57058a, false, 61154, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f57058a, false, 61154, new Class[0], Void.TYPE);
                            return;
                        }
                        fragment2.startActivityForResult(ContactsActivity.a((Context) activity, (String) null, true), 1);
                        if (null != null) {
                            null.a();
                        }
                    }
                });
            }
        }
    }

    public static boolean b(View view, View view2, Aweme aweme) {
        Aweme aweme2;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme}, null, f57054a, true, 61151, new Class[]{View.class, View.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, view2, aweme}, null, f57054a, true, 61151, new Class[]{View.class, View.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (com.ss.android.g.a.a()) {
            return a(view, view2, aweme);
        } else {
            if (aweme == null) {
                return false;
            }
            if (aweme.getAwemeType() == 13) {
                aweme2 = aweme.getForwardItem();
            } else {
                aweme2 = aweme;
            }
            Context context = view.getContext();
            if (context == null || aweme2 == null || aweme2.getMusic() == null || !aweme2.getMusic().isOriginMusic()) {
                return false;
            }
            MusicListActivity.a(context, "860", context.getString(C0906R.string.bkm), 1);
            return true;
        }
    }

    public static boolean a(Activity activity, com.ss.android.ugc.aweme.newfollow.e.a aVar, String str) {
        Activity activity2 = activity;
        com.ss.android.ugc.aweme.newfollow.e.a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, aVar2, str2}, null, f57054a, true, 61152, new Class[]{Activity.class, com.ss.android.ugc.aweme.newfollow.e.a.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, aVar2, str2}, null, f57054a, true, 61152, new Class[]{Activity.class, com.ss.android.ugc.aweme.newfollow.e.a.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (aVar2 == null || TextUtils.isEmpty(aVar2.g) || activity2 == null) {
            return false;
        } else {
            Intent intent = new Intent(activity2, CrossPlatformActivity.class);
            if ("general_search".equals(str2)) {
                intent.putExtra("hide_more", false);
                intent.putExtra("enter_from", "search");
                intent.putExtra(PushConstants.TITLE, " ");
                intent.putExtra("bundle_user_webview_title", false);
                intent.putExtra("group_id", aVar2.f57098d);
            }
            intent.setData(Uri.parse(aVar2.g));
            activity2.startActivity(intent);
            return true;
        }
    }

    public static boolean a(View view, View view2, Aweme aweme) {
        Aweme aweme2;
        String str;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme}, null, f57054a, true, 61150, new Class[]{View.class, View.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, view2, aweme}, null, f57054a, true, 61150, new Class[]{View.class, View.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null) {
            return false;
        } else {
            if (aweme.getAwemeType() == 13) {
                aweme2 = aweme.getForwardItem();
            } else {
                aweme2 = aweme;
            }
            if (aweme2 == null || aweme2.getMusic() == null) {
                return false;
            }
            Context context = view.getContext();
            h a2 = h.a();
            Activity activity = (Activity) context;
            j a3 = j.a("aweme://music/detail/" + aweme2.getMusic().getMid());
            if (!TextUtils.isEmpty(aweme2.getAid())) {
                str = aweme2.getAid();
            } else {
                str = "";
            }
            a2.a(activity, a3.a("aweme_id", str).a());
            return true;
        }
    }

    public static boolean b(Aweme aweme, User user, Activity activity, String str) {
        Aweme aweme2 = aweme;
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, user, activity2, str2}, null, f57054a, true, 61144, new Class[]{Aweme.class, User.class, Activity.class, String.class}, Boolean.TYPE)) {
            Object[] objArr = {aweme2, user, activity2, str2};
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, f57054a, true, 61144, new Class[]{Aweme.class, User.class, Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        } else {
            j a2 = j.a("aweme://user/profile/" + user.getUid());
            a2.a("enter_from", str2);
            a2.a("sec_user_id", user.getSecUid());
            if (a(aweme2, str2)) {
                a2.a("extra_previous_page_position", "content_card_button");
            } else {
                a2.a("extra_previous_page_position", "main_head");
            }
            h.a().a(activity2, a2.a());
            return true;
        }
    }

    public static boolean a(View view, TextExtraStruct textExtraStruct, View view2, @Nonnull Aweme aweme, String str) {
        if (PatchProxy.isSupport(new Object[]{view, textExtraStruct, view2, aweme, str}, null, f57054a, true, 61140, new Class[]{View.class, TextExtraStruct.class, View.class, Aweme.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, textExtraStruct, view2, aweme, str}, null, f57054a, true, 61140, new Class[]{View.class, TextExtraStruct.class, View.class, Aweme.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (view == null || view2 == null || textExtraStruct == null) {
            return false;
        } else {
            if (textExtraStruct.getType() == 1) {
                r.a(textExtraStruct);
                ChallengeDetailActivity.a(view.getContext(), aweme.getAid(), textExtraStruct.getHashTagName(), str, 0, true);
            } else {
                h.a().a((Activity) view2.getContext(), j.a("aweme://user/profile/" + textExtraStruct.getUserId()).a("sec_user_id", textExtraStruct.getSecUid()).a("profile_from", "video_at").a("video_id", aweme.getAid()).a("profile_enterprise_type", aweme.getEnterpriseType()).a());
            }
            return true;
        }
    }
}
