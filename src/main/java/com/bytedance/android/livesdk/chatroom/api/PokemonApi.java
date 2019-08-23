package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.a.o;
import com.bytedance.android.livesdk.chatroom.model.af;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface PokemonApi {
    @GET("/hotsoon/pokemon/get_anchor_pokemon_info_with_user/")
    Observable<d<o>> getPokemonInfo(@Query(a = "anchor_id") long j, @Query(a = "user_id") long j2);

    @FormUrlEncoded
    @POST("/hotsoon/pokemon/send_pokemon_to_anchor/")
    Observable<d<af>> sendPokemon(@Field(a = "anchor_id") long j, @Field(a = "gift_id") long j2, @Field(a = "room_id") long j3);

    @GET("/hotsoon/pokemon/try_to_show_pokemon/")
    Observable<d<Object>> showPokemonTip(@Query(a = "anchor_id") long j);
}
