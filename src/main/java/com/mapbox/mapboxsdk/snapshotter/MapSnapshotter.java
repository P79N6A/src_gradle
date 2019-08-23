package com.mapbox.mapboxsdk.snapshotter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Handler;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v4.content.res.ResourcesCompat;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mapbox.mapboxsdk.a.c;
import com.mapbox.mapboxsdk.a.d;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.aa;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.utils.f;
import com.ss.android.ugc.aweme.C0906R;

@UiThread
public class MapSnapshotter {

    /* renamed from: a  reason: collision with root package name */
    final Context f26772a;

    /* renamed from: b  reason: collision with root package name */
    public d f26773b;

    /* renamed from: c  reason: collision with root package name */
    private a f26774c;
    @Keep
    private long nativePtr;

    public interface a {
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        public Bitmap f26777a;

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f26778b;

        /* renamed from: c  reason: collision with root package name */
        public float f26779c;

        public b(Bitmap bitmap, Bitmap bitmap2, float f2) {
            this.f26777a = bitmap;
            this.f26778b = bitmap2;
            this.f26779c = f2;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public float f26781a = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f26782b;

        /* renamed from: c  reason: collision with root package name */
        public int f26783c;

        /* renamed from: d  reason: collision with root package name */
        public String f26784d = "mapbox://styles/mapbox/streets-v10";

        /* renamed from: e  reason: collision with root package name */
        public String f26785e;

        /* renamed from: f  reason: collision with root package name */
        public LatLngBounds f26786f;
        public CameraPosition g;
        public boolean h = true;
        public String i;
        public String j;

        public c(int i2, int i3) {
            if (i2 == 0 || i3 == 0) {
                throw new IllegalArgumentException("Unable to create a snapshot with width or height set to 0");
            }
            this.f26782b = i2;
            this.f26783c = i3;
        }
    }

    public interface d {
        void a(MapSnapshot mapSnapshot);
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize() throws Throwable;

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeCancel();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeInitialize(MapSnapshotter mapSnapshotter, FileSource fileSource, float f2, int i, int i2, String str, String str2, LatLngBounds latLngBounds, CameraPosition cameraPosition, boolean z, String str3, String str4);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeStart();

    @Keep
    public native void setCameraPosition(CameraPosition cameraPosition);

    @Keep
    public native void setRegion(LatLngBounds latLngBounds);

    @Keep
    public native void setSize(int i, int i2);

    @Keep
    public native void setStyleJson(String str);

    @Keep
    public native void setStyleUrl(String str);

    private static void b() {
        f.a("MapSnapshotter");
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f26773b = null;
        this.f26774c = null;
    }

