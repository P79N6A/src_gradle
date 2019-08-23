package com.ss.android.ugc.aweme.share.c;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.c.a.c;

public class j extends g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64906a;

    /* renamed from: b  reason: collision with root package name */
    protected c f64907b;

    /* renamed from: c  reason: collision with root package name */
    protected String f64908c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64906a, false, 73769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64906a, false, 73769, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        if (PatchProxy.isSupport(new Object[0], this, f64906a, false, 73770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64906a, false, 73770, new Class[0], Void.TYPE);
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) this.f64888e.getSystemService("clipboard");
        ClipData newPlainText = ClipData.newPlainText(this.f64908c, this.f64908c);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
    }

    public j(Activity activity, String str, c cVar, String str2) {
        super(activity, str);
        this.f64907b = cVar;
        this.f64908c = str2 != null ? str2.replace("\\r\\n", "\r\n") : str2;
    }
}
