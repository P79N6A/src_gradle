package com.mapbox.api.directions.v5;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.GsonBuilder;
import com.mapbox.api.directions.v5.a.aj;
import com.mapbox.api.directions.v5.a.al;
import com.mapbox.api.directions.v5.a.am;
import com.mapbox.api.directions.v5.a.at;
import com.mapbox.geojson.Point;
import com.sun.xml.internal.ws.spi.db.BindingContextFactory;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.d;
import retrofit2.e;
import retrofit2.m;

@AutoValue
public abstract class b extends com.mapbox.a.a<al, DirectionsService> {

    @AutoValue.Builder
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public Point f26292a;

        /* renamed from: b  reason: collision with root package name */
        public Point f26293b;

        /* renamed from: c  reason: collision with root package name */
        private List<Double[]> f26294c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private List<Point> f26295d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private String[] f26296e;

        /* renamed from: f  reason: collision with root package name */
        private double[] f26297f;
        private String[] g;
        private String[] h;

        public abstract a a(@NonNull String str);

        /* access modifiers changed from: package-private */
        public abstract a a(@NonNull List<Point> list);

        /* access modifiers changed from: package-private */
        public abstract b a();

        public abstract a b(@NonNull String str);

        public abstract a c(String str);

        public abstract a d(@NonNull String str);

        public abstract a e(String str);

        /* access modifiers changed from: package-private */
        public abstract a f(@Nullable String str);

        /* access modifiers changed from: package-private */
        public abstract a g(@Nullable String str);

        /* access modifiers changed from: package-private */
        public abstract a h(@Nullable String str);

        /* access modifiers changed from: package-private */
        public abstract a i(@Nullable String str);

        /* access modifiers changed from: package-private */
        public abstract a j(@Nullable String str);

