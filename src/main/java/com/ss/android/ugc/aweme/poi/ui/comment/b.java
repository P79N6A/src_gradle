package com.ss.android.ugc.aweme.poi.ui.comment;

import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.a.f;
import com.ss.android.ugc.aweme.poi.model.o;
import com.ss.android.ugc.aweme.poi.model.q;
import java.util.ArrayList;
import java.util.List;

public class b extends com.ss.android.ugc.aweme.common.b<q, PoiCommentVH> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60613a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCommentListFragment f60614b;

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f60613a, false, 66279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60613a, false, 66279, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null && ((PoiCommentVH) this.f2979f).a()) {
            int i = ((q) this.f2978e).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((PoiCommentVH) this.f2979f).b(2);
                }
                return;
            }
            ((PoiCommentVH) this.f2979f).a(2);
        }
    }

    public final void b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f60613a, false, 66277, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60613a, false, 66277, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f2978e != null && this.f2979f != null && ((PoiCommentVH) this.f2979f).a()) {
            int i = ((q) this.f2978e).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    PoiCommentVH poiCommentVH = (PoiCommentVH) this.f2979f;
                    List<o> items = ((q) this.f2978e).getItems();
                    String a2 = ((q) this.f2978e).a();
                    if (!((q) this.f2978e).isHasMore() || ((q) this.f2978e).isNewDataEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z2 = z;
                    if (PatchProxy.isSupport(new Object[]{items, a2, Byte.valueOf(z ? (byte) 1 : 0)}, poiCommentVH, PoiCommentVH.f60594a, false, 66300, new Class[]{List.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                        PoiCommentVH poiCommentVH2 = poiCommentVH;
                        PatchProxy.accessDispatch(new Object[]{items, a2, Byte.valueOf(z2 ? (byte) 1 : 0)}, poiCommentVH2, PoiCommentVH.f60594a, false, 66300, new Class[]{List.class, String.class, Boolean.TYPE}, Void.TYPE);
                    } else if (poiCommentVH.a()) {
                        boolean z3 = z2;
                        poiCommentVH.g = z3;
                        if (poiCommentVH.f60597d != null) {
                            if (items == null) {
                                poiCommentVH.f60597d.setDataAfterLoadMore(null);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll(items);
                                if (!z3 && !StringUtils.isEmpty(a2)) {
                                    arrayList.add(new f(a2));
                                }
                                poiCommentVH.f60597d.setDataAfterLoadMore(arrayList);
                            }
                        }
                        poiCommentVH.a(z3);
                    }
                }
            } else if (((q) this.f2978e).isDataEmpty()) {
                ((PoiCommentVH) this.f2979f).a(3);
            } else {
                PoiCommentVH poiCommentVH3 = (PoiCommentVH) this.f2979f;
                List<o> items2 = ((q) this.f2978e).getItems();
                String a3 = ((q) this.f2978e).a();
                boolean isHasMore = ((q) this.f2978e).isHasMore();
                boolean z4 = isHasMore;
                if (PatchProxy.isSupport(new Object[]{items2, a3, Byte.valueOf(isHasMore ? (byte) 1 : 0)}, poiCommentVH3, PoiCommentVH.f60594a, false, 66297, new Class[]{List.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                    PoiCommentVH poiCommentVH4 = poiCommentVH3;
                    PatchProxy.accessDispatch(new Object[]{items2, a3, Byte.valueOf(z4 ? (byte) 1 : 0)}, poiCommentVH4, PoiCommentVH.f60594a, false, 66297, new Class[]{List.class, String.class, Boolean.TYPE}, Void.TYPE);
                } else {
                    if (poiCommentVH3.a()) {
                        poiCommentVH3.mStatusView.b();
                        if (!poiCommentVH3.f60599f) {
                            poiCommentVH3.f60599f = !Lists.isEmpty(items2);
                        }
                        boolean z5 = z4;
                        poiCommentVH3.g = z5;
                        if (poiCommentVH3.f60597d != null) {
                            if (items2 == null) {
                                poiCommentVH3.f60597d.setData(null);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(items2);
                                if (!z5 && !StringUtils.isEmpty(a3)) {
                                    arrayList2.add(new f(a3));
                                }
                                poiCommentVH3.f60597d.setData(arrayList2);
                            }
                        }
                        poiCommentVH3.a(z5);
                        if (2 < poiCommentVH3.f60597d.getItemCount()) {
                            poiCommentVH3.mRecyclerView.post(new Runnable() {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f60605a;

                                public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentVH.3.run():void, dex: classes5.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.poi.ui.comment.PoiCommentVH.3.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                }
            }
        }
    }

    public b(PoiCommentListFragment poiCommentListFragment) {
        this.f60614b = poiCommentListFragment;
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60613a, false, 66278, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60613a, false, 66278, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2978e != null && this.f2979f != null && ((PoiCommentVH) this.f2979f).a()) {
            int i = ((q) this.f2978e).mListQueryType;
            if (i != 1) {
                if (i == 4) {
                    ((PoiCommentVH) this.f2979f).b(1);
                }
                return;
            }
            ((PoiCommentVH) this.f2979f).a(1);
        }
    }
}
