package com.sina.weibo.sdk.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.InputStream;
import java.util.Locale;

public class ResourceManager {
    private static final String[] PRE_INSTALL_DRAWBLE_PATHS = {"drawable-xxhdpi", "drawable-xhdpi", "drawable-hdpi", "drawable-mdpi", "drawable-ldpi", "drawable"};
    private static final String TAG = "com.sina.weibo.sdk.utils.ResourceManager";

    public static Locale getLanguage() {
        Locale locale = Locale.getDefault();
        if (Locale.SIMPLIFIED_CHINESE.equals(locale) || Locale.TRADITIONAL_CHINESE.equals(locale)) {
            return locale;
        }
        return Locale.ENGLISH;
    }

    private static String getCurrentDpiFolder(Context context) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        if (i <= 120) {
            return "drawable-ldpi";
        }
        if (i > 120 && i <= 160) {
            return "drawable-mdpi";
        }
        if (i > 160 && i <= 240) {
            return "drawable-hdpi";
        }
        if (i <= 240 || i > 320) {
            return "drawable-xxhdpi";
        }
        return "drawable-xhdpi";
    }

    public static Drawable getDrawable(Context context, String str) {
        return getDrawableFromAssert(context, getAppropriatePathOfDrawable(context, str), false);
    }

    public static Drawable getNinePatchDrawable(Context context, String str) {
        return getDrawableFromAssert(context, getAppropriatePathOfDrawable(context, str), true);
    }

    public static int dp2px(Context context, int i) {
        double d2 = (double) (((float) i) * context.getResources().getDisplayMetrics().density);
        Double.isNaN(d2);
        return (int) (d2 + 0.5d);
    }

    public static ColorStateList createColorStateList(int i, int i2) {
        int[] iArr = {i2, i2, i2, i};
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842913}, new int[]{16842908}, StateSet.WILD_CARD}, iArr);
    }

    private static Drawable extractDrawable(Context context, String str) throws Exception {
        InputStream open = context.getAssets().open(str);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        typedValue.density = displayMetrics.densityDpi;
        Drawable createFromResourceStream = Drawable.createFromResourceStream(context.getResources(), typedValue, open, str);
        open.close();
        return createFromResourceStream;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053 A[SYNTHETIC, Splitter:B:23:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[SYNTHETIC, Splitter:B:28:0x0059] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isFileExisted(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x005d
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x000a
            goto L_0x005d
        L_0x000a:
            android.content.res.AssetManager r4 = r4.getAssets()
            r1 = 0
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r1 = TAG     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.String r3 = "file ["
            r2.<init>(r3)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r2.append(r5)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.String r3 = "] existed"
            r2.append(r3)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            com.sina.weibo.sdk.utils.LogUtil.d(r1, r2)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            if (r4 == 0) goto L_0x0030
            r4.close()     // Catch:{ IOException -> 0x0030 }
        L_0x0030:
            r4 = 1
            return r4
        L_0x0032:
            r5 = move-exception
            r1 = r4
            goto L_0x0057
        L_0x0035:
            r1 = r4
            goto L_0x0039
        L_0x0037:
            r5 = move-exception
            goto L_0x0057
        L_0x0039:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x0037 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "file ["
            r2.<init>(r3)     // Catch:{ all -> 0x0037 }
            r2.append(r5)     // Catch:{ all -> 0x0037 }
            java.lang.String r5 = "] NOT existed"
            r2.append(r5)     // Catch:{ all -> 0x0037 }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x0037 }
            com.sina.weibo.sdk.utils.LogUtil.d(r4, r5)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r0
        L_0x0057:
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            throw r5
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.utils.ResourceManager.isFileExisted(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (java.lang.Math.abs(r4 - r2) <= java.lang.Math.abs(r4 - r5)) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getAppropriatePathOfDrawable(android.content.Context r8, java.lang.String r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r8 = TAG
            java.lang.String r9 = "id is NOT correct!"
            com.sina.weibo.sdk.utils.LogUtil.e(r8, r9)
            return r1
        L_0x000f:
            java.lang.String r0 = getCurrentDpiFolder(r8)
            java.lang.String r2 = TAG
            java.lang.String r3 = "find Appropriate path..."
            com.sina.weibo.sdk.utils.LogUtil.d(r2, r3)
            r2 = 0
            r3 = -1
            r4 = -1
            r5 = -1
        L_0x001e:
            java.lang.String[] r6 = PRE_INSTALL_DRAWBLE_PATHS
            int r6 = r6.length
            if (r2 < r6) goto L_0x0025
            r2 = -1
            goto L_0x0056
        L_0x0025:
            java.lang.String[] r6 = PRE_INSTALL_DRAWBLE_PATHS
            r6 = r6[r2]
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0030
            r4 = r2
        L_0x0030:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String[] r7 = PRE_INSTALL_DRAWBLE_PATHS
            r7 = r7[r2]
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.<init>(r7)
            java.lang.String r7 = "/"
            r6.append(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            boolean r7 = isFileExisted(r8, r6)
            if (r7 == 0) goto L_0x009f
            if (r4 != r2) goto L_0x0052
            return r6
        L_0x0052:
            if (r4 >= 0) goto L_0x0056
            r5 = r2
            goto L_0x009f
        L_0x0056:
            if (r5 <= 0) goto L_0x0068
            if (r2 <= 0) goto L_0x0068
            int r8 = r4 - r2
            int r8 = java.lang.Math.abs(r8)
            int r4 = r4 - r5
            int r0 = java.lang.Math.abs(r4)
            if (r8 > r0) goto L_0x006c
            goto L_0x0072
        L_0x0068:
            if (r5 <= 0) goto L_0x006e
            if (r2 >= 0) goto L_0x006e
        L_0x006c:
            r3 = r5
            goto L_0x007b
        L_0x006e:
            if (r5 >= 0) goto L_0x0074
            if (r2 <= 0) goto L_0x0074
        L_0x0072:
            r3 = r2
            goto L_0x007b
        L_0x0074:
            java.lang.String r8 = TAG
            java.lang.String r0 = "Not find the appropriate path for drawable"
            com.sina.weibo.sdk.utils.LogUtil.e(r8, r0)
        L_0x007b:
            if (r3 >= 0) goto L_0x0085
            java.lang.String r8 = TAG
            java.lang.String r9 = "Not find the appropriate path for drawable"
            com.sina.weibo.sdk.utils.LogUtil.e(r8, r9)
            return r1
        L_0x0085:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String[] r0 = PRE_INSTALL_DRAWBLE_PATHS
            r0 = r0[r3]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.<init>(r0)
            java.lang.String r0 = "/"
            r8.append(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            return r8
        L_0x009f:
            int r2 = r2 + 1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.utils.ResourceManager.getAppropriatePathOfDrawable(android.content.Context, java.lang.String):java.lang.String");
    }

    private static View extractView(Context context, String str, ViewGroup viewGroup) throws Exception {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(context.getAssets().openXmlResourceParser(str), viewGroup);
    }

    public static StateListDrawable createStateListDrawable(Context context, String str, String str2) {
        Drawable drawable;
        Drawable drawable2;
        if (str.indexOf(".9") >= 0) {
            drawable = getNinePatchDrawable(context, str);
        } else {
            drawable = getDrawable(context, str);
        }
        if (str2.indexOf(".9") >= 0) {
            drawable2 = getNinePatchDrawable(context, str2);
        } else {
            drawable2 = getDrawable(context, str2);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, drawable2);
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[]{16842908}, drawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, drawable);
        return stateListDrawable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.graphics.drawable.NinePatchDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.graphics.drawable.BitmapDrawable} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r9 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r9 != null) goto L_0x0051;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059 A[SYNTHETIC, Splitter:B:17:0x0059] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.drawable.Drawable getDrawableFromAssert(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            android.content.res.AssetManager r0 = r8.getAssets()
            r1 = 0
            java.io.InputStream r9 = r0.open(r9)     // Catch:{ IOException -> 0x005d, all -> 0x0055 }
            if (r9 == 0) goto L_0x004f
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.content.res.Resources r0 = r8.getResources()     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            if (r10 == 0) goto L_0x003d
            android.content.res.Resources r10 = r8.getResources()     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.content.res.Configuration r10 = r10.getConfiguration()     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.content.res.Resources r3 = new android.content.res.Resources     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            r3.<init>(r8, r0, r10)     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.graphics.drawable.NinePatchDrawable r8 = new android.graphics.drawable.NinePatchDrawable     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            byte[] r5 = r4.getNinePatchChunk()     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            r10 = 0
            r6.<init>(r10, r10, r10, r10)     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            r1 = r8
            goto L_0x004f
        L_0x003d:
            int r10 = r0.densityDpi     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            r4.setDensity(r10)     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.graphics.drawable.BitmapDrawable r10 = new android.graphics.drawable.BitmapDrawable     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            r10.<init>(r8, r4)     // Catch:{ IOException -> 0x005e, all -> 0x004d }
            r1 = r10
            goto L_0x004f
        L_0x004d:
            r8 = move-exception
            goto L_0x0057
        L_0x004f:
            if (r9 == 0) goto L_0x0061
        L_0x0051:
            r9.close()     // Catch:{ IOException -> 0x0061 }
            goto L_0x0061
        L_0x0055:
            r8 = move-exception
            r9 = r1
        L_0x0057:
            if (r9 == 0) goto L_0x005c
            r9.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            throw r8
        L_0x005d:
            r9 = r1
        L_0x005e:
            if (r9 == 0) goto L_0x0061
            goto L_0x0051
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.utils.ResourceManager.getDrawableFromAssert(android.content.Context, java.lang.String, boolean):android.graphics.drawable.Drawable");
    }

    public static String getString(Context context, String str, String str2, String str3) {
        Locale language = getLanguage();
        if (Locale.SIMPLIFIED_CHINESE.equals(language)) {
            return str2;
        }
        if (Locale.TRADITIONAL_CHINESE.equals(language)) {
            return str3;
        }
        return str;
    }
}
