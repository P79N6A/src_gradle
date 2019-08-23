package com.ss.android.ugc.aweme.poi.ui.upload;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.splash.utils.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.poi.model.ax;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u00012B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u001bH\u0014J\b\u0010 \u001a\u00020\u001bH\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010%\u001a\u00020\u001b2\u000e\u0010&\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u001bH\u0002J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001eH\u0002J\b\u0010/\u001a\u00020\u001bH\u0002J\b\u00100\u001a\u00020\u001bH\u0002J\b\u00101\u001a\u00020\u001bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImagePreviewActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImgView;", "()V", "mAdapter", "Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImgPreviewAdapter;", "mAvatarUriList", "Landroid/util/SparseArray;", "Lcom/ss/android/ugc/aweme/profile/model/AvatarUri;", "mFileNameList", "", "", "mIHandlerList", "Lcom/bytedance/common/utility/collection/WeakHandler$IHandler;", "mMultiUploadFailNum", "Ljava/util/concurrent/atomic/AtomicInteger;", "mMultiUploadSuccessNum", "mPresenter", "Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImgPresenter;", "mUploadImgUriList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "poiId", "showNickName", "", "clickAllowNickName", "", "clickProtocol", "getLayout", "", "init", "initData", "initListener", "onClick", "v", "Landroid/view/View;", "onRequestFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccessResponse", "response", "Lcom/ss/android/ugc/aweme/poi/model/PoiUploadImageResponse;", "postImgUriList", "prepareIHandler", "size", "showFailedToast", "submitImage", "uploadMultiImages", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiUploadImagePreviewActivity extends AmeBaseActivity implements View.OnClickListener, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60940a;
    public static final a w = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    boolean f60941b = true;

    /* renamed from: c  reason: collision with root package name */
    String f60942c;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<AvatarUri> f60943d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f60944e;

    /* renamed from: f  reason: collision with root package name */
    public AtomicInteger f60945f;
    public AtomicInteger g;
    ArrayList<String> u;
    c v;
    private PoiUploadImgPreviewAdapter x;
    private List<WeakHandler.IHandler> y;
    private HashMap z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u0006`\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImagePreviewActivity$Companion;", "", "()V", "MAX_UPLOAD_AVATAR_SIZE", "", "POI_ID", "", "PROTOCOL_URL", "REQ_CODE_UPLOAD_IMG_PREVIEW", "UPLOAD_IMAGE_URI_LIST", "openPoiUploadImgPreviewActivity", "", "poiId", "activity", "Landroid/app/Activity;", "uriList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60946a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImagePreviewActivity$init$1", "Lcom/bytedance/ies/dmt/ui/titlebar/listener/OnTitleBarClickListener;", "onBackClick", "", "view", "Landroid/view/View;", "onEndBtnClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiUploadImagePreviewActivity f60948b;

        public final void b(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f60947a, false, 66763, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f60947a, false, 66763, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
        }

        b(PoiUploadImagePreviewActivity poiUploadImagePreviewActivity) {
            this.f60948b = poiUploadImagePreviewActivity;
        }

        public final void a(@NotNull View view) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f60947a, false, 66762, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f60947a, false, 66762, new Class[]{View.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "view");
            this.f60948b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/os/Message;", "kotlin.jvm.PlatformType", "handleMsg"}, k = 3, mv = {1, 1, 15})
    static final class c implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiUploadImagePreviewActivity f60950b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f60951c;

        c(PoiUploadImagePreviewActivity poiUploadImagePreviewActivity, int i) {
            this.f60950b = poiUploadImagePreviewActivity;
            this.f60951c = i;
        }

        public final void handleMsg(Message message) {
            String str;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f60949a, false, 66764, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f60949a, false, 66764, new Class[]{Message.class}, Void.TYPE);
            } else if (this.f60950b.f60943d != null && this.f60950b.g != null && this.f60950b.f60945f != null && this.f60950b.f60944e != null) {
                if (message2.obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    Context context = this.f60950b;
                    Object obj = message2.obj;
                    if (obj != null) {
                        com.bytedance.ies.dmt.ui.d.a.b(context, ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
                        SparseArray<AvatarUri> sparseArray = this.f60950b.f60943d;
                        if (sparseArray != null) {
                            sparseArray.put(this.f60951c, new AvatarUri());
                        }
                        AtomicInteger atomicInteger = this.f60950b.g;
                        if (atomicInteger != null) {
                            atomicInteger.incrementAndGet();
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                    }
                } else if (message2.obj instanceof AvatarUri) {
                    Object obj2 = message2.obj;
                    if (obj2 != null) {
                        AvatarUri avatarUri = (AvatarUri) obj2;
                        if (j.b(avatarUri.urlList)) {
                            SparseArray<AvatarUri> sparseArray2 = this.f60950b.f60943d;
                            if (sparseArray2 == null) {
                                Intrinsics.throwNpe();
                            }
                            sparseArray2.put(this.f60951c, avatarUri);
                            AtomicInteger atomicInteger2 = this.f60950b.f60945f;
                            if (atomicInteger2 == null) {
                                Intrinsics.throwNpe();
                            }
                            atomicInteger2.incrementAndGet();
                        } else {
                            SparseArray<AvatarUri> sparseArray3 = this.f60950b.f60943d;
                            if (sparseArray3 == null) {
                                Intrinsics.throwNpe();
                            }
                            sparseArray3.put(this.f60951c, new AvatarUri());
                            AtomicInteger atomicInteger3 = this.f60950b.g;
                            if (atomicInteger3 == null) {
                                Intrinsics.throwNpe();
                            }
                            atomicInteger3.incrementAndGet();
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                    }
                } else {
                    SparseArray<AvatarUri> sparseArray4 = this.f60950b.f60943d;
                    if (sparseArray4 == null) {
                        Intrinsics.throwNpe();
                    }
                    sparseArray4.put(this.f60951c, new AvatarUri());
                    AtomicInteger atomicInteger4 = this.f60950b.g;
                    if (atomicInteger4 == null) {
                        Intrinsics.throwNpe();
                    }
                    atomicInteger4.incrementAndGet();
                }
                AtomicInteger atomicInteger5 = this.f60950b.g;
                if (atomicInteger5 == null) {
                    Intrinsics.throwNpe();
                }
                int i = atomicInteger5.get();
                AtomicInteger atomicInteger6 = this.f60950b.f60945f;
                if (atomicInteger6 == null) {
                    Intrinsics.throwNpe();
                }
                int i2 = i + atomicInteger6.get();
                List<String> list = this.f60950b.f60944e;
                if (list != null && i2 == list.size()) {
                    AtomicInteger atomicInteger7 = this.f60950b.f60945f;
                    if (atomicInteger7 == null) {
                        Intrinsics.throwNpe();
                    }
                    int i3 = atomicInteger7.get();
                    List<String> list2 = this.f60950b.f60944e;
                    if (list2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (i3 == list2.size()) {
                        PoiUploadImagePreviewActivity poiUploadImagePreviewActivity = this.f60950b;
                        if (PatchProxy.isSupport(new Object[0], poiUploadImagePreviewActivity, PoiUploadImagePreviewActivity.f60940a, false, 66750, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], poiUploadImagePreviewActivity, PoiUploadImagePreviewActivity.f60940a, false, 66750, new Class[0], Void.TYPE);
                        } else {
                            if (poiUploadImagePreviewActivity.f60943d != null) {
                                poiUploadImagePreviewActivity.u = new ArrayList<>();
                                SparseArray<AvatarUri> sparseArray5 = poiUploadImagePreviewActivity.f60943d;
                                if (sparseArray5 == null) {
                                    Intrinsics.throwNpe();
                                }
                                int size = sparseArray5.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    SparseArray<AvatarUri> sparseArray6 = poiUploadImagePreviewActivity.f60943d;
                                    if (sparseArray6 == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    AvatarUri valueAt = sparseArray6.valueAt(i4);
                                    Intrinsics.checkExpressionValueIsNotNull(valueAt, "avatarUri");
                                    if (!TextUtils.isEmpty(valueAt.uri)) {
                                        ArrayList<String> arrayList = poiUploadImagePreviewActivity.u;
                                        if (arrayList == null) {
                                            Intrinsics.throwNpe();
                                        }
                                        arrayList.add(valueAt.uri);
                                    }
                                }
                                poiUploadImagePreviewActivity.v = new c();
                                c cVar = poiUploadImagePreviewActivity.v;
                                if (cVar == null) {
                                    Intrinsics.throwNpe();
                                }
                                cVar.a(poiUploadImagePreviewActivity);
                                c cVar2 = poiUploadImagePreviewActivity.v;
                                if (cVar2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                cVar2.a(new a());
                                if (poiUploadImagePreviewActivity.f60941b) {
                                    String string = poiUploadImagePreviewActivity.getString(C0906R.string.aie);
                                    Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.friends_nickname)");
                                    IAccountUserService a2 = d.a();
                                    Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                                    User curUser = a2.getCurUser();
                                    Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
                                    str = String.format(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
                                    Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(format, *args)");
                                } else {
                                    str = "";
                                }
                                ArrayList<String> arrayList2 = poiUploadImagePreviewActivity.u;
                                if (arrayList2 == null) {
                                    Intrinsics.throwNpe();
                                }
                                String joinToString$default = CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null);
                                c cVar3 = poiUploadImagePreviewActivity.v;
                                if (cVar3 == null) {
                                    Intrinsics.throwNpe();
                                }
                                cVar3.a(poiUploadImagePreviewActivity.f60942c, joinToString$default, str);
                            }
                        }
                    } else {
                        this.f60950b.c();
                    }
                }
            }
        }
    }

    private View b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60940a, false, 66754, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60940a, false, 66754, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.z == null) {
            this.z = new HashMap();
        }
        View view = (View) this.z.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.z.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final int a() {
        return C0906R.layout.d6;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60940a, false, 66757, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60940a, false, 66757, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onCreate", false);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66758, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f60940a, false, 66759, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f60940a, false, 66759, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66753, new Class[0], Void.TYPE);
            return;
        }
        ((DmtStatusView) b(C0906R.id.cvd)).b();
        Toast toast = new Toast(com.ss.android.ugc.aweme.base.utils.d.a());
        toast.setView(LayoutInflater.from(this).inflate(C0906R.layout.arb, null));
        toast.setDuration(0);
        toast.setGravity(17, 0, 0);
        b.a(toast);
    }

    private final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66748, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.f60944e)) {
            ((DmtStatusView) b(C0906R.id.cvd)).d();
            this.f60945f = new AtomicInteger(0);
            this.g = new AtomicInteger(0);
            this.f60943d = new SparseArray<>();
            List<String> list = this.f60944e;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            a(list.size());
            List<String> list2 = this.f60944e;
            if (list2 == null) {
                Intrinsics.throwNpe();
            }
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                List<String> list3 = this.f60944e;
                if (list3 == null) {
                    Intrinsics.throwNpe();
                }
                String str = list3.get(i);
                if (StringUtils.isEmpty(str)) {
                    SparseArray<AvatarUri> sparseArray = this.f60943d;
                    if (sparseArray == null) {
                        Intrinsics.throwNpe();
                    }
                    sparseArray.put(i, new AvatarUri());
                    AtomicInteger atomicInteger = this.g;
                    if (atomicInteger == null) {
                        Intrinsics.throwNpe();
                    }
                    atomicInteger.incrementAndGet();
                } else if (!new File(str).exists()) {
                    SparseArray<AvatarUri> sparseArray2 = this.f60943d;
                    if (sparseArray2 == null) {
                        Intrinsics.throwNpe();
                    }
                    sparseArray2.put(i, new AvatarUri());
                    AtomicInteger atomicInteger2 = this.g;
                    if (atomicInteger2 == null) {
                        Intrinsics.throwNpe();
                    }
                    atomicInteger2.incrementAndGet();
                } else {
                    IAccountUserService a2 = d.a();
                    List<WeakHandler.IHandler> list4 = this.y;
                    if (list4 == null) {
                        Intrinsics.throwNpe();
                    }
                    a2.uploadAvatar(new WeakHandler(list4.get(i)), "https://aweme.snssdk.com/aweme/v1/upload/image/", 4194304, str, null);
                }
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66741, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66741, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        ((TextTitleBar) b(C0906R.id.d3m)).setTitle((int) C0906R.string.bq0);
        ((TextTitleBar) b(C0906R.id.d3m)).setOnTitleBarClickListener(new b(this));
        Context context = this;
        ((DmtStatusView) b(C0906R.id.cvd)).setBuilder(DmtStatusView.a.a(context).a());
        if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66742, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66742, new Class[0], Void.TYPE);
        } else {
            this.f60944e = getIntent().getStringArrayListExtra("upload_img_uri_list");
            String stringExtra = getIntent().getStringExtra("poi_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f60942c = stringExtra;
            List<String> list = this.f60944e;
            if (list != null) {
                RecyclerView recyclerView = (RecyclerView) b(C0906R.id.c44);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "poi_upload_img_recycler");
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                this.x = new PoiUploadImgPreviewAdapter(list);
                RecyclerView recyclerView2 = (RecyclerView) b(C0906R.id.c44);
                Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "poi_upload_img_recycler");
                recyclerView2.setAdapter(this.x);
            }
            ((ImageView) b(C0906R.id.aq7)).setImageResource(2130839223);
        }
        if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66743, new Class[0], Void.TYPE);
            return;
        }
        View.OnClickListener onClickListener = this;
        ((LinearLayout) b(C0906R.id.ek)).setOnClickListener(onClickListener);
        ((LinearLayout) b(C0906R.id.c8b)).setOnClickListener(onClickListener);
        ((DmtTextView) b(C0906R.id.cx8)).setOnClickListener(onClickListener);
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60940a, false, 66752, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60940a, false, 66752, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        c();
    }

    private final void a(int i) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60940a, false, 66749, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60940a, false, 66749, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y = new ArrayList();
        if (i >= 0) {
            while (true) {
                WeakHandler.IHandler cVar = new c(this, i2);
                List<WeakHandler.IHandler> list = this.y;
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                list.add(cVar);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
    }

    public final void a(@NotNull ax axVar) {
        if (PatchProxy.isSupport(new Object[]{axVar}, this, f60940a, false, 66751, new Class[]{ax.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{axVar}, this, f60940a, false, 66751, new Class[]{ax.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(axVar, "response");
        if (axVar.f59902b) {
            ((DmtStatusView) b(C0906R.id.cvd)).b();
            com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.cgc).a();
            setResult(-1);
            finish();
            return;
        }
        c();
    }

    public final void onClick(@Nullable View view) {
        int i;
        if (PatchProxy.isSupport(new Object[]{view}, this, f60940a, false, 66744, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60940a, false, 66744, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (Intrinsics.areEqual((Object) view, (Object) (LinearLayout) b(C0906R.id.ek))) {
            if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66745, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66745, new Class[0], Void.TYPE);
            } else {
                if (this.f60941b) {
                    this.f60941b = false;
                    PoiUploadImgPreviewAdapter poiUploadImgPreviewAdapter = this.x;
                    if (poiUploadImgPreviewAdapter != null) {
                        poiUploadImgPreviewAdapter.f60953b = this.f60941b;
                    }
                    ((ImageView) b(C0906R.id.aq7)).setImageResource(2130839224);
                } else {
                    this.f60941b = true;
                    PoiUploadImgPreviewAdapter poiUploadImgPreviewAdapter2 = this.x;
                    if (poiUploadImgPreviewAdapter2 != null) {
                        poiUploadImgPreviewAdapter2.f60953b = this.f60941b;
                    }
                    ((ImageView) b(C0906R.id.aq7)).setImageResource(2130839223);
                }
                PoiUploadImgPreviewAdapter poiUploadImgPreviewAdapter3 = this.x;
                if (poiUploadImgPreviewAdapter3 != null) {
                    PoiUploadImgPreviewAdapter poiUploadImgPreviewAdapter4 = this.x;
                    if (poiUploadImgPreviewAdapter4 != null) {
                        i = poiUploadImgPreviewAdapter4.getItemCount();
                    } else {
                        i = 0;
                    }
                    poiUploadImgPreviewAdapter3.notifyItemRangeChanged(0, i, Boolean.valueOf(this.f60941b));
                }
            }
        } else if (Intrinsics.areEqual((Object) view, (Object) (LinearLayout) b(C0906R.id.c8b))) {
            if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66746, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66746, new Class[0], Void.TYPE);
            } else {
                Intent intent = new Intent(this, CrossPlatformActivity.class);
                intent.setData(Uri.parse("https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/protocol/poi_pic.html?ts=" + System.currentTimeMillis()));
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("hide_status_bar", false);
                intent.putExtra("bundle_user_webview_title", true);
                startActivity(intent);
            }
        } else if (Intrinsics.areEqual((Object) view, (Object) (DmtTextView) b(C0906R.id.cx8))) {
            if (PatchProxy.isSupport(new Object[0], this, f60940a, false, 66747, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60940a, false, 66747, new Class[0], Void.TYPE);
                return;
            }
            Context context = this;
            if (!NetworkUtils.b(context)) {
                com.bytedance.ies.dmt.ui.d.a.b(context, (int) C0906R.string.bgf).a();
            } else if (this.f60944e != null) {
                d();
            }
        }
    }
}
