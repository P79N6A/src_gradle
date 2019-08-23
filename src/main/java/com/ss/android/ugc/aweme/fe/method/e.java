package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.feedback.t;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.c;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.web.jsbridge.a.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements d, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44571a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f44572b;

    /* renamed from: c  reason: collision with root package name */
    protected com.bytedance.ies.f.a.a f44573c;

    /* renamed from: d  reason: collision with root package name */
    public int f44574d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f44575e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<AvatarUri> f44576f;
    public List<String> g;
    public AtomicInteger h;
    public AtomicInteger i;
    public a.C0801a j;
    public boolean k;
    public int l;
    public String m;
    private String n = "";
    private String o;
    private boolean p;
    private boolean q;
    private List<WeakHandler.IHandler> r;

    public final void b() {
        this.j = null;
    }

    public final boolean a(int i2, int i3, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f44571a, false, 39761, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f44571a, false, 39761, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 != 10003) {
            return true;
        } else {
            if (i3 == 0 || intent == null) {
                a("image", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                return true;
            }
            String a2 = com.ss.android.newmedia.e.a((Context) this.f44572b.get(), intent.getData());
            if (StringUtils.isEmpty(a2)) {
                UIUtils.displayToastWithIcon((Context) this.f44572b.get(), 2130838336, (int) C0906R.string.bmk);
                return true;
            } else if (!new File(a2).exists()) {
                UIUtils.displayToastWithIcon((Context) this.f44572b.get(), 2130838336, (int) C0906R.string.bmk);
                return true;
            } else {
                String str = "https://aweme.snssdk.com/aweme/v1/upload/image/?uid=" + com.ss.android.ugc.aweme.account.d.a().getCurUserId();
                if (!TextUtils.isEmpty(this.n)) {
                    str = str + "&source=" + this.n;
                }
                this.o = a2;
                com.ss.android.ugc.aweme.account.d.a().uploadAvatar(new WeakHandler(this), str, 4194304, a2, null);
                return true;
            }
        }
    }

    public final void a(List<String> list, a.C0801a aVar) {
        List<String> list2 = list;
        a.C0801a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{list2, aVar2}, this, f44571a, false, 39764, new Class[]{List.class, a.C0801a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, aVar2}, this, f44571a, false, 39764, new Class[]{List.class, a.C0801a.class}, Void.TYPE);
        } else if (!j.a((Collection<T>) list)) {
            this.j = aVar2;
            this.h = new AtomicInteger(0);
            this.i = new AtomicInteger(0);
            this.g = list2;
            this.f44576f = new SparseArray<>();
            a(this.g.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = list2.get(i2);
                if (StringUtils.isEmpty(str)) {
                    this.f44576f.put(i2, new AvatarUri());
                    this.i.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        this.f44576f.put(i2, new AvatarUri());
                        this.i.incrementAndGet();
                    } else {
                        String str2 = "https://aweme.snssdk.com/aweme/v1/upload/image/?uid=" + com.ss.android.ugc.aweme.account.d.a().getCurUserId();
                        if (!TextUtils.isEmpty(this.n)) {
                            str2 = str2 + "&source=" + this.n;
                        }
                        com.ss.android.ugc.aweme.account.d.a().uploadAvatar(new WeakHandler(this.r.get(i2)), str2, 4194304, t.f47219b.a(str, file, this.l), null);
                    }
                }
            }
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f44571a, false, 39768, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f44571a, false, 39768, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFile");
        } catch (JSONException unused) {
        }
        if (this.f44573c != null) {
            this.f44573c.b("H5_uploadFile", jSONObject2);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44571a, false, 39765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44571a, false, 39765, new Class[0], Void.TYPE);
            return;
        }
        a("image", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        this.k = true;
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f44571a, false, 39766, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f44571a, false, 39766, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = new ArrayList();
        for (final int i3 = 0; i3 <= i2; i3++) {
            this.r.add(new WeakHandler.IHandler() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44583a;

                public final void handleMsg(Message message) {
                    if (PatchProxy.isSupport(new Object[]{message}, this, f44583a, false, 39773, new Class[]{Message.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{message}, this, f44583a, false, 39773, new Class[]{Message.class}, Void.TYPE);
                    } else if (e.this.f44576f != null && e.this.i != null && e.this.h != null && e.this.g != null && e.this.f44572b != null && !e.this.k) {
                        if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                            Context context = (Context) e.this.f44572b.get();
                            if (context != null) {
                                com.bytedance.ies.dmt.ui.d.a.b(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).a();
                            }
                            e.this.f44576f.put(i3, new AvatarUri());
                            e.this.i.incrementAndGet();
                        } else if (message.obj instanceof AvatarUri) {
                            AvatarUri avatarUri = (AvatarUri) message.obj;
                            if (j.b(avatarUri.urlList)) {
                                e.this.f44576f.put(i3, avatarUri);
                                e.this.h.incrementAndGet();
                            } else {
                                e.this.f44576f.put(i3, new AvatarUri());
                                e.this.i.incrementAndGet();
                            }
                        } else {
                            e.this.f44576f.put(i3, new AvatarUri());
                            e.this.i.incrementAndGet();
                        }
                        if (e.this.i.get() + e.this.h.get() == e.this.g.size()) {
                            if (e.this.i.get() == e.this.g.size()) {
                                e.this.a("image", e.this.a(0, "", ""));
                            } else {
                                e.this.a("image", e.this.a(e.this.f44576f));
                            }
                            if (e.this.j != null) {
                                e.this.j.a();
                            }
                            t.f47219b.a(e.this.l);
                        }
                    }
                }
            });
        }
    }

    public final JSONArray a(SparseArray<AvatarUri> sparseArray) {
        SparseArray<AvatarUri> sparseArray2 = sparseArray;
        if (PatchProxy.isSupport(new Object[]{sparseArray2}, this, f44571a, false, 39767, new Class[]{SparseArray.class}, JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[]{sparseArray2}, this, f44571a, false, 39767, new Class[]{SparseArray.class}, JSONArray.class);
        }
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            JSONObject jSONObject = new JSONObject();
            String str = "";
            String str2 = "";
            if (sparseArray2.get(i2) != null && j.b(sparseArray2.get(i2).urlList)) {
                str = sparseArray2.get(i2).uri;
                str2 = sparseArray2.get(i2).urlList.get(0);
            }
            try {
                jSONObject.put(PushConstants.WEB_URL, str2);
                jSONObject.put("uri", str);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    public final void handleMsg(Message message) {
        JSONObject jSONObject;
        if (PatchProxy.isSupport(new Object[]{message}, this, f44571a, false, 39762, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f44571a, false, 39762, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Context context = (Context) this.f44572b.get();
        if (context != null) {
            if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.bytedance.ies.dmt.ui.d.a.b(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).a();
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    jSONObject = a(0, "", "");
                } else {
                    jSONObject = a(1, avatarUri.urlList.get(0), avatarUri.uri);
                }
                a("image", jSONObject);
            }
            jSONObject = a(0, "", "");
            a("image", jSONObject);
        }
    }

    public e(WeakReference<Context> weakReference, com.bytedance.ies.f.a.a aVar) {
        this.f44572b = weakReference;
        this.f44573c = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.ss.android.ugc.aweme.base.activity.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.ss.android.ugc.aweme.base.activity.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: com.ss.android.ugc.aweme.base.activity.d} */
    /* JADX WARNING: type inference failed for: r0v32, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.f.a.h r12, org.json.JSONObject r13) throws java.lang.Exception {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f44571a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.f.a.h> r1 = com.bytedance.ies.f.a.h.class
            r5[r9] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39758(0x9b4e, float:5.5713E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f44571a
            r3 = 0
            r4 = 39758(0x9b4e, float:5.5713E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ies.f.a.h> r1 = com.bytedance.ies.f.a.h.class
            r5[r9] = r1
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            org.json.JSONObject r0 = r12.f20623d
            java.lang.String r1 = "type"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = ""
            r11.n = r1
            java.lang.String r1 = "image"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0144
            org.json.JSONObject r0 = r12.f20623d
            java.lang.String r1 = "source"
            java.lang.String r0 = r0.optString(r1)
            r11.n = r0
            org.json.JSONObject r0 = r12.f20623d
            java.lang.String r1 = "skip_img_base64"
            boolean r0 = r0.optBoolean(r1, r9)
            r11.p = r0
            org.json.JSONObject r0 = r12.f20623d
            java.lang.String r1 = "maxSelectNum"
            int r0 = r0.optInt(r1, r10)
            r11.f44574d = r0
            org.json.JSONObject r0 = r12.f20623d
            java.lang.String r1 = "isMultiSelect"
            boolean r0 = r0.optBoolean(r1, r9)
            r11.q = r0
            org.json.JSONObject r0 = r12.f20623d
            java.lang.String r1 = "skip_img_base64"
            boolean r0 = r0.optBoolean(r1, r9)
            r11.f44575e = r0
            org.json.JSONObject r0 = r12.f20623d
            java.lang.String r1 = "image_width"
            r2 = -1
            int r0 = r0.optInt(r1, r2)
            r11.l = r0
            org.json.JSONObject r0 = r12.f20623d
            java.lang.String r1 = "from"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.optString(r1, r2)
            r11.m = r0
            java.lang.ref.WeakReference<android.content.Context> r0 = r11.f44572b
            if (r0 == 0) goto L_0x00a9
            java.lang.ref.WeakReference<android.content.Context> r0 = r11.f44572b
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.base.activity.d
            if (r1 == 0) goto L_0x0143
            r1 = r0
            com.ss.android.ugc.aweme.base.activity.d r1 = (com.ss.android.ugc.aweme.base.activity.d) r1
            r1.a(r11)
            java.lang.String r1 = "code"
            r13.put(r1, r10)
            r11.k = r9
            boolean r1 = r11.q
            if (r1 == 0) goto L_0x0101
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44571a
            r3 = 0
            r4 = 39760(0x9b50, float:5.5716E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44571a
            r3 = 0
            r4 = 39760(0x9b50, float:5.5716E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0144
        L_0x00f2:
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r0[r9] = r1
            com.ss.android.ugc.aweme.fe.method.e$2 r1 = new com.ss.android.ugc.aweme.fe.method.e$2
            r1.<init>(r7)
            com.ss.android.ugc.aweme.base.l.a(r7, r0, r1)
            return
        L_0x0101:
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44571a
            r3 = 0
            r4 = 39759(0x9b4f, float:5.5714E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0134
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44571a
            r3 = 0
            r4 = 39759(0x9b4f, float:5.5714E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0134:
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r0[r9] = r1
            com.ss.android.ugc.aweme.fe.method.e$1 r1 = new com.ss.android.ugc.aweme.fe.method.e$1
            r1.<init>(r7)
            com.ss.android.ugc.aweme.base.l.a(r7, r0, r1)
            goto L_0x0144
        L_0x0143:
            return
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.e.call(com.bytedance.ies.f.a.h, org.json.JSONObject):void");
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f44571a, false, 39770, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f44571a, false, 39770, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileCancel");
        } catch (JSONException unused) {
        }
        if (this.f44573c != null) {
            this.f44573c.b("H5_uploadFileCancel", jSONObject2);
        }
    }

    public final void a(String str, JSONArray jSONArray) {
        if (PatchProxy.isSupport(new Object[]{str, jSONArray}, this, f44571a, false, 39769, new Class[]{String.class, JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONArray}, this, f44571a, false, 39769, new Class[]{String.class, JSONArray.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("args", jSONArray);
            jSONObject.put("msg", "H5_uploadFile");
        } catch (JSONException unused) {
        }
        if (this.f44573c != null) {
            this.f44573c.b("H5_uploadFile", jSONObject);
        }
    }

    public final JSONObject a(int i2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, str4}, this, f44571a, false, 39763, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str3, str4}, this, f44571a, false, 39763, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        String str5 = "";
        try {
            if (!this.p && bm.a(this.o)) {
                str5 = bm.b(((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().compress(this.o, new c(), 216, 384).mPhotoLocalPath);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.p = false;
            this.o = "";
            throw th;
        }
        this.p = false;
        this.o = "";
        int i3 = i2;
        try {
            jSONObject.put("code", i2);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(PushConstants.WEB_URL, str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("img_base64", str5);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }
}
