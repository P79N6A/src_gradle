package com.alimama.tunion.sdk.service;

import android.content.Context;
import android.webkit.JsPromptResult;
import com.alimama.tunion.sdk.jump.TUnionJumpCallback;
import com.alimama.tunion.sdk.jump.page.ITUnionJumpPage;
import com.alimama.tunion.trade.base.ITUnionWebView;
import com.alimama.tunion.trade.convert.TUnionJumpType;
import com.alimama.tunion.trade.convert.TUnionMediaParams;

public interface ITUnionJumpService extends ITUnionService {
    boolean onJsPrompt(String str, String str2, String str3, JsPromptResult jsPromptResult);

    void show(Context context, TUnionJumpType tUnionJumpType, ITUnionWebView iTUnionWebView, ITUnionJumpPage iTUnionJumpPage, String str, TUnionMediaParams tUnionMediaParams, TUnionJumpCallback tUnionJumpCallback);
}
