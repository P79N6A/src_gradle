package com.ss.android.ugc.aweme.app.e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.al;
import com.ss.android.ugc.aweme.app.j;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.notification.NotificationDetailActivity;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34163a;

    /* access modifiers changed from: package-private */
    public final String a() {
        return "notification";
    }

    /* access modifiers changed from: package-private */
    public final Intent a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f34163a, false, 23525, new Class[]{Activity.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{activity}, this, f34163a, false, 23525, new Class[]{Activity.class}, Intent.class);
        }
        String queryParameter = this.f34159c.getQueryParameter("gd_label");
        Intent intent = new Intent(activity, NotificationDetailActivity.class);
        if (TextUtils.equals("click_push_commentat", queryParameter) || TextUtils.equals("click_push_videoat", queryParameter)) {
            intent.putExtra("from_where", 12);
        } else if (TextUtils.equals("click_push_comment", queryParameter) || TextUtils.equals("click_push_replycomment", queryParameter) || TextUtils.equals("click_push_vote", queryParameter)) {
            intent.putExtra("from_where", 12);
        } else if (TextUtils.equals("click_push_forward", queryParameter) || TextUtils.equals("click_push_forward_and_forward", queryParameter) || TextUtils.equals("click_push_forward_comment", queryParameter) || TextUtils.equals("click_push_forwardreplycomment", queryParameter) || TextUtils.equals("click_push_forward_at", queryParameter)) {
            intent.putExtra("from_where", 12);
            if (j.a().f34191b) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            }
        } else if (TextUtils.equals("click_push_follow", queryParameter)) {
            Intent a2 = NotificationDetailActivity.a((Context) activity, 0);
            a2.putExtra("push", true);
            a("message");
            if (!d.a().isLogin()) {
                return al.a(activity, a2);
            }
            return a2;
        } else if (TextUtils.equals("click_push_digg", queryParameter) || TextUtils.equals("click_push_digg_comment", queryParameter) || TextUtils.equals("click_push_forward_digg", queryParameter)) {
            intent.putExtra("from_where", 1);
            if (j.a().f34191b) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            }
        } else if (TextUtils.equals("click_push_ops", queryParameter)) {
            intent.putExtra("from_where", 5);
            if (j.a().f34191b) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            }
        } else {
            intent = new Intent(activity, MainActivity.class);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        }
        a("message");
        intent.putExtra("enter_from", "push");
        if (!d.a().isLogin()) {
            return al.a(activity, intent);
        }
        return intent;
    }
}
