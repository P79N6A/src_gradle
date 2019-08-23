package com.ss.android.ugc.aweme.setting.serverpush.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

public class d extends b<a<BaseResponse>, a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64041a;

    public d() {
        a(new a<BaseResponse>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64042a;

            public final boolean checkParams(Object... objArr) {
                if (objArr.length == 2) {
                    return true;
                }
                return false;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f64042a, false, 72315, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f64042a, false, 72315, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    final String str = objArr[0];
                    final int intValue = objArr[1].intValue();
                    m.a().a(this.mHandler, new Callable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f64044a;

                        public final Object call() throws Exception {
                            if (!PatchProxy.isSupport(new Object[0], this, f64044a, false, 72316, new Class[0], Object.class)) {
                                return PushSettingsApiManager.a(str, intValue);
                            }
                            return PatchProxy.accessDispatch(new Object[0], this, f64044a, false, 72316, new Class[0], Object.class);
                        }
                    }, 0);
                    return true;
                }
            }
        });
    }

    public final void b() {
        BaseResponse baseResponse;
        if (PatchProxy.isSupport(new Object[0], this, f64041a, false, 72314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64041a, false, 72314, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null) {
            baseResponse = null;
        } else {
            baseResponse = (BaseResponse) this.f2978e.getData();
        }
        if (!(baseResponse == null || this.f2979f == null)) {
            ((a) this.f2979f).c();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f64041a, false, 72313, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f64041a, false, 72313, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((a) this.f2979f).X_();
        }
    }
}
