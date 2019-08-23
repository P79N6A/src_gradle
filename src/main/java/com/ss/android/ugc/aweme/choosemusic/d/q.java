package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.b;
import java.lang.ref.WeakReference;

public final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35853a;

    /* renamed from: b  reason: collision with root package name */
    private final o f35854b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference f35855c;

    q(o oVar, WeakReference weakReference) {
        this.f35854b = oVar;
        this.f35855c = weakReference;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35853a, false, 26754, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35853a, false, 26754, new Class[]{i.class}, Object.class);
        }
        o oVar = this.f35854b;
        WeakReference weakReference = this.f35855c;
        if (!(weakReference == null || ((Activity) weakReference.get()) == null)) {
            if (iVar.d()) {
                oVar.f35850b.a("local_music_list_status", (Object) 1);
            } else if (iVar.b()) {
                oVar.f35850b.a("local_music_list_status", (Object) 0);
                b bVar = new b();
                bVar.a("list_data", iVar.e()).a("list_hasmore", Boolean.FALSE).a("action_type", 1);
                oVar.f35850b.a("local_music_list_data", (Object) bVar);
            }
        }
        return null;
    }
}
