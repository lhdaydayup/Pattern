package ProxyPattern;

import java.util.Date;

public class ProxyDo extends Base {
    private Base base;

    public ProxyDo(Base base) {
        this.base = base;
    }

    @Override
    public void method() {
        before();
        try {
            base.method();
            success();
        }catch (Exception e){
            fail();
        }

    }

    private void before(){
        System.out.println("执行时间"+new Date());
    }

    private void success(){
        System.out.println("执行成功");
    }

    private void fail(){
        System.out.println("执行失败");
    }


}
