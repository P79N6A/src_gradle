package com.ss.android.ugc.aweme.favorites.c;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class a extends b<com.ss.android.ugc.aweme.common.a<BaseResponse>, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44272a;

    /* renamed from: b  reason: collision with root package name */
    public int f44273b;

    /* renamed from: c  reason: collision with root package name */
    public int f44274c;

    public a() {
        a(new com.ss.android.ugc.aweme.common.a<BaseResponse>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44275a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 3) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f44275a, false, 39519, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f44275a, false, 39519, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                }
                a.this.f44274c = objArr[0].intValue();
                String str = objArr[1];
                a.this.f44273b = objArr[2].intValue();
                i iVar = null;
                switch (a.this.f44274c) {
                    case 1:
                        iVar = UserFavoritesApi.f44270b.collectMusic(str, a.this.f44273b);
                        break;
                    case 2:
                        iVar = UserFavoritesApi.f44270b.collectAweme(str, a.this.f44273b);
                        break;
                    case 3:
                        iVar = UserFavoritesApi.f44270b.collectChallenge(str, a.this.f44273b);
                        break;
                    case 4:
                        iVar = UserFavoritesApi.f44270b.collectPoi(str, a.this.f44273b);
                        break;
                }
                if (iVar == null) {
                    return false;
                }
                iVar.a((g<TResult, TContinuationResult>) new g<BaseResponse, Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44277a;

                    public final /* synthetic */ Object then(i iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f44277a, false, 39520, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f44277a, false, 39520, new Class[]{i.class}, Void.class);
                        }
                        if (iVar.d() || iVar.c()) {
                            a.this.a(iVar.f());
                        } else {
                            a.this.b();
                        }
                        return null;
                    }
                }, i.f1052b);
                return true;
            }
        });
    }

    public final void b() {
        BaseResponse baseResponse;
        if (PatchProxy.isSupport(new Object[0], this, f44272a, false, 39518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44272a, false, 39518, new Class[0], Void.TYPE);
            return;
        }
        int cn2 = AbTestManager.a().cn();
        int i = this.f44274c;
        int i2 = C0906R.string.f0;
        int i3 = C0906R.string.pq;
        if (i == 4) {
            if (this.f44273b == 0) {
                Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
                if (cn2 != 2) {
                    i2 = C0906R.string.pq;
                }
                com.bytedance.ies.dmt.ui.d.a.a((Context) a2, i2).a();
            }
        } else if (this.f44274c == 1 || !com.ss.android.g.a.a() || this.f44274c == 2) {
            if (cn2 != 2) {
                Activity a3 = com.ss.android.ugc.aweme.framework.core.a.b().a();
                if (this.f44273b == 1) {
                    i3 = C0906R.string.u_;
                }
                com.bytedance.ies.dmt.ui.d.a.a((Context) a3, i3).a();
            } else {
                Activity a4 = com.ss.android.ugc.aweme.framework.core.a.b().a();
                if (this.f44273b == 1) {
                    i2 = C0906R.string.f1;
                }
                com.bytedance.ies.dmt.ui.d.a.a((Context) a4, i2).a();
            }
        }
        if (this.f2979f != null) {
            if (this.f2978e == null) {
                baseResponse = null;
            } else {
                baseResponse = (BaseResponse) this.f2978e.getData();
            }
            ((b) this.f2979f).a(baseResponse);
        }
        if (!((Boolean) SharePrefCache.inst().getIsFirstFavouriteSuccess().c()).booleanValue() && this.f44273b == 1) {
            SharePrefCache.inst().getIsFirstFavouriteSuccess().a(Boolean.TRUE);
        }
    }

    public final void a(Exception exc) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f44272a, false, 39517, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f44272a, false, 39517, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (AbTestManager.a().cn() != 2) {
            Activity a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
            if (this.f44273b == 1) {
                i2 = C0906R.string.u6;
            } else {
                i2 = C0906R.string.pp;
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) a2, i2).a();
        } else {
            Activity a3 = com.ss.android.ugc.aweme.framework.core.a.b().a();
            if (this.f44273b == 1) {
                i = C0906R.string.f3;
            } else {
                i = C0906R.string.ez;
            }
            com.bytedance.ies.dmt.ui.d.a.b((Context) a3, i).a();
        }
        if (this.f2979f != null) {
            ((b) this.f2979f).a(exc);
        }
    }
}
