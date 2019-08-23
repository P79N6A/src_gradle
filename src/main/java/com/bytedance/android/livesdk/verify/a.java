package com.bytedance.android.livesdk.verify;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.verify.model.GetCertificationEntranceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17686a;

    /* renamed from: b  reason: collision with root package name */
    private final VerifyActivityProxy f17687b;

    a(VerifyActivityProxy verifyActivityProxy) {
        this.f17687b = verifyActivityProxy;
    }

    public final void accept(Object obj) {
        boolean z;
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17686a, false, 13834, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17686a, false, 13834, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VerifyActivityProxy verifyActivityProxy = this.f17687b;
        d dVar = (d) obj;
        if (dVar != null) {
            verifyActivityProxy.f17684c = ((GetCertificationEntranceResponse) dVar.f7871b).zhima_entrance;
            verifyActivityProxy.f17685d = ((GetCertificationEntranceResponse) dVar.f7871b).manual_entrance;
            if (PatchProxy.isSupport(new Object[0], verifyActivityProxy, VerifyActivityProxy.f17682a, false, 13830, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], verifyActivityProxy, VerifyActivityProxy.f17682a, false, 13830, new Class[0], Void.TYPE);
                return;
            }
            Bundle bundle = new Bundle();
            FragmentActivity fragmentActivity = verifyActivityProxy.f1870f;
            if (PatchProxy.isSupport(new Object[]{fragmentActivity}, null, d.f17692a, true, 13841, new Class[]{Context.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, d.f17692a, true, 13841, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else {
                PackageManager packageManager = fragmentActivity.getPackageManager();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("alipays://"));
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
                z = queryIntentActivities != null && queryIntentActivities.size() > 0;
            }
            if (!z || TextUtils.isEmpty(verifyActivityProxy.f17684c)) {
                bundle.putString(PushConstants.WEB_URL, verifyActivityProxy.f17685d);
            } else {
                Uri.Builder buildUpon = Uri.parse(verifyActivityProxy.f17684c).buildUpon();
                if (PatchProxy.isSupport(new Object[0], verifyActivityProxy, VerifyActivityProxy.f17682a, false, 13831, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], verifyActivityProxy, VerifyActivityProxy.f17682a, false, 13831, new Class[0], String.class);
                } else {
                    str = TTLiveSDKContext.getHostService().o().a();
                }
                bundle.putString(PushConstants.WEB_URL, buildUpon.appendQueryParameter("return_url", str).build().toString());
            }
            bundle.putBoolean("hide_nav_bar", true);
            verifyActivityProxy.f17683b.setArguments(bundle);
            FragmentTransaction beginTransaction = verifyActivityProxy.f1870f.getSupportFragmentManager().beginTransaction();
            beginTransaction.replace(C0906R.id.yx, verifyActivityProxy.f17683b);
            beginTransaction.commitAllowingStateLoss();
        }
    }
}
