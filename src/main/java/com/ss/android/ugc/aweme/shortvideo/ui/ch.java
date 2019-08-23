package com.ss.android.ugc.aweme.shortvideo.ui;

import a.g;
import a.i;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class ch implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70866a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordPermissionActivity f70867b;

    ch(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        this.f70867b = videoRecordPermissionActivity;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f70866a, false, 80726, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f70866a, false, 80726, new Class[]{i.class}, Object.class);
        }
        VideoRecordPermissionActivity videoRecordPermissionActivity = this.f70867b;
        if (iVar.d() || iVar.c()) {
            videoRecordPermissionActivity.a((List<Bundle>) null);
        } else {
            videoRecordPermissionActivity.a((List) iVar.e());
        }
        return null;
    }
}
