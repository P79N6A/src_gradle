package com.ss.android.ugc.aweme.im.sdk.module.session.a;

import com.meituan.robust.ChangeQuickRedirect;

public abstract class d extends com.ss.android.ugc.aweme.im.service.session.a {

    /* renamed from: c  reason: collision with root package name */
    public a f51917c = a.SUCCESS;

    public enum a {
        SENDING,
        FAILED,
        SUCCESS;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public final void d() {
    }

    public String O_() {
        return this.h;
    }

    public static a a(int i) {
        a aVar = a.SUCCESS;
        if (i != 5) {
            switch (i) {
                case 0:
                case 1:
                    return a.SENDING;
                case 2:
                    break;
                case 3:
                    return a.FAILED;
                default:
                    return aVar;
            }
        }
        return a.SUCCESS;
    }
}
