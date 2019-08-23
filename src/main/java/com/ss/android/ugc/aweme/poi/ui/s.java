package com.ss.android.ugc.aweme.poi.ui;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.g.a;
import com.bytedance.ies.geckoclient.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.e.h;
import com.ss.android.ugc.aweme.poi.e.o;
import java.io.File;

public final class s extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60891a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f60892b = "";

    /* renamed from: c  reason: collision with root package name */
    private boolean f60893c;

    /* renamed from: d  reason: collision with root package name */
    private c f60894d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteImageView f60895e;

    /* renamed from: f  reason: collision with root package name */
    private View f60896f;

    /* access modifiers changed from: package-private */
    public void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f60891a, false, 66104, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f60891a, false, 66104, new Class[]{String.class}, Void.TYPE);
            return;
        }
        c cVar = this.f60894d;
        d a2 = d.a().a("enter_from", "poi_page").a("previous_page", this.f60894d.getPreviousPage()).a("enter_method", str).a("poi_id", this.f60894d.getPoiId());
        if (this.f60893c) {
            str2 = "reserve";
        } else {
            str2 = "queue";
        }
        h.a(cVar, "poi_puscene_success", a2.a("content_type", str2).a("poi_posititon", ""));
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60891a, false, 66102, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60891a, false, 66102, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.jv);
        setCanceledOnTouchOutside(false);
        this.f60896f = findViewById(C0906R.id.a4k);
        this.f60895e = (RemoteImageView) findViewById(C0906R.id.a4j);
        findViewById(C0906R.id.a4l).setOnClickListener(new t(this));
        if (PatchProxy.isSupport(new Object[0], this, f60891a, false, 66103, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60891a, false, 66103, new Class[0], Void.TYPE);
        } else {
            f fVar = (f) ServiceManager.get().getService(f.class);
            if (fVar != null) {
                com.bytedance.ies.geckoclient.model.d a2 = fVar.a("poi_resource");
                a a3 = a.a(BaseAppData.a().o().a());
                File file = new File(a3.f20692a + File.separator + a2.f20792d);
                if (file.exists() && file.listFiles() != null && file.listFiles().length != 0) {
                    File[] listFiles = file.listFiles();
                    int length = listFiles.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        File file2 = listFiles[i];
                        if ("imagePOIOrder.png".equalsIgnoreCase(file2.getName())) {
                            com.ss.android.ugc.aweme.base.c.a(this.f60895e, Uri.fromFile(file2).toString());
                            a("imagePOIOrder.png", true);
                            break;
                        }
                        i++;
                    }
                } else {
                    this.f60896f.setVisibility(8);
                    a("imagePOIOrder.png", false);
                }
            }
            this.f60896f.setVisibility(8);
            a("imagePOIOrder.png", false);
        }
        a("show");
    }

    private void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f60891a, false, 66105, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f60891a, false, 66105, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
        a2.a("action", str2);
        a2.a("success", Integer.valueOf(z ? 1 : 0));
        o.a("resource_preload_error_rate", a2.b());
    }

    public s(Activity activity, boolean z, c cVar) {
        super(activity, C0906R.style.su);
        this.f60893c = z;
        this.f60894d = cVar;
    }
}
