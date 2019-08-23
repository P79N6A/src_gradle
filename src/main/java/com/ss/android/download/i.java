package com.ss.android.download;

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
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.download.b.c;
import java.util.HashMap;

public final class i implements MediaScannerConnection.MediaScannerConnectionClient, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    final MediaScannerConnection f28575a;

    /* renamed from: b  reason: collision with root package name */
    protected final WeakHandler f28576b = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: c  reason: collision with root package name */
    HashMap<String, a> f28577c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final Context f28578d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f28579a;

        /* renamed from: b  reason: collision with root package name */
        public final String f28580b;

        /* renamed from: c  reason: collision with root package name */
        public final String f28581c;

        /* renamed from: d  reason: collision with root package name */
        public final long f28582d = SystemClock.elapsedRealtime();

        public final void a(MediaScannerConnection mediaScannerConnection) {
            mediaScannerConnection.scanFile(this.f28580b, this.f28581c);
        }

        public a(long j, String str, String str2) {
            this.f28579a = j;
            this.f28580b = str;
            this.f28581c = str2;
        }
    }

    public final void a() {
        this.f28575a.disconnect();
    }

    public final void onMediaScannerConnected() {
        synchronized (this.f28575a) {
            for (a a2 : this.f28577c.values()) {
                a2.a(this.f28575a);
            }
        }
    }

    public i(Context context) {
        this.f28578d = context;
        this.f28575a = new MediaScannerConnection(context, this);
    }

    public final void handleMsg(Message message) {
        a remove;
        if (message != null) {
            Bundle data = message.getData();
            if (data != null) {
                String string = data.getString("path");
                String string2 = data.getString("uri");
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    Uri parse = Uri.parse(string2);
                    synchronized (this.f28575a) {
                        remove = this.f28577c.remove(string);
                    }
                    if (remove != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("scanned", 1);
                        if (parse != null) {
                            contentValues.put("mediaprovider_uri", parse.toString());
                        }
                        if (h.a(this.f28578d).a(ContentUris.withAppendedId(c.a.f28513a, remove.f28579a), contentValues, (String) null, (String[]) null) == 0 && this.f28578d != null) {
                            this.f28578d.getContentResolver().delete(parse, null, null);
                        }
                    }
                }
            }
        }
    }

    public final void onScanCompleted(String str, Uri uri) {
        Message obtainMessage = this.f28576b.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("path", str);
        bundle.putString("uri", uri.toString());
        obtainMessage.setData(bundle);
        this.f28576b.sendMessage(obtainMessage);
    }
}
