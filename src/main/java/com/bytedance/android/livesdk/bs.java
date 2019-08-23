package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.model.d;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.j.a;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.j.c.k;
import com.bytedance.android.livesdk.widget.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bs implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9653a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9654b;

    bs(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9654b = startLiveFragmentDefault;
    }

    public final void accept(Object obj) {
        CharSequence charSequence;
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9653a, false, 2942, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9653a, false, 2942, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f9654b;
        d dVar = (d) obj;
        d.a aVar = ((com.bytedance.android.livesdk.chatroom.model.d) dVar.f7871b).f11103a;
        if (aVar != null) {
            if (aVar.f11106c) {
                charSequence = ac.a((int) C0906R.string.d0e);
                if (charSequence == null) {
                    return;
                }
            } else {
                int i = (int) (((aVar.f11104a - (dVar.f7872c.now / 1000)) + ((long) ((com.bytedance.android.livesdk.chatroom.model.d) dVar.f7871b).f11103a.f11105b)) / 60);
                if (i < 60) {
                    str = ac.a(C0906R.plurals.q, i, Integer.valueOf(i));
                } else if (i < 1440) {
                    i /= 60;
                    str = ac.a(C0906R.plurals.p, i, Integer.valueOf(i));
                } else {
                    i /= 1440;
                    str = ac.a(C0906R.plurals.o, i, Integer.valueOf(i));
                }
                String valueOf = String.valueOf(i);
                if (str != null) {
                    String[] split = str.split(valueOf);
                    SpannableString spannableString = new SpannableString(str);
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#ff2200"));
                    int length = split[0].length();
                    int length2 = split[0].length() + valueOf.length();
                    if (PatchProxy.isSupport(new Object[]{spannableString, foregroundColorSpan, Integer.valueOf(length), Integer.valueOf(length2), 33}, null, cz.f13669a, true, 2991, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr = {spannableString, foregroundColorSpan, Integer.valueOf(length), Integer.valueOf(length2), 33};
                        Object[] objArr2 = objArr;
                        PatchProxy.accessDispatch(objArr2, null, cz.f13669a, true, 2991, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        spannableString.setSpan(foregroundColorSpan, length, length2, 33);
                    }
                    charSequence = spannableString;
                }
            }
            new m.a(startLiveFragmentDefault.getContext()).c(charSequence).b(0, (int) C0906R.string.d0f, (DialogInterface.OnClickListener) new cr(startLiveFragmentDefault, Uri.parse((String) LiveConfigSettingKeys.LIVE_BLOCKED_DETAIL_URL.a()).buildUpon().appendQueryParameter("id", String.valueOf(aVar.f11107d)).build().toString())).a().show();
            a.a().a("pm_live_take_banpopup_show", new j().b("live_take").f("show").a("live_take_page"), new k());
        }
    }
}
