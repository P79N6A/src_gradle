package com.bytedance.android.livesdk.chatroom.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.bytedance.android.livesdk.chatroom.e.e;
import com.bytedance.android.livesdk.chatroom.e.v;
import com.bytedance.android.livesdk.chatroom.f.d;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.android.livesdk.message.model.bi;
import com.bytedance.android.livesdk.message.model.f;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.facebook.datasource.DataSource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.a;

public class MessageListAdapter extends RecyclerView.Adapter<MessageViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11708a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f11709b;

    /* renamed from: c  reason: collision with root package name */
    public List<b> f11710c;

    /* renamed from: d  reason: collision with root package name */
    public Room f11711d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11712e = true;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f11713f = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11714a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f11715c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f11714a, true, 6273, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f11714a, true, 6273, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("MessageListAdapter.java", AnonymousClass1.class);
            f11715c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.MessageListAdapter$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 91);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f11714a, false, 6272, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f11714a, false, 6272, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f11715c, this, this, view));
            if (view.getTag() instanceof com.bytedance.android.livesdk.chatroom.e.a) {
                ((com.bytedance.android.livesdk.chatroom.e.a) view.getTag()).a(view.getContext(), MessageListAdapter.this.f11711d);
            }
        }
    };

    static class ActionMessageViewHolder extends MessageViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11717a;

        /* renamed from: b  reason: collision with root package name */
        private ImageView f11718b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f11719c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f11720d;

        /* renamed from: e  reason: collision with root package name */
        private View f11721e;

        /* renamed from: f  reason: collision with root package name */
        private View.OnClickListener f11722f;

        ActionMessageViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            this.f11718b = (ImageView) view.findViewById(C0906R.id.aq8);
            this.f11719c = (ImageView) view.findViewById(C0906R.id.cel);
            this.f11720d = (TextView) view.findViewById(C0906R.id.yp);
            this.f11721e = view.findViewById(C0906R.id.bu4);
            this.f11722f = onClickListener;
        }

        @SuppressLint({"ResourceType"})
        public final void a(b<?> bVar, int i) {
            if (PatchProxy.isSupport(new Object[]{bVar, Integer.valueOf(i)}, this, f11717a, false, 6274, new Class[]{b.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar, Integer.valueOf(i)}, this, f11717a, false, 6274, new Class[]{b.class, Integer.TYPE}, Void.TYPE);
            } else if (bVar instanceof com.bytedance.android.livesdk.chatroom.e.a) {
                com.bytedance.android.livesdk.chatroom.e.a aVar = (com.bytedance.android.livesdk.chatroom.e.a) bVar;
                if (aVar.a() != null) {
                    com.bytedance.android.livesdk.chatroom.f.b.a(this.f11718b, aVar.a(), this.f11718b.getWidth(), this.f11718b.getHeight());
                } else if (aVar.b() > 0) {
                    this.f11718b.setImageResource(aVar.b());
                } else {
                    this.f11718b.setBackgroundResource(2130841309);
                }
                if (aVar.c() != null) {
                    this.f11719c.setBackground(null);
                    com.bytedance.android.livesdk.chatroom.f.b.a(this.f11719c, aVar.c());
                }
                if (!aVar.d()) {
                    this.f11719c.setVisibility(8);
                }
                if (!TextUtils.isEmpty(aVar.n())) {
                    this.f11720d.setText(aVar.n());
                } else {
                    this.f11720d.setText("");
                }
                if (aVar.h() != null) {
                    d.f10220b.a(aVar.h(), this.itemView, c.a(ac.e()), null);
                } else if (!TextUtils.isEmpty(aVar.g())) {
                    try {
                        ((GradientDrawable) this.f11721e.getBackground()).setColor(Color.parseColor(aVar.g()));
                    } catch (Exception unused) {
                    }
                }
                if (aVar.d()) {
                    this.itemView.setTag(aVar);
                    this.itemView.setOnClickListener(this.f11722f);
                    return;
                }
                this.itemView.setOnClickListener(null);
            }
        }
    }

    public static abstract class MessageViewHolder extends RecyclerView.ViewHolder {
        public abstract void a(b<?> bVar, int i);

        MessageViewHolder(View view) {
            super(view);
        }
    }

    static class TextMessageViewHolder extends MessageViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f11723a;

        /* renamed from: e  reason: collision with root package name */
        public static float f11724e;

        /* renamed from: f  reason: collision with root package name */
        public static Paint f11725f;

        /* renamed from: b  reason: collision with root package name */
        TextView f11726b;

        /* renamed from: c  reason: collision with root package name */
        View f11727c;

        /* renamed from: d  reason: collision with root package name */
        a f11728d;
        Spannable g;
        private final View.OnLongClickListener h;

        TextMessageViewHolder(View view, a aVar) {
            super(view);
            this.f11726b = (TextView) view.findViewById(C0906R.id.text);
            this.f11727c = view.findViewById(C0906R.id.b7l);
            this.f11728d = aVar;
            if (f11724e <= 0.0f) {
                f11724e = view.getResources().getDisplayMetrics().density / 3.0f;
            }
            this.f11726b.setMovementMethod(dj.a());
            this.h = eg.f12142b;
            if (f11725f == null) {
                Paint paint = new Paint();
                f11725f = paint;
                paint.setColor(-1);
                f11725f.setStyle(Paint.Style.FILL_AND_STROKE);
                f11725f.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
            }
            if (com.bytedance.android.live.uikit.a.a.f()) {
                this.f11726b.setTypeface(Typeface.defaultFromStyle(0));
            }
        }

        public final void a(SparseArray<ImageSpan> sparseArray, List<com.bytedance.android.livesdkapi.depend.model.d> list) {
            if (PatchProxy.isSupport(new Object[]{sparseArray, list}, this, f11723a, false, 6277, new Class[]{SparseArray.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sparseArray, list}, this, f11723a, false, 6277, new Class[]{SparseArray.class, List.class}, Void.TYPE);
            } else if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i = 0; i < sparseArray.size(); i++) {
                    ImageSpan imageSpan = sparseArray.get(sparseArray.keyAt(i));
                    if (imageSpan != null) {
                        spannableStringBuilder.append(PushConstants.PUSH_TYPE_NOTIFY);
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append(" ");
                    }
                }
                spannableStringBuilder.append(this.g);
                this.f11726b.setText(spannableStringBuilder);
            }
        }

        public final void a(b<?> bVar, int i) {
            boolean z;
            b<?> bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2, Integer.valueOf(i)}, this, f11723a, false, 6275, new Class[]{b.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2, Integer.valueOf(i)}, this, f11723a, false, 6275, new Class[]{b.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f11726b.setMovementMethod(dj.a());
            this.f11726b.setOnLongClickListener(this.h);
            this.f11726b.setTag(C0906R.id.d7n, bVar2);
            this.g = bVar.n();
            if (com.bytedance.android.livesdkapi.a.a.f18614b && c.a(ac.e()) && Build.VERSION.SDK_INT >= 17) {
                this.f11726b.setTextDirection(2);
            }
            if (this.g != null) {
                this.f11726b.setText(this.g);
                if (bVar2 instanceof e) {
                    e eVar = (e) bVar2;
                    if (PatchProxy.isSupport(new Object[0], eVar, e.j, false, 5374, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], eVar, e.j, false, 5374, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (((f) eVar.f10013b).f16622e == null || CollectionUtils.isEmpty(((f) eVar.f10013b).f16622e.getUrls()) || TextUtils.isEmpty(((f) eVar.f10013b).f16622e.getUrls().get(0))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        TextView textView = this.f11726b;
                        Room a2 = this.f11728d.a();
                        eh ehVar = new eh(this);
                        if (PatchProxy.isSupport(new Object[]{textView, a2, ehVar}, eVar, e.j, false, 5373, new Class[]{TextView.class, Room.class, b.a.class}, Void.TYPE)) {
                            e eVar2 = eVar;
                            PatchProxy.accessDispatch(new Object[]{textView, a2, ehVar}, eVar2, e.j, false, 5373, new Class[]{TextView.class, Room.class, b.a.class}, Void.TYPE);
                        } else {
                            WeakReference weakReference = new WeakReference(textView);
                            float f2 = textView.getResources().getDisplayMetrics().density / 3.0f;
                            com.bytedance.android.livesdkapi.host.e p = TTLiveSDKContext.getHostService().p();
                            ImageModel imageModel = ((f) eVar.f10013b).f16622e;
                            e.AnonymousClass1 r1 = new e.c(weakReference, f2, a2, ehVar) {

                                /* renamed from: a */
                                public static ChangeQuickRedirect f10018a;

                                /* renamed from: b */
                                final /* synthetic */ WeakReference f10019b;

                                /* renamed from: c */
                                final /* synthetic */ float f10020c;

                                /* renamed from: d */
                                final /* synthetic */ Room f10021d;

                                /* renamed from: e */
                                final /* synthetic */ b.a f10022e;

                                public final void a(
/*
Method generation error in method: com.bytedance.android.livesdk.chatroom.e.e.1.a(android.graphics.Bitmap):void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.chatroom.e.e.1.a(android.graphics.Bitmap):void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                
*/
                            };
                            p.a(imageModel, (e.c) r1);
                        }
                    }
                }
                a(this.f11726b, this.g, bVar2);
            }
        }

        private void a(TextView textView, Spannable spannable, b<?> bVar) {
            boolean z;
            boolean z2;
            boolean z3;
            Bitmap bitmap;
            FansClubData fansClubData;
            ImageModel imageModel;
            TextView textView2 = textView;
            b<?> bVar2 = bVar;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{textView2, spannable, bVar2}, this, f11723a, false, 6276, new Class[]{TextView.class, Spannable.class, b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView2, spannable, bVar2}, this, f11723a, false, 6276, new Class[]{TextView.class, Spannable.class, b.class}, Void.TYPE);
                return;
            }
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f11723a, false, 6278, new Class[]{b.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f11723a, false, 6278, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
            } else if ((!(bVar2 instanceof com.bytedance.android.livesdk.chatroom.e.d) || ((com.bytedance.android.livesdk.message.model.e) bVar2.f10013b).f16617f == null || Lists.isEmpty(((com.bytedance.android.livesdk.message.model.e) bVar2.f10013b).f16617f.getUrls())) && (!(bVar2 instanceof v) || ((bi) bVar2.f10013b).g == null || Lists.isEmpty(((bi) bVar2.f10013b).g.getUrls()))) {
                z = false;
            } else {
                z = true;
            }
            Bitmap bitmap2 = null;
            if (z) {
                if (bVar2 instanceof com.bytedance.android.livesdk.chatroom.e.d) {
                    imageModel = ((com.bytedance.android.livesdk.message.model.e) bVar2.f10013b).f16617f;
                } else if (bVar2 instanceof v) {
                    imageModel = ((bi) bVar2.f10013b).g;
                } else {
                    imageModel = null;
                }
                if (imageModel != null) {
                    d.f10220b.a(imageModel, textView2, c.a(ac.e()), null);
                }
            } else if (!TextUtils.isEmpty(bVar.g())) {
                textView2.setBackgroundResource(2130840869);
                try {
                    ((GradientDrawable) textView.getBackground()).setColor(Color.parseColor(bVar.g()));
                } catch (Exception unused) {
                }
            }
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f11723a, false, 6280, new Class[]{b.class}, Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f11723a, false, 6280, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
            } else if (!com.bytedance.android.live.uikit.a.a.f() || this.f11728d.a() == null || (this.f11728d.a().getOrientation() != 1 && (this.f11728d.a().getOrientation() != 2 || bVar2.f10016e))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                ((GradientDrawable) textView.getBackground()).setColor(Color.parseColor("#00ffffff"));
            }
            List<DataSource> list = (List) textView2.getTag(C0906R.id.d7p);
            if (list != null) {
                for (DataSource dataSource : list) {
                    if (dataSource != null && !dataSource.isClosed()) {
                        dataSource.close();
                    }
                }
            }
            textView2.setTag(C0906R.id.d7p, null);
            ArrayList arrayList = new ArrayList();
            if (bVar.e() != null && !TextUtils.isEmpty(bVar.e().getSpecialId())) {
                arrayList.add(new com.bytedance.android.livesdkapi.depend.model.d(z.ca7));
            }
            if (!CollectionUtils.isEmpty(bVar.k())) {
                for (Integer intValue : bVar.k()) {
                    arrayList.add(new com.bytedance.android.livesdkapi.depend.model.d(intValue.intValue()));
                }
            }
            if (bVar.j() != null) {
                for (ImageModel dVar : bVar.j()) {
                    arrayList.add(new com.bytedance.android.livesdkapi.depend.model.d(dVar, 0));
                }
            }
            if (bVar.i() != null && bVar.i().getUrls() != null && bVar.i().getUrls().size() > 0 && !TextUtils.isEmpty(bVar.i().getUrls().get(0))) {
                arrayList.add(new com.bytedance.android.livesdkapi.depend.model.d(bVar.i(), 0));
            }
            T t = bVar2.f10013b;
            if (PatchProxy.isSupport(new Object[]{t}, this, f11723a, false, 6279, new Class[]{com.bytedance.android.livesdk.message.model.c.class}, Boolean.TYPE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{t}, this, f11723a, false, 6279, new Class[]{com.bytedance.android.livesdk.message.model.c.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (t instanceof as) {
                    long a2 = ((as) t).a();
                    if (5 == a2 || 6 == a2 || 3 == a2 || 10 == a2 || 9 == a2 || 4 == a2 || 7 == a2 || 11 == a2) {
                        z3 = false;
                    }
                }
                z3 = true;
            }
            if (!(!z3 || bVar.e() == null || bVar.e().getFansClub() == null)) {
                if (FansClubData.isValid(bVar.e().getFansClub().getData())) {
                    fansClubData = bVar.e().getFansClub().getData();
                } else if (bVar.e().getFansClub().getPreferData() != null) {
                    fansClubData = bVar.e().getFansClub().getPreferData().get(1);
                } else {
                    fansClubData = null;
                }
                if (FansClubData.isValid(fansClubData) && fansClubData.userFansClubStatus == 1 && fansClubData.badge != null && fansClubData.badge.icons != null) {
                    ImageModel imageModel2 = fansClubData.badge.icons.get(2);
                    if (imageModel2 != null) {
                        com.bytedance.android.livesdkapi.depend.model.d dVar2 = new com.bytedance.android.livesdkapi.depend.model.d(imageModel2, 1);
                        dVar2.f18703a = fansClubData.clubName;
                        arrayList.add(dVar2);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                SparseArray sparseArray = new SparseArray();
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    if (((com.bytedance.android.livesdkapi.depend.model.d) arrayList.get(i2)).f18704b == 2) {
                        Context context = textView.getContext();
                        int i3 = ((com.bytedance.android.livesdkapi.depend.model.d) arrayList.get(i2)).f18705c;
                        Object[] objArr = new Object[2];
                        objArr[i] = context;
                        objArr[1] = Integer.valueOf(i3);
                        ChangeQuickRedirect changeQuickRedirect = z.f17650a;
                        Class[] clsArr = new Class[2];
                        clsArr[i] = Context.class;
                        clsArr[1] = Integer.TYPE;
                        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, 13702, clsArr, Bitmap.class)) {
                            Object[] objArr2 = new Object[2];
                            objArr2[i] = context;
                            objArr2[1] = Integer.valueOf(i3);
                            ChangeQuickRedirect changeQuickRedirect2 = z.f17650a;
                            Class[] clsArr2 = new Class[2];
                            clsArr2[i] = Context.class;
                            clsArr2[1] = Integer.TYPE;
                            bitmap = (Bitmap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, 13702, clsArr2, Bitmap.class);
                        } else if (com.bytedance.android.live.uikit.a.a.f()) {
                            bitmap = z.a(context, i3, (int) ak.a(context, 28.0f), (int) ak.a(context, 16.0f));
                        } else if (i3 == z.c0m || i3 == z.ca7) {
                            bitmap = z.a(context, i3, context.getResources().getDimensionPixelSize(C0906R.dimen.p6), context.getResources().getDimensionPixelSize(C0906R.dimen.p5));
                        } else {
                            bitmap = bitmap2;
                        }
                        if (bitmap != null && !bitmap.isRecycled()) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(textView.getResources(), bitmap);
                            bitmapDrawable.setBounds(i, i, bitmap.getWidth(), bitmap.getHeight());
                            sparseArray.put(i2, new com.bytedance.android.livesdk.widget.c(bitmapDrawable));
                            a(sparseArray, (List<com.bytedance.android.livesdkapi.depend.model.d>) arrayList);
                        }
                    } else {
                        com.bytedance.android.livesdkapi.host.e p = TTLiveSDKContext.getHostService().p();
                        final SparseArray sparseArray2 = sparseArray;
                        final int i4 = i2;
                        AnonymousClass1 r9 = r0;
                        final ArrayList arrayList2 = arrayList;
                        ImageModel imageModel3 = (ImageModel) arrayList.get(i2);
                        final TextView textView3 = textView;
                        AnonymousClass1 r0 = new e.c() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f11729a;

                            public final void a(Bitmap bitmap) {
                                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f11729a, false, 6283, new Class[]{Bitmap.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f11729a, false, 6283, new Class[]{Bitmap.class}, Void.TYPE);
                                } else if (bitmap == null) {
                                    sparseArray2.put(i4, null);
                                    TextMessageViewHolder.this.a(sparseArray2, arrayList2);
                                } else {
                                    com.bytedance.android.livesdkapi.depend.model.d dVar = (com.bytedance.android.livesdkapi.depend.model.d) arrayList2.get(i4);
                                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                    float width = ((float) bitmap.getWidth()) * TextMessageViewHolder.f11724e;
                                    float height = ((float) bitmap.getHeight()) * TextMessageViewHolder.f11724e;
                                    if (!TextUtils.isEmpty(dVar.f18703a) && dVar.f18704b == 1) {
                                        float height2 = (float) bitmap.getHeight();
                                        TextMessageViewHolder.f11725f.setTextSize(0.53f * height2);
                                        String str = dVar.f18703a;
                                        float measureText = TextMessageViewHolder.f11725f.measureText(str);
                                        float width2 = ((float) bitmap.getWidth()) - height2;
                                        if (measureText > width2) {
                                            measureText = width2;
                                        }
                                        Canvas canvas = new Canvas(copy);
                                        Paint.FontMetrics fontMetrics = TextMessageViewHolder.f11725f.getFontMetrics();
                                        float abs = ((height2 - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + Math.abs(fontMetrics.ascent);
                                        float f2 = ((width2 - measureText) / 2.0f) + height2;
                                        if (com.bytedance.android.live.uikit.a.a.f() && f2 - height2 >= 5.0f) {
                                            f2 -= 5.0f;
                                        }
                                        canvas.drawText(str, f2, abs, TextMessageViewHolder.f11725f);
                                    }
                                    BitmapDrawable bitmapDrawable = new BitmapDrawable(textView3.getResources(), copy);
                                    bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                                    sparseArray2.put(i4, new com.bytedance.android.livesdk.widget.c(bitmapDrawable));
                                    TextMessageViewHolder.this.a(sparseArray2, arrayList2);
                                }
                            }
                        };
                        p.a(imageModel3, (e.c) r9);
                    }
                    i2++;
                    bitmap2 = null;
                    i = 0;
                }
            }
        }
    }

    interface a {
        Room a();
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f11708a, false, 6268, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f11708a, false, 6268, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f11710c == null) {
            return 0;
        } else {
            return this.f11710c.size();
        }
    }

    public int getItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11708a, false, 6269, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f11710c.get(i).f10014c;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11708a, false, 6269, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f11708a, false, 6267, new Class[]{ViewGroup.class, Integer.TYPE}, MessageViewHolder.class)) {
            return (MessageViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f11708a, false, 6267, new Class[]{ViewGroup.class, Integer.TYPE}, MessageViewHolder.class);
        }
        switch (i) {
            case 0:
                return new TextMessageViewHolder(this.f11709b.inflate(C0906R.layout.aj2, viewGroup, false), new ef(this));
            case 1:
                return new ActionMessageViewHolder(this.f11709b.inflate(C0906R.layout.alk, viewGroup, false), this.f11713f);
            default:
                throw new IllegalArgumentException("unknown message view type");
        }
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MessageViewHolder messageViewHolder = (MessageViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{messageViewHolder, Integer.valueOf(i)}, this, f11708a, false, 6270, new Class[]{MessageViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{messageViewHolder, Integer.valueOf(i)}, this, f11708a, false, 6270, new Class[]{MessageViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar = this.f11710c.get(i);
        messageViewHolder.a(bVar, i);
        if (this.f11712e) {
            this.f11712e = false;
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "ON_FIRST_MSG_SHOW");
            hashMap.put("msg_id", Long.valueOf(bVar.f10013b.getMessageId()));
            hashMap.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, bVar.f10013b.getMessageType().getWsMethod());
            com.bytedance.android.livesdk.j.c.b().b("ttlive_msg", (Map<String, Object>) hashMap);
        }
    }
}
