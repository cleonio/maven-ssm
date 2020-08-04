package cn.itcast.domain;

/**
 * @author xiongyang
 * @date 2020/7/24 14:54
 * @Description:
 */
public class RtnInfo<T> {

    private Integer code;
    private String msg;
    private T data;

    public static final RtnInfo SUCCESS;
    public static final RtnInfo SERVER_ERROR;



    public RtnInfo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public RtnInfo() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private static <T> RtnInfo.RtnInfoBuilder<T> builder(){
        return new RtnInfo.RtnInfoBuilder<>();
    }

    static {
        SUCCESS = RtnInfo.builder().code(0).data(null).msg("成功").build();
        SERVER_ERROR = RtnInfo.builder().code(999).data(null).msg("服务器异常").build();
    }

    public static class RtnInfoBuilder<T>{
        private Integer code;

        private String msg;

        private T data;

        public RtnInfoBuilder() {
        }

        public RtnInfoBuilder(Integer code, String msg, T data) {
            this.code = code;
            this.msg = msg;
            this.data = data;
        }

        public RtnInfoBuilder<T> code(Integer code){
            this.code = code;
            return this;
        }
        public RtnInfoBuilder<T> msg(String msg){
            this.msg = msg;
            return this;
        }
        public RtnInfoBuilder<T> data(T data){
            this.data = data;
            return this;
        }

        public RtnInfo<T> build() {
            return new RtnInfo(this.code, this.msg, this.data);
        }

        @Override
        public String toString() {
            return "RtnInfo.RtnInfoBuilder(msg=" + this.msg + ", code=" + this.code + ", data=" + this.data +  ")";
        }

    }


}
