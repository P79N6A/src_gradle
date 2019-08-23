package com.ss.android.newmedia.ui.webview;

import a.g;
import a.i;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30385a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f30386b;

    c(Context context) {
        this.f30386b = context;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f30385a, false, 18884, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f30385a, false, 18884, new Class[]{i.class}, Object.class);
        }
        Context context = this.f30386b;
        if (((Boolean) iVar.e()).booleanValue()) {
            Toast makeText = Toast.makeText(context, C0906R.string.clh, 1);
            if (PatchProxy.isSupport(new Object[]{makeText}, null, e.f30388a, true, 18887, new Class[]{Toast.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{makeText}, null, e.f30388a, true, 18887, new Class[]{Toast.class}, Void.TYPE);
            } else {
                if (Build.VERSION.SDK_INT == 25) {
                    eq.a(makeText);
                }
                makeText.show();
            }
        }
        return null;
    }
}
