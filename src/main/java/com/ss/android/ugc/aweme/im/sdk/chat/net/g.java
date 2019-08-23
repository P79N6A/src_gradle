package com.ss.android.ugc.aweme.im.sdk.chat.net;

import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryPictureContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadManager;
import com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.w;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import java.util.HashMap;
import java.util.List;

public final class g extends ab implements x {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50929a;

    /* renamed from: b  reason: collision with root package name */
    n f50930b;

    /* renamed from: c  reason: collision with root package name */
    public StoryPictureContent f50931c;

    /* renamed from: d  reason: collision with root package name */
    public x f50932d;

    /* renamed from: e  reason: collision with root package name */
    private WeakHandler f50933e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50929a, false, 51253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50929a, false, 51253, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50932d != null) {
            this.f50932d.a();
        }
        b();
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50929a, false, 51247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50929a, false, 51247, new Class[0], Void.TYPE);
            return;
        }
        super.run();
        if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            a("99");
            return;
        }
        List<String> checkPics = this.f50931c.getCheckPics();
        if (checkPics == null || checkPics.size() == 0) {
            a("96");
            return;
        }
        UploadManager.a().a(this.f50931c.getCheckPics().get(0), 1, new x() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50934a;

            public final void a() {
            }

            public final void a(double d2) {
            }

            public final void a(String str) {
                String str2 = str;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f50934a, false, 51259, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2}, this, f50934a, false, 51259, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                g.this.a(str2);
            }

            public final void a(Throwable th) {
                Throwable th2 = th;
                if (PatchProxy.isSupport(new Object[]{th2}, this, f50934a, false, 51258, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th2}, this, f50934a, false, 51258, new Class[]{Throwable.class}, Void.TYPE);
                    return;
                }
                g.this.a(th2);
            }

            public final void a(String str, UrlModel urlModel) {
                String str2;
                if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50934a, false, 51257, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50934a, false, 51257, new Class[]{String.class, UrlModel.class}, Void.TYPE);
                    return;
                }
                if (urlModel != null) {
                    w.b(str);
                    g.this.f50931c.getCheckPics().set(0, urlModel.getUri());
                    if (g.this.f50931c.isSendRaw()) {
                        str2 = g.this.f50931c.getPicturePath();
                    } else if (TextUtils.isEmpty(g.this.f50931c.getCompressPath())) {
                        str2 = g.this.f50931c.getPicturePath();
                    } else {
                        str2 = g.this.f50931c.getCompressPath();
                    }
                    UploadManager.a().a(str2, 0, g.this, false);
                }
            }
        }, false);
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f50929a, false, 51246, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f50929a, false, 51246, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof g)) {
                return false;
            }
            return this.i.equals(((g) obj).i);
        }
    }

    public final void a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f50929a, false, 51249, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f50929a, false, 51249, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.f50932d != null) {
            this.f50932d.a(d2);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50929a, false, 51251, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50929a, false, 51251, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f50932d != null) {
            this.f50932d.a(str);
        }
        if (this.f50930b != null) {
            this.f50933e.post(new j(this));
        }
        b();
        a((Object) str, true);
        z.a().a(this.f50930b);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f50929a, false, 51250, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f50929a, false, 51250, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f50932d != null) {
            this.f50932d.a(th);
        }
        if (this.f50930b != null) {
            this.f50933e.post(new i(this));
        }
        b();
        a((Object) th, true);
        z.a().a(this.f50930b);
    }

    private void a(Object obj, boolean z) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f50929a, false, 51252, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2, Byte.valueOf(z)}, this, f50929a, false, 51252, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "EncryptImageUploadItem");
        if (obj2 != null) {
            if (z) {
                hashMap.put("error", obj2);
            } else {
                hashMap.put("success", obj2);
            }
        }
        hashMap.put("message", this.f50930b);
        d.a("message_upload_image", hashMap);
    }

    public final void a(String str, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50929a, false, 51248, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50929a, false, 51248, new Class[]{String.class, UrlModel.class}, Void.TYPE);
            return;
        }
        if (urlModel != null) {
            w.b(this.f50931c.getCompressPath());
            this.f50931c.setUrl((a) urlModel);
            if (this.f50932d != null) {
                this.f50932d.a(str, urlModel);
            }
            if (this.f50930b != null) {
                this.f50930b.setContent(l.a(this.f50931c));
                this.f50933e.post(new h(this));
            }
        }
        b();
        a((Object) str, false);
    }

    public g(WeakHandler weakHandler, StoryPictureContent storyPictureContent, n nVar) {
        this.f50933e = weakHandler;
        this.f50931c = storyPictureContent;
        this.f50930b = nVar;
        this.i = a(this.f50930b);
    }
}
