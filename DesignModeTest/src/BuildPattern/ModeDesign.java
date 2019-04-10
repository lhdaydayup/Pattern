package BuildPattern;


//模式名称：构建者模式
//优点：可以对对象的整个构建过程十分清晰。遵守开闭原则
//适用：对象有多个属性，要指定属性的生成顺序(比如 一个汽车积木。。有多个组件，要按照某个顺序一个个拼接)

public class ModeDesign {
    public static Mode contstru(ModeBuild build){
        build.buildBofanglibiao();
        build.buildCaidan();
        build.buildKongzhitiaol();
        build.buildShouchangliebiao();
        build.buildZhuchuangkou();
        return build.mode;
    }

    public static void main(String[] agrs){
        ModeBuild builder=new JinJianModeBuild();
        Mode mode=ModeDesign.contstru(builder);
        System.out.println(mode.getBofanglibiao());
        Object a=null;
        String b=(String) a;
        System.out.println(b);

    }
}
