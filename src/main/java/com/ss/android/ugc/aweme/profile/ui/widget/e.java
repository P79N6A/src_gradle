package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.d.a.c;
import com.ss.android.ugc.aweme.discover.ui.NoticeView;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63138a;

    /* renamed from: b  reason: collision with root package name */
    public NoticeView f63139b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f63140c;

    /* renamed from: d  reason: collision with root package name */
    private Context f63141d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63138a, false, 69782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63138a, false, 69782, new Class[0], Void.TYPE);
            return;
        }
        this.f63139b.setVisibility(8);
    }

    private void b() {
        HashMap hashMap;
        HashMap hashMap2;
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f63138a, false, 69781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63138a, false, 69781, new Class[0], Void.TYPE);
            return;
        }
        Gson gson = new Gson();
        try {
            hashMap = (HashMap) new Gson().fromJson((String) x.a().I().c(), new TypeToken<HashMap<String, Integer>>() {
            }.getType());
        } catch (JsonSyntaxException unused) {
            hashMap = null;
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        if (hashMap.containsKey(d.a().getCurUserId())) {
            i = ((Integer) hashMap.get(d.a().getCurUserId())).intValue();
        }
        hashMap.put(d.a().getCurUserId(), Integer.valueOf(i + 1));
        x.a().I().a(gson.toJson((Object) hashMap));
        try {
            hashMap2 = (HashMap) new Gson().fromJson((String) x.a().H().c(), new TypeToken<HashMap<String, Long>>() {
            }.getType());
        } catch (JsonSyntaxException unused2) {
            hashMap2 = null;
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
        }
        hashMap2.put(d.a().getCurUserId(), Long.valueOf(System.currentTimeMillis()));
        x.a().H().a(gson.toJson((Object) hashMap2));
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f63138a, false, 69779, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f63138a, false, 69779, new Class[]{c.class}, Void.TYPE);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (cVar.f41065c == 2) {
            spannableStringBuilder.append(this.f63141d.getString(C0906R.string.dpz, new Object[]{Integer.valueOf((int) cVar.f41064b)}));
        } else if (cVar.f41065c == 1) {
            spannableStringBuilder.append(this.f63141d.getString(C0906R.string.dpy, new Object[]{Integer.valueOf((int) cVar.f41064b)}));
        } else {
            this.f63139b.setVisibility(8);
        }
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(this.f63141d.getString(C0906R.string.ajj));
        f.a(spannableString, new ForegroundColorSpan(ContextCompat.getColor(this.f63141d, C0906R.color.zn)), 0, spannableString.length(), 33);
        spannableStringBuilder.append(spannableString);
        this.f63139b.setTitleText((CharSequence) spannableStringBuilder);
    }

    public e(NoticeView noticeView, Context context, c cVar, View.OnClickListener onClickListener) {
        this.f63139b = noticeView;
        this.f63141d = context;
        this.f63140c = onClickListener;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f63138a, false, 69780, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f63138a, false, 69780, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f63139b.setVisibility(0);
        a(cVar);
        this.f63139b.setOnInternalClickListener(new NoticeView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63142a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f63142a, false, 69783, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63142a, false, 69783, new Class[0], Void.TYPE);
                    return;
                }
                if (e.this.f63140c != null) {
                    e.this.f63140c.onClick(e.this.f63139b);
                }
                e.this.a();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f63142a, false, 69784, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63142a, false, 69784, new Class[0], Void.TYPE);
                    return;
                }
                r.a("close_profile_alert_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
                e.this.a();
            }
        });
        b();
    }
}
