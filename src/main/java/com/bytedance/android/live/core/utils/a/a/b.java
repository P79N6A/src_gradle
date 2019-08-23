package com.bytedance.android.live.core.utils.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.a.c;
import com.bytedance.android.live.core.utils.ah;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8219a;

    public final boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f8219a, false, 1408, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f8219a, false, 1408, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            String a2 = ah.a("ro.hmct.notch_height");
            String a3 = ah.a("ro.hmct.notch_width");
            if (TextUtils.equals(a2.trim(), PushConstants.PUSH_TYPE_NOTIFY) || TextUtils.isEmpty(a2.trim()) || TextUtils.equals(a3.trim(), PushConstants.PUSH_TYPE_NOTIFY) || TextUtils.isEmpty(a3.trim())) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
