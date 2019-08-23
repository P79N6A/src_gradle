package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.schema.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17180a;

    public final boolean canHandle(Uri uri) {
        if (!PatchProxy.isSupport(new Object[]{uri}, this, f17180a, false, 13163, new Class[]{Uri.class}, Boolean.TYPE)) {
            return TextUtils.equals("sign", uri.getHost());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri}, this, f17180a, false, 13163, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
    }

    public final boolean handle(Context context, Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, this, f17180a, false, 13164, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2}, this, f17180a, false, 13164, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        }
        TTLiveSDKContext.getHostService().i().b(context2, uri2.getQueryParameter(PushConstants.WEB_URL));
        return true;
    }
}
