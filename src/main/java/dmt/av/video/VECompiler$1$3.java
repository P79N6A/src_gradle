package dmt.av.video;

import android.support.v4.os.CancellationSignal;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.gq;
import dmt.av.video.k;
import java.io.File;

class VECompiler$1$3 implements CancellationSignal.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82750a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SynthetiseResult f82751b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ad f82752c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k.AnonymousClass1 f82753d;

    public void onCancel() {
        if (PatchProxy.isSupport(new Object[0], this, f82750a, false, 91979, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f82750a, false, 91979, new Class[0], Void.TYPE);
            return;
        }
        SynthetiseResult clone = this.f82751b.clone();
        clone.ret = -66666;
        if (this.f82753d.a((Throwable) new gq("VECompiler canceled.", clone))) {
            this.f82752c.q.k();
        }
        if (this.f82751b.outputFile != null) {
            File file = new File(this.f82751b.outputFile);
            if (file.exists()) {
                file.delete();
            }
            if (r4 != null) {
                File file2 = new File(r4.extFile);
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
    }

    VECompiler$1$3(k.AnonymousClass1 r1, SynthetiseResult synthetiseResult, ad adVar) {
        this.f82753d = r1;
        this.f82751b = synthetiseResult;
        this.f82752c = adVar;
    }
}
