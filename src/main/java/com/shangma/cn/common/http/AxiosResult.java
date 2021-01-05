package com.shangma.cn.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author 刘士萱
 * @time 2021/1/3 - 16:25
 *
 * 统一返回值
 *
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)//表示把数据转成json时只转不是空的
public class AxiosResult<T> {
    private int status;
    private String message;
    private T data;

    private AxiosResult() {

    }

    /**
     * 成功，不带数据
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success() {
        return setData(AxiosStatus.OK, null);
    }

    /**
     * 返回成功，带数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(T data) {
        return setData(AxiosStatus.OK,data);
    }

    /**
     * 返回成功，自定义状态码,不带数据
     * @param axiosStatus
     * @param
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    /**
     * 返回成功，在定义状态码，携带数据
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus,data);
    }

    /**
     * 错误的返回，不带数据
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error() {
        return setData(AxiosStatus.ERROR, null);
    }

    /**
     * 错误的返回，携带数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(T data) {
        return setData(AxiosStatus.ERROR, data);
    }

    /**
     * 错误返回，不带数据，自定义状态码
     * @param axiosStatus
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    /**
     * 错误的返回，携带数据，自定义状态码
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }


    /**
     * 提取返回数据的公共方法
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus, T data) {
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());

        return axiosResult;
    }
}