        public final b b() {
            String str;
            String a2;
            boolean z = false;
            if (this.f26293b != null) {
                this.f26295d.add(0, this.f26293b);
            }
            if (this.f26292a != null) {
                this.f26295d.add(this.f26292a);
            }
            if (this.f26295d.size() >= 2) {
                if (this.h != null) {
                    if (this.h.length == this.f26295d.size()) {
                        String[] strArr = this.h;
                        for (int i = 0; i < strArr.length; i++) {
                            if (strArr[i] == null) {
                                strArr[i] = "";
                            }
                        }
                        String a3 = com.mapbox.a.c.a.a(";", strArr);
                        if (a3.isEmpty() || a3.length() <= 500) {
                            j(a3);
                        } else {
                            throw new com.mapbox.a.b.a("Waypoint names exceed 500 character limit.");
                        }
                    } else {
                        throw new com.mapbox.a.b.a("Number of waypoint names must match  the number of waypoints provided.");
                    }
                }
                String str2 = null;
                if (this.g != null) {
                    if (this.g.length == this.f26295d.size()) {
                        String[] strArr2 = this.g;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= strArr2.length) {
                                a2 = com.mapbox.a.c.a.a(";", strArr2);
                                break;
                            }
                            if (strArr2[i2] != null) {
                                if (!strArr2[i2].equals("unrestricted") && !strArr2[i2].equals("curb") && !strArr2[i2].isEmpty()) {
                                    a2 = null;
                                    break;
                                }
                            } else {
                                strArr2[i2] = "";
                            }
                            i2++;
                        }
                        if (a2 != null) {
                            i(a2);
                        } else {
                            throw new com.mapbox.a.b.a("All approaches values must be one of curb, unrestricted");
                        }
                    } else {
                        throw new com.mapbox.a.b.a("Number of approach elements must match number of coordinates provided.");
                    }
                }
                a(this.f26295d);
                List<Double[]> list = this.f26294c;
                if (list.isEmpty()) {
                    str = null;
                } else {
                    String[] strArr3 = new String[list.size()];
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        if (list.get(i3).length == 0) {
                            strArr3[i3] = "";
                        } else {
                            strArr3[i3] = String.format(Locale.US, "%s,%s", new Object[]{com.mapbox.a.c.a.a(list.get(i3)[0].doubleValue()), com.mapbox.a.c.a.a(list.get(i3)[1].doubleValue())});
                        }
                    }
                    str = com.mapbox.a.c.a.a(";", strArr3);
                }
                g(str);
                h(com.mapbox.a.c.a.a(",", this.f26296e));
                double[] dArr = this.f26297f;
                if (!(dArr == null || dArr.length == 0)) {
                    String[] strArr4 = new String[dArr.length];
                    for (int i4 = 0; i4 < dArr.length; i4++) {
                        if (dArr[i4] == Double.POSITIVE_INFINITY) {
                            strArr4[i4] = "unlimited";
                        } else {
                            strArr4[i4] = String.format(Locale.US, "%s", new Object[]{com.mapbox.a.c.a.a(dArr[i4])});
                        }
                    }
                    str2 = com.mapbox.a.c.a.a(";", strArr4);
                }
                f(str2);
                b a4 = a();
                String e2 = a4.e();
                if (!com.mapbox.a.c.a.a((CharSequence) e2) && (e2.startsWith("pk.") || e2.startsWith("sk.") || e2.startsWith("tk."))) {
                    z = true;
                }
                if (z) {
                    return a4;
                }
                throw new com.mapbox.a.b.a("Using Mapbox Services requires setting a valid access token.");
            }
            throw new com.mapbox.a.b.a("An origin and destination are required before making the directions API request.");
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public abstract String a();

    /* access modifiers changed from: package-private */
    @NonNull
    public abstract String b();

    /* access modifiers changed from: package-private */
    @NonNull
    public abstract List<Point> c();

    @NonNull
    public abstract String d();

    /* access modifiers changed from: package-private */
    @NonNull
    public abstract String e();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract Boolean f();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String g();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String h();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String i();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String j();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract Boolean k();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract Boolean l();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String m();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String n();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract Boolean o();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String p();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract Boolean q();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract Boolean r();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String s();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String t();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String u();

    /* access modifiers changed from: package-private */
    @Nullable
    public abstract String v();

    protected b() {
        super(DirectionsService.class);
    }

    public final GsonBuilder x() {
        return super.x().registerTypeAdapterFactory(DirectionsAdapterFactory.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0095 A[LOOP:0: B:12:0x008f->B:14:0x0095, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final retrofit2.b<com.mapbox.api.directions.v5.a.al> w() {
        /*
            r23 = this;
            java.lang.Object r0 = r23.z()
            r1 = r0
            com.mapbox.api.directions.v5.DirectionsService r1 = (com.mapbox.api.directions.v5.DirectionsService) r1
            java.lang.String r0 = r23.p()
            java.lang.String r2 = "os.name"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.String r3 = "os.version"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            java.lang.String r4 = "os.arch"
            java.lang.String r4 = java.lang.System.getProperty(r4)
            boolean r5 = com.mapbox.a.c.a.a((java.lang.CharSequence) r2)
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 != 0) goto L_0x0077
            boolean r5 = com.mapbox.a.c.a.a((java.lang.CharSequence) r3)
            if (r5 != 0) goto L_0x0077
            boolean r5 = com.mapbox.a.c.a.a((java.lang.CharSequence) r4)
            if (r5 == 0) goto L_0x0033
            goto L_0x0077
        L_0x0033:
            java.lang.String r5 = "[^\\p{ASCII}]"
            java.lang.String r9 = ""
            java.lang.String r2 = r2.replaceAll(r5, r9)
            java.lang.String r5 = "[^\\p{ASCII}]"
            java.lang.String r9 = ""
            java.lang.String r3 = r3.replaceAll(r5, r9)
            java.lang.String r5 = "[^\\p{ASCII}]"
            java.lang.String r9 = ""
            java.lang.String r4 = r4.replaceAll(r5, r9)
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r9 = "%s %s/%s (%s)"
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = com.mapbox.a.a.a.f25913a
            r10[r8] = r11
            r10[r7] = r2
            r10[r6] = r3
            r2 = 3
            r10[r2] = r4
            java.lang.String r2 = java.lang.String.format(r5, r9, r10)
            boolean r3 = com.mapbox.a.c.a.a((java.lang.CharSequence) r0)
            if (r3 == 0) goto L_0x0068
            goto L_0x007a
        L_0x0068:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r4 = "%s %s"
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r8] = r0
            r5[r7] = r2
            java.lang.String r0 = java.lang.String.format(r3, r4, r5)
            goto L_0x0079
        L_0x0077:
            java.lang.String r0 = com.mapbox.a.a.a.f25913a
        L_0x0079:
            r2 = r0
        L_0x007a:
            java.lang.String r3 = r23.a()
            java.lang.String r4 = r23.b()
            java.util.List r0 = r23.c()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x008f:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x00bd
            java.lang.Object r9 = r0.next()
            com.mapbox.geojson.Point r9 = (com.mapbox.geojson.Point) r9
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r11 = "%s,%s"
            java.lang.Object[] r12 = new java.lang.Object[r6]
            double r13 = r9.longitude()
            java.lang.String r13 = com.mapbox.a.c.a.a((double) r13)
            r12[r8] = r13
            double r13 = r9.latitude()
            java.lang.String r9 = com.mapbox.a.c.a.a((double) r13)
            r12[r7] = r9
            java.lang.String r9 = java.lang.String.format(r10, r11, r12)
            r5.add(r9)
            goto L_0x008f
        L_0x00bd:
            java.lang.String r0 = ";"
            java.lang.Object[] r5 = r5.toArray()
            java.lang.String r5 = com.mapbox.a.c.a.a(r0, r5)
            java.lang.String r6 = r23.e()
            java.lang.Boolean r7 = r23.f()
            java.lang.String r8 = r23.g()
            java.lang.String r9 = r23.h()
            java.lang.String r10 = r23.i()
            java.lang.Boolean r11 = r23.k()
            java.lang.String r12 = r23.j()
            java.lang.Boolean r13 = r23.l()
            java.lang.String r14 = r23.m()
            java.lang.String r15 = r23.n()
            java.lang.Boolean r16 = r23.o()
            java.lang.Boolean r17 = r23.q()
            java.lang.Boolean r18 = r23.r()
            java.lang.String r19 = r23.s()
            java.lang.String r20 = r23.t()
            java.lang.String r21 = r23.u()
            java.lang.String r22 = r23.v()
            retrofit2.b r0 = r1.getCall(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.api.directions.v5.b.w():retrofit2.b");
    }

    public final void a(final d<al> dVar) {
        y().a(new d<al>() {
            public final void a(retrofit2.b<al> bVar, Throwable th) {
                dVar.a(bVar, th);
            }

            public final void a(retrofit2.b<al> bVar, m<al> mVar) {
                if (!mVar.d()) {
                    b.this.a(dVar, mVar);
                    return;
                }
                if (dVar != null) {
                    if (mVar.f84319b == null || ((al) mVar.f84319b).routes().isEmpty()) {
                        dVar.a(bVar, mVar);
                    } else {
                        dVar.a(bVar, m.a(((al) mVar.f84319b).toBuilder().a(b.this.a(mVar)).a(), new Response.Builder().code(200).message("OK").protocol(mVar.f84318a.protocol()).headers(mVar.c()).request(mVar.f84318a.request()).build()));
                    }
                }
            }
        });
    }

    public final List<am> a(m<al> mVar) {
        List<am> routes = ((al) mVar.f84319b).routes();
        ArrayList arrayList = new ArrayList();
        for (am builder : routes) {
            arrayList.add(builder.toBuilder().a(at.builder().c(b()).a(c()).o(v()).b(l()).i(m()).n(u()).f(j()).a(f()).d(n()).e(i()).b(a()).e(q()).f(r()).c(o()).g(g()).h(h()).d(k()).j(t()).k(s()).l(e()).m(((al) mVar.f84319b).uuid()).a(d()).a()).a());
        }
        return arrayList;
    }

    public final void a(@Nullable d<al> dVar, @NonNull m<al> mVar) {
        e<ResponseBody, aj> a2 = this.f25910d.a(aj.class, new Annotation[0]);
        if (dVar == null) {
            BindingContextFactory.LOGGER.log(Level.WARNING, "Failed to complete your request and callback is null");
            return;
        }
        try {
            dVar.a(y(), new Throwable(((aj) a2.a(mVar.f84320c)).message()));
        } catch (IOException e2) {
            BindingContextFactory.LOGGER.log(Level.WARNING, "Failed to complete your request. ", e2);
        }
    }
}
