package com.ss.android.sdk.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.a;
import java.io.File;
import java.lang.ref.WeakReference;

public class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Fragment> f30672a;

    /* renamed from: b  reason: collision with root package name */
    public ValueCallback<Uri> f30673b;

    /* renamed from: c  reason: collision with root package name */
    public ValueCallback<Uri[]> f30674c;

    /* renamed from: d  reason: collision with root package name */
    public String f30675d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30676e;
    private WeakReference<Activity> g;

    private static Intent d() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    private static Intent e() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    private Intent b() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a2 = a(c(), d(), e());
        a2.putExtra("android.intent.extra.INTENT", intent);
        return a2;
    }

    public View getVideoLoadingProgressView() {
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

    private Intent c() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        File file = new File(externalStoragePublicDirectory.getAbsolutePath() + File.separator + "browser-photos");
        file.mkdirs();
        this.f30675d = file.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg";
        intent.putExtra("output", com.ss.android.newmedia.e.a(a(), new File(this.f30675d)));
        return intent;
    }

    public Context a() {
        if (this.f30672a != null && this.f30672a.get() != null) {
            return ((Fragment) this.f30672a.get()).getActivity();
        }
        if (this.g == null || this.g.get() == null) {
            return null;
        }
        return (Context) this.g.get();
    }

    public e(Fragment fragment) {
        this.f30672a = new WeakReference<>(fragment);
    }

    private static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        return intent;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        this.f30673b = valueCallback;
        a("", "");
    }

    private static Intent a(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    private void a(Intent intent) {
        if (this.f30672a == null || this.f30672a.get() == null) {
            if (!(this.g == null || this.g.get() == null)) {
                ((Activity) this.g.get()).startActivityForResult(intent, 2048);
            }
            return;
        }
        ((Fragment) this.f30672a.get()).startActivityForResult(intent, 2048);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        this.f30673b = valueCallback;
        a(str, "");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00e4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != 0) goto L_0x0005
            java.lang.String r9 = ""
        L_0x0005:
            java.lang.String r1 = "filesystem"
            java.lang.String r2 = ";"
            java.lang.String[] r9 = r9.split(r2)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r2 = 0
            r3 = r9[r2]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            boolean r4 = android.text.TextUtils.isEmpty(r10)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r4 != 0) goto L_0x0017
            r1 = r10
        L_0x0017:
            java.lang.String r4 = "filesystem"
            boolean r10 = r10.equals(r4)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r10 == 0) goto L_0x0040
            int r10 = r9.length     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r4 = r1
            r1 = 0
        L_0x0022:
            if (r1 >= r10) goto L_0x003f
            r5 = r9[r1]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r6 = "="
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            int r6 = r5.length     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r7 = 2
            if (r6 != r7) goto L_0x003c
            java.lang.String r6 = "capture"
            r7 = r5[r2]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            boolean r6 = r6.equals(r7)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r6 == 0) goto L_0x003c
            r4 = r5[r0]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
        L_0x003c:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x003f:
            r1 = r4
        L_0x0040:
            r9 = 0
            r8.f30675d = r9     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r9 = "image/*"
            boolean r9 = r3.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x0076
            java.lang.String r9 = "camera"
            boolean r9 = r1.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x005b
            android.content.Intent r9 = r8.c()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.a((android.content.Intent) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x005b:
            android.content.Intent[] r9 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r10 = r8.c()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9[r2] = r10     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r9 = a((android.content.Intent[]) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r10 = "android.intent.extra.INTENT"
            java.lang.String r1 = "image/*"
            android.content.Intent r1 = a((java.lang.String) r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9.putExtra(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.a((android.content.Intent) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x0076:
            java.lang.String r9 = "video/*"
            boolean r9 = r3.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x00a9
            java.lang.String r9 = "camcorder"
            boolean r9 = r1.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x008e
            android.content.Intent r9 = d()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.a((android.content.Intent) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x008e:
            android.content.Intent[] r9 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r10 = d()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9[r2] = r10     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r9 = a((android.content.Intent[]) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r10 = "android.intent.extra.INTENT"
            java.lang.String r1 = "video/*"
            android.content.Intent r1 = a((java.lang.String) r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9.putExtra(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.a((android.content.Intent) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x00a9:
            java.lang.String r9 = "audio/*"
            boolean r9 = r3.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x00dc
            java.lang.String r9 = "microphone"
            boolean r9 = r1.equals(r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            if (r9 == 0) goto L_0x00c1
            android.content.Intent r9 = e()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.a((android.content.Intent) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x00c1:
            android.content.Intent[] r9 = new android.content.Intent[r0]     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r10 = e()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9[r2] = r10     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            android.content.Intent r9 = a((android.content.Intent[]) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            java.lang.String r10 = "android.intent.extra.INTENT"
            java.lang.String r1 = "audio/*"
            android.content.Intent r1 = a((java.lang.String) r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r9.putExtra(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.a((android.content.Intent) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x00dc:
            android.content.Intent r9 = r8.b()     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            r8.a((android.content.Intent) r9)     // Catch:{ ActivityNotFoundException -> 0x00e4, Exception -> 0x00ed }
            return
        L_0x00e4:
            r8.f30676e = r0     // Catch:{ ActivityNotFoundException -> 0x00ee }
            android.content.Intent r9 = r8.b()     // Catch:{ ActivityNotFoundException -> 0x00ee }
            r8.a((android.content.Intent) r9)     // Catch:{ ActivityNotFoundException -> 0x00ee }
        L_0x00ed:
            return
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.app.e.a(java.lang.String, java.lang.String):void");
    }

    @TargetApi(21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String str;
        if (fileChooserParams == null) {
            return false;
        }
        this.f30674c = valueCallback;
        if (fileChooserParams.getAcceptTypes().length > 0) {
            str = fileChooserParams.getAcceptTypes()[0];
        } else {
            str = "";
        }
        a(str, "");
        return true;
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        this.f30673b = valueCallback;
        a(str, str2);
    }
}
