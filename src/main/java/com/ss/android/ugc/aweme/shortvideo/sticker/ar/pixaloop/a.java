package com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop;

import android.app.Application;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.bm;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\"R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/ar/pixaloop/PixaloopHelper;", "", "()V", "IMAGE_PROJECTION", "", "", "[Ljava/lang/String;", "PIXALOOP_SELECTPHOTO_REQUESTCODE", "", "getPIXALOOP_SELECTPHOTO_REQUESTCODE", "()I", "dcimPhotoData", "", "getDcimPhotoData", "()Ljava/util/List;", "extractWithEffect", "", "getExtractWithEffect", "()Z", "setExtractWithEffect", "(Z)V", "isLoadingRequired", "setLoadingRequired", "showGuide", "getShowGuide", "setShowGuide", "urlPrefixList", "getUrlPrefixList", "setUrlPrefixList", "(Ljava/util/List;)V", "isImgType", "imgPath", "isPixaloopSticker", "bean", "Lcom/ss/android/ugc/aweme/sticker/model/FaceStickerBean;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69349a = null;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static List<String> f69350b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static boolean f69351c = false;

    /* renamed from: d  reason: collision with root package name */
    static boolean f69352d = true;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f69353e = true;

    /* renamed from: f  reason: collision with root package name */
    public static final a f69354f = new a();
    private static final int g = g;
    private static final String[] h = {"_data"};

    private a() {
    }

    public static int a() {
        return g;
    }

    @Nullable
    public final List<String> b() {
        if (PatchProxy.isSupport(new Object[0], this, f69349a, false, 78897, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f69349a, false, 78897, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        Intrinsics.checkExpressionValueIsNotNull(externalStoragePublicDirectory, "Environment.getExternalS…vironment.DIRECTORY_DCIM)");
        String absolutePath = externalStoragePublicDirectory.getAbsolutePath();
        String[] strArr = {absolutePath + '%'};
        Application application = com.ss.android.ugc.aweme.port.in.a.f61119b;
        Intrinsics.checkExpressionValueIsNotNull(application, "AVEnv.application");
        Cursor query = application.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, h, "_data like ? ", strArr, "date_added DESC LIMIT 1000");
        if (query == null) {
            return null;
        }
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                if (bm.a(string) && a(string)) {
                    arrayList.add(string);
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public static void b(boolean z) {
        f69352d = z;
    }

    public static void a(boolean z) {
        f69351c = z;
    }

    public final boolean a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f69349a, false, 78899, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f69349a, false, 78899, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str2, options);
        String str3 = options.outMimeType;
        CharSequence charSequence = str3;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(str3, "type");
        if (StringsKt.contains(charSequence, (CharSequence) "png", true) || StringsKt.contains(charSequence, (CharSequence) "jpg", true) || StringsKt.contains(charSequence, (CharSequence) "jpeg", true)) {
            return true;
        }
        return false;
    }

    public final boolean a(@Nullable FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f69349a, false, 78898, new Class[]{FaceStickerBean.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f69349a, false, 78898, new Class[]{FaceStickerBean.class}, Boolean.TYPE)).booleanValue();
        } else if (faceStickerBean == null || TextUtils.isEmpty(faceStickerBean.getSdkExtra())) {
            return false;
        } else {
            String sdkExtra = faceStickerBean.getSdkExtra();
            Intrinsics.checkExpressionValueIsNotNull(sdkExtra, "bean.sdkExtra");
            if (!StringsKt.contains$default((CharSequence) sdkExtra, (CharSequence) "pl", false, 2, (Object) null)) {
                return false;
            }
            String sdkExtra2 = faceStickerBean.getSdkExtra();
            Intrinsics.checkExpressionValueIsNotNull(sdkExtra2, "bean.sdkExtra");
            if (!StringsKt.contains$default((CharSequence) sdkExtra2, (CharSequence) "alg", false, 2, (Object) null)) {
                return false;
            }
            try {
                return new JSONObject(faceStickerBean.getSdkExtra()).has("pl");
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
