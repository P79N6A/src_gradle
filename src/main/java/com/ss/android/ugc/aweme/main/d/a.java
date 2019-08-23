package com.ss.android.ugc.aweme.main.d;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.ss.android.ugc.aweme.u.aa;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54716a;

    public static String a(int i) {
        return i == 1 ? "homepage_follow" : i == 0 ? "homepage_hot" : i == 7 ? "homepage_fresh" : "homepage_hot";
    }

    public static String b(int i) {
        return i == 1 ? "enter_homepage_follow" : i == 0 ? "enter_homepage_hot" : i == 7 ? "enter_homepage_fresh" : "enter_homepage_hot";
    }

    public static d a(Aweme aweme) {
        if (!PatchProxy.isSupport(new Object[]{aweme}, null, f54716a, true, 57983, new Class[]{Aweme.class}, d.class)) {
            return d.a().a("group_id", aa.m(aweme)).a("author_id", aa.a(aweme));
        }
        return (d) PatchProxy.accessDispatch(new Object[]{aweme}, null, f54716a, true, 57983, new Class[]{Aweme.class}, d.class);
    }

    public static void b(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f54716a, true, 57986, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f54716a, true, 57986, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (z) {
            str = "confirm";
        } else {
            str = "cancel";
        }
        r.a("follow_cancel_toast", (Map) a2.a("final_status", str).f34114b);
    }

    public static void a(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f54716a, true, 57984, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f54716a, true, 57984, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", "homepage_hot").a("notice_type", "yellow_dot");
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        r.a("homepage_social_notice", (Map) a2.a("action_type", str).f34114b);
    }

    public static void a(Aweme aweme, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, str2}, null, f54716a, true, 57987, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2}, null, f54716a, true, 57987, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        r.a("follow_cancel", (Map) d.a().a("enter_from", "homepage_follow").a("enter_method", str2).a("group_id", aweme.getAid()).a("log_pb", ai.a().a(aweme.getRequestId())).a("to_user_id", aweme.getAuthorUid()).a("author_id", aweme.getAuthorUid()).f34114b);
    }

    public static void a(boolean z, String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str4, str5}, null, f54716a, true, 57985, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str4, str5}, null, f54716a, true, 57985, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        d a2 = d.a().a("enter_from", str4).a("notice_type", str5);
        if (z) {
            str3 = "show";
        } else {
            str3 = "click";
        }
        r.a("homepage_follow_notice", (Map) a2.a("action_type", str3).f34114b);
    }

    public static void a(FragmentActivity fragmentActivity, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f54716a, true, 57981, new Class[]{FragmentActivity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {fragmentActivity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f54716a, true, 57981, new Class[]{FragmentActivity.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Aweme aweme = null;
        if (fragmentActivity != null) {
            aweme = AwemeChangeCallBack.a(fragmentActivity);
        }
        d a2 = a(aweme);
        a2.a("previous_page", a(i2));
        if (i3 == 1) {
            a2.a("enter_method", "click_follow_tab");
            if (z) {
                a2.a("notice_type", "yellow_dot");
            } else if (z2) {
                a2.a("notice_type", "number_dot");
            } else if (z3) {
                a2.a("notice_type", "live");
            }
        } else if (i3 == 0) {
            a2.a("enter_method", "click_hot_tab");
        } else if (i3 == 7) {
            if (MainPageExperimentHelper.c()) {
                a2.a("enter_method", "click_fresh_tab");
            } else {
                a2.a("enter_method", "click_fresh_tab");
            }
        }
        r.a(b(i), (Map) a2.f34114b);
    }
}
