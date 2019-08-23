package com.ss.android.ugc.aweme.web.upload;

import android.support.v7.widget.SimpleItemAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.web.upload.ImageChooseUploadActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76912a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageChooseUploadActivity.AnonymousClass1 f76913b;

    /* renamed from: c  reason: collision with root package name */
    private final List f76914c;

    i(ImageChooseUploadActivity.AnonymousClass1 r1, List list) {
        this.f76913b = r1;
        this.f76914c = list;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f76912a, false, 90119, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76912a, false, 90119, new Class[0], Void.TYPE);
            return;
        }
        ImageChooseUploadActivity.AnonymousClass1 r1 = this.f76913b;
        List list = this.f76914c;
        try {
            if (j.a((Collection<T>) list)) {
                ImageChooseUploadActivity.this.f76888e.setVisibility(0);
                ImageChooseUploadActivity.this.f76888e.setText(ImageChooseUploadActivity.this.getResources().getString(C0906R.string.bhf));
                return;
            }
            ImageChooseUploadActivity.this.f76888e.setVisibility(8);
            ImageChooseUploadActivity.this.f76887d.setVisibility(8);
            ImageChooseAdapter imageChooseAdapter = ImageChooseUploadActivity.this.f76889f;
            if (PatchProxy.isSupport(new Object[]{list}, imageChooseAdapter, ImageChooseAdapter.f76864a, false, 90089, new Class[]{Collection.class}, Void.TYPE)) {
                ImageChooseAdapter imageChooseAdapter2 = imageChooseAdapter;
                PatchProxy.accessDispatch(new Object[]{list}, imageChooseAdapter2, ImageChooseAdapter.f76864a, false, 90089, new Class[]{Collection.class}, Void.TYPE);
            } else {
                imageChooseAdapter.f76866c.clear();
                imageChooseAdapter.f76866c.addAll(list);
                int size = imageChooseAdapter.f76866c.size();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(size)}, imageChooseAdapter, ImageChooseAdapter.f76864a, false, 90088, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    ImageChooseAdapter imageChooseAdapter3 = imageChooseAdapter;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(size)}, imageChooseAdapter3, ImageChooseAdapter.f76864a, false, 90088, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    if (imageChooseAdapter.f76868e == null) {
                        imageChooseAdapter.f76868e = new ArrayList();
                    } else {
                        imageChooseAdapter.f76868e.clear();
                    }
                    if (imageChooseAdapter.f76867d == null) {
                        imageChooseAdapter.f76867d = new ArrayList();
                    } else {
                        imageChooseAdapter.f76867d.clear();
                    }
                    for (int i = 0; i < size; i++) {
                        imageChooseAdapter.f76867d.add(-1);
                    }
                }
                imageChooseAdapter.notifyDataSetChanged();
            }
            ImageChooseUploadActivity.this.f76885b.setAdapter(ImageChooseUploadActivity.this.f76889f);
            ((SimpleItemAnimator) ImageChooseUploadActivity.this.f76885b.getItemAnimator()).setSupportsChangeAnimations(false);
            ImageChooseUploadActivity.this.f76889f.i = ImageChooseUploadActivity.this.i;
            ImageChooseUploadActivity.this.f76889f.j = ImageChooseUploadActivity.this.j;
        } catch (Exception unused) {
        }
    }
}
