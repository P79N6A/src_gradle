package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.ac.b;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 32\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J!\u0010\u001d\u001a\u00020\u001b2\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u0017\"\u00020\u001bH\u0002¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001bH\u0002J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\"\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010,2\u0014\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0017\u0018\u00010\u00102\b\u0010.\u001a\u0004\u0018\u00010/H\u0007J\u0018\u00100\u001a\u00020%2\b\u00101\u001a\u0004\u0018\u00010\u00042\u0006\u00102\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0017\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u00064"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/UploadFileFragment;", "Landroid/support/v4/app/Fragment;", "()V", "cameraFilePath", "", "getCameraFilePath", "()Ljava/lang/String;", "setCameraFilePath", "(Ljava/lang/String;)V", "caughtActivityNotFoundException", "", "getCaughtActivityNotFoundException", "()Z", "setCaughtActivityNotFoundException", "(Z)V", "uploadMessage", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "getUploadMessage", "()Landroid/webkit/ValueCallback;", "setUploadMessage", "(Landroid/webkit/ValueCallback;)V", "uploadMessages", "", "getUploadMessages", "setUploadMessages", "createCamcorderIntent", "Landroid/content/Intent;", "createCameraIntent", "createChooserIntent", "intents", "([Landroid/content/Intent;)Landroid/content/Intent;", "createDefaultOpenableIntent", "createOpenableIntent", "type", "createSoundRecorderIntent", "onActivityResult", "", "requestCode", "", "resultCode", "data", "onShowFileChooser", "webView", "Landroid/webkit/WebView;", "filePathCallback", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "pickFile", "acceptType", "capture", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UploadFileFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40960a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f40961f = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public ValueCallback<Uri> f40962b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public ValueCallback<Uri[]> f40963c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f40964d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f40965e;
    private HashMap g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/UploadFileFragment$Companion;", "", "()V", "AUDIO_MIME_TYPE", "", "IMAGE_MIME_TYPE", "MEDIA_SOURCE_KEY", "MEDIA_SOURCE_VALUE_CAMCORDER", "MEDIA_SOURCE_VALUE_CAMERA", "MEDIA_SOURCE_VALUE_FILESYSTEM", "MEDIA_SOURCE_VALUE_MICROPHONE", "MSG_PICK_FILE", "", "VIDEO_MIME_TYPE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "", "kotlin.jvm.PlatformType", "grantResults", "", "onRequestPermissionResult", "([Ljava/lang/String;[I)V"}, k = 3, mv = {1, 1, 15})
    static final class b implements b.C0400b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40966a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UploadFileFragment f40967b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ValueCallback f40968c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ WebChromeClient.FileChooserParams f40969d;

        b(UploadFileFragment uploadFileFragment, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            this.f40967b = uploadFileFragment;
            this.f40968c = valueCallback;
            this.f40969d = fileChooserParams;
        }

        public final void a(String[] strArr, int[] iArr) {
            boolean z;
            String str;
            if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f40966a, false, 34520, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f40966a, false, 34520, new Class[]{String[].class, int[].class}, Void.TYPE);
                return;
            }
            Intrinsics.checkExpressionValueIsNotNull(iArr, "grantResults");
            int length = iArr.length;
            int i = 0;
            while (i < length && iArr[i] == 0) {
                this.f40967b.f40963c = this.f40968c;
                UploadFileFragment uploadFileFragment = this.f40967b;
                String[] acceptTypes = this.f40969d.getAcceptTypes();
                Intrinsics.checkExpressionValueIsNotNull(acceptTypes, "fileChooserParams.acceptTypes");
                if (acceptTypes.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = this.f40969d.getAcceptTypes()[0];
                } else {
                    str = "";
                }
                uploadFileFragment.a(str, "");
                i++;
            }
        }
    }

    public final void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40960a, false, 34516, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40960a, false, 34516, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f40960a, false, 34518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40960a, false, 34518, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f40960a, false, 34517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40960a, false, 34517, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40960a, false, 34519, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40960a, false, 34519, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    private final Intent c() {
        if (!PatchProxy.isSupport(new Object[0], this, f40960a, false, 34512, new Class[0], Intent.class)) {
            return new Intent("android.media.action.VIDEO_CAPTURE");
        }
        return (Intent) PatchProxy.accessDispatch(new Object[0], this, f40960a, false, 34512, new Class[0], Intent.class);
    }

    private final Intent d() {
        if (!PatchProxy.isSupport(new Object[0], this, f40960a, false, 34513, new Class[0], Intent.class)) {
            return new Intent("android.provider.MediaStore.RECORD_SOUND");
        }
        return (Intent) PatchProxy.accessDispatch(new Object[0], this, f40960a, false, 34513, new Class[0], Intent.class);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f40960a, false, 34515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40960a, false, 34515, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.clear();
        }
    }

    private final Intent a() {
        if (PatchProxy.isSupport(new Object[0], this, f40960a, false, 34508, new Class[0], Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[0], this, f40960a, false, 34508, new Class[0], Intent.class);
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent a2 = a(b(), c(), d());
        a2.putExtra("android.intent.extra.INTENT", intent);
        return a2;
    }

    private final Intent b() {
        if (PatchProxy.isSupport(new Object[0], this, f40960a, false, 34511, new Class[0], Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[0], this, f40960a, false, 34511, new Class[0], Intent.class);
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkExpressionValueIsNotNull(externalStoragePublicDirectory, "externalDataDir");
        sb.append(externalStoragePublicDirectory.getAbsolutePath());
        sb.append(File.separator);
        sb.append("browser-photos");
        File file = new File(sb.toString());
        file.mkdirs();
        this.f40964d = file.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".jpg";
        Context context = getContext();
        String str = this.f40964d;
        if (str == null) {
            Intrinsics.throwNpe();
        }
        intent.putExtra("output", e.a(context, new File(str)));
        return intent;
    }

    private final Intent a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f40960a, false, 34510, new Class[]{String.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{str2}, this, f40960a, false, 34510, new Class[]{String.class}, Intent.class);
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private final Intent a(Intent... intentArr) {
        if (PatchProxy.isSupport(new Object[]{intentArr}, this, f40960a, false, 34509, new Class[]{Intent[].class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{intentArr}, this, f40960a, false, 34509, new Class[]{Intent[].class}, Intent.class);
        }
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) intentArr);
        return intent;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x01eb */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0127 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103 A[Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.lang.String r13, @org.jetbrains.annotations.NotNull java.lang.String r14) {
        /*
            r12 = this;
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r13
            r11 = 1
            r0[r11] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f40960a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34507(0x86cb, float:4.8355E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r13
            r0[r11] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f40960a
            r3 = 0
            r4 = 34507(0x86cb, float:4.8355E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            java.lang.String r0 = "capture"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
            r0 = 2048(0x800, float:2.87E-42)
            if (r13 != 0) goto L_0x004b
            java.lang.String r1 = ""
            goto L_0x004c
        L_0x004b:
            r1 = r13
        L_0x004c:
            java.lang.String r2 = "filesystem"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r3 = ";"
            kotlin.text.Regex r4 = new kotlin.text.Regex     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r4.<init>((java.lang.String) r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.util.List r1 = r4.split(r1, r10)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            boolean r3 = r1.isEmpty()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r3 != 0) goto L_0x008e
            int r3 = r1.size()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.util.ListIterator r3 = r1.listIterator(r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x0069:
            boolean r4 = r3.hasPrevious()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r3.previous()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            int r4 = r4.length()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r4 != 0) goto L_0x007f
            r4 = 1
            goto L_0x0080
        L_0x007f:
            r4 = 0
        L_0x0080:
            if (r4 != 0) goto L_0x0069
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            int r3 = r3.nextIndex()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            int r3 = r3 + r11
            java.util.List r1 = kotlin.collections.CollectionsKt.take(r1, r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            goto L_0x0092
        L_0x008e:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x0092:
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x01e2
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.Object[] r1 = r1.toArray(r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x01da
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r3 = r1[r10]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r4 = r14
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r4 != 0) goto L_0x00ac
            r2 = r14
        L_0x00ac:
            java.lang.String r4 = "filesystem"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r14, (java.lang.Object) r4)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r4 == 0) goto L_0x0130
            int r4 = r1.length     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r5 = r2
            r2 = 0
        L_0x00b7:
            if (r2 >= r4) goto L_0x012f
            r6 = r1[r2]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r7 = "="
            kotlin.text.Regex r8 = new kotlin.text.Regex     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r8.<init>((java.lang.String) r7)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.util.List r6 = r8.split(r6, r10)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            boolean r7 = r6.isEmpty()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r7 != 0) goto L_0x00fb
            int r7 = r6.size()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.util.ListIterator r7 = r6.listIterator(r7)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x00d6:
            boolean r8 = r7.hasPrevious()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r8 == 0) goto L_0x00fb
            java.lang.Object r8 = r7.previous()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            int r8 = r8.length()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r8 != 0) goto L_0x00ec
            r8 = 1
            goto L_0x00ed
        L_0x00ec:
            r8 = 0
        L_0x00ed:
            if (r8 != 0) goto L_0x00d6
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            int r7 = r7.nextIndex()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            int r7 = r7 + r11
            java.util.List r6 = kotlin.collections.CollectionsKt.take(r6, r7)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            goto L_0x00ff
        L_0x00fb:
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x00ff:
            java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r6 == 0) goto L_0x0127
            java.lang.String[] r7 = new java.lang.String[r10]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r6 == 0) goto L_0x011f
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            int r7 = r6.length     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r7 != r9) goto L_0x011c
            java.lang.String r7 = "capture"
            r8 = r6[r10]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r7 == 0) goto L_0x011c
            r5 = r6[r11]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x011c:
            int r2 = r2 + 1
            goto L_0x00b7
        L_0x011f:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
            r1.<init>(r2)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            throw r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x0127:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r2 = "null cannot be cast to non-null type java.util.Collection<T>"
            r1.<init>(r2)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            throw r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x012f:
            r2 = r5
        L_0x0130:
            r1 = 0
            r12.f40964d = r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r1 = "image/*"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x0168
            java.lang.String r1 = "camera"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x014b
            android.content.Intent r1 = r12.b()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r12.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            return
        L_0x014b:
            android.content.Intent[] r1 = new android.content.Intent[r11]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.content.Intent r2 = r12.b()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r1[r10] = r2     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.content.Intent r1 = r12.a((android.content.Intent[]) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r2 = "android.intent.extra.INTENT"
            java.lang.String r3 = "image/*"
            android.content.Intent r3 = r12.a((java.lang.String) r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.os.Parcelable r3 = (android.os.Parcelable) r3     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r1.putExtra(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r12.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            return
        L_0x0168:
            java.lang.String r1 = "video/*"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x019d
            java.lang.String r1 = "camcorder"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x0180
            android.content.Intent r1 = r12.c()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r12.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            return
        L_0x0180:
            android.content.Intent[] r1 = new android.content.Intent[r11]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.content.Intent r2 = r12.c()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r1[r10] = r2     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.content.Intent r1 = r12.a((android.content.Intent[]) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r2 = "android.intent.extra.INTENT"
            java.lang.String r3 = "video/*"
            android.content.Intent r3 = r12.a((java.lang.String) r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.os.Parcelable r3 = (android.os.Parcelable) r3     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r1.putExtra(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r12.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            return
        L_0x019d:
            java.lang.String r1 = "audio/*"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x01d2
            java.lang.String r1 = "microphone"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            if (r1 == 0) goto L_0x01b5
            android.content.Intent r1 = r12.d()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r12.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            return
        L_0x01b5:
            android.content.Intent[] r1 = new android.content.Intent[r11]     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.content.Intent r2 = r12.d()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r1[r10] = r2     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.content.Intent r1 = r12.a((android.content.Intent[]) r1)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r2 = "android.intent.extra.INTENT"
            java.lang.String r3 = "audio/*"
            android.content.Intent r3 = r12.a((java.lang.String) r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            android.os.Parcelable r3 = (android.os.Parcelable) r3     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r1.putExtra(r2, r3)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r12.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            return
        L_0x01d2:
            android.content.Intent r1 = r12.a()     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            r12.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            return
        L_0x01da:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
            r1.<init>(r2)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            throw r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x01e2:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            java.lang.String r2 = "null cannot be cast to non-null type java.util.Collection<T>"
            r1.<init>(r2)     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
            throw r1     // Catch:{ ActivityNotFoundException -> 0x01eb, Exception -> 0x01ea }
        L_0x01ea:
            return
        L_0x01eb:
            r12.f40965e = r11     // Catch:{ ActivityNotFoundException -> 0x01f5 }
            android.content.Intent r1 = r12.a()     // Catch:{ ActivityNotFoundException -> 0x01f5 }
            r12.startActivityForResult(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x01f5 }
            return
        L_0x01f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment.a(java.lang.String, java.lang.String):void");
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Uri uri;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f40960a, false, 34506, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f40960a, false, 34506, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i == 2048 && !(this.f40962b == null && this.f40963c == null)) {
            if (i3 != 0 || !this.f40965e) {
                if (intent == null || i3 != -1) {
                    uri = null;
                } else {
                    uri = intent.getData();
                }
                if (uri == null && intent == null && i3 == -1) {
                    String str = this.f40964d;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    File file = new File(str);
                    if (file.exists()) {
                        uri = Uri.fromFile(file);
                        Context context = getContext();
                        if (context != null) {
                            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                        }
                    }
                }
                if (this.f40962b != null) {
                    ValueCallback<Uri> valueCallback = this.f40962b;
                    if (valueCallback == null) {
                        Intrinsics.throwNpe();
                    }
                    valueCallback.onReceiveValue(uri);
                    this.f40962b = null;
                }
                if (this.f40963c != null) {
                    ValueCallback<Uri[]> valueCallback2 = this.f40963c;
                    if (valueCallback2 == null) {
                        Intrinsics.throwNpe();
                    }
                    valueCallback2.onReceiveValue(uri == null ? null : new Uri[]{uri});
                    this.f40963c = null;
                }
                this.f40965e = false;
            } else {
                this.f40965e = false;
            }
        }
    }
}