    /* access modifiers changed from: protected */
    @Keep
    public void onSnapshotFailed(String str) {
        if (this.f26774c != null) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void onSnapshotReady(final MapSnapshot mapSnapshot) {
        new Handler().post(new Runnable() {
            public final void run() {
                TextView textView;
                if (MapSnapshotter.this.f26773b != null) {
                    MapSnapshotter mapSnapshotter = MapSnapshotter.this;
                    MapSnapshot mapSnapshot = mapSnapshot;
                    Bitmap bitmap = mapSnapshot.f26769a;
                    Canvas canvas = new Canvas(bitmap);
                    int i = ((int) mapSnapshotter.f26772a.getResources().getDisplayMetrics().density) * 4;
                    Bitmap decodeResource = BitmapFactory.decodeResource(mapSnapshotter.f26772a.getResources(), 2130840261, null);
                    DisplayMetrics displayMetrics = mapSnapshotter.f26772a.getResources().getDisplayMetrics();
                    float min = Math.min((((float) decodeResource.getWidth()) / ((float) (displayMetrics.widthPixels / bitmap.getWidth()))) / ((float) decodeResource.getWidth()), (((float) decodeResource.getHeight()) / ((float) (displayMetrics.heightPixels / bitmap.getHeight()))) / ((float) decodeResource.getHeight())) * 2.0f;
                    if (min > 1.0f) {
                        min = 1.0f;
                    } else if (min < 0.6f) {
                        min = 0.6f;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postScale(min, min);
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(mapSnapshotter.f26772a.getResources(), 2130840260, null);
                    b bVar = new b(Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true), Bitmap.createBitmap(decodeResource2, 0, 0, decodeResource2.getWidth(), decodeResource2.getHeight(), matrix, true), min);
                    TextView a2 = mapSnapshotter.a(mapSnapshot, false, bVar.f26779c);
                    TextView a3 = mapSnapshotter.a(mapSnapshot, true, bVar.f26779c);
                    c.a aVar = new c.a();
                    aVar.f26392a = bitmap;
                    aVar.f26393b = bVar.f26777a;
                    aVar.f26394c = bVar.f26778b;
                    aVar.f26395d = a2;
                    aVar.f26396e = a3;
                    float f2 = (float) i;
                    aVar.f26397f = f2;
                    com.mapbox.mapboxsdk.a.c cVar = new com.mapbox.mapboxsdk.a.c(aVar.f26392a, aVar.f26393b, aVar.f26394c, aVar.f26395d, aVar.f26396e, aVar.f26397f);
                    com.mapbox.mapboxsdk.a.b a4 = cVar.a();
                    if (mapSnapshot.f26771c) {
                        Bitmap bitmap2 = mapSnapshot.f26769a;
                        Bitmap bitmap3 = a4.f26383a;
                        if (bitmap3 != null) {
                            canvas.drawBitmap(bitmap3, f2, (float) ((bitmap2.getHeight() - bitmap3.getHeight()) - i), null);
                        }
                    }
                    PointF pointF = a4.f26384b;
                    if (pointF != null) {
                        canvas.save();
                        canvas.translate(pointF.x, pointF.y);
                        if (cVar.g) {
                            textView = cVar.f26390e;
                        } else {
                            textView = cVar.f26389d;
                        }
                        textView.draw(canvas);
                        canvas.restore();
                    } else {
                        Bitmap bitmap4 = mapSnapshot.f26769a;
                        Logger.e("Mbgl-MapSnapshotter", String.format("Could not generate attribution for snapshot size: %s x %s. You are required to provide your own attribution for the used sources: %s", new Object[]{Integer.valueOf(bitmap4.getWidth()), Integer.valueOf(bitmap4.getHeight()), mapSnapshot.f26770b}));
                    }
                    MapSnapshotter.this.f26773b.a(mapSnapshot);
                    MapSnapshotter.this.a();
                }
            }
        });
    }

    public final void a(@NonNull d dVar) {
        if (this.f26773b == null) {
            b();
            this.f26773b = dVar;
            this.f26774c = null;
            nativeStart();
            return;
        }
        throw new IllegalStateException("Snapshotter was already started");
    }

    private static String a(MapSnapshot mapSnapshot, boolean z) {
        return new d.a().a(mapSnapshot.f26770b).b(false).a(false).a().a(z);
    }

    public MapSnapshotter(@NonNull Context context, @NonNull c cVar) {
        c cVar2 = cVar;
        b();
        this.f26772a = context.getApplicationContext();
        aa d2 = com.mapbox.mapboxsdk.d.d();
        if (d2 != null) {
            d2.a();
        }
        FileSource a2 = FileSource.a(context);
        String str = cVar2.j;
        if (!TextUtils.isEmpty(str)) {
            a2.setApiBaseUrl(str);
        }
        nativeInitialize(this, a2, cVar2.f26781a, cVar2.f26782b, cVar2.f26783c, cVar2.f26784d, cVar2.f26785e, cVar2.f26786f, cVar2.g, cVar2.h, FileSource.c(context), cVar2.i);
    }

    /* access modifiers changed from: package-private */
    public TextView a(MapSnapshot mapSnapshot, boolean z, float f2) {
        int color = ResourcesCompat.getColor(this.f26772a.getResources(), C0906R.color.sp, this.f26772a.getTheme());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = new TextView(this.f26772a);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setSingleLine(true);
        textView.setTextSize(f2 * 10.0f);
        textView.setTextColor(color);
        textView.setBackgroundResource(2130840268);
        textView.setText(Html.fromHtml(a(mapSnapshot, z)));
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        return textView;
    }
}
