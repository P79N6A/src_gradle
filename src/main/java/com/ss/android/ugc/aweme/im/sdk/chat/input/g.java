package com.ss.android.ugc.aweme.im.sdk.chat.input;

import a.i;
import android.content.res.Resources;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.chooser.f;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50592a;

    /* renamed from: b  reason: collision with root package name */
    private final d f50593b;

    g(d dVar) {
        this.f50593b = dVar;
    }

    public final void run(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f50592a, false, 50600, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f50592a, false, 50600, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        d dVar = this.f50593b;
        Boolean bool = (Boolean) obj;
        if (dVar.s == null) {
            dVar.s = new c(dVar.h(), dVar);
            dVar.m.a(2, dVar.s.a());
        }
        c cVar = dVar.s;
        boolean booleanValue = bool.booleanValue();
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, cVar, c.f50825d, false, 50953, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            c cVar2 = cVar;
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, cVar2, c.f50825d, false, 50953, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!booleanValue) {
            cVar.b(true);
        } else if (cVar.k == null) {
            if (PatchProxy.isSupport(new Object[0], cVar, c.f50825d, false, 50959, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f50825d, false, 50959, new Class[0], Void.TYPE);
            } else {
                i.a((Callable<TResult>) new Callable<List<f>>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50833a;

                    public final /* synthetic */ Object call() throws Exception {
                        if (!PatchProxy.isSupport(new Object[0], this, f50833a, false, 50963, new Class[0], List.class)) {
                            return b.a(c.this.f50435b.getContext(), 360, 360, 50, false);
                        }
                        return (List) PatchProxy.accessDispatch(new Object[0], this, f50833a, false, 50963, new Class[0], List.class);
                    }
                }).a((a.g<TResult, TContinuationResult>) new a.g<List<f>, Void>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50831a;

                    public final /* synthetic */ Object then(i iVar) throws Exception {
                        int i;
                        int i2;
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f50831a, false, 50962, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f50831a, false, 50962, new Class[]{i.class}, Void.class);
                        }
                        List list = (List) iVar.e();
                        if (list == null || list.isEmpty()) {
                            c.this.b(false);
                        } else {
                            c.this.g.setVisibility(8);
                            c.this.h.setVisibility(0);
                            c.this.j.setVisibility(0);
                            c cVar = c.this;
                            if (PatchProxy.isSupport(new Object[0], cVar, c.f50825d, false, 50960, new Class[0], Integer.TYPE)) {
                                i = ((Integer) PatchProxy.accessDispatch(new Object[0], cVar, c.f50825d, false, 50960, new Class[0], Integer.TYPE)).intValue();
                            } else {
                                Resources resources = cVar.e().getResources();
                                if (cVar.h == null || cVar.h.getHeight() == 0) {
                                    i2 = resources.getDimensionPixelSize(C0906R.dimen.h7);
                                } else {
                                    i2 = cVar.h.getHeight();
                                }
                                i = resources.getDimensionPixelSize(C0906R.dimen.hd) - i2;
                            }
                            ArrayList arrayList = new ArrayList();
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                arrayList.add(i.a((f) list.get(i3)));
                            }
                            c.this.k = new HorizonPhotoSelectAdapter(arrayList, i, c.this.l);
                            c.this.j.setAdapter(c.this.k);
                            c.this.m.f50862d = c.this.k.f50738d;
                        }
                        return null;
                    }
                }, i.f1052b);
            }
        } else {
            cVar.f();
        }
        dVar.m.a(2);
    }
}
