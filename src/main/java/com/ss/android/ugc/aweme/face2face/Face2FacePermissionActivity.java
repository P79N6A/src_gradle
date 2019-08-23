package com.ss.android.ugc.aweme.face2face;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;

public class Face2FacePermissionActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43902a;

    /* renamed from: b  reason: collision with root package name */
    private Handler f43903b;

    /* renamed from: c  reason: collision with root package name */
    private String f43904c;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f43902a, false, 39120, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43902a, false, 39120, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FacePermissionActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FacePermissionActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43902a, false, 39121, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43902a, false, 39121, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FacePermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43902a, false, 39117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43902a, false, 39117, new Class[0], Void.TYPE);
            return;
        }
        af.a((Context) this).e();
        Face2FaceAddFriendActivity.a(this, 65281, this.f43904c);
        finish();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f43902a, false, 39118, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43902a, false, 39118, new Class[0], Void.TYPE);
            return;
        }
        this.f43903b.post(new o(this));
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f43902a, false, 39115, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f43902a, false, 39115, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FacePermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f43903b = new SafeHandler(this);
        this.f43904c = getIntent().getStringExtra("face_to_face_enter_from");
        if (a.a((Context) this, af.f2626c)) {
            a();
        } else if (f.a()) {
            if (PatchProxy.isSupport(new Object[0], this, f43902a, false, 39116, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43902a, false, 39116, new Class[0], Void.TYPE);
            } else {
                a.a((Activity) this, 65281, af.f2626c, (a.C0792a) new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f43905a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f43905a, false, 39126, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f43905a, false, 39126, new Class[0], Void.TYPE);
                            return;
                        }
                        Face2FacePermissionActivity.this.a();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f43905a, false, 39127, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f43905a, false, 39127, new Class[0], Void.TYPE);
                            return;
                        }
                        Face2FacePermissionActivity.this.b();
                    }
                });
            }
        } else {
            b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.face2face.Face2FacePermissionActivity", "onCreate", false);
    }

    public static void a(@NonNull Context context, @NonNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, null, f43902a, true, 39114, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, null, f43902a, true, 39114, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, Face2FacePermissionActivity.class);
        intent.putExtra("face_to_face_enter_from", str2);
        context2.startActivity(intent);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), strArr, iArr}, this, f43902a, false, 39119, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), strArr, iArr}, this, f43902a, false, 39119, new Class[]{Integer.TYPE, String[].class, int[].class}, Void.TYPE);
            return;
        }
        a.a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
