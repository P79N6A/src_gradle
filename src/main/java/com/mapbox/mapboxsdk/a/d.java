package com.mapbox.mapboxsdk.a;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f26400a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f26401b;

    /* renamed from: c  reason: collision with root package name */
    private final String f26402c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f26403d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f26404e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f26405f;
    private final boolean g;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Context> f26406a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f26407b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f26408c = true;

        /* renamed from: d  reason: collision with root package name */
        private boolean f26409d = true;

        /* renamed from: e  reason: collision with root package name */
        private boolean f26410e = true;

        /* renamed from: f  reason: collision with root package name */
        private String[] f26411f;

        public final d a() {
            if (this.f26411f != null) {
                d dVar = new d(this.f26406a, b(this.f26411f), this.f26408c, this.f26409d, this.f26407b, this.f26410e);
                dVar.a();
                return dVar;
            }
            throw new IllegalStateException("Using builder without providing attribution data");
        }

        public final a a(boolean z) {
            this.f26408c = z;
            return this;
        }

        public final a b(boolean z) {
            this.f26409d = z;
            return this;
        }

        public final a a(String... strArr) {
            this.f26411f = strArr;
            return this;
        }

        private static String b(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                if (!str.isEmpty()) {
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r7 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f26402c
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 24
            if (r1 < r3) goto L_0x000e
            android.text.Spanned r0 = android.text.Html.fromHtml(r0, r2)
            goto L_0x0012
        L_0x000e:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
        L_0x0012:
            android.text.SpannableStringBuilder r0 = (android.text.SpannableStringBuilder) r0
            int r1 = r0.length()
            java.lang.Class<android.text.style.URLSpan> r3 = android.text.style.URLSpan.class
            java.lang.Object[] r1 = r0.getSpans(r2, r1, r3)
            android.text.style.URLSpan[] r1 = (android.text.style.URLSpan[]) r1
            int r3 = r1.length
            r4 = 0
        L_0x0022:
            if (r4 >= r3) goto L_0x00a1
            r5 = r1[r4]
            java.lang.String r6 = r5.getURL()
            boolean r7 = r9.f26403d
            r8 = 1
            if (r7 != 0) goto L_0x003a
            java.lang.String r7 = "https://www.mapbox.com/map-feedback/"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r7 = 0
            goto L_0x003b
        L_0x003a:
            r7 = 1
        L_0x003b:
            if (r7 == 0) goto L_0x0050
            boolean r7 = r9.g
            if (r7 != 0) goto L_0x004c
            java.lang.String r7 = "https://www.mapbox.com/about/maps/"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r7 = 0
            goto L_0x004d
        L_0x004c:
            r7 = 1
        L_0x004d:
            if (r7 == 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r8 = 0
        L_0x0051:
            if (r8 == 0) goto L_0x009e
            int r7 = r0.getSpanStart(r5)
            int r5 = r0.getSpanEnd(r5)
            int r8 = r5 - r7
            char[] r8 = new char[r8]
            r0.getChars(r7, r5, r8, r2)
            java.lang.String r5 = java.lang.String.valueOf(r8)
            boolean r7 = r9.f26404e
            if (r7 != 0) goto L_0x007b
            java.lang.String r7 = "© "
            boolean r7 = r5.startsWith(r7)
            if (r7 == 0) goto L_0x007b
            r7 = 2
            int r8 = r5.length()
            java.lang.String r5 = r5.substring(r7, r8)
        L_0x007b:
            java.lang.String r7 = "Improve this map"
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x0094
            java.lang.ref.WeakReference<android.content.Context> r7 = r9.f26401b
            java.lang.Object r7 = r7.get()
            android.content.Context r7 = (android.content.Context) r7
            if (r7 == 0) goto L_0x0094
            r5 = 2131561189(0x7f0d0ae5, float:1.8747772E38)
            java.lang.String r5 = r7.getString(r5)
        L_0x0094:
            java.util.Set<com.mapbox.mapboxsdk.a.a> r7 = r9.f26400a
            com.mapbox.mapboxsdk.a.a r8 = new com.mapbox.mapboxsdk.a.a
            r8.<init>(r5, r6)
            r7.add(r8)
        L_0x009e:
            int r4 = r4 + 1
            goto L_0x0022
        L_0x00a1:
            boolean r0 = r9.f26405f
            if (r0 == 0) goto L_0x00c5
            java.lang.ref.WeakReference<android.content.Context> r0 = r9.f26401b
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            java.util.Set<com.mapbox.mapboxsdk.a.a> r1 = r9.f26400a
            com.mapbox.mapboxsdk.a.a r2 = new com.mapbox.mapboxsdk.a.a
            if (r0 == 0) goto L_0x00bb
            r3 = 2131561191(0x7f0d0ae7, float:1.8747776E38)
            java.lang.String r0 = r0.getString(r3)
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r0 = "Telemetry Settings"
        L_0x00bd:
            java.lang.String r3 = "https://www.mapbox.com/telemetry/"
            r2.<init>(r0, r3)
            r1.add(r2)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.a.d.a():void");
    }

    public final String a(boolean z) {
        String str;
        String str2;
        if (this.f26404e) {
            str = "";
        } else {
            str = "© ";
        }
        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        for (a next : this.f26400a) {
            i++;
            if (!z) {
                str2 = next.f26381a;
            } else if (next.f26381a.equals("OpenStreetMap")) {
                str2 = "OSM";
            } else {
                str2 = next.f26381a;
            }
            sb.append(str2);
            if (i != this.f26400a.size()) {
                sb.append(" / ");
            }
        }
        return sb.toString();
    }

    d(WeakReference<Context> weakReference, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f26401b = weakReference;
        this.f26402c = str;
        this.f26403d = z;
        this.f26404e = z2;
        this.f26405f = z3;
        this.g = z4;
    }
}
