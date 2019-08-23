package com.bytedance.frameworks.plugin.core.res;

import android.annotation.TargetApi;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.bytedance.frameworks.plugin.core.h;
import com.bytedance.frameworks.plugin.f.l;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public class MiraResourcesWrapper extends Resources {
    protected final Resources mResources;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Resources f2210a;

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            if (r0 != com.bytedance.frameworks.plugin.core.h.b().getAssets()) goto L_0x0017;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.res.Resources a(android.content.res.Resources r5) {
            /*
                android.content.res.Resources r0 = f2210a
                if (r0 == 0) goto L_0x0017
                android.content.res.Resources r0 = f2210a
                android.content.res.AssetManager r0 = r0.getAssets()
                com.bytedance.frameworks.plugin.core.h.a()
                android.content.res.Resources r1 = com.bytedance.frameworks.plugin.core.h.b()
                android.content.res.AssetManager r1 = r1.getAssets()
                if (r0 == r1) goto L_0x0055
            L_0x0017:
                com.bytedance.frameworks.plugin.core.h.a()     // Catch:{ Exception -> 0x0058 }
                android.content.res.Resources r0 = com.bytedance.frameworks.plugin.core.h.b()     // Catch:{ Exception -> 0x0058 }
                boolean r1 = r0 instanceof com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper     // Catch:{ Exception -> 0x0058 }
                if (r1 == 0) goto L_0x0028
                com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper r0 = (com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper) r0     // Catch:{ Exception -> 0x0058 }
                android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x0058 }
            L_0x0028:
                java.lang.String r1 = "mContextRef"
                java.lang.Object r1 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r5, (java.lang.String) r1)     // Catch:{ Exception -> 0x0058 }
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch:{ Exception -> 0x0058 }
                java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0058 }
                android.content.Context r1 = (android.content.Context) r1     // Catch:{ Exception -> 0x0058 }
                java.lang.Class r5 = r5.getClass()     // Catch:{ Exception -> 0x0058 }
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0058 }
                r4 = 0
                r3[r4] = r1     // Catch:{ Exception -> 0x0058 }
                r1 = 1
                r3[r1] = r0     // Catch:{ Exception -> 0x0058 }
                java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0058 }
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r0[r4] = r2     // Catch:{ Exception -> 0x0058 }
                java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
                r0[r1] = r2     // Catch:{ Exception -> 0x0058 }
                java.lang.Object r5 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class<T>) r5, (java.lang.Object[]) r3, (java.lang.Class<?>[]) r0)     // Catch:{ Exception -> 0x0058 }
                android.content.res.Resources r5 = (android.content.res.Resources) r5     // Catch:{ Exception -> 0x0058 }
                f2210a = r5     // Catch:{ Exception -> 0x0058 }
            L_0x0055:
                android.content.res.Resources r5 = f2210a
                return r5
            L_0x0058:
                r5 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "TintResourcesCompat#Construct TintResources failed."
                r0.<init>(r1, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.a.a(android.content.res.Resources):android.content.res.Resources");
        }

        public static Drawable a(Resources resources, int i) {
            try {
                return com.ss.android.ugc.bytex.a.a.a.a(a(resources), i);
            } catch (RuntimeException e2) {
                if ((e2.toString().contains("android.content.res.Resources") || e2.toString().contains("Error inflating class") || e2.toString().contains("java.lang.ArrayIndexOutOfBoundsException")) && !e2.toString().contains("OutOfMemoryError")) {
                    String str = "BackupTintResources#Assets: ";
                    if (f2210a != null) {
                        str = str + l.c(f2210a.getAssets());
                    }
                    if (e2 instanceof Resources.NotFoundException) {
                        throw new Resources.NotFoundException(str + "," + e2.getMessage());
                    }
                    throw new RuntimeException(str, e2);
                }
                throw e2;
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Resources f2211a;

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            if (r0 != com.bytedance.frameworks.plugin.core.h.b().getAssets()) goto L_0x0017;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.res.Resources a(android.content.res.Resources r5) {
            /*
                android.content.res.Resources r0 = f2211a
                if (r0 == 0) goto L_0x0017
                android.content.res.Resources r0 = f2211a
                android.content.res.AssetManager r0 = r0.getAssets()
                com.bytedance.frameworks.plugin.core.h.a()
                android.content.res.Resources r1 = com.bytedance.frameworks.plugin.core.h.b()
                android.content.res.AssetManager r1 = r1.getAssets()
                if (r0 == r1) goto L_0x004b
            L_0x0017:
                java.lang.String r0 = "mContextRef"
                java.lang.Object r0 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r5, (java.lang.String) r0)     // Catch:{ Exception -> 0x004e }
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ Exception -> 0x004e }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x004e }
                android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ Exception -> 0x004e }
                r1 = 2
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004e }
                r3 = 0
                r2[r3] = r0     // Catch:{ Exception -> 0x004e }
                com.bytedance.frameworks.plugin.core.h.a()     // Catch:{ Exception -> 0x004e }
                android.content.res.Resources r0 = com.bytedance.frameworks.plugin.core.h.b()     // Catch:{ Exception -> 0x004e }
                r4 = 1
                r2[r4] = r0     // Catch:{ Exception -> 0x004e }
                java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x004e }
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                r0[r3] = r1     // Catch:{ Exception -> 0x004e }
                java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
                r0[r4] = r1     // Catch:{ Exception -> 0x004e }
                java.lang.Object r5 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class<T>) r5, (java.lang.Object[]) r2, (java.lang.Class<?>[]) r0)     // Catch:{ Exception -> 0x004e }
                android.content.res.Resources r5 = (android.content.res.Resources) r5     // Catch:{ Exception -> 0x004e }
                f2211a = r5     // Catch:{ Exception -> 0x004e }
            L_0x004b:
                android.content.res.Resources r5 = f2211a
                return r5
            L_0x004e:
                r5 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "VectorTintResourcesCompat#Construct VectorEnabledTintResources failed."
                r0.<init>(r1, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.b.a(android.content.res.Resources):android.content.res.Resources");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|4|5|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
            r4 = "BackupVectorResources#Assets: ";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
            if (f2211a != null) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
            r4 = r4 + com.bytedance.frameworks.plugin.f.l.c(f2211a.getAssets());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
            if ((r3 instanceof android.content.res.Resources.NotFoundException) != false) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
            throw new android.content.res.Resources.NotFoundException(r4 + "," + r3.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
            throw new java.lang.RuntimeException(r4, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
            throw r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
            if (r3.toString().contains("android.content.res.Resources") != false) goto L_0x0044;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0017 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.drawable.Drawable a(android.content.res.Resources r3, int r4) {
            /*
                java.lang.String r0 = "android.support.v7.widget.AppCompatDrawableManager"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0017 }
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                com.bytedance.frameworks.plugin.e.a.a((java.lang.Class<?>) r0, (java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ Exception -> 0x0017 }
                java.lang.String r1 = "get"
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0017 }
                com.bytedance.frameworks.plugin.e.b.a((java.lang.Class) r0, (java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ Exception -> 0x0017 }
                goto L_0x0017
            L_0x0015:
                r3 = move-exception
                goto L_0x0020
            L_0x0017:
                android.content.res.Resources r3 = a(r3)     // Catch:{ RuntimeException -> 0x0015 }
                android.graphics.drawable.Drawable r3 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r3, (int) r4)     // Catch:{ RuntimeException -> 0x0015 }
                return r3
            L_0x0020:
                java.lang.String r4 = r3.toString()
                java.lang.String r0 = "android.content.res.Resources"
                boolean r4 = r4.contains(r0)
                if (r4 != 0) goto L_0x0044
                java.lang.String r4 = r3.toString()
                java.lang.String r0 = "Error inflating class"
                boolean r4 = r4.contains(r0)
                if (r4 != 0) goto L_0x0044
                java.lang.String r4 = r3.toString()
                java.lang.String r0 = "java.lang.ArrayIndexOutOfBoundsException"
                boolean r4 = r4.contains(r0)
                if (r4 == 0) goto L_0x0097
            L_0x0044:
                java.lang.String r4 = r3.toString()
                java.lang.String r0 = "OutOfMemoryError"
                boolean r4 = r4.contains(r0)
                if (r4 != 0) goto L_0x0097
                java.lang.String r4 = "BackupVectorResources#Assets: "
                android.content.res.Resources r0 = f2211a
                if (r0 == 0) goto L_0x006f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                android.content.res.Resources r4 = f2211a
                android.content.res.AssetManager r4 = r4.getAssets()
                java.lang.String r4 = com.bytedance.frameworks.plugin.f.l.c(r4)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
            L_0x006f:
                boolean r0 = r3 instanceof android.content.res.Resources.NotFoundException
                if (r0 == 0) goto L_0x0091
                android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                java.lang.String r4 = ","
                r1.append(r4)
                java.lang.String r3 = r3.getMessage()
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L_0x0091:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r0.<init>(r4, r3)
                throw r0
            L_0x0097:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.b.a(android.content.res.Resources, int):android.graphics.drawable.Drawable");
        }
    }

    private int getHtcBugCompatId(int i) {
        if (i == 67764272) {
            return 25;
        }
        if (i == 67764273) {
            return 3;
        }
        if (i == 67764274) {
            return 25;
        }
        return i == 67764275 ? 10 : 0;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    private Resources getGlobalRealResources() {
        h.a();
        Resources b2 = h.b();
        if (b2 instanceof MiraResourcesWrapper) {
            return ((MiraResourcesWrapper) b2).getResources();
        }
        return b2;
    }

    public String getResourceEntryName(int i) throws Resources.NotFoundException {
        return this.mResources.getResourceEntryName(i);
    }

    public String getResourceName(int i) throws Resources.NotFoundException {
        return this.mResources.getResourceName(i);
    }

    public String getResourcePackageName(int i) throws Resources.NotFoundException {
        return this.mResources.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) throws Resources.NotFoundException {
        return this.mResources.getResourceTypeName(i);
    }

    public TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        try {
            return this.mResources.obtainTypedArray(i);
        } catch (Resources.NotFoundException e2) {
            handleException(e2);
            return null;
        }
    }

    public MiraResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    private boolean isLetvBugCompat(int i) {
        if (i == 0 && "letv".equals(Build.BRAND.toLowerCase()) && (Build.VERSION.SDK_INT == 21 || Build.VERSION.SDK_INT == 22)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getAnimation(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.XmlResourceParser getAnimation(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            android.content.res.XmlResourceParser r0 = r0.getAnimation(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            android.content.res.XmlResourceParser r2 = r0.getAnimation(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getAnimation(int):android.content.res.XmlResourceParser");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getBoolean(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getBoolean(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            boolean r0 = r0.getBoolean(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            boolean r2 = r0.getBoolean(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getBoolean(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getColor(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getColor(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            int r0 = r0.getColor(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            int r2 = r0.getColor(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getColor(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getColorStateList(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList getColorStateList(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            android.content.res.ColorStateList r0 = r0.getColorStateList(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            android.content.res.ColorStateList r2 = r0.getColorStateList(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getColorStateList(int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getIntArray(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int[] getIntArray(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            int[] r0 = r0.getIntArray(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            int[] r2 = r0.getIntArray(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getIntArray(int):int[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getInteger(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getInteger(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            int r0 = r0.getInteger(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            int r2 = r0.getInteger(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getInteger(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getLayout(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.XmlResourceParser getLayout(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            android.content.res.XmlResourceParser r0 = r0.getLayout(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            android.content.res.XmlResourceParser r2 = r0.getLayout(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getLayout(int):android.content.res.XmlResourceParser");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getMovie(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Movie getMovie(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            android.graphics.Movie r0 = r0.getMovie(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            android.graphics.Movie r2 = r0.getMovie(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getMovie(int):android.graphics.Movie");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.String r2 = r0.getString(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getString(int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getStringArray(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] getStringArray(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.String[] r0 = r0.getStringArray(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.String[] r2 = r0.getStringArray(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getStringArray(int):java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getText(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getText(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.CharSequence r0 = r0.getText(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.CharSequence r2 = r0.getText(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getText(int):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getTextArray(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence[] getTextArray(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.CharSequence[] r0 = r0.getTextArray(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.CharSequence[] r2 = r0.getTextArray(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getTextArray(int):java.lang.CharSequence[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getXml(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.XmlResourceParser getXml(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            android.content.res.XmlResourceParser r0 = r0.getXml(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            android.content.res.XmlResourceParser r2 = r0.getXml(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getXml(int):android.content.res.XmlResourceParser");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().openRawResource(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream openRawResource(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.io.InputStream r0 = r0.openRawResource(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.io.InputStream r2 = r0.openRawResource(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.openRawResource(int):java.io.InputStream");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().openRawResourceFd(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.AssetFileDescriptor openRawResourceFd(int r2) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            android.content.res.AssetFileDescriptor r0 = r0.openRawResourceFd(r2)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            android.content.res.AssetFileDescriptor r2 = r0.openRawResourceFd(r2)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.openRawResourceFd(int):android.content.res.AssetFileDescriptor");
    }

    private boolean isHtcBugCompat(int i) {
        if (Build.VERSION.SDK_INT == 16 && "htc".equals(Build.BRAND.toLowerCase()) && (i == 67764272 || i == 67764273 || i == 67764274 || i == 67764275)) {
            return true;
        }
        return false;
    }

    public float getDimension(int i) throws Resources.NotFoundException {
        try {
            return this.mResources.getDimension(i);
        } catch (Resources.NotFoundException unused) {
            if (isHtcBugCompat(i)) {
                return (float) getHtcBugCompatId(i);
            }
            try {
                return getGlobalRealResources().getDimension(i);
            } catch (Resources.NotFoundException e2) {
                handleException(e2);
                return 0.0f;
            }
        }
    }

    public int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        try {
            return this.mResources.getDimensionPixelOffset(i);
        } catch (Resources.NotFoundException unused) {
            if (isHtcBugCompat(i)) {
                return getHtcBugCompatId(i);
            }
            try {
                return getGlobalRealResources().getDimensionPixelOffset(i);
            } catch (Resources.NotFoundException e2) {
                handleException(e2);
                return 0;
            }
        }
    }

    public int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        try {
            return this.mResources.getDimensionPixelSize(i);
        } catch (Resources.NotFoundException unused) {
            if (isHtcBugCompat(i)) {
                return getHtcBugCompatId(i);
            }
            try {
                return getGlobalRealResources().getDimensionPixelSize(i);
            } catch (Resources.NotFoundException e2) {
                handleException(e2);
                return 0;
            }
        }
    }

    @TargetApi(15)
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        try {
            return com.ss.android.ugc.bytex.a.a.a.a(this.mResources, i);
        } catch (Resources.NotFoundException unused) {
            if (isLetvBugCompat(i)) {
                return null;
            }
            if ("android.support.v7.widget.VectorEnabledTintResources".equals(this.mResources.getClass().getName())) {
                return b.a(this.mResources, i);
            }
            if ("android.support.v7.widget.TintResources".equals(this.mResources.getClass().getName())) {
                return a.a(this.mResources, i);
            }
            try {
                return com.ss.android.ugc.bytex.a.a.a.a(getGlobalRealResources(), i);
            } catch (Resources.NotFoundException e2) {
                handleException(e2);
                return null;
            }
        }
    }

    private void handleException(Resources.NotFoundException notFoundException) {
        if ((notFoundException.toString().contains("android.content.res.Resources") || notFoundException.toString().contains("Error inflating class") || notFoundException.toString().contains("java.lang.ArrayIndexOutOfBoundsException")) && !notFoundException.toString().contains("OutOfMemoryError")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resources#Assets: " + l.c(this.mResources.getAssets()));
            sb.append("  ResMrg#Res#Assets: ");
            h.a();
            sb.append(l.c(h.b().getAssets()));
            String sb2 = sb.toString();
            String str = sb2 + "  AssetPathCache#Assets: " + h.a().c();
            throw new Resources.NotFoundException(str + "," + notFoundException.getMessage());
        }
        throw notFoundException;
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        try {
            return this.mResources.obtainAttributes(attributeSet, iArr);
        } catch (Resources.NotFoundException e2) {
            handleException(e2);
            return null;
        }
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @TargetApi(21)
    public Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        try {
            return this.mResources.getDrawable(i, theme);
        } catch (Resources.NotFoundException unused) {
            if (isLetvBugCompat(i)) {
                return null;
            }
            try {
                return getGlobalRealResources().getDrawable(i, theme);
            } catch (Resources.NotFoundException e2) {
                handleException(e2);
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getDrawableForDensity(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    @android.annotation.TargetApi(15)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getDrawableForDensity(int r2, int r3) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r2, r3)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            android.graphics.drawable.Drawable r2 = r0.getDrawableForDensity(r2, r3)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getDrawableForDensity(int, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getQuantityString(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getQuantityString(int r2, int r3) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.String r0 = r0.getQuantityString(r2, r3)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.String r2 = r0.getQuantityString(r2, r3)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getQuantityString(int, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getQuantityText(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getQuantityText(int r2, int r3) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.CharSequence r0 = r0.getQuantityText(r2, r3)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.CharSequence r2 = r0.getQuantityText(r2, r3)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getQuantityText(int, int):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getString(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(int r2, java.lang.Object... r3) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.String r0 = r0.getString(r2, r3)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.String r2 = r0.getString(r2, r3)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getString(int, java.lang.Object[]):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getText(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getText(int r2, java.lang.CharSequence r3) {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.CharSequence r0 = r0.getText(r2, r3)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.CharSequence r2 = r0.getText(r2, r3)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getText(int, java.lang.CharSequence):java.lang.CharSequence");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().openRawResource(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.InputStream openRawResource(int r2, android.util.TypedValue r3) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.io.InputStream r0 = r0.openRawResource(r2, r3)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.io.InputStream r2 = r0.openRawResource(r2, r3)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.openRawResource(int, android.util.TypedValue):java.io.InputStream");
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }

    public float getFraction(int i, int i2, int i3) {
        try {
            return this.mResources.getFraction(i, i2, i3);
        } catch (Resources.NotFoundException e2) {
            handleException(e2);
            return 0.0f;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        getGlobalRealResources().getValue(r2, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getValue(int r2, android.util.TypedValue r3, boolean r4) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0006 }
            r0.getValue(r2, r3, r4)     // Catch:{ NotFoundException -> 0x0006 }
            return
        L_0x0006:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x000e }
            r0.getValue(r2, r3, r4)     // Catch:{ NotFoundException -> 0x000e }
            return
        L_0x000e:
            r2 = move-exception
            r1.handleException(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getValue(int, android.util.TypedValue, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getDrawableForDensity(r2, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getDrawableForDensity(int r2, int r3, android.content.res.Resources.Theme r4) {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            android.graphics.drawable.Drawable r0 = r0.getDrawableForDensity(r2, r3, r4)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            android.graphics.drawable.Drawable r2 = r0.getDrawableForDensity(r2, r3, r4)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getDrawableForDensity(int, int, android.content.res.Resources$Theme):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return getGlobalRealResources().getQuantityString(r2, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getQuantityString(int r2, int r3, java.lang.Object... r4) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0007 }
            java.lang.String r0 = r0.getQuantityString(r2, r3, r4)     // Catch:{ NotFoundException -> 0x0007 }
            return r0
        L_0x0007:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x0010 }
            java.lang.String r2 = r0.getQuantityString(r2, r3, r4)     // Catch:{ NotFoundException -> 0x0010 }
            return r2
        L_0x0010:
            r2 = move-exception
            r1.handleException(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getQuantityString(int, int, java.lang.Object[]):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        getGlobalRealResources().getValue(r2, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getValue(java.lang.String r2, android.util.TypedValue r3, boolean r4) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0006 }
            r0.getValue(r2, r3, r4)     // Catch:{ NotFoundException -> 0x0006 }
            return
        L_0x0006:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x000e }
            r0.getValue(r2, r3, r4)     // Catch:{ NotFoundException -> 0x000e }
            return
        L_0x000e:
            r2 = move-exception
            r1.handleException(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getValue(java.lang.String, android.util.TypedValue, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        getGlobalRealResources().getValueForDensity(r2, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        handleException(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    @android.annotation.TargetApi(15)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getValueForDensity(int r2, int r3, android.util.TypedValue r4, boolean r5) throws android.content.res.Resources.NotFoundException {
        /*
            r1 = this;
            android.content.res.Resources r0 = r1.mResources     // Catch:{ NotFoundException -> 0x0006 }
            r0.getValueForDensity(r2, r3, r4, r5)     // Catch:{ NotFoundException -> 0x0006 }
            return
        L_0x0006:
            android.content.res.Resources r0 = r1.getGlobalRealResources()     // Catch:{ NotFoundException -> 0x000e }
            r0.getValueForDensity(r2, r3, r4, r5)     // Catch:{ NotFoundException -> 0x000e }
            return
        L_0x000e:
            r2 = move-exception
            r1.handleException(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper.getValueForDensity(int, int, android.util.TypedValue, boolean):void");
    }
}
