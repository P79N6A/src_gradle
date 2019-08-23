package com.ss.android.ugc.aweme.shortvideo.ui;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.AmeActivity;

public abstract class RecordSessionActivity extends AmeActivity implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4031a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4032b;

    public final boolean O() {
        return this.f4032b;
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f4031a, false, 80326, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4031a, false, 80326, new Class[0], Void.TYPE);
            return;
        }
        a(false);
        super.finish();
    }

    public Analysis getAnalysis() {
        if (!PatchProxy.isSupport(new Object[0], this, f4031a, false, 80327, new Class[0], Analysis.class)) {
            return new Analysis().setLabelName("video_shoot_page");
        }
        return (Analysis) PatchProxy.accessDispatch(new Object[0], this, f4031a, false, 80327, new Class[0], Analysis.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4031a, false, 80325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4031a, false, 80325, new Class[0], Void.TYPE);
            return;
        }
        a(false);
        super.onDestroy();
    }

    private void a(boolean z) {
        this.f4032b = z;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f4031a, false, 80324, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f4031a, false, 80324, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        a(true);
    }
}
