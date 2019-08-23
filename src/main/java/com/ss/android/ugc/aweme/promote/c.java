package com.ss.android.ugc.aweme.promote;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63240a;

    public final void a(Context context, String str, String str2) {
        String str3;
        String str4;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2}, this, f63240a, false, 70173, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str, str2}, this, f63240a, false, 70173, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
        } else if (context2 != null) {
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            if (TextUtils.isEmpty(str)) {
                str3 = "https://api.tiktokv.com/magic/runtime/?id=1079";
            } else {
                str3 = str;
            }
            intent.setData(Uri.parse(str3));
            intent.putExtra("hide_nav_bar", true);
            if (TextUtils.isEmpty(str2)) {
                str4 = context.getResources().getString(C0906R.string.bso);
            } else {
                str4 = str2;
            }
            intent.putExtra(PushConstants.TITLE, str4);
            context2.startActivity(intent);
        }
    }
}
