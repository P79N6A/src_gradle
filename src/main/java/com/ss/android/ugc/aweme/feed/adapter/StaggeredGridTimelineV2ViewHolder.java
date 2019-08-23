package com.ss.android.ugc.aweme.feed.adapter;

import android.graphics.Outline;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.widget.NearByPoiLocationLayout;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u001a\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\tH\u0014J \u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0019J\b\u0010*\u001a\u00020%H\u0016J\u0012\u0010+\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020%H\u0016J\b\u0010/\u001a\u00020%H\u0016J\u0012\u00100\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u00102\u001a\u00020\u0005H\u0016J\b\u00103\u001a\u00020%H\u0016J\b\u00104\u001a\u00020%H\u0002J\b\u00105\u001a\u00020\u0019H\u0016J\u0010\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\u0019H\u0016J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020\u0019H\u0016J\u0010\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020\u001fH\u0016J\u0010\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u0019H\u0016J\b\u0010>\u001a\u00020%H\u0016J\b\u0010?\u001a\u00020%H\u0016J\b\u0010@\u001a\u00020%H\u0016J\b\u0010A\u001a\u00020%H\u0016J\b\u0010B\u001a\u00020%H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006C"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/StaggeredGridTimelineV2ViewHolder;", "Lcom/ss/android/ugc/aweme/feed/adapter/BaseStaggeredGridTimelineViewHolder;", "itemView", "Landroid/view/View;", "eventLabel", "", "onAwemeClickListener", "Lcom/ss/android/ugc/aweme/challenge/OnAwemeClickListener;", "pageType", "", "viewScrollStateManager", "Lcom/ss/android/ugc/aweme/feed/adapter/StaggeredGridScrollStateManager;", "(Landroid/view/View;Ljava/lang/String;Lcom/ss/android/ugc/aweme/challenge/OnAwemeClickListener;ILcom/ss/android/ugc/aweme/feed/adapter/StaggeredGridScrollStateManager;)V", "mAvatar", "Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;", "mCover", "Lcom/bytedance/lighten/loader/SmartImageView;", "mCoverGroup", "mDescribeView", "Landroid/widget/TextView;", "mDistance", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mDistanceLayout", "mLiveTag", "mLoadDirectly", "", "mPhotoTag", "Landroid/widget/ImageView;", "mPoiLocationLayout", "Lcom/ss/android/ugc/aweme/feed/widget/NearByPoiLocationLayout;", "mWidth", "", "getOnAwemeClickListener", "()Lcom/ss/android/ugc/aweme/challenge/OnAwemeClickListener;", "setOnAwemeClickListener", "(Lcom/ss/android/ugc/aweme/challenge/OnAwemeClickListener;)V", "bind", "", "data", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "position", "loadDirectly", "bindCover", "bindImage", "imageModel", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "bindView", "dropGifMemoryCache", "fillDistanceDesc", "distance", "getAId", "hideCover", "initAccessibility", "isLoadDirectly", "setAttached", "attached", "setLoadDirectly", "b", "setTextAlpha", "alpha", "setUserVisibleHint", "userVisibleHint", "showCover", "tryStartAnimation", "tryStopAnimation", "updateCover", "updateInfo", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StaggeredGridTimelineV2ViewHolder extends BaseStaggeredGridTimelineViewHolder {
    public static ChangeQuickRedirect v;
    private ImageView A;
    private DmtTextView B;
    private View C;
    private AvatarImageView D;
    private NearByPoiLocationLayout E;
    private TextView F;
    private View G;
    private float H = ((float) ((p.b(this.u) - u.a(12.0d)) / 2));
    boolean w;
    @Nullable
    public d x;
    private SmartImageView y;
    private DmtTextView z;

    public final void a(float f2) {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
    }

    public final void a(boolean z2) {
    }

    public final void b(boolean z2) {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void l() {
    }

    public final boolean k() {
        return this.w;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40678, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40678, new Class[0], Void.TYPE);
            return;
        }
        i();
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40685, new Class[0], Void.TYPE);
            return;
        }
        this.y.animate().alpha(0.0f).start();
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40686, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40686, new Class[0], Void.TYPE);
            return;
        }
        this.y.animate().alpha(1.0f).start();
    }

    @NotNull
    public final String j() {
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40679, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, v, false, 40679, new Class[0], String.class);
        } else if (this.g == null) {
            return "";
        } else {
            Object obj = this.g;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            String aid = ((Aweme) obj).getAid();
            Intrinsics.checkExpressionValueIsNotNull(aid, "mData.aid");
            return aid;
        }
    }

    public final void i() {
        UrlModel urlModel;
        if (PatchProxy.isSupport(new Object[0], this, v, false, 40683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, v, false, 40683, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            float f2 = 1.0f;
            this.y.setAlpha(1.0f);
            Object obj = this.g;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            if (((Aweme) obj).isLive()) {
                Object obj2 = this.g;
                Intrinsics.checkExpressionValueIsNotNull(obj2, "mData");
                User author = ((Aweme) obj2).getAuthor();
                if (author != null) {
                    ViewGroup.LayoutParams layoutParams = this.G.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        if (e.b()) {
                            layoutParams2.height = (int) ((this.H * 16.0f) / 9.0f);
                        } else {
                            layoutParams2.height = (int) this.H;
                        }
                        this.G.setLayoutParams(layoutParams2);
                        SmartImageView smartImageView = this.y;
                        if (author.roomCover == null) {
                            urlModel = author.getAvatarLarger();
                        } else {
                            urlModel = author.roomCover;
                        }
                        m.a(smartImageView, urlModel, (int) this.H, layoutParams2.height, "poi");
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
            } else {
                Object obj3 = this.g;
                Intrinsics.checkExpressionValueIsNotNull(obj3, "mData");
                if (((Aweme) obj3).isImage()) {
                    Object obj4 = this.g;
                    Intrinsics.checkExpressionValueIsNotNull(obj4, "mData");
                    List<ImageInfo> imageInfos = ((Aweme) obj4).getImageInfos();
                    if (imageInfos != null && !imageInfos.isEmpty()) {
                        ImageInfo imageInfo = imageInfos.get(0);
                        if (imageInfo != null) {
                            if (imageInfo.getWidth() != 0) {
                                f2 = ((float) imageInfo.getHeight()) / ((float) imageInfo.getWidth());
                            }
                            ViewGroup.LayoutParams layoutParams3 = this.G.getLayoutParams();
                            if (layoutParams3 != null) {
                                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                                layoutParams4.height = (int) (this.H * f2);
                                this.G.setLayoutParams(layoutParams4);
                                m.a(this.y, imageInfo.getLabelLarge(), (int) this.H, layoutParams4.height, "poi");
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    }
                } else {
                    Object obj5 = this.g;
                    Intrinsics.checkExpressionValueIsNotNull(obj5, "mData");
                    Video video = ((Aweme) obj5).getVideo();
                    if (video != null) {
                        Object obj6 = this.g;
                        Intrinsics.checkExpressionValueIsNotNull(obj6, "mData");
                        Video video2 = ((Aweme) obj6).getVideo();
                        Intrinsics.checkExpressionValueIsNotNull(video2, "mData.video");
                        if (video2.getWidth() != 0) {
                            Object obj7 = this.g;
                            Intrinsics.checkExpressionValueIsNotNull(obj7, "mData");
                            Video video3 = ((Aweme) obj7).getVideo();
                            Intrinsics.checkExpressionValueIsNotNull(video3, "mData.video");
                            Object obj8 = this.g;
                            Intrinsics.checkExpressionValueIsNotNull(obj8, "mData");
                            Video video4 = ((Aweme) obj8).getVideo();
                            Intrinsics.checkExpressionValueIsNotNull(video4, "mData.video");
                            f2 = ((float) video3.getHeight()) / ((float) video4.getWidth());
                        }
                        ViewGroup.LayoutParams layoutParams5 = this.G.getLayoutParams();
                        if (layoutParams5 != null) {
                            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                            layoutParams6.height = (int) (this.H * f2);
                            this.G.setLayoutParams(layoutParams6);
                            if (video.getCover() != null) {
                                UrlModel cover = video.getCover();
                                Intrinsics.checkExpressionValueIsNotNull(cover, "video.cover");
                                if (cover.getUrlList() != null) {
                                    UrlModel cover2 = video.getCover();
                                    Intrinsics.checkExpressionValueIsNotNull(cover2, "video.cover");
                                    if (cover2.getUrlList().size() != 0) {
                                        UrlModel cover3 = video.getCover();
                                        Intrinsics.checkExpressionValueIsNotNull(cover3, "video.cover");
                                        if (!TextUtils.isEmpty(cover3.getUrlList().get(0))) {
                                            m.a(this.y, video.getCover(), (int) this.H, layoutParams6.height, "poi");
                                        }
                                    }
                                }
                            }
                            this.y.setImageResource(C0906R.color.a0k);
                            return;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0452  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = v
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 40680(0x9ee8, float:5.7005E-41)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = v
            r5 = 0
            r6 = 40680(0x9ee8, float:5.7005E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.lang.Object r1 = r14.g
            if (r1 != 0) goto L_0x002a
            return
        L_0x002a:
            r14.i()
            java.lang.Object r1 = r14.g
            java.lang.String r2 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            boolean r1 = r1.isLive()
            r2 = 8
            r3 = 1
            if (r1 == 0) goto L_0x006e
            java.lang.Object r1 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.String r1 = r1.getTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x006e
            android.widget.TextView r1 = r14.F
            r1.setVisibility(r0)
            android.widget.TextView r1 = r14.F
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            java.lang.String r4 = r4.getTitle()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
            goto L_0x009c
        L_0x006e:
            java.lang.Object r1 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.String r1 = r1.getDesc()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x009e
            android.widget.TextView r1 = r14.F
            r1.setVisibility(r0)
            android.widget.TextView r1 = r14.F
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            java.lang.String r4 = r4.getDesc()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r1.setText(r4)
        L_0x009c:
            r1 = 1
            goto L_0x00a4
        L_0x009e:
            android.widget.TextView r1 = r14.F
            r1.setVisibility(r2)
            r1 = 0
        L_0x00a4:
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            if (r4 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r14.D
            java.lang.Object r5 = r14.g
            java.lang.String r6 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            java.lang.String r6 = "mData.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r5.getAvatarThumb()
            r4.a(r5)
        L_0x00ce:
            android.widget.ImageView r4 = r14.A
            java.lang.Object r5 = r14.g
            java.lang.String r6 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            boolean r5 = r5.isImage()
            if (r5 == 0) goto L_0x00f0
            java.lang.Object r5 = r14.g
            java.lang.String r6 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            boolean r5 = r5.isLive()
            if (r5 != 0) goto L_0x00f0
            r5 = 0
            goto L_0x00f2
        L_0x00f0:
            r5 = 8
        L_0x00f2:
            r4.setVisibility(r5)
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            if (r4 == 0) goto L_0x013f
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            java.lang.String r5 = "mData.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.String r4 = r4.getRoomTypeTag()
            if (r4 == 0) goto L_0x013f
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r14.z
            r4.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r14.z
            java.lang.Object r5 = r14.g
            java.lang.String r6 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            java.lang.String r6 = "mData.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            java.lang.String r5 = r5.getRoomTypeTag()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            goto L_0x0161
        L_0x013f:
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            boolean r4 = r4.isLive()
            if (r4 == 0) goto L_0x015c
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r14.z
            r4.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r14.z
            r5 = 2131562656(0x7f0d10a0, float:1.8750747E38)
            r4.setText(r5)
            goto L_0x0161
        L_0x015c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r14.z
            r4.setVisibility(r2)
        L_0x0161:
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r4.getPoiStruct()
            if (r4 == 0) goto L_0x01a0
            boolean r5 = com.ss.android.ugc.aweme.poi.e.e.d()
            if (r5 == 0) goto L_0x01a0
            com.ss.android.ugc.aweme.feed.widget.NearByPoiLocationLayout r5 = r14.E
            r5.setVisibility(r0)
            com.ss.android.ugc.aweme.feed.widget.NearByPoiLocationLayout r5 = r14.E
            r5.setData(r4)
            com.ss.android.ugc.aweme.feed.widget.NearByPoiLocationLayout r4 = r14.E
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x0198
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            if (r1 == 0) goto L_0x018f
            r4.bottomMargin = r0
            goto L_0x01a5
        L_0x018f:
            r5 = 4629700416936869888(0x4040000000000000, double:32.0)
            int r1 = com.ss.android.ugc.aweme.base.utils.u.a((double) r5)
            r4.bottomMargin = r1
            goto L_0x01a5
        L_0x0198:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x01a0:
            com.ss.android.ugc.aweme.feed.widget.NearByPoiLocationLayout r1 = r14.E
            r1.setVisibility(r2)
        L_0x01a5:
            boolean r1 = com.ss.android.ugc.aweme.feed.c.e()
            if (r1 == 0) goto L_0x01db
            java.lang.Object r1 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.String r1 = r1.getDistance()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01c1
            goto L_0x01db
        L_0x01c1:
            android.view.View r1 = r14.C
            r1.setVisibility(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.B
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.String r2 = r2.getDistance()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            goto L_0x01e0
        L_0x01db:
            android.view.View r1 = r14.C
            r1.setVisibility(r2)
        L_0x01e0:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = v
            r7 = 0
            r8 = 40681(0x9ee9, float:5.7006E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0204
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = v
            r7 = 0
            r8 = 40681(0x9ee9, float:5.7006E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0204:
            java.lang.Object r1 = r14.g
            if (r1 == 0) goto L_0x0469
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.String r2 = r2.getDistance()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = v
            r7 = 0
            r8 = 40682(0x9eea, float:5.7008E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r0] = r5
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = r14
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x024e
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r7 = v
            r8 = 0
            r9 = 40682(0x9eea, float:5.7008E-41)
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r10[r0] = r2
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r6 = r14
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x02fd
        L_0x024e:
            java.lang.String r4 = ""
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x02fc
            if (r2 != 0) goto L_0x025e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x025e:
            if (r2 == 0) goto L_0x02f4
            java.lang.String r5 = r2.toLowerCase()
            java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            r7 = r5
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r8 = "km"
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            int r5 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r7, (java.lang.String) r8, (int) r9, (boolean) r10, (int) r11, (java.lang.Object) r12)
            java.lang.String r6 = r2.toLowerCase()
            java.lang.String r7 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r7)
            r8 = r6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.String r9 = "m"
            r11 = 0
            r12 = 6
            r13 = 0
            int r6 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r8, (java.lang.String) r9, (int) r10, (boolean) r11, (int) r12, (java.lang.Object) r13)
            r7 = -1
            if (r5 == r7) goto L_0x02c0
            android.content.Context r4 = r14.u
            java.lang.String r6 = "mContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r6)
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131562652(0x7f0d109c, float:1.8750739E38)
            java.lang.String r4 = r4.getString(r6)
            java.lang.String r6 = "mContext.resources.getSt…ng.staggered_distance_km)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r6)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r2 = r2.substring(r0, r5)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            r6[r0] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r3)
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            goto L_0x02fd
        L_0x02c0:
            if (r6 == r7) goto L_0x02fc
            android.content.Context r4 = r14.u
            java.lang.String r5 = "mContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131562653(0x7f0d109d, float:1.875074E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "mContext.resources.getSt…ing.staggered_distance_m)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r2 = r2.substring(r0, r6)
            java.lang.String r6 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r6)
            r5[r0] = r2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r3)
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.String r4 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            goto L_0x02fd
        L_0x02f4:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x02fc:
            r2 = r4
        L_0x02fd:
            android.view.View r4 = r14.C
            r5 = r2
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setContentDescription(r5)
            r1.append(r2)
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            boolean r2 = r2.isLive()
            if (r2 == 0) goto L_0x0351
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.String r2 = r2.getTitle()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0351
            android.widget.TextView r2 = r14.F
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            java.lang.String r4 = r4.getTitle()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setContentDescription(r4)
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.String r2 = r2.getTitle()
            r1.append(r2)
            goto L_0x0394
        L_0x0351:
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.String r2 = r2.getDesc()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x038b
            android.widget.TextView r2 = r14.F
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            java.lang.String r4 = r4.getDesc()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setContentDescription(r4)
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.String r2 = r2.getDesc()
            r1.append(r2)
            goto L_0x0394
        L_0x038b:
            android.widget.TextView r2 = r14.F
            java.lang.String r4 = ""
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setContentDescription(r4)
        L_0x0394:
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            if (r2 == 0) goto L_0x03fd
            java.lang.Object r2 = r14.g
            java.lang.String r4 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getAuthor()
            java.lang.String r4 = "mData.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            java.lang.String r2 = r2.getRemarkName()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03df
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r14.D
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            java.lang.String r5 = "mData.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.String r4 = r4.getRemarkName()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setContentDescription(r4)
            goto L_0x0406
        L_0x03df:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r14.D
            java.lang.Object r4 = r14.g
            java.lang.String r5 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = (com.ss.android.ugc.aweme.feed.model.Aweme) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            java.lang.String r5 = "mData.author"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.String r4 = r4.getNickname()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setContentDescription(r4)
            goto L_0x0406
        L_0x03fd:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r14.D
            java.lang.String r4 = ""
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setContentDescription(r4)
        L_0x0406:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0452
            android.content.Context r2 = r14.u
            java.lang.String r4 = "mContext"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131562651(0x7f0d109b, float:1.8750737E38)
            java.lang.String r2 = r2.getString(r4)
            java.lang.String r4 = "mContext.resources.getSt…string.staggered_content)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r0 = java.lang.String.format(r2, r0)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.view.View r1 = r14.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setContentDescription(r0)
            android.view.View r1 = r14.G
            r1.setContentDescription(r0)
            return
        L_0x0452:
            android.view.View r0 = r14.itemView
            java.lang.String r1 = "itemView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setContentDescription(r1)
            android.view.View r0 = r14.G
            java.lang.String r1 = ""
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setContentDescription(r1)
        L_0x0469:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.StaggeredGridTimelineV2ViewHolder.b():void");
    }

    public final void d(boolean z2) {
        this.w = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StaggeredGridTimelineV2ViewHolder(@NotNull final View view, @Nullable final String str, @Nullable d dVar, int i, @Nullable z zVar) {
        super(str, i, view, zVar);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.x = dVar;
        View findViewById = view.findViewById(C0906R.id.a1a);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.cover)");
        this.y = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(C0906R.id.bf7);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.live_tag)");
        this.z = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(C0906R.id.b3v);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.iv_photo)");
        this.A = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(C0906R.id.dmw);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.id.txt_distance)");
        this.B = (DmtTextView) findViewById4;
        View findViewById5 = view.findViewById(C0906R.id.dmy);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "itemView.findViewById(R.id.txt_distance_layout)");
        this.C = findViewById5;
        View findViewById6 = view.findViewById(C0906R.id.hk);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "itemView.findViewById(R.id.avatar)");
        this.D = (AvatarImageView) findViewById6;
        View findViewById7 = view.findViewById(C0906R.id.bq3);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "itemView.findViewById(R.id.neayby_poi_layout)");
        this.E = (NearByPoiLocationLayout) findViewById7;
        View findViewById8 = view.findViewById(C0906R.id.ds9);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "itemView.findViewById(R.id.video_info)");
        this.F = (TextView) findViewById8;
        View findViewById9 = view.findViewById(C0906R.id.a1d);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "itemView.findViewById(R.id.cover_group)");
        this.G = findViewById9;
        view.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44798a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ StaggeredGridTimelineV2ViewHolder f44799b;

            {
                this.f44799b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44798a, false, 40687, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44798a, false, 40687, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) this.f44799b.g) != null) {
                    Aweme aweme = (Aweme) this.f44799b.g;
                    Intrinsics.checkExpressionValueIsNotNull(aweme, "mData");
                    if (aweme.getStatus() != null) {
                        Aweme aweme2 = (Aweme) this.f44799b.g;
                        Intrinsics.checkExpressionValueIsNotNull(aweme2, "mData");
                        AwemeStatus status = aweme2.getStatus();
                        Intrinsics.checkExpressionValueIsNotNull(status, "mData.status");
                        if (status.isDelete()) {
                            a.c(view.getContext(), (int) C0906R.string.dr2).a();
                            return;
                        }
                    }
                    if (this.f44799b.x != null) {
                        d dVar = this.f44799b.x;
                        if (dVar != null) {
                            dVar.a(view, (Aweme) this.f44799b.g, str);
                        }
                    }
                }
            }
        });
        this.G.setOnClickListener(new View.OnClickListener(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44802a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ StaggeredGridTimelineV2ViewHolder f44803b;

            {
                this.f44803b = r1;
            }

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f44802a, false, 40688, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f44802a, false, 40688, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (((Aweme) this.f44803b.g) != null) {
                    Aweme aweme = (Aweme) this.f44803b.g;
                    Intrinsics.checkExpressionValueIsNotNull(aweme, "mData");
                    if (aweme.getStatus() != null) {
                        Aweme aweme2 = (Aweme) this.f44803b.g;
                        Intrinsics.checkExpressionValueIsNotNull(aweme2, "mData");
                        AwemeStatus status = aweme2.getStatus();
                        Intrinsics.checkExpressionValueIsNotNull(status, "mData.status");
                        if (status.isDelete()) {
                            a.c(view.getContext(), (int) C0906R.string.dr2).a();
                            return;
                        }
                    }
                    if (this.f44803b.x != null) {
                        d dVar = this.f44803b.x;
                        if (dVar != null) {
                            dVar.a(view, (Aweme) this.f44803b.g, str);
                        }
                    }
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 21) {
            this.y.setOutlineProvider(new ViewOutlineProvider() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f44806a;

                @RequiresApi(api = 21)
                public final void getOutline(@NotNull View view, @NotNull Outline outline) {
                    View view2 = view;
                    Outline outline2 = outline;
                    if (PatchProxy.isSupport(new Object[]{view2, outline2}, this, f44806a, false, 40689, new Class[]{View.class, Outline.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2, outline2}, this, f44806a, false, 40689, new Class[]{View.class, Outline.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(view2, "view");
                    Intrinsics.checkParameterIsNotNull(outline2, "outline");
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 4.0f);
                }
            });
            this.y.setClipToOutline(true);
        }
    }
}
