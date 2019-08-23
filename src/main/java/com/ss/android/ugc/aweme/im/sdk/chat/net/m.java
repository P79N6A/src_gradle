package com.ss.android.ugc.aweme.im.sdk.chat.net;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.im.core.d.a;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.okhttp.OkHttpClient;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.HashMap;
import java.util.List;

public final class m extends e {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f50947e;

    /* renamed from: f  reason: collision with root package name */
    public AudioContent f50948f;
    public n g;
    private WeakHandler k;

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f50947e, false, 51274, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f50947e, false, 51274, new Class[0], String.class);
        }
        if (TextUtils.isEmpty(this.f50923c)) {
            this.f50923c = b.b(GlobalContext.getContext()).toString() + "/" + d.b() + "/im/audio/download/" + this.g.getConversationShortId();
        }
        return this.f50923c;
    }

    public final String b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50947e, false, 51273, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f50947e, false, 51273, new Class[]{String.class}, String.class);
        }
        String str2 = str + "/" + this.f50948f.getMd5() + ".m4a";
        if (!this.g.isSelf()) {
            return str2;
        }
        List<a> attachments = this.g.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            a aVar = attachments.get(0);
            if (this.g.getMsgStatus() == 3) {
                return aVar.getLocalPath();
            }
        }
        return str2;
    }

    public final String c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f50947e, false, 51275, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f50947e, false, 51275, new Class[]{String.class}, String.class);
        } else if (this.f50948f != null) {
            return this.f50948f.getMd5() + ".m4a";
        } else {
            return str + ".m4a";
        }
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f50947e, false, 51272, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f50947e, false, 51272, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        super.a(th);
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioDownloadItem");
        if (th != null) {
            hashMap.put("error", th.toString());
        }
        d.a("audio_message_download", hashMap);
        if (!this.g.isSelf()) {
            this.g.setMsgStatus(3);
        }
        this.k.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50953a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50953a, false, 51279, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50953a, false, 51279, new Class[0], Void.TYPE);
                    return;
                }
                ad.b(m.this.g);
            }
        });
        b();
    }

    public final boolean a(String str) {
        File file;
        if (PatchProxy.isSupport(new Object[]{str}, this, f50947e, false, 51276, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f50947e, false, 51276, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.g.getMsgStatus() == 2) {
            file = new File(this.f50923c, c(str));
        } else {
            file = new File(str);
        }
        if (file.exists()) {
            return true;
        }
        return false;
    }

    public final void a(final String str, final UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{str, urlModel}, this, f50947e, false, 51270, new Class[]{String.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, urlModel}, this, f50947e, false, 51270, new Class[]{String.class, UrlModel.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioDownloadItem");
        hashMap.put("message", str);
        d.a("audio_message_download", hashMap);
        this.g.setContent(l.a(this.f50948f));
        this.k.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50949a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50949a, false, 51277, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50949a, false, 51277, new Class[0], Void.TYPE);
                    return;
                }
                if (!m.this.g.isSelf()) {
                    m.this.g.setMsgStatus(2);
                }
                ad.b(m.this.g);
                if (m.this.f50924d != null) {
                    m.this.f50924d.a(str, urlModel);
                }
            }
        });
        b();
    }

    public m(OkHttpClient okHttpClient, WeakHandler weakHandler, AudioContent audioContent, n nVar) {
        super(okHttpClient);
        String str;
        this.k = weakHandler;
        this.f50948f = audioContent;
        this.g = nVar;
        this.f50922b = audioContent.getUrl();
        n nVar2 = this.g;
        if (PatchProxy.isSupport(new Object[]{nVar2}, null, e.f50920a, true, 51235, new Class[]{n.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{nVar2}, null, e.f50920a, true, 51235, new Class[]{n.class}, String.class);
        } else if (nVar2 == null) {
            str = "";
        } else {
            str = "DownloadItem" + nVar2.getIndex() + "_" + nVar2.getUuid();
        }
        this.i = str;
    }
}
