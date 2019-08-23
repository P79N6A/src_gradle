package com.ss.android.ugc.aweme.im.sdk.chat.input.photo;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableImage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity;
import com.ss.android.ugc.aweme.im.sdk.utils.u;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50835a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoDetailActivity f50836b;

    /* renamed from: c  reason: collision with root package name */
    private final UrlModel f50837c;

    d(PhotoDetailActivity photoDetailActivity, UrlModel urlModel) {
        this.f50836b = photoDetailActivity;
        this.f50837c = urlModel;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f50835a, false, 50981, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f50835a, false, 50981, new Class[0], Object.class);
        }
        PhotoDetailActivity photoDetailActivity = this.f50836b;
        UrlModel urlModel = this.f50837c;
        PhotoDetailActivity.AnonymousClass1 r2 = new u.a() {

            /* renamed from: a */
            public static ChangeQuickRedirect f50750a;

            public final void b(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity.1.b():void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity.1.b():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
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
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity.1.a():void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity.1.a():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
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
        };
        if (PatchProxy.isSupport(new Object[]{urlModel, r2}, null, u.f52648a, true, 53496, new Class[]{UrlModel.class, u.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel, r2}, null, u.f52648a, true, 53496, new Class[]{UrlModel.class, u.a.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(urlModel.getUrlList())) {
            c.a(urlModel, (c.a) new c.a(urlModel, r2) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52650a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ UrlModel f52651b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f52652c;

                public final void a(Exception exc) {
                    if (PatchProxy.isSupport(new Object[]{exc}, this, f52650a, false, 53498, new Class[]{Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{exc}, this, f52650a, false, 53498, new Class[]{Exception.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52657a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f52657a, false, 53501, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f52657a, false, 53501, new Class[0], Void.TYPE);
                                return;
                            }
                            if (AnonymousClass1.this.f52652c != null) {
                                AnonymousClass1.this.f52652c.b();
                            }
                        }
                    });
                }

                public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                    if (PatchProxy.isSupport(new Object[]{dataSource}, this, f52650a, false, 53497, new Class[]{DataSource.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dataSource}, this, f52650a, false, 53497, new Class[]{DataSource.class}, Void.TYPE);
                        return;
                    }
                    String a2 = c.a(this.f52651b);
                    if (!StringUtils.isEmpty(a2)) {
                        u.a(c.a(GlobalContext.getContext(), a2));
                        com.ss.android.b.a.a.a.b(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f52653a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f52653a, false, 53499, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f52653a, false, 53499, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (AnonymousClass1.this.f52652c != null) {
                                    AnonymousClass1.this.f52652c.a();
                                }
                            }
                        });
                        return;
                    }
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52655a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f52655a, false, 53500, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f52655a, false, 53500, new Class[0], Void.TYPE);
                                return;
                            }
                            if (AnonymousClass1.this.f52652c != null) {
                                AnonymousClass1.this.f52652c.b();
                            }
                        }
                    });
                }

                {
                    this.f52651b = r1;
                    this.f52652c = r2;
                }
            });
        } else if (TextUtils.isEmpty(urlModel.getUri())) {
            r2.b();
        } else if (u.a(Uri.parse(urlModel.getUri()).getPath())) {
            r2.a();
        } else {
            r2.b();
        }
        return null;
    }
}
