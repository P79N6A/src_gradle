package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feedback.t;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
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

public class RnUploadFileMethod extends BaseCommonJavaMethod implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44476a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<Context> f44477b;
    public int g;
    public boolean h;
    public BaseCommonJavaMethod.a i;
    public SparseArray<AvatarUri> j;
    public List<String> k;
    public AtomicInteger l;
    public AtomicInteger m;
    public a.C0801a n;
    public boolean o;
    public int p;
    public String q;
    private String r = "";
    private String s;
    private boolean t;
    private boolean u;
    private List<WeakHandler.IHandler> v;

    public final void b() {
        this.n = null;
    }

    public final boolean a(int i2, int i3, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f44476a, false, 39803, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f44476a, false, 39803, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        } else if (i2 != 10003) {
            return true;
        } else {
            if (i3 == 0 || intent == null) {
                a();
                return true;
            }
            String a2 = e.a((Context) this.f44477b.get(), intent.getData());
            if (StringUtils.isEmpty(a2)) {
                UIUtils.displayToastWithIcon((Context) this.f44477b.get(), 2130838336, (int) C0906R.string.bmk);
                return true;
            } else if (!new File(a2).exists()) {
                UIUtils.displayToastWithIcon((Context) this.f44477b.get(), 2130838336, (int) C0906R.string.bmk);
                return true;
            } else {
                String str = "https://aweme.snssdk.com/aweme/v1/upload/image/?uid=" + d.a().getCurUserId();
                if (!TextUtils.isEmpty(this.r)) {
                    str = str + "&source=" + this.r;
                }
                this.s = a2;
                d.a().uploadAvatar(new WeakHandler(this), str, 4194304, a2, null);
                return true;
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44476a, false, 39807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44476a, false, 39807, new Class[0], Void.TYPE);
            return;
        }
        this.i.a(0, "H5_uploadFileCancel");
        this.o = true;
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f44476a, false, 39808, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f44476a, false, 39808, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v = new ArrayList();
        for (final int i3 = 0; i3 <= i2; i3++) {
            this.v.add(new WeakHandler.IHandler() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44484a;

                public final void handleMsg(Message message) {
                    if (PatchProxy.isSupport(new Object[]{message}, this, f44484a, false, 39812, new Class[]{Message.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{message}, this, f44484a, false, 39812, new Class[]{Message.class}, Void.TYPE);
                    } else if (RnUploadFileMethod.this.j != null && RnUploadFileMethod.this.m != null && RnUploadFileMethod.this.l != null && RnUploadFileMethod.this.k != null && RnUploadFileMethod.this.i != null && RnUploadFileMethod.this.f44477b != null && !RnUploadFileMethod.this.o) {
                        if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                            Context context = (Context) RnUploadFileMethod.this.f44477b.get();
                            if (context != null) {
                                com.bytedance.ies.dmt.ui.d.a.b(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).a();
                            }
                            RnUploadFileMethod.this.j.put(i3, new AvatarUri());
                            RnUploadFileMethod.this.m.incrementAndGet();
                        } else if (message.obj instanceof AvatarUri) {
                            AvatarUri avatarUri = (AvatarUri) message.obj;
                            if (j.b(avatarUri.urlList)) {
                                RnUploadFileMethod.this.j.put(i3, avatarUri);
                                RnUploadFileMethod.this.l.incrementAndGet();
                            } else {
                                RnUploadFileMethod.this.j.put(i3, new AvatarUri());
                                RnUploadFileMethod.this.m.incrementAndGet();
                            }
                        } else {
                            RnUploadFileMethod.this.j.put(i3, new AvatarUri());
                            RnUploadFileMethod.this.m.incrementAndGet();
                        }
                        if (RnUploadFileMethod.this.m.get() + RnUploadFileMethod.this.l.get() == RnUploadFileMethod.this.k.size()) {
                            if (RnUploadFileMethod.this.m.get() == RnUploadFileMethod.this.k.size()) {
                                RnUploadFileMethod.this.a(RnUploadFileMethod.this.j);
                                RnUploadFileMethod.this.i.a(0, "H5_uploadFileFailed");
                            } else {
                                RnUploadFileMethod.this.i.a(RnUploadFileMethod.this.a(RnUploadFileMethod.this.j), 1, "H5_uploadFile");
                            }
                            if (RnUploadFileMethod.this.n != null) {
                                RnUploadFileMethod.this.n.a();
                            }
                            t.f47219b.a(RnUploadFileMethod.this.p);
                        }
                    }
                }
            });
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f44476a, false, 39804, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f44476a, false, 39804, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Context context = (Context) this.f44477b.get();
        if (context != null) {
            if (message.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.bytedance.ies.dmt.ui.d.a.b(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) message.obj).getErrorMsg()).a();
                a(0, "", "");
            } else if (message.obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) message.obj;
                if (avatarUri == null || avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                    a(0, "", "");
                    this.i.a(0, "H5_uploadFileFailed");
                    return;
                }
                this.i.a(a(1, avatarUri.urlList.get(0), avatarUri.uri), 1, "H5_uploadFile");
            } else {
                a(0, "", "");
                this.i.a(0, "H5_uploadFileFailed");
            }
        }
    }

    public final JSONArray a(SparseArray<AvatarUri> sparseArray) {
        SparseArray<AvatarUri> sparseArray2 = sparseArray;
        if (PatchProxy.isSupport(new Object[]{sparseArray2}, this, f44476a, false, 39809, new Class[]{SparseArray.class}, JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[]{sparseArray2}, this, f44476a, false, 39809, new Class[]{SparseArray.class}, JSONArray.class);
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

    public RnUploadFileMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f44477b = weakReference;
    }

    public final void a(List<String> list, a.C0801a aVar) {
        List<String> list2 = list;
        a.C0801a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{list2, aVar2}, this, f44476a, false, 39806, new Class[]{List.class, a.C0801a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, aVar2}, this, f44476a, false, 39806, new Class[]{List.class, a.C0801a.class}, Void.TYPE);
        } else if (!j.a((Collection<T>) list)) {
            this.n = aVar2;
            this.l = new AtomicInteger(0);
            this.m = new AtomicInteger(0);
            this.k = list2;
            this.j = new SparseArray<>();
            a(this.k.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = list2.get(i2);
                if (StringUtils.isEmpty(str)) {
                    this.j.put(i2, new AvatarUri());
                    this.m.incrementAndGet();
                } else {
                    File file = new File(str);
                    if (!file.exists()) {
                        this.j.put(i2, new AvatarUri());
                        this.m.incrementAndGet();
                    } else {
                        String str2 = "https://aweme.snssdk.com/aweme/v1/upload/image/?uid=" + d.a().getCurUserId();
                        if (!TextUtils.isEmpty(this.r)) {
                            str2 = str2 + "&source=" + this.r;
                        }
                        d.a().uploadAvatar(new WeakHandler(this.v.get(i2)), str2, 4194304, t.f47219b.a(str, file, this.p), null);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: com.ss.android.ugc.aweme.base.activity.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.ss.android.ugc.aweme.base.activity.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.ss.android.ugc.aweme.base.activity.d} */
    /* JADX WARNING: type inference failed for: r0v18, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r12, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f44476a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39800(0x9b78, float:5.5772E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f44476a
            r3 = 0
            r4 = 39800(0x9b78, float:5.5772E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003f:
            r11.i = r13
            java.lang.String r0 = "type"
            java.lang.String r0 = r12.optString(r0)
            java.lang.String r1 = "source"
            java.lang.String r1 = r12.optString(r1)
            r11.r = r1
            java.lang.String r1 = "skip_img_base64"
            boolean r1 = r12.optBoolean(r1, r9)
            r11.t = r1
            java.lang.String r1 = "maxSelectNum"
            int r1 = r12.optInt(r1, r10)
            r11.g = r1
            java.lang.String r1 = "isMultiSelect"
            boolean r1 = r12.optBoolean(r1, r9)
            r11.u = r1
            java.lang.String r1 = "skip_img_base64"
            boolean r1 = r12.optBoolean(r1, r9)
            r11.h = r1
            java.lang.String r1 = "image_width"
            r2 = -1
            int r1 = r12.optInt(r1, r2)
            r11.p = r1
            java.lang.String r1 = "from"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.optString(r1, r2)
            r11.q = r1
            java.lang.String r1 = "image"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x012d
            java.lang.ref.WeakReference<android.content.Context> r0 = r11.f44477b
            if (r0 == 0) goto L_0x0097
            java.lang.ref.WeakReference<android.content.Context> r0 = r11.f44477b
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x0098
        L_0x0097:
            r0 = 0
        L_0x0098:
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.base.activity.d
            if (r1 == 0) goto L_0x012c
            r1 = r0
            com.ss.android.ugc.aweme.base.activity.d r1 = (com.ss.android.ugc.aweme.base.activity.d) r1
            r1.a(r11)
            r11.o = r9
            boolean r1 = r11.u
            if (r1 == 0) goto L_0x00ea
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44476a
            r3 = 0
            r4 = 39802(0x9b7a, float:5.5774E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00db
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44476a
            r3 = 0
            r4 = 39802(0x9b7a, float:5.5774E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x012d
        L_0x00db:
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r0[r9] = r1
            com.ss.android.ugc.aweme.fe.method.RnUploadFileMethod$2 r1 = new com.ss.android.ugc.aweme.fe.method.RnUploadFileMethod$2
            r1.<init>(r7)
            com.ss.android.ugc.aweme.base.l.a(r7, r0, r1)
            return
        L_0x00ea:
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44476a
            r3 = 0
            r4 = 39801(0x9b79, float:5.5773E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x011d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f44476a
            r3 = 0
            r4 = 39801(0x9b79, float:5.5773E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x011d:
            java.lang.String[] r0 = new java.lang.String[r10]
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            r0[r9] = r1
            com.ss.android.ugc.aweme.fe.method.RnUploadFileMethod$1 r1 = new com.ss.android.ugc.aweme.fe.method.RnUploadFileMethod$1
            r1.<init>(r7)
            com.ss.android.ugc.aweme.base.l.a(r7, r0, r1)
            goto L_0x012d
        L_0x012c:
            return
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.RnUploadFileMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private JSONObject a(int i2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, str4}, this, f44476a, false, 39805, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str3, str4}, this, f44476a, false, 39805, new Class[]{Integer.TYPE, String.class, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        String str5 = "";
        try {
            if (!this.t && bm.a(this.s)) {
                PhotoContext compress = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().compress(this.s, new c(), 216, 384);
                if (compress != null) {
                    str5 = bm.b(compress.mPhotoLocalPath);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.t = false;
            this.s = "";
            throw th;
        }
        this.t = false;
        this.s = "";
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
