package com.ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.util.d;
import java.util.concurrent.Callable;

public final class m extends b<a<MusicDetail>, n> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56373a;

    public m() {
        a(new a<MusicDetail>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56374a;

            public final boolean checkParams(Object... objArr) {
                return objArr != null;
            }

            public final boolean sendRequest(final Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f56374a, false, 60064, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f56374a, false, 60064, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    if (objArr.length > 0 && TextUtils.isEmpty(objArr[0])) {
                        d.b();
                    }
                    com.ss.android.ugc.aweme.base.m.f2752c.a(this.mHandler, new Callable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f56376a;

                        public final Object call() throws Exception {
                            if (PatchProxy.isSupport(new Object[0], this, f56376a, false, 60065, new Class[0], Object.class)) {
                                return PatchProxy.accessDispatch(new Object[0], this, f56376a, false, 60065, new Class[0], Object.class);
                            } else if (objArr.length <= 2 || ((Integer) objArr[2]).intValue() != 1) {
                                return MusicApi.a((String) objArr[0], ((Integer) objArr[1]).intValue());
                            } else {
                                String str = (String) objArr[0];
                                String str2 = (String) objArr[1];
                                if (!PatchProxy.isSupport(new Object[]{str, str2}, null, MusicAwemeApi.f56296a, true, 59993, new Class[]{String.class, String.class}, MusicDetail.class)) {
                                    return (MusicDetail) MusicAwemeApi.f56297b.queryPartnerMusic(str, str2).get();
                                }
                                return (MusicDetail) PatchProxy.accessDispatch(new Object[]{str, str2}, null, MusicAwemeApi.f56296a, true, 59993, new Class[]{String.class, String.class}, MusicDetail.class);
                            }
                        }
                    }, 0);
                    return true;
                }
            }
        });
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56373a, false, 60061, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56373a, false, 60061, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((n) this.f2979f).a((MusicDetail) this.f2978e.getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f56373a, false, 60060, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f56373a, false, 60060, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((n) this.f2979f).b_(exc);
        }
    }
}
