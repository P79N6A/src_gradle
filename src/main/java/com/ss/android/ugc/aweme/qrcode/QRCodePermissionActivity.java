package com.ss.android.ugc.aweme.qrcode;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.aweme.utils.permission.f;

public class QRCodePermissionActivity extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63311a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f63312b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static long f63313c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f63314d;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f63311a, false, 70370, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63311a, false, 70370, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f63311a, false, 70371, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f63311a, false, 70371, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63311a, false, 70369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63311a, false, 70369, new Class[0], Void.TYPE);
            return;
        }
        if (f63312b != -1) {
            ScanQRCodeActivityV2.a((Context) this, f63312b);
        } else {
            ScanQRCodeActivityV2.a((Context) this, this.f63314d);
        }
        finish();
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63311a, false, 70367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63311a, false, 70367, new Class[0], Void.TYPE);
            return;
        }
        Dialog a2 = new a.C0185a(this).b((int) C0906R.string.bm3).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63317a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63317a, false, 70373, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63317a, false, 70373, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                QRCodePermissionActivity.this.finish();
            }
        }).a((int) C0906R.string.a0x, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63315a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63315a, false, 70372, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63315a, false, 70372, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                bi.a(QRCodePermissionActivity.this);
                QRCodePermissionActivity.this.finish();
            }
        }).a().a();
        a2.setOnDismissListener(new DialogInterface.OnDismissListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63319a;

            public final void onDismiss(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f63319a, false, 70374, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f63319a, false, 70374, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                QRCodePermissionActivity.this.finish();
            }
        });
        a2.show();
    }

    public void onCreate(@Nullable Bundle bundle) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f63311a, false, 70366, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f63311a, false, 70366, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        if (f.a(this) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f63314d = getIntent().getBooleanExtra("enter_from", false);
        if (z) {
            b();
        } else if (f.a()) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 1);
        } else {
            a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity", "onCreate", false);
    }

    public static void a(Context context, boolean z) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f63311a, true, 70363, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Byte.valueOf(z)}, null, f63311a, true, 70363, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - f63313c >= 1000) {
            f63313c = currentTimeMillis;
            Intent intent = new Intent(context2, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", z);
            context2.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r21, @android.support.annotation.NonNull java.lang.String[] r22, @android.support.annotation.NonNull int[] r23) {
        /*
            r20 = this;
            r1 = r23
            r2 = 3
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r10 = 0
            r3[r10] = r4
            r11 = 1
            r3[r11] = r22
            r12 = 2
            r3[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f63311a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r12] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 70368(0x112e0, float:9.8607E-41)
            r4 = r20
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x005b
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r13[r10] = r3
            r13[r11] = r22
            r13[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r15 = f63311a
            r16 = 0
            r17 = 70368(0x112e0, float:9.8607E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x005b:
            super.onRequestPermissionsResult(r21, r22, r23)
            r0 = r21
            if (r0 != r11) goto L_0x0074
            int r0 = r1.length
        L_0x0063:
            if (r10 >= r0) goto L_0x0071
            r2 = r1[r10]
            r3 = -1
            if (r2 != r3) goto L_0x006e
            r20.a()
            return
        L_0x006e:
            int r10 = r10 + 1
            goto L_0x0063
        L_0x0071:
            r20.b()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
