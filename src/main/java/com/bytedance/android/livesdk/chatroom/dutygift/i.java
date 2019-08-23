package com.bytedance.android.livesdk.chatroom.dutygift;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import java.io.File;

public final /* synthetic */ class i implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9995a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9996b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9997c;

    i(String str, String str2) {
        this.f9996b = str;
        this.f9997c = str2;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9995a, false, 4163, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f9995a, false, 4163, new Class[]{Object.class}, Object.class);
        }
        String str = this.f9996b;
        String str2 = this.f9997c;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return "";
        }
        if (bitmap.getWidth() > 32 || bitmap.getHeight() > 32) {
            bitmap = BitmapUtils.resizeBitmap(bitmap, 32, 32);
        }
        BitmapUtils.saveBitmapToSD(bitmap, str, str2);
        return str + File.separator + str2;
    }
}
