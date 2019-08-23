package com.ss.android.ugc.aweme.im.sdk.utils;

import a.g;
import a.i;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.d.j;
import com.ss.android.ugc.aweme.im.sdk.detail.a.f;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerMessage;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerMessageList;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerMsgSession;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerSessionList;
import com.ss.android.ugc.aweme.im.sdk.story.a.b;
import com.ss.android.ugc.aweme.im.sdk.story.d;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52611a;

    /* renamed from: b  reason: collision with root package name */
    public static ImApi f52612b;

    public static ImApi a() {
        return f52612b;
    }

    public static void a(Handler handler, CharSequence charSequence, String str, int i) {
        Handler handler2 = handler;
        final CharSequence charSequence2 = charSequence;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, charSequence2, str2, Integer.valueOf(i)}, null, f52611a, true, 53450, new Class[]{Handler.class, CharSequence.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, charSequence2, str2, Integer.valueOf(i)}, null, f52611a, true, 53450, new Class[]{Handler.class, CharSequence.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52613a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f52613a, false, 53477, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f52613a, false, 53477, new Class[0], Object.class);
                }
                try {
                    if (IMUser.isInvalidUser(charSequence2.toString())) {
                        return null;
                    }
                    return r.f52612b.queryUser(charSequence2.toString(), str2).get();
                } catch (ExecutionException e2) {
                    throw aj.a(e2);
                }
            }
        }, i);
    }

    public static void a(Handler handler, CharSequence charSequence, String str, int i, int i2) {
        Handler handler2 = handler;
        final CharSequence charSequence2 = charSequence;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, charSequence2, str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f52611a, true, 53453, new Class[]{Handler.class, CharSequence.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, charSequence2, str2, Integer.valueOf(i), Integer.valueOf(i2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52611a, true, 53453, new Class[]{Handler.class, CharSequence.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        final int i3 = i;
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52635a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f52635a, false, 53484, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f52635a, false, 53484, new Class[0], Object.class);
                }
                try {
                    return r.f52612b.block(charSequence2.toString(), str2, i3).get();
                } catch (ExecutionException e2) {
                    throw aj.a(e2);
                }
            }
        }, i2);
    }

    public static void a(Handler handler, long j, String str, int i) {
        Handler handler2 = handler;
        final long j2 = j;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, new Long(j2), str2, 0}, null, f52611a, true, 53456, new Class[]{Handler.class, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {handler2, new Long(j2), str2, 0};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f52611a, true, 53456, new Class[]{Handler.class, Long.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52616a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f52616a, false, 53488, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f52616a, false, 53488, new Class[0], Object.class);
                }
                try {
                    StrangerMessageList strangerMessageList = (StrangerMessageList) r.f52612b.fetchStrangerMsgList(j2, str2).get();
                    if (strangerMessageList != null) {
                        List<StrangerMessage> list = strangerMessageList.getmDatas();
                        if (PatchProxy.isSupport(new Object[]{list}, null, r.f52611a, true, 53457, new Class[]{List.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{list}, null, r.f52611a, true, 53457, new Class[]{List.class}, Void.TYPE);
                        } else if (list != null) {
                            if (!list.isEmpty()) {
                                for (StrangerMessage a2 : list) {
                                    r.a(a2);
                                }
                            }
                        }
                    }
                    return strangerMessageList;
                } catch (ExecutionException e2) {
                    throw aj.a(e2);
                }
            }
        }, 0);
    }

    private static void a(StrangerSessionList strangerSessionList) {
        if (PatchProxy.isSupport(new Object[]{strangerSessionList}, null, f52611a, true, 53459, new Class[]{StrangerSessionList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strangerSessionList}, null, f52611a, true, 53459, new Class[]{StrangerSessionList.class}, Void.TYPE);
        } else if (strangerSessionList != null) {
            List<StrangerMsgSession> lastMsg = strangerSessionList.getLastMsg();
            if (lastMsg != null && !lastMsg.isEmpty()) {
                for (StrangerMsgSession strangerMsgSession : lastMsg) {
                    if (strangerMsgSession != null) {
                        a(strangerMsgSession.getLastMsg());
                    }
                }
            }
        }
    }

    static void a(StrangerMessage strangerMessage) {
        if (PatchProxy.isSupport(new Object[]{strangerMessage}, null, f52611a, true, 53460, new Class[]{StrangerMessage.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strangerMessage}, null, f52611a, true, 53460, new Class[]{StrangerMessage.class}, Void.TYPE);
        } else if (strangerMessage != null) {
            IMUser toUser = strangerMessage.getToUser();
            IMUser fromUser = strangerMessage.getFromUser();
            j.f51270d.a(toUser);
            j.f51270d.a(fromUser);
        }
    }

    public static void a(String str, int i, a<c> aVar) {
        String str2 = str;
        int i2 = i;
        a<c> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), aVar2}, null, f52611a, true, 53465, new Class[]{String.class, Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), aVar2}, null, f52611a, true, 53465, new Class[]{String.class, Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        f52612b.searchEmojis(str2, i2).a((g<TResult, TContinuationResult>) new s<TResult,TContinuationResult>(aVar2, i2), i.f1052b);
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52611a, true, 53468, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f52611a, true, 53468, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f52612b.getStoryState(str2).a((g<TResult, TContinuationResult>) new g<b, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52628a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f52628a, false, 53479, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52628a, false, 53479, new Class[]{i.class}, Void.class);
                }
                if (!(iVar == null || !iVar.b() || iVar.e() == null)) {
                    List<com.ss.android.ugc.aweme.im.sdk.story.a.c> list = ((b) iVar.e()).f52421a;
                    if (PatchProxy.isSupport(new Object[]{list}, null, r.f52611a, true, 53472, new Class[]{List.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{list}, null, r.f52611a, true, 53472, new Class[]{List.class}, Void.TYPE);
                    } else if (list != null && list.size() > 0) {
                        for (com.ss.android.ugc.aweme.im.sdk.story.a.c next : list) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (!TextUtils.isEmpty(next.f52423b)) {
                                IMUser b2 = e.a().b(next.f52423b);
                                if (b2 != null) {
                                    String uid = b2.getUid();
                                    if (PatchProxy.isSupport(new Object[]{uid}, null, d.f52436a, true, 53294, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{uid}, null, d.f52436a, true, 53294, new Class[]{String.class}, Void.TYPE);
                                    } else {
                                        Intrinsics.checkParameterIsNotNull(uid, "uid");
                                        List<String> list2 = d.f52437b;
                                        if (list2 != null && list2.contains(uid)) {
                                            List<String> list3 = d.f52437b;
                                            if (list3 == null) {
                                                Intrinsics.throwNpe();
                                            }
                                            list3.remove(uid);
                                        }
                                    }
                                    b2.setCheckedUnreadStoryMillis(currentTimeMillis);
                                    boolean isHasUnreadStory = b2.isHasUnreadStory();
                                    b2.setHasUnreadStory(next.f52422a);
                                    e.a().a(b2, isHasUnreadStory);
                                }
                            }
                        }
                    }
                }
                return null;
            }
        }, (Executor) i.f1051a);
    }

    public static void a(int i, int i2, String str, g<com.ss.android.ugc.aweme.im.sdk.detail.a.d, Void> gVar) {
        String str2 = str;
        g<com.ss.android.ugc.aweme.im.sdk.detail.a.d, Void> gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{12, 2, str2, gVar2}, null, f52611a, true, 53469, new Class[]{Integer.TYPE, Integer.TYPE, String.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{12, 2, str2, gVar2}, null, f52611a, true, 53469, new Class[]{Integer.TYPE, Integer.TYPE, String.class, g.class}, Void.TYPE);
            return;
        }
        f52612b.getGroupShareInfo(12, 2, str2).a(gVar2, i.f1052b);
    }

    public static void a(String str, int i, String str2, g<f, Void> gVar) {
        String str3 = str;
        String str4 = str2;
        g<f, Void> gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4, gVar2}, null, f52611a, true, 53471, new Class[]{String.class, Integer.TYPE, String.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4, gVar2}, null, f52611a, true, 53471, new Class[]{String.class, Integer.TYPE, String.class, g.class}, Void.TYPE);
            return;
        }
        f52612b.groupShareVerification(str3, i, str4).a(gVar2, i.f1052b);
    }

    public static void a(com.ss.android.ugc.aweme.base.a<List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> aVar) {
        i<TResult> iVar;
        final com.ss.android.ugc.aweme.base.a<List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f52611a, true, 53473, new Class[]{com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f52611a, true, 53473, new Class[]{com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
            return;
        }
        List<i> asList = Arrays.asList(new i[]{f52612b.fetchGreetEmoji().a((g<TResult, TContinuationResult>) new g<com.ss.android.ugc.aweme.im.sdk.model.a, List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52629a;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> then(i<com.ss.android.ugc.aweme.im.sdk.model.a> iVar) {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f52629a, false, 53480, new Class[]{i.class}, List.class)) {
                    return (List) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52629a, false, 53480, new Class[]{i.class}, List.class);
                } else if (!iVar.b() || iVar.e() == null) {
                    return o.a().n();
                } else {
                    List<com.ss.android.ugc.aweme.im.sdk.resources.model.a> emojiList = ((com.ss.android.ugc.aweme.im.sdk.model.a) iVar.e()).getEmojiList();
                    if (emojiList != null && !emojiList.isEmpty()) {
                        o a2 = o.a();
                        if (PatchProxy.isSupport(new Object[]{emojiList}, a2, o.f52605a, false, 53449, new Class[]{List.class}, Void.TYPE)) {
                            o oVar = a2;
                            PatchProxy.accessDispatch(new Object[]{emojiList}, oVar, o.f52605a, false, 53449, new Class[]{List.class}, Void.TYPE);
                        } else if (!(emojiList == null || emojiList.size() == 0)) {
                            try {
                                HashSet hashSet = new HashSet();
                                for (int i = 0; i < emojiList.size(); i++) {
                                    hashSet.add(l.a(emojiList.get(i)));
                                }
                                a2.f52608b.edit().putStringSet("group_greet_msg", hashSet).commit();
                            } catch (Exception unused) {
                            }
                        }
                    }
                    return emojiList;
                }
            }
        }), i.a(1000).a((g<TResult, TContinuationResult>) new g<Void, List<com.ss.android.ugc.aweme.im.sdk.resources.model.a>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52630a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (!PatchProxy.isSupport(new Object[]{iVar}, this, f52630a, false, 53481, new Class[]{i.class}, List.class)) {
                    return o.a().n();
                }
                return (List) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52630a, false, 53481, new Class[]{i.class}, List.class);
            }
        })});
        if (asList.size() == 0) {
            iVar = i.a(null);
        } else {
            a.j jVar = new a.j();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (i a2 : asList) {
                a2.a((g<TResult, TContinuationResult>) new g<Object, Void>(atomicBoolean, jVar) {

                    /* renamed from: a */
                    final /* synthetic */ AtomicBoolean f1088a;

                    /* renamed from: b */
                    final /* synthetic */ j f1089b;

                    public final /* synthetic */ java.lang.Object then(
/*
Method generation error in method: a.i.8.then(a.i):java.lang.Object, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: a.i.8.then(a.i):java.lang.Object, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:232)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
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
            iVar = jVar.f1091a;
        }
        iVar.a((g<TResult, TContinuationResult>) new g<i<?>, Object>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52631a;

            public final Object then(i<i<?>> iVar) {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f52631a, false, 53482, new Class[]{i.class}, Object.class)) {
                    return PatchProxy.accessDispatch(new Object[]{iVar}, this, f52631a, false, 53482, new Class[]{i.class}, Object.class);
                }
                if (iVar.e() != null) {
                    try {
                        List list = (List) ((i) iVar.e()).e();
                        if (aVar2 != null) {
                            aVar2.run(list);
                        }
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
        }, i.f1052b);
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            f52612b = (ImApi) iRetrofitService.createNewRetrofit(g.f52586b).create(ImApi.class);
        }
    }

    public static i<Boolean> a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f52611a, true, 53467, new Class[]{Boolean.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f52611a, true, 53467, new Class[]{Boolean.TYPE}, i.class);
        }
        final boolean z2 = z;
        return i.b((Callable<TResult>) new Callable<Boolean>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52626a;

            public final /* synthetic */ Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f52626a, false, 53478, new Class[0], Boolean.class)) {
                    return Boolean.valueOf(z2);
                }
                return (Boolean) PatchProxy.accessDispatch(new Object[0], this, f52626a, false, 53478, new Class[0], Boolean.class);
            }
        });
    }

    public static void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f52611a, true, 53463, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f52611a, true, 53463, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f52612b.updateRCellState(i);
    }

    public static i<List<IMUser>> a(String str, g<com.ss.android.ugc.aweme.im.sdk.model.f, List<IMUser>> gVar) {
        String str2 = str;
        g<com.ss.android.ugc.aweme.im.sdk.model.f, List<IMUser>> gVar2 = gVar;
        if (!PatchProxy.isSupport(new Object[]{str2, gVar2}, null, f52611a, true, 53452, new Class[]{String.class, g.class}, i.class)) {
            return f52612b.fetchUserInfo(str2).a(gVar2, (Executor) i.f1051a);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str2, gVar2}, null, f52611a, true, 53452, new Class[]{String.class, g.class}, i.class);
    }

    public static i<Boolean> a(String str, n nVar) {
        String str2 = str;
        final n nVar2 = nVar;
        if (!PatchProxy.isSupport(new Object[]{str2, nVar2}, null, f52611a, true, 53466, new Class[]{String.class, n.class}, i.class)) {
            return f52612b.getStoryDetail(str2).b((g<TResult, i<TContinuationResult>>) new g<com.ss.android.ugc.aweme.im.sdk.story.a.a, i<Boolean>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52624a;

                public final /* synthetic */ Object then(i iVar) throws Exception {
                    if (PatchProxy.isSupport(new Object[]{iVar}, this, f52624a, false, 53492, new Class[]{i.class}, i.class)) {
                        return (i) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52624a, false, 53492, new Class[]{i.class}, i.class);
                    } else if (iVar == null || !iVar.b() || iVar.e() == null) {
                        nVar2.setTag(220224, "story_state_net_error");
                        return r.a(false);
                    } else {
                        nVar2.setTag(220224, "story_state_checked");
                        if (((com.ss.android.ugc.aweme.im.sdk.story.a.a) iVar.e()).f52420a != null) {
                            return r.a(false);
                        }
                        com.ss.android.ugc.aweme.im.sdk.story.c.a(nVar2);
                        return r.a(true);
                    }
                }
            });
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str2, nVar2}, null, f52611a, true, 53466, new Class[]{String.class, n.class}, i.class);
    }

    public static StrangerSessionList a(long j, long j2, boolean z) throws Exception {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), Byte.valueOf(z ? (byte) 1 : 0)}, null, f52611a, true, 53458, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, StrangerSessionList.class)) {
            return (StrangerSessionList) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), Byte.valueOf(z)}, null, f52611a, true, 53458, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, StrangerSessionList.class);
        }
        StrangerSessionList strangerSessionList = (StrangerSessionList) f52612b.fetchStrangerSessionList(j, j2, z).get();
        a(strangerSessionList);
        return strangerSessionList;
    }
}
