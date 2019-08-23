package com.ss.android.ugc.aweme.sticker.prop.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.e;
import com.ss.android.ugc.aweme.sticker.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.utils.eb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StickerPropDetailActicity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71661a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f71662b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private String f71663c;

    /* renamed from: d  reason: collision with root package name */
    private String f71664d;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f71661a, false, 81993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71661a, false, 81993, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71661a, false, 81994, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71661a, false, 81994, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f71661a, false, 81991, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71661a, false, 81991, new Class[0], Void.TYPE);
            return;
        }
        if (a.b()) {
            StatusBarUtils.setTranslucent(this);
            if (PatchProxy.isSupport(new Object[]{this}, null, eb.f75807a, true, 88570, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this}, null, eb.f75807a, true, 88570, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            Window window = getWindow();
            if (window != null) {
                window.getDecorView().setSystemUiVisibility(9216);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        StickerPropDetailFragment stickerPropDetailFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f71661a, false, 81990, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f71661a, false, 81990, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b1);
        findViewById(C0906R.id.y9).setBackgroundColor(getResources().getColor(C0906R.color.a25));
        if (PatchProxy.isSupport(new Object[0], this, f71661a, false, 81992, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71661a, false, 81992, new Class[0], Void.TYPE);
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().refreshData();
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setStatusBar(this, findViewById(C0906R.id.cv0));
            String stringExtra = getIntent().getStringExtra("extra_log_pb");
            this.f71663c = getIntent().getStringExtra("aweme_id");
            this.f71664d = getIntent().getStringExtra("extra_music_from");
            e eVar = (e) getIntent().getSerializableExtra("sticker_music");
            Serializable serializableExtra = getIntent().getSerializableExtra("music_model");
            getIntent().getStringExtra("sticker_id");
            getIntent().getStringExtra("from_token");
            ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("extra_stickers");
            if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                finish();
            } else {
                if (stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                    this.f71662b.addAll(stringArrayListExtra);
                }
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("sticker_prop_detail_fragment_tag");
                String stringExtra2 = getIntent().getStringExtra("extra_sticker_from");
                if (findFragmentByTag == null) {
                    String str = this.f71663c;
                    String str2 = this.f71664d;
                    if (PatchProxy.isSupport(new Object[]{stringArrayListExtra, str, str2, stringExtra2, stringExtra, eVar, serializableExtra}, null, StickerPropDetailFragment.v, true, 82005, new Class[]{ArrayList.class, String.class, String.class, String.class, String.class, e.class, Serializable.class}, StickerPropDetailFragment.class)) {
                        stickerPropDetailFragment = (StickerPropDetailFragment) PatchProxy.accessDispatch(new Object[]{stringArrayListExtra, str, str2, stringExtra2, stringExtra, eVar, serializableExtra}, null, StickerPropDetailFragment.v, true, 82005, new Class[]{ArrayList.class, String.class, String.class, String.class, String.class, e.class, Serializable.class}, StickerPropDetailFragment.class);
                    } else {
                        Bundle bundle2 = new Bundle(3);
                        bundle2.putStringArrayList("extra_stickers", stringArrayListExtra);
                        bundle2.putString("aweme_id", str);
                        bundle2.putString("extra_music_from", str2);
                        bundle2.putString("extra_sticker_from", stringExtra2);
                        bundle2.putSerializable("sticker_music", eVar);
                        bundle2.putSerializable("music_model", serializableExtra);
                        bundle2.putString("extra_log_pb", stringExtra);
                        stickerPropDetailFragment = new StickerPropDetailFragment();
                        stickerPropDetailFragment.setArguments(bundle2);
                    }
                    findFragmentByTag = stickerPropDetailFragment;
                }
                findFragmentByTag.setUserVisibleHint(true);
                beginTransaction.replace(C0906R.id.y9, findFragmentByTag, "sticker_prop_detail_fragment_tag");
                beginTransaction.commit();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity", "onCreate", false);
    }

    public static void a(Context context, ArrayList<String> arrayList) {
        if (PatchProxy.isSupport(new Object[]{context, arrayList}, null, f71661a, true, 81988, new Class[]{Context.class, ArrayList.class}, Void.TYPE)) {
            Object[] objArr = {context, arrayList};
            PatchProxy.accessDispatch(objArr, null, f71661a, true, 81988, new Class[]{Context.class, ArrayList.class}, Void.TYPE);
            return;
        }
        context.startActivity(a(context, null, null, null, arrayList, "reuse"));
    }

    public static void a(Context context, String str, e eVar, Serializable serializable, ArrayList<String> arrayList) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, null, null, null, arrayList}, null, f71661a, true, 81987, new Class[]{Context.class, String.class, e.class, Serializable.class, ArrayList.class}, Void.TYPE)) {
            Object[] objArr = {context2, null, null, null, arrayList};
            PatchProxy.accessDispatch(objArr, null, f71661a, true, 81987, new Class[]{Context.class, String.class, e.class, Serializable.class, ArrayList.class}, Void.TYPE);
            return;
        }
        context2.startActivity(a(context, null, null, null, arrayList, "reuse"));
    }

    public static Intent a(Context context, String str, e eVar, Serializable serializable, ArrayList<String> arrayList, String str2) {
        Context context2 = context;
        String str3 = str;
        e eVar2 = eVar;
        Serializable serializable2 = serializable;
        ArrayList<String> arrayList2 = arrayList;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, eVar2, serializable2, arrayList2, str4}, null, f71661a, true, 81989, new Class[]{Context.class, String.class, e.class, Serializable.class, ArrayList.class, String.class}, Intent.class)) {
            Object[] objArr = {context2, str3, eVar2, serializable2, arrayList2, str4};
            return (Intent) PatchProxy.accessDispatch(objArr, null, f71661a, true, 81989, new Class[]{Context.class, String.class, e.class, Serializable.class, ArrayList.class, String.class}, Intent.class);
        }
        Intent intent = new Intent(context2, StickerPropDetailActicity.class);
        if (str3 != null) {
            intent.putExtra("aweme_id", str3);
        }
        if (eVar2 != null) {
            intent.putExtra("sticker_music", eVar2);
        }
        if (serializable2 != null) {
            intent.putExtra("music_model", serializable2);
        }
        intent.putExtra("extra_sticker_from", str4);
        intent.putExtra("extra_stickers", arrayList2);
        return intent;
    }
}
