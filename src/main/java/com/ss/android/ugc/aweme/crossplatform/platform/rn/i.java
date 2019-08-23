package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import android.text.TextUtils;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements ReactInstanceManager.ReactInstanceEventListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40869a;

    /* renamed from: b  reason: collision with root package name */
    private final e f40870b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40871c;

    /* renamed from: d  reason: collision with root package name */
    private final ReactInstanceManager f40872d;

    i(e eVar, String str, ReactInstanceManager reactInstanceManager) {
        this.f40870b = eVar;
        this.f40871c = str;
        this.f40872d = reactInstanceManager;
    }

    public final void onReactContextInitialized(ReactContext reactContext) {
        if (PatchProxy.isSupport(new Object[]{reactContext}, this, f40869a, false, 34357, new Class[]{ReactContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{reactContext}, this, f40869a, false, 34357, new Class[]{ReactContext.class}, Void.TYPE);
            return;
        }
        e eVar = this.f40870b;
        String str = this.f40871c;
        ReactInstanceManager reactInstanceManager = this.f40872d;
        try {
            if (!eVar.f40846d) {
                eVar.f40845c.c();
                if (!TextUtils.isEmpty(str)) {
                    eVar.a(reactContext, str);
                }
                if (eVar.f40844b != null) {
                    eVar.f40844b.a(reactInstanceManager);
                }
            }
        } catch (Exception e2) {
            if (eVar.f40844b != null) {
                eVar.f40844b.a(e2);
            }
        }
    }
}
