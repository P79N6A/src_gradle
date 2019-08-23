package com.bytedance.android.livesdk.browser.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.android.monitor.webview.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.lang.ref.WeakReference;

public class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9286a;

    /* renamed from: b  reason: collision with root package name */
    public ValueCallback<Uri> f9287b;

    /* renamed from: c  reason: collision with root package name */
    public ValueCallback<Uri[]> f9288c;

    /* renamed from: d  reason: collision with root package name */
    public String f9289d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9290e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Fragment> f9291f;
    private WeakReference<Activity> g;

    /* access modifiers changed from: package-private */
    public Intent d() {
        if (!PatchProxy.isSupport(new Object[0], this, f9286a, false, 3410, new Class[0], Intent.class)) {
            return new Intent("android.media.action.VIDEO_CAPTURE");
        }
        return (Intent) PatchProxy.accessDispatch(new Object[0], this, f9286a, false, 3410, new Class[0], Intent.class);
    }

    /* access modifiers changed from: package-private */
    public Intent e() {
        if (!PatchProxy.isSupport(new Object[0], this, f9286a, false, 3411, new Class[0], Intent.class)) {
            return new Intent("android.provider.MediaStore.RECORD_SOUND");
        }
        return (Intent) PatchProxy.accessDispatch(new Object[0], this, f9286a, false, 3411, new Class[0], Intent.class);
    }

    public Context a() {
        if (PatchProxy.isSupport(new Object[0], this, f9286a, false, 3405, new Class[0], Context.class)) {
            return (Context) PatchProxy.accessDispatch(new Object[0], this, f9286a, false, 3405, new Class[0], Context.class);
        } else if (this.f9291f != null && this.f9291f.get() != null) {
            return ((Fragment) this.f9291f.get()).getActivity();
        } else {
            if (this.g == null || this.g.get() == null) {
                return null;
            }
            return (Context) this.g.get();
        }
    }

    /* access modifiers changed from: package-private */
    public Intent b() {
        if (PatchProxy.isSupport(new Object[0], this, f9286a, false, 3406, new Class[0], Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[0], this, f9286a, false, 3406, new Class[0], Intent.class);
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a2 = a(c(), d(), e());
        a2.putExtra("android.intent.extra.INTENT", intent);
        return a2;
    }

    public View getVideoLoadingProgressView() {
        if (PatchProxy.isSupport(new Object[0], this, f9286a, false, 3401, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f9286a, false, 3401, new Class[0], View.class);
        }
        Context a2 = a();
        if (a2 == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(a2);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(a2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    /* access modifiers changed from: package-private */
    public Intent c() {
        if (PatchProxy.isSupport(new Object[0], this, f9286a, false, 3409, new Class[0], Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[0], this, f9286a, false, 3409, new Class[0], Intent.class);
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        File file = new File(externalStoragePublicDirectory.getAbsolutePath() + File.separator + "browser-photos");
        file.mkdirs();
        this.f9289d = file.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg";
        intent.putExtra("output", Uri.fromFile(new File(this.f9289d)));
        return intent;
    }

    public b(Fragment fragment) {
        this.f9291f = new WeakReference<>(fragment);
    }

    /* access modifiers changed from: package-private */
    public Intent a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f9286a, false, 3408, new Class[]{String.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{str2}, this, f9286a, false, 3408, new Class[]{String.class}, Intent.class);
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent a(android.content.Intent... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f9286a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Intent[]> r3 = android.content.Intent[].class
            r7[r9] = r3
            java.lang.Class<android.content.Intent> r8 = android.content.Intent.class
            r5 = 0
            r6 = 3407(0xd4f, float:4.774E-42)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f9286a
            r13 = 0
            r14 = 3407(0xd4f, float:4.774E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Intent[]> r0 = android.content.Intent[].class
            r15[r9] = r0
            java.lang.Class<android.content.Intent> r16 = android.content.Intent.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            android.content.Intent r0 = (android.content.Intent) r0
            return r0
        L_0x0037:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.CHOOSER"
            r1.<init>(r2)
            java.lang.String r2 = "android.intent.extra.INITIAL_INTENTS"
            r1.putExtra(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.a.b.a(android.content.Intent[]):android.content.Intent");
    }

    /* access modifiers changed from: package-private */
    public void a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f9286a, false, 3404, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f9286a, false, 3404, new Class[]{Intent.class}, Void.TYPE);
        } else if (this.f9291f == null || this.f9291f.get() == null) {
            if (!(this.g == null || this.g.get() == null)) {
                ((Activity) this.g.get()).startActivityForResult(intent, 2048);
            }
        } else {
            ((Fragment) this.f9291f.get()).startActivityForResult(intent, 2048);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0095, code lost:
        if (r0 != null) goto L_0x00ac;
     */
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onShowFileChooser(android.webkit.WebView r15, android.webkit.ValueCallback<android.net.Uri[]> r16, android.webkit.WebChromeClient.FileChooserParams r17) {
        /*
            r14 = this;
            r7 = r14
            r9 = r16
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r15
            r12 = 1
            r0[r12] = r9
            r13 = 2
            r0[r13] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f9286a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r11] = r1
            java.lang.Class<android.webkit.ValueCallback> r1 = android.webkit.ValueCallback.class
            r5[r12] = r1
            java.lang.Class<android.webkit.WebChromeClient$FileChooserParams> r1 = android.webkit.WebChromeClient.FileChooserParams.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 3400(0xd48, float:4.764E-42)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0054
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r15
            r0[r12] = r9
            r0[r13] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f9286a
            r3 = 0
            r4 = 3400(0xd48, float:4.764E-42)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r11] = r1
            java.lang.Class<android.webkit.ValueCallback> r1 = android.webkit.ValueCallback.class
            r5[r12] = r1
            java.lang.Class<android.webkit.WebChromeClient$FileChooserParams> r1 = android.webkit.WebChromeClient.FileChooserParams.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0054:
            java.lang.String r0 = ""
            java.lang.String[] r1 = r17.getAcceptTypes()
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0063
            java.lang.String[] r0 = r17.getAcceptTypes()
            r0 = r0[r11]
        L_0x0063:
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f9286a
            r3 = 0
            r4 = 3399(0xd47, float:4.763E-42)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0089
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = f9286a
            r3 = 0
            r4 = 3399(0xd47, float:4.763E-42)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x00ac
        L_0x0089:
            java.lang.ref.WeakReference<android.app.Activity> r0 = r7.g
            if (r0 == 0) goto L_0x0098
            java.lang.ref.WeakReference<android.app.Activity> r0 = r7.g
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x0098
            goto L_0x00ac
        L_0x0098:
            java.lang.ref.WeakReference<android.support.v4.app.Fragment> r0 = r7.f9291f
            if (r0 == 0) goto L_0x00ab
            java.lang.ref.WeakReference<android.support.v4.app.Fragment> r0 = r7.f9291f
            java.lang.Object r0 = r0.get()
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            if (r0 == 0) goto L_0x00ab
            android.support.v4.app.FragmentActivity r0 = r0.getActivity()
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            com.bytedance.android.livesdk.m.f$b r0 = com.bytedance.android.livesdk.m.f.a(r0)
            com.bytedance.android.livesdk.browser.a.b$1 r1 = new com.bytedance.android.livesdk.browser.a.b$1
            r1.<init>(r9, r8)
            java.lang.String[] r2 = new java.lang.String[r10]
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r2[r11] = r3
            java.lang.String r3 = "android.permission.READ_EXTERNAL_STORAGE"
            r2[r12] = r3
            java.lang.String r3 = "android.permission.CAMERA"
            r2[r13] = r3
            r0.a(r1, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.a.b.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}
