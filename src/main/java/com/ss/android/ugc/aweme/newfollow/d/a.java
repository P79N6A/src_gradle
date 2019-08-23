package com.ss.android.ugc.aweme.newfollow.d;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import com.ss.android.ugc.aweme.newfollow.b.d;
import com.ss.android.ugc.aweme.q.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57088a;

    /* renamed from: b  reason: collision with root package name */
    public NoticeView f57089b;

    /* renamed from: c  reason: collision with root package name */
    public d f57090c;

    /* renamed from: d  reason: collision with root package name */
    private Context f57091d = this.f57089b.getContext();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57088a, false, 61176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57088a, false, 61176, new Class[0], Void.TYPE);
            return;
        }
        c.a(this.f57091d, "follow_tab_info", 0).edit().putLong("last_guide_close_time", System.currentTimeMillis()).apply();
    }

    public final void a(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57088a, false, 61174, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57088a, false, 61174, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z && this.f57089b != null) {
            this.f57089b.setVisibility(8);
        } else if (this.f57091d != null && this.f57089b != null) {
            if (PatchProxy.isSupport(new Object[0], this, f57088a, false, 61175, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57088a, false, 61175, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                long j = 2592000000L;
                if (((Long) SharePrefCache.inst().getFollowNoticeCloseTime().c()).longValue() > 0) {
                    j = ((Long) SharePrefCache.inst().getFollowNoticeCloseTime().c()).longValue();
                }
                if (System.currentTimeMillis() - c.a(this.f57091d, "follow_tab_info", 0).getLong("last_guide_close_time", 0) <= j) {
                    z2 = false;
                }
            }
            if (z2) {
                this.f57089b.setVisibility(0);
                com.ss.android.ugc.aweme.newfollow.g.a.c("contact_alert_show");
            } else {
                this.f57089b.setVisibility(8);
            }
            this.f57089b.setOnInternalClickListener(new NoticeView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57092a;

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f57092a, false, 61178, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57092a, false, 61178, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.a();
                    a.this.f57089b.setVisibility(8);
                    com.ss.android.ugc.aweme.newfollow.g.a.c("contact_alert_close");
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f57092a, false, 61177, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57092a, false, 61177, new Class[0], Void.TYPE);
                        return;
                    }
                    if (a.this.f57090c != null) {
                        a.this.f57090c.a();
                        a.this.a();
                        a.this.f57089b.setVisibility(8);
                        com.ss.android.ugc.aweme.newfollow.g.a.c("contact_alert_click");
                    }
                }
            });
        }
    }

    public a(NoticeView noticeView) {
        this.f57089b = noticeView;
        this.f57089b.setVisibility(8);
        if (PatchProxy.isSupport(new Object[0], this, f57088a, false, 61173, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57088a, false, 61173, new Class[0], Void.TYPE);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f57091d.getText(C0906R.string.af1));
        spannableStringBuilder.append(" \n");
        SpannableString spannableString = new SpannableString(this.f57091d.getString(C0906R.string.aez));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(this.f57091d, C0906R.color.zn));
        int length = spannableString.length();
        if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 33}, null, b.f57094a, true, 61179, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 33};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, b.f57094a, true, 61179, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            spannableString.setSpan(foregroundColorSpan, 0, length, 33);
        }
        spannableStringBuilder.append(spannableString);
        this.f57089b.setTitleText((CharSequence) spannableStringBuilder);
    }
}
