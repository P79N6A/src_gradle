package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.text.BidiFormatter;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.challenge.ui.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.d.ac;
import com.ss.android.ugc.aweme.profile.d.m;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.presenter.a;
import com.ss.android.ugc.aweme.profile.presenter.l;
import com.ss.android.ugc.aweme.profile.ui.DecorationAdapter;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.aweme.utils.t;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.io.File;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class UpdateAvatarDialog extends UpdateUserInfoDialog implements l, DecorationAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62362a;
    private static final int[] p = {2130840335, 2130840336, 2130840337, 2130840338};
    private static final int[] q = {2130840330, 2130840331, 2130840332, 2130840333};
    private static final int[] r = {2130840340, 2130840341, 2130840342, 2130840343};

    /* renamed from: b  reason: collision with root package name */
    protected a f62363b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f62364c;
    private DecorationAdapter i;
    @BindView(2131494180)
    ImageView ivDisclaimer;
    private List<Integer> j = new ArrayList();
    private Activity k;
    private boolean l;
    private boolean m;
    @BindView(2131493178)
    View mAvatarContainer;
    @BindView(2131496472)
    ImageView mAvatarDecoration;
    @BindView(2131496471)
    AvatarImageView mAvatarImageView;
    @BindView(2131493185)
    RecyclerView mDecorationRecyclerView;
    @BindView(2131496378)
    TextView mPolicyDes;
    @BindView(2131494179)
    ViewGroup mVpExpandContainer;
    private int n = -1;
    private int o;
    @BindView(2131494181)
    TextView txtDisclaimer;

    class AvatarDecoration extends RecyclerView.ItemDecoration {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f62366a;

        private AvatarDecoration() {
        }

        /* synthetic */ AvatarDecoration(UpdateAvatarDialog updateAvatarDialog, byte b2) {
            this();
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
            int i;
            int i2;
            Rect rect2 = rect;
            View view2 = view;
            RecyclerView recyclerView2 = recyclerView;
            if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state}, this, f62366a, false, 69069, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
                Object[] objArr = {rect2, view2, recyclerView2, state};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f62366a, false, 69069, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
                return;
            }
            int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
            if (childAdapterPosition == 0) {
                i = 0;
            } else {
                i = (int) UIUtils.dip2Px(view.getContext(), 4.0f);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null || childAdapterPosition == layoutManager.getItemCount() - 1) {
                i2 = 0;
            } else {
                i2 = (int) UIUtils.dip2Px(view.getContext(), 4.0f);
            }
            rect2.set(i, 0, i2, 0);
        }
    }

    public final void a(Exception exc) {
    }

    public final int d() {
        if (this.o == 3) {
            return C0906R.layout.ko;
        }
        return C0906R.layout.km;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        if (this.f62363b != null) {
            this.f62363b.a(0);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62362a, false, 69053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62362a, false, 69053, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        for (int valueOf : p) {
            this.j.add(Integer.valueOf(valueOf));
        }
    }

    public final void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f62362a, false, 69055, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62362a, false, 69055, new Class[0], Void.TYPE);
            return;
        }
        if (this.o == 3) {
            if (this.mNickNameEditText == null || this.mNickNameEditText.getText() == null) {
                str = "";
            } else {
                str = this.mNickNameEditText.getText().toString();
            }
            if (b(str)) {
                return;
            }
        }
        if (!this.l) {
            c.a(t.b(this.g), 0, 0, (b<Bitmap>) new dx<Bitmap>(this));
        } else if (!this.m) {
            this.f62363b.a(com.ss.android.ugc.aweme.profile.d.l.b().getAbsolutePath(), (List<e>) null);
            return;
        } else {
            i.a((Callable<TResult>) new dv<TResult>(this)).a((g<TResult, TContinuationResult>) new dw<TResult,TContinuationResult>(this), i.f1052b);
        }
        r.a("profile_update_alert_finish", (Map) d.a().a("type", ac.a(this.o)).f34114b);
    }

    public final void b() {
        boolean z;
        boolean z2;
        String str;
        String charSequence;
        int i2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (PatchProxy.isSupport(new Object[0], this, f62362a, false, 69054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62362a, false, 69054, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        String f2 = f();
        TextView textView = this.mPolicyDes;
        ViewGroup viewGroup = this.mVpExpandContainer;
        TextView textView2 = this.txtDisclaimer;
        ImageView imageView = this.ivDisclaimer;
        if (PatchProxy.isSupport(new Object[]{f2, textView, viewGroup, textView2, imageView, (byte) 1}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69890, new Class[]{String.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{f2, textView, viewGroup, textView2, imageView, (byte) 1}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69890, new Class[]{String.class, TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(f2)) {
            Integer num = (Integer) SharePrefCache.inst().getShowHashTagBg().c();
            if (!com.ss.android.g.a.a() || !(num == null || num.intValue() == 0)) {
                z = false;
            } else {
                z = true;
            }
            if (PatchProxy.isSupport(new Object[]{f2, textView}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69891, new Class[]{String.class, View.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{f2, textView}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69891, new Class[]{String.class, View.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (ey.a(textView.getContext())) {
                    i7 = -1;
                } else {
                    i7 = -2;
                }
                z2 = new Bidi(f2, i7).baseIsLeftToRight();
            }
            if (PatchProxy.isSupport(new Object[]{textView, viewGroup, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69892, new Class[]{TextView.class, ViewGroup.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView, viewGroup, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69892, new Class[]{TextView.class, ViewGroup.class, Boolean.TYPE}, Void.TYPE);
            } else {
                boolean a2 = ey.a(viewGroup.getContext());
                ViewGroup viewGroup2 = (ViewGroup) textView.getParent();
                if (z2) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                ViewCompat.setLayoutDirection(viewGroup2, i4);
                if (z2) {
                    i5 = 3;
                } else {
                    i5 = 5;
                }
                textView.setGravity(i5);
                if (Build.VERSION.SDK_INT >= 17) {
                    if (z2) {
                        i6 = 3;
                    } else {
                        i6 = 2;
                    }
                    textView.setTextDirection(i6);
                    viewGroup.setLayoutDirection(a2 ? 1 : 0);
                }
            }
            if (PatchProxy.isSupport(new Object[]{f2, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69893, new Class[]{String.class, Boolean.TYPE}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{f2, Byte.valueOf(z2)}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69893, new Class[]{String.class, Boolean.TYPE}, String.class);
            } else {
                if (!z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String unicodeWrap = BidiFormatter.getInstance(z3).unicodeWrap(f2);
                if (z2) {
                    str = "‭" + unicodeWrap + 8237;
                } else {
                    str = unicodeWrap.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
                }
            }
            if (!TextUtils.equals(textView.getText(), str)) {
                if (!TextUtils.isEmpty(textView.getText())) {
                    if (PatchProxy.isSupport(new Object[]{textView, viewGroup, textView2, imageView, Byte.valueOf(z ? (byte) 1 : 0)}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69894, new Class[]{TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{textView, viewGroup, textView2, imageView, Byte.valueOf(z)}, null, com.ss.android.ugc.aweme.profile.d.d.f61386a, true, 69894, new Class[]{TextView.class, ViewGroup.class, TextView.class, ImageView.class, Boolean.TYPE}, Void.TYPE);
                    } else {
                        imageView.setSelected(false);
                        if (textView2 != null) {
                            textView2.setText(o.b(C0906R.string.ac0));
                        }
                        imageView.setRotation(0.0f);
                        textView.getLayoutParams().height = -2;
                        if (z) {
                            i3 = (int) UIUtils.dip2Px(imageView.getContext(), 20.0f);
                        } else {
                            i3 = (int) imageView.getResources().getDimension(C0906R.dimen.fy);
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                        if (z) {
                            marginLayoutParams.bottomMargin = i3;
                        } else {
                            marginLayoutParams.topMargin = i3;
                        }
                        viewGroup.setLayoutParams(marginLayoutParams);
                    }
                }
                int dip2Px = (int) UIUtils.dip2Px(textView.getContext(), 240.0f);
                SpannableString spannableString = new SpannableString(str);
                if (textView2 == null) {
                    charSequence = "";
                } else {
                    charSequence = textView2.getText().toString();
                }
                f fVar = new f(textView.getPaint(), dip2Px, true, charSequence, 3);
                SpannableString a3 = fVar.a(spannableString);
                textView.setText(a3);
                boolean z4 = fVar.f35603c;
                int i8 = 8;
                if (z4) {
                    DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), textView.getPaint(), dip2Px, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    int height = dynamicLayout.getHeight();
                    if (!z4 || TextUtils.isEmpty(str)) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    textView2.setVisibility(i2);
                    if (z4 && !TextUtils.isEmpty(str)) {
                        i8 = 0;
                    }
                    imageView.setVisibility(i8);
                    com.ss.android.ugc.aweme.profile.d.e eVar = new com.ss.android.ugc.aweme.profile.d.e(textView, height, dynamicLayout, spannableString, imageView, textView2, viewGroup, z, a3);
                    textView.post(eVar);
                } else {
                    imageView.setVisibility(8);
                    textView2.setVisibility(8);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f62362a, false, 69057, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62362a, false, 69057, new Class[0], Void.TYPE);
        } else {
            c.b(this.mAvatarImageView, t.b(this.g));
            this.mAvatarContainer.setOnClickListener(new dy(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f62362a, false, 69058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62362a, false, 69058, new Class[0], Void.TYPE);
            return;
        }
        this.i = new DecorationAdapter();
        this.i.setShowFooter(false);
        this.i.f61785d = this;
        this.mDecorationRecyclerView.setNestedScrollingEnabled(false);
        this.mDecorationRecyclerView.setAdapter(this.i);
        this.mDecorationRecyclerView.addItemDecoration(new AvatarDecoration(this, (byte) 0));
        AnonymousClass1 r0 = new WrapLinearLayoutManager(getContext()) {
            public boolean canScrollHorizontally() {
                return false;
            }
        };
        r0.setOrientation(0);
        this.mDecorationRecyclerView.setLayoutManager(r0);
        this.i.setData(this.j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(i iVar) throws Exception {
        if (this.f62363b != null && iVar.b() && !TextUtils.isEmpty((CharSequence) iVar.e())) {
            this.f62363b.a((String) iVar.e(), (List<e>) null);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(i iVar) throws Exception {
        if (this.f62363b != null && iVar.b() && !TextUtils.isEmpty((CharSequence) iVar.e())) {
            this.f62363b.a((String) iVar.e(), (List<e>) null);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public String a(Bitmap bitmap) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f62362a, false, 69059, new Class[]{Bitmap.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bitmap}, this, f62362a, false, 69059, new Class[]{Bitmap.class}, String.class);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, createBitmap.getConfig());
        Resources resources = getContext().getResources();
        int[] iArr = r;
        if (this.n >= 0) {
            i2 = this.n;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, iArr[i2]);
        if (decodeResource.getWidth() <= 0 || decodeResource.getHeight() <= 0) {
            return "";
        }
        Matrix matrix = new Matrix();
        matrix.postScale(((float) width) / ((float) decodeResource.getWidth()), ((float) height) / ((float) decodeResource.getHeight()));
        Bitmap createBitmap3 = Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, true);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, null);
        canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, null);
        File b2 = com.ss.android.ugc.aweme.profile.d.l.b();
        boolean saveBitmapToSD = BitmapUtils.saveBitmapToSD(createBitmap2, b2.getParent(), b2.getName());
        if (createBitmap != null) {
            createBitmap.recycle();
        }
        if (createBitmap2 != null) {
            createBitmap2.recycle();
        }
        if (decodeResource != null) {
            decodeResource.recycle();
        }
        if (createBitmap3 != null) {
            createBitmap3.recycle();
        }
        if (saveBitmapToSD) {
            return b2.getAbsolutePath();
        }
        return "";
    }

    public final void a(int i2) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62362a, false, 69062, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62362a, false, 69062, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.m = true;
        if (this.l) {
            if (this.n != i2) {
                z = true;
            } else {
                z = false;
            }
            this.m = z;
        }
        if (this.mAvatarDecoration != null) {
            if (this.m) {
                v.a(true, this.mAvatarDecoration);
                this.mAvatarDecoration.setImageResource(q[i2]);
                this.n = i2;
                return;
            }
            v.a(false, this.mAvatarDecoration);
            this.n = -1;
        }
    }

    public final void a(AvatarUri avatarUri) {
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, f62362a, false, 69056, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, f62362a, false, 69056, new Class[]{AvatarUri.class}, Void.TYPE);
            return;
        }
        if (this.f62363b != null) {
            this.f62363b.c();
        }
        if (avatarUri == null) {
            com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bv).a();
            return;
        }
        if (!(this.f62376e == null || this.f62377f == null)) {
            this.f62376e.h = avatarUri.uri;
            if (this.o == 3) {
                String obj = this.mNickNameEditText.getText().toString();
                if (!m.a(obj)) {
                    com.bytedance.ies.dmt.ui.d.a.c(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bgz).a();
                    return;
                } else if (!TextUtils.equals(obj, com.ss.android.ugc.aweme.account.d.a().getCurUser().getNickname())) {
                    this.f62376e.f61672b = obj;
                }
            }
            Map<String, String> a2 = this.f62376e.a();
            a2.put("target_user", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            this.f62377f.a(a2);
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62362a, false, 69060, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f62362a, false, 69060, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.l = true;
        Uri parse = Uri.parse("file://" + str2);
        Fresco.getImagePipeline().evictFromCache(parse);
        c.a((RemoteImageView) this.mAvatarImageView, parse.toString());
        if (this.mAvatarDecoration != null) {
            this.mAvatarDecoration.setVisibility(8);
        }
        if (this.i != null) {
            this.i.f61783b = true;
            DecorationAdapter decorationAdapter = this.i;
            if (PatchProxy.isSupport(new Object[0], decorationAdapter, DecorationAdapter.f61782a, false, 67944, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], decorationAdapter, DecorationAdapter.f61782a, false, 67944, new Class[0], Void.TYPE);
            } else {
                decorationAdapter.f61786e.clear();
            }
            this.i.a(-1);
        }
    }

    public UpdateAvatarDialog(Context context, int i2, a aVar, Fragment fragment, boolean z) {
        super(context, z);
        this.k = (Activity) context;
        this.o = i2;
        this.f62364c = fragment;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f62362a, false, 69061, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f62362a, false, 69061, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f62363b = aVar;
        this.f62363b.f61562c = this;
        this.f62363b.a(this.k, this.f62364c);
    }
}
