package com.ss.android.ugc.aweme.feedback;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/feedback/UploadImageUtils;", "", "()V", "getFeedbackImageDir", "", "getResizeFileName", "fileName", "file", "Ljava/io/File;", "maxImageWidth", "", "getUploadResizeImageDir", "removeUploadImageDir", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47218a;

    /* renamed from: b  reason: collision with root package name */
    public static final t f47219b = new t();

    private t() {
    }

    private final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f47218a, false, 43857, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47218a, false, 43857, new Class[0], String.class);
        }
        File a2 = b.a(b());
        if (a2 == null) {
            return "";
        }
        String path = a2.getPath();
        Intrinsics.checkExpressionValueIsNotNull(path, "file.path");
        return path;
    }

    private final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f47218a, false, 43858, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47218a, false, 43858, new Class[0], String.class);
        }
        return "feedback" + File.separator + "upload";
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47218a, false, 43856, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47218a, false, 43856, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i > 0) {
            b.e(a());
        }
    }

    @NotNull
    public final String a(@NotNull String str, @NotNull File file, int i) {
        String str2 = str;
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{str2, file2, Integer.valueOf(i)}, this, f47218a, false, 43855, new Class[]{String.class, File.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, file2, Integer.valueOf(i)}, this, f47218a, false, 43855, new Class[]{String.class, File.class, Integer.TYPE}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "fileName");
        Intrinsics.checkParameterIsNotNull(file2, "file");
        if (i > 0) {
            try {
                Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(str);
                int c2 = p.c(d.a());
                if (bitmapFromSD != null && bitmapFromSD.getWidth() > c2) {
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(BitmapUtils.resizeBitmap(bitmapFromSD, c2, (bitmapFromSD.getHeight() * c2) / bitmapFromSD.getWidth()), BitmapUtils.readPictureDegree(str));
                    if (rotateBitmap != null) {
                        if (BitmapUtils.saveBitmapToSD(rotateBitmap, a(), file.getName())) {
                            str2 = r4 + File.separator + file.getName();
                        }
                        rotateBitmap.recycle();
                    }
                    bitmapFromSD.recycle();
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }
}
