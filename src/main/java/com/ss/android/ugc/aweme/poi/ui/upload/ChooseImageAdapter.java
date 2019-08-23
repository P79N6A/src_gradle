package com.ss.android.ugc.aweme.poi.ui.upload;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003456B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0006H\u0016J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0006H\u0002J\u0018\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0006H\u0016J&\u0010'\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00062\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0012H\u0016J\u0018\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0018\u0010-\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0002H\u0002J\u0010\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u000201H\u0002J\u0014\u00102\u001a\u00020\u001e2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00067"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter$ChooseImageViewHolder;", "context", "Landroid/content/Context;", "numColumns", "", "itemRatio", "", "horizontalSpacing", "", "padding", "selectListener", "Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter$SelectUploadImageListener;", "(Landroid/content/Context;IDFILcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter$SelectUploadImageListener;)V", "getContext", "()Landroid/content/Context;", "filePathList", "", "", "mImageSelectedIndex", "mItemSize", "mSelectedImage", "getMSelectedImage", "()Ljava/util/List;", "setMSelectedImage", "(Ljava/util/List;)V", "getSelectListener", "()Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter$SelectUploadImageListener;", "bindImageViewHolder", "", "holder", "position", "needBind", "", "getItemCount", "handleImageSelected", "initSelectedIndex", "size", "onBindViewHolder", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "refreshSelectedState", "selectedIndex", "resizeView", "view", "Landroid/view/View;", "setData", "filePaths", "ChooseImageViewHolder", "Companion", "SelectUploadImageListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ChooseImageAdapter extends RecyclerView.Adapter<ChooseImageViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60914a;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final List<String> f60915b;

    /* renamed from: c  reason: collision with root package name */
    List<Integer> f60916c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f60917d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final Context f60918e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final b f60919f;
    private int h;
    private final double i = 1.0d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter$ChooseImageViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mFlImageSelectIndicator", "Landroid/widget/FrameLayout;", "getMFlImageSelectIndicator", "()Landroid/widget/FrameLayout;", "mImageSelectIndicator", "Landroid/widget/TextView;", "mImageUrl", "", "getMImageUrl", "()Ljava/lang/String;", "setMImageUrl", "(Ljava/lang/String;)V", "mImageView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "getMImageView", "()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mShadowView", "getMShadowView", "()Landroid/view/View;", "setIndex", "", "selectedIndex", "", "setUnselected", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class ChooseImageViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60920a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String f60921b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final RemoteImageView f60922c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public final FrameLayout f60923d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public final View f60924e;

        /* renamed from: f  reason: collision with root package name */
        private final TextView f60925f;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f60920a, false, 66734, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60920a, false, 66734, new Class[0], Void.TYPE);
                return;
            }
            this.f60925f.setText("");
            this.f60925f.setBackgroundResource(2130838038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ChooseImageViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            View findViewById = view.findViewById(C0906R.id.bm8);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.media_view)");
            this.f60922c = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(C0906R.id.arj);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.image_select_indicator)");
            this.f60925f = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0906R.id.afr);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.…l_image_select_indicator)");
            this.f60923d = (FrameLayout) findViewById3;
            View findViewById4 = view.findViewById(C0906R.id.cp0);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.shadow_view)");
            this.f60924e = findViewById4;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60920a, false, 66733, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60920a, false, 66733, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f60925f.setText(String.valueOf(i + 1));
            this.f60925f.setBackgroundResource(2130838039);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter$Companion;", "", "()V", "MAX_SELECTED_IMAGE_COUNT", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter$SelectUploadImageListener;", "", "selectImage", "", "count", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60926a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseImageAdapter f60927b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f60928c;

        c(ChooseImageAdapter chooseImageAdapter, String str) {
            this.f60927b = chooseImageAdapter;
            this.f60928c = str;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60926a, false, 66735, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60926a, false, 66735, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Context context = this.f60927b.f60918e;
            if (context != null) {
                HeaderDetailActivity.a((Activity) context, view, (((float) UIUtils.getScreenWidth(this.f60927b.f60918e)) * 1.0f) / ((float) UIUtils.getScreenHeight(this.f60927b.f60918e)), null, false, null, this.f60928c);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60929a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseImageAdapter f60930b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ChooseImageViewHolder f60931c;

        d(ChooseImageAdapter chooseImageAdapter, ChooseImageViewHolder chooseImageViewHolder) {
            this.f60930b = chooseImageAdapter;
            this.f60931c = chooseImageViewHolder;
        }

        public final void onClick(View view) {
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            Integer num6;
            Integer num7;
            if (PatchProxy.isSupport(new Object[]{view}, this, f60929a, false, 66736, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60929a, false, 66736, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ChooseImageAdapter chooseImageAdapter = this.f60930b;
            ChooseImageViewHolder chooseImageViewHolder = this.f60931c;
            int adapterPosition = this.f60931c.getAdapterPosition();
            Integer num8 = null;
            if (PatchProxy.isSupport(new Object[]{chooseImageViewHolder, Integer.valueOf(adapterPosition)}, chooseImageAdapter, ChooseImageAdapter.f60914a, false, 66732, new Class[]{ChooseImageViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{chooseImageViewHolder, Integer.valueOf(adapterPosition)}, chooseImageAdapter, ChooseImageAdapter.f60914a, false, 66732, new Class[]{ChooseImageViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else {
                List<Integer> list = chooseImageAdapter.f60917d;
                if (list != null) {
                    num = Integer.valueOf(list.indexOf(Integer.valueOf(adapterPosition)));
                } else {
                    num = null;
                }
                if (num == null) {
                    Intrinsics.throwNpe();
                }
                int intValue = num.intValue();
                if (intValue >= 0) {
                    List<Integer> list2 = chooseImageAdapter.f60916c;
                    if (list2 != null) {
                        list2.set(adapterPosition, -1);
                    }
                    chooseImageViewHolder.a();
                    chooseImageViewHolder.f60924e.animate().alpha(0.0f).setDuration(300).withEndAction(new e(chooseImageAdapter, chooseImageViewHolder, adapterPosition)).start();
                    chooseImageViewHolder.f60922c.animate().scaleY(1.0f).scaleX(1.0f).setDuration(300).start();
                    List<Integer> list3 = chooseImageAdapter.f60917d;
                    if (list3 != null) {
                        list3.remove(Integer.valueOf(adapterPosition));
                    }
                    List<Integer> list4 = chooseImageAdapter.f60917d;
                    if (list4 != null) {
                        num5 = Integer.valueOf(list4.size());
                    } else {
                        num5 = null;
                    }
                    if (num5 == null) {
                        Intrinsics.throwNpe();
                    }
                    int intValue2 = num5.intValue();
                    while (intValue < intValue2) {
                        List<Integer> list5 = chooseImageAdapter.f60916c;
                        if (list5 != null) {
                            List<Integer> list6 = chooseImageAdapter.f60917d;
                            if (list6 != null) {
                                num7 = list6.get(intValue);
                            } else {
                                num7 = null;
                            }
                            if (num7 == null) {
                                Intrinsics.throwNpe();
                            }
                            list5.set(num7.intValue(), Integer.valueOf(intValue));
                        }
                        if (intValue2 != 4) {
                            List<Integer> list7 = chooseImageAdapter.f60917d;
                            if (list7 != null) {
                                num6 = list7.get(intValue);
                            } else {
                                num6 = null;
                            }
                            if (num6 == null) {
                                Intrinsics.throwNpe();
                            }
                            chooseImageAdapter.notifyItemChanged(num6.intValue(), Boolean.FALSE);
                        }
                        intValue++;
                    }
                    if (intValue2 == 4) {
                        chooseImageAdapter.notifyDataSetChanged();
                    }
                } else {
                    List<Integer> list8 = chooseImageAdapter.f60917d;
                    if (list8 != null) {
                        num2 = Integer.valueOf(list8.size());
                    } else {
                        num2 = null;
                    }
                    if (num2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (num2.intValue() >= 5) {
                        Context context = chooseImageAdapter.f60918e;
                        String string = chooseImageAdapter.f60918e.getString(C0906R.string.t4);
                        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…se_upload_photos_at_most)");
                        String format = String.format(string, Arrays.copyOf(new Object[]{5}, 1));
                        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
                        com.bytedance.ies.dmt.ui.d.a.b(context, format).a();
                    } else {
                        List<Integer> list9 = chooseImageAdapter.f60917d;
                        if (list9 != null) {
                            list9.add(Integer.valueOf(adapterPosition));
                        }
                        List<Integer> list10 = chooseImageAdapter.f60917d;
                        if (list10 != null) {
                            num3 = Integer.valueOf(list10.size());
                        } else {
                            num3 = null;
                        }
                        if (num3 == null) {
                            Intrinsics.throwNpe();
                        }
                        chooseImageViewHolder.a(num3.intValue() - 1);
                        List<Integer> list11 = chooseImageAdapter.f60917d;
                        if (list11 != null) {
                            num4 = Integer.valueOf(list11.size());
                        } else {
                            num4 = null;
                        }
                        if (num4 == null) {
                            Intrinsics.throwNpe();
                        }
                        int intValue3 = num4.intValue();
                        List<Integer> list12 = chooseImageAdapter.f60916c;
                        if (list12 != null) {
                            list12.set(adapterPosition, Integer.valueOf(intValue3 - 1));
                        }
                        chooseImageViewHolder.f60922c.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new f(chooseImageAdapter, intValue3, adapterPosition)).start();
                        chooseImageViewHolder.f60924e.setAlpha(0.0f);
                        chooseImageViewHolder.f60924e.setVisibility(0);
                        chooseImageViewHolder.f60924e.animate().alpha(1.0f).setDuration(300).start();
                    }
                }
            }
            b bVar = this.f60930b.f60919f;
            if (bVar != null) {
                List<Integer> list13 = this.f60930b.f60917d;
                if (list13 != null) {
                    num8 = Integer.valueOf(list13.size());
                }
                if (num8 == null) {
                    Intrinsics.throwNpe();
                }
                bVar.a(num8.intValue());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60932a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseImageAdapter f60933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ChooseImageViewHolder f60934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f60935d;

        e(ChooseImageAdapter chooseImageAdapter, ChooseImageViewHolder chooseImageViewHolder, int i) {
            this.f60933b = chooseImageAdapter;
            this.f60934c = chooseImageViewHolder;
            this.f60935d = i;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f60932a, false, 66737, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60932a, false, 66737, new Class[0], Void.TYPE);
                return;
            }
            this.f60934c.f60924e.setVisibility(4);
            this.f60934c.f60924e.setAlpha(1.0f);
            this.f60933b.notifyItemChanged(this.f60935d, Boolean.FALSE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60936a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseImageAdapter f60937b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f60938c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f60939d;

        f(ChooseImageAdapter chooseImageAdapter, int i, int i2) {
            this.f60937b = chooseImageAdapter;
            this.f60938c = i;
            this.f60939d = i2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f60936a, false, 66738, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60936a, false, 66738, new Class[0], Void.TYPE);
            } else if (this.f60938c == 5) {
                this.f60937b.notifyDataSetChanged();
            } else {
                this.f60937b.notifyItemChanged(this.f60939d, Boolean.FALSE);
            }
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f60914a, false, 66727, new Class[0], Integer.TYPE)) {
            return this.f60915b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f60914a, false, 66727, new Class[0], Integer.TYPE)).intValue();
    }

    private final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f60914a, false, 66731, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f60914a, false, 66731, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams == null || layoutParams.width == this.h)) {
            int i2 = layoutParams.height;
            double d2 = (double) this.h;
            double d3 = this.i;
            Double.isNaN(d2);
            if (i2 != ((int) (d2 * d3))) {
                layoutParams.width = this.h;
                double d4 = (double) this.h;
                double d5 = this.i;
                Double.isNaN(d4);
                layoutParams.height = (int) (d4 * d5);
            }
        }
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        ChooseImageViewHolder chooseImageViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f60914a, false, 66723, new Class[]{ViewGroup.class, Integer.TYPE}, ChooseImageViewHolder.class)) {
            chooseImageViewHolder = (ChooseImageViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f60914a, false, 66723, new Class[]{ViewGroup.class, Integer.TYPE}, ChooseImageViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sn, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            chooseImageViewHolder = new ChooseImageViewHolder(inflate);
        }
        return chooseImageViewHolder;
    }

    private final void a(int i2, ChooseImageViewHolder chooseImageViewHolder) {
        float f2;
        Integer num;
        float f3;
        int i3 = i2;
        ChooseImageViewHolder chooseImageViewHolder2 = chooseImageViewHolder;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), chooseImageViewHolder2}, this, f60914a, false, 66730, new Class[]{Integer.TYPE, ChooseImageViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), chooseImageViewHolder2}, this, f60914a, false, 66730, new Class[]{Integer.TYPE, ChooseImageViewHolder.class}, Void.TYPE);
            return;
        }
        float f4 = 1.0f;
        if (i3 >= 0) {
            chooseImageViewHolder2.a(i3);
            chooseImageViewHolder2.f60924e.setVisibility(0);
            f2 = 1.1f;
        } else {
            chooseImageViewHolder.a();
            chooseImageViewHolder2.f60924e.setVisibility(4);
            List<Integer> list = this.f60917d;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (num == null) {
                Intrinsics.throwNpe();
            }
            if (num.intValue() >= 5) {
                f3 = 0.5f;
            } else {
                f3 = 1.0f;
            }
            f4 = f3;
            f2 = 1.0f;
        }
        if (chooseImageViewHolder2.f60922c.getAlpha() != f4) {
            chooseImageViewHolder2.f60922c.setAlpha(f4);
        }
        if (chooseImageViewHolder2.f60922c.getScaleX() != f2) {
            chooseImageViewHolder2.f60922c.setScaleX(f2);
            chooseImageViewHolder2.f60922c.setScaleY(f2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(@NotNull ChooseImageViewHolder chooseImageViewHolder, int i2) {
        ChooseImageViewHolder chooseImageViewHolder2 = chooseImageViewHolder;
        if (PatchProxy.isSupport(new Object[]{chooseImageViewHolder2, Integer.valueOf(i2)}, this, f60914a, false, 66724, new Class[]{ChooseImageViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{chooseImageViewHolder2, Integer.valueOf(i2)}, this, f60914a, false, 66724, new Class[]{ChooseImageViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(chooseImageViewHolder2, "holder");
        a(chooseImageViewHolder2, i2, true);
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List list) {
        int i3 = i2;
        List list2 = list;
        ChooseImageViewHolder chooseImageViewHolder = (ChooseImageViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{chooseImageViewHolder, Integer.valueOf(i2), list2}, this, f60914a, false, 66726, new Class[]{ChooseImageViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{chooseImageViewHolder, Integer.valueOf(i2), list2}, this, f60914a, false, 66726, new Class[]{ChooseImageViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(chooseImageViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(chooseImageViewHolder, i3);
            return;
        }
        Object obj = list2.get(0);
        if (obj != null) {
            a(chooseImageViewHolder, i3, ((Boolean) obj).booleanValue());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
    }

    private final void a(ChooseImageViewHolder chooseImageViewHolder, int i2, boolean z) {
        Integer num;
        ChooseImageViewHolder chooseImageViewHolder2 = chooseImageViewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{chooseImageViewHolder2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f60914a, false, 66725, new Class[]{ChooseImageViewHolder.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{chooseImageViewHolder2, Integer.valueOf(i2), Byte.valueOf(z)}, this, f60914a, false, 66725, new Class[]{ChooseImageViewHolder.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(chooseImageViewHolder2.f60922c);
        a(chooseImageViewHolder2.f60924e);
        List<Integer> list = this.f60916c;
        if (list != null) {
            num = list.get(i3);
        } else {
            num = null;
        }
        if (num == null) {
            Intrinsics.throwNpe();
        }
        a(num.intValue(), chooseImageViewHolder);
        String str = "file://" + this.f60915b.get(i3);
        if (!TextUtils.equals(chooseImageViewHolder2.f60921b, str) && z) {
            chooseImageViewHolder2.f60921b = str;
            com.ss.android.ugc.aweme.base.c.a(chooseImageViewHolder2.f60922c, chooseImageViewHolder2.f60921b, this.h, this.h);
        }
        chooseImageViewHolder2.itemView.setOnClickListener(new c(this, str));
        chooseImageViewHolder2.f60923d.setOnClickListener(new d(this, chooseImageViewHolder));
    }

    public ChooseImageAdapter(@NotNull Context context, int i2, double d2, float f2, int i3, @Nullable b bVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f60918e = context;
        this.f60919f = bVar;
        this.f60915b = new ArrayList();
        this.f60918e.getResources().getDimensionPixelOffset(C0906R.dimen.ij);
        this.h = ((UIUtils.getScreenWidth(this.f60918e) - (((int) UIUtils.dip2Px(this.f60918e, 1.5f)) * 3)) + 0) / 4;
    }
}
