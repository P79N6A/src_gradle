package com.ss.android.ugc.aweme.profile.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.d.a.a;
import com.ss.android.ugc.aweme.d.a.b;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63131a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f63132b;

    /* renamed from: c  reason: collision with root package name */
    public Context f63133c;

    /* renamed from: d  reason: collision with root package name */
    private NoticeView f63134d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63131a, false, 69775, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63131a, false, 69775, new Class[0], Void.TYPE);
            return;
        }
        this.f63134d.setVisibility(8);
    }

    public c(NoticeView noticeView, Context context) {
        this.f63134d = noticeView;
        this.f63133c = context;
        if (PatchProxy.isSupport(new Object[0], this, f63131a, false, 69774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63131a, false, 69774, new Class[0], Void.TYPE);
            return;
        }
        b c2 = a.a().c();
        if (!a.a().a(true) || c2 == null) {
            this.f63134d.setVisibility(8);
            return;
        }
        this.f63134d.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(c2.f41058b);
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(this.f63133c.getString(C0906R.string.m5));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ContextCompat.getColor(this.f63133c, C0906R.color.zn));
        int length = spannableString.length();
        if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 33}, null, d.f63137a, true, 69778, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {spannableString, foregroundColorSpan, 0, Integer.valueOf(length), 33};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, d.f63137a, true, 69778, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            spannableString.setSpan(foregroundColorSpan, 0, length, 33);
        }
        spannableStringBuilder.append(spannableString);
        this.f63134d.setTitleText((CharSequence) spannableStringBuilder);
        this.f63134d.setOnInternalClickListener(new NoticeView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63135a;

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f63135a, false, 69777, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63135a, false, 69777, new Class[0], Void.TYPE);
                    return;
                }
                c.this.a();
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f63135a, false, 69776, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63135a, false, 69776, new Class[0], Void.TYPE);
                } else if (c.this.f63133c != null) {
                    com.ss.android.ugc.aweme.d.c.b("personal_home");
                    com.ss.android.ugc.aweme.account.c.c().bindMobile((Activity) c.this.f63133c, "personal_home", null, null);
                    c.this.a();
                }
            }
        });
    }
}
