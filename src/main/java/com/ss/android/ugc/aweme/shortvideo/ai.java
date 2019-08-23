package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.n;
import java.lang.reflect.Type;

public final class ai implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65528a;

    /* renamed from: b  reason: collision with root package name */
    VideoRecordNewActivity f65529b;

    public ai(VideoRecordNewActivity videoRecordNewActivity) {
        this.f65529b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65528a, false, 73982, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65528a, false, 73982, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != n.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65530a;

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65530a, false, 73983, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65530a, false, 73983, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    ai.this.f65529b.e();
                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) ai.this.f65529b).get(ShortVideoContextViewModel.class)).f65401b;
                    if (fhVar != null && fhVar.f67719b == 1) {
                        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().enterDraftBox(ai.this.f65529b);
                    }
                    if (ai.this.f65529b.H) {
                        try {
                            ai.this.f65529b.startActivity(new Intent(ai.this.f65529b, a.f61121d.a()));
                        } catch (Exception unused) {
                            com.ss.android.ugc.aweme.base.n.a("returnmain", c.a().a("event", "crash").b());
                        }
                    }
                    if (fhVar != null && fhVar.an) {
                        ai.this.f65529b.setResult(-1);
                    }
                    ai.this.f65529b.finish();
                }
            };
        }
    }
}
