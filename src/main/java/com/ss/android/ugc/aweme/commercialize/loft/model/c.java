package com.ss.android.ugc.aweme.commercialize.loft.model;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.common.utility.DigestUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bm;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftFileManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "LOFT_RES", "", "getCacheDirName", "getRealFileName", "Ljava/io/File;", "baseDir", "absFileName", "getSaveDirPathName", "getSaveName", "loft", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/Loft;", "getZipFirstDirName", "src", "des", "mapUrlToName", "id", "downloadUrl", "removeDir", "", "absPath", "removeFile", "upZipFile", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39234a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f39235b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private Context f39236c;

    /* renamed from: d  reason: collision with root package name */
    private final String f39237d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftFileManager$Companion;", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/SingletonHolder;", "Lcom/ss/android/ugc/aweme/commercialize/loft/model/LoftFileManager;", "Landroid/content/Context;", "()V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a extends m<c, Context> {
        private a() {
            super(AnonymousClass1.INSTANCE);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f39234a, false, 31289, new Class[0], String.class)) {
            return a(this.f39236c);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f39234a, false, 31289, new Class[0], String.class);
    }

    private c(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
        this.f39236c = applicationContext;
        this.f39237d = "discover_loft_res";
    }

    public final void b(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39234a, false, 31297, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f39234a, false, 31297, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "absPath");
        bm.c(str);
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39234a, false, 31296, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f39234a, false, 31296, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "absPath");
        File file = new File(str2);
        if (file.exists() && !file.delete()) {
            bm.c(str);
        }
    }

    @NotNull
    public final String a(@NotNull a aVar) {
        boolean z;
        String str;
        boolean z2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f39234a, false, 31290, new Class[]{a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f39234a, false, 31290, new Class[]{a.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "loft");
        CharSequence id = aVar.getId();
        if (id == null || id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            b animationRes = aVar.getAnimationRes();
            if (animationRes != null) {
                str = animationRes.getDownloadUrl();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                String id2 = aVar.getId();
                if (id2 == null) {
                    Intrinsics.throwNpe();
                }
                b animationRes2 = aVar.getAnimationRes();
                if (animationRes2 == null) {
                    Intrinsics.throwNpe();
                }
                String downloadUrl = animationRes2.getDownloadUrl();
                if (PatchProxy.isSupport(new Object[]{id2, downloadUrl}, this, f39234a, false, 31291, new Class[]{String.class, String.class}, String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[]{id2, downloadUrl}, this, f39234a, false, 31291, new Class[]{String.class, String.class}, String.class);
                }
                StringBuilder sb = new StringBuilder();
                String md5Hex = DigestUtils.md5Hex(id2 + downloadUrl);
                if (md5Hex == null) {
                    md5Hex = id2 + downloadUrl;
                }
                sb.append(md5Hex);
                sb.append(".zip");
                return sb.toString();
            }
        }
        return "";
    }

    @SuppressLint({"SdCardPath"})
    private final String a(Context context) {
        File file;
        if (PatchProxy.isSupport(new Object[]{context}, this, f39234a, false, 31292, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, this, f39234a, false, 31292, new Class[]{Context.class}, String.class);
        }
        try {
            if (context.getExternalCacheDir() == null || !context.getExternalCacheDir().exists()) {
                StringBuilder sb = new StringBuilder();
                File cacheDir = context.getCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(cacheDir, "context.cacheDir");
                sb.append(cacheDir.getAbsoluteFile());
                sb.append(File.separator);
                sb.append(this.f39237d);
                file = new File(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                File externalCacheDir = context.getExternalCacheDir();
                Intrinsics.checkExpressionValueIsNotNull(externalCacheDir, "context.externalCacheDir");
                sb2.append(externalCacheDir.getAbsoluteFile());
                sb2.append(File.separator);
                sb2.append(this.f39237d);
                file = new File(sb2.toString());
            }
            if (!file.exists()) {
                if (!file.mkdir()) {
                    file = context.getDir("/data/data/" + context.getPackageName() + "/cache/" + this.f39237d, 0);
                }
            }
        } catch (Throwable unused) {
            StringBuilder sb3 = new StringBuilder();
            File cacheDir2 = context.getCacheDir();
            Intrinsics.checkExpressionValueIsNotNull(cacheDir2, "context.cacheDir");
            sb3.append(cacheDir2.getAbsoluteFile());
            sb3.append(File.separator);
            sb3.append(this.f39237d);
            file = new File(sb3.toString());
            if (!file.exists()) {
                file.mkdir();
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(file, "file");
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
        return absolutePath;
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0136  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File a(java.lang.String r20, java.lang.String r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f39234a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.io.File> r9 = java.io.File.class
            r6 = 0
            r7 = 31295(0x7a3f, float:4.3854E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f39234a
            r15 = 0
            r16 = 31295(0x7a3f, float:4.3854E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.io.File> r18 = java.io.File.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.io.File r0 = (java.io.File) r0
            return r0
        L_0x0048:
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = "/"
            kotlin.text.Regex r4 = new kotlin.text.Regex
            r4.<init>((java.lang.String) r3)
            java.util.List r2 = r4.split(r2, r10)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0089
            int r3 = r2.size()
            java.util.ListIterator r3 = r2.listIterator(r3)
        L_0x0064:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r3.previous()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x007a
            r4 = 1
            goto L_0x007b
        L_0x007a:
            r4 = 0
        L_0x007b:
            if (r4 != 0) goto L_0x0064
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            int r3 = r3.nextIndex()
            int r3 = r3 + r11
            java.util.List r2 = kotlin.collections.CollectionsKt.take(r2, r3)
            goto L_0x008d
        L_0x0089:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x008d:
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x0136
            java.lang.String[] r3 = new java.lang.String[r10]
            java.lang.Object[] r2 = r2.toArray(r3)
            if (r2 == 0) goto L_0x012e
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x00a9
            r3.mkdir()
        L_0x00a9:
            int r3 = r2.length
            if (r3 <= r11) goto L_0x0119
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            int r0 = r2.length
            int r0 = r0 - r11
        L_0x00b3:
            if (r10 >= r0) goto L_0x00e3
            r3 = r2[r10]
            java.nio.charset.Charset r4 = kotlin.text.Charsets.ISO_8859_1     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            if (r3 == 0) goto L_0x00cd
            byte[] r4 = r3.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            java.lang.String r5 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            r6.<init>(r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            r3 = r6
            goto L_0x00d5
        L_0x00cd:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            r4.<init>(r5)     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
            throw r4     // Catch:{ UnsupportedEncodingException -> 0x00d5 }
        L_0x00d5:
            java.io.File r4 = new java.io.File
            if (r3 != 0) goto L_0x00dc
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00dc:
            r4.<init>(r1, r3)
            int r10 = r10 + 1
            r1 = r4
            goto L_0x00b3
        L_0x00e3:
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x00ec
            r1.mkdirs()
        L_0x00ec:
            int r0 = r2.length
            int r0 = r0 - r11
            r0 = r2[r0]
            java.nio.charset.Charset r2 = kotlin.text.Charsets.ISO_8859_1     // Catch:{ UnsupportedEncodingException -> 0x010e }
            if (r0 == 0) goto L_0x0106
            byte[] r2 = r0.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x010e }
            java.lang.String r3 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x010e }
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8     // Catch:{ UnsupportedEncodingException -> 0x010e }
            java.lang.String r4 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x010e }
            r4.<init>(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x010e }
            r0 = r4
            goto L_0x010e
        L_0x0106:
            kotlin.TypeCastException r2 = new kotlin.TypeCastException     // Catch:{ UnsupportedEncodingException -> 0x010e }
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            r2.<init>(r3)     // Catch:{ UnsupportedEncodingException -> 0x010e }
            throw r2     // Catch:{ UnsupportedEncodingException -> 0x010e }
        L_0x010e:
            java.io.File r2 = new java.io.File
            if (r0 != 0) goto L_0x0115
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0115:
            r2.<init>(r1, r0)
            return r2
        L_0x0119:
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x012d
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L_0x012d
            r2.createNewFile()
        L_0x012d:
            return r2
        L_0x012e:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x0136:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Collection<T>"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.loft.model.c.a(java.lang.String, java.lang.String):java.io.File");
    }
}
