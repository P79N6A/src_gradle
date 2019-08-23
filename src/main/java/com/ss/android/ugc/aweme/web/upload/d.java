package com.ss.android.ugc.aweme.web.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.web.upload.ImageChooseAdapter;
import java.util.List;

public final /* synthetic */ class d implements ImageChooseAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76902a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseUploadActivity f76903b;

    d(ImageChooseUploadActivity imageChooseUploadActivity) {
        this.f76903b = imageChooseUploadActivity;
    }

    public final void a(List list) {
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f76902a, false, 90113, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f76902a, false, 90113, new Class[]{List.class}, Void.TYPE);
            return;
        }
        ImageChooseUploadActivity imageChooseUploadActivity = this.f76903b;
        if (j.b(list)) {
            imageChooseUploadActivity.f76886c.setText(imageChooseUploadActivity.getString(C0906R.string.p3, new Object[]{Integer.valueOf(list.size())}));
            imageChooseUploadActivity.f76886c.setVisibility(0);
        } else {
            imageChooseUploadActivity.f76886c.setVisibility(8);
        }
        imageChooseUploadActivity.g = list2;
    }
}
