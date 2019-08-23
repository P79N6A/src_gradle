package com.alimama.tunion.sdk.jump;

import com.alimama.tunion.trade.convert.TUnionJumpType;

public interface TUnionJumpCallback {
    void onFailure(int i, String str);

    void onSuccess(TUnionJumpType tUnionJumpType);
}
