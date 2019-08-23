package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import android.os.Message;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.e.b;
import com.ss.android.ugc.aweme.newfollow.e.c;
import com.ss.android.ugc.aweme.poi.api.PoiFeedApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class aa extends a<b, c> implements Cloneable {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f59856b;

    /* renamed from: d  reason: collision with root package name */
    public static final PoiFeedApi f59857d = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiFeedApi.class));

    /* renamed from: a  reason: collision with root package name */
    private String f59858a;

    /* renamed from: c  reason: collision with root package name */
    protected int f59859c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f59860e = true;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public List<b> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((c) this.mData).f57102b;
    }

    private String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f59856b, false, 65102, new Class[0], String.class)) {
            return String.valueOf(System.currentTimeMillis());
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f59856b, false, 65102, new Class[0], String.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public aa clone() {
        if (PatchProxy.isSupport(new Object[0], this, f59856b, false, 65115, new Class[0], aa.class)) {
            return (aa) PatchProxy.accessDispatch(new Object[0], this, f59856b, false, 65115, new Class[0], aa.class);
        }
        try {
            aa aaVar = (aa) super.clone();
            aaVar.mData = ((c) this.mData).clone();
            return aaVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final t b() {
        if (PatchProxy.isSupport(new Object[0], this, f59856b, false, 65114, new Class[0], t.class)) {
            return (t) PatchProxy.accessDispatch(new Object[0], this, f59856b, false, 65114, new Class[0], t.class);
        }
        an a2 = a();
        if (a2 != null) {
            return a2.getActivity();
        }
        return null;
    }

    public boolean isDataEmpty() {
        if (PatchProxy.isSupport(new Object[0], this, f59856b, false, 65109, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59856b, false, 65109, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (super.isDataEmpty() || this.f59860e) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isHasMore() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f59856b, false, 65110, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59856b, false, 65110, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null) {
            if (((c) this.mData).f57105e == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final an a() {
        if (PatchProxy.isSupport(new Object[0], this, f59856b, false, 65113, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], this, f59856b, false, 65113, new Class[0], an.class);
        }
        List<b> items = getItems();
        if (!CollectionUtils.isEmpty(items)) {
            b bVar = items.get(0);
            if (bVar instanceof PoiDetail) {
                return ((PoiDetail) bVar).getPoiActivityResponse();
            }
        }
        return null;
    }

    public aa(int i) {
        this.f59859c = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadMoreList(java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f59856b
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 65106(0xfe52, float:9.1233E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f59856b
            r13 = 0
            r14 = 65106(0xfe52, float:9.1233E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            r2 = 2
            boolean r2 = a(r2, r0)
            if (r2 != 0) goto L_0x003e
            return
        L_0x003e:
            java.lang.String r6 = r17.c()
            r2 = r17
            r2.f59858a = r6
            r0 = r0[r1]
            com.ss.android.ugc.aweme.poi.b r0 = (com.ss.android.ugc.aweme.poi.b) r0
            java.lang.String r4 = r0.f59732a
            int r5 = r0.j
            long r7 = r0.k
            java.lang.String r9 = r0.f59735d
            java.lang.String r10 = r0.f59736e
            java.lang.String r11 = r0.f59734c
            r3 = r17
            r3.a(r4, r5, r6, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.aa.loadMoreList(java.lang.Object[]):void");
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f59856b, false, 65111, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f59856b, false, 65111, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what != 65282) {
            if (message.obj instanceof c) {
                c cVar = (c) message.obj;
                if (StringUtils.isEmpty(this.f59858a) || this.f59858a.equalsIgnoreCase(cVar.g)) {
                    this.mIsLoading = false;
                    if (cVar.h != null) {
                        if (this.mNotifyListeners != null) {
                            for (p a2 : this.mNotifyListeners) {
                                a2.a(cVar.h);
                            }
                        }
                        return;
                    }
                }
            }
            super.handleMsg(message);
        } else if (message.obj != null && (message.obj instanceof c)) {
            c cVar2 = (c) message.obj;
            if (StringUtils.isEmpty(this.f59858a) || this.f59858a.equalsIgnoreCase(cVar2.g)) {
                this.mIsLoading = false;
                if (cVar2.h != null) {
                    if (this.mNotifyListeners != null) {
                        for (p a3 : this.mNotifyListeners) {
                            a3.a(cVar2.h);
                        }
                    }
                    return;
                }
                handleData(cVar2);
                if (this.mNotifyListeners != null) {
                    for (p b2 : this.mNotifyListeners) {
                        b2.b();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(c cVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f59856b, false, 65112, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f59856b, false, 65112, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (cVar == null || CollectionUtils.isEmpty(cVar.f57102b)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            this.f59860e = false;
            if (this.mListQueryType == 2 && !isDataEmpty()) {
                ((c) this.mData).f57102b.clear();
            }
            int size = cVar.f57102b.size();
            for (int i = 0; i < size; i++) {
                b bVar = cVar.f57102b.get(i);
                if (bVar != null && bVar.getFeedType() == 65280) {
                    Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a(bVar.getAweme());
                    com.ss.android.ugc.aweme.feed.a.a().a(a2.getAid() + 10, cVar.f57106f, i);
                    bVar.setAweme(a2);
                    cVar.f57102b.set(i, bVar);
                }
            }
            if (this.mListQueryType != 1) {
                Iterator<b> it2 = cVar.f57102b.iterator();
                while (it2.hasNext()) {
                    b next = it2.next();
                    if (!isDataEmpty() && ((c) this.mData).f57102b.indexOf(next) >= 0) {
                        it2.remove();
                    }
                }
            }
            switch (this.mListQueryType) {
                case 1:
                    this.mData = cVar;
                    break;
                case 2:
                    cVar.f57102b.addAll(getItems());
                    ((c) this.mData).f57102b = cVar.f57102b;
                    break;
                case 4:
                case 5:
                    ((c) this.mData).f57102b.addAll(cVar.f57102b);
                    ((c) this.mData).f57105e &= cVar.f57105e;
                    break;
            }
            if (((c) this.mData).f57104d != 0) {
                ((c) this.mData).f57104d = Math.max(((c) this.mData).f57104d, cVar.f57104d);
            }
            if (((c) this.mData).f57103c != 0) {
                ((c) this.mData).f57103c = Math.max(((c) this.mData).f57103c, cVar.f57103c);
            }
            for (int i2 = 0; i2 < ((c) this.mData).f57102b.size(); i2++) {
                if (((c) this.mData).f57102b.get(i2).getFeedType() == 65280) {
                    ((c) this.mData).f57102b.get(i2).getAweme().setAwemePosition(i2);
                }
            }
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = null;
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((c) this.mData).f57105e = 0;
        }
    }

    public boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f59856b, false, 65108, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f59856b, false, 65108, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!checkParams(objArr)) {
            return false;
        } else {
            this.mIsLoading = true;
            if (isDataEmpty()) {
                this.mListQueryType = 1;
            } else {
                this.mListQueryType = objArr[0].intValue();
            }
            switch (this.mListQueryType) {
                case 1:
                    refreshList(objArr);
                    break;
                case 2:
                    loadLatestList(objArr);
                    break;
                case 4:
                    loadMoreList(objArr);
                    break;
                case 5:
                    if (!PatchProxy.isSupport(new Object[]{objArr}, this, f59856b, false, 65107, new Class[]{Object[].class}, Void.TYPE)) {
                        if (a(2, objArr)) {
                            if (this.mData != null) {
                                ((c) this.mData).f57104d = 0;
                                if (!CollectionUtils.isEmpty(((c) this.mData).f57102b)) {
                                    ArrayList arrayList = new ArrayList();
                                    for (b next : ((c) this.mData).f57102b) {
                                        if (next instanceof PoiDetail) {
                                            arrayList.add(next);
                                        }
                                    }
                                    ((c) this.mData).f57102b.clear();
                                    ((c) this.mData).f57102b.addAll(arrayList);
                                }
                            }
                            String c2 = c();
                            this.f59858a = c2;
                            com.ss.android.ugc.aweme.poi.b bVar = objArr[1];
                            a(bVar.f59732a, bVar.j, c2, bVar.k, bVar.f59735d, bVar.f59736e, bVar.f59734c);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[]{objArr}, this, f59856b, false, 65107, new Class[]{Object[].class}, Void.TYPE);
                        break;
                    }
                    break;
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void refreshList(java.lang.Object... r33) {
        /*
            r32 = this;
            r7 = r32
            r8 = r33
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59856b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 65105(0xfe51, float:9.1232E-41)
            r1 = r32
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59856b
            r3 = 0
            r4 = 65105(0xfe51, float:9.1232E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            r11 = 2
            boolean r0 = a(r11, r8)
            if (r0 != 0) goto L_0x0040
            return
        L_0x0040:
            r0 = r8[r9]
            com.ss.android.ugc.aweme.poi.b r0 = (com.ss.android.ugc.aweme.poi.b) r0
            java.lang.String r8 = r0.f59732a
            int r14 = r0.j
            java.lang.String r15 = r0.f59736e
            java.lang.String r13 = r0.f59735d
            int r12 = r0.f59737f
            boolean r6 = r0.l
            long r1 = r0.i
            int r5 = (int) r1
            java.lang.String r4 = r0.f59734c
            boolean r3 = r0.g
            java.lang.String r2 = r0.h
            r1 = 10
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r10] = r8
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            r0[r9] = r16
            r0[r11] = r15
            r16 = 3
            r0[r16] = r13
            java.lang.Integer r17 = java.lang.Integer.valueOf(r12)
            r18 = 4
            r0[r18] = r17
            java.lang.Byte r17 = java.lang.Byte.valueOf(r6)
            r19 = 5
            r0[r19] = r17
            java.lang.Integer r17 = java.lang.Integer.valueOf(r5)
            r20 = 6
            r0[r20] = r17
            r17 = 7
            r0[r17] = r4
            java.lang.Byte r21 = java.lang.Byte.valueOf(r3)
            r22 = 8
            r0[r22] = r21
            r21 = 9
            r0[r21] = r2
            com.meituan.robust.ChangeQuickRedirect r23 = f59856b
            r24 = 0
            r25 = 65103(0xfe4f, float:9.1229E-41)
            r26 = r4
            java.lang.Class[] r4 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r27 = java.lang.String.class
            r4[r10] = r27
            java.lang.Class r27 = java.lang.Integer.TYPE
            r4[r9] = r27
            java.lang.Class<java.lang.String> r27 = java.lang.String.class
            r4[r11] = r27
            java.lang.Class<java.lang.String> r27 = java.lang.String.class
            r4[r16] = r27
            java.lang.Class r27 = java.lang.Integer.TYPE
            r4[r18] = r27
            java.lang.Class r27 = java.lang.Boolean.TYPE
            r4[r19] = r27
            java.lang.Class r27 = java.lang.Integer.TYPE
            r4[r20] = r27
            java.lang.Class<java.lang.String> r27 = java.lang.String.class
            r4[r17] = r27
            java.lang.Class r27 = java.lang.Boolean.TYPE
            r4[r22] = r27
            java.lang.Class<java.lang.String> r27 = java.lang.String.class
            r4[r21] = r27
            java.lang.Class r27 = java.lang.Void.TYPE
            r11 = 10
            r1 = r32
            r28 = r2
            r2 = r23
            r29 = r3
            r3 = r24
            r23 = r4
            r30 = r26
            r4 = r25
            r31 = r5
            r5 = r23
            r23 = r6
            r6 = r27
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0150
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r9] = r1
            r1 = 2
            r0[r1] = r15
            r0[r16] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r18] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r23)
            r0[r19] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r31)
            r0[r20] = r1
            r1 = r30
            r0[r17] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r29)
            r0[r22] = r1
            r2 = r28
            r0[r21] = r2
            com.meituan.robust.ChangeQuickRedirect r2 = f59856b
            r3 = 0
            r4 = 65103(0xfe4f, float:9.1229E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r6 = 2
            r5[r6] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r16] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r18] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r19] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r20] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r17] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r22] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r21] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r32
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0150:
            r2 = r28
            r1 = r30
            r6 = 2
            com.ss.android.ugc.aweme.poi.api.PoiFeedApi r0 = f59857d
            r3 = 20
            r16 = 0
            r4 = r12
            r12 = r0
            r0 = r13
            r13 = r8
            r5 = r15
            r15 = r3
            r18 = r1
            a.i r3 = r12.getAwemeList(r13, r14, r15, r16, r18)
            com.ss.android.ugc.aweme.commercialize.feed.j r11 = com.ss.android.ugc.aweme.commercialize.feed.j.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r11.a((java.lang.String) r1)
            com.ss.android.ugc.aweme.poi.api.PoiFeedApi r12 = f59857d
            java.lang.String r16 = "all"
            int r13 = r7.f59859c
            switch(r13) {
                case 65440: goto L_0x017e;
                case 65441: goto L_0x017b;
                default: goto L_0x0178;
            }
        L_0x0178:
            r17 = 0
            goto L_0x0180
        L_0x017b:
            r17 = 2
            goto L_0x0180
        L_0x017e:
            r17 = 1
        L_0x0180:
            if (r11 == 0) goto L_0x018b
            boolean r6 = r11.isAd()
            if (r6 == 0) goto L_0x018b
            r19 = 1
            goto L_0x018d
        L_0x018b:
            r19 = 0
        L_0x018d:
            r13 = r8
            r14 = r0
            r15 = r5
            r18 = r4
            r20 = r1
            a.i r0 = r12.getPoiDetail(r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r1 = com.ss.android.ugc.aweme.i18n.c.a()
            r4 = 0
            if (r1 != 0) goto L_0x01ab
            com.ss.android.ugc.aweme.poi.api.PoiFeedApi r1 = f59857d
            r5 = r31
            long r5 = (long) r5
            r11 = 53
            a.i r1 = r1.getPoiCommonBanner(r5, r11, r8)
            goto L_0x01b6
        L_0x01ab:
            a.j r1 = new a.j
            r1.<init>()
            a.i<TResult> r5 = r1.f1091a
            r1.a(r4)
            r1 = r5
        L_0x01b6:
            if (r23 == 0) goto L_0x01c1
            com.ss.android.ugc.aweme.poi.api.PoiFeedApi r4 = f59857d
            r5 = r29
            a.i r2 = r4.getQRDetail(r8, r5, r2)
            goto L_0x01cc
        L_0x01c1:
            a.j r2 = new a.j
            r2.<init>()
            a.i<TResult> r5 = r2.f1091a
            r2.a(r4)
            r2 = r5
        L_0x01cc:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r3)
            r4.add(r0)
            r4.add(r2)
            r4.add(r1)
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r4
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.e.o.f59816a
            r14 = 1
            r15 = 66862(0x1052e, float:9.3694E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            r0[r10] = r1
            java.lang.Class<a.i> r17 = a.i.class
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0214
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r4
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.e.o.f59816a
            r14 = 1
            r15 = 66862(0x1052e, float:9.3694E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            r0[r10] = r1
            java.lang.Class<a.i> r17 = a.i.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            a.i r0 = (a.i) r0
            goto L_0x0221
        L_0x0214:
            a.i r0 = com.ss.android.ugc.aweme.poi.e.o.a((java.util.Collection<? extends a.i<?>>) r4)
            com.ss.android.ugc.aweme.poi.e.o$1 r1 = new com.ss.android.ugc.aweme.poi.e.o$1
            r1.<init>(r4)
            a.i r0 = r0.c(r1)
        L_0x0221:
            com.ss.android.ugc.aweme.poi.model.ah r1 = new com.ss.android.ugc.aweme.poi.model.ah
            com.bytedance.common.utility.collection.WeakHandler r2 = r7.mHandler
            r3 = 65281(0xff01, float:9.1478E-41)
            int r4 = r7.f59859c
            r1.<init>(r2, r3, r4)
            java.util.concurrent.ExecutorService r2 = a.i.f1051a
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.aa.refreshList(java.lang.Object[]):void");
    }

    public static boolean a(int i, Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    private void a(String str, int i, String str2, long j, String str3, String str4, String str5) {
        long j2;
        String str6 = str2;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str6, new Long(j3), str3, str4, str5}, this, f59856b, false, 65104, new Class[]{String.class, Integer.TYPE, String.class, Long.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str6, new Long(j3), str3, str4, str5}, this, f59856b, false, 65104, new Class[]{String.class, Integer.TYPE, String.class, Long.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        PoiFeedApi poiFeedApi = f59857d;
        if (CollectionUtils.isEmpty(getItems())) {
            j2 = 0;
        } else {
            j2 = ((c) this.mData).f57104d;
        }
        poiFeedApi.getAwemeList(str, i, 20, j2, j, str3, str4, 3, str5).a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(this.mHandler, 65282, str6), i.f1052b);
    }
}
