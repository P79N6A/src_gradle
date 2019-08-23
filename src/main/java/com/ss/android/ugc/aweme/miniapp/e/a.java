package com.ss.android.ugc.aweme.miniapp.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.picasso.Dispatcher;
import com.squareup.picasso.ab;
import com.squareup.picasso.ad;
import com.squareup.picasso.e;
import com.squareup.picasso.l;
import com.squareup.picasso.s;
import com.squareup.picasso.u;
import com.squareup.picasso.z;
import com.tt.essential.BitmapLoadCallback;
import com.tt.miniapphost.AppbrandContext;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55742a;
    @SuppressLint({"CI_StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static volatile s f55743b;

    /* renamed from: c  reason: collision with root package name */
    private static l f55744c = new l((Context) AppbrandContext.getInst().getApplicationContext());

    /* renamed from: com.ss.android.ugc.aweme.miniapp.e.a$a  reason: collision with other inner class name */
    public static class C0639a implements e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55745a;

        /* renamed from: b  reason: collision with root package name */
        BitmapLoadCallback f55746b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f55745a, false, 59408, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55745a, false, 59408, new Class[0], Void.TYPE);
                return;
            }
            if (this.f55746b != null) {
                this.f55746b.onSuccess();
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f55745a, false, 59409, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55745a, false, 59409, new Class[0], Void.TYPE);
                return;
            }
            if (this.f55746b != null) {
                this.f55746b.onFail(new Exception("load fail"));
            }
        }

        public C0639a(BitmapLoadCallback bitmapLoadCallback) {
            this.f55746b = bitmapLoadCallback;
        }
    }

    public static class b implements ab {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55747a;

        /* renamed from: b  reason: collision with root package name */
        private float f55748b;

        public final String a() {
            return "bitmapAngle()";
        }

        public b(float f2) {
            this.f55748b = f2;
        }

        public final Bitmap a(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f55747a, false, 59410, new Class[]{Bitmap.class}, Bitmap.class)) {
                return (Bitmap) PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f55747a, false, 59410, new Class[]{Bitmap.class}, Bitmap.class);
            }
            float f2 = this.f55748b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(rect);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f2, f2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap2, rect, rect, paint);
            bitmap.recycle();
            return createBitmap;
        }
    }

    public static s a() {
        if (PatchProxy.isSupport(new Object[0], null, f55742a, true, 59406, new Class[0], s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[0], null, f55742a, true, 59406, new Class[0], s.class);
        }
        if (f55743b == null) {
            synchronized (a.class) {
                if (f55743b == null) {
                    s.a aVar = new s.a(AppbrandContext.getInst().getApplicationContext());
                    l lVar = f55744c;
                    if (lVar == null) {
                        throw new IllegalArgumentException("Memory cache must not be null.");
                    } else if (aVar.f27446d == null) {
                        aVar.f27446d = lVar;
                        Context context = aVar.f27443a;
                        if (aVar.f27444b == null) {
                            aVar.f27444b = ad.a(context);
                        }
                        if (aVar.f27446d == null) {
                            aVar.f27446d = new l(context);
                        }
                        if (aVar.f27445c == null) {
                            aVar.f27445c = new u();
                        }
                        if (aVar.f27448f == null) {
                            aVar.f27448f = s.f.f27453a;
                        }
                        z zVar = new z(aVar.f27446d);
                        Dispatcher dispatcher = new Dispatcher(context, aVar.f27445c, s.f27437a, aVar.f27444b, aVar.f27446d, zVar);
                        s sVar = new s(context, dispatcher, aVar.f27446d, aVar.f27447e, aVar.f27448f, aVar.g, zVar, aVar.h, aVar.i, aVar.j);
                        f55743b = sVar;
                    } else {
                        throw new IllegalStateException("Memory cache already set.");
                    }
                }
            }
        }
        return f55743b;
    }
}
