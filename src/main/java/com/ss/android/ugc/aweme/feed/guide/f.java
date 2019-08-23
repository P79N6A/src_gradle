package com.ss.android.ugc.aweme.feed.guide;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity;
import com.ss.android.ugc.aweme.utils.cy;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45410a;

    /* renamed from: b  reason: collision with root package name */
    public NoticeView f45411b;

    /* renamed from: c  reason: collision with root package name */
    public Context f45412c = this.f45411b.getContext();

    public final void a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f45410a, false, 41244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45410a, false, 41244, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f45412c == null || this.f45411b == null)) {
            AbTestManager a2 = AbTestManager.a();
            if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71863, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71863, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                AbTestModel d2 = a2.d();
                if (d2 == null) {
                    z = false;
                } else {
                    z = d2.remindSystemPush;
                }
            }
            if (z) {
                if (!cy.a(this.f45412c)) {
                    if (System.currentTimeMillis() - ((Long) x.a().K().c()).longValue() <= 1296000000 || ((Integer) x.a().L().c()).intValue() > 3) {
                        this.f45411b.setVisibility(8);
                    } else {
                        this.f45411b.setVisibility(0);
                        r.a("notification_setting_alert_show", (Map) d.a().a("enter_from", "message").f34114b);
                    }
                } else {
                    this.f45411b.setVisibility(8);
                }
            }
        }
    }

    public f(NoticeView noticeView) {
        this.f45411b = noticeView;
        this.f45411b.setVisibility(8);
        if (PatchProxy.isSupport(new Object[0], this, f45410a, false, 41245, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45410a, false, 41245, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f45411b == null || this.f45412c == null)) {
            this.f45411b.setOnInternalClickListener(new NoticeView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45413a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f45413a, false, 41248, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45413a, false, 41248, new Class[0], Void.TYPE);
                        return;
                    }
                    f.this.f45411b.setVisibility(8);
                    x.a().K().a(Long.valueOf(System.currentTimeMillis()));
                    x.a().L().a(Integer.valueOf(((Integer) x.a().L().c()).intValue() + 1));
                    r.a("notification_setting_alert_close", (Map) d.a().a("enter_from", "message").f34114b);
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f45413a, false, 41247, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45413a, false, 41247, new Class[0], Void.TYPE);
                        return;
                    }
                    f.this.f45411b.setVisibility(8);
                    f fVar = f.this;
                    Context context = f.this.f45412c;
                    if (PatchProxy.isSupport(new Object[]{context}, fVar, f.f45410a, false, 41246, new Class[]{Context.class}, Void.TYPE)) {
                        f fVar2 = fVar;
                        PatchProxy.accessDispatch(new Object[]{context}, fVar2, f.f45410a, false, 41246, new Class[]{Context.class}, Void.TYPE);
                    } else {
                        context.startActivity(new Intent(context, PushSettingManagerActivity.class));
                    }
                    r.a("notification_setting_alert_click", (Map) d.a().a("enter_from", "message").f34114b);
                }
            });
        }
    }
}
