package com.anykh_dev.yatranslate;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;



interface YDAPIService {

    @GET ("api/v1/dicservice/lookup")
    Call<Translations> getTranslations (@Query("key") String key, @Query("lang") String lang,
                                        @Query("text") String text);
}
