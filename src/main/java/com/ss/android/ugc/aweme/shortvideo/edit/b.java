package com.ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ao.a.d;
import com.ss.android.ugc.aweme.ao.a.e;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.ej;
import dmt.av.video.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class b implements y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67089a;

    public final void a(Activity activity, int i, String str, String str2, String str3, boolean z, String str4, String str5, Function1<? super e, Unit> function1, Function0<Unit> function0) {
        Activity activity2 = activity;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        if (PatchProxy.isSupport(new Object[]{activity2, 110, str6, str7, str8, Byte.valueOf(z ? (byte) 1 : 0), str4, str5, function1, function0}, this, f67089a, false, 76216, new Class[]{Activity.class, Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Function1.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, 110, str6, str7, str8, Byte.valueOf(z), str4, str5, function1, function0}, this, f67089a, false, 76216, new Class[]{Activity.class, Integer.TYPE, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Function1.class, Function0.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        if (ej.a().f67529b.size() > 0) {
            bundle.putString("challenge", ej.a().f67529b.get(0).cid);
        } else if (str8 != null) {
            bundle.putString("challenge", str8);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("first_sticker_music_ids", str6);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("first_sticker_id", str7);
        }
        a.i.a(activity, 110, d.h.a(activity2.getString(C0906R.string.rw), 0, z, bundle, str4, str5), function1, function0);
    }
}
