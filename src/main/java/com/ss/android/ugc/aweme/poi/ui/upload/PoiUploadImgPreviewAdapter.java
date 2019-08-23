package com.ss.android.ugc.aweme.poi.ui.upload;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.SquareImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0015\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImgPreviewAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImgPreviewAdapter$PoiUploadImgPreviewViewHolder;", "uriList", "", "", "(Ljava/util/List;)V", "showNickName", "", "getShowNickName", "()Z", "setShowNickName", "(Z)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "PoiUploadImgPreviewViewHolder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiUploadImgPreviewAdapter extends RecyclerView.Adapter<PoiUploadImgPreviewViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60952a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f60953b = true;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f60954c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/PoiUploadImgPreviewAdapter$PoiUploadImgPreviewViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bottomDivider", "topDivider", "uploadImage", "Lcom/ss/android/ugc/aweme/base/ui/SquareImageView;", "userNickName", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bind", "", "uri", "", "position", "", "size", "showNickName", "", "show", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class PoiUploadImgPreviewViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60955a;

        /* renamed from: b  reason: collision with root package name */
        SquareImageView f60956b;

        /* renamed from: c  reason: collision with root package name */
        DmtTextView f60957c;

        /* renamed from: d  reason: collision with root package name */
        View f60958d;

        /* renamed from: e  reason: collision with root package name */
        View f60959e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PoiUploadImgPreviewViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(C0906R.id.c43);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.poi_upload_img)");
            this.f60956b = (SquareImageView) findViewById;
            View findViewById2 = view.findViewById(C0906R.id.dq8);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.user_nick_name)");
            this.f60957c = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(C0906R.id.d58);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.top_divider)");
            this.f60958d = findViewById3;
            View findViewById4 = view.findViewById(C0906R.id.mb);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.bottom_divider)");
            this.f60959e = findViewById4;
        }
    }

    public final int getItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f60952a, false, 66770, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60952a, false, 66770, new Class[0], Integer.TYPE)).intValue();
        }
        List<String> list = this.f60954c;
        if (list != null) {
            i = list.size();
        }
        return i;
    }

    public PoiUploadImgPreviewAdapter(@Nullable List<String> list) {
        this.f60954c = list;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        PoiUploadImgPreviewViewHolder poiUploadImgPreviewViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f60952a, false, 66767, new Class[]{ViewGroup.class, Integer.TYPE}, PoiUploadImgPreviewViewHolder.class)) {
            poiUploadImgPreviewViewHolder = (PoiUploadImgPreviewViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f60952a, false, 66767, new Class[]{ViewGroup.class, Integer.TYPE}, PoiUploadImgPreviewViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a1a, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            poiUploadImgPreviewViewHolder = new PoiUploadImgPreviewViewHolder(inflate);
        }
        return poiUploadImgPreviewViewHolder;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(@NotNull PoiUploadImgPreviewViewHolder poiUploadImgPreviewViewHolder, int i) {
        String str;
        float f2;
        float f3;
        PoiUploadImgPreviewViewHolder poiUploadImgPreviewViewHolder2 = poiUploadImgPreviewViewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{poiUploadImgPreviewViewHolder2, Integer.valueOf(i)}, this, f60952a, false, 66768, new Class[]{PoiUploadImgPreviewViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiUploadImgPreviewViewHolder2, Integer.valueOf(i)}, this, f60952a, false, 66768, new Class[]{PoiUploadImgPreviewViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(poiUploadImgPreviewViewHolder2, "holder");
        List<String> list = this.f60954c;
        if (list != null) {
            str = list.get(i2);
        } else {
            str = null;
        }
        String str2 = str;
        int itemCount = getItemCount();
        boolean z = this.f60953b;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(itemCount), Byte.valueOf(z ? (byte) 1 : 0)}, poiUploadImgPreviewViewHolder, PoiUploadImgPreviewViewHolder.f60955a, false, 66771, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PoiUploadImgPreviewViewHolder poiUploadImgPreviewViewHolder3 = poiUploadImgPreviewViewHolder;
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(itemCount), Byte.valueOf(z)}, poiUploadImgPreviewViewHolder3, PoiUploadImgPreviewViewHolder.f60955a, false, 66771, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (i2 == 0) {
            View view = poiUploadImgPreviewViewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            f2 = UIUtils.dip2Px(view.getContext(), 16.0f);
        } else {
            View view2 = poiUploadImgPreviewViewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            f2 = UIUtils.dip2Px(view2.getContext(), 8.0f);
        }
        ViewGroup.LayoutParams layoutParams = poiUploadImgPreviewViewHolder2.f60958d.getLayoutParams();
        layoutParams.height = (int) f2;
        poiUploadImgPreviewViewHolder2.f60958d.setLayoutParams(layoutParams);
        if (i2 == itemCount - 1) {
            View view3 = poiUploadImgPreviewViewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            f3 = UIUtils.dip2Px(view3.getContext(), 16.0f);
        } else {
            View view4 = poiUploadImgPreviewViewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            f3 = UIUtils.dip2Px(view4.getContext(), 8.0f);
        }
        ViewGroup.LayoutParams layoutParams2 = poiUploadImgPreviewViewHolder2.f60959e.getLayoutParams();
        layoutParams2.height = (int) f3;
        poiUploadImgPreviewViewHolder2.f60959e.setLayoutParams(layoutParams2);
        if (str2 != null) {
            c.a((RemoteImageView) poiUploadImgPreviewViewHolder2.f60956b, "file://" + str2);
        }
        if (z) {
            poiUploadImgPreviewViewHolder2.f60957c.setVisibility(0);
            DmtTextView dmtTextView = poiUploadImgPreviewViewHolder2.f60957c;
            View view5 = poiUploadImgPreviewViewHolder2.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
            String string = view5.getContext().getString(C0906R.string.aie);
            Intrinsics.checkExpressionValueIsNotNull(string, "itemView.context.getStri….string.friends_nickname)");
            IAccountUserService a2 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            User curUser = a2.getCurUser();
            Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
            String format = String.format(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            dmtTextView.setText(format);
            return;
        }
        poiUploadImgPreviewViewHolder2.f60957c.setVisibility(8);
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        List list2 = list;
        PoiUploadImgPreviewViewHolder poiUploadImgPreviewViewHolder = (PoiUploadImgPreviewViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{poiUploadImgPreviewViewHolder, Integer.valueOf(i), list2}, this, f60952a, false, 66769, new Class[]{PoiUploadImgPreviewViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiUploadImgPreviewViewHolder, Integer.valueOf(i), list2}, this, f60952a, false, 66769, new Class[]{PoiUploadImgPreviewViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(poiUploadImgPreviewViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(poiUploadImgPreviewViewHolder, i);
            return;
        }
        Object obj = list2.get(0);
        if (obj != null) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : 0)}, poiUploadImgPreviewViewHolder, PoiUploadImgPreviewViewHolder.f60955a, false, 66772, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PoiUploadImgPreviewViewHolder poiUploadImgPreviewViewHolder2 = poiUploadImgPreviewViewHolder;
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(booleanValue)}, poiUploadImgPreviewViewHolder2, PoiUploadImgPreviewViewHolder.f60955a, false, 66772, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else if (booleanValue) {
                poiUploadImgPreviewViewHolder.f60957c.setVisibility(0);
                DmtTextView dmtTextView = poiUploadImgPreviewViewHolder.f60957c;
                View view = poiUploadImgPreviewViewHolder.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                String string = view.getContext().getString(C0906R.string.aie);
                Intrinsics.checkExpressionValueIsNotNull(string, "itemView.context.getStri….string.friends_nickname)");
                IAccountUserService a2 = d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                User curUser = a2.getCurUser();
                Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
                String format = String.format(string, Arrays.copyOf(new Object[]{curUser.getNickname()}, 1));
                Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                dmtTextView.setText(format);
            } else {
                poiUploadImgPreviewViewHolder.f60957c.setVisibility(8);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        }
    }
}
