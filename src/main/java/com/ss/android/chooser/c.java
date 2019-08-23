package com.ss.android.chooser;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;

public final class c extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    private Handler f27974a;

    /* renamed from: b  reason: collision with root package name */
    private long f27975b;

    public c(Handler handler) {
        super(handler);
        this.f27974a = handler;
    }

    public final void onChange(boolean z) {
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        boolean z2;
        if (System.currentTimeMillis() - this.f27975b < 3000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (uri == null) {
                this.f27975b = System.currentTimeMillis();
                this.f27974a.postDelayed(new Runnable() {
                    public final void run() {
                        e.a().a(1, true);
                        e.a().a(2, true);
                        e.a().a(3, true);
                        e.a().a(4, true);
                    }
                }, 300);
            } else if (MediaStore.Images.Media.EXTERNAL_CONTENT_URI.equals(uri)) {
                this.f27975b = System.currentTimeMillis();
                this.f27974a.postDelayed(new Runnable() {
                    public final void run() {
                        e.a().a(1, true);
                        e.a().a(2, true);
                        e.a().a(3, true);
                    }
                }, 300);
            } else if (MediaStore.Video.Media.EXTERNAL_CONTENT_URI.equals(uri)) {
                this.f27975b = System.currentTimeMillis();
                this.f27974a.postDelayed(new Runnable() {
                    public final void run() {
                        e.a().a(4, true);
                    }
                }, 300);
            } else {
                if ("content://media/external".equals(uri.toString())) {
                    this.f27975b = System.currentTimeMillis();
                    this.f27974a.postDelayed(new Runnable() {
                        public final void run() {
                            e.a().a(1, true);
                            e.a().a(2, true);
                            e.a().a(3, true);
                            e.a().a(4, true);
                        }
                    }, 300);
                }
            }
        }
    }
}
