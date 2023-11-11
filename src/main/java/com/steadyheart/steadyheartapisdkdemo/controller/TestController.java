package com.steadyheart.steadyheartapisdkdemo.controller;

import com.steadyheart.steadyheartsdk.client.SteadyheartClient;
import com.steadyheart.steadyheartsdk.entity.params.*;
import com.steadyheart.steadyheartsdk.entity.response.*;
import com.steadyheart.steadyheartsdk.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author steadyheart
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private ApiService apiService;

    @GetMapping("/wallpaper")
    public BaseResponse<RandomWallpaperResponse> getRandomWallpaper(RandomWallpaperParams randomWallpaperParams) {
        return apiService.getRandomWallpaper(randomWallpaperParams);
    }

    @GetMapping("/wallpaper/client")
    public BaseResponse<RandomWallpaperResponse> getRandomWallpaperWithClient(RandomWallpaperParams randomWallpaperParams) {
        SteadyheartClient steadyheartClient = new SteadyheartClient("你的accessKey","你的secretKey");
        return apiService.getRandomWallpaper(steadyheartClient,randomWallpaperParams);
    }

    @GetMapping("/loveTalk")
    public BaseResponse<RandomLoveTalkResponse> getRandomLoveTalk() {
        return apiService.getRandomLoveTalk();
    }

    @GetMapping("/loveTalk/client")
    public BaseResponse<RandomLoveTalkResponse> getRandomLoveTalkWithClient() {
        SteadyheartClient steadyheartClient = new SteadyheartClient("你的accessKey","你的secretKey");
        return apiService.getRandomLoveTalk(steadyheartClient);
    }

    @GetMapping("/joke")
    public BaseResponse<JokeResponse> getJoke() {
        return apiService.getJoke();
    }

    @GetMapping("/joke/clinet")
    public BaseResponse<JokeResponse> getJokeWithClient() {
        SteadyheartClient steadyheartClient = new SteadyheartClient("你的accessKey","你的secretKey");
        return apiService.getJoke(steadyheartClient);
    }

    @GetMapping("/recommend")
    public BaseResponse<RecommendResponse> getRecommendInfo(RecommendParams recommendParams) {
        return apiService.getRecommendInfo(recommendParams);
    }

    @GetMapping("/recommend/client")
    public BaseResponse<RecommendResponse> getRecommendInfoWithClient(RecommendParams recommendParams) {
        SteadyheartClient steadyheartClient = new SteadyheartClient("你的accessKey","你的secretKey");
        return apiService.getRecommendInfo(steadyheartClient,recommendParams);
    }

    @GetMapping("/explain")
    public BaseResponse<ExplainWordResponse> getExplainWord(ExplainWordParams explainWordParams) {
        return apiService.getExplainWord(explainWordParams);
    }

    @GetMapping("/explain/client")
    public BaseResponse<ExplainWordResponse> getExplainWordWithClient(ExplainWordParams explainWordParams) {
        SteadyheartClient steadyheartClient = new SteadyheartClient("你的accessKey","你的secretKey");
        return apiService.getExplainWord(steadyheartClient,explainWordParams);
    }

    @GetMapping("/ip")
    public BaseResponse<IpInfoResponse> getIpInfo(IpInfoParams ipInfoParams) {
        return apiService.getIpInfo(ipInfoParams);
    }

    @GetMapping("/ip/client")
    public BaseResponse<IpInfoResponse> getIpInfoWithClient(IpInfoParams ipInfoParams) {
        SteadyheartClient steadyheartClient = new SteadyheartClient("你的accessKey","你的secretKey");
        return apiService.getIpInfo(steadyheartClient,ipInfoParams);
    }

    @GetMapping("/translate")
    public BaseResponse<TranslationResponse> getTranslation(TranslationParams translationParams) {
        return apiService.getTranslation(translationParams);
    }

    @GetMapping("/translate/client")
    public BaseResponse<TranslationResponse> getTranslationWithClient(TranslationParams translationParams) {
        SteadyheartClient steadyheartClient = new SteadyheartClient("你的accessKey","你的secretKey");
        return apiService.getTranslation(steadyheartClient,translationParams);
    }


}
