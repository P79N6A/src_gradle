package com.ss.android.ugc.aweme.feed.share.command;

import a.i;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.share.command.k;
import com.ss.android.ugc.aweme.feed.share.command.l;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.share.a.a;
import com.storage.async.Function;
import com.storage.async.Observable;
import com.storage.async.Schedulers;
import com.storage.async.Subscriber;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.net.TmaRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45966a = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f45967c = "h";

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f45968b = new HashMap();

    public h() {
        this.f45968b.put("share_qq", "024004");
        this.f45968b.put("share_qzone", "024005");
        this.f45968b.put("share_wechat", "024002");
        this.f45968b.put("share_moments", "024003");
    }

    public final boolean a(String str, String str2, int i) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, str2, Integer.valueOf(i)}, this, f45966a, false, 42200, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str3, str2, Integer.valueOf(i)}, this, f45966a, false, 42200, new Class[]{String.class, String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        final IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
        if (!iMiniAppService.isAppBrandSchema(str3)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("token");
        final String queryParameter2 = parse.getQueryParameter("app_id");
        final String queryParameter3 = parse.getQueryParameter("launch_from");
        final String str4 = str;
        AnonymousClass1 r0 = new l.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45969a;

            public final void a(k.b bVar) {
                String str;
                k.b bVar2 = bVar;
                if (PatchProxy.isSupport(new Object[]{bVar2}, this, f45969a, false, 42203, new Class[]{k.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar2}, this, f45969a, false, 42203, new Class[]{k.b.class}, Void.TYPE);
                    return;
                }
                h hVar = h.this;
                String str2 = str4;
                String str3 = queryParameter3;
                if (PatchProxy.isSupport(new Object[]{bVar2, str2, str3}, hVar, h.f45966a, false, 42201, new Class[]{k.b.class, String.class, String.class}, Void.TYPE)) {
                    Object[] objArr = {bVar2, str2, str3};
                    Object[] objArr2 = objArr;
                    h hVar2 = hVar;
                    ChangeQuickRedirect changeQuickRedirect = h.f45966a;
                    PatchProxy.accessDispatch(objArr2, hVar2, changeQuickRedirect, false, 42201, new Class[]{k.b.class, String.class, String.class}, Void.TYPE);
                } else {
                    i.a((Callable<TResult>) new i<TResult>(hVar, bVar2, str2, str3), i.f1052b);
                }
                d a2 = d.a().a("mp_id", queryParameter2).a("position", queryParameter3).a("enter_from", queryParameter3);
                if (iMiniAppService.isMicroAppSchema(str4)) {
                    str = "micro_app";
                } else {
                    str = "micro_game";
                }
                r.a("mp_show", (Map) a2.a("_param_for_special", str).f34114b);
            }
        };
        if (PatchProxy.isSupport(new Object[]{queryParameter, r0}, null, l.f46005a, true, 42249, new Class[]{String.class, l.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{queryParameter, r0}, null, l.f46005a, true, 42249, new Class[]{String.class, l.a.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(queryParameter)) {
            Observable.create((Function<T>) new Function<k>("https://developer.toutiao.com/api/apps/share/decode_token?token=" + queryParameter) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46008a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f46009b;

                public final /* synthetic */ Object fun() {
                    if (!PatchProxy.isSupport(new Object[0], this, f46008a, false, 42252, new Class[0], k.class)) {
                        return k.a(HostDependManager.getInst().doGet(new TmaRequest(this.f46009b, "GET")).getData());
                    }
                    return (k) PatchProxy.accessDispatch(new Object[0], this, f46008a, false, 42252, new Class[0], k.class);
                }

                {
                    this.f46009b = r1;
                }
            }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<k>(r0) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46006a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f46007b;

                public final void onError(@NonNull Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{th}, this, f46006a, false, 42251, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th}, this, f46006a, false, 42251, new Class[]{Throwable.class}, Void.TYPE);
                    }
                }

                {
                    this.f46007b = r1;
                }

                public final /* synthetic */ void onSuccess(@Nullable Object obj) {
                    k kVar = (k) obj;
                    if (PatchProxy.isSupport(new Object[]{kVar}, this, f46006a, false, 42250, new Class[]{k.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{kVar}, this, f46006a, false, 42250, new Class[]{k.class}, Void.TYPE);
                        return;
                    }
                    if (kVar.f45991b != 0) {
                        if (this.f46007b != null) {
                        }
                    } else if (this.f46007b != null) {
                        this.f46007b.a(kVar.f45993d);
                    }
                }
            });
        }
        return true;
    }
}
