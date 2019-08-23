package com.ss.android.ugc.aweme.shortvideo.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ej;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.filter.e;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.ai;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.r;
import com.ss.android.ugc.aweme.util.c;
import java.util.ArrayList;

public final /* synthetic */ class bm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70822a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70823b;

    /* renamed from: c  reason: collision with root package name */
    private final VideoRecordNewActivity.a f70824c;

    bm(VideoRecordNewActivity videoRecordNewActivity, VideoRecordNewActivity.a aVar) {
        this.f70823b = videoRecordNewActivity;
        this.f70824c = aVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70822a, false, 80636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70822a, false, 80636, new Class[0], Void.TYPE);
            return;
        }
        VideoRecordNewActivity videoRecordNewActivity = this.f70823b;
        VideoRecordNewActivity.a aVar = this.f70824c;
        if (PatchProxy.isSupport(new Object[0], videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], videoRecordNewActivity, VideoRecordNewActivity.f4033b, false, 80609, new Class[0], Void.TYPE);
        } else {
            ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) videoRecordNewActivity).get(ShortVideoContextViewModel.class);
            fh fhVar = shortVideoContextViewModel.f65401b;
            if (fhVar != null && !videoRecordNewActivity.isFinishing()) {
                c.a("stopRecord() called");
                shortVideoContextViewModel.a(0);
                long b2 = videoRecordNewActivity.af.b().b() / 1000;
                if (b2 >= 0) {
                    fhVar.n += fhVar.m.end(b2);
                }
                h e2 = ((e) videoRecordNewActivity.l.c()).e();
                if (e2.f47600d != null) {
                    fhVar.O.addIndex();
                }
                if (String.valueOf(e2.f47598b) != null) {
                    fhVar.P.addIndex();
                }
                if (b2 <= 10 && b2 >= 0) {
                    videoRecordNewActivity.A.a((Object) videoRecordNewActivity, (bc) new r());
                }
                ai a2 = ai.a(fhVar.m, fhVar.n);
                videoRecordNewActivity.z.a((Object) videoRecordNewActivity, (bc) a2);
                a2.a();
                if (!a.b()) {
                    fhVar.Q.add(Integer.toString(((e) videoRecordNewActivity.l.c()).k()));
                    fhVar.T.add(Integer.toString(((e) videoRecordNewActivity.l.c()).d()));
                    fhVar.S.add(Integer.toString(((e) videoRecordNewActivity.l.c()).j()));
                    fhVar.R.add(Integer.toString(((e) videoRecordNewActivity.l.c()).i()));
                } else {
                    fhVar.Q.add(Integer.toString((int) (f.a(((e) videoRecordNewActivity.l.c()).k()) * 100.0f)));
                    int b3 = (int) (f.b(((e) videoRecordNewActivity.l.c()).i()) * 100.0f);
                    fhVar.R.add(Integer.toString(b3));
                    fhVar.S.add(Integer.toString(b3));
                    fhVar.T.add(Integer.toString(((e) videoRecordNewActivity.l.c()).d()));
                }
                com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.f67720c);
                com.ss.android.ugc.aweme.shortvideo.d.a.b(fhVar.z, fhVar.A);
                com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.E);
                com.ss.android.ugc.aweme.shortvideo.d.a.b(fhVar.p ? 1 : 0);
                com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.o);
                com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.f67723f, ej.a().b(), fhVar.g);
                com.ss.android.ugc.aweme.shortvideo.d.a.a((ArrayList<TimeSpeedModelExtension>) fhVar.m);
                com.ss.android.ugc.aweme.shortvideo.d.a.a(videoRecordNewActivity.K.e());
                com.ss.android.ugc.aweme.shortvideo.d.a.a(fhVar.O.toString(), fhVar.P.toString());
            }
        }
        aVar.a();
        videoRecordNewActivity.al = false;
    }
}
