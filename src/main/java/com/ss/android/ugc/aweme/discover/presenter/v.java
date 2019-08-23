package com.ss.android.ugc.aweme.discover.presenter;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.discover.api.SearchSugApi;
import com.ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.ss.android.ugc.aweme.discover.presenter.e;
import com.ss.android.ugc.aweme.feed.ai;
import java.util.concurrent.Callable;

public final class v extends b<a<SearchSugResponse>, e.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42765a;

    /* renamed from: b  reason: collision with root package name */
    public int f42766b;

    /* renamed from: c  reason: collision with root package name */
    public String f42767c;
    public String g;
    private Handler h = new Handler(Looper.getMainLooper());
    private Runnable i = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42773a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f42773a, false, 37309, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42773a, false, 37309, new Class[0], Void.TYPE);
                return;
            }
            v.this.a(v.this.f42767c, v.this.g);
        }
    };

    public v() {
        a(new a<SearchSugResponse>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42768a;

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean checkParams(java.lang.Object... r18) {
                /*
                    r17 = this;
                    r0 = r18
                    r1 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    r9 = 0
                    r2[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r4 = f42768a
                    java.lang.Class[] r7 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                    r7[r9] = r3
                    java.lang.Class r8 = java.lang.Boolean.TYPE
                    r5 = 0
                    r6 = 37305(0x91b9, float:5.2275E-41)
                    r3 = r17
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x003d
                    java.lang.Object[] r10 = new java.lang.Object[r1]
                    r10[r9] = r0
                    com.meituan.robust.ChangeQuickRedirect r12 = f42768a
                    r13 = 0
                    r14 = 37305(0x91b9, float:5.2275E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r1]
                    java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
                    r15[r9] = r0
                    java.lang.Class r16 = java.lang.Boolean.TYPE
                    r11 = r17
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    return r0
                L_0x003d:
                    if (r0 == 0) goto L_0x004f
                    int r2 = r0.length
                    if (r2 != 0) goto L_0x0043
                    goto L_0x004f
                L_0x0043:
                    r0 = r0[r9]
                    java.lang.String r0 = (java.lang.String) r0
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x004e
                    return r9
                L_0x004e:
                    return r1
                L_0x004f:
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.v.AnonymousClass1.checkParams(java.lang.Object[]):boolean");
            }

            public final void handleMsg(Message message) {
                if (PatchProxy.isSupport(new Object[]{message}, this, f42768a, false, 37307, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message}, this, f42768a, false, 37307, new Class[]{Message.class}, Void.TYPE);
                } else if (message.what != v.this.f42766b) {
                    this.mHandler.removeMessages(message.what);
                } else {
                    super.handleMsg(message);
                }
            }

            public final boolean sendRequest(final Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f42768a, false, 37306, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f42768a, false, 37306, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    this.mIsLoading = false;
                    v.this.f42766b = (v.this.f42766b + 1) % 10;
                    m.a().a(this.mHandler, new Callable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f42770a;

                        public final Object call() throws Exception {
                            if (PatchProxy.isSupport(new Object[0], this, f42770a, false, 37308, new Class[0], Object.class)) {
                                return PatchProxy.accessDispatch(new Object[0], this, f42770a, false, 37308, new Class[0], Object.class);
                            }
                            String str = (String) objArr[0];
                            String str2 = null;
                            if (objArr.length > 1) {
                                str2 = (String) objArr[1];
                            }
                            return SearchSugApi.a(str, str2);
                        }
                    }, v.this.f42766b);
                    return true;
                }
            }
        });
    }

    public final void b() {
        SearchSugResponse searchSugResponse;
        if (PatchProxy.isSupport(new Object[0], this, f42765a, false, 37303, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42765a, false, 37303, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e != null) {
            searchSugResponse = (SearchSugResponse) this.f2978e.getData();
        } else {
            searchSugResponse = null;
        }
        if (this.f2979f != null) {
            if (searchSugResponse != null) {
                ai.a().a(searchSugResponse.requestId, searchSugResponse.logPb);
                ((e.a) this.f2979f).a(searchSugResponse);
                return;
            }
            ((e.a) this.f2979f).a();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f42765a, false, 37304, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f42765a, false, 37304, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((e.a) this.f2979f).a();
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f42765a, false, 37302, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f42765a, false, 37302, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.f42767c = str;
        this.g = str2;
        this.h.removeCallbacks(this.i);
        this.h.postDelayed(this.i, 150);
    }
}
