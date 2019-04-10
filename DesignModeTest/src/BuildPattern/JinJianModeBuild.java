package BuildPattern;

public class JinJianModeBuild extends ModeBuild {
    @Override
    void buildCaidan() {
        mode.setCaidang("B-Caidang");
    }

    @Override
    void buildBofanglibiao() {
        mode.setBofanglibiao("B-liebiao");
    }

    @Override
    void buildZhuchuangkou() {
        mode.setZhuchuangkou("B-zhu");
    }

    @Override
    void buildKongzhitiaol() {
        mode.setKongzhitiaol("B-Kongzhitiao");
    }

    @Override
    void buildShouchangliebiao() {
        mode.setShouchangliebiao("B-Shouchuang");
    }
}
