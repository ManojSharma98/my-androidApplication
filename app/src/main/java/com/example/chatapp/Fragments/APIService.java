package com.example.chatapp.Fragments;

import com.example.chatapp.Notification.MyResponse;
import com.example.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "content-Type:application/json",
                    "Authorization:key=AAAAJ0YD5hE:APA91bEa3mgxjDl_MGw_OKM2WYuXBLva8BXU-h5nx1fQhMzukFQTNi-OLI-iWD1OdeweLSWdoQd1UKhrff_x0w-9mrOvUOWj47P10fT3fNFnmVcdUbbPtd-QW5IBMp7qz1YnWttlpLMV"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
