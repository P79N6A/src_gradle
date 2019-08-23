package com.ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.view.ViewStub;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.g.a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40687a;

    /* renamed from: b  reason: collision with root package name */
    Activity f40688b;

    /* renamed from: c  reason: collision with root package name */
    f f40689c;

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40687a, false, 34122, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40687a, false, 34122, new Class[0], Void.TYPE);
        } else if (a.a() && this.f40689c.getCrossPlatformParams().f40808d.s && ((Boolean) SharePrefCache.inst().getDebugWebBar().c()).booleanValue()) {
            ViewStub viewStub = (ViewStub) this.f40688b.findViewById(C0906R.id.d03);
            viewStub.inflate();
            this.f40688b.findViewById(C0906R.id.pw).setOnLongClickListener(new c(this, viewStub));
            EditText editText = (EditText) this.f40688b.findViewById(C0906R.id.a2s);
            String str = "";
            try {
                str = URLDecoder.decode(this.f40689c.getCrossPlatformParams().f40805a.f40796d, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
            editText.setText(str);
            this.f40688b.findViewById(C0906R.id.pw).setOnClickListener(new d(this, editText));
        }
    }

    b(Activity activity, f fVar) {
        this.f40688b = activity;
        this.f40689c = fVar;
    }
}
