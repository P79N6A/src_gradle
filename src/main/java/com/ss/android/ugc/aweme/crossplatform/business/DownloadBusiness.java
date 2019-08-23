package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.b.c;
import com.ss.android.download.api.b.d;
import com.ss.android.download.api.c.e;
import com.ss.android.downloadad.api.a.a;
import com.ss.android.downloadlib.h;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.sdk.activity.a.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import java.util.Map;
import org.json.JSONObject;

public class DownloadBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40740a;

    /* renamed from: b  reason: collision with root package name */
    public String f40741b;

    /* renamed from: c  reason: collision with root package name */
    b f40742c = new b();

    @Keep
    DownloadBusiness(@NonNull d dVar) {
        super(dVar);
    }

    public final void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f40740a, false, 34254, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f40740a, false, 34254, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(C0906R.id.bt);
        if (this.i.f40806b.f40800b > 0) {
            if (this.i.f40806b.f40803e && this.f40742c != null && !TextUtils.isEmpty(this.f40742c.f30645f)) {
                h.a((Context) activity).a(this.f40742c.f30645f, frameLayout.hashCode());
            }
            h.a((Context) activity).b().a(this.i.f40806b.f40800b, frameLayout.hashCode());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Activity activity, a aVar) {
        if (!this.i.f40806b.f40803e || this.f40742c == null) {
            if (h.a((Context) activity).b().b(this.i.f40806b.f40800b)) {
                h.a((Context) activity).b().a(this.i.f40806b.f40800b);
            }
            return;
        }
        h.a((Context) activity).a(this.f40742c.f30645f, 2, (com.ss.android.download.api.b.b) b.a(this.f40742c.g), (com.ss.android.download.api.b.a) aVar);
    }

    public final void a(Activity activity, com.ss.android.ugc.aweme.crossplatform.view.h hVar) {
        final Activity activity2 = activity;
        final com.ss.android.ugc.aweme.crossplatform.view.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{activity2, hVar2}, this, f40740a, false, 34253, new Class[]{Activity.class, com.ss.android.ugc.aweme.crossplatform.view.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, hVar2}, this, f40740a, false, 34253, new Class[]{Activity.class, com.ss.android.ugc.aweme.crossplatform.view.h.class}, Void.TYPE);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) activity2.findViewById(C0906R.id.bt);
        final DmtTextView dmtTextView = (DmtTextView) activity2.findViewById(C0906R.id.bv);
        if (!this.i.f40806b.f40803e || TextUtils.isEmpty(this.i.f40806b.f40804f) || !this.i.f40806b.o || !BaseAppData.a().m() || com.ss.android.g.a.a()) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
        }
        this.f40742c.a(this.i.f40805a.f40795c);
        a b2 = b.b(this.f40742c);
        com.ss.android.downloadad.api.a.b a2 = b.a(this.f40742c.g);
        AnonymousClass1 r6 = new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40743a;

            /* renamed from: f  reason: collision with root package name */
            private int f40748f;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f40743a, false, 34261, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40743a, false, 34261, new Class[0], Void.TYPE);
                    return;
                }
                dmtTextView.setText(activity2.getResources().getString(C0906R.string.a53));
                dmtTextView.setBackgroundResource(2130838570);
            }

            private boolean a(int i) {
                if (i - this.f40748f < 20 && (this.f40748f != 0 || i < 3)) {
                    return false;
                }
                this.f40748f = i;
                return true;
            }

            public final void b(e eVar) {
                if (PatchProxy.isSupport(new Object[]{eVar}, this, f40743a, false, 34266, new Class[]{e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar}, this, f40743a, false, 34266, new Class[]{e.class}, Void.TYPE);
                    return;
                }
                dmtTextView.setText(activity2.getResources().getString(C0906R.string.a55));
                dmtTextView.setBackgroundResource(2130838570);
                if (!TextUtils.isEmpty(DownloadBusiness.this.f40741b)) {
                    hVar2.a().b(DownloadBusiness.this.f40741b);
                }
            }

            public final void c(e eVar) {
                if (PatchProxy.isSupport(new Object[]{eVar}, this, f40743a, false, 34267, new Class[]{e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar}, this, f40743a, false, 34267, new Class[]{e.class}, Void.TYPE);
                    return;
                }
                dmtTextView.setText(activity2.getResources().getString(C0906R.string.a54));
                dmtTextView.setBackgroundResource(2130838570);
                dmtTextView.setTextColor(activity2.getResources().getColor(C0906R.color.jl));
                if (!TextUtils.isEmpty(DownloadBusiness.this.f40741b)) {
                    hVar2.a().b(DownloadBusiness.this.f40741b);
                }
            }

            public final void a(e eVar) {
                if (PatchProxy.isSupport(new Object[]{eVar}, this, f40743a, false, 34265, new Class[]{e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar}, this, f40743a, false, 34265, new Class[]{e.class}, Void.TYPE);
                    return;
                }
                dmtTextView.setText(activity2.getResources().getString(C0906R.string.a57));
                dmtTextView.setBackgroundResource(2130838569);
            }

            public final void a(@NonNull c cVar, @Nullable com.ss.android.download.api.b.a aVar) {
                if (PatchProxy.isSupport(new Object[]{cVar, aVar}, this, f40743a, false, 34262, new Class[]{c.class, com.ss.android.download.api.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar, aVar}, this, f40743a, false, 34262, new Class[]{c.class, com.ss.android.download.api.b.a.class}, Void.TYPE);
                    return;
                }
                if (!TextUtils.isEmpty(DownloadBusiness.this.f40741b)) {
                    hVar2.a();
                    hVar2.a().a(DownloadBusiness.this.f40741b);
                }
            }

            public final void b(e eVar, int i) {
                if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f40743a, false, 34264, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f40743a, false, 34264, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dmtTextView.setText(activity2.getResources().getString(C0906R.string.a5a));
                dmtTextView.setBackgroundResource(2130838570);
                if (!TextUtils.isEmpty(DownloadBusiness.this.f40741b) && a(i)) {
                    hVar2.a().a(DownloadBusiness.this.f40741b, i);
                }
            }

            public final void a(e eVar, int i) {
                if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, this, f40743a, false, 34263, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, this, f40743a, false, 34263, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                dmtTextView.setBackgroundResource(2130838570);
                dmtTextView.setText(activity2.getString(C0906R.string.a7x, new Object[]{Integer.valueOf(i)}));
                if (!TextUtils.isEmpty(DownloadBusiness.this.f40741b) && a(i)) {
                    hVar2.a().a(DownloadBusiness.this.f40741b, i);
                }
            }
        };
        frameLayout.setOnClickListener(new e(this, activity2, b2));
        if (this.i.f40806b.f40803e && this.f40742c != null) {
            h.a((Context) activity).a(activity2, frameLayout.hashCode(), (d) r6, (c) b.a(this.f40742c));
        }
        if (h.a((Context) activity).b().b(this.i.f40806b.f40800b)) {
            h.a((Context) activity).b().a(this.i.f40806b.f40800b, this.i.f40806b.j, r6, frameLayout.hashCode());
        }
        SingleWebView b3 = hVar.b();
        f fVar = new f(this, hVar, activity, a2, b2, r6, frameLayout);
        b3.setDownloadListener(fVar);
    }

    private static void a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f40740a, true, 34255, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f40740a, true, 34255, new Class[]{String.class, String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            r.a(str4, (Map) com.ss.android.ugc.aweme.app.d.d.a().a(PushConstants.WEB_URL, str5).a("referer", str6).f34114b);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.crossplatform.view.h hVar, Activity activity, com.ss.android.downloadad.api.a.b bVar, a aVar, d dVar, FrameLayout frameLayout, String str, String str2, String str3) {
        boolean z;
        Activity activity2 = activity;
        com.ss.android.downloadad.api.a.b bVar2 = bVar;
        a aVar2 = aVar;
        String str4 = str;
        String url = hVar.b().getUrl();
        if (this.i.f40806b.f40800b > 0 || StringUtils.isEmpty(url) || BaseAppData.a().d(url)) {
            JSONObject a2 = com.ss.android.sdk.activity.e.a((Context) activity, this.i.f40806b.f40800b, this.i.f40806b.j, str, url, hVar.b().getUrl());
            if (this.i.f40806b.m || BaseAppData.a().b(str4)) {
                z = true;
            } else {
                z = false;
            }
            if (this.i.f40806b.f40800b > 0) {
                this.f40741b = str4;
                if (!this.i.f40806b.f40803e) {
                    h.a((Context) activity).b().a(activity, str2, z, b.a(this.i.f40806b.n, this.i.f40805a.f40798f, this.i.f40806b.j, this.i.f40806b.g, str, str2, str3, a2, this.i.f40806b.t), dVar, frameLayout.hashCode());
                } else if (!z) {
                    new AlertDialog.Builder(activity2).setTitle((CharSequence) this.f40742c.f30644e).setMessage((CharSequence) activity.getResources().getString(C0906R.string.fe)).setPositiveButton((CharSequence) activity.getResources().getString(C0906R.string.b4_), (DialogInterface.OnClickListener) new g(this, activity2, bVar2, aVar2)).setNegativeButton((CharSequence) activity.getResources().getString(C0906R.string.b49), h.f40787b).show();
                } else {
                    h.a((Context) activity).a(this.f40742c.f30645f, 2, (com.ss.android.download.api.b.b) bVar2, (com.ss.android.download.api.b.a) aVar2);
                }
            } else {
                a("webview_download_start", str4, url);
                com.ss.android.sdk.activity.e.a(activity, str, str2, str3, a2, z, new i(hVar, str4));
            }
        } else {
            com.ss.android.sdk.activity.e.a(activity2, str4, url);
            a("webview_download_banned", str4, url);
        }
    }
}
