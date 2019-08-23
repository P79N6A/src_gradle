package com.ss.android.ugc.aweme.web.jsbridge;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.sdk.c.b.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.freeflowcard.FreeFlowCardPhoto;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.bi;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class q extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76813a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f76814b = "q";

    /* renamed from: c  reason: collision with root package name */
    JSONObject f76815c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f76816d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.ies.f.a.a f76817e;

    interface a {
        void a();

        void b();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76813a, false, 89968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76813a, false, 89968, new Class[0], Void.TYPE);
            return;
        }
        a(this.f76815c, 0);
        a("downloadCardAD", this.f76815c);
    }

    public q(WeakReference<Context> weakReference, com.bytedance.ies.f.a.a aVar) {
        super(weakReference);
        this.f76817e = aVar;
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f76813a, false, 89971, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f76813a, false, 89971, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException unused) {
        }
        if (this.f76817e != null) {
            this.f76817e.b("H5_nativeEvent", jSONObject2);
        }
    }

    public final void a(JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, Integer.valueOf(i)}, this, f76813a, false, 89970, new Class[]{JSONObject.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2, Integer.valueOf(i)}, this, f76813a, false, 89970, new Class[]{JSONObject.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            jSONObject2.put("code", i);
        } catch (JSONException unused) {
        }
    }

    public void call(h hVar, JSONObject jSONObject) throws Exception {
        Context context;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76813a, false, 89964, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76813a, false, 89964, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        final String string = hVar.f20623d.getString("inviteCode");
        if (jSONObject != null) {
            this.f76815c = jSONObject;
        } else {
            this.f76815c = new JSONObject();
        }
        Activity activity = null;
        if (this.mContextRef != null) {
            context = (Context) this.mContextRef.get();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        this.f76816d = activity;
        if (this.f76816d == null) {
            a();
            return;
        }
        final AnonymousClass1 r7 = new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76818a;

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f76818a, false, 89973, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76818a, false, 89973, new Class[0], Void.TYPE);
                    return;
                }
                q qVar = q.this;
                if (PatchProxy.isSupport(new Object[0], qVar, q.f76813a, false, 89969, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], qVar, q.f76813a, false, 89969, new Class[0], Void.TYPE);
                    return;
                }
                qVar.a(qVar.f76815c, -1);
                qVar.a("downloadCardAD", qVar.f76815c);
            }

            public final void a() {
                Bitmap bitmap;
                if (PatchProxy.isSupport(new Object[0], this, f76818a, false, 89972, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76818a, false, 89972, new Class[0], Void.TYPE);
                    return;
                }
                q qVar = q.this;
                String str = string;
                if (PatchProxy.isSupport(new Object[]{str}, qVar, q.f76813a, false, 89966, new Class[]{String.class}, Void.TYPE)) {
                    Object[] objArr = {str};
                    q qVar2 = qVar;
                    PatchProxy.accessDispatch(objArr, qVar2, q.f76813a, false, 89966, new Class[]{String.class}, Void.TYPE);
                } else if (TextUtils.isEmpty(str)) {
                    qVar.a();
                } else {
                    FreeFlowCardPhoto freeFlowCardPhoto = new FreeFlowCardPhoto(qVar.f76816d, str);
                    AnonymousClass3 r1 = new FreeFlowCardPhoto.a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f76826a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f76826a, false, 89977, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f76826a, false, 89977, new Class[0], Void.TYPE);
                                return;
                            }
                            q.this.a();
                        }

                        public final void a(String str) {
                            String str2 = str;
                            if (PatchProxy.isSupport(new Object[]{str2}, this, f76826a, false, 89976, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str2}, this, f76826a, false, 89976, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                q qVar = q.this;
                                if (PatchProxy.isSupport(new Object[]{str2}, qVar, q.f76813a, false, 89967, new Class[]{String.class}, Void.TYPE)) {
                                    q qVar2 = qVar;
                                    PatchProxy.accessDispatch(new Object[]{str2}, qVar2, q.f76813a, false, 89967, new Class[]{String.class}, Void.TYPE);
                                } else {
                                    qVar.a(qVar.f76815c, 1);
                                    try {
                                        qVar.f76815c.put(PushConstants.WEB_URL, str2);
                                    } catch (Exception unused) {
                                    }
                                    qVar.a("downloadCardAD", qVar.f76815c);
                                }
                            } else {
                                q.this.a();
                            }
                        }
                    };
                    if (PatchProxy.isSupport(new Object[]{r1}, freeFlowCardPhoto, FreeFlowCardPhoto.f48531a, false, 46035, new Class[]{FreeFlowCardPhoto.a.class}, Void.TYPE)) {
                        FreeFlowCardPhoto freeFlowCardPhoto2 = freeFlowCardPhoto;
                        PatchProxy.accessDispatch(new Object[]{r1}, freeFlowCardPhoto2, FreeFlowCardPhoto.f48531a, false, 46035, new Class[]{FreeFlowCardPhoto.a.class}, Void.TYPE);
                        return;
                    }
                    View view = freeFlowCardPhoto.f48534c;
                    if (PatchProxy.isSupport(new Object[]{view}, null, FreeFlowCardPhoto.f48531a, true, 46034, new Class[]{View.class}, Bitmap.class)) {
                        bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{view}, null, FreeFlowCardPhoto.f48531a, true, 46034, new Class[]{View.class}, Bitmap.class);
                    } else if (view == null) {
                        bitmap = null;
                    } else {
                        view.measure(View.MeasureSpec.makeMeasureSpec(u.a(375.0d), 1073741824), View.MeasureSpec.makeMeasureSpec(u.a(667.0d), 1073741824));
                        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                        view.draw(new Canvas(createBitmap));
                        bitmap = createBitmap;
                    }
                    i.a((Callable<TResult>) new Callable<Void>(bitmap, r1) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f48535a;

                        /* renamed from: b */
                        final /* synthetic */ Bitmap f48536b;

                        /* renamed from: c */
                        final /* synthetic */ a f48537c;

                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public java.lang.Void call(
/*
Method generation error in method: com.ss.android.ugc.aweme.freeflowcard.FreeFlowCardPhoto.1.a():java.lang.Void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.freeflowcard.FreeFlowCardPhoto.1.a():java.lang.Void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            }
        };
        if (PatchProxy.isSupport(new Object[]{r7}, this, f76813a, false, 89965, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{r7}, this, f76813a, false, 89965, new Class[]{a.class}, Void.TYPE);
        } else if (ContextCompat.checkSelfPermission(this.f76816d, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            r7.a();
        } else {
            b.a(this.f76816d, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76821a;

                public final void a(String[] strArr, int[] iArr) {
                    if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f76821a, false, 89974, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f76821a, false, 89974, new Class[]{String[].class, int[].class}, Void.TYPE);
                        return;
                    }
                    if (iArr.length > 0) {
                        if (iArr[0] == -1) {
                            r7.b();
                            if (!ActivityCompat.shouldShowRequestPermissionRationale(q.this.f76816d, strArr[0])) {
                                bc.a(q.this.f76816d, C0906R.string.fs, C0906R.string.pm, null, C0906R.string.a0x, new DialogInterface.OnClickListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f76824a;

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76824a, false, 89975, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76824a, false, 89975, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                            return;
                                        }
                                        bi.a(q.this.f76816d);
                                    }
                                }).show();
                            }
                        } else {
                            r7.a();
                        }
                    }
                }
            });
        }
    }
}
