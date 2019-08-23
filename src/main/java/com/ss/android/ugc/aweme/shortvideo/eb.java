package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.JobIntentService;
import com.crashlytics.android.Crashlytics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.b;
import com.ss.android.ugc.aweme.tools.policysecurity.c;

public final class eb {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66831a;

    public final void a(Context context, String str, String str2, Object obj) {
        b bVar;
        Context context2 = context;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{context2, str, str2, obj2}, this, f66831a, false, 74384, new Class[]{Context.class, String.class, String.class, Object.class}, Void.TYPE)) {
            Object[] objArr = {context2, str, str2, obj2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f66831a, false, 74384, new Class[]{Context.class, String.class, String.class, Object.class}, Void.TYPE);
            return;
        }
        if ((obj2 instanceof cb) && a.L.a(e.a.UploadOriginalAudioTrack)) {
            cb cbVar = (cb) obj2;
            if (cbVar.shouldUploadOriginalSound()) {
                c cVar = new c(str, str2, cbVar.mEncodedAudioOutputFile, System.currentTimeMillis());
                if (PatchProxy.isSupport(new Object[]{context2}, null, b.f74924a, true, 87250, new Class[]{Context.class}, b.class)) {
                    bVar = (b) PatchProxy.accessDispatch(new Object[]{context2}, null, b.f74924a, true, 87250, new Class[]{Context.class}, b.class);
                } else {
                    bVar = b.f74926c.a(context2);
                }
                bVar.a(cVar);
            }
            try {
                JobIntentService.enqueueWork(context2, OriginalSoundUploadService.class, 3008, new Intent());
            } catch (Exception e2) {
                Crashlytics.logException(e2);
            }
        }
    }
}
