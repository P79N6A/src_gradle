package com.ss.android.ugc.aweme.viewshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.util.Base64;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import javax.annotation.Nullable;

public class ViewShot implements UIBlock {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76534a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f76535b = "ViewShot";

    /* renamed from: c  reason: collision with root package name */
    private static byte[] f76536c = new byte[65536];
    private static final Object p = new Object();
    private static final Set<Bitmap> q = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d  reason: collision with root package name */
    private final int f76537d;

    /* renamed from: e  reason: collision with root package name */
    private final String f76538e;
    @Formats

    /* renamed from: f  reason: collision with root package name */
    private final int f76539f;
    private final double g;
    private final Integer h;
    private final Integer i;
    private final File j;
    @Results
    private final String k;
    private final Promise l;
    private final Boolean m;
    private final ReactApplicationContext n;
    private final Activity o;

    public @interface Formats {

        /* renamed from: a  reason: collision with root package name */
        public static final Bitmap.CompressFormat[] f4309a = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    public @interface Results {
    }

    public static class a extends ByteArrayOutputStream {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76540a;

        public final byte[] a() {
            return this.buf;
        }

        public final void b(int i) {
            this.count = i;
        }

        public a(@NonNull byte[] bArr) {
            super(0);
            this.buf = bArr;
        }

