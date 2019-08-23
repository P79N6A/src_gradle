package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14895a;

    /* renamed from: b  reason: collision with root package name */
    private final b f14896b;

    /* renamed from: c  reason: collision with root package name */
    private final View f14897c;

    c(b bVar, View view) {
        this.f14896b = bVar;
        this.f14897c = view;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14895a, false, 9485, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f14895a, false, 9485, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f14896b;
        View view = this.f14897c;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                UIUtils.setLayoutParams(view, (int) (((float) bitmap.getWidth()) * b.f14887b), (int) (((float) bitmap.getHeight()) * b.f14887b));
            }
            if (Build.VERSION.SDK_INT >= 16) {
                view.setBackground(new BitmapDrawable(bitmap));
            } else {
                view.setBackgroundDrawable(new BitmapDrawable(bitmap));
            }
            bVar.invalidate();
        }
    }
}
