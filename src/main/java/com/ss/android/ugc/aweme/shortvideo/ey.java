package com.ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;

public final class ey {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67627a;

    public static boolean a(int i) {
        return i == 2;
    }

    private static boolean b(int i) {
        return i != 0;
    }

    public static AVUploadSaveModel a(AVUploadSaveModel aVUploadSaveModel, int i) {
        AVUploadSaveModel aVUploadSaveModel2 = aVUploadSaveModel;
        if (!PatchProxy.isSupport(new Object[]{aVUploadSaveModel2, Integer.valueOf(i)}, null, f67627a, true, 74522, new Class[]{AVUploadSaveModel.class, Integer.TYPE}, AVUploadSaveModel.class)) {
            return a(aVUploadSaveModel2, i, false);
        }
        return (AVUploadSaveModel) PatchProxy.accessDispatch(new Object[]{aVUploadSaveModel2, Integer.valueOf(i)}, null, f67627a, true, 74522, new Class[]{AVUploadSaveModel.class, Integer.TYPE}, AVUploadSaveModel.class);
    }

    private static AVUploadSaveModel b(AVUploadSaveModel aVUploadSaveModel, int i) {
        AVUploadSaveModel aVUploadSaveModel2 = aVUploadSaveModel;
        if (PatchProxy.isSupport(new Object[]{aVUploadSaveModel2, Integer.valueOf(i)}, null, f67627a, true, 74524, new Class[]{AVUploadSaveModel.class, Integer.TYPE}, AVUploadSaveModel.class)) {
            return (AVUploadSaveModel) PatchProxy.accessDispatch(new Object[]{aVUploadSaveModel2, Integer.valueOf(i)}, null, f67627a, true, 74524, new Class[]{AVUploadSaveModel.class, Integer.TYPE}, AVUploadSaveModel.class);
        }
        aVUploadSaveModel2.setWaterMark(!a.L.a(e.a.ForbidLifeStoryLocalWatermark));
        aVUploadSaveModel2.setSaveLocal(true);
        aVUploadSaveModel.setSaveType(i);
        return aVUploadSaveModel2;
    }

    public static AVUploadSaveModel a(AVUploadSaveModel aVUploadSaveModel, int i, boolean z) {
        AVUploadSaveModel aVUploadSaveModel2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{aVUploadSaveModel, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f67627a, true, 74523, new Class[]{AVUploadSaveModel.class, Integer.TYPE, Boolean.TYPE}, AVUploadSaveModel.class)) {
            return (AVUploadSaveModel) PatchProxy.accessDispatch(new Object[]{aVUploadSaveModel, Integer.valueOf(i), Byte.valueOf(z)}, null, f67627a, true, 74523, new Class[]{AVUploadSaveModel.class, Integer.TYPE, Boolean.TYPE}, AVUploadSaveModel.class);
        } else if (!f.p()) {
            return null;
        } else {
            if (aVUploadSaveModel == null) {
                aVUploadSaveModel2 = new AVUploadSaveModel();
            } else {
                aVUploadSaveModel2 = aVUploadSaveModel;
            }
            if (TextUtils.isEmpty(aVUploadSaveModel2.getLocalTempPath())) {
                aVUploadSaveModel2.setLocalTempPath(fg.b());
            }
            if (i2 == 4) {
                return b(aVUploadSaveModel2, i2);
            }
            aVUploadSaveModel2.setWaterMark(!a.L.a(e.a.ForbidLocalWatermark));
            if (z) {
                aVUploadSaveModel2.setSaveLocal(true);
                aVUploadSaveModel2.setSaveType(i2);
                return aVUploadSaveModel2;
            }
            if (com.ss.android.g.a.a()) {
                aVUploadSaveModel2.setSaveLocal(b(i));
                aVUploadSaveModel2.setSaveType(i2);
            } else {
                aVUploadSaveModel2.setSaveLocal(((Boolean) a.o.b().a()).booleanValue());
                aVUploadSaveModel2.setSaveType(1);
            }
            return aVUploadSaveModel2;
        }
    }
}
