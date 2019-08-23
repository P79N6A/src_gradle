package com.amap.api.mapcore2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.amap.api.maps2d.MapsInitializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public class az {

    /* renamed from: a  reason: collision with root package name */
    static double f5663a = 0.6499999761581421d;

    /* renamed from: b  reason: collision with root package name */
    public d f5664b;

    /* renamed from: c  reason: collision with root package name */
    public c f5665c;

    /* renamed from: d  reason: collision with root package name */
    public b f5666d;

    /* renamed from: e  reason: collision with root package name */
    public a f5667e;

    /* renamed from: f  reason: collision with root package name */
    public v f5668f;
    public b g;
    public av h = new av(this.f5665c);
    /* access modifiers changed from: private */
    public an i;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public bn<an> f5669a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5670b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5671c;

        /* renamed from: d  reason: collision with root package name */
        String f5672d;

        /* renamed from: e  reason: collision with root package name */
        int f5673e;

        /* renamed from: f  reason: collision with root package name */
        int f5674f;
        String g;
        String h;
        String i;
        String j;
        private boolean l;
        private boolean m;
        private Context n;
        /* access modifiers changed from: private */
        public boolean o;

        private int c() {
            return 3;
        }

        public boolean a(int i2, KeyEvent keyEvent) {
            return false;
        }

        public boolean a(MotionEvent motionEvent) {
            return false;
        }

        public boolean b(int i2, KeyEvent keyEvent) {
            return false;
        }

        /* access modifiers changed from: protected */
        public boolean b(MotionEvent motionEvent) {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean a(String str, boolean z) {
            if (str.equals("")) {
                return false;
            }
            int size = this.f5669a.size();
            for (int i2 = 0; i2 < size; i2++) {
                an anVar = (an) this.f5669a.get(i2);
                if (anVar != null && anVar.f5598b.equals(str)) {
                    anVar.a(z);
                    if (!anVar.f5601e) {
                        return true;
                    }
                    if (z) {
                        if (anVar.f5599c > anVar.f5600d) {
                            az.this.f5665c.a(anVar.f5599c);
                            az.this.f5665c.b(anVar.f5600d);
                        }
                        c(str);
                        az.this.f5665c.a(false, false);
                        return true;
                    }
                }
            }
            return false;
        }

        private void d() {
            int size = this.f5669a.size();
            for (int i2 = 0; i2 < size; i2++) {
                an anVar = (an) this.f5669a.get(i2);
                if (anVar != null) {
                    anVar.l = i2;
                }
            }
        }

        public void b() {
            if (az.this.f5665c != null && az.this.f5665c.f5682c != null) {
                az.this.f5665c.f5682c.postInvalidate();
            }
        }

        public void a() {
            if (az.this.f5667e.f5669a != null) {
                Iterator it2 = az.this.f5667e.f5669a.iterator();
                while (it2.hasNext()) {
                    an anVar = (an) it2.next();
                    if (anVar != null) {
                        anVar.b();
                    }
                }
                az.this.f5667e.f5669a.clear();
                az.this.f5667e.f5669a = null;
            }
        }

        public void b(boolean z) {
            this.m = z;
        }

        public void a(boolean z) {
            this.l = z;
        }

        private void b(Canvas canvas) {
            if (this.m) {
                az.this.f5668f.a(canvas);
            }
        }

        private void c(Canvas canvas) {
            az.this.g.j.a(canvas);
        }

        private void a(Canvas canvas) {
            int size = this.f5669a.size();
            for (int i2 = 0; i2 < size; i2++) {
                an anVar = (an) this.f5669a.get(i2);
                if (anVar != null && anVar.a()) {
                    anVar.a(canvas);
                }
            }
        }

        private void c(String str) {
            if (!str.equals("")) {
                int size = this.f5669a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    an anVar = (an) this.f5669a.get(i2);
                    if (anVar != null && !anVar.f5598b.equals(str) && anVar.f5601e && anVar.a()) {
                        anVar.a(false);
                    }
                }
            }
        }

        private boolean d(String str) {
            if (this.f5669a == null) {
                return false;
            }
            int size = this.f5669a.size();
            for (int i2 = 0; i2 < size; i2++) {
                an anVar = (an) this.f5669a.get(i2);
                if (anVar != null && anVar.f5598b.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public an b(String str) {
            if (str.equals("") || this.f5669a == null || this.f5669a.size() == 0) {
                return null;
            }
            int size = this.f5669a.size();
            for (int i2 = 0; i2 < size; i2++) {
                an anVar = (an) this.f5669a.get(i2);
                if (anVar != null && anVar.f5598b.equals(str)) {
                    return anVar;
                }
            }
            return null;
        }

        public void a(String str) {
            if (str != null && !str.equals("") && !this.f5672d.equals(str)) {
                if (str.equals("zh_cn") || str.equals("en")) {
                    if (q.g != null && !q.g.equals("")) {
                        this.g = q.g;
                    } else if (str.equals("zh_cn")) {
                        this.g = "GridMapV3";
                    } else if (str.equals("en")) {
                        this.g = "GridMapEnV3";
                    }
                    an unused = az.this.i = b(this.g);
                    if (az.this.i == null) {
                        an unused2 = az.this.i = new an(az.this.h);
                        az.this.i.q = new bv(az.this, az.this.i);
                        az.this.i.j = new cb() {
                            public String a(int i, int i2, int i3) {
                                if (q.h == null || q.h.equals("")) {
                                    String b2 = ax.a().b();
                                    return String.format(Locale.US, b2, new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), a.this.f5672d});
                                }
                                return String.format(Locale.US, q.h, new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2)});
                            }
                        };
                        if (q.h == null || q.h.equals("")) {
                            az.this.i.h = true;
                        } else {
                            az.this.i.h = false;
                        }
                        az.this.i.f5598b = this.g;
                        az.this.i.f5601e = true;
                        az.this.i.a(true);
                        az.this.i.f5602f = true;
                        az.this.i.f5599c = q.f6268c;
                        az.this.i.f5600d = q.f6269d;
                        a(az.this.i, this.n);
                    }
                    a(this.g, true);
                    this.f5672d = str;
                }
            }
        }

        private a(Context context) {
            this.m = true;
            this.f5672d = "zh_cn";
            this.h = "SatelliteMap3";
            this.i = "GridTmc3";
            this.j = "SateliteTmc3";
            if (context != null) {
                this.n = context;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                int c2 = (displayMetrics.widthPixels / az.this.h.f5643a) + c();
                int c3 = (displayMetrics.heightPixels / az.this.h.f5643a) + c();
                this.f5673e = (c2 * c3) + c2 + c3;
                this.f5674f = (this.f5673e / 8) + 1;
                if (this.f5674f == 0) {
                    this.f5674f = 1;
                } else if (this.f5674f > 5) {
                    this.f5674f = 5;
                }
                a(context, "zh_cn");
            }
        }

        private void a(Context context, String str) {
            if (this.f5669a == null) {
                this.f5669a = new bn<>();
            }
            if (q.g != null && !q.g.equals("")) {
                this.g = q.g;
            } else if (str.equals("zh_cn")) {
                this.g = "GridMapV3";
            } else if (str.equals("en")) {
                this.g = "GridMapEnV3";
            }
            an anVar = new an(az.this.h);
            anVar.j = new cb() {
                public String a(int i, int i2, int i3) {
                    if (q.h == null || q.h.equals("")) {
                        String b2 = ax.a().b();
                        return String.format(Locale.US, b2, new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), a.this.f5672d});
                    }
                    return String.format(Locale.US, q.h, new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2)});
                }
            };
            if (q.h == null || q.h.equals("")) {
                anVar.h = true;
            } else {
                anVar.h = false;
            }
            anVar.f5598b = this.g;
            anVar.f5601e = true;
            anVar.f5602f = true;
            anVar.f5599c = q.f6268c;
            anVar.f5600d = q.f6269d;
            anVar.q = new bv(az.this, anVar);
            anVar.a(true);
            a(anVar, context);
        }

        /* access modifiers changed from: package-private */
        public boolean a(an anVar, Context context) {
            boolean z = false;
            if (anVar == null || anVar.f5598b.equals("") || d(anVar.f5598b)) {
                return false;
            }
            anVar.p = new bn<>();
            ba baVar = new ba(this.f5673e, this.f5674f, anVar.g, anVar.i, anVar);
            anVar.n = baVar;
            anVar.o = new u(context, az.this.f5665c.f5682c.f5690d, anVar);
            anVar.o.a(anVar.n);
            int size = this.f5669a.size();
            if (anVar.f5601e && size != 0) {
                int i2 = size - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    }
                    an anVar2 = (an) this.f5669a.get(i2);
                    if (anVar2 != null && anVar2.f5601e) {
                        this.f5669a.add(i2, anVar);
                        break;
                    }
                    i2--;
                }
            } else {
                z = this.f5669a.add(anVar);
            }
            d();
            if (anVar.a()) {
                a(anVar.f5598b, true);
            }
            return z;
        }

        public void a(Canvas canvas, Matrix matrix, float f2, float f3) {
            try {
                if (this.l) {
                    canvas.save();
                    canvas.translate(f2, f3);
                    canvas.concat(matrix);
                    a(canvas);
                    if (az.this.g.i.a()) {
                        b(canvas);
                    }
                    az.this.g.i.a(canvas);
                    canvas.restore();
                    if (!az.this.g.i.a()) {
                        b(canvas);
                    }
                    if (!this.f5670b && !this.f5671c) {
                        a(false);
                        az.this.f5665c.f5682c.b(new Matrix());
                        az.this.f5665c.f5682c.c(1.0f);
                        az.this.f5665c.f5682c.p();
                    }
                } else {
                    a(canvas);
                    az.this.g.i.a(canvas);
                    b(canvas);
                }
                c(canvas);
            } catch (Throwable th) {
                cm.a(th, "Mediator", "draw");
            }
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5677a;

        /* renamed from: b  reason: collision with root package name */
        int f5678b;

        public void b() {
            az.this.f5665c.f5680a = false;
            if (az.this.f5667e.f5669a != null && az.this.f5667e.f5669a.size() != 0) {
                int size = az.this.f5667e.f5669a.size();
                for (int i = 0; i < size; i++) {
                    ((an) az.this.f5667e.f5669a.get(i)).q.b();
                }
            }
        }

        public void c() {
            if (az.this.f5667e.f5669a != null && az.this.f5667e.f5669a.size() != 0) {
                try {
                    int size = az.this.f5667e.f5669a.size();
                    for (int i = 0; i < size; i++) {
                        ((an) az.this.f5667e.f5669a.get(i)).q.d();
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public void d() {
            if (az.this.f5667e.f5669a != null && az.this.f5667e.f5669a.size() != 0) {
                int size = az.this.f5667e.f5669a.size();
                for (int i = 0; i < size; i++) {
                    an anVar = (an) az.this.f5667e.f5669a.get(i);
                    if (anVar != null) {
                        bv bvVar = anVar.q;
                        if (bvVar != null) {
                            bvVar.c();
                        }
                    }
                }
            }
        }

        public void e() {
            if (az.this.f5667e.f5669a != null && az.this.f5667e.f5669a.size() != 0) {
                int size = az.this.f5667e.f5669a.size();
                for (int i = 0; i < size; i++) {
                    an anVar = (an) az.this.f5667e.f5669a.get(i);
                    if (anVar != null) {
                        bv bvVar = anVar.q;
                        if (bvVar != null) {
                            bvVar.h();
                        }
                    }
                }
            }
        }

        public void a() {
            if (az.this.f5667e.o) {
                az.this.f5667e.b();
            }
            this.f5678b++;
            if (this.f5678b >= 20 && this.f5678b % 20 == 0 && az.this.f5667e.f5669a != null && az.this.f5667e.f5669a.size() != 0) {
                int size = az.this.f5667e.f5669a.size();
                for (int i = 0; i < size; i++) {
                    ((an) az.this.f5667e.f5669a.get(i)).q.i();
                }
            }
        }

        public b() {
            e();
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5680a;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public b f5682c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<cc> f5683d;

        public int c() {
            return q.n;
        }

        public int d() {
            return q.o;
        }

        public b g() {
            return this.f5682c;
        }

        public int a() {
            try {
                return az.this.h.i;
            } catch (Throwable th) {
                cm.a(th, "Mediator", "getMaxZoomLevel");
                return 0;
            }
        }

        public int b() {
            try {
                return az.this.h.h;
            } catch (Throwable th) {
                cm.a(th, "Mediator", "getMinZoomLevel");
                return 0;
            }
        }

        public float e() {
            try {
                return az.this.h.j;
            } catch (Throwable th) {
                cm.a(th, "Mediator", "getZoomLevel");
                return 0.0f;
            }
        }

        public w f() {
            w b2 = az.this.h.b(az.this.h.l);
            if (az.this.f5666d == null || !az.this.f5666d.f5677a) {
                return b2;
            }
            return az.this.h.m;
        }

        public void a(cc ccVar) {
            this.f5683d.add(ccVar);
        }

        public void b(cc ccVar) {
            this.f5683d.remove(ccVar);
        }

        public void a(int i) {
            if (i > 0) {
                try {
                    az.this.h.i = i;
                    q.a(i);
                } catch (Throwable th) {
                    cm.a(th, "Mediator", "setMaxZoomLevel");
                }
            }
        }

        public void b(int i) {
            if (i > 0) {
                try {
                    az.this.h.h = i;
                    q.b(i);
                } catch (Throwable th) {
                    cm.a(th, "Mediator", "setMinZoomLevel");
                }
            }
        }

        public void b(w wVar) {
            w f2 = az.this.f5665c.f();
            if (wVar != null && !wVar.equals(f2)) {
                if (q.s) {
                    az.this.h.l = az.this.h.a(wVar);
                }
                a(false, true);
            }
        }

        public void a(float f2) {
            double d2;
            if (f2 != az.this.h.j) {
                az.this.h.j = f2;
                int i = (int) f2;
                double d3 = az.this.h.f5646d;
                double d4 = (double) (1 << i);
                Double.isNaN(d4);
                double d5 = d3 / d4;
                float f3 = f2 - ((float) i);
                double d6 = (double) f3;
                if (d6 < az.f5663a) {
                    av avVar = az.this.h;
                    double d7 = (double) az.this.h.f5644b;
                    Double.isNaN(d6);
                    Double.isNaN(d7);
                    avVar.f5643a = (int) (d7 * ((d6 * 0.4d) + 1.0d));
                    double d8 = (double) az.this.h.f5643a;
                    double d9 = (double) az.this.h.f5644b;
                    Double.isNaN(d8);
                    Double.isNaN(d9);
                    d2 = d5 / (d8 / d9);
                } else {
                    az.this.h.f5643a = (int) (((float) az.this.h.f5644b) / (2.0f / (2.0f - ((1.0f - f3) * 0.4f))));
                    double d10 = (double) az.this.h.f5643a;
                    double d11 = (double) az.this.h.f5644b;
                    Double.isNaN(d10);
                    Double.isNaN(d11);
                    d2 = (d5 / 2.0d) / (d10 / d11);
                }
                az.this.h.k = d2;
                az.this.g.f5689c[1] = f2;
                az.this.g.f5692f.a(f2);
            }
            a(false, false);
        }

        public void a(w wVar) {
            if (wVar != null) {
                if (q.s) {
                    az.this.h.l = az.this.h.a(wVar);
                }
                a(false, false);
            }
        }

        private c(b bVar) {
            this.f5680a = true;
            this.f5682c = bVar;
            this.f5683d = new ArrayList<>();
        }

        public void a(int i, int i2) {
            if (i != q.n || i2 != q.o) {
                q.n = i;
                q.o = i2;
                a(true, false);
            }
        }

        public void a(boolean z, boolean z2) {
            Iterator<cc> it2 = this.f5683d.iterator();
            while (it2.hasNext()) {
                it2.next().a(z, z2);
            }
            if (az.this.g != null && az.this.g.i != null) {
                az.this.g.i.a(true);
                az.this.g.postInvalidate();
            }
        }
    }

    public class d implements bh {

        /* renamed from: b  reason: collision with root package name */
        private float f5685b;

        /* renamed from: c  reason: collision with root package name */
        private HashMap<Float, Float> f5686c = new HashMap<>();

        public d() {
        }

        public float a(float f2) {
            float e2 = az.this.f5665c.e();
            if (this.f5686c.size() > 30 || e2 != this.f5685b) {
                this.f5685b = e2;
                this.f5686c.clear();
            }
            if (!this.f5686c.containsKey(Float.valueOf(f2))) {
                float a2 = az.this.h.a(a(0, 0), a(0, 100));
                if (a2 <= 0.0f) {
                    return 0.0f;
                }
                this.f5686c.put(Float.valueOf(f2), Float.valueOf((f2 / a2) * 100.0f));
            }
            return this.f5686c.get(Float.valueOf(f2)).floatValue();
        }

        public w a(int i, int i2) {
            return az.this.h.a(new PointF((float) i, (float) i2), az.this.h.l, az.this.h.n, az.this.h.k, az.this.h.o);
        }

        public Point a(w wVar, Point point) {
            int i;
            int i2;
            boolean z;
            if (wVar == null) {
                return null;
            }
            PointF b2 = az.this.h.b(wVar, az.this.h.l, az.this.h.n, az.this.h.k);
            bb l = az.this.f5665c.f5682c.l();
            Point point2 = az.this.f5665c.f5682c.a().h.n;
            if (l.m) {
                try {
                    z = az.this.g.h.isZoomGesturesEnabled();
                } catch (RemoteException unused) {
                    z = true;
                }
                if (!l.l || !z) {
                    int i3 = (int) b2.x;
                    i2 = (int) b2.y;
                    i = i3;
                } else {
                    float f2 = (bb.j * (((float) ((int) b2.x)) - l.f5722f.x)) + l.f5722f.x + (l.g.x - l.f5722f.x);
                    float f3 = (bb.j * (((float) ((int) b2.y)) - l.f5722f.y)) + l.f5722f.y + (l.g.y - l.f5722f.y);
                    i = (int) f2;
                    i2 = (int) f3;
                    double d2 = (double) i;
                    Double.isNaN(d2);
                    if (((double) f2) >= d2 + 0.5d) {
                        i++;
                    }
                    double d3 = (double) i2;
                    Double.isNaN(d3);
                    if (((double) f3) >= d3 + 0.5d) {
                        i2++;
                    }
                }
            } else {
                float f4 = (az.this.h.f5645c * ((float) (((int) b2.x) - point2.x))) + ((float) point2.x);
                float f5 = (az.this.h.f5645c * ((float) (((int) b2.y) - point2.y))) + ((float) point2.y);
                int i4 = (int) f4;
                int i5 = (int) f5;
                double d4 = (double) i4;
                Double.isNaN(d4);
                if (((double) f4) >= d4 + 0.5d) {
                    i4++;
                }
                double d5 = (double) i5;
                Double.isNaN(d5);
                if (((double) f5) >= d5 + 0.5d) {
                    i2 = i5 + 1;
                } else {
                    i2 = i5;
                }
            }
            Point point3 = new Point(i, i2);
            if (point != null) {
                point.x = point3.x;
                point.y = point3.y;
            }
            return point3;
        }

        public int a(int i, int i2, int i3) {
            return a(i, i2, i3, false);
        }

        public int b(int i, int i2, int i3) {
            return a(i, i2, i3, true);
        }

        private int a(int i, int i2, int i3, boolean z) {
            if (i <= 0) {
                i = az.this.f5665c.c();
            }
            if (i2 <= 0) {
                i2 = az.this.f5665c.d();
            }
            w a2 = a(i3, i2 - i3);
            w a3 = a(i - i3, i3);
            if (z) {
                return Math.abs(a2.a() - a3.a());
            }
            return Math.abs(a2.b() - a3.b());
        }
    }

    private void c() {
        bg.a();
        String a2 = bg.a("cache_path", (String) null);
        if (a2 != null) {
            u.a(a2);
        }
        bg.a().b("updateDataPeriodDate", t.a());
    }

    public void a() {
        this.f5667e.a();
        this.f5664b = null;
        this.f5665c = null;
        this.f5666d = null;
        this.f5667e = null;
        if (MapsInitializer.getUpdateDataActiveEnable() && q.b()) {
            c();
        }
    }

    private void b() {
        if (MapsInitializer.getUpdateDataActiveEnable()) {
            bg.a();
            String a2 = bg.a("updateDataPeriodDate");
            if (a2 == null || a2.equals("")) {
                bg.a().b("updateDataPeriodDate", t.a());
            } else if (t.a(a2, t.a()) > ((double) bg.a().a("period_day", q.q))) {
                c();
            }
        }
    }

    public void a(boolean z) {
        this.f5667e.b(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r12) {
        /*
            r11 = this;
            java.lang.String r0 = "initialize"
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.content.Context r1 = r12.getApplicationContext()
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            java.lang.Class r2 = r1.getClass()     // Catch:{ SecurityException -> 0x0025, NoSuchFieldException -> 0x001e }
            java.lang.String r3 = "densityDpi"
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch:{ SecurityException -> 0x0025, NoSuchFieldException -> 0x001e }
            goto L_0x002c
        L_0x001e:
            r2 = move-exception
            java.lang.String r3 = "Mediator"
            com.amap.api.mapcore2d.cm.a(r2, r3, r0)
            goto L_0x002b
        L_0x0025:
            r2 = move-exception
            java.lang.String r3 = "Mediator"
            com.amap.api.mapcore2d.cm.a(r2, r3, r0)
        L_0x002b:
            r2 = 0
        L_0x002c:
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 153600(0x25800, double:7.58885E-319)
            if (r2 == 0) goto L_0x0072
            int r8 = r1.widthPixels
            int r9 = r1.heightPixels
            int r8 = r8 * r9
            long r8 = (long) r8
            r10 = 160(0xa0, float:2.24E-43)
            int r1 = r2.getInt(r1)     // Catch:{ IllegalArgumentException -> 0x0049, IllegalAccessException -> 0x0042 }
            goto L_0x0051
        L_0x0042:
            r1 = move-exception
            java.lang.String r2 = "Mediator"
            com.amap.api.mapcore2d.cm.a(r1, r2, r0)
            goto L_0x004f
        L_0x0049:
            r1 = move-exception
            java.lang.String r2 = "Mediator"
            com.amap.api.mapcore2d.cm.a(r1, r2, r0)
        L_0x004f:
            r1 = 160(0xa0, float:2.24E-43)
        L_0x0051:
            r0 = 120(0x78, float:1.68E-43)
            if (r1 > r0) goto L_0x0058
            com.amap.api.mapcore2d.q.m = r4
            goto L_0x0089
        L_0x0058:
            if (r1 <= r10) goto L_0x006f
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 > r0) goto L_0x0061
            com.amap.api.mapcore2d.q.m = r5
            goto L_0x0089
        L_0x0061:
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
            com.amap.api.mapcore2d.q.m = r5
            goto L_0x0089
        L_0x0068:
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x006f
            com.amap.api.mapcore2d.q.m = r4
            goto L_0x0089
        L_0x006f:
            com.amap.api.mapcore2d.q.m = r3
            goto L_0x0089
        L_0x0072:
            int r0 = r1.widthPixels
            int r1 = r1.heightPixels
            int r0 = r0 * r1
            long r0 = (long) r0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0080
            com.amap.api.mapcore2d.q.m = r5
            goto L_0x0089
        L_0x0080:
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0087
            com.amap.api.mapcore2d.q.m = r4
            goto L_0x0089
        L_0x0087:
            com.amap.api.mapcore2d.q.m = r3
        L_0x0089:
            int r0 = com.amap.api.mapcore2d.q.m
            if (r0 == r5) goto L_0x0091
            r0 = 18
            com.amap.api.mapcore2d.q.f6268c = r0
        L_0x0091:
            com.amap.api.mapcore2d.bg.a((android.content.Context) r12)
            boolean r12 = com.amap.api.maps2d.MapsInitializer.getUpdateDataActiveEnable()
            if (r12 == 0) goto L_0x00a2
            com.amap.api.mapcore2d.bg.a()
            java.lang.String r12 = "UpdateDataActiveEnable"
            com.amap.api.mapcore2d.bg.b((java.lang.String) r12, (boolean) r4)
        L_0x00a2:
            com.amap.api.mapcore2d.bg.a()
            java.lang.String r12 = "UpdateDataActiveEnable"
            r0 = 0
            boolean r12 = com.amap.api.mapcore2d.bg.a((java.lang.String) r12, (boolean) r0)
            com.amap.api.maps2d.MapsInitializer.setUpdateDataActiveEnable(r12)
            r11.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.az.a(android.content.Context):void");
    }

    public az(Context context, b bVar, int i2) {
        this.g = bVar;
        this.f5665c = new c(bVar);
        this.h.f5643a = i2;
        this.h.f5644b = i2;
        this.h.a();
        a(context);
        this.f5667e = new a(context);
        this.f5664b = new d();
        this.f5666d = new b();
        this.f5668f = new v(bVar);
        this.f5665c.a(false, false);
    }
}
