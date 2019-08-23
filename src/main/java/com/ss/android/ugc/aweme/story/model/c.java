package com.ss.android.ugc.aweme.story.model;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.story.HorizontalFeeder;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.b;
import com.ss.android.ugc.aweme.story.model.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c extends a<d> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f73241c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f73242d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public List<Story> f73243e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f73244f = true;
    private Map<String, a> g = new HashMap();
    private int h = 3;
    private HorizontalFeeder i;

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f73241c, false, 84811, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f73241c, false, 84811, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(true, z, z2);
    }

    public final void a(boolean z, StoryResponse storyResponse) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), storyResponse}, this, f73241c, false, 84814, new Class[]{Boolean.TYPE, StoryResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), storyResponse}, this, f73241c, false, 84814, new Class[]{Boolean.TYPE, StoryResponse.class}, Void.TYPE);
            return;
        }
        if (!z) {
            this.f73242d.clear();
            this.f73243e.clear();
            String curUserId = d.a().getCurUserId();
            a aVar = this.g.get(curUserId);
            this.g.clear();
            if (aVar != null) {
                this.g.put(curUserId, aVar);
            }
        }
        a(storyResponse.getStoryFeed(), storyResponse.getRequestId());
    }

    public final int d() {
        if (!PatchProxy.isSupport(new Object[0], this, f73241c, false, 84808, new Class[0], Integer.TYPE)) {
            return this.f73242d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f73241c, false, 84808, new Class[0], Integer.TYPE)).intValue();
    }

    public final a a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f73241c, false, 84810, new Class[]{String.class}, a.class)) {
            return this.g.get(str2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f73241c, false, 84810, new Class[]{String.class}, a.class);
    }

    public final String a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f73241c, false, 84809, new Class[]{Integer.TYPE}, String.class)) {
            return this.f73242d.get(i2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f73241c, false, 84809, new Class[]{Integer.TYPE}, String.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0080, code lost:
        r2 = r1.length - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (r2 < 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        r1[r2].a(r10, r11);
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.story.model.d r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f73241c
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.story.model.d> r2 = com.ss.android.ugc.aweme.story.model.d.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 84813(0x14b4d, float:1.18848E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f73241c
            r4 = 0
            r5 = 84813(0x14b4d, float:1.18848E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.ugc.aweme.story.model.d> r0 = com.ss.android.ugc.aweme.story.model.d.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0032:
            r10.a()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.base.e.a.f34732a
            r4 = 0
            r5 = 25167(0x624f, float:3.5266E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0063
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.base.e.a.f34732a
            r4 = 0
            r5 = 25167(0x624f, float:3.5266E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0063:
            monitor-enter(r10)
            boolean r1 = r10.c()     // Catch:{ all -> 0x008d }
            if (r1 != 0) goto L_0x006c
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            return
        L_0x006c:
            java.util.ArrayList<com.ss.android.ugc.aweme.base.e.b<T>> r1 = r10.f34733b     // Catch:{ all -> 0x008d }
            java.util.ArrayList<com.ss.android.ugc.aweme.base.e.b<T>> r2 = r10.f34733b     // Catch:{ all -> 0x008d }
            int r2 = r2.size()     // Catch:{ all -> 0x008d }
            com.ss.android.ugc.aweme.base.e.b[] r2 = new com.ss.android.ugc.aweme.base.e.b[r2]     // Catch:{ all -> 0x008d }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x008d }
            com.ss.android.ugc.aweme.base.e.b[] r1 = (com.ss.android.ugc.aweme.base.e.b[]) r1     // Catch:{ all -> 0x008d }
            r10.b()     // Catch:{ all -> 0x008d }
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            int r2 = r1.length
            int r2 = r2 - r8
        L_0x0082:
            if (r2 < 0) goto L_0x008c
            r3 = r1[r2]
            r3.a(r10, r11)
            int r2 = r2 + -1
            goto L_0x0082
        L_0x008c:
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.model.c.a(com.ss.android.ugc.aweme.story.model.d):void");
    }

    private void a(List<Story> list, String str) {
        String uid;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, this, f73241c, false, 84815, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str2}, this, f73241c, false, 84815, new Class[]{List.class, String.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            for (Story next : list) {
                if (next != null && !next.isStory()) {
                    if ((!next.isLive() || com.ss.android.ugc.aweme.story.a.a()) && (!next.isNewLiveType() || AbTestManager.a().aH())) {
                        if (next.isFollowing() && b.a().b(next.getUid())) {
                            next.setRead();
                        }
                        if (next.isLive()) {
                            uid = next.getLiveUid();
                            this.f73243e.add(next);
                        } else {
                            uid = next.getUserInfo().getUid();
                        }
                        String str3 = uid;
                        StoryDetail storyDetail = null;
                        if (next.isFollowing() && next.getAwemes() != null) {
                            if (PatchProxy.isSupport(new Object[]{next, str2}, this, f73241c, false, 84816, new Class[]{Story.class, String.class}, StoryDetail.class)) {
                                storyDetail = (StoryDetail) PatchProxy.accessDispatch(new Object[]{next, str2}, this, f73241c, false, 84816, new Class[]{Story.class, String.class}, StoryDetail.class);
                            } else {
                                storyDetail = new StoryDetail();
                                storyDetail.setRequestId(str2);
                                List<Aweme> awemes = next.getAwemes();
                                int size = awemes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(awemes.get(i2));
                                    com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                                    a3.a(a2.getAid() + 8000, str2, i2);
                                    awemes.set(i2, a2);
                                }
                                storyDetail.setAwemeList(awemes);
                            }
                        }
                        this.f73242d.add(str3);
                        this.g.put(str3, new a(next, storyDetail));
                    }
                }
            }
        }
    }

    private void a(boolean z, final boolean z2, boolean z3) {
        boolean z4 = z2;
        int i2 = 2;
        if (PatchProxy.isSupport(new Object[]{(byte) 1, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f73241c, false, 84812, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1, Byte.valueOf(z2), Byte.valueOf(z3)}, this, f73241c, false, 84812, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!z4 || this.f73244f) {
            if (this.i == null) {
                if (z3) {
                    i2 = 1;
                }
                this.i = new HorizontalFeeder(i2);
            }
            if (z4) {
                this.i.a((com.ss.android.ugc.aweme.base.e.c<StoryResponse>) new com.ss.android.ugc.aweme.base.e.c<StoryResponse>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73245a;

                    public final void a(Exception exc) {
                        Exception exc2 = exc;
                        if (PatchProxy.isSupport(new Object[]{exc2}, this, f73245a, false, 84818, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc2}, this, f73245a, false, 84818, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        c.this.a(new d(9999, exc2));
                    }

                    public final /* synthetic */ void a(Object obj) {
                        boolean z;
                        StoryResponse storyResponse = (StoryResponse) obj;
                        if (PatchProxy.isSupport(new Object[]{storyResponse}, this, f73245a, false, 84817, new Class[]{StoryResponse.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{storyResponse}, this, f73245a, false, 84817, new Class[]{StoryResponse.class}, Void.TYPE);
                            return;
                        }
                        c.this.f73244f = storyResponse.hasMore;
                        int size = c.this.f73242d.size();
                        c.this.a(z2, storyResponse);
                        c cVar = c.this;
                        boolean z2 = z2;
                        boolean z3 = c.this.f73244f;
                        String str = storyResponse.requestId;
                        if (storyResponse.autoOpenWindow == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        d.a aVar = new d.a(z2, size, z3, str, z, true);
                        cVar.a(new d(1, aVar));
                    }
                });
            } else {
                this.i.a(true, new com.ss.android.ugc.aweme.base.e.c<com.ss.android.ugc.aweme.main.story.a>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73248a;

                    public final void a(Exception exc) {
                        Exception exc2 = exc;
                        if (PatchProxy.isSupport(new Object[]{exc2}, this, f73248a, false, 84820, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc2}, this, f73248a, false, 84820, new Class[]{Exception.class}, Void.TYPE);
                            return;
                        }
                        c.this.a(new d(9999, exc2));
                    }

                    public final /* synthetic */ void a(Object obj) {
                        int i;
                        boolean z;
                        com.ss.android.ugc.aweme.main.story.a aVar = (com.ss.android.ugc.aweme.main.story.a) obj;
                        if (PatchProxy.isSupport(new Object[]{aVar}, this, f73248a, false, 84819, new Class[]{com.ss.android.ugc.aweme.main.story.a.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{aVar}, this, f73248a, false, 84819, new Class[]{com.ss.android.ugc.aweme.main.story.a.class}, Void.TYPE);
                            return;
                        }
                        c cVar = c.this;
                        if (aVar.a()) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        cVar.a(new d(6, Integer.valueOf(i)));
                        c.this.a(new d(5, aVar.f54905c));
                        if (aVar.f54904b != null) {
                            StoryResponse storyResponse = aVar.f54904b;
                            c.this.f73244f = storyResponse.hasMore;
                            c.this.a(z2, storyResponse);
                            c cVar2 = c.this;
                            boolean z2 = z2;
                            boolean z3 = c.this.f73244f;
                            String str = storyResponse.requestId;
                            if (aVar.f54904b.autoOpenWindow == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            d.a aVar2 = new d.a(z2, 0, z3, str, z, aVar.a());
                            cVar2.a(new d(1, aVar2));
                        }
                    }
                });
            }
        }
    }
}
