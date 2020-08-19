//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hello;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;

@ApiModel("小企业API消息响应头")
public class Head {
    private String code;
    private String description;
    private String msg;
    private String time;
    private String status;

    public Head() {
    }

    public Head(String status, String msg) {
        this.status = status;
        this.msg = msg;
        this.time = currentTime();
    }

    public Head(String code, String description, String status, String msg) {
        this.code = code;
        this.description = description;
        this.status = status;
        this.msg = msg;
        this.time = currentTime();
    }

    @ApiModelProperty(
        value = "返回的消息内容",
        example = "成功"
    )
    public String getMsg() {
        return this.msg;
    }

    @ApiModelProperty(
        value = "时间",
        example = "2015-12-12 19:00:00"
    )
    public String getTime() {
        return this.time;
    }

    @ApiModelProperty(
        value = "错误代码",
        example = ""
    )
    public String getCode() {
        return this.code;
    }

    @ApiModelProperty(
        value = "处理结果",
        example = "Y",
        allowableValues = "Y,N"
    )
    public String getStatus() {
        return this.status;
    }

    @ApiModelProperty("错误说明")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Head withTime(Date time) {
        this.time = format(time);
        return this;
    }

    public Head withMsg(String message, Object... args) {
        this.msg = String.format(message, args);
        return this;
    }

    private static String currentTime() {
        return format(new Date());
    }

    private static String format(Date date) {
        return (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(date);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}