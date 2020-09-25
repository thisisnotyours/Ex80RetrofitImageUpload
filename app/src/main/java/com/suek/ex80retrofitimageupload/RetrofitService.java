package com.suek.ex80retrofitimageupload;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitService {

    //파일전송에 사용되는 어노테이션 [ @Multipart --->인코딩 타입을 지정함- @Part 와 한쌍임]
    //MultipartBody.Part 클래스 : [ '식별자','파일명', 파일을 가지고 있는 요청객체 ]를 가진 객체
    @Multipart
    @POST("/Retrofit/fileUpload.php")
    Call<String> uploadFile(@Part MultipartBody.Part filePart);
}
