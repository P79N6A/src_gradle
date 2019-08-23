package com.bytedance.frameworks.plugin.pm;

import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.frameworks.plugin.f.n;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final int f20047a = Build.VERSION.SDK_INT;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f20048b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Object f20049c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, Object> f20050d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private String f20051e;

    /* renamed from: f  reason: collision with root package name */
    private f f20052f;
    private f g;
    private f h;

    public static final class a extends c<b> {

        /* renamed from: a  reason: collision with root package name */
        public final ActivityInfo f20053a;

        public a(f fVar, ActivityInfo activityInfo) {
            super(fVar, (ComponentInfo) activityInfo);
            this.f20053a = activityInfo;
            this.f20053a.applicationInfo = fVar.f20070e.f20060a;
        }
    }

    public static final class b extends C0173d {

        /* renamed from: a  reason: collision with root package name */
        public final a f20054a;

        public b(a aVar) {
            this.f20054a = aVar;
        }
    }

    public static class c<II extends C0173d> {

        /* renamed from: b  reason: collision with root package name */
        public final e f20055b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<II> f20056c;

        /* renamed from: d  reason: collision with root package name */
        public final String f20057d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f20058e;

        public c(e eVar) {
            this.f20055b = eVar;
        }

        public c(f fVar, ComponentInfo componentInfo) {
            this((g) fVar, (PackageItemInfo) componentInfo);
            String str;
            if (fVar.f20071f[0] == null) {
                if (fVar.f20066a != 0) {
                    if (this.f20055b.f20060a.targetSdkVersion >= 8) {
                        str = d.a(fVar.l, fVar.f20066a, 1024);
                    } else {
                        str = fVar.l.getNonResourceString(fVar.f20066a);
                    }
                    componentInfo.processName = d.a(this.f20055b.f20060a.packageName, this.f20055b.f20060a.processName, (CharSequence) str, fVar.f20069d, fVar.f20071f);
                }
                if (fVar.f20067b != 0) {
                    componentInfo.descriptionRes = fVar.l.getResourceId(fVar.f20067b, 0);
                }
                componentInfo.enabled = fVar.l.getBoolean(fVar.f20068c, true);
            }
        }

        private c(g gVar, PackageItemInfo packageItemInfo) {
            this.f20055b = gVar.f20070e;
            this.f20056c = new ArrayList<>(0);
            String a2 = d.a(gVar.l, gVar.g, 0);
            if (a2 == null) {
                this.f20057d = null;
                String[] strArr = gVar.f20071f;
                strArr[0] = gVar.k + " does not specify android:name";
                return;
            }
            packageItemInfo.name = d.a(this.f20055b.f20060a.packageName, (CharSequence) a2, gVar.f20071f);
            if (packageItemInfo.name == null) {
                this.f20057d = null;
                String[] strArr2 = gVar.f20071f;
                strArr2[0] = gVar.k + " does not have valid android:name";
                return;
            }
            this.f20057d = packageItemInfo.name;
            int resourceId = gVar.l.getResourceId(gVar.i, 0);
            if (resourceId != 0) {
                packageItemInfo.icon = resourceId;
                packageItemInfo.nonLocalizedLabel = null;
            }
            int resourceId2 = gVar.l.getResourceId(gVar.j, 0);
            if (resourceId2 != 0) {
                packageItemInfo.logo = resourceId2;
            }
            TypedValue peekValue = gVar.l.peekValue(gVar.h);
            if (peekValue != null) {
                int i = peekValue.resourceId;
                packageItemInfo.labelRes = i;
                if (i == 0) {
                    packageItemInfo.nonLocalizedLabel = peekValue.coerceToString();
                }
            }
            packageItemInfo.packageName = this.f20055b.h;
        }
    }

    /* renamed from: com.bytedance.frameworks.plugin.pm.d$d  reason: collision with other inner class name */
    public static class C0173d extends IntentFilter {

        /* renamed from: b  reason: collision with root package name */
        public boolean f20059b;
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final ApplicationInfo f20060a = new ApplicationInfo();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<h> f20061b = new ArrayList<>(0);

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<a> f20062c = new ArrayList<>(0);

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<a> f20063d = new ArrayList<>(0);

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<i> f20064e = new ArrayList<>(0);

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList<k> f20065f = new ArrayList<>(0);
        public final ArrayList<String> g = new ArrayList<>();
        public String h;
        public Bundle i = null;
        public String j;
        public int k;
        public String l;
        public Signature[] m;

        public e(String str) {
            this.h = str;
            this.f20060a.packageName = str;
            this.f20060a.uid = -1;
        }
    }

    static class f extends g {

        /* renamed from: a  reason: collision with root package name */
        final int f20066a;

        /* renamed from: b  reason: collision with root package name */
        final int f20067b;

        /* renamed from: c  reason: collision with root package name */
        final int f20068c;

        /* renamed from: d  reason: collision with root package name */
        int f20069d;

        f(e eVar, String[] strArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(eVar, strArr, i, i2, i3, i4);
            this.f20066a = i5;
            this.f20067b = i6;
            this.f20068c = i7;
        }
    }

    static class g {

        /* renamed from: e  reason: collision with root package name */
        final e f20070e;

        /* renamed from: f  reason: collision with root package name */
        final String[] f20071f;
        final int g;
        final int h;
        final int i;
        final int j;
        String k;
        TypedArray l;

        g(e eVar, String[] strArr, int i2, int i3, int i4, int i5) {
            this.f20070e = eVar;
            this.f20071f = strArr;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public static final class h extends c<C0173d> {

        /* renamed from: a  reason: collision with root package name */
        public final PermissionInfo f20072a = new PermissionInfo();

        public h(e eVar) {
            super(eVar);
        }
    }

    public static final class i extends c<j> {

        /* renamed from: a  reason: collision with root package name */
        public final ProviderInfo f20073a;

        public i(f fVar, ProviderInfo providerInfo) {
            super(fVar, (ComponentInfo) providerInfo);
            this.f20073a = providerInfo;
            this.f20073a.applicationInfo = fVar.f20070e.f20060a;
        }
    }

    public static final class j extends C0173d {

        /* renamed from: a  reason: collision with root package name */
        public final i f20074a;

        public j(i iVar) {
            this.f20074a = iVar;
        }
    }

    public static final class k extends c<l> {

        /* renamed from: a  reason: collision with root package name */
        public final ServiceInfo f20075a;

        public k(f fVar, ServiceInfo serviceInfo) {
            super(fVar, (ComponentInfo) serviceInfo);
            this.f20075a = serviceInfo;
            this.f20075a.applicationInfo = fVar.f20070e.f20060a;
        }
    }

    public static final class l extends C0173d {

        /* renamed from: a  reason: collision with root package name */
        public final k f20076a;

        public l(k kVar) {
            this.f20076a = kVar;
        }
    }

    private static String a(String str, boolean z) {
        int length = str.length();
        boolean z2 = false;
        boolean z3 = true;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                z3 = false;
            } else if (z3 || ((charAt < '0' || charAt > '9') && charAt != '_')) {
                if (charAt == '.') {
                    z2 = true;
                    z3 = true;
                } else {
                    return "bad character '" + charAt + "'";
                }
            }
        }
        if (z2 || !z) {
            return null;
        }
        return "must have at least one '.' separator";
    }

    public static String a(String str, CharSequence charSequence, String[] strArr) {
        if (charSequence == null || charSequence.length() <= 0) {
            strArr[0] = "Empty class name in package " + str;
            return null;
        }
        String charSequence2 = charSequence.toString();
        char charAt = charSequence2.charAt(0);
        if (charAt == '.') {
            return (str + charSequence2).intern();
        } else if (charSequence2.indexOf(46) < 0) {
            return (str + '.' + charSequence2).intern();
        } else if (charAt >= 'a' && charAt <= 'z') {
            return charSequence2.intern();
        } else {
            strArr[0] = "Bad class name " + charSequence2 + " in package " + str;
            return null;
        }
    }

    private static String a(String str, CharSequence charSequence, String str2, String[] strArr) {
        String charSequence2 = charSequence.toString();
        char charAt = charSequence2.charAt(0);
        if (str == null || charAt != ':') {
            String a2 = a(charSequence2, true);
            if (a2 == null || "system".equals(charSequence2)) {
                return charSequence2.intern();
            }
            strArr[0] = "Invalid " + str2 + " name " + charSequence2 + " in package " + str + ": " + a2;
            return null;
        } else if (charSequence2.length() < 2) {
            strArr[0] = "Bad " + str2 + " name " + charSequence2 + " in package " + str + ": must be at least two characters";
            return null;
        } else {
            String a3 = a(charSequence2.substring(1), false);
            if (a3 != null) {
                strArr[0] = "Invalid " + str2 + " name " + charSequence2 + " in package " + str + ": " + a3;
                return null;
            }
            return (str + charSequence2).intern();
        }
    }

    public static String a(String str, String str2, CharSequence charSequence, int i2, String[] strArr) {
        return ((i2 & 4) == 0 || "system".equals(charSequence)) ? (charSequence == null || charSequence.length() <= 0) ? str2 : a(str, charSequence, "process", strArr) : str2 != null ? str2 : str;
    }

    private static String a(String str, String str2, CharSequence charSequence, String[] strArr) {
        if (charSequence == null) {
            return str2;
        }
        if (charSequence.length() <= 0) {
            return null;
        }
        return a(str, charSequence, "taskAffinity", strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.frameworks.plugin.pm.d.e a(java.io.File r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getPath()
            r7.f20051e = r0
            boolean r0 = r8.isFile()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = ".apk"
            boolean r8 = r8.endsWith(r0)
            if (r8 != 0) goto L_0x001f
            r8 = r9 & 2
            if (r8 == 0) goto L_0x001f
            return r1
        L_0x001f:
            r8 = 1
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x0064 }
            android.content.res.AssetManager r0 = (android.content.res.AssetManager) r0     // Catch:{ Exception -> 0x0064 }
            java.lang.Class<android.content.res.AssetManager> r2 = android.content.res.AssetManager.class
            java.lang.String r3 = "addAssetPath"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0062 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch:{ Exception -> 0x0062 }
            java.lang.reflect.Method r2 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class) r2, (java.lang.String) r3, (java.lang.Class[]) r4)     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x005f
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0062 }
            java.lang.String r4 = r7.f20051e     // Catch:{ Exception -> 0x0062 }
            r3[r6] = r4     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch:{ Exception -> 0x0062 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0062 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x005f
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x0062 }
            r3.<init>()     // Catch:{ Exception -> 0x0062 }
            r3.setToDefaults()     // Catch:{ Exception -> 0x0062 }
            android.content.res.Resources r4 = new android.content.res.Resources     // Catch:{ Exception -> 0x0062 }
            r4.<init>(r0, r3, r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r3 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r2 = r0.openXmlResourceParser(r2, r3)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0068
        L_0x005f:
            r2 = r1
            r4 = r2
            goto L_0x0067
        L_0x0062:
            r4 = r1
            goto L_0x0066
        L_0x0064:
            r0 = r1
            r4 = r0
        L_0x0066:
            r2 = r1
        L_0x0067:
            r6 = 1
        L_0x0068:
            if (r6 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x006f
            r0.close()
        L_0x006f:
            return r1
        L_0x0070:
            java.lang.String[] r8 = new java.lang.String[r8]
            com.bytedance.frameworks.plugin.pm.d$e r8 = r7.a((android.content.res.Resources) r4, (android.content.res.XmlResourceParser) r2, (int) r9, (java.lang.String[]) r8)     // Catch:{ Exception -> 0x0077 }
            goto L_0x0078
        L_0x0077:
            r8 = r1
        L_0x0078:
            if (r8 != 0) goto L_0x0081
            r2.close()
            r0.close()
            return r1
        L_0x0081:
            r2.close()
            r0.close()
            java.lang.String r9 = r7.f20051e
            r8.j = r9
            r8.m = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.d.a(java.io.File, int):com.bytedance.frameworks.plugin.pm.d$e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.frameworks.plugin.pm.d.e a(android.content.res.Resources r18, android.content.res.XmlResourceParser r19, int r20, java.lang.String[] r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r21
            r11 = 0
            r7.f20052f = r11
            r7.g = r11
            r7.h = r11
        L_0x000f:
            int r0 = r19.next()
            r12 = 2
            r13 = 1
            if (r0 == r12) goto L_0x0019
            if (r0 != r13) goto L_0x000f
        L_0x0019:
            r14 = 0
            if (r0 == r12) goto L_0x0022
            java.lang.String r0 = "No start tag found"
            r10[r14] = r0
        L_0x0020:
            r0 = r11
            goto L_0x0073
        L_0x0022:
            java.lang.String r0 = r19.getName()
            java.lang.String r1 = "manifest"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "No <manifest> tag"
            r10[r14] = r0
            goto L_0x0020
        L_0x0033:
            java.lang.String r0 = "package"
            java.lang.String r0 = r9.getAttributeValue(r11, r0)
            if (r0 == 0) goto L_0x006e
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0042
            goto L_0x006e
        L_0x0042:
            java.lang.String r1 = a((java.lang.String) r0, (boolean) r13)
            if (r1 == 0) goto L_0x0069
            java.lang.String r2 = "android"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0069
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "<manifest> specifies bad package name \""
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "\": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r10[r14] = r0
            goto L_0x0020
        L_0x0069:
            java.lang.String r0 = r0.intern()
            goto L_0x0073
        L_0x006e:
            java.lang.String r0 = "<manifest> does not specify package"
            r10[r14] = r0
            goto L_0x0020
        L_0x0073:
            if (r0 != 0) goto L_0x0076
            return r11
        L_0x0076:
            com.bytedance.frameworks.plugin.pm.d$e r15 = new com.bytedance.frameworks.plugin.pm.d$e
            r15.<init>(r0)
            java.lang.String r0 = "com.android.internal.R$styleable"
            java.lang.String r1 = "AndroidManifest"
            java.lang.Object r0 = a((java.lang.String) r0, (java.lang.String) r1)
            int[] r0 = (int[]) r0
            android.content.res.TypedArray r0 = r8.obtainAttributes(r9, r0)
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifest_versionCode"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r0.getInteger(r1, r14)
            r15.k = r1
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifest_versionName"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r1 = r0.getString(r1)
            r15.l = r1
            java.lang.String r1 = r15.l
            if (r1 == 0) goto L_0x00bd
            java.lang.String r1 = r15.l
            java.lang.String r1 = r1.intern()
            r15.l = r1
        L_0x00bd:
            r0.recycle()
            int r6 = r19.getDepth()
        L_0x00c4:
            int r0 = r19.next()
            if (r0 == r13) goto L_0x022b
            r1 = 3
            if (r0 != r1) goto L_0x00d3
            int r2 = r19.getDepth()
            if (r2 <= r6) goto L_0x022b
        L_0x00d3:
            if (r0 == r1) goto L_0x00c4
            r2 = 4
            if (r0 == r2) goto L_0x00c4
            java.lang.String r0 = r19.getName()
            java.lang.String r2 = "application"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00fa
            r0 = r17
            r1 = r15
            r2 = r18
            r3 = r19
            r4 = r19
            r5 = r20
            r16 = r6
            r6 = r21
            boolean r0 = r0.a((com.bytedance.frameworks.plugin.pm.d.e) r1, (android.content.res.Resources) r2, (org.xmlpull.v1.XmlPullParser) r3, (android.util.AttributeSet) r4, (int) r5, (java.lang.String[]) r6)
            if (r0 != 0) goto L_0x0222
            return r11
        L_0x00fa:
            r16 = r6
            java.lang.String r2 = "permission"
            boolean r2 = r0.equals(r2)
            r3 = -1
            if (r2 == 0) goto L_0x01d1
            com.bytedance.frameworks.plugin.pm.d$h r0 = new com.bytedance.frameworks.plugin.pm.d$h
            r0.<init>(r15)
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestPermission"
            java.lang.Object r2 = a((java.lang.String) r2, (java.lang.String) r4)
            int[] r2 = (int[]) r2
            android.content.res.TypedArray r2 = r8.obtainAttributes(r9, r2)
            android.content.pm.PermissionInfo r4 = r0.f20072a
            java.lang.String r5 = "<permission>"
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r13 = "AndroidManifestPermission_name"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r13)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r6 = a((android.content.res.TypedArray) r2, (int) r6, (int) r14)
            if (r6 != 0) goto L_0x0145
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = " does not specify android:name"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r10[r14] = r4
        L_0x0143:
            r4 = 0
            goto L_0x017d
        L_0x0145:
            android.content.pm.ApplicationInfo r5 = r15.f20060a
            java.lang.String r5 = r5.packageName
            java.lang.String r5 = a((java.lang.String) r5, (java.lang.CharSequence) r6, (java.lang.String[]) r10)
            r4.name = r5
            java.lang.String r5 = r4.name
            if (r5 != 0) goto L_0x0154
            goto L_0x0143
        L_0x0154:
            int r5 = r2.getResourceId(r14, r14)
            if (r5 == 0) goto L_0x015e
            r4.icon = r5
            r4.nonLocalizedLabel = r11
        L_0x015e:
            int r5 = r2.getResourceId(r14, r14)
            if (r5 == 0) goto L_0x0166
            r4.logo = r5
        L_0x0166:
            android.util.TypedValue r5 = r2.peekValue(r14)
            if (r5 == 0) goto L_0x0178
            int r6 = r5.resourceId
            r4.labelRes = r6
            if (r6 != 0) goto L_0x0178
            java.lang.CharSequence r5 = r5.coerceToString()
            r4.nonLocalizedLabel = r5
        L_0x0178:
            java.lang.String r5 = r15.h
            r4.packageName = r5
            r4 = 1
        L_0x017d:
            if (r4 != 0) goto L_0x0184
            r2.recycle()
        L_0x0182:
            r0 = r11
            goto L_0x01ce
        L_0x0184:
            android.content.pm.PermissionInfo r4 = r0.f20072a
            java.lang.String r5 = "com.android.internal.R$styleable"
            java.lang.String r6 = "AndroidManifestPermission_protectionLevel"
            java.lang.Object r5 = b((java.lang.String) r5, (java.lang.String) r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r5 = r2.getInt(r5, r14)
            r4.protectionLevel = r5
            r2.recycle()
            android.content.pm.PermissionInfo r2 = r0.f20072a
            int r2 = r2.protectionLevel
            if (r2 != r3) goto L_0x01a8
            java.lang.String r0 = "<permission> does not specify protectionLevel"
            r10[r14] = r0
            goto L_0x0182
        L_0x01a8:
            android.content.pm.PermissionInfo r2 = r0.f20072a
            int r2 = r2.protectionLevel
            if (r2 != r1) goto L_0x01b4
            android.content.pm.PermissionInfo r1 = r0.f20072a
            r2 = 18
            r1.protectionLevel = r2
        L_0x01b4:
            android.content.pm.PermissionInfo r1 = r0.f20072a
            int r1 = r1.protectionLevel
            r1 = r1 & 4080(0xff0, float:5.717E-42)
            if (r1 == 0) goto L_0x01c9
            android.content.pm.PermissionInfo r1 = r0.f20072a
            int r1 = r1.protectionLevel
            r1 = r1 & 15
            if (r1 == r12) goto L_0x01c9
            java.lang.String r0 = "<permission>  protectionLevel specifies a flag but is not based on signature type"
            r10[r14] = r0
            goto L_0x0182
        L_0x01c9:
            java.util.ArrayList<com.bytedance.frameworks.plugin.pm.d$h> r1 = r15.f20061b
            r1.add(r0)
        L_0x01ce:
            if (r0 != 0) goto L_0x0222
            return r11
        L_0x01d1:
            java.lang.String r1 = "uses-permission"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0213
            java.lang.String r0 = "com.android.internal.R$styleable"
            java.lang.String r1 = "AndroidManifestUsesPermission"
            java.lang.Object r0 = a((java.lang.String) r0, (java.lang.String) r1)
            int[] r0 = (int[]) r0
            android.content.res.TypedArray r0 = r8.obtainAttributes(r9, r0)
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestUsesPermission_name"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r1 = r0.getNonResourceString(r1)
            r0.recycle()
            if (r1 == 0) goto L_0x020f
            java.util.ArrayList<java.lang.String> r0 = r15.g
            int r0 = r0.indexOf(r1)
            if (r0 != r3) goto L_0x020f
            java.util.ArrayList<java.lang.String> r0 = r15.g
            java.lang.String r1 = r1.intern()
            r0.add(r1)
        L_0x020f:
            com.bytedance.frameworks.plugin.f.n.a(r19)
            goto L_0x0222
        L_0x0213:
            java.lang.String r1 = "uses-sdk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0227
            boolean r0 = a((com.bytedance.frameworks.plugin.pm.d.e) r15, (android.content.res.Resources) r8, (android.content.res.XmlResourceParser) r9, (android.util.AttributeSet) r9, (java.lang.String[]) r10)
            if (r0 != 0) goto L_0x0222
            return r11
        L_0x0222:
            r6 = r16
            r13 = 1
            goto L_0x00c4
        L_0x0227:
            com.bytedance.frameworks.plugin.f.n.a(r19)
            goto L_0x0222
        L_0x022b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.d.a(android.content.res.Resources, android.content.res.XmlResourceParser, int, java.lang.String[]):com.bytedance.frameworks.plugin.pm.d$e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.bytedance.frameworks.plugin.pm.d.e r8, android.content.res.Resources r9, android.content.res.XmlResourceParser r10, android.util.AttributeSet r11, java.lang.String[] r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = f20047a
            r1 = 1
            if (r0 <= 0) goto L_0x0149
            java.lang.String r0 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestUsesSdk"
            java.lang.Object r0 = a((java.lang.String) r0, (java.lang.String) r2)
            int[] r0 = (int[]) r0
            android.content.res.TypedArray r9 = r9.obtainAttributes(r11, r0)
            java.lang.String r11 = "com.android.internal.R$styleable"
            java.lang.String r0 = "AndroidManifestUsesSdk_minSdkVersion"
            java.lang.Object r11 = b((java.lang.String) r11, (java.lang.String) r0)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            android.util.TypedValue r11 = r9.peekValue(r11)
            r0 = 3
            r2 = 0
            r3 = 0
            if (r11 == 0) goto L_0x003e
            int r4 = r11.type
            if (r4 != r0) goto L_0x0039
            java.lang.CharSequence r4 = r11.string
            if (r4 == 0) goto L_0x0039
            java.lang.CharSequence r11 = r11.string
            java.lang.String r2 = r11.toString()
            goto L_0x003e
        L_0x0039:
            int r11 = r11.data
            r5 = r11
            r4 = r2
            goto L_0x0041
        L_0x003e:
            r4 = r2
            r11 = 0
            r5 = 0
        L_0x0041:
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r7 = "AndroidManifestUsesSdk_targetSdkVersion"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            android.util.TypedValue r6 = r9.peekValue(r6)
            if (r6 == 0) goto L_0x0067
            int r7 = r6.type
            if (r7 != r0) goto L_0x0065
            java.lang.CharSequence r0 = r6.string
            if (r0 == 0) goto L_0x0065
            java.lang.CharSequence r0 = r6.string
            java.lang.String r2 = r0.toString()
            r4 = r2
            goto L_0x0067
        L_0x0065:
            int r5 = r6.data
        L_0x0067:
            r9.recycle()
            java.lang.String r9 = "android.os.Build$VERSION"
            java.lang.String r0 = "ACTIVE_CODENAMES"
            java.lang.Object r9 = c(r9, r0)
            if (r9 != 0) goto L_0x0076
            java.lang.String[] r9 = new java.lang.String[r3]
        L_0x0076:
            java.lang.String[] r9 = (java.lang.String[]) r9
            if (r2 == 0) goto L_0x00c9
            int r11 = r9.length
            r0 = 0
        L_0x007c:
            if (r0 >= r11) goto L_0x008b
            r6 = r9[r0]
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0088
            r11 = 1
            goto L_0x008c
        L_0x0088:
            int r0 = r0 + 1
            goto L_0x007c
        L_0x008b:
            r11 = 0
        L_0x008c:
            if (r11 != 0) goto L_0x00ed
            int r8 = r9.length
            if (r8 <= 0) goto L_0x00b3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Requires development platform "
            r8.<init>(r10)
            r8.append(r2)
            java.lang.String r10 = " (current platform is any of "
            r8.append(r10)
            java.lang.String r9 = java.util.Arrays.toString(r9)
            r8.append(r9)
            java.lang.String r9 = ")"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r12[r3] = r8
            goto L_0x00c8
        L_0x00b3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Requires development platform "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r9 = " but this is a release platform."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r12[r3] = r8
        L_0x00c8:
            return r3
        L_0x00c9:
            int r0 = f20047a
            if (r11 <= r0) goto L_0x00ed
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Requires newer sdk version #"
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r9 = " (current version is #"
            r8.append(r9)
            int r9 = f20047a
            r8.append(r9)
            java.lang.String r9 = ")"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r12[r3] = r8
            return r3
        L_0x00ed:
            if (r4 == 0) goto L_0x0145
            int r11 = r9.length
            r0 = 0
        L_0x00f1:
            if (r0 >= r11) goto L_0x0100
            r2 = r9[r0]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00fd
            r11 = 1
            goto L_0x0101
        L_0x00fd:
            int r0 = r0 + 1
            goto L_0x00f1
        L_0x0100:
            r11 = 0
        L_0x0101:
            if (r11 != 0) goto L_0x013e
            int r8 = r9.length
            if (r8 <= 0) goto L_0x0128
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Requires development platform "
            r8.<init>(r10)
            r8.append(r4)
            java.lang.String r10 = " (current platform is any of "
            r8.append(r10)
            java.lang.String r9 = java.util.Arrays.toString(r9)
            r8.append(r9)
            java.lang.String r9 = ")"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r12[r3] = r8
            goto L_0x013d
        L_0x0128:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Requires development platform "
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r9 = " but this is a release platform."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r12[r3] = r8
        L_0x013d:
            return r3
        L_0x013e:
            android.content.pm.ApplicationInfo r8 = r8.f20060a
            r9 = 10000(0x2710, float:1.4013E-41)
            r8.targetSdkVersion = r9
            goto L_0x0149
        L_0x0145:
            android.content.pm.ApplicationInfo r8 = r8.f20060a
            r8.targetSdkVersion = r5
        L_0x0149:
            com.bytedance.frameworks.plugin.f.n.a(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.d.a(com.bytedance.frameworks.plugin.pm.d$e, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, java.lang.String[]):boolean");
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0346, code lost:
        if (r10 != false) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0348, code lost:
        r0 = r6.f20075a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0350, code lost:
        if (r6.f20056c.size() <= 0) goto L_0x0354;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0352, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0354, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0355, code lost:
        r0.exported = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x056c, code lost:
        if (a(r27, r28, r29, r11, r31) == false) goto L_0x0406;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.bytedance.frameworks.plugin.pm.d.e r26, android.content.res.Resources r27, org.xmlpull.v1.XmlPullParser r28, android.util.AttributeSet r29, int r30, java.lang.String[] r31) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r25 = this;
            r9 = r25
            r15 = r26
            r14 = r27
            r13 = r28
            r12 = r29
            r11 = r30
            r10 = r31
            android.content.pm.ApplicationInfo r0 = r15.f20060a
            android.content.pm.ApplicationInfo r1 = r15.f20060a
            java.lang.String r1 = r1.packageName
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication"
            java.lang.Object r2 = a((java.lang.String) r2, (java.lang.String) r3)
            int[] r2 = (int[]) r2
            android.content.res.TypedArray r2 = r14.obtainAttributes(r12, r2)
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestApplication_name"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r8 = 0
            java.lang.String r3 = a((android.content.res.TypedArray) r2, (int) r3, (int) r8)
            if (r3 == 0) goto L_0x0045
            java.lang.String r1 = a((java.lang.String) r1, (java.lang.CharSequence) r3, (java.lang.String[]) r10)
            r0.className = r1
            java.lang.String r1 = r0.className
            if (r1 != 0) goto L_0x0049
            r2.recycle()
            return r8
        L_0x0045:
            java.lang.String r1 = "android.app.Application"
            r0.className = r1
        L_0x0049:
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_theme"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r2.getResourceId(r1, r8)
            r0.theme = r1
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_hardwareAccelerated"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.content.pm.ApplicationInfo r3 = r15.f20060a
            int r3 = r3.targetSdkVersion
            r4 = 14
            r7 = 1
            if (r3 < r4) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            boolean r20 = r2.getBoolean(r1, r3)
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_largeHeap"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r2.getBoolean(r1, r8)
            if (r1 == 0) goto L_0x0096
            int r1 = r0.flags
            r3 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r3
            r0.flags = r1
        L_0x0096:
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_supportsRtl"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r2.getBoolean(r1, r8)
            if (r1 == 0) goto L_0x00b1
            int r1 = r0.flags
            r3 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r3
            r0.flags = r1
        L_0x00b1:
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_permission"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r1 = a((android.content.res.TypedArray) r2, (int) r1, (int) r8)
            r21 = 0
            if (r1 == 0) goto L_0x00d2
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x00d2
            java.lang.String r1 = r1.intern()
            goto L_0x00d4
        L_0x00d2:
            r1 = r21
        L_0x00d4:
            r0.permission = r1
            r1 = r10[r8]
            if (r1 != 0) goto L_0x0137
            android.content.pm.ApplicationInfo r1 = r15.f20060a
            int r1 = r1.targetSdkVersion
            r3 = 8
            if (r1 < r3) goto L_0x00f7
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_process"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = 1024(0x400, float:1.435E-42)
            java.lang.String r1 = a((android.content.res.TypedArray) r2, (int) r1, (int) r3)
            goto L_0x0109
        L_0x00f7:
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_process"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r1 = r2.getNonResourceString(r1)
        L_0x0109:
            java.lang.String r3 = r0.packageName
            boolean r3 = com.bytedance.frameworks.plugin.pm.c.i(r3)
            if (r3 != 0) goto L_0x0119
            android.content.Context r1 = com.bytedance.frameworks.plugin.e.a()
            java.lang.String r1 = r1.getPackageName()
        L_0x0119:
            java.lang.String r3 = r0.packageName
            java.lang.String r4 = r0.packageName
            java.lang.String r1 = a((java.lang.String) r3, (java.lang.String) r4, (java.lang.CharSequence) r1, (int) r11, (java.lang.String[]) r10)
            r0.processName = r1
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_enabled"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r2.getBoolean(r1, r7)
            r0.enabled = r1
        L_0x0137:
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestApplication_uiOptions"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r1 = r2.getInt(r1, r8)
            r0.uiOptions = r1
            r2.recycle()
            r0 = r10[r8]
            if (r0 == 0) goto L_0x0153
            return r8
        L_0x0153:
            int r6 = r28.getDepth()
        L_0x0157:
            int r0 = r28.next()
            if (r0 == r7) goto L_0x05b1
            r5 = 3
            if (r0 != r5) goto L_0x0166
            int r1 = r28.getDepth()
            if (r1 <= r6) goto L_0x05b1
        L_0x0166:
            if (r0 == r5) goto L_0x05a5
            r4 = 4
            if (r0 == r4) goto L_0x05a5
            java.lang.String r0 = r28.getName()
            java.lang.String r1 = "activity"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01a1
            r16 = 0
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r22 = r6
            r6 = r31
            r7 = r16
            r13 = 0
            r8 = r20
            com.bytedance.frameworks.plugin.pm.d$a r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != 0) goto L_0x0195
            return r13
        L_0x0195:
            java.util.ArrayList<com.bytedance.frameworks.plugin.pm.d$a> r1 = r15.f20062c
            r1.add(r0)
        L_0x019a:
            r6 = r22
            r7 = 1
            r8 = 0
            r13 = r28
            goto L_0x0157
        L_0x01a1:
            r22 = r6
            r13 = 0
            java.lang.String r1 = "receiver"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x01c9
            r7 = 1
            r8 = 0
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            com.bytedance.frameworks.plugin.pm.d$a r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != 0) goto L_0x01c3
            return r13
        L_0x01c3:
            java.util.ArrayList<com.bytedance.frameworks.plugin.pm.d$a> r1 = r15.f20063d
            r1.add(r0)
            goto L_0x019a
        L_0x01c9:
            java.lang.String r1 = "service"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x036c
            java.lang.String r0 = "com.android.internal.R$styleable"
            java.lang.String r1 = "AndroidManifestService"
            java.lang.Object r0 = a((java.lang.String) r0, (java.lang.String) r1)
            int[] r0 = (int[]) r0
            android.content.res.TypedArray r0 = r14.obtainAttributes(r12, r0)
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.g
            if (r1 != 0) goto L_0x022e
            com.bytedance.frameworks.plugin.pm.d$f r1 = new com.bytedance.frameworks.plugin.pm.d$f
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestService_name"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 0
            r6 = 0
            r16 = 0
            java.lang.String r7 = "com.android.internal.R$styleable"
            java.lang.String r8 = "AndroidManifestService_process"
            java.lang.Object r7 = b((java.lang.String) r7, (java.lang.String) r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r17 = r7.intValue()
            r18 = 0
            java.lang.String r7 = "com.android.internal.R$styleable"
            java.lang.String r8 = "AndroidManifestService_enabled"
            java.lang.Object r7 = b((java.lang.String) r7, (java.lang.String) r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r19 = r7.intValue()
            r7 = r10
            r10 = r1
            r8 = r11
            r11 = r26
            r12 = r31
            r4 = 0
            r13 = r2
            r2 = r14
            r14 = r3
            r3 = r15
            r15 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9.g = r1
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.g
            java.lang.String r6 = "<service>"
            r1.k = r6
            goto L_0x0233
        L_0x022e:
            r7 = r10
            r8 = r11
            r2 = r14
            r3 = r15
            r4 = 0
        L_0x0233:
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.g
            r1.l = r0
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.g
            r1.f20069d = r8
            com.bytedance.frameworks.plugin.pm.d$k r6 = new com.bytedance.frameworks.plugin.pm.d$k
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.g
            android.content.pm.ServiceInfo r10 = new android.content.pm.ServiceInfo
            r10.<init>()
            r6.<init>(r1, r10)
            r1 = r7[r4]
            if (r1 == 0) goto L_0x0259
            r0.recycle()
            r15 = r2
            r8 = r3
            r6 = r21
            r4 = r29
            r5 = r28
            r14 = 0
            goto L_0x0357
        L_0x0259:
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r10 = "AndroidManifestService_exported"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r10)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r10 = r0.hasValue(r1)
            if (r10 == 0) goto L_0x0283
            android.content.pm.ServiceInfo r1 = r6.f20075a
            java.lang.String r11 = "com.android.internal.R$styleable"
            java.lang.String r12 = "AndroidManifestService_exported"
            java.lang.Object r11 = b((java.lang.String) r11, (java.lang.String) r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            boolean r11 = r0.getBoolean(r11, r4)
            r1.exported = r11
        L_0x0283:
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r11 = "AndroidManifestService_permission"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r1 = a((android.content.res.TypedArray) r0, (int) r1, (int) r4)
            if (r1 != 0) goto L_0x02a3
            android.content.pm.ServiceInfo r1 = r6.f20075a
            android.content.pm.ApplicationInfo r11 = r3.f20060a
            java.lang.String r11 = r11.permission
            r24 = r11
            r11 = r1
            r1 = r24
            goto L_0x02b6
        L_0x02a3:
            android.content.pm.ServiceInfo r11 = r6.f20075a
            int r12 = r1.length()
            if (r12 <= 0) goto L_0x02b4
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.intern()
            goto L_0x02b6
        L_0x02b4:
            r1 = r21
        L_0x02b6:
            r11.permission = r1
            r0.recycle()
            int r11 = r28.getDepth()
        L_0x02bf:
            int r0 = r28.next()
            r15 = 1
            if (r0 == r15) goto L_0x033f
            if (r0 != r5) goto L_0x02ce
            int r1 = r28.getDepth()
            if (r1 <= r11) goto L_0x033f
        L_0x02ce:
            if (r0 == r5) goto L_0x0333
            r12 = 4
            if (r0 == r12) goto L_0x0333
            java.lang.String r0 = r28.getName()
            java.lang.String r1 = "intent-filter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0309
            com.bytedance.frameworks.plugin.pm.d$l r13 = new com.bytedance.frameworks.plugin.pm.d$l
            r13.<init>(r6)
            r14 = 1
            r0 = r27
            r1 = r28
            r15 = r2
            r2 = r29
            r8 = r3
            r3 = r14
            r14 = 0
            r4 = r13
            r16 = 3
            r5 = r31
            boolean r0 = a((android.content.res.Resources) r0, (org.xmlpull.v1.XmlPullParser) r1, (android.util.AttributeSet) r2, (boolean) r3, (com.bytedance.frameworks.plugin.pm.d.C0173d) r4, (java.lang.String[]) r5)
            if (r0 != 0) goto L_0x0301
            r6 = r21
            r4 = r29
            r5 = r28
            goto L_0x0357
        L_0x0301:
            java.util.ArrayList r0 = r6.f20056c
            r0.add(r13)
        L_0x0306:
            r3 = r8
            r2 = r15
            goto L_0x033a
        L_0x0309:
            r15 = r2
            r8 = r3
            r14 = 0
            r16 = 3
            java.lang.String r0 = r28.getName()
            java.lang.String r1 = "meta-data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x032b
            android.os.Bundle r0 = r6.f20058e
            r4 = r29
            r5 = r28
            android.os.Bundle r0 = a((android.content.res.Resources) r15, (org.xmlpull.v1.XmlPullParser) r5, (android.util.AttributeSet) r4, (android.os.Bundle) r0, (java.lang.String[]) r7)
            r6.f20058e = r0
            if (r0 != 0) goto L_0x0306
            r6 = r21
            goto L_0x0357
        L_0x032b:
            r4 = r29
            r5 = r28
            com.bytedance.frameworks.plugin.f.n.a(r28)
            goto L_0x0306
        L_0x0333:
            r4 = r29
            r5 = r28
            r14 = 0
            r16 = 3
        L_0x033a:
            r4 = 0
            r5 = 3
            r8 = r30
            goto L_0x02bf
        L_0x033f:
            r15 = r2
            r8 = r3
            r4 = r29
            r5 = r28
            r14 = 0
            if (r10 != 0) goto L_0x0357
            android.content.pm.ServiceInfo r0 = r6.f20075a
            java.util.ArrayList r1 = r6.f20056c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0354
            r1 = 1
            goto L_0x0355
        L_0x0354:
            r1 = 0
        L_0x0355:
            r0.exported = r1
        L_0x0357:
            if (r6 != 0) goto L_0x035a
            return r14
        L_0x035a:
            java.util.ArrayList<com.bytedance.frameworks.plugin.pm.d$k> r0 = r8.f20065f
            r0.add(r6)
            r12 = r4
            r13 = r5
            r10 = r7
            r14 = r15
            r6 = r22
            r7 = 1
            r11 = r30
            r15 = r8
            r8 = 0
            goto L_0x0157
        L_0x036c:
            r7 = r10
            r4 = r12
            r8 = r15
            r5 = r28
            r15 = r14
            r14 = 0
            java.lang.String r1 = "provider"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0579
            java.lang.String r0 = "com.android.internal.R$styleable"
            java.lang.String r1 = "AndroidManifestProvider"
            java.lang.Object r0 = a((java.lang.String) r0, (java.lang.String) r1)
            int[] r0 = (int[]) r0
            android.content.res.TypedArray r0 = r15.obtainAttributes(r4, r0)
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.h
            if (r1 != 0) goto L_0x03e2
            com.bytedance.frameworks.plugin.pm.d$f r1 = new com.bytedance.frameworks.plugin.pm.d$f
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestProvider_name"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r13 = r2.intValue()
            r2 = 0
            r3 = 0
            r16 = 0
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r10 = "AndroidManifestProvider_process"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r10)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r17 = r6.intValue()
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r10 = "AndroidManifestProvider_description"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r10)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r18 = r6.intValue()
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r10 = "AndroidManifestProvider_enabled"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r10)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r19 = r6.intValue()
            r10 = r1
            r11 = r26
            r12 = r31
            r6 = 0
            r14 = r2
            r2 = r15
            r23 = 1
            r15 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9.h = r1
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.h
            java.lang.String r3 = "<provider>"
            r1.k = r3
            goto L_0x03e6
        L_0x03e2:
            r2 = r15
            r6 = 0
            r23 = 1
        L_0x03e6:
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.h
            r1.l = r0
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.h
            r10 = r30
            r1.f20069d = r10
            com.bytedance.frameworks.plugin.pm.d$i r11 = new com.bytedance.frameworks.plugin.pm.d$i
            com.bytedance.frameworks.plugin.pm.d$f r1 = r9.h
            android.content.pm.ProviderInfo r3 = new android.content.pm.ProviderInfo
            r3.<init>()
            r11.<init>(r1, r3)
            r1 = r7[r6]
            if (r1 == 0) goto L_0x040a
            r0.recycle()
        L_0x0403:
            r12 = r2
            r13 = r4
            r14 = r5
        L_0x0406:
            r11 = r21
            goto L_0x0570
        L_0x040a:
            android.content.pm.ApplicationInfo r1 = r8.f20060a
            int r1 = r1.targetSdkVersion
            r3 = 17
            if (r1 >= r3) goto L_0x0414
            r1 = 1
            goto L_0x0415
        L_0x0414:
            r1 = 0
        L_0x0415:
            android.content.pm.ProviderInfo r12 = r11.f20073a
            java.lang.String r13 = "com.android.internal.R$styleable"
            java.lang.String r14 = "AndroidManifestProvider_exported"
            java.lang.Object r13 = b((java.lang.String) r13, (java.lang.String) r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            boolean r1 = r0.getBoolean(r13, r1)
            r12.exported = r1
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r12 = "AndroidManifestProvider_authorities"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r1 = a((android.content.res.TypedArray) r0, (int) r1, (int) r6)
            android.content.pm.ProviderInfo r12 = r11.f20073a
            java.lang.String r13 = "com.android.internal.R$styleable"
            java.lang.String r14 = "AndroidManifestProvider_syncable"
            java.lang.Object r13 = b((java.lang.String) r13, (java.lang.String) r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            boolean r13 = r0.getBoolean(r13, r6)
            r12.isSyncable = r13
            java.lang.String r12 = "com.android.internal.R$styleable"
            java.lang.String r13 = "AndroidManifestProvider_permission"
            java.lang.Object r12 = b((java.lang.String) r12, (java.lang.String) r13)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.String r12 = a((android.content.res.TypedArray) r0, (int) r12, (int) r6)
            java.lang.String r13 = "com.android.internal.R$styleable"
            java.lang.String r14 = "AndroidManifestProvider_readPermission"
            java.lang.Object r13 = b((java.lang.String) r13, (java.lang.String) r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.String r13 = a((android.content.res.TypedArray) r0, (int) r13, (int) r6)
            if (r13 != 0) goto L_0x047a
            r13 = r12
        L_0x047a:
            if (r13 != 0) goto L_0x0488
            android.content.pm.ProviderInfo r13 = r11.f20073a
            android.content.pm.ApplicationInfo r14 = r8.f20060a
            java.lang.String r14 = r14.permission
            r24 = r14
            r14 = r13
            r13 = r24
            goto L_0x049b
        L_0x0488:
            android.content.pm.ProviderInfo r14 = r11.f20073a
            int r15 = r13.length()
            if (r15 <= 0) goto L_0x0499
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r13.intern()
            goto L_0x049b
        L_0x0499:
            r13 = r21
        L_0x049b:
            r14.readPermission = r13
            java.lang.String r13 = "com.android.internal.R$styleable"
            java.lang.String r14 = "AndroidManifestProvider_writePermission"
            java.lang.Object r13 = b((java.lang.String) r13, (java.lang.String) r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.String r13 = a((android.content.res.TypedArray) r0, (int) r13, (int) r6)
            if (r13 != 0) goto L_0x04b2
            goto L_0x04b3
        L_0x04b2:
            r12 = r13
        L_0x04b3:
            if (r12 != 0) goto L_0x04c1
            android.content.pm.ProviderInfo r12 = r11.f20073a
            android.content.pm.ApplicationInfo r13 = r8.f20060a
            java.lang.String r13 = r13.permission
            r24 = r13
            r13 = r12
            r12 = r24
            goto L_0x04d4
        L_0x04c1:
            android.content.pm.ProviderInfo r13 = r11.f20073a
            int r14 = r12.length()
            if (r14 <= 0) goto L_0x04d2
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = r12.intern()
            goto L_0x04d4
        L_0x04d2:
            r12 = r21
        L_0x04d4:
            r13.writePermission = r12
            android.content.pm.ProviderInfo r12 = r11.f20073a
            java.lang.String r13 = "com.android.internal.R$styleable"
            java.lang.String r14 = "AndroidManifestProvider_grantUriPermissions"
            java.lang.Object r13 = b((java.lang.String) r13, (java.lang.String) r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            boolean r13 = r0.getBoolean(r13, r6)
            r12.grantUriPermissions = r13
            android.content.pm.ProviderInfo r12 = r11.f20073a
            java.lang.String r13 = "com.android.internal.R$styleable"
            java.lang.String r14 = "AndroidManifestProvider_multiprocess"
            java.lang.Object r13 = b((java.lang.String) r13, (java.lang.String) r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            boolean r13 = r0.getBoolean(r13, r6)
            r12.multiprocess = r13
            android.content.pm.ProviderInfo r12 = r11.f20073a
            java.lang.String r13 = "com.android.internal.R$styleable"
            java.lang.String r14 = "AndroidManifestProvider_initOrder"
            java.lang.Object r13 = b((java.lang.String) r13, (java.lang.String) r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            int r13 = r0.getInt(r13, r6)
            r12.initOrder = r13
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r3) goto L_0x0547
            android.content.pm.ProviderInfo r3 = r11.f20073a
            r3.flags = r6
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r12 = "AndroidManifestProvider_singleUser"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r3 = r0.getBoolean(r3, r6)
            if (r3 == 0) goto L_0x0547
            android.content.pm.ProviderInfo r3 = r11.f20073a
            int r12 = r3.flags
            r13 = 1073741824(0x40000000, float:2.0)
            r12 = r12 | r13
            r3.flags = r12
            android.content.pm.ProviderInfo r3 = r11.f20073a
            boolean r3 = r3.exported
            if (r3 == 0) goto L_0x0547
            android.content.pm.ProviderInfo r3 = r11.f20073a
            r3.exported = r6
        L_0x0547:
            r0.recycle()
            if (r1 != 0) goto L_0x0552
            java.lang.String r0 = "<provider> does not include authorities attribute"
            r7[r6] = r0
            goto L_0x0403
        L_0x0552:
            android.content.pm.ProviderInfo r0 = r11.f20073a
            java.lang.String r1 = r1.intern()
            r0.authority = r1
            r0 = r25
            r1 = r27
            r12 = r2
            r2 = r28
            r3 = r29
            r13 = r4
            r4 = r11
            r14 = r5
            r5 = r31
            boolean r0 = r0.a((android.content.res.Resources) r1, (org.xmlpull.v1.XmlPullParser) r2, (android.util.AttributeSet) r3, (com.bytedance.frameworks.plugin.pm.d.i) r4, (java.lang.String[]) r5)
            if (r0 != 0) goto L_0x0570
            goto L_0x0406
        L_0x0570:
            if (r11 != 0) goto L_0x0573
            return r6
        L_0x0573:
            java.util.ArrayList<com.bytedance.frameworks.plugin.pm.d$i> r0 = r8.f20064e
            r0.add(r11)
            goto L_0x059b
        L_0x0579:
            r13 = r4
            r14 = r5
            r12 = r15
            r6 = 0
            r10 = r30
            r23 = 1
            java.lang.String r0 = r28.getName()
            java.lang.String r1 = "meta-data"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0598
            android.os.Bundle r0 = r8.i
            android.os.Bundle r0 = a((android.content.res.Resources) r12, (org.xmlpull.v1.XmlPullParser) r14, (android.util.AttributeSet) r13, (android.os.Bundle) r0, (java.lang.String[]) r7)
            r8.i = r0
            if (r0 != 0) goto L_0x059b
            return r6
        L_0x0598:
            com.bytedance.frameworks.plugin.f.n.a(r28)
        L_0x059b:
            r15 = r8
            r11 = r10
            r6 = r22
            r8 = 0
            r10 = r7
            r7 = 1
            r24 = r14
            goto L_0x05ab
        L_0x05a5:
            r24 = r13
            r13 = r12
            r12 = r14
            r14 = r24
        L_0x05ab:
            r14 = r12
            r12 = r13
            r13 = r24
            goto L_0x0157
        L_0x05b1:
            r23 = 1
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.d.a(com.bytedance.frameworks.plugin.pm.d$e, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, int, java.lang.String[]):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.content.pm.PathPermission[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, com.bytedance.frameworks.plugin.pm.d.i r14, java.lang.String[] r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            int r0 = r12.getDepth()
        L_0x0004:
            int r1 = r12.next()
            r2 = 1
            if (r1 == r2) goto L_0x01f0
            r3 = 3
            if (r1 != r3) goto L_0x0014
            int r4 = r12.getDepth()
            if (r4 <= r0) goto L_0x01f0
        L_0x0014:
            if (r1 == r3) goto L_0x0004
            r3 = 4
            if (r1 == r3) goto L_0x0004
            java.lang.String r1 = r12.getName()
            java.lang.String r3 = "intent-filter"
            boolean r1 = r1.equals(r3)
            r3 = 0
            if (r1 == 0) goto L_0x003e
            com.bytedance.frameworks.plugin.pm.d$j r1 = new com.bytedance.frameworks.plugin.pm.d$j
            r1.<init>(r14)
            r7 = 1
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r1
            r9 = r15
            boolean r2 = a((android.content.res.Resources) r4, (org.xmlpull.v1.XmlPullParser) r5, (android.util.AttributeSet) r6, (boolean) r7, (com.bytedance.frameworks.plugin.pm.d.C0173d) r8, (java.lang.String[]) r9)
            if (r2 != 0) goto L_0x0038
            return r3
        L_0x0038:
            java.util.ArrayList r2 = r14.f20056c
            r2.add(r1)
            goto L_0x0004
        L_0x003e:
            java.lang.String r1 = r12.getName()
            java.lang.String r4 = "meta-data"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0055
            android.os.Bundle r1 = r14.f20058e
            android.os.Bundle r1 = a((android.content.res.Resources) r11, (org.xmlpull.v1.XmlPullParser) r12, (android.util.AttributeSet) r13, (android.os.Bundle) r1, (java.lang.String[]) r15)
            r14.f20058e = r1
            if (r1 != 0) goto L_0x0004
            return r3
        L_0x0055:
            java.lang.String r1 = r12.getName()
            java.lang.String r4 = "grant-uri-permission"
            boolean r1 = r1.equals(r4)
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L_0x00f8
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r6 = "AndroidManifestGrantUriPermission"
            java.lang.Object r1 = a((java.lang.String) r1, (java.lang.String) r6)
            int[] r1 = (int[]) r1
            android.content.res.TypedArray r1 = r11.obtainAttributes(r13, r1)
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r7 = "AndroidManifestGrantUriPermission_path"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r6 = a((android.content.res.TypedArray) r1, (int) r6, (int) r3)
            if (r6 == 0) goto L_0x008a
            android.os.PatternMatcher r5 = new android.os.PatternMatcher
            r5.<init>(r6, r3)
        L_0x008a:
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r7 = "AndroidManifestGrantUriPermission_pathPrefix"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r6 = a((android.content.res.TypedArray) r1, (int) r6, (int) r3)
            if (r6 == 0) goto L_0x00a3
            android.os.PatternMatcher r5 = new android.os.PatternMatcher
            r5.<init>(r6, r2)
        L_0x00a3:
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r7 = "AndroidManifestGrantUriPermission_pathPattern"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r6 = a((android.content.res.TypedArray) r1, (int) r6, (int) r3)
            if (r6 == 0) goto L_0x00bc
            android.os.PatternMatcher r5 = new android.os.PatternMatcher
            r5.<init>(r6, r4)
        L_0x00bc:
            r1.recycle()
            if (r5 == 0) goto L_0x00f3
            android.content.pm.ProviderInfo r1 = r14.f20073a
            android.os.PatternMatcher[] r1 = r1.uriPermissionPatterns
            if (r1 != 0) goto L_0x00d4
            android.content.pm.ProviderInfo r1 = r14.f20073a
            android.os.PatternMatcher[] r4 = new android.os.PatternMatcher[r2]
            r1.uriPermissionPatterns = r4
            android.content.pm.ProviderInfo r1 = r14.f20073a
            android.os.PatternMatcher[] r1 = r1.uriPermissionPatterns
            r1[r3] = r5
            goto L_0x00ea
        L_0x00d4:
            android.content.pm.ProviderInfo r1 = r14.f20073a
            android.os.PatternMatcher[] r1 = r1.uriPermissionPatterns
            int r1 = r1.length
            int r4 = r1 + 1
            android.os.PatternMatcher[] r4 = new android.os.PatternMatcher[r4]
            android.content.pm.ProviderInfo r6 = r14.f20073a
            android.os.PatternMatcher[] r6 = r6.uriPermissionPatterns
            java.lang.System.arraycopy(r6, r3, r4, r3, r1)
            r4[r1] = r5
            android.content.pm.ProviderInfo r1 = r14.f20073a
            r1.uriPermissionPatterns = r4
        L_0x00ea:
            android.content.pm.ProviderInfo r1 = r14.f20073a
            r1.grantUriPermissions = r2
            com.bytedance.frameworks.plugin.f.n.a(r12)
            goto L_0x0004
        L_0x00f3:
            com.bytedance.frameworks.plugin.f.n.a(r12)
            goto L_0x0004
        L_0x00f8:
            java.lang.String r1 = r12.getName()
            java.lang.String r6 = "path-permission"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x01eb
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r6 = "AndroidManifestPathPermission"
            java.lang.Object r1 = a((java.lang.String) r1, (java.lang.String) r6)
            int[] r1 = (int[]) r1
            android.content.res.TypedArray r1 = r11.obtainAttributes(r13, r1)
            java.lang.String r6 = "com.android.internal.R$styleable"
            java.lang.String r7 = "AndroidManifestPathPermission_permission"
            java.lang.Object r6 = b((java.lang.String) r6, (java.lang.String) r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r6 = a((android.content.res.TypedArray) r1, (int) r6, (int) r3)
            java.lang.String r7 = "com.android.internal.R$styleable"
            java.lang.String r8 = "AndroidManifestPathPermission_readPermission"
            java.lang.Object r7 = b((java.lang.String) r7, (java.lang.String) r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r7 = a((android.content.res.TypedArray) r1, (int) r7, (int) r3)
            if (r7 != 0) goto L_0x0139
            r7 = r6
        L_0x0139:
            java.lang.String r8 = "com.android.internal.R$styleable"
            java.lang.String r9 = "AndroidManifestPathPermission_writePermission"
            java.lang.Object r8 = b((java.lang.String) r8, (java.lang.String) r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.String r8 = a((android.content.res.TypedArray) r1, (int) r8, (int) r3)
            if (r8 != 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r6 = r8
        L_0x014f:
            if (r7 == 0) goto L_0x0158
            java.lang.String r7 = r7.intern()
            r8 = r7
            r7 = 1
            goto L_0x015a
        L_0x0158:
            r8 = r7
            r7 = 0
        L_0x015a:
            if (r6 == 0) goto L_0x0161
            java.lang.String r6 = r6.intern()
            r7 = 1
        L_0x0161:
            if (r7 != 0) goto L_0x0168
            com.bytedance.frameworks.plugin.f.n.a(r12)
            goto L_0x0004
        L_0x0168:
            java.lang.String r7 = "com.android.internal.R$styleable"
            java.lang.String r9 = "AndroidManifestPathPermission_path"
            java.lang.Object r7 = b((java.lang.String) r7, (java.lang.String) r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r7 = a((android.content.res.TypedArray) r1, (int) r7, (int) r3)
            if (r7 == 0) goto L_0x0181
            android.content.pm.PathPermission r5 = new android.content.pm.PathPermission
            r5.<init>(r7, r3, r8, r6)
        L_0x0181:
            java.lang.String r7 = "com.android.internal.R$styleable"
            java.lang.String r9 = "AndroidManifestPathPermission_pathPrefix"
            java.lang.Object r7 = b((java.lang.String) r7, (java.lang.String) r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r7 = a((android.content.res.TypedArray) r1, (int) r7, (int) r3)
            if (r7 == 0) goto L_0x019a
            android.content.pm.PathPermission r5 = new android.content.pm.PathPermission
            r5.<init>(r7, r2, r8, r6)
        L_0x019a:
            java.lang.String r7 = "com.android.internal.R$styleable"
            java.lang.String r9 = "AndroidManifestPathPermission_pathPattern"
            java.lang.Object r7 = b((java.lang.String) r7, (java.lang.String) r9)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r7 = a((android.content.res.TypedArray) r1, (int) r7, (int) r3)
            if (r7 == 0) goto L_0x01b3
            android.content.pm.PathPermission r5 = new android.content.pm.PathPermission
            r5.<init>(r7, r4, r8, r6)
        L_0x01b3:
            r1.recycle()
            if (r5 == 0) goto L_0x01e6
            android.content.pm.ProviderInfo r1 = r14.f20073a
            android.content.pm.PathPermission[] r1 = r1.pathPermissions
            if (r1 != 0) goto L_0x01cb
            android.content.pm.ProviderInfo r1 = r14.f20073a
            android.content.pm.PathPermission[] r2 = new android.content.pm.PathPermission[r2]
            r1.pathPermissions = r2
            android.content.pm.ProviderInfo r1 = r14.f20073a
            android.content.pm.PathPermission[] r1 = r1.pathPermissions
            r1[r3] = r5
            goto L_0x01e1
        L_0x01cb:
            android.content.pm.ProviderInfo r1 = r14.f20073a
            android.content.pm.PathPermission[] r1 = r1.pathPermissions
            int r1 = r1.length
            int r2 = r1 + 1
            android.content.pm.PathPermission[] r2 = new android.content.pm.PathPermission[r2]
            android.content.pm.ProviderInfo r4 = r14.f20073a
            android.content.pm.PathPermission[] r4 = r4.pathPermissions
            java.lang.System.arraycopy(r4, r3, r2, r3, r1)
            r2[r1] = r5
            android.content.pm.ProviderInfo r1 = r14.f20073a
            r1.pathPermissions = r2
        L_0x01e1:
            com.bytedance.frameworks.plugin.f.n.a(r12)
            goto L_0x0004
        L_0x01e6:
            com.bytedance.frameworks.plugin.f.n.a(r12)
            goto L_0x0004
        L_0x01eb:
            com.bytedance.frameworks.plugin.f.n.a(r12)
            goto L_0x0004
        L_0x01f0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.d.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, com.bytedance.frameworks.plugin.pm.d$i, java.lang.String[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a4, code lost:
        return true;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, boolean r10, com.bytedance.frameworks.plugin.pm.d.C0173d r11, java.lang.String[] r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            java.lang.String r10 = "com.android.internal.R$styleable"
            java.lang.String r0 = "AndroidManifestIntentFilter"
            java.lang.Object r10 = a((java.lang.String) r10, (java.lang.String) r0)
            int[] r10 = (int[]) r10
            android.content.res.TypedArray r10 = r7.obtainAttributes(r9, r10)
            java.lang.String r0 = "com.android.internal.R$styleable"
            java.lang.String r1 = "AndroidManifestIntentFilter_priority"
            java.lang.Object r0 = b((java.lang.String) r0, (java.lang.String) r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 0
            int r0 = r10.getInt(r0, r1)
            r11.setPriority(r0)
            r10.recycle()
            int r10 = r8.getDepth()
        L_0x002b:
            int r0 = r8.next()
            r2 = 1
            if (r0 == r2) goto L_0x019c
            r3 = 3
            if (r0 != r3) goto L_0x003b
            int r4 = r8.getDepth()
            if (r4 <= r10) goto L_0x019c
        L_0x003b:
            if (r0 == r3) goto L_0x002b
            r3 = 4
            if (r0 == r3) goto L_0x002b
            java.lang.String r0 = r8.getName()
            java.lang.String r3 = "action"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0067
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "name"
            java.lang.String r0 = r9.getAttributeValue(r0, r2)
            if (r0 == 0) goto L_0x0062
            java.lang.String r2 = ""
            if (r0 != r2) goto L_0x005b
            goto L_0x0062
        L_0x005b:
            com.bytedance.frameworks.plugin.f.n.a(r8)
            r11.addAction(r0)
            goto L_0x002b
        L_0x0062:
            java.lang.String r7 = "No value supplied for <android:name>"
            r12[r1] = r7
            return r1
        L_0x0067:
            java.lang.String r3 = "category"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x008a
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "name"
            java.lang.String r0 = r9.getAttributeValue(r0, r2)
            if (r0 == 0) goto L_0x0085
            java.lang.String r2 = ""
            if (r0 != r2) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            com.bytedance.frameworks.plugin.f.n.a(r8)
            r11.addCategory(r0)
            goto L_0x002b
        L_0x0085:
            java.lang.String r7 = "No value supplied for <android:name>"
            r12[r1] = r7
            return r1
        L_0x008a:
            java.lang.String r3 = "data"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0197
            java.lang.String r0 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestData"
            java.lang.Object r0 = a((java.lang.String) r0, (java.lang.String) r3)
            int[] r0 = (int[]) r0
            android.content.res.TypedArray r0 = r7.obtainAttributes(r9, r0)
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestData_mimeType"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = a((android.content.res.TypedArray) r0, (int) r3, (int) r1)
            if (r3 == 0) goto L_0x00c3
            r11.addDataType(r3)     // Catch:{ MalformedMimeTypeException -> 0x00b8 }
            goto L_0x00c3
        L_0x00b8:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            r12[r1] = r7
            r0.recycle()
            return r1
        L_0x00c3:
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestData_scheme"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = a((android.content.res.TypedArray) r0, (int) r3, (int) r1)
            if (r3 == 0) goto L_0x00da
            r11.addDataScheme(r3)
        L_0x00da:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 19
            r5 = 2
            if (r3 < r4) goto L_0x0126
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestData_ssp"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = a((android.content.res.TypedArray) r0, (int) r3, (int) r1)
            if (r3 == 0) goto L_0x00f8
            r11.addDataSchemeSpecificPart(r3, r1)
        L_0x00f8:
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestData_sspPrefix"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = a((android.content.res.TypedArray) r0, (int) r3, (int) r1)
            if (r3 == 0) goto L_0x010f
            r11.addDataSchemeSpecificPart(r3, r2)
        L_0x010f:
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestData_sspPattern"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = a((android.content.res.TypedArray) r0, (int) r3, (int) r1)
            if (r3 == 0) goto L_0x0126
            r11.addDataSchemeSpecificPart(r3, r5)
        L_0x0126:
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestData_host"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = a((android.content.res.TypedArray) r0, (int) r3, (int) r1)
            java.lang.String r4 = "com.android.internal.R$styleable"
            java.lang.String r6 = "AndroidManifestData_port"
            java.lang.Object r4 = b((java.lang.String) r4, (java.lang.String) r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r4 = a((android.content.res.TypedArray) r0, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x014f
            r11.addDataAuthority(r3, r4)
        L_0x014f:
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestData_path"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = a((android.content.res.TypedArray) r0, (int) r3, (int) r1)
            if (r3 == 0) goto L_0x0166
            r11.addDataPath(r3, r1)
        L_0x0166:
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestData_pathPrefix"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = a((android.content.res.TypedArray) r0, (int) r3, (int) r1)
            if (r3 == 0) goto L_0x017d
            r11.addDataPath(r3, r2)
        L_0x017d:
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestData_pathPattern"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r2 = a((android.content.res.TypedArray) r0, (int) r2, (int) r1)
            if (r2 == 0) goto L_0x0194
            r11.addDataPath(r2, r5)
        L_0x0194:
            r0.recycle()
        L_0x0197:
            com.bytedance.frameworks.plugin.f.n.a(r8)
            goto L_0x002b
        L_0x019c:
            java.lang.String r7 = "android.intent.category.DEFAULT"
            boolean r7 = r11.hasCategory(r7)
            r11.f20059b = r7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.d.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, boolean, com.bytedance.frameworks.plugin.pm.d$d, java.lang.String[]):boolean");
    }

    private static Object a(String str, String str2) {
        Object c2 = c(str, str2);
        if (c2 == null) {
            return new int[0];
        }
        return c2;
    }

    private static Object b(String str, String str2) {
        Object c2 = c(str, str2);
        if (c2 == null) {
            return 0;
        }
        return c2;
    }

    public static final ActivityInfo a(a aVar, int i2) {
        if (aVar == null) {
            return null;
        }
        ActivityInfo activityInfo = new ActivityInfo(aVar.f20053a);
        if ((i2 & SearchJediMixFeedAdapter.f42517f) != 0) {
            activityInfo.metaData = aVar.f20058e;
        }
        activityInfo.applicationInfo = b(aVar.f20055b, i2);
        return activityInfo;
    }

    public static final ProviderInfo a(i iVar, int i2) {
        if (iVar == null) {
            return null;
        }
        ProviderInfo providerInfo = new ProviderInfo(iVar.f20073a);
        if ((i2 & SearchJediMixFeedAdapter.f42517f) != 0) {
            providerInfo.metaData = iVar.f20058e;
        }
        if ((i2 & 2048) == 0) {
            providerInfo.uriPermissionPatterns = null;
        }
        providerInfo.applicationInfo = b(iVar.f20055b, i2);
        return providerInfo;
    }

    private static Object c(String str, String str2) {
        Object d2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (Build.VERSION.SDK_INT != 21 && Build.VERSION.SDK_INT != 22) {
            return d(str, str2);
        }
        synchronized (f20049c) {
            d2 = d(str, str2);
        }
        return d2;
    }

    private static Object d(String str, String str2) {
        String format = String.format("%s$%s", new Object[]{str, str2});
        Object obj = f20050d.get(format);
        if (obj != null) {
            return obj;
        }
        try {
            Object b2 = com.bytedance.frameworks.plugin.e.a.b(Class.forName(str), str2);
            if (b2 != null) {
                try {
                    f20050d.put(format, b2);
                } catch (Exception unused) {
                }
            }
            return b2;
        } catch (Exception unused2) {
            return obj;
        }
    }

    public static final ServiceInfo a(k kVar, int i2) {
        if (kVar == null) {
            return null;
        }
        ServiceInfo serviceInfo = new ServiceInfo(kVar.f20075a);
        if ((i2 & SearchJediMixFeedAdapter.f42517f) != 0) {
            serviceInfo.metaData = kVar.f20058e;
        }
        serviceInfo.applicationInfo = b(kVar.f20055b, i2);
        return serviceInfo;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0094 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.pm.ApplicationInfo b(com.bytedance.frameworks.plugin.pm.d.e r8, int r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.content.pm.ApplicationInfo r1 = new android.content.pm.ApplicationInfo
            android.content.pm.ApplicationInfo r2 = r8.f20060a
            r1.<init>(r2)
            r9 = r9 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0013
            android.os.Bundle r9 = r8.i
            r1.metaData = r9
        L_0x0013:
            java.lang.String r9 = r1.sourceDir
            if (r9 != 0) goto L_0x001b
            java.lang.String r9 = r8.j
            r1.sourceDir = r9
        L_0x001b:
            java.lang.String r9 = r1.publicSourceDir
            if (r9 != 0) goto L_0x0023
            java.lang.String r9 = r8.j
            r1.publicSourceDir = r9
        L_0x0023:
            java.lang.String r9 = r1.dataDir
            if (r9 != 0) goto L_0x004c
            com.bytedance.frameworks.plugin.d.b r9 = com.bytedance.frameworks.plugin.d.b.a()
            java.lang.String r2 = r1.packageName
            com.bytedance.frameworks.plugin.a.b r9 = r9.a(r2)
            if (r9 == 0) goto L_0x0044
            boolean r9 = r9.h
            if (r9 != 0) goto L_0x0044
            android.content.Context r9 = com.bytedance.frameworks.plugin.e.a()
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo()
            java.lang.String r9 = r9.dataDir
            r1.dataDir = r9
            goto L_0x004c
        L_0x0044:
            java.lang.String r9 = r1.packageName
            java.lang.String r9 = com.bytedance.frameworks.plugin.b.e.b(r9)
            r1.dataDir = r9
        L_0x004c:
            r9 = 0
            r2 = 1
            r3 = 21
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0094 }
            if (r4 < r3) goto L_0x0094
            java.lang.String r4 = "scanSourceDir"
            java.lang.Object r4 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r1, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0094 }
            if (r4 != 0) goto L_0x0063
            java.lang.String r4 = "scanSourceDir"
            java.lang.String r5 = r1.sourceDir     // Catch:{ Throwable -> 0x0094 }
            com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r1, (java.lang.String) r4, (java.lang.Object) r5)     // Catch:{ Throwable -> 0x0094 }
        L_0x0063:
            com.bytedance.frameworks.plugin.core.d r4 = com.bytedance.frameworks.plugin.core.d.a()     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r5 = r1.packageName     // Catch:{ Throwable -> 0x0094 }
            android.content.SharedPreferences r4 = r4.f2195a     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r6 = "%s-primarycpuabi"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Throwable -> 0x0094 }
            r7[r9] = r5     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r5 = java.lang.String.format(r6, r7)     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r0 = r4.getString(r5, r0)     // Catch:{ Throwable -> 0x0094 }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0094 }
            if (r4 == 0) goto L_0x008f
            android.content.Context r0 = com.bytedance.frameworks.plugin.e.a()     // Catch:{ Throwable -> 0x0094 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r4 = "primaryCpuAbi"
            java.lang.Object r0 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r0, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0094 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x0094 }
        L_0x008f:
            java.lang.String r4 = "primaryCpuAbi"
            com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r1, (java.lang.String) r4, (java.lang.Object) r0)     // Catch:{ Throwable -> 0x0094 }
        L_0x0094:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00a7 }
            if (r0 < r3) goto L_0x00a7
            java.lang.String r0 = "scanPublicSourceDir"
            java.lang.Object r0 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r1, (java.lang.String) r0)     // Catch:{ Throwable -> 0x00a7 }
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = "scanPublicSourceDir"
            java.lang.String r4 = r1.publicSourceDir     // Catch:{ Throwable -> 0x00a7 }
            com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r1, (java.lang.String) r0, (java.lang.Object) r4)     // Catch:{ Throwable -> 0x00a7 }
        L_0x00a7:
            android.content.Context r0 = com.bytedance.frameworks.plugin.e.a()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.uid
            r1.uid = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 9
            if (r0 < r4) goto L_0x00e9
            java.lang.String r0 = r1.nativeLibraryDir
            if (r0 != 0) goto L_0x00e9
            java.io.File r0 = new java.io.File
            java.lang.String r4 = r8.j
            r0.<init>(r4)
            java.io.File r4 = r0.getParentFile()
            if (r4 == 0) goto L_0x00e9
            java.io.File r4 = r0.getParentFile()
            java.io.File r4 = r4.getParentFile()
            if (r4 == 0) goto L_0x00e9
            java.io.File r4 = new java.io.File
            java.io.File r0 = r0.getParentFile()
            java.io.File r0 = r0.getParentFile()
            java.lang.String r5 = "lib"
            r4.<init>(r0, r5)
            java.lang.String r0 = r4.getPath()
            r1.nativeLibraryDir = r0
        L_0x00e9:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x00f9
            java.lang.String[] r0 = r1.splitSourceDirs
            if (r0 != 0) goto L_0x00f9
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r4 = r8.j
            r0[r9] = r4
            r1.splitSourceDirs = r0
        L_0x00f9:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0109
            java.lang.String[] r0 = r1.splitPublicSourceDirs
            if (r0 != 0) goto L_0x0109
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.String r8 = r8.j
            r0[r9] = r8
            r1.splitPublicSourceDirs = r0
        L_0x0109:
            java.lang.String r8 = r1.processName
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0115
            java.lang.String r8 = r1.packageName
            r1.processName = r8
        L_0x0115:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.d.b(com.bytedance.frameworks.plugin.pm.d$e, int):android.content.pm.ApplicationInfo");
    }

    public static PackageInfo a(e eVar, int i2) {
        PackageInfo packageInfo;
        int i3;
        PermissionInfo permissionInfo;
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = eVar.h;
        packageInfo2.versionCode = eVar.k;
        packageInfo2.versionName = eVar.l;
        packageInfo2.applicationInfo = b(eVar, i2);
        if ((i2 & 1) != 0) {
            int size = eVar.f20062c.size();
            if (size > 0) {
                int i4 = i2 & 512;
                if (i4 != 0) {
                    packageInfo2.activities = new ActivityInfo[size];
                } else {
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        if (eVar.f20062c.get(i6).f20053a.enabled) {
                            i5++;
                        }
                    }
                    packageInfo2.activities = new ActivityInfo[i5];
                }
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    if (eVar.f20062c.get(i8).f20053a.enabled || i4 != 0) {
                        packageInfo2.activities[i7] = a(eVar.f20062c.get(i8), i2);
                        i7++;
                    }
                }
            }
        }
        if ((i2 & 2) != 0) {
            int size2 = eVar.f20063d.size();
            if (size2 > 0) {
                int i9 = i2 & 512;
                if (i9 != 0) {
                    packageInfo2.receivers = new ActivityInfo[size2];
                } else {
                    int i10 = 0;
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (eVar.f20063d.get(i11).f20053a.enabled) {
                            i10++;
                        }
                    }
                    packageInfo2.receivers = new ActivityInfo[i10];
                }
                int i12 = 0;
                for (int i13 = 0; i13 < size2; i13++) {
                    if (eVar.f20063d.get(i13).f20053a.enabled || i9 != 0) {
                        packageInfo2.receivers[i12] = a(eVar.f20063d.get(i13), i2);
                        i12++;
                    }
                }
            }
        }
        if ((i2 & 4) != 0) {
            int size3 = eVar.f20065f.size();
            if (size3 > 0) {
                int i14 = i2 & 512;
                if (i14 != 0) {
                    packageInfo2.services = new ServiceInfo[size3];
                } else {
                    int i15 = 0;
                    for (int i16 = 0; i16 < size3; i16++) {
                        if (eVar.f20065f.get(i16).f20075a.enabled) {
                            i15++;
                        }
                    }
                    packageInfo2.services = new ServiceInfo[i15];
                }
                int i17 = 0;
                for (int i18 = 0; i18 < size3; i18++) {
                    if (eVar.f20065f.get(i18).f20075a.enabled || i14 != 0) {
                        packageInfo2.services[i17] = a(eVar.f20065f.get(i18), i2);
                        i17++;
                    }
                }
            }
        }
        if ((i2 & 8) != 0) {
            int size4 = eVar.f20064e.size();
            if (size4 > 0) {
                int i19 = i2 & 512;
                if (i19 != 0) {
                    packageInfo2.providers = new ProviderInfo[size4];
                } else {
                    int i20 = 0;
                    for (int i21 = 0; i21 < size4; i21++) {
                        if (eVar.f20064e.get(i21).f20073a.enabled) {
                            i20++;
                        }
                    }
                    packageInfo2.providers = new ProviderInfo[i20];
                }
                int i22 = 0;
                for (int i23 = 0; i23 < size4; i23++) {
                    if (eVar.f20064e.get(i23).f20073a.enabled || i19 != 0) {
                        packageInfo2.providers[i22] = a(eVar.f20064e.get(i23), i2);
                        i22++;
                    }
                }
            }
        }
        if ((i2 & 4096) != 0) {
            int size5 = eVar.f20061b.size();
            if (size5 > 0) {
                packageInfo2.permissions = new PermissionInfo[size5];
                for (int i24 = 0; i24 < size5; i24++) {
                    PermissionInfo[] permissionInfoArr = packageInfo2.permissions;
                    h hVar = eVar.f20061b.get(i24);
                    if (hVar == null) {
                        permissionInfo = null;
                    } else if ((i2 & SearchJediMixFeedAdapter.f42517f) == 0) {
                        permissionInfo = hVar.f20072a;
                    } else {
                        PermissionInfo permissionInfo2 = new PermissionInfo(hVar.f20072a);
                        permissionInfo2.metaData = hVar.f20058e;
                        permissionInfo = permissionInfo2;
                    }
                    permissionInfoArr[i24] = permissionInfo;
                }
            }
            int size6 = eVar.g.size();
            if (size6 > 0) {
                packageInfo2.requestedPermissions = new String[size6];
            }
        }
        if (!((i2 & 256) == 0 && (i2 & 64) == 0)) {
            try {
                packageInfo = com.bytedance.frameworks.plugin.e.a().getPackageManager().getPackageInfo(com.bytedance.frameworks.plugin.e.a().getPackageName(), i2);
            } catch (Exception unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                packageInfo2.gids = packageInfo.gids;
                if ((i2 & 64) != 0 && packageInfo2.signatures == null) {
                    if (packageInfo.signatures != null) {
                        i3 = packageInfo.signatures.length;
                    } else {
                        i3 = 0;
                    }
                    if (i3 > 0) {
                        packageInfo2.signatures = new Signature[i3];
                        System.arraycopy(packageInfo.signatures, 0, packageInfo2.signatures, 0, i3);
                    }
                }
            }
        }
        return packageInfo2;
    }

    public static String a(TypedArray typedArray, int i2, int i3) {
        if (typedArray == null) {
            return null;
        }
        Class<TypedArray> cls = TypedArray.class;
        try {
            Method a2 = com.bytedance.frameworks.plugin.e.b.a((Class) cls, "getNonConfigurationString", Integer.TYPE, Integer.TYPE);
            if (a2 != null) {
                return (String) a2.invoke(typedArray, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
            }
        } catch (Exception unused) {
        }
        return typedArray.getString(i2);
    }

    private static Bundle a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Bundle bundle, String[] strArr) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, (int[]) a("com.android.internal.R$styleable", "AndroidManifestMetaData"));
        if (bundle == null) {
            bundle = new Bundle();
        }
        boolean z = false;
        String a2 = a(obtainAttributes, ((Integer) b("com.android.internal.R$styleable", "AndroidManifestMetaData_name")).intValue(), 0);
        String str = null;
        if (a2 == null) {
            strArr[0] = "<meta-data> requires an android:name attribute";
            obtainAttributes.recycle();
            return null;
        }
        String intern = a2.intern();
        TypedValue peekValue = obtainAttributes.peekValue(((Integer) b("com.android.internal.R$styleable", "AndroidManifestMetaData_resource")).intValue());
        if (peekValue == null || peekValue.resourceId == 0) {
            TypedValue peekValue2 = obtainAttributes.peekValue(((Integer) b("com.android.internal.R$styleable", "AndroidManifestMetaData_value")).intValue());
            if (peekValue2 == null) {
                strArr[0] = "<meta-data> requires an android:value or android:resource attribute";
                bundle = null;
            } else if (peekValue2.type == 3) {
                CharSequence coerceToString = peekValue2.coerceToString();
                if (coerceToString != null) {
                    str = coerceToString.toString().intern();
                }
                bundle.putString(intern, str);
            } else if (peekValue2.type == 18) {
                if (peekValue2.data != 0) {
                    z = true;
                }
                bundle.putBoolean(intern, z);
            } else if (peekValue2.type >= 16 && peekValue2.type <= 31) {
                bundle.putInt(intern, peekValue2.data);
            } else if (peekValue2.type == 4) {
                bundle.putFloat(intern, peekValue2.getFloat());
            }
        } else {
            bundle.putInt(intern, peekValue.resourceId);
        }
        obtainAttributes.recycle();
        n.a(xmlPullParser);
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0323  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.frameworks.plugin.pm.d.a a(com.bytedance.frameworks.plugin.pm.d.e r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, int r23, java.lang.String[] r24, boolean r25, boolean r26) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r11 = r19
            r12 = r20
            r13 = r22
            r14 = r24
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity"
            java.lang.Object r1 = a((java.lang.String) r1, (java.lang.String) r2)
            int[] r1 = (int[]) r1
            android.content.res.TypedArray r10 = r12.obtainAttributes(r13, r1)
            com.bytedance.frameworks.plugin.pm.d$f r1 = r0.f20052f
            if (r1 != 0) goto L_0x0090
            com.bytedance.frameworks.plugin.pm.d$f r9 = new com.bytedance.frameworks.plugin.pm.d$f
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity_name"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity_label"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r5 = r1.intValue()
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity_icon"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r6 = r1.intValue()
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity_logo"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r7 = r1.intValue()
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity_process"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r8 = r1.intValue()
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity_description"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r15 = r1.intValue()
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity_enabled"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r16 = r1.intValue()
            r1 = r9
            r2 = r19
            r3 = r24
            r12 = r9
            r9 = r15
            r13 = r10
            r10 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.f20052f = r12
            goto L_0x0091
        L_0x0090:
            r13 = r10
        L_0x0091:
            com.bytedance.frameworks.plugin.pm.d$f r1 = r0.f20052f
            if (r25 == 0) goto L_0x0098
            java.lang.String r2 = "<receiver>"
            goto L_0x009a
        L_0x0098:
            java.lang.String r2 = "<activity>"
        L_0x009a:
            r1.k = r2
            com.bytedance.frameworks.plugin.pm.d$f r1 = r0.f20052f
            r1.l = r13
            com.bytedance.frameworks.plugin.pm.d$f r1 = r0.f20052f
            r2 = r23
            r1.f20069d = r2
            com.bytedance.frameworks.plugin.pm.d$a r7 = new com.bytedance.frameworks.plugin.pm.d$a
            com.bytedance.frameworks.plugin.pm.d$f r1 = r0.f20052f
            android.content.pm.ActivityInfo r2 = new android.content.pm.ActivityInfo
            r2.<init>()
            r7.<init>(r1, r2)
            r8 = 0
            r1 = r14[r8]
            r9 = 0
            if (r1 == 0) goto L_0x00bc
            r13.recycle()
            return r9
        L_0x00bc:
            java.lang.String r1 = "com.android.internal.R$styleable"
            java.lang.String r2 = "AndroidManifestActivity_exported"
            java.lang.Object r1 = b((java.lang.String) r1, (java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r1 = r13.hasValue(r1)
            if (r1 == 0) goto L_0x00e6
            android.content.pm.ActivityInfo r2 = r7.f20053a
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestActivity_exported"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r3 = r13.getBoolean(r3, r8)
            r2.exported = r3
        L_0x00e6:
            android.content.pm.ActivityInfo r2 = r7.f20053a
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestActivity_theme"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r13.getResourceId(r3, r8)
            r2.theme = r3
            android.content.pm.ActivityInfo r2 = r7.f20053a
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestActivity_uiOptions"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            android.content.pm.ActivityInfo r4 = r7.f20053a
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo
            int r4 = r4.uiOptions
            int r3 = r13.getInt(r3, r4)
            r2.uiOptions = r3
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestActivity_permission"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r2 = a((android.content.res.TypedArray) r13, (int) r2, (int) r8)
            if (r2 != 0) goto L_0x0138
            android.content.pm.ActivityInfo r2 = r7.f20053a
            android.content.pm.ApplicationInfo r3 = r11.f20060a
            java.lang.String r3 = r3.permission
            r17 = r3
            r3 = r2
            r2 = r17
            goto L_0x014a
        L_0x0138:
            android.content.pm.ActivityInfo r3 = r7.f20053a
            int r4 = r2.length()
            if (r4 <= 0) goto L_0x0149
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.intern()
            goto L_0x014a
        L_0x0149:
            r2 = r9
        L_0x014a:
            r3.permission = r2
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestActivity_taskAffinity"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1024(0x400, float:1.435E-42)
            java.lang.String r2 = a((android.content.res.TypedArray) r13, (int) r2, (int) r3)
            android.content.pm.ActivityInfo r3 = r7.f20053a
            android.content.pm.ApplicationInfo r4 = r11.f20060a
            java.lang.String r4 = r4.packageName
            android.content.pm.ApplicationInfo r5 = r11.f20060a
            java.lang.String r5 = r5.taskAffinity
            java.lang.String r2 = a((java.lang.String) r4, (java.lang.String) r5, (java.lang.CharSequence) r2, (java.lang.String[]) r14)
            r3.taskAffinity = r2
            android.content.pm.ActivityInfo r2 = r7.f20053a
            r2.flags = r8
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestActivity_noHistory"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r2 = r13.getBoolean(r2, r8)
            if (r2 == 0) goto L_0x0190
            android.content.pm.ActivityInfo r2 = r7.f20053a
            int r3 = r2.flags
            r3 = r3 | 128(0x80, float:1.794E-43)
            r2.flags = r3
        L_0x0190:
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestActivity_excludeFromRecents"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r2 = r13.getBoolean(r2, r8)
            if (r2 == 0) goto L_0x01ac
            android.content.pm.ActivityInfo r2 = r7.f20053a
            int r3 = r2.flags
            r3 = r3 | 32
            r2.flags = r3
        L_0x01ac:
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestActivity_allowTaskReparenting"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.content.pm.ApplicationInfo r3 = r11.f20060a
            int r3 = r3.flags
            r3 = r3 & 32
            r10 = 1
            if (r3 == 0) goto L_0x01c5
            r3 = 1
            goto L_0x01c6
        L_0x01c5:
            r3 = 0
        L_0x01c6:
            boolean r2 = r13.getBoolean(r2, r3)
            if (r2 == 0) goto L_0x01d4
            android.content.pm.ActivityInfo r2 = r7.f20053a
            int r3 = r2.flags
            r3 = r3 | 64
            r2.flags = r3
        L_0x01d4:
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestActivity_immersive"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r2 = r13.getBoolean(r2, r8)
            if (r2 == 0) goto L_0x01f0
            android.content.pm.ActivityInfo r2 = r7.f20053a
            int r3 = r2.flags
            r3 = r3 | 2048(0x800, float:2.87E-42)
            r2.flags = r3
        L_0x01f0:
            if (r25 != 0) goto L_0x026a
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestActivity_hardwareAccelerated"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r26
            boolean r2 = r13.getBoolean(r2, r3)
            if (r2 == 0) goto L_0x0210
            android.content.pm.ActivityInfo r2 = r7.f20053a
            int r3 = r2.flags
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2.flags = r3
        L_0x0210:
            android.content.pm.ActivityInfo r2 = r7.f20053a
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestActivity_launchMode"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r13.getInt(r3, r8)
            r2.launchMode = r3
            android.content.pm.ActivityInfo r2 = r7.f20053a
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestActivity_screenOrientation"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = -1
            int r3 = r13.getInt(r3, r4)
            r2.screenOrientation = r3
            android.content.pm.ActivityInfo r2 = r7.f20053a
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestActivity_configChanges"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r13.getInt(r3, r8)
            r2.configChanges = r3
            android.content.pm.ActivityInfo r2 = r7.f20053a
            java.lang.String r3 = "com.android.internal.R$styleable"
            java.lang.String r4 = "AndroidManifestActivity_windowSoftInputMode"
            java.lang.Object r3 = b((java.lang.String) r3, (java.lang.String) r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r13.getInt(r3, r8)
            r2.softInputMode = r3
            goto L_0x0272
        L_0x026a:
            android.content.pm.ActivityInfo r2 = r7.f20053a
            r2.launchMode = r8
            android.content.pm.ActivityInfo r2 = r7.f20053a
            r2.configChanges = r8
        L_0x0272:
            if (r25 == 0) goto L_0x029d
            java.lang.String r2 = "com.android.internal.R$styleable"
            java.lang.String r3 = "AndroidManifestActivity_singleUser"
            java.lang.Object r2 = b((java.lang.String) r2, (java.lang.String) r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r2 = r13.getBoolean(r2, r8)
            if (r2 == 0) goto L_0x029d
            android.content.pm.ActivityInfo r1 = r7.f20053a
            int r2 = r1.flags
            r3 = 1073741824(0x40000000, float:2.0)
            r2 = r2 | r3
            r1.flags = r2
            android.content.pm.ActivityInfo r1 = r7.f20053a
            boolean r1 = r1.exported
            if (r1 == 0) goto L_0x029b
            android.content.pm.ActivityInfo r1 = r7.f20053a
            r1.exported = r8
        L_0x029b:
            r11 = 1
            goto L_0x029e
        L_0x029d:
            r11 = r1
        L_0x029e:
            r13.recycle()
            r1 = r14[r8]
            if (r1 == 0) goto L_0x02a6
            return r9
        L_0x02a6:
            int r12 = r21.getDepth()
        L_0x02aa:
            int r1 = r21.next()
            if (r1 == r10) goto L_0x0321
            r2 = 3
            if (r1 != r2) goto L_0x02b9
            int r3 = r21.getDepth()
            if (r3 <= r12) goto L_0x0321
        L_0x02b9:
            if (r1 == r2) goto L_0x031a
            r2 = 4
            if (r1 == r2) goto L_0x031a
            java.lang.String r1 = r21.getName()
            java.lang.String r2 = "intent-filter"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02ec
            com.bytedance.frameworks.plugin.pm.d$b r13 = new com.bytedance.frameworks.plugin.pm.d$b
            r13.<init>(r7)
            r4 = 1
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r13
            r6 = r24
            boolean r1 = a((android.content.res.Resources) r1, (org.xmlpull.v1.XmlPullParser) r2, (android.util.AttributeSet) r3, (boolean) r4, (com.bytedance.frameworks.plugin.pm.d.C0173d) r5, (java.lang.String[]) r6)
            if (r1 != 0) goto L_0x02e0
            return r9
        L_0x02e0:
            int r1 = r13.countActions()
            if (r1 == 0) goto L_0x02aa
            java.util.ArrayList r1 = r7.f20056c
            r1.add(r13)
            goto L_0x02aa
        L_0x02ec:
            java.lang.String r1 = r21.getName()
            java.lang.String r2 = "meta-data"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0310
            android.os.Bundle r1 = r7.f20058e
            r3 = r21
            r2 = r20
            r4 = r22
            android.os.Bundle r1 = a((android.content.res.Resources) r2, (org.xmlpull.v1.XmlPullParser) r3, (android.util.AttributeSet) r4, (android.os.Bundle) r1, (java.lang.String[]) r14)
            r7.f20058e = r1
            if (r1 != 0) goto L_0x0309
            return r9
        L_0x0309:
            android.content.pm.ActivityInfo r1 = r7.f20053a
            android.os.Bundle r5 = r7.f20058e
            r1.metaData = r5
            goto L_0x02aa
        L_0x0310:
            r3 = r21
            r2 = r20
            r4 = r22
            com.bytedance.frameworks.plugin.f.n.a(r21)
            goto L_0x02aa
        L_0x031a:
            r3 = r21
            r2 = r20
            r4 = r22
            goto L_0x02aa
        L_0x0321:
            if (r11 != 0) goto L_0x0330
            android.content.pm.ActivityInfo r1 = r7.f20053a
            java.util.ArrayList r2 = r7.f20056c
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x032e
            r8 = 1
        L_0x032e:
            r1.exported = r8
        L_0x0330:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.pm.d.a(com.bytedance.frameworks.plugin.pm.d$e, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, int, java.lang.String[], boolean, boolean):com.bytedance.frameworks.plugin.pm.d$a");
    }
}
