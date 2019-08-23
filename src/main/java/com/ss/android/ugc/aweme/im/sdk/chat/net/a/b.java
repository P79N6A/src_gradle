package com.ss.android.ugc.aweme.im.sdk.chat.net.a;

import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.im.core.d.a;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.model.EncryptedVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.StoryVideoContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.ab;
import com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadManager;
import com.ss.android.ugc.aweme.im.sdk.chat.net.x;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import java.util.HashMap;

public final class b extends ab implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50884a;

    /* renamed from: b  reason: collision with root package name */
    n f50885b;

    /* renamed from: c  reason: collision with root package name */
    public StoryVideoContent f50886c;

    /* renamed from: d  reason: collision with root package name */
    public a f50887d;

    /* renamed from: e  reason: collision with root package name */
    private WeakHandler f50888e;

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50884a, false, 51346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50884a, false, 51346, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50885b != null) {
            this.f50888e.post(new d(this));
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50884a, false, 51342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50884a, false, 51342, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50887d != null) {
            this.f50887d.a();
        }
        b();
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f50884a, false, 51339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50884a, false, 51339, new Class[0], Void.TYPE);
            return;
        }
        super.run();
        if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
            a("99");
        } else if (this.f50885b.getAttachments() == null || this.f50885b.getAttachments().size() < 3) {
            a("96");
        } else {
            a aVar = null;
            final a aVar2 = null;
            for (a next : this.f50885b.getAttachments()) {
                if (next != null) {
                    if (aVar == null && next.getIndex() == 0) {
                        aVar = next;
                    } else if (aVar2 == null && next.getIndex() == 1) {
                        aVar2 = next;
                    }
                    if (!(aVar == null || aVar2 == null)) {
                        break;
                    }
                }
            }
            if (aVar == null || TextUtils.isEmpty(aVar.getLocalPath())) {
                a("96");
            } else if (aVar2 == null || TextUtils.isEmpty(aVar2.getLocalPath())) {
                a("102");
            } else {
                UploadManager.a().a(aVar.getLocalPath(), 1, new x() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50889a;

                    public final void a() {
                    }

                    public final void a(double d2) {
                    }

                    public final void a(String str) {
                        String str2 = str;
                        if (PatchProxy.isSupport(new Object[]{str2}, this, f50889a, false, 51351, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str2}, this, f50889a, false, 51351, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        b.this.a(str2);
                    }

                    public final void a(Throwable th) {
                        Throwable th2 = th;
                        if (PatchProxy.isSupport(new Object[]{th2}, this, f50889a, false, 51350, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th2}, this, f50889a, false, 51350, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        b.this.a(th2);
                    }

                    public final void a(String str, UrlModel urlModel) {
                        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50889a, false, 51349, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50889a, false, 51349, new Class[]{String.class, UrlModel.class}, Void.TYPE);
                            return;
                        }
                        if (urlModel != null) {
                            b.this.f50886c.getCheckPicList().add(urlModel.getUri());
                            UploadManager.a().a(aVar2.getLocalPath(), b.this, false);
                        }
                    }
                }, false);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f50884a, false, 51338, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f50884a, false, 51338, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof b)) {
                return false;
            }
            return this.i.equals(((b) obj).i);
        }
    }

    public final void a(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, f50884a, false, 51341, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, f50884a, false, 51341, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.f50887d != null) {
            this.f50887d.a(d2);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50884a, false, 51344, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50884a, false, 51344, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f50887d != null) {
            this.f50887d.a(str);
        }
        c();
        b();
        a(str, true);
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f50884a, false, 51343, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f50884a, false, 51343, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (this.f50887d != null) {
            this.f50887d.a(th);
        }
        c();
        b();
        a(th, true);
    }

    private void a(Object obj, boolean z) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f50884a, false, 51345, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2, Byte.valueOf(z)}, this, f50884a, false, 51345, new Class[]{Object.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "EncryptedVideoUploadItem");
        if (obj2 != null) {
            if (z) {
                hashMap.put("error", obj2);
            } else {
                hashMap.put("success", obj2);
            }
        }
        hashMap.put("message", this.f50885b);
        d.a("message_upload_video", hashMap);
    }

    public b(WeakHandler weakHandler, StoryVideoContent storyVideoContent, n nVar) {
        this.f50888e = weakHandler;
        this.f50885b = nVar;
        this.f50886c = storyVideoContent;
        this.i = a(this.f50885b);
    }

    public final void a(String str, EncryptedVideoContent encryptedVideoContent, com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a aVar) {
        String str2 = str;
        EncryptedVideoContent encryptedVideoContent2 = encryptedVideoContent;
        com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, encryptedVideoContent2, aVar2}, this, f50884a, false, 51340, new Class[]{String.class, EncryptedVideoContent.class, com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, encryptedVideoContent2, aVar2}, this, f50884a, false, 51340, new Class[]{String.class, EncryptedVideoContent.class, com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a.class}, Void.TYPE);
            return;
        }
        if (encryptedVideoContent2 != null) {
            this.f50886c.setPoster(aVar2);
            this.f50886c.setVideo(encryptedVideoContent2);
            if (this.f50887d != null) {
                this.f50887d.a(str2, encryptedVideoContent2, aVar2);
            }
            if (this.f50885b != null) {
                this.f50885b.setContent(l.a(this.f50886c));
                this.f50888e.post(new c(this));
            }
        }
        b();
        a(str2, false);
    }
}
