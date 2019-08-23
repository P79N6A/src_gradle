package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import android.app.Activity;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.b;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import dmt.av.video.n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68685a;

    /* renamed from: b  reason: collision with root package name */
    public f f68686b;

    /* renamed from: c  reason: collision with root package name */
    List<Bitmap> f68687c;

    /* renamed from: d  reason: collision with root package name */
    int f68688d;

    /* renamed from: e  reason: collision with root package name */
    p f68689e;

    /* renamed from: f  reason: collision with root package name */
    int[] f68690f;
    int g;
    m h;
    Handler i;
    HandlerThread j;
    Handler k;
    d l;
    public MutableLiveData<Bitmap> m;
    public MutableLiveData<Boolean> n;
    boolean o;
    private int p;
    private int q;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.a$a  reason: collision with other inner class name */
    static class C0723a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68693a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<a> f68694b;

        C0723a(a aVar) {
            this.f68694b = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f68693a, false, 78068, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f68693a, false, 78068, new Class[]{Message.class}, Void.TYPE);
            } else if (this.f68694b.get() != null) {
                if (message2.what == 1002) {
                    List list = (List) message2.obj;
                    if (((a) this.f68694b.get()).f68686b != null) {
                        ((a) this.f68694b.get()).f68686b.a(list);
                        if (!j.a((Collection<T>) list) && list.get(0) != null) {
                            if (((a) this.f68694b.get()).n != null) {
                                ((a) this.f68694b.get()).n.setValue(Boolean.TRUE);
                            }
                            if (((a) this.f68694b.get()).m != null) {
                                ((a) this.f68694b.get()).m.setValue(list.get(0));
                            }
                        }
                    }
                    return;
                }
                if (message2.what == 1003) {
                    a aVar = (a) this.f68694b.get();
                    if (PatchProxy.isSupport(new Object[0], aVar, a.f68685a, false, 78060, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], aVar, a.f68685a, false, 78060, new Class[0], Void.TYPE);
                        return;
                    }
                    if (aVar.f68686b != null) {
                        aVar.f68686b.a(aVar.f68687c);
                    }
                    if (aVar.f68689e != null) {
                        aVar.f68689e.a(0, p.d.EDITOR_SEEK_FLAG_LastSeek);
                    }
                    if (!(aVar.f68689e == null || aVar.h == null)) {
                        n.b(aVar.f68689e, aVar.h);
                    }
                    if (aVar.j != null && Build.VERSION.SDK_INT >= 18) {
                        aVar.j.quitSafely();
                    }
                    if (aVar.l != null) {
                        aVar.l.dismiss();
                    }
                    if (aVar.n != null) {
                        aVar.n.setValue(Boolean.FALSE);
                    }
                    aVar.f68686b = null;
                }
            }
        }
    }

    public a() {
        this.f68687c = new ArrayList();
        this.f68688d = 7;
        this.j = new HandlerThread("mv_cover_creator");
        this.j.start();
        this.i = new Handler(this.j.getLooper()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68691a;

            public final void handleMessage(Message message) {
                Message message2 = message;
                if (PatchProxy.isSupport(new Object[]{message2}, this, f68691a, false, 78067, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message2}, this, f68691a, false, 78067, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                a aVar = a.this;
                if (PatchProxy.isSupport(new Object[]{message2}, aVar, a.f68685a, false, 78059, new Class[]{Message.class}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{message2}, aVar2, a.f68685a, false, 78059, new Class[]{Message.class}, Void.TYPE);
                } else if (message2.what != 1001) {
                    aVar.k.sendEmptyMessage(1003);
                } else if (aVar.g >= aVar.f68688d) {
                    if (aVar.g == aVar.f68688d) {
                        aVar.f68687c.add(aVar.a());
                    }
                    aVar.k.sendEmptyMessage(1003);
                } else if (aVar.f68689e == null) {
                    aVar.k.sendEmptyMessage(1003);
                } else {
                    int i = aVar.f68690f[aVar.g];
                    Bitmap a2 = aVar.a();
                    aVar.f68687c.add(a2);
                    if (aVar.f68687c.size() == 1) {
                        ArrayList arrayList = new ArrayList(aVar.f68688d);
                        for (int i2 = 0; i2 < aVar.f68688d; i2++) {
                            arrayList.add(a2);
                        }
                        Message message3 = new Message();
                        message3.obj = arrayList;
                        message3.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
                        aVar.k.sendMessage(message3);
                    }
                    aVar.f68689e.a(i, p.d.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
        };
        this.k = new C0723a(this);
    }

    /* access modifiers changed from: package-private */
    public Bitmap a() {
        Bitmap bitmap;
        if (PatchProxy.isSupport(new Object[0], this, f68685a, false, 78062, new Class[0], Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f68685a, false, 78062, new Class[0], Bitmap.class);
        } else if (this.f68689e == null) {
            return null;
        } else {
            if (this.p == 0) {
                bitmap = this.f68689e.e();
            } else {
                bitmap = this.f68689e.a(this.p);
            }
            return bitmap;
        }
    }

    public final a a(MutableLiveData<Bitmap> mutableLiveData) {
        this.m = mutableLiveData;
        return this;
    }

    public final a b(MutableLiveData<Boolean> mutableLiveData) {
        this.n = mutableLiveData;
        return this;
    }

    private boolean a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f68685a, false, 78061, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, this, f68685a, false, 78061, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context == null) {
            this.k.sendEmptyMessage(1003);
            return false;
        } else {
            if (context instanceof Activity) {
                if (((Activity) context).isFinishing()) {
                    this.k.sendEmptyMessage(1003);
                    return false;
                }
            } else if (((Activity) context).isFinishing()) {
                this.k.sendEmptyMessage(1003);
                return false;
            }
            return true;
        }
    }

    public final a a(int i2, int i3) {
        this.p = i2;
        this.q = i3;
        return this;
    }

    private static int[] b(int i2, int i3) {
        int[] iArr = new int[i3];
        int i4 = i2 / i3;
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = i4 * i5;
        }
        return iArr;
    }

    public a(p pVar, String str, int i2, b bVar) {
        this.f68687c = new ArrayList();
        this.f68688d = 7;
        if (pVar != null && !TextUtils.isEmpty(str)) {
            this.f68689e = pVar;
            try {
                if (com.ss.android.ugc.aweme.video.b.b(str)) {
                    Fresco.getImagePipeline().evictFromCache(Uri.fromFile(new File(str)));
                    new File(str).delete();
                }
                this.h = new b(this, str, pVar, bVar);
                pVar.r();
                n.a(pVar, this.h);
                pVar.a(i2, p.d.EDITOR_SEEK_FLAG_LastSeek);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Context context, p pVar, int i2, f fVar) {
        Context context2 = context;
        p pVar2 = pVar;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{context2, pVar2, Integer.valueOf(i2), fVar2}, this, f68685a, false, 78058, new Class[]{Context.class, p.class, Integer.TYPE, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, pVar2, Integer.valueOf(i2), fVar2}, this, f68685a, false, 78058, new Class[]{Context.class, p.class, Integer.TYPE, f.class}, Void.TYPE);
        } else if (a(context)) {
            this.l = d.b(context2, context2.getString(C0906R.string.f4484cat));
            this.l.setIndeterminate(true);
            this.f68686b = fVar2;
            this.f68688d = i2;
            this.f68689e = pVar2;
            if (pVar2 == null) {
                this.k.sendEmptyMessage(1003);
                return;
            }
            this.f68690f = b(pVar.t(), this.f68688d);
            this.h = new c(this);
            pVar.r();
            n.a(pVar2, this.h);
            pVar2.a(0, p.d.EDITOR_SEEK_FLAG_LastSeek);
        }
    }
}
