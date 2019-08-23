package com.ss.android.ugc.aweme.shortvideo;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.LiveSettingApi;
import com.ss.android.ugc.aweme.shortvideo.record.m;
import com.ss.android.ugc.aweme.story.widget.TabHost;

public final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68933a;

    /* renamed from: b  reason: collision with root package name */
    private final n f68934b;

    /* renamed from: c  reason: collision with root package name */
    private final TabHost f68935c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortVideoRecordingOperationPanelFragment f68936d;

    /* renamed from: e  reason: collision with root package name */
    private final fh f68937e;

    /* renamed from: f  reason: collision with root package name */
    private final m f68938f;
    private final boolean g;

    q(n nVar, TabHost tabHost, ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment, fh fhVar, m mVar, boolean z) {
        this.f68934b = nVar;
        this.f68935c = tabHost;
        this.f68936d = shortVideoRecordingOperationPanelFragment;
        this.f68937e = fhVar;
        this.f68938f = mVar;
        this.g = z;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f68933a, false, 73919, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f68933a, false, 73919, new Class[]{i.class}, Object.class);
        }
        n nVar = this.f68934b;
        TabHost tabHost = this.f68935c;
        ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment = this.f68936d;
        fh fhVar = this.f68937e;
        m mVar = this.f68938f;
        boolean z = this.g;
        if (iVar.b()) {
            a.u.a(((LiveSettingApi.a) iVar.e()).f65351a);
            int currentIndex = tabHost.getCurrentIndex();
            if (nVar.a(shortVideoRecordingOperationPanelFragment, fhVar)) {
                int a2 = mVar.a(z);
                if (fhVar.ao) {
                    currentIndex = a2;
                } else if (currentIndex >= a2) {
                    currentIndex++;
                }
                tabHost.setIndexWithoutAnim(currentIndex);
            }
        }
        return null;
    }
}
