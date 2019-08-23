package com.ss.android.ugc.aweme.notification.adapter;

import android.content.Intent;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.a.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.presenter.i;
import com.ss.android.ugc.aweme.u.s;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57946a;

    /* renamed from: b  reason: collision with root package name */
    private final FansNotificationHolder f57947b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57948c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f57949d;

    b(FansNotificationHolder fansNotificationHolder, int i, boolean z) {
        this.f57947b = fansNotificationHolder;
        this.f57948c = i;
        this.f57949d = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f57946a, false, 63015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57946a, false, 63015, new Class[0], Void.TYPE);
            return;
        }
        FansNotificationHolder fansNotificationHolder = this.f57947b;
        int i = this.f57948c;
        boolean z = this.f57949d;
        fansNotificationHolder.f57890d.a(new i.a().a(fansNotificationHolder.f57891e.user.getUid()).b(fansNotificationHolder.f57891e.user.getSecUid()).a(i).a());
        r.onEvent(new MobClick().setEventName(z ? "follow_cancel" : "follow").setLabelName("message").setValue(fansNotificationHolder.f57891e.user.getUid()));
        if (!z) {
            new s().b("message").f("message").g("other_places").c("follow_button").h(fansNotificationHolder.f57891e.user.getUid()).i("").e();
            Intent intent = fansNotificationHolder.f57892f.getIntent();
            if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                String stringExtra = intent.getStringExtra("rule_id");
                if (!TextUtils.isEmpty(stringExtra)) {
                    new s("follow_from_push").b("message").h(fansNotificationHolder.f57891e.user.getUid()).f("previous_page").g("other_places").q(stringExtra).e();
                }
            }
        }
        fansNotificationHolder.a(i, fansNotificationHolder.f57891e.user.getFollowerStatus());
        bg.a(new d(i, fansNotificationHolder.f57891e.user));
    }
}
