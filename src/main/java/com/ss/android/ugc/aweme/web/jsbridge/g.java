package com.ss.android.ugc.aweme.web.jsbridge;

import a.i;
import android.graphics.Bitmap;
import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.utils.w;
import java.io.File;
import org.json.JSONObject;

public final /* synthetic */ class g implements a.g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76785a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76786b;

    g(int i) {
        this.f76786b = i;
    }

    public final Object then(i iVar) {
        Bitmap.CompressFormat compressFormat;
        String str;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f76785a, false, 89939, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f76785a, false, 89939, new Class[]{i.class}, Object.class);
        }
        int i = this.f76786b;
        if (iVar.e() == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            jSONObject.put("file_path", "");
            return jSONObject;
        }
        switch (i) {
            case 1:
                str = ".png";
                compressFormat = Bitmap.CompressFormat.PNG;
                break;
            case 2:
                str = ".webp";
                compressFormat = Bitmap.CompressFormat.WEBP;
                break;
            default:
                str = ".jpg";
                compressFormat = Bitmap.CompressFormat.JPEG;
                break;
        }
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath() + File.separator + "Camera", "share_" + System.currentTimeMillis() + str);
        bm.a(file.getAbsolutePath(), true);
        boolean a2 = w.a((Bitmap) iVar.e(), file, 100, compressFormat);
        ((Bitmap) iVar.e()).recycle();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", a2 ? 1 : 0);
        jSONObject2.put("file_path", a2 ? file.getAbsoluteFile() : "");
        return jSONObject2;
    }
}
