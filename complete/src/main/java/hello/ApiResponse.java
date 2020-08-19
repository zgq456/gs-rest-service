//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hello;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@ApiModel("小企业API消息响应")
public class ApiResponse<T> {
    private static final String SUCCESS_STATUS = "Y";
    private static final String ERROR_STATUS = "N";
    private Head head;
    private T body;

    public ApiResponse() {
    }

    public ApiResponse(Head head, T body) {
        this.head = head;
        this.body = body;
    }

    public ApiResponse(Head head) {
        this.head = head;
    }

    @ApiModelProperty(
        value = "消息头",
        dataType = "cn.com.servyou.xqy.framework.web.domain.Head"
    )
    public Head getHead() {
        return this.head;
    }

    @ApiModelProperty("消息体")
    public T getBody() {
        return this.body;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public ApiResponse<T> head(Head head) {
        this.setHead(head);
        return this;
    }

    public ApiResponse<T> body(T body) {
        this.setBody(body);
        return this;
    }


    public static <T> ApiResponse<T> success(T model) {
        return (new ApiResponse()).head(new Head("00000000", "成功", "Y", "成功")).body(model);
    }

    public static <T> ApiResponse<T> error(Message message) {
        return (new ApiResponse()).head(new Head(message.getCode(), message.getDescription(), "N", message.getText())).body((Object)null);
    }

    public static <T> ApiResponse<T> error(Message message, T model) {
        return (new ApiResponse()).head(new Head(message.getCode(), message.getDescription(), "N", message.getText())).body(model);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}