        @NonNull
        public final ByteBuffer a(int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76540a, false, 89778, new Class[]{Integer.TYPE}, ByteBuffer.class)) {
                return (ByteBuffer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76540a, false, 89778, new Class[]{Integer.TYPE}, ByteBuffer.class);
            }
            if (this.buf.length < i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76540a, false, 89779, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76540a, false, 89779, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    int length = this.buf.length << 1;
                    if (length - i2 < 0) {
                        length = i2;
                    }
                    if (length - 2147483639 > 0) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f76540a, true, 89780, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                            length = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f76540a, true, 89780, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                        } else if (i2 < 0) {
                            throw new OutOfMemoryError();
                        } else if (i2 > 2147483639) {
                            length = Integer.MAX_VALUE;
                        } else {
                            length = 2147483639;
                        }
                    }
                    this.buf = Arrays.copyOf(this.buf, length);
                }
            }
            return ByteBuffer.wrap(this.buf);
        }
    }

    private static void a(@NonNull Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, null, f76534a, true, 89775, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, null, f76534a, true, 89775, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        synchronized (p) {
            q.add(bitmap2);
        }
    }

    @NonNull
    private List<View> b(@NonNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f76534a, false, 89770, new Class[]{View.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{view2}, this, f76534a, false, 89770, new Class[]{View.class}, List.class);
        } else if (!(view2 instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            return arrayList;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                arrayList2.addAll(b(viewGroup.getChildAt(i2)));
            }
            return arrayList2;
        }
    }

    public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        View resolveView;
        int i2;
        String str;
        NativeViewHierarchyManager nativeViewHierarchyManager2 = nativeViewHierarchyManager;
        if (PatchProxy.isSupport(new Object[]{nativeViewHierarchyManager2}, this, f76534a, false, 89765, new Class[]{NativeViewHierarchyManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nativeViewHierarchyManager2}, this, f76534a, false, 89765, new Class[]{NativeViewHierarchyManager.class}, Void.TYPE);
            return;
        }
        if (this.f76537d == -1) {
            resolveView = this.o.getWindow().getDecorView().findViewById(16908290);
        } else {
            resolveView = nativeViewHierarchyManager2.resolveView(this.f76537d);
        }
        View view = resolveView;
        if (view == null) {
            Promise promise = this.l;
            promise.reject("E_UNABLE_TO_SNAPSHOT", "No view found with reactTag: " + this.f76537d);
            return;
        }
        try {
            a aVar = new a(f76536c);
            if (PatchProxy.isSupport(new Object[]{view}, null, f76534a, true, 89774, new Class[]{View.class}, Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{view}, null, f76534a, true, 89774, new Class[]{View.class}, Integer.TYPE)).intValue();
            } else {
                i2 = Math.min(view.getWidth() * view.getHeight() * 4, 32);
            }
            aVar.b(i2);
            f76536c = aVar.a();
            if ("tmpfile".equals(this.k) && -1 == this.f76539f) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f76534a, false, 89767, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f76534a, false, 89767, new Class[]{View.class}, Void.TYPE);
                } else {
                    String uri = Uri.fromFile(this.j).toString();
                    FileOutputStream fileOutputStream = new FileOutputStream(this.j);
                    a aVar2 = new a(f76536c);
                    Point a2 = a(view, (OutputStream) aVar2);
                    f76536c = aVar2.a();
                    int size = aVar2.size();
                    fileOutputStream.write(String.format(Locale.US, "%d:%d|", new Object[]{Integer.valueOf(a2.x), Integer.valueOf(a2.y)}).getBytes(Charset.forName("US-ASCII")));
                    fileOutputStream.write(f76536c, 0, size);
                    fileOutputStream.close();
                    this.l.resolve(uri);
                }
            } else if (!"tmpfile".equals(this.k) || -1 == this.f76539f) {
                if (!"base64".equals(this.k)) {
                    if (!"zip-base64".equals(this.k)) {
                        if ("data-uri".equals(this.k)) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f76534a, false, 89768, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f76534a, false, 89768, new Class[]{View.class}, Void.TYPE);
                            }
                            a aVar3 = new a(f76536c);
                            a(view, (OutputStream) aVar3);
                            f76536c = aVar3.a();
                            String encodeToString = Base64.encodeToString(f76536c, 0, aVar3.size(), 2);
                            if ("jpg".equals(this.f76538e)) {
                                str = "jpeg";
                            } else {
                                str = this.f76538e;
                            }
                            Promise promise2 = this.l;
                            promise2.resolve("data:image/" + str + ";base64," + encodeToString);
                        }
                    }
                }
                a(view);
            } else {
                if (PatchProxy.isSupport(new Object[]{view}, this, f76534a, false, 89766, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f76534a, false, 89766, new Class[]{View.class}, Void.TYPE);
                } else {
                    a(view, (OutputStream) new FileOutputStream(this.j));
                    this.l.resolve(Uri.fromFile(this.j).toString());
                }
            }
        } catch (Throwable unused) {
            this.l.reject("E_UNABLE_TO_SNAPSHOT", "Failed to capture view snapshot");
        }
    }

    private void a(@NonNull View view) throws IOException {
        boolean z;
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f76534a, false, 89769, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f76534a, false, 89769, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (-1 == this.f76539f) {
            z = true;
        } else {
            z = false;
        }
        boolean equals = "zip-base64".equals(this.k);
        a aVar = new a(f76536c);
        Point a2 = a(view, (OutputStream) aVar);
        f76536c = aVar.a();
        int size = aVar.size();
        String format = String.format(Locale.US, "%d:%d|", new Object[]{Integer.valueOf(a2.x), Integer.valueOf(a2.y)});
        if (!z) {
            format = "";
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(f76536c, 0, size);
            deflater.finish();
            a aVar2 = new a(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                aVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = format + Base64.encodeToString(aVar2.a(), 0, aVar2.size(), 2);
        } else {
            str = format + Base64.encodeToString(f76536c, 0, size, 2);
        }
        this.l.resolve(str);
    }

    @NonNull
    private static Bitmap a(int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f76534a, true, 89776, new Class[]{Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f76534a, true, 89776, new Class[]{Integer.TYPE, Integer.TYPE}, Bitmap.class);
        }
        synchronized (p) {
            for (Bitmap next : q) {
                if (next.getWidth() >= i4 && next.getHeight() >= i5) {
                    q.remove(next);
                    next.eraseColor(0);
                    return next;
                }
            }
            return Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        }
    }

    @NonNull
    private static Bitmap b(int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f76534a, true, 89777, new Class[]{Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
            return (Bitmap) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f76534a, true, 89777, new Class[]{Integer.TYPE, Integer.TYPE}, Bitmap.class);
        }
        synchronized (p) {
            for (Bitmap next : q) {
                if (next.getWidth() == i4 && next.getHeight() == i5) {
                    q.remove(next);
                    next.eraseColor(0);
                    return next;
                }
            }
            return Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        }
    }

    private Point b(@NonNull View view, @NonNull OutputStream outputStream) {
        View view2 = view;
        OutputStream outputStream2 = outputStream;
        if (PatchProxy.isSupport(new Object[]{view2, outputStream2}, this, f76534a, false, 89772, new Class[]{View.class, OutputStream.class}, Point.class)) {
            return (Point) PatchProxy.accessDispatch(new Object[]{view2, outputStream2}, this, f76534a, false, 89772, new Class[]{View.class, OutputStream.class}, Point.class);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("Impossible to snapshot the view: view is invalid");
        }
        if (this.m.booleanValue()) {
            ScrollView scrollView = (ScrollView) view2;
            int i2 = 0;
            for (int i3 = 0; i3 < scrollView.getChildCount(); i3++) {
                i2 += scrollView.getChildAt(i3).getHeight();
            }
            height = i2;
        }
        Point point = new Point(width, height);
        Bitmap a2 = a(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(a2);
        view2.draw(canvas);
        for (View next : b(view)) {
            if ((next instanceof TextureView) && next.getVisibility() == 0) {
                TextureView textureView = (TextureView) next;
                textureView.setOpaque(false);
                Bitmap bitmap = textureView.getBitmap(b(next.getWidth(), next.getHeight()));
                int save = canvas.save();
                a(canvas, view2, next);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                canvas.restoreToCount(save);
                a(bitmap);
            }
        }
        if (!(this.h == null || this.i == null || (this.h.intValue() == width && this.i.intValue() == height))) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a2, this.h.intValue(), this.i.intValue(), true);
            a(a2);
            a2 = createScaledBitmap;
        }
        if (-1 != this.f76539f || !(outputStream2 instanceof a)) {
            a2.compress(Formats.f4309a[this.f76539f], (int) (this.g * 100.0d), outputStream2);
        } else {
            int i4 = width * height * 4;
            a aVar = (a) outputStream2;
            a2.copyPixelsToBuffer(aVar.a(i4));
            aVar.b(i4);
        }
        a(a2);
        return point;
    }

    private Point a(@NonNull View view, @NonNull OutputStream outputStream) throws IOException {
        String str;
        if (PatchProxy.isSupport(new Object[]{view, outputStream}, this, f76534a, false, 89771, new Class[]{View.class, OutputStream.class}, Point.class)) {
            return (Point) PatchProxy.accessDispatch(new Object[]{view, outputStream}, this, f76534a, false, 89771, new Class[]{View.class, OutputStream.class}, Point.class);
        }
        try {
            String str2 = f76535b;
            try {
                Activity activity = this.o;
                if (PatchProxy.isSupport(new Object[]{activity}, null, a.f76541a, true, 89749, new Class[]{Activity.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{activity}, null, a.f76541a, true, 89749, new Class[]{Activity.class}, String.class);
                } else {
                    View findViewById = activity.findViewById(16908290);
                    if (findViewById == null) {
                        str = "Activity [" + activity.getClass().getSimpleName() + "] is not initialized yet. ";
                    } else {
                        str = a.a(findViewById);
                    }
                }
                a.a(str2, str);
                Point b2 = b(view, outputStream);
                outputStream.close();
                return b2;
            } catch (Throwable th) {
                th = th;
                outputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream.close();
            throw th;
        }
    }

    @NonNull
    private Matrix a(Canvas canvas, @NonNull View view, @NonNull View view2) {
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{canvas2, view3, view4}, this, f76534a, false, 89773, new Class[]{Canvas.class, View.class, View.class}, Matrix.class)) {
            return (Matrix) PatchProxy.accessDispatch(new Object[]{canvas2, view3, view4}, this, f76534a, false, 89773, new Class[]{Canvas.class, View.class, View.class}, Matrix.class);
        }
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view5 = view4;
        do {
            linkedList.add(view5);
            view5 = (View) view5.getParent();
        } while (view5 != view3);
        Collections.reverse(linkedList);
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            View view6 = (View) it2.next();
            canvas.save();
            int left = view6.getLeft();
            if (view6 != view4) {
                i2 = view6.getPaddingLeft();
            } else {
                i2 = 0;
            }
            float translationX = ((float) (left + i2)) + view6.getTranslationX();
            int top = view6.getTop();
            if (view6 != view4) {
                i3 = view6.getPaddingTop();
            } else {
                i3 = 0;
            }
            float translationY = ((float) (top + i3)) + view6.getTranslationY();
            canvas2.translate(translationX, translationY);
            canvas2.rotate(view6.getRotation(), view6.getPivotX(), view6.getPivotY());
            canvas2.scale(view6.getScaleX(), view6.getScaleY());
            matrix.postTranslate(translationX, translationY);
            matrix.postRotate(view6.getRotation(), view6.getPivotX(), view6.getPivotY());
            matrix.postScale(view6.getScaleX(), view6.getScaleY());
        }
        return matrix;
    }

    public ViewShot(int i2, String str, @Formats int i3, double d2, @Nullable Integer num, @Nullable Integer num2, File file, @Results String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, Promise promise) {
        this.f76537d = i2;
        this.f76538e = str;
        this.f76539f = i3;
        this.g = d2;
        this.h = num;
        this.i = num2;
        this.j = file;
        this.k = str2;
        this.m = bool;
        this.n = reactApplicationContext;
        this.o = activity;
        this.l = promise;
    }
}
