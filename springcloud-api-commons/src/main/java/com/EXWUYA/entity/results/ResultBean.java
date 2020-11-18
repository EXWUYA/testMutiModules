package com.EXWUYA.entity.results;

import com.EXWUYA.tools.ResultCode;

public class ResultBean<T>{
    private T data;
    private ResultCode code;
    private String mess;

    public void setData(T data) {
        this.data = data;
    }

    public void setCode(ResultCode code) {
        this.code = code;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public T getData() {
        return data;
    }

    public ResultCode getCode() {
        return code;
    }

    public String getMess() {
        return mess;
    }

    public ResultBean(T data, ResultCode code, String mess) {
        this.data = data;
        this.code = code;
        this.mess = mess;
    }

    public ResultBean(T data, ResultCode code) {
        this.data = data;
        this.code = code;
    }

    public ResultBean() {
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "data=" + data +
                ", code=" + code.getCode() +
                ", mess='" + mess + '\'' +
                '}';
    }
}
