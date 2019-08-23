package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.symphony.c;
import com.ss.android.ugc.aweme.feed.c.m;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.live.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FeedPagerAdapter extends MultiTypePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private static final String f44712a = "FeedPagerAdapter";

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<Long, Long> f44713f = new HashMap<>();
    public static ChangeQuickRedirect g;
    private static long q = 0;

    /* renamed from: b  reason: collision with root package name */
    private aa<ar> f44714b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f44715c;

    /* renamed from: d  reason: collision with root package name */
    private final View.OnTouchListener f44716d;

    /* renamed from: e  reason: collision with root package name */
    private BaseFeedPageParams f44717e;
    public List<Aweme> h = new ArrayList();
    public boolean i;
    public m j;
    public long k;
    private int r = -1;

    private static int b(int i2) {
        if (i2 == 2) {
            return 1;
        }
        return i2 == 101 ? 2 : 0;
    }

    public void a(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, g, false, 40479, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, g, false, 40479, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.h.clear();
        if (!CollectionUtils.isEmpty(list)) {
            this.h.addAll(list);
        }
        notifyDataSetChanged();
    }

    public VideoViewHolder a(View view, aa<ar> aaVar, View.OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, g, false, 40484, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class)) {
            return (VideoViewHolder) PatchProxy.accessDispatch(new Object[]{view, aaVar, onTouchListener, fragment, baseFeedPageParams}, this, g, false, 40484, new Class[]{View.class, aa.class, View.OnTouchListener.class, Fragment.class, BaseFeedPageParams.class}, VideoViewHolder.class);
        }
        VideoViewHolder videoViewHolder = new VideoViewHolder(view, aaVar, onTouchListener, fragment, baseFeedPageParams, this.j);
        return videoViewHolder;
    }

    public FeedImageViewHolder a(int i2, View view, aa<ar> aaVar, String str, View.OnTouchListener onTouchListener, Fragment fragment, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i3)}, this, g, false, 40485, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class)) {
            return (FeedImageViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), view, aaVar, str, onTouchListener, fragment, Integer.valueOf(i3)}, this, g, false, 40485, new Class[]{Integer.TYPE, View.class, aa.class, String.class, View.OnTouchListener.class, Fragment.class, Integer.TYPE}, FeedImageViewHolder.class);
        }
        FeedImageViewHolder feedImageViewHolder = new FeedImageViewHolder(i2, view, aaVar, str, onTouchListener, fragment, i3);
        return feedImageViewHolder;
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 40491, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 40491, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((MainPageExperimentHelper.d() || !"homepage_follow".equalsIgnoreCase(this.f44717e.eventType)) && (!e.e() || !"homepage_fresh".equalsIgnoreCase(this.f44717e.eventType))) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(List<Aweme> list, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i2)}, this, g, false, 40504, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i2)}, this, g, false, 40504, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (CollectionUtils.isEmpty(list) || i3 < 0 || i3 >= list.size() || i3 > getCount()) {
        } else {
            this.h.add(i3, list.get(i2));
            notifyDataSetChanged();
        }
    }

    public final void a(int i2, boolean z) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, g, false, 40508, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, g, false, 40508, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (a.a()) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 40510, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 40510, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                if (!CollectionUtils.isEmpty(this.h) && i3 >= 0 && i3 < this.h.size() && i3 != this.r) {
                    this.r = i3;
                    Aweme aweme = this.h.get(i3);
                    if (aweme != null) {
                        User author = aweme.getAuthor();
                        if (author != null && author.isLive() && com.ss.android.ugc.aweme.story.a.a()) {
                            if (TextUtils.equals(c(), "homepage_hot")) {
                                b.c(this.o, 0, author.getRequestId(), author.getUid(), author.roomId);
                                b.a(author.getUid(), author.roomId, "homepage_hot", "video_head", author.getRequestId(), -1, true, aweme.getAid());
                            } else if (TextUtils.equals(c(), "homepage_follow")) {
                                b.b(this.o, 0, author.getRequestId(), author.getUid(), author.roomId);
                            } else {
                                b.a(this.o, 0, c(), author.getRequestId(), author.getUid(), author.roomId);
                            }
                            b.a(author.getUid(), author.roomId, c(), aweme.getRequestId(), -1, -1, false, aweme.getAid(), "video_head");
                        }
                    }
                }
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, g, false, 40509, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, g, false, 40509, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            } else if (!CollectionUtils.isEmpty(this.h) && i3 >= 0 && i3 < this.h.size()) {
                Aweme aweme2 = this.h.get(i3);
                if (aweme2 != null) {
                    User author2 = aweme2.getAuthor();
                    if (author2 != null && author2.isLive() && com.ss.android.ugc.aweme.story.a.a()) {
                        if (TextUtils.equals(c(), "homepage_hot")) {
                            b.c(this.o, 0, aweme2.getRequestId(), author2.getUid(), author2.roomId);
                            b.a(author2.getUid(), author2.roomId, "homepage_hot", "video_head", aweme2.getRequestId(), -1, false, aweme2.getAid());
                        } else if (TextUtils.equals(c(), "homepage_follow")) {
                            b.b(this.o, 0, aweme2.getRequestId(), author2.getUid(), author2.roomId);
                            if (!aweme2.isLive()) {
                                b.a(author2.getUid(), author2.roomId, "homepage_follow", aweme2.getRequestId(), -1, -1, false, aweme2.getAid(), "video_head", z ? "draw" : "click");
                            }
                        } else if (!TextUtils.equals(c(), "homepage_fresh")) {
                            b.a(this.o, 0, c(), aweme2.getRequestId(), author2.getUid(), author2.roomId);
                            b.a(author2.getUid(), author2.roomId, c(), aweme2.getRequestId(), -1, -1, false, aweme2.getAid(), "video_head");
                        }
                    }
                }
            }
        }
    }

    private int b() {
        return this.f44717e.awemeFromPage;
    }

    private String c() {
        return this.f44717e.eventType;
    }

    private int d() {
        return this.f44717e.pageType;
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 40489, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 40489, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (AbTestManager.a().bl().intValue() == 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, g, false, 40490, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, g, false, 40490, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (AbTestManager.a().bl().intValue() == 2) {
            z = true;
        }
        return z;
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 40497, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, g, false, 40497, new Class[0], Integer.TYPE)).intValue();
        } else if (this.h == null) {
            return 0;
        } else {
            return this.h.size();
        }
    }

    public void notifyDataSetChanged() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 40499, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 40499, new Class[0], Void.TYPE);
            return;
        }
        super.notifyDataSetChanged();
    }

    public static void a(long j2) {
        q = j2;
    }

    public static boolean b(long j2) {
        if (q == j2) {
            return true;
        }
        return false;
    }

    public final void b(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, g, false, 40481, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, g, false, 40481, new Class[]{View.class}, Void.TYPE);
        } else if (view2 != null && (view2 instanceof IFeedViewHolder)) {
            ((IFeedViewHolder) view2.getTag(C0906R.id.acv)).s();
        }
    }

    public final Aweme c(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 40495, new Class[]{Integer.TYPE}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 40495, new Class[]{Integer.TYPE}, Aweme.class);
        } else if (i3 >= 0 && i3 < getCount()) {
            return this.h.get(i3);
        } else {
            return null;
        }
    }

    public Aweme d(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 40496, new Class[]{Integer.TYPE}, Aweme.class)) {
            return c(i2);
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 40496, new Class[]{Integer.TYPE}, Aweme.class);
    }

    public void e(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 40501, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 40501, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i3 < 0 || i3 >= getCount()) {
        } else {
            this.h.remove(i3);
            notifyDataSetChanged();
        }
    }

    public int getItemPosition(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, g, false, 40498, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, g, false, 40498, new Class[]{Object.class}, Integer.TYPE)).intValue();
        }
        IFeedViewHolder iFeedViewHolder = (IFeedViewHolder) ((View) obj).getTag(C0906R.id.acv);
        int count = getCount();
        for (int i2 = 0; i2 < count; i2++) {
            Aweme aweme = this.h.get(i2);
            if (iFeedViewHolder != null && StringUtils.equal(aweme.getAid(), iFeedViewHolder.d().getAid())) {
                return i2;
            }
        }
        return -2;
    }

    public final int a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 40493, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 40493, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Aweme c2 = c(i2);
        if (c.a().b(this.o, c2)) {
            return 3;
        }
        if (c2 != null) {
            return a(c2);
        }
        return 0;
    }

    public final void c(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, g, false, 40506, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, g, false, 40506, new Class[]{View.class}, Void.TYPE);
            return;
        }
        IFeedViewHolder iFeedViewHolder = (IFeedViewHolder) view2.getTag(C0906R.id.acv);
        if (iFeedViewHolder != null) {
            iFeedViewHolder.f();
        }
    }

    public final int a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, g, false, 40505, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view2}, this, g, false, 40505, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else if (view2 == null) {
            return 0;
        } else {
            return b(((IFeedViewHolder) view2.getTag(C0906R.id.acv)).c());
        }
    }

    public int a(@NonNull Aweme aweme) {
        if (!PatchProxy.isSupport(new Object[]{aweme}, this, g, false, 40494, new Class[]{Aweme.class}, Integer.TYPE)) {
            return b(aweme.getAwemeType());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme}, this, g, false, 40494, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
    }

    public static void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, null, g, true, 40477, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, null, g, true, 40477, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        f44713f.put(Long.valueOf(j2), Long.valueOf(j3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder} */
    /* JADX WARNING: type inference failed for: r0v77 */
    /* JADX WARNING: type inference failed for: r0v78 */
    /* JADX WARNING: type inference failed for: r0v79 */
    /* JADX WARNING: type inference failed for: r0v80 */
    /* JADX WARNING: type inference failed for: r1v74, types: [com.ss.android.ugc.aweme.feed.adapter.b] */
    /* JADX WARNING: type inference failed for: r0v81 */
    /* JADX WARNING: type inference failed for: r23v1, types: [com.ss.android.ugc.aweme.commercialize.symphony.e] */
    /* JADX WARNING: type inference failed for: r0v82 */
    /* JADX WARNING: type inference failed for: r0v83 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(int r33, android.view.View r34, android.view.ViewGroup r35) {
        /*
            r32 = this;
            r8 = r32
            r7 = r34
            r9 = r35
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r11 = 0
            r0[r11] = r1
            r12 = 1
            r0[r12] = r7
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = g
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r3 = 0
            r4 = 40480(0x9e20, float:5.6725E-41)
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r0[r11] = r1
            r0[r12] = r7
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40480(0x9e20, float:5.6725E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
            return r0
        L_0x005f:
            int r14 = r32.a((int) r33)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r12] = r1
            r1 = 0
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 1
            r4 = 40482(0x9e22, float:5.6727E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r5[r11] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r12] = r6
            java.lang.Class r6 = java.lang.Boolean.TYPE
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r15 = 2131166693(0x7f0705e5, float:1.7947639E38)
            if (r0 == 0) goto L_0x00b7
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r12] = r1
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = g
            r19 = 1
            r20 = 40482(0x9e22, float:5.6727E-41)
            java.lang.Class[] r1 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r1[r11] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r12] = r2
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r0
            r21 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00c7
        L_0x00b7:
            if (r7 != 0) goto L_0x00bb
            r0 = 0
            goto L_0x00c7
        L_0x00bb:
            java.lang.Object r0 = r7.getTag(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            boolean r0 = android.support.v4.util.ObjectsCompat.equals(r0, r1)
        L_0x00c7:
            r6 = 2131166692(0x7f0705e4, float:1.7947637E38)
            if (r0 != 0) goto L_0x0310
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40487(0x9e27, float:5.6734E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<android.view.View> r7 = android.view.View.class
            r1 = r32
            r6 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0118
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40487(0x9e27, float:5.6734E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r1 = r32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.view.View r0 = (android.view.View) r0
        L_0x0115:
            r15 = r0
            goto L_0x01d0
        L_0x0118:
            switch(r14) {
                case 1: goto L_0x01c5;
                case 2: goto L_0x016f;
                case 3: goto L_0x012f;
                default: goto L_0x011b;
            }
        L_0x011b:
            com.ss.android.ugc.aweme.lego.a r0 = com.ss.android.ugc.aweme.lego.a.i
            java.lang.Class<com.ss.android.ugc.aweme.legoImp.inflate.q> r1 = com.ss.android.ugc.aweme.legoImp.inflate.q.class
            java.lang.Object r0 = r0.b((java.lang.Class<? extends com.ss.android.ugc.aweme.lego.c>) r1)
            com.ss.android.ugc.aweme.legoImp.inflate.q r0 = (com.ss.android.ugc.aweme.legoImp.inflate.q) r0
            android.content.Context r1 = r8.o
            r2 = 2131690254(0x7f0f030e, float:1.9009546E38)
            android.view.View r0 = r0.a((android.content.Context) r1, (int) r2)
            goto L_0x0115
        L_0x012f:
            com.ss.android.ugc.aweme.commercialize.symphony.c r0 = com.ss.android.ugc.aweme.commercialize.symphony.c.a()
            android.content.Context r7 = r8.o
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r7
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.commercialize.symphony.c.f39552a
            r4 = 0
            r5 = 32105(0x7d69, float:4.4989E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.symphony.d> r16 = com.ss.android.ugc.aweme.commercialize.symphony.d.class
            r2 = r0
            r15 = r7
            r7 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0169
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r11] = r15
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.commercialize.symphony.c.f39552a
            r4 = 0
            r5 = 32105(0x7d69, float:4.4989E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r11] = r2
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.symphony.d> r7 = com.ss.android.ugc.aweme.commercialize.symphony.d.class
            r2 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.commercialize.symphony.d r0 = (com.ss.android.ugc.aweme.commercialize.symphony.d) r0
            goto L_0x0115
        L_0x0169:
            com.ss.android.ugc.aweme.commercialize.symphony.d r0 = new com.ss.android.ugc.aweme.commercialize.symphony.d
            r0.<init>(r15)
            goto L_0x0115
        L_0x016f:
            android.view.LayoutInflater r7 = r8.n
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40488(0x9e28, float:5.6736E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x019e
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40488(0x9e28, float:5.6736E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x01bf
        L_0x019e:
            boolean r0 = r32.a()
            if (r0 == 0) goto L_0x01a8
            r0 = 2131690224(0x7f0f02f0, float:1.9009486E38)
            goto L_0x01bf
        L_0x01a8:
            boolean r0 = r32.f()
            if (r0 == 0) goto L_0x01b2
            r0 = 2131690258(0x7f0f0312, float:1.9009555E38)
            goto L_0x01bf
        L_0x01b2:
            boolean r0 = r32.e()
            if (r0 == 0) goto L_0x01bc
            r0 = 2131690259(0x7f0f0313, float:1.9009557E38)
            goto L_0x01bf
        L_0x01bc:
            r0 = 2131690257(0x7f0f0311, float:1.9009553E38)
        L_0x01bf:
            android.view.View r0 = r7.inflate(r0, r9, r11)
            goto L_0x0115
        L_0x01c5:
            android.view.LayoutInflater r0 = r8.n
            r1 = 2131690256(0x7f0f0310, float:1.900955E38)
            android.view.View r0 = r0.inflate(r1, r9, r11)
            goto L_0x0115
        L_0x01d0:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40483(0x9e23, float:5.6729E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r6 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x022e
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40483(0x9e23, float:5.6729E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r6 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r1 = r32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = (com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r0
            goto L_0x02ff
        L_0x022e:
            switch(r14) {
                case 1: goto L_0x02e6;
                case 2: goto L_0x0269;
                case 3: goto L_0x0242;
                default: goto L_0x0231;
            }
        L_0x0231:
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r2 = r8.f44714b
            android.view.View$OnTouchListener r3 = r8.f44716d
            android.support.v4.app.Fragment r4 = r8.f44715c
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r5 = r8.f44717e
            r0 = r32
            r1 = r15
            com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder r0 = r0.a(r1, r2, r3, r4, r5)
            goto L_0x02ff
        L_0x0242:
            com.ss.android.ugc.aweme.commercialize.symphony.e r0 = new com.ss.android.ugc.aweme.commercialize.symphony.e
            android.content.Context r1 = r8.o
            int r25 = r32.b()
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r2 = r8.f44714b
            java.lang.String r28 = r32.c()
            android.view.View$OnTouchListener r3 = r8.f44716d
            android.support.v4.app.Fragment r4 = r8.f44715c
            int r31 = r32.d()
            r23 = r0
            r24 = r1
            r26 = r15
            r27 = r2
            r29 = r3
            r30 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x02ff
        L_0x0269:
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r7 = r8.f44714b
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r15
            r0[r12] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40486(0x9e26, float:5.6733E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.aa> r1 = com.ss.android.ugc.aweme.feed.f.aa.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r6 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02ac
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r15
            r0[r12] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40486(0x9e26, float:5.6733E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.f.aa> r1 = com.ss.android.ugc.aweme.feed.f.aa.class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r6 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r1 = r32
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = (com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r0
            goto L_0x02ff
        L_0x02ac:
            boolean r0 = r32.a()
            if (r0 == 0) goto L_0x02c2
            com.ss.android.ugc.aweme.feed.adapter.b r0 = new com.ss.android.ugc.aweme.feed.adapter.b
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r3 = r8.f44714b
            long r4 = r8.k
            java.lang.String r6 = r32.c()
            r1 = r0
            r2 = r15
            r1.<init>(r2, r3, r4, r6)
            goto L_0x02ff
        L_0x02c2:
            boolean r0 = r32.f()
            if (r0 == 0) goto L_0x02d0
            com.ss.android.ugc.aweme.feed.adapter.e r0 = new com.ss.android.ugc.aweme.feed.adapter.e
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r1 = r8.f44714b
            r0.<init>(r15, r1)
            goto L_0x02ff
        L_0x02d0:
            boolean r0 = r32.e()
            if (r0 == 0) goto L_0x02de
            com.ss.android.ugc.aweme.feed.adapter.f r0 = new com.ss.android.ugc.aweme.feed.adapter.f
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r1 = r8.f44714b
            r0.<init>(r15, r1)
            goto L_0x02ff
        L_0x02de:
            com.ss.android.ugc.aweme.feed.adapter.g r0 = new com.ss.android.ugc.aweme.feed.adapter.g
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r1 = r8.f44714b
            r0.<init>(r15, r1)
            goto L_0x02ff
        L_0x02e6:
            int r1 = r32.b()
            com.ss.android.ugc.aweme.feed.f.aa<com.ss.android.ugc.aweme.feed.f.ar> r3 = r8.f44714b
            java.lang.String r4 = r32.c()
            android.view.View$OnTouchListener r5 = r8.f44716d
            android.support.v4.app.Fragment r6 = r8.f44715c
            int r7 = r32.d()
            r0 = r32
            r2 = r15
            com.ss.android.ugc.aweme.feed.adapter.FeedImageViewHolder r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
        L_0x02ff:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 2131166693(0x7f0705e5, float:1.7947639E38)
            r15.setTag(r2, r1)
            r1 = 2131166692(0x7f0705e4, float:1.7947637E38)
            r15.setTag(r1, r0)
            goto L_0x031a
        L_0x0310:
            r1 = 2131166692(0x7f0705e4, float:1.7947637E38)
            java.lang.Object r0 = r7.getTag(r1)
            com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder r0 = (com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder) r0
            r15 = r7
        L_0x031a:
            r7 = r0
            r6 = 4
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r11] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r0[r12] = r1
            r0[r13] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40492(0x9e2c, float:5.6741E-41)
            java.lang.Class[] r5 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r1 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r1 = r32
            r10 = 4
            r6 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0387
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r33)
            r0[r12] = r1
            r0[r13] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r2 = 3
            r0[r2] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = g
            r3 = 0
            r4 = 40492(0x9e2c, float:5.6741E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder> r1 = com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r6 = 3
            r5[r6] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0390
        L_0x0387:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r32.d(r33)
            r1 = r33
            r7.a(r0, r12, r1)
        L_0x0390:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter.a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public FeedPagerAdapter(Context context, LayoutInflater layoutInflater, int i2, aa<ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        super(context, layoutInflater, i2);
        this.f44714b = aaVar;
        this.f44715c = fragment;
        this.f44716d = onTouchListener;
        this.f44717e = baseFeedPageParams;
    }
}
