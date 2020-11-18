package com.EXWUYA.tools;

public  enum ResultCode {
       SUCCESS(200),//成功
       SUCCESS_WITHOUT_CONTENT(204),//成功但无返回结果
       NEED_AUTHORIZATION(401),//需要权限
       PAGE_NOT_FOUND(404),//页面未找到
       FORBIDDEN(406),//请求被拒绝
       FATAL_EXCEPTION(500);//服务器异常无法处理，请求处理失败

    private int code;

       ResultCode(int code) {
              this.code = code;
       }

       @Override
       public String toString() {
              return "ResultCode{" +
                      "code=" + code +
                      '}';
       }

       public int getCode() {
              return code;
       }
}
