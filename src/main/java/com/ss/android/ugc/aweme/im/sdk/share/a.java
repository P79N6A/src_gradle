package com.ss.android.ugc.aweme.im.sdk.share;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.a.c;
import com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectActivity;
import com.ss.android.ugc.aweme.im.sdk.relations.model.RelationModel;
import com.ss.android.ugc.aweme.im.sdk.share.b;
import com.ss.android.ugc.aweme.im.sdk.utils.k;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.a.b;
import com.ss.android.ugc.aweme.im.service.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public final class a extends LinearLayout implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52370a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f52371b;

    /* renamed from: c  reason: collision with root package name */
    public HeadListAdapter f52372c;

    /* renamed from: d  reason: collision with root package name */
    public IShareService.SharePage f52373d;

    /* renamed from: e  reason: collision with root package name */
    public IMContact f52374e;

    /* renamed from: f  reason: collision with root package name */
    public e f52375f;
    public b g;
    private boolean h;
    private int i = 10;
    private RelationModel j;
    private View.OnClickListener k;

    public final void a(IMContact iMContact) {
        if (PatchProxy.isSupport(new Object[]{iMContact}, this, f52370a, false, 53197, new Class[]{IMContact.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact}, this, f52370a, false, 53197, new Class[]{IMContact.class}, Void.TYPE);
            return;
        }
        final IShareService.ShareStruct iMShareStruct = this.f52373d.getIMShareStruct();
        if (iMShareStruct == null) {
            if (this.f52375f != null) {
                if (iMContact == null) {
                    this.f52375f.a("chat_merge");
                } else {
                    this.f52375f.a("chat_mergeIM");
                }
            }
            this.f52373d.dismiss();
        } else if (iMContact == null) {
            Bundle bundle = new Bundle();
            a(iMShareStruct, "more");
            bundle.putSerializable("share_struct", iMShareStruct);
            RelationSelectActivity.a(getContext(), bundle, (com.ss.android.ugc.aweme.base.a<Boolean>) null);
            this.f52373d.dismiss();
        } else {
            final IMContact[] iMContactArr = {iMContact};
            b.a(getContext(), iMShareStruct, iMContactArr, "", new b.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52378a;

                public final void onShare(final String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f52378a, false, 53205, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f52378a, false, 53205, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    new com.ss.android.ugc.aweme.im.sdk.a.b(a.this.getContext(), new c() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f52382a;

                        public final void sendMsg() {
                            if (PatchProxy.isSupport(new Object[0], this, f52382a, false, 53206, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f52382a, false, 53206, new Class[0], Void.TYPE);
                                return;
                            }
                            a.this.a(iMShareStruct, str, iMContactArr);
                        }
                    }).sendMsg();
                    z.a().a(1);
                    a.this.f52373d.dismiss();
                    if (a.this.f52375f != null) {
                        a.this.f52375f.a("chat_merge");
                    }
                }
            }, null);
            a(iMShareStruct, "head");
            z.a().a(iMShareStruct, iMContact, false);
        }
    }

    public final void onWindowVisibilityChanged(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f52370a, false, 53194, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f52370a, false, 53194, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            if (((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin()) {
                if (this.j != null) {
                    this.j.b();
                }
                if (PatchProxy.isSupport(new Object[0], this, f52370a, false, 53193, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52370a, false, 53193, new Class[0], Void.TYPE);
                } else {
                    if (this.f52371b == null) {
                        this.f52371b = (RecyclerView) findViewById(C0906R.id.cc4);
                        this.f52372c = new HeadListAdapter(this.k);
                        if (!(this.f52375f == null || this.g == null)) {
                            this.f52372c.f52361f = true;
                        }
                        this.f52371b.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                        this.f52371b.setAdapter(this.f52372c);
                    }
                    if (this.j == null) {
                        this.j = new RelationModel(this);
                        this.j.f52186f = 3;
                        IShareService.ShareStruct iMShareStruct = this.f52373d.getIMShareStruct();
                        this.j.h = k.a(iMShareStruct);
                    }
                    if (this.h) {
                        this.j.a();
                    } else {
                        RelationModel relationModel = this.j;
                        if (PatchProxy.isSupport(new Object[0], relationModel, RelationModel.f52181a, false, 52913, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], relationModel, RelationModel.f52181a, false, 52913, new Class[0], Void.TYPE);
                        } else {
                            relationModel.c();
                        }
                        this.h = true;
                    }
                }
            } else {
                setVisibility(8);
            }
        }
    }

    public final void a(IShareService.ShareStruct shareStruct, String str) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{shareStruct2, str2}, this, f52370a, false, 53198, new Class[]{IShareService.ShareStruct.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareStruct2, str2}, this, f52370a, false, 53198, new Class[]{IShareService.ShareStruct.class, String.class}, Void.TYPE);
            return;
        }
        if (shareStruct2.extraParams == null) {
            shareStruct2.extraParams = new HashMap<>();
        }
        shareStruct2.extraParams.put("enter_method", str2);
    }

    @MainThread
    public final void update(Observable observable, Object obj) {
        if (PatchProxy.isSupport(new Object[]{observable, obj}, this, f52370a, false, 53202, new Class[]{Observable.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observable, obj}, this, f52370a, false, 53202, new Class[]{Observable.class, Object.class}, Void.TYPE);
            return;
        }
        if (observable.equals(this.j)) {
            Integer num = (Integer) obj;
            if (num.intValue() == 0) {
                List<IMContact> list = this.j.f52183c;
                if (list.size() > this.i) {
                    this.f52372c.a(list.subList(0, this.i), true);
                } else {
                    this.f52372c.a(list, true);
                }
                setVisibility(0);
                if (PatchProxy.isSupport(new Object[0], this, f52370a, false, 53203, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f52370a, false, 53203, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.im.sdk.d.a.a().e().logIMShareHeadShow();
                }
            } else if (num.intValue() == -1) {
                setVisibility(8);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct r16, java.lang.String r17, com.ss.android.ugc.aweme.im.service.model.IMContact[] r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f52370a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact[]> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 53200(0xcfd0, float:7.4549E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f52370a
            r3 = 0
            r4 = 53200(0xcfd0, float:7.4549E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct> r1 = com.ss.android.ugc.aweme.framework.services.IShareService.ShareStruct.class
            r5[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact[]> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0053:
            com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r0 = com.ss.android.ugc.aweme.im.sdk.share.b.b(r16)
            if (r0 != 0) goto L_0x005a
            return
        L_0x005a:
            java.lang.String r1 = r8.itemType
            java.lang.String r2 = "poi"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x008d
            r1 = r0
            com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent r1 = (com.ss.android.ugc.aweme.im.sdk.chat.model.SharePoiContent) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r1.getMapUrl()
            java.lang.String r2 = r2.getUri()
            java.lang.String r3 = "file://"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.im.sdk.chat.net.s r0 = com.ss.android.ugc.aweme.im.sdk.chat.net.s.a()
            r3 = 7
            java.lang.String r2 = r2.substring(r3)
            com.ss.android.ugc.aweme.im.sdk.share.a$4 r3 = new com.ss.android.ugc.aweme.im.sdk.share.a$4
            r3.<init>(r1, r9, r10)
            r0.a((java.lang.String) r2, (com.ss.android.ugc.aweme.im.sdk.chat.net.x) r3)
            goto L_0x0090
        L_0x0089:
            r15.a((java.lang.String) r9, (com.ss.android.ugc.aweme.im.service.model.IMContact[]) r10, (com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent) r0)
            return
        L_0x008d:
            r15.a((java.lang.String) r9, (com.ss.android.ugc.aweme.im.service.model.IMContact[]) r10, (com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent) r0)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.a.a(com.ss.android.ugc.aweme.framework.services.IShareService$ShareStruct, java.lang.String, com.ss.android.ugc.aweme.im.service.model.IMContact[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r15, com.ss.android.ugc.aweme.im.service.model.IMContact[] r16, com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r15
            r12 = 1
            r0[r12] = r8
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f52370a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact[]> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact[].class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent> r1 = com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 53201(0xcfd1, float:7.455E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0051
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r15
            r0[r12] = r8
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f52370a
            r3 = 0
            r4 = 53201(0xcfd1, float:7.455E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.service.model.IMContact[]> r1 = com.ss.android.ugc.aweme.im.service.model.IMContact[].class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent> r1 = com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent.class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0051:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            if (r1 != 0) goto L_0x0066
            com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent r1 = com.ss.android.ugc.aweme.im.sdk.chat.model.TextContent.obtain((java.lang.String) r15)
            r0.add(r1)
        L_0x0066:
            java.util.List r1 = com.ss.android.ugc.aweme.im.sdk.d.d.a((com.ss.android.ugc.aweme.im.service.model.IMContact[]) r16)
            com.ss.android.ugc.aweme.im.sdk.utils.ba r2 = com.ss.android.ugc.aweme.im.sdk.utils.ba.a()
            r2.b((java.util.List<java.lang.String>) r1, (java.util.List<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent>) r0)
            com.ss.android.ugc.aweme.im.service.a.b r0 = r7.g
            if (r0 == 0) goto L_0x0082
            int r0 = r8.length
            if (r0 <= r12) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r12 = 0
        L_0x007a:
            com.ss.android.ugc.aweme.im.service.a.b r0 = r7.g
            r1 = r8[r11]
            r0.a(r1, r12)
            return
        L_0x0082:
            android.content.Context r0 = r14.getContext()
            r1 = 2131560693(0x7f0d08f5, float:1.8746765E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.a((android.content.Context) r0, (int) r1, (int) r12)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.a.a(java.lang.String, com.ss.android.ugc.aweme.im.service.model.IMContact[], com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent):void");
    }

    public a(Context context, IShareService.SharePage sharePage, int i2, e eVar, com.ss.android.ugc.aweme.im.service.a.b bVar) {
        super(context);
        this.i = i2;
        this.f52373d = sharePage;
        this.g = bVar;
        this.f52375f = eVar;
        if (PatchProxy.isSupport(new Object[0], this, f52370a, false, 53191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52370a, false, 53191, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f52370a, false, 53195, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52370a, false, 53195, new Class[0], Void.TYPE);
        } else if (this.k == null) {
            this.k = new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f52376a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f52376a, false, 53204, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f52376a, false, 53204, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (a.this.f52375f == null || a.this.f52375f.a()) {
                        a.this.f52374e = (IMContact) view.getTag();
                        if (a.this.g == null) {
                            a.this.a(a.this.f52374e);
                        } else if (a.this.f52374e != null) {
                            int i = com.ss.android.ugc.aweme.im.sdk.d.a.a().e().getIMSetting().f52881d;
                            if (a.this.f52372c.b() < i || a.this.f52372c.b(a.this.f52374e)) {
                                boolean a2 = a.this.f52372c.a(a.this.f52374e);
                                a.this.f52372c.notifyDataSetChanged();
                                if (a2) {
                                    com.ss.android.ugc.aweme.im.sdk.relations.c.a(a.this.f52373d.getIMShareStruct(), a.this.f52374e);
                                    if (a.this.f52375f != null && a.this.f52373d.getIMShareStruct() == null) {
                                        a.this.f52375f.a("chat_mergeIM");
                                    }
                                }
                                a.this.g.a(a.this.f52372c.b());
                                return;
                            }
                            com.bytedance.ies.dmt.ui.d.a.c(a.this.getContext(), a.this.getContext().getString(C0906R.string.az7, new Object[]{Integer.valueOf(i)})).a();
                        } else {
                            IShareService.ShareStruct iMShareStruct = a.this.f52373d.getIMShareStruct();
                            if (iMShareStruct == null) {
                                if (a.this.f52375f != null) {
                                    a.this.f52375f.a("chat_merge");
                                }
                                a.this.f52373d.dismiss();
                                return;
                            }
                            a.this.a(iMShareStruct, "more");
                            a.this.g.a((Object) iMShareStruct);
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("share_struct", iMShareStruct);
                            a.this.f52372c.f52359d.remove(null);
                            if (a.this.f52372c.f52359d.size() != 0) {
                                bundle.putSerializable("key_selected_contact", a.this.f52372c.f52359d);
                                bundle.putInt("key_select_mode", 3);
                            }
                            RelationSelectActivity.a(a.this.getContext(), bundle, (com.ss.android.ugc.aweme.base.a<Boolean>) null);
                            a.this.f52373d.dismiss();
                        }
                    }
                }
            };
        }
        inflate(getContext(), C0906R.layout.a8g, this);
    }
}
