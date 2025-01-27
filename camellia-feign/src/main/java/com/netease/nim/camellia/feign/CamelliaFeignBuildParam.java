package com.netease.nim.camellia.feign;

import com.netease.nim.camellia.core.client.env.Monitor;
import com.netease.nim.camellia.feign.client.DynamicOption;
import com.netease.nim.camellia.feign.route.FeignResourceTableUpdater;

/**
 * Created by caojiajun on 2022/3/28
 */
public class CamelliaFeignBuildParam<T> {

    private Class<T> apiType;
    private CamelliaFeignFallbackFactory<T> fallbackFactory;
    private CamelliaFeignProps feignProps;
    private FeignResourceTableUpdater updater;
    private CamelliaFeignEnv feignEnv;
    private DynamicOption dynamicOption;
    private Monitor monitor;

    public CamelliaFeignBuildParam() {
    }

    public CamelliaFeignBuildParam(Class<T> apiType, CamelliaFeignFallbackFactory<T> fallbackFactory, CamelliaFeignProps feignProps, FeignResourceTableUpdater updater,
                                   CamelliaFeignEnv feignEnv, DynamicOption dynamicOption, Monitor monitor) {
        this.apiType = apiType;
        this.fallbackFactory = fallbackFactory;
        this.feignProps = feignProps;
        this.updater = updater;
        this.feignEnv = feignEnv;
        this.dynamicOption = dynamicOption;
        this.monitor = monitor;
    }

    public CamelliaFeignBuildParam<T> duplicate() {
        return new CamelliaFeignBuildParam<>(apiType, fallbackFactory, feignProps, updater, feignEnv, dynamicOption, monitor);
    }

    public Class<T> getApiType() {
        return apiType;
    }

    public void setApiType(Class<T> apiType) {
        this.apiType = apiType;
    }

    public CamelliaFeignFallbackFactory<T> getFallbackFactory() {
        return fallbackFactory;
    }

    public void setFallbackFactory(CamelliaFeignFallbackFactory<T> fallbackFactory) {
        this.fallbackFactory = fallbackFactory;
    }

    public FeignResourceTableUpdater getUpdater() {
        return updater;
    }

    public void setUpdater(FeignResourceTableUpdater updater) {
        this.updater = updater;
    }

    public CamelliaFeignProps getFeignProps() {
        return feignProps;
    }

    public void setFeignProps(CamelliaFeignProps feignProps) {
        this.feignProps = feignProps;
    }

    public CamelliaFeignEnv getFeignEnv() {
        return feignEnv;
    }

    public void setFeignEnv(CamelliaFeignEnv feignEnv) {
        this.feignEnv = feignEnv;
    }

    public DynamicOption getDynamicOption() {
        return dynamicOption;
    }

    public void setDynamicOption(DynamicOption dynamicOption) {
        this.dynamicOption = dynamicOption;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
