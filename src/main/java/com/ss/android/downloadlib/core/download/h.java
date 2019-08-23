package com.ss.android.downloadlib.core.download;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.downloadlib.c.l;
import com.ss.android.downloadlib.core.download.a;
import com.ss.android.downloadlib.core.download.j;
import java.util.HashMap;

public final class h implements MediaScannerConnection.MediaScannerConnectionClient, l.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29006a;

    /* renamed from: b  reason: collision with root package name */
    final MediaScannerConnection f29007b;

    /* renamed from: c  reason: collision with root package name */
    protected final l f29008c = new l(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    HashMap<String, a> f29009d = new HashMap<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f29012a;

        /* renamed from: b  reason: collision with root package name */
        public final String f29013b;

        /* renamed from: c  reason: collision with root package name */
        public final String f29014c;

        /* renamed from: d  reason: collision with root package name */
        public final long f29015d = SystemClock.elapsedRealtime();

        public final void a(MediaScannerConnection mediaScannerConnection) {
            mediaScannerConnection.scanFile(this.f29013b, this.f29014c);
        }

        public a(long j, String str, String str2) {
            this.f29012a = j;
            this.f29013b = str;
            this.f29014c = str2;
        }
    }

    public final void a() {
        this.f29007b.disconnect();
    }

    public final void onMediaScannerConnected() {
        synchronized (this.f29007b) {
            for (a next : this.f29009d.values()) {
                if (this.f29007b.isConnected()) {
                    next.a(this.f29007b);
                } else {
                    this.f29007b.connect();
                }
            }
        }
    }

    public h(Context context) {
        this.f29006a = context;
        this.f29007b = new MediaScannerConnection(context, this);
    }

    public final void a(Message message) {
        a remove;
        if (message != null) {
            Bundle data = message.getData();
            if (data != null && com.ss.android.downloadlib.c.h.b("android.permission.WRITE_EXTERNAL_STORAGE")) {
                String string = data.getString("path");
                String string2 = data.getString("uri");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    final Uri parse = Uri.parse(string2);
                    synchronized (this.f29007b) {
                        remove = this.f29009d.remove(string);
                    }
                    if (remove != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("scanned", 1);
                        if (parse != null) {
                            contentValues.put("mediaprovider_uri", parse.toString());
                        }
                        d.a(this.f29006a).f28953c.a(0, new a.b() {
                            public final void a(int i) {
                                if (i == 0 && h.this.f29006a != null) {
                                    h.this.f29006a.getContentResolver().delete(parse, null, null);
                                }
                            }
                        }, ContentUris.withAppendedId(j.a.f29029a, remove.f29012a), contentValues, null, null);
                    }
                }
            }
        }
    }

    public final void onScanCompleted(String str, Uri uri) {
        Message obtainMessage = this.f29008c.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("path", str);
        bundle.putString("uri", uri.toString());
        obtainMessage.setData(bundle);
        this.f29008c.sendMessage(obtainMessage);
    }
}
