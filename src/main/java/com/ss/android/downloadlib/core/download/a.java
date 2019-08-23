package com.ss.android.downloadlib.core.download;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ss.android.downloadlib.core.download.d;
import java.lang.ref.WeakReference;

public class a extends Handler {

    /* renamed from: c  reason: collision with root package name */
    private static Looper f28926c;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<g> f28927a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f28928b;

    /* renamed from: d  reason: collision with root package name */
    private Handler f28929d;

    /* renamed from: e  reason: collision with root package name */
    private Context f28930e;

    /* renamed from: com.ss.android.downloadlib.core.download.a$a  reason: collision with other inner class name */
    public interface C0346a {
        void a(Cursor cursor);
    }

    public interface b {
        void a(int i);
    }

    protected static final class c {

        /* renamed from: a  reason: collision with root package name */
        public Uri f28931a;

        /* renamed from: b  reason: collision with root package name */
        public Handler f28932b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f28933c;

        /* renamed from: d  reason: collision with root package name */
        public String f28934d;

        /* renamed from: e  reason: collision with root package name */
        public String[] f28935e;

        /* renamed from: f  reason: collision with root package name */
        public String f28936f;
        public Object g;
        public Object h;
        public ContentValues i;

        protected c() {
        }
    }

    protected class d extends Handler {
        public final void handleMessage(Message message) {
            Cursor cursor;
            g gVar = (g) a.this.f28927a.get();
            if (gVar != null) {
                c cVar = (c) message.obj;
                int i = message.what;
                switch (message.arg1) {
                    case 1:
                        try {
                            cursor = gVar.a(cVar.f28931a, cVar.f28933c, cVar.f28934d, cVar.f28935e, cVar.f28936f);
                            if (cursor != null) {
                                cursor.getCount();
                            }
                        } catch (Exception unused) {
                            cursor = null;
                        }
                        cVar.g = cursor;
                        break;
                    case 2:
                        cVar.g = gVar.a(cVar.f28931a, cVar.i);
                        break;
                    case 3:
                        cVar.g = Integer.valueOf(gVar.a(cVar.f28931a, cVar.i, cVar.f28934d, cVar.f28935e));
                        break;
                    case 4:
                        cVar.g = Integer.valueOf(gVar.a(cVar.f28931a, cVar.f28934d, cVar.f28935e));
                        break;
                }
                Message obtainMessage = cVar.f28932b.obtainMessage(i);
                obtainMessage.obj = cVar;
                obtainMessage.arg1 = message.arg1;
                obtainMessage.sendToTarget();
            }
        }

        public d(Looper looper) {
            super(looper);
        }
    }

    public void handleMessage(Message message) {
        c cVar = (c) message.obj;
        int i = message.what;
        switch (message.arg1) {
            case 1:
                Object obj = cVar.h;
                Cursor cursor = (Cursor) cVar.g;
                if (cursor != null) {
                    C0346a aVar = (C0346a) obj;
                    if (aVar != null) {
                        aVar.a(new d.a(cursor, this.f28928b, this.f28930e));
                    }
                }
                return;
            case 2:
                return;
            case 3:
                Object obj2 = cVar.h;
                int intValue = ((Integer) cVar.g).intValue();
                if (obj2 != null && (obj2 instanceof b)) {
                    ((b) obj2).a(intValue);
                }
                return;
            case 4:
                ((Integer) cVar.g).intValue();
                break;
        }
    }

    public a(g gVar, Uri uri, Context context) {
        super(Looper.getMainLooper());
        this.f28927a = new WeakReference<>(gVar);
        this.f28928b = uri;
        this.f28930e = context;
        synchronized (a.class) {
            if (f28926c == null) {
                HandlerThread handlerThread = new HandlerThread("AsyncQueryWorker");
                handlerThread.start();
                f28926c = handlerThread.getLooper();
            }
        }
        this.f28929d = new d(f28926c);
    }

    public final void a(int i, Object obj, Uri uri, String str, String[] strArr) {
        Message obtainMessage = this.f28929d.obtainMessage(0);
        obtainMessage.arg1 = 4;
        c cVar = new c();
        cVar.f28932b = this;
        cVar.f28931a = uri;
        cVar.h = null;
        cVar.f28934d = null;
        cVar.f28935e = null;
        obtainMessage.obj = cVar;
        this.f28929d.sendMessage(obtainMessage);
    }

    public final void a(int i, Object obj, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Message obtainMessage = this.f28929d.obtainMessage(i);
        obtainMessage.arg1 = 3;
        c cVar = new c();
        cVar.f28932b = this;
        cVar.f28931a = uri;
        cVar.h = obj;
        cVar.i = contentValues;
        cVar.f28934d = str;
        cVar.f28935e = strArr;
        obtainMessage.obj = cVar;
        this.f28929d.sendMessage(obtainMessage);
    }

    public final void a(int i, Object obj, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Message obtainMessage = this.f28929d.obtainMessage(0);
        obtainMessage.arg1 = 1;
        c cVar = new c();
        cVar.f28932b = this;
        cVar.f28931a = uri;
        cVar.f28933c = strArr;
        cVar.f28934d = str;
        cVar.f28935e = strArr2;
        cVar.f28936f = str2;
        cVar.h = obj;
        obtainMessage.obj = cVar;
        this.f28929d.sendMessage(obtainMessage);
    }
}
