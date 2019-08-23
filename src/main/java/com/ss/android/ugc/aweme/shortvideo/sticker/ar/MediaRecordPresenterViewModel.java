package com.ss.android.ugc.aweme.shortvideo.sticker.ar;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.tools.extract.e;

public class MediaRecordPresenterViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69324a;

    /* renamed from: b  reason: collision with root package name */
    public MediaRecordPresenter f69325b;

    /* renamed from: c  reason: collision with root package name */
    public e f69326c;

    /* renamed from: d  reason: collision with root package name */
    public MutableLiveData<Bitmap> f69327d;

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69324a, false, 78848, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f69324a, false, 78848, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f69326c != null) {
            this.f69326c.a(str);
        }
    }

    public final void a(final String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f69324a, false, 78846, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f69324a, false, 78846, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f69327d == null) {
            this.f69327d = new MutableLiveData<>();
        }
        a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69328a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f69328a, false, 78850, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69328a, false, 78850, new Class[0], Void.TYPE);
                    return;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                if (decodeFile != null) {
                    MediaRecordPresenterViewModel.this.f69327d.postValue(decodeFile);
                }
            }
        });
    }
}
