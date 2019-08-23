package com.ss.android.ugc.aweme.miniapp.d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.miniapp.dialog.a;
import com.ss.android.ugc.aweme.miniapp.k.b;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.a.f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import com.tt.miniapphost.entity.ChooseImageResultEntity;
import com.tt.miniapphost.entity.ScanResultEntity;
import com.tt.option.media.AbstractHostOptionMediaDepend;
import com.tt.option.media.HostOptionMediaDepend;
import org.greenrobot.eventbus.c;

public final class d extends AbstractHostOptionMediaDepend {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55673a;

    public final boolean scanCode(@NonNull Activity activity, @NonNull HostOptionMediaDepend.ExtendScanCodeCallBack extendScanCodeCallBack) {
        HostOptionMediaDepend.ExtendScanCodeCallBack extendScanCodeCallBack2 = extendScanCodeCallBack;
        if (PatchProxy.isSupport(new Object[]{activity, extendScanCodeCallBack2}, this, f55673a, false, 59384, new Class[]{Activity.class, HostOptionMediaDepend.ExtendScanCodeCallBack.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, extendScanCodeCallBack2}, this, f55673a, false, 59384, new Class[]{Activity.class, HostOptionMediaDepend.ExtendScanCodeCallBack.class}, Boolean.TYPE)).booleanValue();
        }
        b bVar = new b(AppbrandContext.getInst());
        if (PatchProxy.isSupport(new Object[]{extendScanCodeCallBack2}, bVar, b.f3590a, false, 59521, new Class[]{HostOptionMediaDepend.ExtendScanCodeCallBack.class}, Void.TYPE)) {
            b bVar2 = bVar;
            PatchProxy.accessDispatch(new Object[]{extendScanCodeCallBack2}, bVar2, b.f3590a, false, 59521, new Class[]{HostOptionMediaDepend.ExtendScanCodeCallBack.class}, Void.TYPE);
        } else {
            bVar.f3591b = true;
            f fVar = q.a().i;
            if (fVar != null) {
                fVar.a((Context) bVar.getCurrentActivity(), true);
                if (!c.a().b((Object) bVar)) {
                    c.a().a((Object) bVar);
                }
            }
            bVar.f3592c = extendScanCodeCallBack2;
        }
        return super.scanCode(activity, extendScanCodeCallBack);
    }

    public final void a(Activity activity, int i, int i2) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f55673a, false, 59383, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f55673a, false, 59383, new Class[]{Activity.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        f fVar = q.a().i;
        if (fVar != null) {
            fVar.a(activity2, i, i2);
        }
    }

    @NonNull
    public final ChooseImageResultEntity handleActivityImageResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f55673a, false, 59382, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, ChooseImageResultEntity.class)) {
            return (ChooseImageResultEntity) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f55673a, false, 59382, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, ChooseImageResultEntity.class);
        }
        ChooseImageResultEntity chooseImageResultEntity = new ChooseImageResultEntity();
        chooseImageResultEntity.setShouldHandle(true);
        chooseImageResultEntity.setMediaListResult(intent2.getParcelableArrayListExtra("key_media_list"));
        return chooseImageResultEntity;
    }

    @NonNull
    public final ScanResultEntity handleActivityScanResult(int i, int i2, Intent intent) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f55673a, false, 59385, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, ScanResultEntity.class)) {
            return super.handleActivityScanResult(i, i2, intent);
        }
        return (ScanResultEntity) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f55673a, false, 59385, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, ScanResultEntity.class);
    }

    public final void chooseImage(@NonNull Activity activity, int i, boolean z, boolean z2, @Nullable String str) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), str}, this, f55673a, false, 59381, new Class[]{Activity.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), Byte.valueOf(z), Byte.valueOf(z2), str}, this, f55673a, false, 59381, new Class[]{Activity.class, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
        } else if (z && z2) {
            final String string = activity.getResources().getString(C0906R.string.bx8);
            final String string2 = activity.getResources().getString(C0906R.string.bbq);
            String[] strArr = {string, string2};
            a aVar = new a(AppbrandContext.getInst());
            final String[] strArr2 = strArr;
            final Activity activity3 = activity;
            final int i2 = i;
            AnonymousClass1 r0 = new NativeModule.NativeModuleCallback<String>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55674a;

                public final /* synthetic */ void onNativeModuleCall(Object obj) {
                    String str = (String) obj;
                    if (PatchProxy.isSupport(new Object[]{str}, this, f55674a, false, 59386, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f55674a, false, 59386, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    int i = -1;
                    try {
                        i = Integer.valueOf(str).intValue();
                    } catch (Exception unused) {
                    }
                    if (i >= 0) {
                        String str2 = strArr2[i];
                        if (string.equals(str2)) {
                            d.this.a(activity3, 1, 1);
                        } else if (string2.equals(str2)) {
                            d.this.a(activity3, 2, i2);
                        }
                    }
                }
            };
            aVar.a(strArr, r0);
        } else if (z2) {
            a(activity2, 1, 1);
        } else {
            if (z) {
                a(activity2, 2, i);
            }
        }
    }
}
