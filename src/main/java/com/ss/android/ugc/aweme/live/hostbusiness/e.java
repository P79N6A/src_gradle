package com.ss.android.ugc.aweme.live.hostbusiness;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.android.livesdkapi.c.a;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.web.k;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.Map;
import org.json.JSONObject;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53419a;

    /* renamed from: b  reason: collision with root package name */
    private ILiveDouPlusApi f53420b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53419a, false, 55697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53419a, false, 55697, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.live.a.a(com.ss.android.ugc.aweme.live.a.a.f53188d));
    }

    public final void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f53419a, false, 55696, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f53419a, false, 55696, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f53419a, false, 55699, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f53419a, false, 55699, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        r.a("enter_dou_plus_hot", (Map) d.a().a("enter_from", "navigation_panel").f34114b);
        Intent intent = new Intent(context2, CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://aweme.snssdk.com" + str2));
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", false);
        intent.putExtra("status_bar_color", "FFFFFF");
        intent.putExtra("status_font_dark", true);
        intent.putExtra("bundle_webview_background", context.getResources().getColor(C0906R.color.ao4));
        context2.startActivity(intent);
    }

    public final void a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str, str3}, this, f53419a, false, 55694, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str, str3}, this, f53419a, false, 55694, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        b bVar = new b(context2, k.f76855a + str3);
        bVar.f3433d = true;
        bVar.f3432c = true;
        try {
            bVar.show();
        } catch (Exception e2) {
            Exception exc = e2;
            if (!Logger.debug()) {
                ExceptionMonitor.ensureNotReachHere("DouPlus showDouPlusDialog failed");
            } else {
                Logger.throwException(exc);
            }
        }
    }

    public final void a(String str, long j, String str2, c<com.bytedance.android.live.base.model.c.a> cVar) {
        String str3 = str;
        long j2 = j;
        String str4 = str2;
        c<com.bytedance.android.live.base.model.c.a> cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{str3, new Long(j2), str4, cVar2}, this, f53419a, false, 55695, new Class[]{String.class, Long.TYPE, String.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, new Long(j2), str4, cVar2}, this, f53419a, false, 55695, new Class[]{String.class, Long.TYPE, String.class, c.class}, Void.TYPE);
            return;
        }
        if (this.f53420b == null) {
            this.f53420b = (ILiveDouPlusApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ILiveDouPlusApi.class);
        }
        this.f53420b.douPlusLiveEntry(str3, j2, str4).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new f(cVar2), new g(cVar2));
    }

    public final void a(boolean z, String str, String str2, Map<String, String> map) {
        String str3 = str;
        String str4 = str2;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), str3, str4, map2}, this, f53419a, false, 55698, new Class[]{Boolean.TYPE, String.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), str3, str4, map2}, this, f53419a, false, 55698, new Class[]{Boolean.TYPE, String.class, String.class, Map.class}, Void.TYPE);
        } else if (z) {
            if (map2 != null) {
                map2.put("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            }
            r.onEvent(MobClick.obtain().setEventName(str3).setLabelName(str4).setJsonObject(new JSONObject(map2)));
        } else {
            r.a(str3, (Map) map2);
        }
    }
}
