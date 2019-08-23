package com.ss.android.ugc.aweme.story.shootvideo.record.scene;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Function1 f74051a;

    a(Function1 function1) {
        this.f74051a = function1;
    }

    public final /* synthetic */ void onClick(View view) {
        ClickInstrumentation.onClick(view);
        Intrinsics.checkExpressionValueIsNotNull(this.f74051a.invoke(view), "invoke(...)");
    }
}
