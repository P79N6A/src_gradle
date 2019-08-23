package com.ss.android.ugc.aweme.challenge;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.g.a;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.views.c;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.utils.dc;
import java.util.Map;
import java.util.regex.Matcher;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f35345b;

    /* renamed from: c  reason: collision with root package name */
    String f35346c;

    /* renamed from: d  reason: collision with root package name */
    String f35347d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f35348e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f35349f = true;

    public final SpannableString a(SpannableString spannableString) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{spannableString}, this, f35345b, false, 25768, new Class[]{SpannableString.class}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{spannableString}, this, f35345b, false, 25768, new Class[]{SpannableString.class}, SpannableString.class);
        }
        String spannableString2 = spannableString.toString();
        Matcher matcher = dc.f75732a.matcher(spannableString2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            final String charSequence = spannableString2.subSequence(start, end).toString();
            if (e.a(charSequence)) {
                this.f35348e = true;
                c.a(spannableString, new StyleSpan(0), start, end, 17);
                if (a.b()) {
                    i = C0906R.color.s_;
                } else {
                    i = C0906R.color.a1s;
                }
                int a2 = o.a(i);
                if (a.b()) {
                    i2 = C0906R.color.u_;
                } else {
                    i2 = C0906R.color.a77;
                }
                c.a(spannableString, new c(a2, o.a(i2)) {

                    /* renamed from: c  reason: collision with root package name */
                    public static ChangeQuickRedirect f35350c;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f35350c, false, 25770, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f35350c, false, 25770, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        b bVar = b.this;
                        String str = charSequence;
                        if (PatchProxy.isSupport(new Object[]{str}, bVar, b.f35345b, false, 25769, new Class[]{String.class}, Void.TYPE)) {
                            Object[] objArr = {str};
                            b bVar2 = bVar;
                            ChangeQuickRedirect changeQuickRedirect = b.f35345b;
                            PatchProxy.accessDispatch(objArr, bVar2, changeQuickRedirect, false, 25769, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        r.a("click_tag_link", (Map) d.a().a("tag_id", bVar.f35346c).f34114b);
                        Activity e2 = p.a().e();
                        if (e2 != null) {
                            Intent intent = new Intent(e2, CrossPlatformActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("show_load_dialog", false);
                            bundle.putBoolean("hide_nav_bar", false);
                            bundle.putString(PushConstants.TITLE, "#" + bVar.f35347d);
                            intent.putExtras(bundle);
                            intent.setData(Uri.parse(str));
                            e2.startActivity(intent);
                        }
                    }
                }, start, end, 17);
            }
        }
        if (this.f35349f) {
            return this.f35312a.a(spannableString);
        }
        return spannableString;
    }

    public b(String str, String str2, boolean z) {
        this.f35347d = str2;
        this.f35346c = str;
    }
}
