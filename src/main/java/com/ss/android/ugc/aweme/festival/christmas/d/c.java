package com.ss.android.ugc.aweme.festival.christmas.d;

import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.festival.christmas.api.ChristmasApi;
import com.ss.android.ugc.aweme.festival.christmas.c.g;
import com.ss.android.ugc.aweme.festival.christmas.c.h;
import com.ss.android.ugc.aweme.festival.christmas.c.p;
import java.util.concurrent.Callable;

public final class c extends b<a<g>, com.ss.android.ugc.aweme.festival.christmas.view.b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47257a;

    public c() {
        if (PatchProxy.isSupport(new Object[0], this, f47257a, false, 43923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47257a, false, 43923, new Class[0], Void.TYPE);
            return;
        }
        a(new a<g>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47258a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f47258a, false, 43935, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f47258a, false, 43935, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    String str = objArr[0];
                    int intValue = objArr[1].intValue();
                    if (intValue == 0) {
                        c cVar = c.this;
                        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(intValue)}, cVar, c.f47257a, false, 43924, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                            c cVar2 = cVar;
                            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(intValue)}, cVar2, c.f47257a, false, 43924, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                        } else {
                            g gVar = new g();
                            ChristmasApi.a().getShareStats(str).b((a.g<TResult, i<TContinuationResult>>) new d<TResult,i<TContinuationResult>>(cVar, gVar, str)).a((a.g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(cVar, gVar, intValue), i.f1052b);
                        }
                    } else if (intValue == 1) {
                        c cVar3 = c.this;
                        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(intValue)}, cVar3, c.f47257a, false, 43925, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                            Object[] objArr2 = {str, Integer.valueOf(intValue)};
                            Object[] objArr3 = objArr2;
                            c cVar4 = cVar3;
                            PatchProxy.accessDispatch(objArr3, cVar4, c.f47257a, false, 43925, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                        } else {
                            g gVar2 = new g();
                            ChristmasApi.a().getECardShareStats(str).b((a.g<TResult, i<TContinuationResult>>) new f<TResult,i<TContinuationResult>>(cVar3, gVar2, str)).a((a.g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(cVar3, gVar2, intValue), i.f1052b);
                        }
                    }
                    return true;
                }
            }
        });
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f47257a, false, 43928, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f47257a, false, 43928, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new i<TResult>(this), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i a(g gVar, String str, i iVar) throws Exception {
        if (iVar.d()) {
            a(iVar.f());
        } else if (iVar.b() && iVar.e() != null) {
            gVar.f47242c = (h) iVar.e();
            ChristmasApi.API a2 = ChristmasApi.a();
            return a2.getAwemeDetail("[" + str + "]");
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(g gVar, int i, i iVar) throws Exception {
        if (iVar.d()) {
            a(iVar.f());
        } else if (iVar.b() && iVar.e() != null) {
            a((BatchDetailList) iVar.e(), gVar, i);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(g gVar, int i, i iVar) throws Exception {
        if (iVar.d()) {
            a(iVar.f());
        } else if (iVar.b() && iVar.e() != null) {
            a((BatchDetailList) iVar.e(), gVar, i);
        }
        return null;
    }

    private void a(BatchDetailList batchDetailList, g gVar, int i) {
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{batchDetailList, gVar2, Integer.valueOf(i)}, this, f47257a, false, 43926, new Class[]{BatchDetailList.class, g.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{batchDetailList, gVar2, Integer.valueOf(i)}, this, f47257a, false, 43926, new Class[]{BatchDetailList.class, g.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f2979f != null && batchDetailList != null) {
            if (!CollectionUtils.isEmpty(batchDetailList.getItems())) {
                gVar2.f47240a = batchDetailList.getItems().get(0);
                ((com.ss.android.ugc.aweme.festival.christmas.view.b) this.f2979f).a(gVar);
                return;
            }
            ((com.ss.android.ugc.aweme.festival.christmas.view.b) this.f2979f).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ i b(g gVar, String str, i iVar) throws Exception {
        if (iVar.d()) {
            a(iVar.f());
        } else if (iVar.b()) {
            p pVar = (p) iVar.e();
            if (pVar != null) {
                if (pVar.f47248a) {
                    gVar.f47241b = pVar.f47249b;
                    ChristmasApi.API a2 = ChristmasApi.a();
                    return a2.getAwemeDetail("[" + str + "]");
                } else if (pVar.f47249b != null) {
                    String warning = pVar.f47249b.getWarning();
                    if (PatchProxy.isSupport(new Object[]{warning}, this, f47257a, false, 43927, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{warning}, this, f47257a, false, 43927, new Class[]{String.class}, Void.TYPE);
                    } else {
                        i.a((Callable<TResult>) new h<TResult>(this, warning), i.f1052b);
                    }
                }
            }
        }
        return null;
    }
}
