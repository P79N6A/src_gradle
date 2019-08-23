package com.ss.android.ugc.aweme.mediachoose.a;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55253a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f55254b;

    /* renamed from: c  reason: collision with root package name */
    private long f55255c;

    public b(Handler handler) {
        super(handler);
        this.f55254b = handler;
    }

    public final void onChange(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f55253a, false, 58614, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f55253a, false, 58614, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), uri}, this, f55253a, false, 58615, new Class[]{Boolean.TYPE, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), uri}, this, f55253a, false, 58615, new Class[]{Boolean.TYPE, Uri.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f55253a, false, 58616, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f55253a, false, 58616, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (System.currentTimeMillis() - this.f55255c < 3000) {
            z2 = true;
        }
        if (!z2) {
            if (uri == null) {
                this.f55255c = System.currentTimeMillis();
                this.f55254b.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55256a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f55256a, false, 58617, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f55256a, false, 58617, new Class[0], Void.TYPE);
                            return;
                        }
                        d.a().a(1, true);
                        d.a().a(2, true);
                        d.a().a(3, true);
                        d.a().a(4, true);
                    }
                }, 300);
            } else if (MediaStore.Images.Media.EXTERNAL_CONTENT_URI.equals(uri)) {
                this.f55255c = System.currentTimeMillis();
                this.f55254b.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55258a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f55258a, false, 58618, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f55258a, false, 58618, new Class[0], Void.TYPE);
                            return;
                        }
                        d.a().a(1, true);
                        d.a().a(2, true);
                        d.a().a(3, true);
                    }
                }, 300);
            } else if (MediaStore.Video.Media.EXTERNAL_CONTENT_URI.equals(uri)) {
                this.f55255c = System.currentTimeMillis();
                this.f55254b.postDelayed(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f55260a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f55260a, false, 58619, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f55260a, false, 58619, new Class[0], Void.TYPE);
                            return;
                        }
                        d.a().a(4, true);
                    }
                }, 300);
            } else {
                if ("content://media/external".equals(uri.toString())) {
                    this.f55255c = System.currentTimeMillis();
                    this.f55254b.postDelayed(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f55262a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f55262a, false, 58620, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f55262a, false, 58620, new Class[0], Void.TYPE);
                                return;
                            }
                            d.a().a(1, true);
                            d.a().a(2, true);
                            d.a().a(3, true);
                            d.a().a(4, true);
                        }
                    }, 300);
                }
            }
        }
    }
}
