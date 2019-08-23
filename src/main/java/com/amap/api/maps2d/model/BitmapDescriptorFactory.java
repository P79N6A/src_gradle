package com.amap.api.maps2d.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.FrameLayout;
import com.amap.api.mapcore2d.ai;
import com.amap.api.mapcore2d.ar;
import com.amap.api.mapcore2d.cm;
import java.io.FileInputStream;

public final class BitmapDescriptorFactory {
    public static BitmapDescriptor defaultMarker() {
        try {
            return fromAsset(ai.a.marker_default2d.name() + ".png");
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptorFactory", "defaultMarker");
            return null;
        }
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            return new BitmapDescriptor(bitmap);
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptorFactory", "fromBitmap");
            return null;
        }
    }

    public static BitmapDescriptor fromFile(String str) {
        try {
            Context context = ar.f5624a;
            if (context == null) {
                return null;
            }
            FileInputStream openFileInput = context.openFileInput(str);
            Bitmap decodeStream = BitmapFactory.decodeStream(openFileInput);
            openFileInput.close();
            return fromBitmap(decodeStream);
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptorFactory", "fromFile");
            return null;
        }
    }

    public static BitmapDescriptor fromPath(String str) {
        try {
            return fromBitmap(BitmapFactory.decodeFile(str));
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptorFactory", "fromPath");
            return null;
        }
    }

    public static BitmapDescriptor fromResource(int i) {
        try {
            Context context = ar.f5624a;
            if (context != null) {
                return fromBitmap(BitmapFactory.decodeStream(context.getResources().openRawResource(i)));
            }
            return null;
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptorFactory", "fromResource");
            return null;
        }
    }

    private static Bitmap a(View view) {
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            return view.getDrawingCache().copy(Bitmap.Config.ARGB_8888, false);
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptorFactory", "getViewBitmap");
            return null;
        }
    }

    public static BitmapDescriptor fromView(View view) {
        try {
            Context context = ar.f5624a;
            if (context == null) {
                return null;
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(view);
            frameLayout.destroyDrawingCache();
            return fromBitmap(a(frameLayout));
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptorFactory", "fromView");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        com.amap.api.mapcore2d.cm.a(r5, "BitmapDescriptorFactory", "fromAsset");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0021, B:18:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[SYNTHETIC, Splitter:B:21:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0042 A[Catch:{ all -> 0x003f, Throwable -> 0x0025 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.amap.api.maps2d.model.BitmapDescriptor fromAsset(java.lang.String r5) {
        /*
            java.lang.String r0 = "fromAsset"
            r1 = 0
            java.lang.Class<com.amap.api.maps2d.model.BitmapDescriptorFactory> r2 = com.amap.api.maps2d.model.BitmapDescriptorFactory.class
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            java.lang.String r4 = "/assets/"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            r3.append(r5)     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            java.lang.String r5 = r3.toString()     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            java.io.InputStream r5 = r2.getResourceAsStream(r5)     // Catch:{ Throwable -> 0x0032, all -> 0x002f }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ Throwable -> 0x002d }
            com.amap.api.maps2d.model.BitmapDescriptor r2 = fromBitmap(r2)     // Catch:{ Throwable -> 0x002d }
            if (r5 == 0) goto L_0x002c
            r5.close()     // Catch:{ Throwable -> 0x0025 }
            goto L_0x002c
        L_0x0025:
            r5 = move-exception
            java.lang.String r2 = "BitmapDescriptorFactory"
            com.amap.api.mapcore2d.cm.a(r5, r2, r0)
            return r1
        L_0x002c:
            return r2
        L_0x002d:
            r2 = move-exception
            goto L_0x0034
        L_0x002f:
            r2 = move-exception
            r5 = r1
            goto L_0x0040
        L_0x0032:
            r2 = move-exception
            r5 = r1
        L_0x0034:
            java.lang.String r3 = "BitmapDescriptorFactory"
            com.amap.api.mapcore2d.cm.a(r2, r3, r0)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x003e
            r5.close()     // Catch:{ Throwable -> 0x0025 }
        L_0x003e:
            return r1
        L_0x003f:
            r2 = move-exception
        L_0x0040:
            if (r5 == 0) goto L_0x0045
            r5.close()     // Catch:{ Throwable -> 0x0025 }
        L_0x0045:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.maps2d.model.BitmapDescriptorFactory.fromAsset(java.lang.String):com.amap.api.maps2d.model.BitmapDescriptor");
    }

    public static BitmapDescriptor defaultMarker(float f2) {
        try {
            float f3 = (float) ((((int) (f2 + 15.0f)) / 30) * 30);
            if (f3 > 330.0f) {
                f3 = 330.0f;
            } else if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            String str = "";
            if (f3 == 0.0f) {
                str = "RED";
            } else if (f3 == 30.0f) {
                str = "ORANGE";
            } else if (f3 == 60.0f) {
                str = "YELLOW";
            } else if (f3 == 120.0f) {
                str = "GREEN";
            } else if (f3 == 180.0f) {
                str = "CYAN";
            } else if (f3 == 210.0f) {
                str = "AZURE";
            } else if (f3 == 240.0f) {
                str = "BLUE";
            } else if (f3 == 270.0f) {
                str = "VIOLET";
            } else if (f3 == 300.0f) {
                str = "MAGENTAV";
            } else if (f3 == 330.0f) {
                str = "ROSE";
            }
            return fromAsset(str + "2d.png");
        } catch (Throwable th) {
            cm.a(th, "BitmapDescriptorFactory", "defaultMarker");
            return null;
        }
    }
}
