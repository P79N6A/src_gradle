package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17623a;
    private static SimpleDateFormat n;

    /* renamed from: b  reason: collision with root package name */
    Activity f17624b;

    /* renamed from: c  reason: collision with root package name */
    final Fragment f17625c;

    /* renamed from: d  reason: collision with root package name */
    final String f17626d;

    /* renamed from: e  reason: collision with root package name */
    final a f17627e;

    /* renamed from: f  reason: collision with root package name */
    private final Resources f17628f;
    private final String g;
    private String h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final Map<String, String> m = new HashMap();
    private ProgressDialog o;

    public interface a {
        void a();

        void a(String str, String str2);
    }

    public final boolean a(int i2, int i3, Intent intent) {
        Uri uri;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f17623a, false, 13664, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f17623a, false, 13664, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (i4 == 40003) {
            if (i3 == 0) {
                if (this.f17627e != null) {
                    this.f17627e.a();
                }
                return false;
            } else if (intent == null) {
                if (this.f17627e != null) {
                    this.f17627e.a();
                }
                return false;
            } else {
                Uri data = intent.getData();
                String a2 = a.a((Context) this.f17624b, data);
                if (StringUtils.isEmpty(a2)) {
                    if (this.f17627e != null) {
                        this.f17627e.a();
                    }
                    UIUtils.displayToastWithIcon((Context) this.f17624b, 2130841006, (int) C0906R.string.dh_);
                    return false;
                } else if (!new File(a2).exists()) {
                    if (this.f17627e != null) {
                        this.f17627e.a();
                    }
                    UIUtils.displayToastWithIcon((Context) this.f17624b, 2130841006, (int) C0906R.string.dh_);
                    return false;
                } else {
                    if ("file".equals(data.getScheme())) {
                        data = a.a((Context) this.f17624b, a2);
                    }
                    a(data, false);
                    this.m.put(this.h, b(a2));
                    return true;
                }
            }
        } else if (i4 != 40004) {
            if (i4 == 40002) {
                if (i3 == 0) {
                    if (this.f17627e != null) {
                        this.f17627e.a();
                    }
                    return false;
                }
                File file = new File(this.f17626d + "/" + f());
                if (!file.exists()) {
                    return true;
                }
                if (!a(file.getAbsolutePath(), this.k, this.l)) {
                    a.a(this.f17624b, this.f17625c, 40003);
                    return true;
                }
                String absolutePath = file.getAbsolutePath();
                String remove = this.m.remove(this.h);
                if (PatchProxy.isSupport(new Object[]{absolutePath, remove}, this, f17623a, false, 13666, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{absolutePath, remove}, this, f17623a, false, 13666, new Class[]{String.class, String.class}, Void.TYPE);
                } else if (this.f17627e != null) {
                    this.f17627e.a(absolutePath, remove);
                }
                return true;
            }
            return false;
        } else if (i3 == 0) {
            if (this.f17627e != null) {
                this.f17627e.a();
            }
            return false;
        } else {
            try {
                if (PatchProxy.isSupport(new Object[0], this, f17623a, false, 13671, new Class[0], Uri.class)) {
                    uri = (Uri) PatchProxy.accessDispatch(new Object[0], this, f17623a, false, 13671, new Class[0], Uri.class);
                } else {
                    uri = a(d());
                }
                a(uri, true);
                this.m.put(this.h, String.valueOf(System.currentTimeMillis()));
                return true;
            } catch (Exception unused) {
            }
        }
    }

    private Uri e() {
        if (!PatchProxy.isSupport(new Object[0], this, f17623a, false, 13673, new Class[0], Uri.class)) {
            return a(f());
        }
        return (Uri) PatchProxy.accessDispatch(new Object[0], this, f17623a, false, 13673, new Class[0], Uri.class);
    }

    private String f() {
        if (PatchProxy.isSupport(new Object[0], this, f17623a, false, 13674, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f17623a, false, 13674, new Class[0], String.class);
        }
        return this.g + "_" + this.h;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f17623a, false, 13668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17623a, false, 13668, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public String d() {
        if (PatchProxy.isSupport(new Object[0], this, f17623a, false, 13670, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f17623a, false, 13670, new Class[0], String.class);
        }
        return f() + ".temp";
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f17623a, false, 13667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17623a, false, 13667, new Class[0], Void.TYPE);
            return;
        }
        if (this.o == null) {
            this.o = new ProgressDialog(this.f17624b);
            this.o.setMessage(this.f17624b.getString(C0906R.string.ddy));
            this.o.setIndeterminate(true);
            this.o.setCancelable(true);
        }
        if (!this.o.isShowing()) {
            this.o.show();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f17623a, false, 13662, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17623a, false, 13662, new Class[0], Void.TYPE);
            return;
        }
        this.h = String.valueOf(System.currentTimeMillis());
        String[] stringArray = this.f17628f.getStringArray(C0906R.array.aa);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f17624b);
        builder.setItems((CharSequence[]) stringArray, (DialogInterface.OnClickListener) new q(this));
        builder.setCancelable(false);
        builder.show();
    }

    private Uri a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f17623a, false, 13672, new Class[]{String.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{str}, this, f17623a, false, 13672, new Class[]{String.class}, Uri.class);
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        File file = new File(this.f17626d + "/" + str2);
        if (!file.exists()) {
            try {
                File file2 = new File(this.f17626d);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        return Uri.fromFile(file);
    }

    private static String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f17623a, true, 13676, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f17623a, true, 13676, new Class[]{String.class}, String.class);
        }
        File file = new File(str2);
        if (!file.exists()) {
            return null;
        }
        try {
            String attribute = new ExifInterface(str2).getAttribute("DateTime");
            if (!TextUtils.isEmpty(attribute)) {
                if (n == null) {
                    n = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                }
                return String.valueOf(n.parse(attribute).getTime());
            }
        } catch (IOException | ParseException unused) {
        }
        return String.valueOf(file.lastModified());
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f17623a, false, 13669, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f17623a, false, 13669, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Toast makeText = Toast.makeText(this.f17624b, i2, 0);
        makeText.setGravity(49, 0, 0);
        r.a(makeText);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bd A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9 A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf A[Catch:{ Exception -> 0x00d5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r11, boolean r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f17623a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 13665(0x3561, float:1.9149E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f17623a
            r3 = 0
            r4 = 13665(0x3561, float:1.9149E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            if (r11 != 0) goto L_0x0048
            return
        L_0x0048:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.camera.action.CROP"
            r0.<init>(r1)
            if (r12 == 0) goto L_0x0052
            goto L_0x007d
        L_0x0052:
            java.lang.String r1 = r11.getLastPathSegment()     // Catch:{ Exception -> 0x00c2 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00c2 }
            r3 = 19
            if (r2 < r3) goto L_0x0072
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00c2 }
            if (r2 != 0) goto L_0x0072
            java.lang.String r2 = ":"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x00c2 }
            if (r2 == 0) goto L_0x0072
            java.lang.String r2 = ":"
            java.lang.String[] r1 = r1.split(r2)     // Catch:{ Exception -> 0x00c2 }
            r1 = r1[r9]     // Catch:{ Exception -> 0x00c2 }
        L_0x0072:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ NumberFormatException -> 0x007d }
            long r3 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x007d }
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r2, r3)     // Catch:{ NumberFormatException -> 0x007d }
            goto L_0x007e
        L_0x007d:
            r1 = r11
        L_0x007e:
            java.lang.String r2 = "image/*"
            r0.setDataAndType(r1, r2)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "crop"
            java.lang.String r2 = "true"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "scale"
            r0.putExtra(r1, r9)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "aspectX"
            int r2 = r10.i     // Catch:{ Exception -> 0x00c2 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "aspectY"
            int r2 = r10.j     // Catch:{ Exception -> 0x00c2 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "return-data"
            r0.putExtra(r1, r8)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "outputFormat"
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00c2 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "noFaceDetection"
            r0.putExtra(r1, r9)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r1 = "scaleUpIfNeeded"
            r0.putExtra(r1, r9)     // Catch:{ Exception -> 0x00c2 }
            android.net.Uri r1 = r10.e()     // Catch:{ Exception -> 0x00c2 }
            if (r1 == 0) goto L_0x00c2
            java.lang.String r2 = "output"
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x00c2 }
        L_0x00c2:
            android.support.v4.app.Fragment r1 = r10.f17625c     // Catch:{ Exception -> 0x00d5 }
            r2 = 40002(0x9c42, float:5.6055E-41)
            if (r1 == 0) goto L_0x00cf
            android.support.v4.app.Fragment r1 = r10.f17625c     // Catch:{ Exception -> 0x00d5 }
            r1.startActivityForResult(r0, r2)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00db
        L_0x00cf:
            android.app.Activity r1 = r10.f17624b     // Catch:{ Exception -> 0x00d5 }
            r1.startActivityForResult(r0, r2)     // Catch:{ Exception -> 0x00d5 }
            return
        L_0x00d5:
            r0 = 2131564201(0x7f0d16a9, float:1.875388E38)
            r10.a((int) r0)
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.p.a(android.net.Uri, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a9 A[SYNTHETIC, Splitter:B:35:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00af A[SYNTHETIC, Splitter:B:41:0x00af] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r14, int r15, int r16) {
        /*
            r13 = this;
            r8 = r13
            r0 = r14
            r9 = 3
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r10 = 0
            r1[r10] = r0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            r11 = 1
            r1[r11] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r12 = 2
            r1[r12] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f17623a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r12] = r2
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 13675(0x356b, float:1.9163E-41)
            r2 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0063
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r1[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f17623a
            r4 = 0
            r5 = 13675(0x356b, float:1.9163E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r11] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r12] = r0
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r13
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0063:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ad, all -> 0x00a5 }
            r2.<init>(r14)     // Catch:{ FileNotFoundException -> 0x00ad, all -> 0x00a5 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            r0.inJustDecodeBounds = r11     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            android.graphics.BitmapFactory.decodeStream(r2, r1, r0)     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            int r1 = r0.outWidth     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            r3 = r15
            if (r3 > r1) goto L_0x0097
            int r1 = r0.outHeight     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            r3 = r16
            if (r3 <= r1) goto L_0x007f
            goto L_0x0097
        L_0x007f:
            int r1 = r0.outWidth     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            int r0 = r0.outHeight     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            int r1 = r1 * r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 <= r0) goto L_0x0093
            r0 = 2131564202(0x7f0d16aa, float:1.8753883E38)
            r13.a((int) r0)     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            r2.close()     // Catch:{ IOException -> 0x0092 }
        L_0x0092:
            return r10
        L_0x0093:
            r2.close()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b2
        L_0x0097:
            r0 = 2131564203(0x7f0d16ab, float:1.8753885E38)
            r13.a((int) r0)     // Catch:{ FileNotFoundException -> 0x00a3, all -> 0x00a1 }
            r2.close()     // Catch:{ IOException -> 0x00a0 }
        L_0x00a0:
            return r10
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a3:
            r1 = r2
            goto L_0x00ad
        L_0x00a5:
            r0 = move-exception
            r2 = r1
        L_0x00a7:
            if (r2 == 0) goto L_0x00ac
            r2.close()     // Catch:{ IOException -> 0x00ac }
        L_0x00ac:
            throw r0
        L_0x00ad:
            if (r1 == 0) goto L_0x00b2
            r1.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.p.a(java.lang.String, int, int):boolean");
    }

    public p(Activity activity, Fragment fragment, String str, int i2, int i3, int i4, int i5, a aVar) {
        this.f17624b = activity;
        this.f17625c = fragment;
        this.f17627e = aVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.f17626d = Environment.getExternalStorageDirectory().getPath() + "/DCIM/Camera";
        this.g = str + ".data";
        if (this.f17624b == null && this.f17625c != null) {
            this.f17624b = this.f17625c.getActivity();
        }
        this.f17628f = this.f17624b.getResources();
    }
}
