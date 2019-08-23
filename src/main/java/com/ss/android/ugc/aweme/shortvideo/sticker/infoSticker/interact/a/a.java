package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.IPOIService;
import com.ss.android.ugc.aweme.poi.search.POISearchDialog;
import com.ss.android.ugc.aweme.utils.permission.a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69830a;

    /* renamed from: c  reason: collision with root package name */
    private static a f69831c;

    /* renamed from: b  reason: collision with root package name */
    public IPOIService.a f69832b;

    /* renamed from: d  reason: collision with root package name */
    private long f69833d;

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f69830a, true, 79782, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f69830a, true, 79782, new Class[0], a.class);
        }
        if (f69831c == null) {
            synchronized (a.class) {
                f69831c = new a();
            }
        }
        return f69831c;
    }

    public final a a(IPOIService.a aVar) {
        this.f69832b = aVar;
        return this;
    }

    public final void a(FragmentActivity fragmentActivity) {
        final FragmentActivity fragmentActivity2 = fragmentActivity;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f69830a, false, 79783, new Class[]{FragmentActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f69830a, false, 79783, new Class[]{FragmentActivity.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.utils.permission.a.a((Context) fragmentActivity2, af.f2626c)) {
            com.ss.android.ugc.aweme.utils.permission.a.b(fragmentActivity2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, af.f2626c, new a.C0792a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69834a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f69834a, false, 79789, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f69834a, false, 79789, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.a((Activity) fragmentActivity2);
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f69834a, false, 79790, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f69834a, false, 79790, new Class[0], Void.TYPE);
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b((Context) fragmentActivity2, (int) C0906R.string.j4).a();
                }
            });
        } else {
            a((Activity) fragmentActivity);
        }
    }

    public final void a(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f69830a, false, 79784, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f69830a, false, 79784, new Class[]{Activity.class}, Void.TYPE);
        } else if (System.currentTimeMillis() - this.f69833d >= 1000) {
            this.f69833d = System.currentTimeMillis();
            if (this.f69832b != null) {
                this.f69832b.a();
            }
            if (activity != null && !activity.isFinishing()) {
                IPOIService iPOIService = (IPOIService) ServiceManager.get().getService(IPOIService.class);
                if (iPOIService != null) {
                    Dialog pOISearchDialog = iPOIService.getPOISearchDialog(activity, new Bundle(), new b(this, activity));
                    pOISearchDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f69837a;

                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f69837a, false, 79791, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f69837a, false, 79791, new Class[]{DialogInterface.class}, Void.TYPE);
                                return;
                            }
                            if (a.this.f69832b != null) {
                                a.this.f69832b.b();
                            }
                        }
                    });
                    if (pOISearchDialog instanceof POISearchDialog) {
                        ((POISearchDialog) pOISearchDialog).a(true);
                    }
                    pOISearchDialog.show();
                }
            }
        }
    }
}
