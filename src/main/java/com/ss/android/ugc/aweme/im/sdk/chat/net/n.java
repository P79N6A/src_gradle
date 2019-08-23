package com.ss.android.ugc.aweme.im.sdk.chat.net;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.im.core.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.j;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.HashMap;
import java.util.List;

public final class n extends l {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f50955c;

    /* renamed from: d  reason: collision with root package name */
    public static int f50956d;

    /* renamed from: e  reason: collision with root package name */
    public AudioContent f50957e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.im.core.d.n f50958f;
    public String g;
    private WeakHandler l;

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50955c, false, 51282, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f50955c, false, 51282, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f50958f.setMsgStatus(3);
        f50956d++;
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("error", str);
        }
        d.a("audio_message_send", hashMap);
        z.a().a(this.f50958f);
        this.l.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50965a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50965a, false, 51287, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50965a, false, 51287, new Class[0], Void.TYPE);
                    return;
                }
                ad.b(n.this.f50958f);
            }
        });
        super.a(str);
        b();
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f50955c, false, 51281, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f50955c, false, 51281, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        this.f50958f.setMsgStatus(3);
        f50956d++;
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        if (th != null) {
            hashMap.put("error", th.toString());
        }
        d.a("audio_message_send", hashMap);
        z.a().a(this.f50958f);
        this.l.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50963a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50963a, false, 51286, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50963a, false, 51286, new Class[0], Void.TYPE);
                    return;
                }
                ad.b(n.this.f50958f);
            }
        });
        super.a(th);
        b();
    }

    public final void a(final String str, final UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50955c, false, 51280, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50955c, false, 51280, new Class[]{String.class, UrlModel.class}, Void.TYPE);
            return;
        }
        super.a(str, urlModel);
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        hashMap.put("message", str);
        d.a("audio_message_send", hashMap);
        this.l.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50959a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50959a, false, 51285, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50959a, false, 51285, new Class[0], Void.TYPE);
                    return;
                }
                String str = n.this.g + "/" + n.this.f50957e.getMd5() + ".m4a";
                List<a> attachments = n.this.f50958f.getAttachments();
                if (attachments != null) {
                    a aVar = attachments.get(0);
                    if (!str.equals(aVar.getLocalPath())) {
                        File file = new File(n.this.g);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        j.a(str, str);
                        File file2 = new File(str);
                        if (file2.exists()) {
                            file2.delete();
                        }
                        aVar.setLocalPath(str);
                    }
                }
                n.this.f50957e.setUrl(urlModel);
                n.this.f50958f.setContent(l.a(n.this.f50957e));
                n.this.f50958f.setMsgStatus(1);
                ad.c(n.this.f50958f);
            }
        });
        b();
    }

    public n(OkHttpClient okHttpClient, WeakHandler weakHandler, AudioContent audioContent, com.bytedance.im.core.d.n nVar) {
        super(okHttpClient);
        String str;
        String str2;
        this.l = weakHandler;
        this.f50957e = audioContent;
        this.f50958f = nVar;
        this.i = a(nVar);
        if (PatchProxy.isSupport(new Object[0], this, f50955c, false, 51283, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f50955c, false, 51283, new Class[0], String.class);
        } else {
            List<a> attachments = this.f50958f.getAttachments();
            if (attachments == null || attachments.size() <= 0) {
                str = null;
            } else {
                str = attachments.get(0).getLocalPath();
            }
        }
        this.f50944b = str;
        if (PatchProxy.isSupport(new Object[0], this, f50955c, false, 51284, new Class[0], String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[0], this, f50955c, false, 51284, new Class[0], String.class);
        } else {
            str2 = b.b(GlobalContext.getContext()).toString() + "/" + d.b() + "/im/audio/download/" + this.f50958f.getConversationShortId();
        }
        this.g = str2;
    }
}
