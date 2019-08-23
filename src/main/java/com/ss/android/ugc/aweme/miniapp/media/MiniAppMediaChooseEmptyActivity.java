package com.ss.android.ugc.aweme.miniapp.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.profile.d.j;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.host.HostDependManager;
import java.util.ArrayList;

public class MiniAppMediaChooseEmptyActivity extends FragmentActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55860a;

    /* renamed from: b  reason: collision with root package name */
    private Fragment f55861b;

    /* renamed from: c  reason: collision with root package name */
    private a f55862c;

    /* renamed from: d  reason: collision with root package name */
    private int f55863d;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f55860a, false, 59464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55860a, false, 59464, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f55860a, false, 59465, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f55860a, false, 59465, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55860a, false, 59462, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55860a, false, 59462, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(C0906R.layout.ck);
        this.f55861b = getSupportFragmentManager().findFragmentById(C0906R.id.aig);
        this.f55862c = new a(this, this.f55861b);
        this.f55863d = getIntent().getIntExtra("key_choose_type", 1);
        int intExtra = getIntent().getIntExtra("key_choose_num", 1);
        switch (this.f55863d) {
            case 1:
                a aVar = this.f55862c;
                if (!PatchProxy.isSupport(new Object[0], aVar, a.f55864a, false, 59466, new Class[0], Void.TYPE)) {
                    aVar.f55865b.e(6);
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f55864a, false, 59466, new Class[0], Void.TYPE);
                    break;
                }
            case 2:
                a aVar2 = this.f55862c;
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(intExtra)}, aVar2, a.f55864a, false, 59467, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    aVar2.f55865b.i = intExtra;
                    aVar2.f55865b.b(6);
                    break;
                } else {
                    a aVar3 = aVar2;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intExtra)}, aVar3, a.f55864a, false, 59467, new Class[]{Integer.TYPE}, Void.TYPE);
                    break;
                }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.media.MiniAppMediaChooseEmptyActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Intent intent2;
        MediaEntity mediaEntity;
        String str;
        Bitmap bitmap;
        int i3 = i;
        int i4 = i2;
        Intent intent3 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent3}, this, f55860a, false, 59463, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent3}, this, f55860a, false, 59463, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        setResult(i3, intent3);
        if (intent3 == null) {
            intent2 = new Intent();
        } else {
            intent2 = intent3;
        }
        ArrayList arrayList = new ArrayList();
        switch (this.f55863d) {
            case 1:
                if (i4 != 0) {
                    a aVar = this.f55862c;
                    if (PatchProxy.isSupport(new Object[0], aVar, a.f55864a, false, 59468, new Class[0], MediaEntity.class)) {
                        mediaEntity = (MediaEntity) PatchProxy.accessDispatch(new Object[0], aVar, a.f55864a, false, 59468, new Class[0], MediaEntity.class);
                    } else {
                        Activity activity = aVar.f55866c;
                        j jVar = aVar.f55865b;
                        if (PatchProxy.isSupport(new Object[0], jVar, j.f61424a, false, 69954, new Class[0], String.class)) {
                            str = (String) PatchProxy.accessDispatch(new Object[0], jVar, j.f61424a, false, 69954, new Class[0], String.class);
                        } else {
                            str = jVar.d();
                        }
                        if (PatchProxy.isSupport(new Object[]{str}, aVar, a.f55864a, false, 59471, new Class[]{String.class}, Bitmap.class)) {
                            Object[] objArr = {str};
                            a aVar2 = aVar;
                            ChangeQuickRedirect changeQuickRedirect = a.f55864a;
                            bitmap = (Bitmap) PatchProxy.accessDispatch(objArr, aVar2, changeQuickRedirect, false, 59471, new Class[]{String.class}, Bitmap.class);
                        } else {
                            Bitmap decodeFile = BitmapFactory.decodeFile(str);
                            if (decodeFile == null) {
                                bitmap = null;
                            } else {
                                Matrix matrix = new Matrix();
                                matrix.postRotate((float) aVar.a(str));
                                bitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                            }
                        }
                        mediaEntity = new MediaEntity(aVar.a(activity, bitmap), "", 0, 0, 0, 0, "");
                    }
                    arrayList.add(mediaEntity);
                    break;
                }
                break;
            case 2:
                arrayList.addAll(this.f55862c.a(intent2));
                break;
        }
        setResult(11, intent2);
        intent2.putParcelableArrayListExtra("key_media_list", arrayList);
        HostDependManager.getInst().handleActivityImageResult(i3, i4, intent2);
        finish();
    }
}
