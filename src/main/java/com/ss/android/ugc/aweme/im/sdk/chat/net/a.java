package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.chat.model.AudioContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.net.f;
import com.ss.android.ugc.aweme.im.sdk.utils.am;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50878a;

    /* renamed from: e  reason: collision with root package name */
    private static am<a> f50879e = new am<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50883a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f50883a, false, 51221, new Class[0], a.class)) {
                return new a();
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, f50883a, false, 51221, new Class[0], a.class);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    protected Thread f50880b = new z("download_thread", this.f50881c, this.f50882d);

    /* renamed from: c  reason: collision with root package name */
    private Queue<aa> f50881c = new LinkedBlockingQueue();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, aa> f50882d = new HashMap();

    public a() {
        this.f50880b.start();
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f50878a, true, 51212, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f50878a, true, 51212, new Class[0], a.class);
        }
        return (a) f50879e.b();
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f50878a, false, 51216, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f50878a, false, 51216, new Class[0], Boolean.TYPE)).booleanValue();
        }
        File c2 = c();
        if (!c2.exists()) {
            return false;
        }
        b.b(c2);
        return true;
    }

    public final File c() {
        if (PatchProxy.isSupport(new Object[0], this, f50878a, false, 51217, new Class[0], File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[0], this, f50878a, false, 51217, new Class[0], File.class);
        }
        return new File(b.b(GlobalContext.getContext()).toString() + "/" + d.b() + "/im/audio/download/");
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f50878a, false, 51220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50878a, false, 51220, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.f50882d != null) {
            for (Map.Entry<String, aa> value : this.f50882d.entrySet()) {
                e eVar = (e) value.getValue();
                if (eVar != null) {
                    eVar.a((f.a) null);
                }
            }
        }
    }

    private void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f50878a, false, 51219, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f50878a, false, 51219, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.f50881c.offer(eVar);
        synchronized (this.f50881c) {
            this.f50881c.notify();
        }
    }

    public final e a(n nVar, BaseContent baseContent) {
        if (PatchProxy.isSupport(new Object[]{nVar, baseContent}, this, f50878a, false, 51218, new Class[]{n.class, BaseContent.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{nVar, baseContent}, this, f50878a, false, 51218, new Class[]{n.class, BaseContent.class}, e.class);
        } else if (baseContent instanceof AudioContent) {
            return new m(this.i, this.h, (AudioContent) baseContent, nVar);
        } else {
            return null;
        }
    }

    public final void a(String str, n nVar, f.a aVar) {
        n nVar2 = nVar;
        f.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{null, nVar2, aVar2}, this, f50878a, false, 51214, new Class[]{String.class, n.class, f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null, nVar2, aVar2}, this, f50878a, false, 51214, new Class[]{String.class, n.class, f.a.class}, Void.TYPE);
        } else if (nVar2 != null) {
            BaseContent content = m.content(nVar);
            if (content != null) {
                e a2 = a(nVar2, content);
                if (a2 != null) {
                    a2.a(aVar2);
                    a(a2);
                }
            }
        }
    }
}
