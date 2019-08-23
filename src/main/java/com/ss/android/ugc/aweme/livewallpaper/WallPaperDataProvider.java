package com.ss.android.ugc.aweme.livewallpaper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.livewallpaper.c.c;
import com.ss.android.ugc.aweme.livewallpaper.c.e;
import java.io.File;
import java.io.FileNotFoundException;

public class WallPaperDataProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53549a;

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f53550b = Uri.parse("content://com.bytedance.ies.wallpapercaller/video_path");

    /* renamed from: c  reason: collision with root package name */
    public static final Uri f53551c = Uri.parse("content://com.bytedance.ies.wallpapercaller/video_width");

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f53552d = Uri.parse("content://com.bytedance.ies.wallpapercaller/video_height");

    /* renamed from: e  reason: collision with root package name */
    public static final Uri f53553e = Uri.parse("content://com.bytedance.ies.wallpapercaller/fall_back_video_path");

    /* renamed from: f  reason: collision with root package name */
    public static final Uri f53554f = Uri.parse("content://com.bytedance.ies.wallpapercaller/set_wp_result");
    public static final Uri g = Uri.parse("content://com.bytedance.ies.wallpapercaller/source");
    private UriMatcher h;
    private Handler i;

    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f53549a, false, 55997, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53549a, false, 55997, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.h = new UriMatcher(-1);
        if (!TextUtils.isEmpty("com.bytedance.ies.wallpapercaller")) {
            this.h.addURI("com.bytedance.ies.wallpapercaller", "video_path", 16);
            this.h.addURI("com.bytedance.ies.wallpapercaller", "fall_back_video_path", 32);
            this.h.addURI("com.bytedance.ies.wallpapercaller", "set_wp_result", 48);
            this.h.addURI("com.bytedance.ies.wallpapercaller", "video_width", 64);
            this.h.addURI("com.bytedance.ies.wallpapercaller", "video_height", 80);
            this.h.addURI("com.bytedance.ies.wallpapercaller", "source", 96);
        }
        this.i = new Handler(Looper.getMainLooper());
        return false;
    }

    @Nullable
    public String getType(@NonNull Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, f53549a, false, 55998, new Class[]{Uri.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{uri2}, this, f53549a, false, 55998, new Class[]{Uri.class}, String.class);
        }
        int match = this.h.match(uri2);
        if (match == 16) {
            return c.a().f53674b.getVideoPath();
        }
        if (match == 32) {
            return e.b();
        }
        if (match == 64) {
            return String.valueOf(c.a().f53674b.getWidth());
        }
        if (match == 80) {
            return String.valueOf(c.a().f53674b.getHeight());
        }
        if (match != 96) {
            return "";
        }
        return c.a().f53674b.getSource();
    }

    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable final ContentValues contentValues) {
        if (PatchProxy.isSupport(new Object[]{uri, contentValues}, this, f53549a, false, 55999, new Class[]{Uri.class, ContentValues.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{uri, contentValues}, this, f53549a, false, 55999, new Class[]{Uri.class, ContentValues.class}, Uri.class);
        }
        if (!(contentValues == null || contentValues.size() == 0 || this.h.match(uri) != 48)) {
            this.i.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53555a;

                public final void run() {
                    boolean z;
                    if (PatchProxy.isSupport(new Object[0], this, f53555a, false, 56005, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f53555a, false, 56005, new Class[0], Void.TYPE);
                        return;
                    }
                    if (contentValues.getAsBoolean("result") != null) {
                        z = contentValues.getAsBoolean("result").booleanValue();
                    } else {
                        z = false;
                    }
                    String asString = contentValues.getAsString("source");
                    String asString2 = contentValues.getAsString("message");
                    c a2 = c.a();
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), asString, asString2}, a2, c.f53673a, false, 56257, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE)) {
                        c cVar = a2;
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), asString, asString2}, cVar, c.f53673a, false, 56257, new Class[]{Boolean.TYPE, String.class, String.class}, Void.TYPE);
                        return;
                    }
                    if (a2.f53675c.size() != 0) {
                        c.a aVar = a2.f53675c.get(asString);
                        if (aVar != null) {
                            aVar.a(z, asString2);
                        }
                    }
                }
            });
        }
        return null;
    }

    @Nullable
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2, str}, this, f53549a, false, 56000, new Class[]{Uri.class, String.class}, ParcelFileDescriptor.class)) {
            return (ParcelFileDescriptor) PatchProxy.accessDispatch(new Object[]{uri2, str}, this, f53549a, false, 56000, new Class[]{Uri.class, String.class}, ParcelFileDescriptor.class);
        }
        String str2 = "";
        int match = this.h.match(uri2);
        if (match == 16) {
            str2 = c.a().f53674b.getVideoPath();
        } else if (match == 32) {
            str2 = e.b();
        }
        try {
            return ParcelFileDescriptor.open(new File(str2), 268435456);
        } catch (Exception unused) {
            return null;
        }
    }
}
