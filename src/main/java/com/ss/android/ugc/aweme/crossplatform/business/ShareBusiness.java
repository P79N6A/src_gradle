package com.ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.web.QRCodeWebViewDialog;

public class ShareBusiness extends AbsShareBusiness {
    public static ChangeQuickRedirect k;

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 34278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, k, false, 34278, new Class[0], Void.TYPE);
            return;
        }
        a(0, null);
    }

    @Keep
    public ShareBusiness(@NonNull d dVar) {
        super(dVar);
    }

    public final /* bridge */ /* synthetic */ void a(WebView webView) {
        super.a(webView);
    }

    public final /* bridge */ /* synthetic */ void b(WebView webView) {
        super.b(webView);
    }

    public final /* bridge */ /* synthetic */ void a(String str) {
        super.a(str);
    }

    public final boolean b(String str) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{str}, this, k, false, 34279, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, k, false, 34279, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (cg.a(str, 5)) {
            if (this.f40720b != null) {
                this.f40720b.dismiss();
            }
            return false;
        } else {
            if (b.b().b(i.a().getContext(), "enable_share_qrcode_h5_as_image") == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f40722d.contains("qrcode") && a() && (TextUtils.equals(str, "qq") || TextUtils.equals(str, "weixin") || TextUtils.equals(str, "weixin_moments"))) {
                a(2, str);
                return false;
            } else if (!z || !this.f40722d.contains("qrcode") || !a() || !TextUtils.equals(str, "qzone")) {
                return true;
            } else {
                a(1, str);
                return false;
            }
        }
    }

    private void a(int i, String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, k, false, 34277, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, k, false, 34277, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        IShareService.ShareStruct shareStruct = this.f40721c;
        if (TextUtils.isEmpty(this.f40721c.description) || TextUtils.equals(this.f40721c.description, " ")) {
            str2 = this.f40721c.title;
        } else {
            str2 = this.f40721c.description;
        }
        shareStruct.description = str2;
        if (this.j instanceof Activity) {
            QRCodeWebViewDialog qRCodeWebViewDialog = new QRCodeWebViewDialog((Activity) this.j, i, this.f40721c.url, this.f40721c.thumbUrl, this.f40721c.description, str);
            qRCodeWebViewDialog.show();
        }
    }
}
