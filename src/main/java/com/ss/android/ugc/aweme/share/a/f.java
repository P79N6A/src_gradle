package com.ss.android.ugc.aweme.share.a;

import a.g;
import a.i;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.z;
import com.ss.android.medialib.qr.EnigmaScanner;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.qrcode.b;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64582a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f64583b = false;

    /* renamed from: c  reason: collision with root package name */
    static int f64584c = 2437;

    /* renamed from: d  reason: collision with root package name */
    static int f64585d = 3000;

    /* renamed from: e  reason: collision with root package name */
    static int f64586e = 1243;

    public interface a {
        void a(String str, int i);
    }

    public static void a(boolean z) {
        f64583b = z;
    }

    public static String b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f64582a, true, 73463, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2}, null, f64582a, true, 73463, new Class[]{Context.class}, String.class);
        }
        ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
        if (clipboardManager != null) {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (!(primaryClip == null || primaryClip.getItemAt(0) == null || primaryClip.getItemAt(0).getText() == null)) {
                return primaryClip.getItemAt(0).getText().toString();
            }
        }
        return "";
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f64582a, true, 73459, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f64582a, true, 73459, new Class[]{String.class}, String.class);
        }
        Matcher matcher = Pattern.compile("https?://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str2);
        if (!matcher.find()) {
            return "";
        }
        i a2 = i.a((Callable<TResult>) new g<TResult>(matcher.group()), (Executor) i.f1051a);
        try {
            a2.g();
            return (String) a2.e();
        } catch (InterruptedException unused) {
            return "";
        }
    }

    public static String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f64582a, true, 73464, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f64582a, true, 73464, new Class[]{String.class}, String.class);
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("accept", "*/*");
            httpURLConnection.setRequestProperty("connection", "Keep-Alive");
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection.getHeaderField("Location");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(String str) {
        Uri uri;
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f64582a, true, 73466, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f64582a, true, 73466, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            if (PatchProxy.isSupport(new Object[]{str2}, null, f64582a, true, 73467, new Class[]{String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f64582a, true, 73467, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (!str2.contains("microapp") && !str2.contains("microgame")) {
                z = false;
            }
            if (!z) {
                return str2;
            }
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("android_scheme");
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = parse.getQueryParameter("ios_scheme");
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return str2;
            }
            try {
                uri = Uri.parse(URLDecoder.decode(str2, "UTF8"));
            } catch (UnsupportedEncodingException unused) {
                uri = parse;
            }
            return queryParameter + "&app_id=" + uri.getQueryParameter("app_id") + "&token=" + uri.getQueryParameter("token") + "&channel=" + uri.getQueryParameter("channel") + "&iid=" + uri.getQueryParameter("iid");
        }
    }

    public static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f64582a, true, 73462, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f64582a, true, 73462, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        final ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
        if (clipboardManager != null) {
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64596a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f64596a, false, 73473, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f64596a, false, 73473, new Class[0], Void.TYPE);
                        return;
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
                }
            });
        }
    }

    public static String a(Context context, a aVar) {
        final Context context2 = context;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f64582a, true, 73460, new Class[]{Context.class, a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f64582a, true, 73460, new Class[]{Context.class, a.class}, String.class);
        } else if (ContextCompat.checkSelfPermission(context2, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return "";
        } else {
            i b2 = i.a((Callable<TResult>) new Callable<String>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64595a;

                /* access modifiers changed from: private */
                /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
                /* JADX WARNING: Removed duplicated region for block: B:30:0x0073  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.String call() throws java.lang.Exception {
                    /*
                        r10 = this;
                        r0 = 0
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r3 = f64595a
                        java.lang.Class[] r6 = new java.lang.Class[r0]
                        java.lang.Class<java.lang.String> r7 = java.lang.String.class
                        r4 = 0
                        r5 = 73472(0x11f00, float:1.02956E-40)
                        r2 = r10
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0028
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        com.meituan.robust.ChangeQuickRedirect r4 = f64595a
                        r5 = 0
                        r6 = 73472(0x11f00, float:1.02956E-40)
                        java.lang.Class[] r7 = new java.lang.Class[r0]
                        java.lang.Class<java.lang.String> r8 = java.lang.String.class
                        r3 = r10
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    L_0x0028:
                        r1 = 0
                        com.ss.android.ugc.aweme.app.k r2 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Exception -> 0x006e, all -> 0x0067 }
                        android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ Exception -> 0x006e, all -> 0x0067 }
                        android.net.Uri r4 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x006e, all -> 0x0067 }
                        r2 = 1
                        java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ Exception -> 0x006e, all -> 0x0067 }
                        java.lang.String r2 = "_data"
                        r5[r0] = r2     // Catch:{ Exception -> 0x006e, all -> 0x0067 }
                        r6 = 0
                        r7 = 0
                        java.lang.String r8 = "_id DESC"
                        android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x006e, all -> 0x0067 }
                        if (r0 == 0) goto L_0x005f
                        boolean r1 = r0.moveToFirst()     // Catch:{ Exception -> 0x006f, all -> 0x005a }
                        if (r1 == 0) goto L_0x005f
                        java.lang.String r1 = "_data"
                        int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ Exception -> 0x006f, all -> 0x005a }
                        java.lang.String r1 = r0.getString(r1)     // Catch:{ Exception -> 0x006f, all -> 0x005a }
                        if (r0 == 0) goto L_0x0059
                        r0.close()
                    L_0x0059:
                        return r1
                    L_0x005a:
                        r1 = move-exception
                        r9 = r1
                        r1 = r0
                        r0 = r9
                        goto L_0x0068
                    L_0x005f:
                        if (r0 == 0) goto L_0x0064
                        r0.close()
                    L_0x0064:
                        java.lang.String r0 = ""
                        return r0
                    L_0x0067:
                        r0 = move-exception
                    L_0x0068:
                        if (r1 == 0) goto L_0x006d
                        r1.close()
                    L_0x006d:
                        throw r0
                    L_0x006e:
                        r0 = r1
                    L_0x006f:
                        java.lang.String r1 = ""
                        if (r0 == 0) goto L_0x0076
                        r0.close()
                    L_0x0076:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.a.f.AnonymousClass2.call():java.lang.String");
                }
            }, (Executor) i.f1051a).b((g<TResult, i<TContinuationResult>>) new g<String, i<String>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64587a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    final i iVar2 = iVar;
                    if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f64587a, false, 73469, new Class[]{i.class}, i.class)) {
                        return i.a((Callable<TResult>) new Callable<String>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f64590a;

                            public final /* synthetic */ Object call() throws Exception {
                                boolean z;
                                if (PatchProxy.isSupport(new Object[0], this, f64590a, false, 73470, new Class[0], String.class)) {
                                    return (String) PatchProxy.accessDispatch(new Object[0], this, f64590a, false, 73470, new Class[0], String.class);
                                }
                                if (!TextUtils.isEmpty((CharSequence) iVar2.e())) {
                                    Context context = context2;
                                    String str = (String) iVar2.e();
                                    if (PatchProxy.isSupport(new Object[]{context, str}, null, f.f64582a, true, 73456, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, null, f.f64582a, true, 73456, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                                    } else {
                                        File file = new File(str);
                                        if (file.exists() && System.currentTimeMillis() - file.lastModified() <= 1800000) {
                                            BitmapFactory.Options options = new BitmapFactory.Options();
                                            options.inJustDecodeBounds = true;
                                            BitmapFactory.decodeFile(str, options);
                                            if (!com.ss.android.g.a.c() ? !(options.outHeight > f.f64584c || options.outWidth > f.f64586e) : !(options.outHeight > f.f64585d || options.outWidth > f.f64586e)) {
                                                String string = c.a(context.getApplicationContext(), "share_command", 0).getString("img_command_list", null);
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                if (!TextUtils.isEmpty(string)) {
                                                    linkedHashSet.addAll(Arrays.asList(string.split(",")));
                                                }
                                                if (!linkedHashSet.contains(str)) {
                                                    z = false;
                                                }
                                            }
                                        }
                                        z = true;
                                    }
                                    if (!z) {
                                        f.b(context2, (String) iVar2.e());
                                        b bVar = new b();
                                        String str2 = (String) iVar2.e();
                                        AnonymousClass1 r4 = new b.a() {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f64593a;

                                            public final void a(int i, String str) {
                                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f64593a, false, 73471, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f64593a, false, 73471, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                                                    return;
                                                }
                                                String c2 = f.c(f.a(str));
                                                if (!TextUtils.isEmpty(c2)) {
                                                    if (TextUtils.equals(z.b(), Uri.parse(c2).getQueryParameter("iid"))) {
                                                        c2 = "";
                                                    }
                                                } else {
                                                    c2 = "";
                                                }
                                                if (aVar2 != null) {
                                                    aVar2.a(c2, i);
                                                }
                                            }
                                        };
                                        if (PatchProxy.isSupport(new Object[]{str2, r4}, bVar, b.f63342a, false, 70348, new Class[]{String.class, b.a.class}, Void.TYPE)) {
                                            b bVar2 = bVar;
                                            PatchProxy.accessDispatch(new Object[]{str2, r4}, bVar2, b.f63342a, false, 70348, new Class[]{String.class, b.a.class}, Void.TYPE);
                                        } else {
                                            if (bVar.f63343b == null) {
                                                bVar.f63343b = new EnigmaScanner();
                                                bVar.f63343b.setListener(new EnigmaScanner.a(r4) {

                                                    /* renamed from: a */
                                                    public static ChangeQuickRedirect f63344a;

                                                    /* renamed from: b */
                                                    final /* synthetic */ a f63345b;

                                                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.qrcode.b.1.a(com.ss.android.medialib.model.EnigmaResult):void, dex: classes5.dex
                                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.qrcode.b.1.a(com.ss.android.medialib.model.EnigmaResult):void, class status: UNLOADED
                                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:301)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                                    
*/

                                                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.qrcode.b.1.a(int, int):void, dex: classes5.dex
                                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.qrcode.b.1.a(int, int):void, class status: UNLOADED
                                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:301)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                                    
*/
                                                });
                                            }
                                            ScanSettings scanSettings = new ScanSettings();
                                            scanSettings.width = 1280;
                                            scanSettings.height = 720;
                                            scanSettings.buildChainFlag = 1;
                                            bVar.f63343b.startScan(str2, scanSettings, 1000);
                                        }
                                        return null;
                                    }
                                }
                                if (aVar2 != null) {
                                    aVar2.a("", 0);
                                }
                                return "";
                            }
                        }, (Executor) i.f1051a);
                    }
                    return (i) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f64587a, false, 73469, new Class[]{i.class}, i.class);
                }
            });
            try {
                b2.g();
                return (String) b2.e();
            } catch (InterruptedException unused) {
                return "";
            }
        }
    }

    public static void b(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f64582a, true, 73457, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, null, f64582a, true, 73457, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        SharedPreferences a2 = c.a(context.getApplicationContext(), "share_command", 0);
        String string = a2.getString("img_command_list", null);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!TextUtils.isEmpty(string)) {
            linkedHashSet.addAll(Arrays.asList(string.split(",")));
        }
        if (linkedHashSet.size() >= 5) {
            Iterator it2 = linkedHashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str3 = (String) it2.next();
                if (str3 != null) {
                    linkedHashSet.remove(str3);
                    break;
                }
            }
        }
        linkedHashSet.add(str2);
        StringBuilder sb = new StringBuilder();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            sb.append(",");
        }
        a2.edit().putString("img_command_list", sb.toString()).apply();
    }

    public static void a(Context context, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, str2}, null, f64582a, true, 73455, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str2}, null, f64582a, true, 73455, new Class[]{Context.class, String.class}, Void.TYPE);
        } else if (context != null && context.getApplicationContext() != null) {
            c.a(context.getApplicationContext(), "share_command", 0).edit().putString("command", str2).apply();
        }
    }
}
